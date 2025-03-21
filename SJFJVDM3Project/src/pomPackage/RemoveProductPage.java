package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveProductPage {
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]") private WebElement removeProductFromCartCheckBox;
	@FindBy(xpath = "//input[@name='updatecart']") private WebElement updateCartButton;
	
	
	//initialization
	public RemoveProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
 
	//Utilization
	public WebElement getRemoveProductFromCartCheckBox() {
		return removeProductFromCartCheckBox;
	}

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}
	
	
	

}
