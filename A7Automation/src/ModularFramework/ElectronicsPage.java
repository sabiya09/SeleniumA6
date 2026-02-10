package ModularFramework;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	
	@FindBy(partialLinkText = "Camera, photo") private WebElement cameralink;
	@FindBy(partialLinkText = "Cell phones") private WebElement cellphonelink;

    public ElectronicsPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getCameralink() {
		return cameralink;
	}

	public WebElement getCellphonelink() {
		return cellphonelink;
	}
    

    
}

