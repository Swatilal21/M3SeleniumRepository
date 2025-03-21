package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends baseTest {
	
	//Declaration
	@FindBy(id = "BillingNewAddress_CountryId") private WebElement countryOD;
	@FindBy(id = "BillingNewAddress_City") private WebElement cityTB;
	@FindBy(id = "BillingNewAddress_Address1") private WebElement addressTB;
	@FindBy(id = "BillingNewAddress_ZipPostalCode") private WebElement pincodeTB;
	@FindBy(id = "BillingNewAddress_PhoneNumber") private WebElement phoneNoTB;
	@FindBy(xpath = "//input[@onclick='Billing.save()']") private WebElement billingAddressContinueButton;
	@FindBy(xpath = "//input[@onclick='Shipping.save()']") private WebElement shippingAddressContinueButton;
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']") private WebElement shippingMethodContinueButton;
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']") private WebElement paymentMethodContinueButton;
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']") private WebElement paymentInfoContinueButton;
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']") private WebElement confirmOrderConfirmButton;
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']") private WebElement orderProcessedText;

	
//Initialization	
public CheckoutPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//Utilization
public WebElement getCountryOD() {
	return countryOD;
}



public WebElement getCityTB() {
	return cityTB;
}



public WebElement getAddressTB() {
	return addressTB;
}



public WebElement getPincodeTB() {
	return pincodeTB;
}



public WebElement getPhoneNoTB() {
	return phoneNoTB;
}



public WebElement getBillingAddressContinueButton() {
	return billingAddressContinueButton;
}



public WebElement getShippingAddressContinueButton() {
	return shippingAddressContinueButton;
}



public WebElement getShippingMethodContinueButton() {
	return shippingMethodContinueButton;
}



public WebElement getPaymentMethodContinueButton() {
	return paymentMethodContinueButton;
}



public WebElement getPaymentInfoContinueButton() {
	return paymentInfoContinueButton;
}



public WebElement getConfirmOrderConfirmButton() {
	return confirmOrderConfirmButton;
}



public WebElement getOrderProcessedText() {
	return orderProcessedText;
}

}