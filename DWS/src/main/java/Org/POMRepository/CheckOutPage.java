package Org.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ModularFramework.selectUtility;

public class CheckOutPage {

   @FindBy(id = "billing-address-select")
   private WebElement billingNewAddressDD;

    @FindBy(id = "BillingNewAddress_CountryId")
    private WebElement billingAddressCountryDD;


    @FindBy(id = "BillingNewAddress_StateProvinceId")
    private WebElement billingStateDD;

    @FindBy(id = "BillingNewAddress_City")
    private WebElement billingCityTB;

    @FindBy(id = "BillingNewAddress_Address1")
    private WebElement address1TB;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    private WebElement pincodeTB;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    private WebElement phoneNoTB;

    @FindBy(xpath = "//input[@onclick='Billing.save()']")
    private WebElement billingAddressContinueButton;

    @FindBy(xpath = "//input[@onclick='Shipping.save()']")
    private WebElement shippingAddressContinueButton;

    @FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
    private WebElement shippingMethodContinueButton;

    @FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
    private WebElement paymentMethodContinueButton;

    @FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
    private WebElement paymentInfoContinueButton;

    @FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
    private WebElement confirmOrderConfirmButton;

    // 🔹 Constructor
    public CheckOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // 🔹 BUSINESS LOGIC
    public void buyProduct(String city, String address, String pincode, String phone) {

        selectUtility su = new selectUtility();

        // 1️⃣ Select New Address if dropdown exists
        try {
            if (billingNewAddressDD.isDisplayed()) {
                su.selectByVisibleTextMethod(billingNewAddressDD, "New Address");
            }
        } catch (Exception e) {
        	su.selectByVisibleTextMethod(billingAddressCountryDD, "India");
        }

        // 2️⃣ Select Country
       // selectUtility su = new selectUtility();
        su.selectByVisibleTextMethod(billingAddressCountryDD, "India");

        // 3️⃣ Select State (MANDATORY)
       // su.selectByVisibleTextMethod(billingStateDD, "Other (Non US)");

        // 4️⃣ Enter details
        billingCityTB.clear();
        billingCityTB.sendKeys(city);

        address1TB.clear();
        address1TB.sendKeys(address);

        pincodeTB.clear();
        pincodeTB.sendKeys(pincode);

        phoneNoTB.clear();
        phoneNoTB.sendKeys(phone);

        // 5️⃣ Continue checkout flow
        billingAddressContinueButton.click();
        shippingAddressContinueButton.click();
        shippingMethodContinueButton.click();
        paymentMethodContinueButton.click();
        paymentInfoContinueButton.click();
        confirmOrderConfirmButton.click();
    }
}
