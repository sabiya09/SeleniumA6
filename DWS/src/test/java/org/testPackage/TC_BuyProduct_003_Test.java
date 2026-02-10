package org.testPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Org.GenericLib.BaseTest;
import Org.GenericLib.Flib;
import Org.POMRepository.BasePage;
import Org.POMRepository.CellphonesPage;
import Org.POMRepository.CheckOutPage;
import Org.POMRepository.ElectronicsPage;
import Org.POMRepository.ShoppingcartPage;
@Listeners(Org.GenericLib.MyListener.class)
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
	    driver.findElement(By.xpath("//span[@class=\"close\"]")).click();
	    
        bp.getShoppingCartlink().click();
	    
	    ShoppingcartPage sp=new ShoppingcartPage(driver);
		sp.getSmartPhoneCartItem().click();
		sp.getTermsOfServiceCheckBox().click();
		sp.getCheckOutButton().click();
		

		String city= Flib.getworkbookCellValue(EXCEL_PATH_TEST,"Byproductcreads", 1, 0);
		String Address=Flib.getworkbookCellValue(EXCEL_PATH_TEST,"ByProductCreads", 1, 1);
		String pinCode= Flib.getworkbookCellValue(EXCEL_PATH_TEST,"Byproductcreads", 1, 2);
		String contact=Flib.getworkbookCellValue(EXCEL_PATH_TEST,"ByProductCreads", 1, 3);
	
		CheckOutPage cp=new CheckOutPage(driver);
//		cp.getBillingnewaddress().click();
		cp.buyProduct(city, Address, pinCode, contact);
		
	   
		
	}
	

}
