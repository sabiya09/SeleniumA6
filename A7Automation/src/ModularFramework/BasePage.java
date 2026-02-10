package ModularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    //1. Declaration
	@FindBy(linkText = "Register") private WebElement registerLink;
	@FindBy(linkText = "Log in") private WebElement loginLink;
	@FindBy(xpath="//span[text()='Shopping cart' ]") private WebElement shoppingCartlink;
	@FindBy(xpath="//span[text()='Wishlist' ]") private WebElement wishlistLink;
	@FindBy(id="small-searchterms") private WebElement searchTF;
	@FindBy(xpath = "//input[@value='Search']") private WebElement searchButton;
	@FindBy (partialLinkText = "Electronics") private WebElement ElectronicsLink;
	@FindBy(xpath = "//a[text()='Log out']")private WebElement LogOutLink;
	
	//2.initialization
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	// 3.utilization
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartlink() {
		return shoppingCartlink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getSearchTF() {
		return searchTF;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}


	public WebElement getElectronicsLink() {
		return ElectronicsLink;
	}


	public void setElectronicsLink(WebElement electronicsLink) {
		ElectronicsLink = electronicsLink;
	}


	public WebElement getLogOutLink() {
		return LogOutLink;
	}
	
	
	//4. operational method or business model
	

}