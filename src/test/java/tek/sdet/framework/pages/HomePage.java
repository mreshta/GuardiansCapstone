package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class HomePage extends BaseSetup {

	public HomePage() {
		
	PageFactory.initElements(getDriver(), this);	
	}
	
	@FindBy(linkText = "TEKSCHOOL")
	public WebElement tekschoolLogo;
}
