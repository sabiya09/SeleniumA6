package ModularFramework;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_AddToCart_001_Test extends BaseTest {

	@Test
	public void TC_AddToCart_001_Test() {
		BasePage bp=new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep=new ElectronicsPage(driver);
		ep.getCellphonelink().click();
		
		CellphonesPage cp=new CellphonesPage(driver);
		cp.getAddtocartButton().click();
		
	    SoftAssert sa=new SoftAssert();
	    sa.assertEquals(cp.getProdAddToCartMsg().isDisplayed(),true,"product is added to cart!!");
		 sa.assertAll();
		
	}

}
