package Org.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="Email")private WebElement emailTB;
	@FindBy(id="Password")private WebElement passwordTB;
	@FindBy(id="RememberMe")private WebElement remenbermeCB;
	@FindBy(xpath="//input[@value=\"Log in\"]") private WebElement loginButton;
	
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	//Utilization
	public WebElement getEmailTB() {
		return emailTB;
	}


	public WebElement getPasswordTB() {
		return passwordTB;
	}


	public WebElement getRemenbermeCB() {
		return remenbermeCB;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	

	 
	
}
