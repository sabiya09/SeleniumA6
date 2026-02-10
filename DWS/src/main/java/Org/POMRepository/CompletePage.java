package Org.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage {

    @FindBy(xpath = "//input[@value='Continue'] ")private WebElement completedContinueButton;
    
   public CompletePage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }

public WebElement getCompletedContinueButton() {
	return completedContinueButton;
}
   
@FindBy(xpath="//strong[text()='Your Order has been  succsessfully Proccessed']") private WebElement orderPlacedMsg;
    
}
