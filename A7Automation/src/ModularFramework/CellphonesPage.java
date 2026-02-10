package ModularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellphonesPage {

	@FindBy(xpath = "//img[@alt='Picture of Smartphone']/../../..//input[@value='Add to cart']" )private WebElement addtocartButton;
	
	@FindBy(xpath = "//p[text()='The product has been added to your '] ")private WebElement prodAddToCartMsg;
	
	public CellphonesPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddtocartButton() {
		return addtocartButton;
	}

	public WebElement getProdAddToCartMsg() {
		return prodAddToCartMsg;
	}
	
	
}