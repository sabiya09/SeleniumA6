package Org.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingcartPage {

	//declaration
	@FindBy(xpath = "//input[@value='Update shopping cart']")private WebElement updatedCartButton;
	@FindBy(xpath = "//input[@value='Continue shopping']")private WebElement continueShopingButton;
	@FindBy(id = "termsofservice")private WebElement termsOfServiceCheckBox;
	@FindBy(id = "checkout")private WebElement checkOutButton;
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@name='removefromcart']")private WebElement smartPhoneCartItem;
	
	//initialization
	public ShoppingcartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//utilization
	public WebElement getUpdatedCartButton() {
		return updatedCartButton;
	}


	public WebElement getContinueShopingButton() {
		return continueShopingButton;
	}


	public WebElement getTermsOfServiceCheckBox() {
		return termsOfServiceCheckBox;
	}


	public WebElement getCheckOutButton() {
		return checkOutButton;
	}


	public WebElement getSmartPhoneCartItem() {
		return smartPhoneCartItem;
	}
	
	//operational method
	public void removeSmartPhoneMethod() throws InterruptedException
	{
		smartPhoneCartItem.click();
		Thread.sleep(1000);
		updatedCartButton.click();
	}
}