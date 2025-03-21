package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomPackage.CheckoutPage;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;
@Listeners(genericLibrary.MyListeners.class)
public class TC_BuyProduct_003_Test extends BaseTest {
  @Test
  public void buyProduct() throws InterruptedException, EncryptedDocumentException, IOException 
  {	  
			WelcomePage welcomePage = new WelcomePage(driver);
			welcomePage.getElectronicsLink().click();
			
			ElectronicsPage electronicsPage = new ElectronicsPage(driver);
			electronicsPage.getCellPhonesLink().click();
			electronicsPage.getSmartphoneAddToCartButton().click();
			
			welcomePage.getShoppingCartLink().click();			
			ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
			
			shoppingCartPage.getSelectSmartphoneCheckbox().click();
			shoppingCartPage.getTermsOfServiceCheckbox().click();
			shoppingCartPage.getCheckoutButton().click();	
			
			CheckoutPage checkoutPage = new CheckoutPage(driver);
			checkoutPage.buyProduct();
  }
 
}
