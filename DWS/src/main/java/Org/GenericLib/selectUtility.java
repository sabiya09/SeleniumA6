package Org.GenericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectUtility {
	public void selectByVisibleTextMethod(WebElement Dropdownelement, String visibleText) {
		Select sel=new Select(Dropdownelement);
		sel.deselectByVisibleText(visibleText);
		
	}
	

}
