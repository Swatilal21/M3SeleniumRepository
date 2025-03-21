package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	// Declaration
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img") private WebElement smartPhoneCartProduct;
	
    // initialization
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//utilization
	public WebElement getSmartPhoneCartProduct() {
		return smartPhoneCartProduct;
	}
	
	
	
}
