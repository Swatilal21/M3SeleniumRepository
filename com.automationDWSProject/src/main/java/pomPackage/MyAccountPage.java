package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	//Declaration
		@FindBy(linkText = "Addresses") private WebElement addressesLink;
		@FindBy(linkText = "Customer info") private WebElement customerPersonalDetails;
		@FindBy(xpath = "//input[@value='Delete']") private WebElement deleteButton;
		
		//Initialization
		public MyAccountPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public WebElement getAddressesLink() 
		{
			return addressesLink;
		}
		
		public WebElement getCustomerPersonalDetails() 
		{
			return customerPersonalDetails;
		}
		
		public WebElement getDeleteButton() 
		{
			return deleteButton;
		}
		
		//Operational Method
		//For clearing customer details
		public void clearAddress()
		{
			addressesLink.click();
			deleteButton.click();
		}

}
