package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;
@Listeners(genericLibrary.MyListeners.class)
public class TC_AddToCart_001_Test  extends BaseTest {
	@Test
	   public void addToCart() throws EncryptedDocumentException, IOException{

		//To click on Electronics element--located in welcome page
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getElectronicsLink().click();
		
		//To add cellphone to cart
		ElectronicsPage electronicsPage = new ElectronicsPage(driver);
		electronicsPage.getCellPhonesLink().click();
		electronicsPage.getSmartphoneAddToCartButton().click();
		
		//To click on shopping cart--located in welcomepage
		welcomePage.getShoppingCartLink().click();
		
		ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
		
		//Assertion
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(shoppingCartPage.getSmartphoneProduct().isDisplayed(), true, "Product is not added to cart");
	}
 
}
