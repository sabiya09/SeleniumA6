package org.testPackage;


import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Org.GenericLib.BaseTest;
import Org.POMRepository.BasePage;
import Org.POMRepository.CellphonesPage;
import Org.POMRepository.ElectronicsPage;
import Org.POMRepository.ShoppingcartPage;
@Listeners(Org.GenericLib.MyListener.class)
public class TC_RemoveprodFromAddTocart_002_Test extends BaseTest{

	@Test
	public void TC_RemoveprodFromAddTocart_002_Test() throws InterruptedException {
		BasePage bp=new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep=new ElectronicsPage(driver);
		ep.getCellphonelink().click();
		
		CellphonesPage cp=new CellphonesPage(driver);
		cp.getAddtocartButton().click();
		
	    SoftAssert sa=new SoftAssert();
	    sa.assertEquals(cp.getProdAddToCartMsg().isDisplayed(),true,"product is added to cart!!");
	    driver.findElement(By.xpath("//span[@class=\"close\"]")).click();
	    
	    bp.getShoppingCartlink().click();
	    
	    ShoppingcartPage sp=new ShoppingcartPage(driver);
	    sp.removeSmartPhoneMethod();
	    try {
	    	if( sp.getSmartPhoneCartItem().isDisplayed())
	    	{
	    		     Reporter.log("product is not removed from the cart",true);
	    	}
	    }
	    catch(Exception e)
	    {
	    	Reporter.log("product is removed from the cart", true);
	    }
	    
	   
	   sa.assertAll();
		
	}

}
