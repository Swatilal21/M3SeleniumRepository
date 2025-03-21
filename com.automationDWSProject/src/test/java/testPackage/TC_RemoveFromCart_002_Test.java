package testPackage;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

@Listeners(genericLibrary.MyListeners.class)
public class TC_RemoveFromCart_002_Test extends BaseTest {
  @Test
  public void removeFromCart() throws IOException {

		// To click on Electronics element--located in welcome page
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getElectronicsLink().click();

		// To add cellphone to cart
		ElectronicsPage electronicsPage = new ElectronicsPage(driver);
		electronicsPage.getCellPhonesLink().click();
		electronicsPage.getSmartphoneAddToCartButton().click();

		// To click on shopping cart--located in welcomepage
		welcomePage.getShoppingCartLink().click();

		// To check the product has been added to cart or not
		ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);

		// To click on shopping cart--located in welcomepage
		welcomePage.getShoppingCartLink().click();
		
		shoppingCartPage.getSelectSmartphoneCheckbox().click();
		shoppingCartPage.getUpdateShoppingCartButton().click();

		// Assertion
		SoftAssert sa = new SoftAssert();
		try
		{
		sa.assertEquals(shoppingCartPage.getSmartphoneProduct().isDisplayed(), false, "Product is not removed from cart");
		}
		catch(Exception o)
		{
			Reporter.log("Product is removed from cart", true);
		}
		sa.assertAll();
	}
   
}
