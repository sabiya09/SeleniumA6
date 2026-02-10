package ModularFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Org.A7Automation.testNGFramework.Flib;

public class TC_BuyProduct_003_Test  extends BaseTest{

	@Test
	public void buyProductMethod() throws InterruptedException
	{
		BasePage bp=new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep=new ElectronicsPage(driver);
		ep.getCellphonelink().click();
		
		CellphonesPage cpp=new CellphonesPage(driver);
		cpp.getAddtocartButton().click();
		
	    SoftAssert sa=new SoftAssert();
	    sa.assertEquals(cpp.getProdAddToCartMsg().isDisplayed(),true,"product is added to cart!!");
	    
        bp.getShoppingCartlink().click();
	    
	    ShoppingcartPage sp=new ShoppingcartPage(driver);
		sp.getSmartPhoneCartItem().click();
		sp.getTermsOfServiceCheckBox().click();
		sp.getCheckOutButton().click();
	
		CheckOutPage cp=new CheckOutPage(driver);
		cp.getBillingnewaddress().click();
		
		String city= Flib.getworkbookCellValue("Byproductcreads", 1, 0);
		String Address=Flib.getworkbookCellValue("ByProductCreads", 1, 1);
		String pinCode= Flib.getworkbookCellValue("Byproductcreads", 1, 2);
		String contact=Flib.getworkbookCellValue("ByProductCreads", 1, 3);
//		cp.getBillingAddressCountryDD().sendKeys("india");
//		cp.getAddress1TB().sendKeys("wakad" );
//		cp.getBillingCityTB().sendKeys("pune" );
//		cp.getPincodeTB().sendKeys("411033" );
//		cp.getPhoneNoTB().sendKeys("9876543210");
//		cp.getBillingAddressContinueButton().click();
		
		cp.getShippingAddressContinueButton().click();
		cp.getShippingMethodContinueButton().click();
		cp.getPaymentMethodContinueButton().click();
		cp.getPaymentInfoContinueButton().click();
		cp.getConfirmOrderConfirmButton().click();
		
	   
		
	}
	

}
