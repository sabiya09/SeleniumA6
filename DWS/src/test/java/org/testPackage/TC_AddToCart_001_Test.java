package org.testPackage;


import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Org.GenericLib.BaseTest;
import Org.POMRepository.BasePage;
import Org.POMRepository.CellphonesPage;
import Org.POMRepository.ElectronicsPage;
@Listeners(Org.GenericLib.MyListener.class)
public class TC_AddToCart_001_Test extends BaseTest {

	@Test
	public void addToCartMethod() {
		BasePage bp=new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep=new ElectronicsPage(driver);
		ep.getCellphonelink().click();
		
		CellphonesPage cp=new CellphonesPage(driver);
		cp.getAddtocartButton().click();
		
	    SoftAssert sa=new SoftAssert();
	    sa.assertEquals(cp.getProdAddToCartMsg().isDisplayed(),true,"product is added to cart!!");
	    driver.findElement(By.xpath("//span[@class=\"close\"]")).click();
	    //driver.close();
		 sa.assertAll();
		
	}

}
