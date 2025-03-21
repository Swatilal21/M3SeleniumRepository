package pomPackage;

import java.io.IOException;

import DataDrivenFramework.Flib;

public class AddToCart extends baseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
        baseTest bt = new baseTest();
        bt.browserSetUp();
        
        welcomePage wp = new welcomePage(driver);
        wp.getLoginLink().click();
        
        Flib flib = new Flib();
        String email = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 0);
        String password = flib.readExcelData(EXCEL_PATH, VALIDLOGINCREDS, 1, 1);
        
        loginPage lp = new loginPage(driver);
        lp.validLogin(email, password);
        
        wp.getElectronicsLink().click();
        
        Thread.sleep(3000);
        
        ElectronicsPage ep = new ElectronicsPage(driver);
        ep.getCellPhoneLink().click();
        
        ep.getSmartPhoneToCartButton().click();
        
        wp.getShoppingLink().click();
        
        ShoppingCartPage sp = new ShoppingCartPage(driver);
       if(sp.getSmartPhoneCartProduct().isDisplayed())
       {
       
       System.out.println("Product is added to cart");
	}
       else
       {
    	   System.out.println("Product is not added to cart");
       }

}
}
