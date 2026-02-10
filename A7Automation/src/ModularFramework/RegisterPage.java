package ModularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	
	@FindBy(xpath = "//label[text()='Female']")private WebElement FemaleRadioButton;
	@FindBy(xpath = "//label[text()='Male']") private WebElement maleRadioButton;
	@FindBy(id ="FirstName") private WebElement firstname;
	@FindBy(id ="LastName") private WebElement lastname;
	@FindBy(id ="Email") private WebElement EmailTB;
	@FindBy(id ="Password") private WebElement passwordTB;
	@FindBy(id ="ConfirmPassword") private WebElement confirmPassTB;
	@FindBy(id ="register-button") private WebElement registerButton;
	
	//initialization
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFemaleRadioButton() {
		return FemaleRadioButton;
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmailTB() {
		return EmailTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getConfirmPassTB() {
		return confirmPassTB;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	
	
	
	
	
}
