package ModularFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage<SelectUtility>  {
    @FindBy(xpath = "//select[@name='billing_address_id']/../..//option[text()='New Address' ]")private WebElement billingnewaddress;
	@FindBy (id="BillingNewAddress_CountryId") private WebElement  billingAddressCountryDD;
	@FindBy(id = "billing-address-select")private WebElement billingNewAddressDD;
	


	
	@FindBy(id = "BillingNewAddress_City") private WebElement billingCityTB;
	@FindBy(id="BillingNewAddress_Address1")private WebElement   address1TB;
	@FindBy(id="BillingNewAddress_ZipPostalCode")private WebElement  pincodeTB;
	@FindBy(id="BillingNewAddress_PhoneNumber")private WebElement  phoneNoTB;
	@FindBy(xpath = "//input[@onclick='Billing.save()']")private WebElement   billingAddressContinueButton;
	@FindBy(id = "shipping-address-select")private WebElement    shippingAdressDD;
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")private WebElement shippingAddressContinueButton;
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")private WebElement shippingMethodContinueButton;
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")private WebElement paymentMethodContinueButton;
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']") private WebElement paymentInfoContinueButton;
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")private WebElement confirmOrderConfirmButton;
	
	//initialization
	public CheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//utilization
	public WebElement getBillingAddressCountryDD() {
		return billingAddressCountryDD;
	}
	public WebElement getBillingNewAddressDD() {
		return billingNewAddressDD;
	}
	
	public WebElement getBillingCityTB() {
		return billingCityTB;
	}

	public WebElement getAddress1TB() {
		return address1TB;
	}

	public WebElement getPincodeTB() {
		return pincodeTB;
	}

	public WebElement getPhoneNoTB() {
		return phoneNoTB;
	}

	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}

	public WebElement getShippingAdressDD() {
		return shippingAdressDD;
	}

	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmOrderConfirmButton() {
		return confirmOrderConfirmButton;
	}
	public WebElement getBillingnewaddress() {
		return billingnewaddress;
	}
	
	
	//OPERATIONAL METHOD	/ BUSINESS LOGIC
		public void buyProduct(String city,String address,String pincode,String phone)
		{
			
			selectUtility su = new selectUtility();
			su.selectByVisibleTextMethod(billingAddressCountryDD, "India");
			billingCityTB.sendKeys(city);
			 pincodeTB.sendKeys(pincode);
			 phoneNoTB.sendKeys(phone);
			 billingAddressContinueButton.click();
			 shippingAddressContinueButton.click();
			 shippingMethodContinueButton.click();
			 paymentMethodContinueButton.click();
			 paymentInfoContinueButton.click();
			 confirmOrderConfirmButton.click();
			 
		}
	
	
}
