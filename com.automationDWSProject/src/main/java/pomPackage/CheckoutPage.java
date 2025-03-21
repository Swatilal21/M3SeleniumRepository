package pomPackage;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.Flib;
import genericLibrary.IAutoConstant;
import genericLibrary.SelectUtility;

public class CheckoutPage  extends Flib implements IAutoConstant {
	//Declaration
		@FindBy(id = "BillingNewAddress_FirstName") private WebElement firstNameTextbox;
		@FindBy(id = "BillingNewAddress_LastName") private WebElement lastNameTextbox;
		@FindBy(id = "BillingNewAddress_Email") private WebElement emailTextbox;
		@FindBy(id = "BillingNewAddress_Company") private WebElement companyTextbox;
		@FindBy(id = "BillingNewAddress_City") private WebElement cityTextbox;
		@FindBy(id = "BillingNewAddress_Address1") private WebElement address1Textbox;
		@FindBy(id = "BillingNewAddress_Address2") private WebElement address2Textbox;
		@FindBy(id = "BillingNewAddress_ZipPostalCode") private WebElement postalCodeTextbox;
		@FindBy(id = "BillingNewAddress_PhoneNumber") private WebElement phoneNumberTextbox;
		@FindBy(id = "BillingNewAddress_FaxNumber") private WebElement faxNumberTextbox;
		@FindBy(id = "BillingNewAddress_CountryId") private WebElement countryDropdown;
		@FindBy(id = "BillingNewAddress_StateProvinceId") private WebElement stateDropdown;
		@FindBy(xpath = "//input[@onclick='Billing.save()']") private WebElement billingAddresscontinueButton;
		@FindBy(xpath = "//input[@onclick='Shipping.save()']") private WebElement shippingAddresscontinueButton;
		@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']") private WebElement shippingMethodcontinueButton;
		@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']") private WebElement paymentMethodcontinueButton;
		@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']") private WebElement paymentInfocontinueButton;
		@FindBy(id = "shipping-address-select") private WebElement shippingaddressDropdown;
		@FindBy(id = "PickUpInStore") private WebElement pickUpInStoreCheckbox;
		@FindBy(linkText = "Back") private WebElement backLink;
		@FindBy(xpath = "//label[text()='Ground (0.00)']/..//input[@name='shippingoption']") private WebElement groundRadioButton;
		@FindBy(xpath = "//label[text()='Next Day Air (0.00)']/..//input[@name='shippingoption']") private WebElement nextDayAirRadioButton;
		@FindBy(xpath = "//label[text()='2nd Day Air (0.00)']/..//input[@name='shippingoption']") private WebElement secondDayAirRadioButton;
		@FindBy(xpath = "//label[text()='Cash On Delivery (COD) (7.00)']/..//input[@name='paymentmethod']") private WebElement codRadioButton;
		@FindBy(xpath = "//label[text()='Check / Money Order (5.00)']/..//input[@name='paymentmethod']") private WebElement moneyOrderRadioButton;
		@FindBy(xpath = "//label[text()='Credit Card']/..//input[@name='paymentmethod']") private WebElement creditCardRadioButton;
		@FindBy(xpath = "//label[text()='Purchase Order']/..//input[@name='paymentmethod']") private WebElement purchaseOrderRadioButton;
		@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']") private WebElement confirmOrderButton;
		@FindBy(xpath = "//strong[text()= 'Your order has been successfully processed!']") private WebElement orderPlacedText;
		@FindBy(id = "billing-address-select") private WebElement billingAddressOldDropdown;
		
		//Initialization
		public CheckoutPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//Utilization
		public WebElement getFirstNameTextbox() {
			return firstNameTextbox;
		}

		public WebElement getLastNameTextbox() {
			return lastNameTextbox;
		}

		public WebElement getEmailTextbox() {
			return emailTextbox;
		}

		public WebElement getCompanyTextbox() {
			return companyTextbox;
		}

		public WebElement getCityTextbox() {
			return cityTextbox;
		}

		public WebElement getAddress1Textbox() {
			return address1Textbox;
		}

		public WebElement getAddress2Textbox() {
			return address2Textbox;
		}

		public WebElement getPostalCodeTextbox() {
			return postalCodeTextbox;
		}

		public WebElement getPhoneNumberTextbox() {
			return phoneNumberTextbox;
		}

		public WebElement getFaxNumberTextbox() {
			return faxNumberTextbox;
		}

		public WebElement getCountryDropdown() {
			return countryDropdown;
		}

		public WebElement getStateDropdown() {
			return stateDropdown;
		}

		public WebElement getShippingaddressDropdown() {
			return shippingaddressDropdown;
		}

		public WebElement getPickUpInStoreCheckbox() {
			return pickUpInStoreCheckbox;
		}

		public WebElement getBackLink() {
			return backLink;
		}

		public WebElement getGroundRadioButton() {
			return groundRadioButton;
		}

		public WebElement getNextDayAirRadioButton() {
			return nextDayAirRadioButton;
		}

		public WebElement getSecondDayAirRadioButton() {
			return secondDayAirRadioButton;
		}

		public WebElement getCodRadioButton() {
			return codRadioButton;
		}

		public WebElement getMoneyOrderRadioButton() {
			return moneyOrderRadioButton;
		}

		public WebElement getCreditCardRadioButton() {
			return creditCardRadioButton;
		}

		public WebElement getPurchaseOrderRadioButton() {
			return purchaseOrderRadioButton;
		}

		public WebElement getBillingAddresscontinueButton() {
			return billingAddresscontinueButton;
		}

		public WebElement getShippingAddresscontinueButton() {
			return shippingAddresscontinueButton;
		}

		public WebElement getShippingMethodcontinueButton() {
			return shippingMethodcontinueButton;
		}

		public WebElement getPaymentMethodcontinueButton() {
			return paymentMethodcontinueButton;
		}

		public WebElement getPaymentInfocontinueButton() {
			return paymentInfocontinueButton;
		}

		public WebElement getConfirmOrderButton() {
			return confirmOrderButton;
		}

		public WebElement getOrderPlacedText() {
			return orderPlacedText;
		}
		
		public WebElement getBillingAddressOldDropdown() {
			return billingAddressOldDropdown;
		}

		//Operational method/ Business logic
		public void buyProduct() throws EncryptedDocumentException, IOException
		{
			SelectUtility selectUtility = new SelectUtility();
			
			try
			{
			if(billingAddressOldDropdown.isDisplayed() == true)
			{
				selectUtility.selectByVisibleTextMethod(billingAddressOldDropdown, "New Address");
			}
			}
			catch(NoSuchElementException e)
			{
			}
			
			selectUtility.selectByVisibleTextMethod(countryDropdown, "India");
			
			Flib flib = new Flib();
			int rn = flib.randomNumber();
			String company = flib.readExcelData(EXCEL_PATH_MAINRESOURCES, "buyproductdetails", 1, 0);
			String city = flib.readExcelData(EXCEL_PATH_MAINRESOURCES, "buyproductdetails", 1, 1);
			String address1 = flib.readExcelData(EXCEL_PATH_MAINRESOURCES, "buyproductdetails", 1, 2);
			String address2 = flib.readExcelData(EXCEL_PATH_MAINRESOURCES, "buyproductdetails", 1, 3);
			long postalcode = flib.readExcelData1(EXCEL_PATH_MAINRESOURCES, "buyproductdetails", 1, 4);
			long phone = flib.readExcelData1(EXCEL_PATH_MAINRESOURCES, "buyproductdetails", 1, 5);
			String phonenumber = phone + "" + rn;   //use string in between
			String faxnumber = flib.readExcelData(EXCEL_PATH_MAINRESOURCES, "buyproductdetails", 1, 6);

			companyTextbox.sendKeys(company);
			cityTextbox.sendKeys(city);
			address1Textbox.sendKeys(address1);
			address2Textbox.sendKeys(address2);
			postalCodeTextbox.sendKeys(String.valueOf(postalcode));
			phoneNumberTextbox.sendKeys(String.valueOf(phonenumber));
			faxNumberTextbox.sendKeys(faxnumber);
			billingAddresscontinueButton.click();
			shippingAddresscontinueButton.click();
			shippingMethodcontinueButton.click();
			paymentMethodcontinueButton.click();
			paymentInfocontinueButton.click();
			confirmOrderButton.click();
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(orderPlacedText.isDisplayed(), true, "Order is not placed!!");
		}
	 

}
