package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseClass;
import genericPackage.Flib;
import pomPackage.CheckoutPage;
import pomPackage.ElectronicPage;
import pomPackage.LoginPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

public class BuyProductTestCase extends BaseClass{
	@Test(groups = { "System Testing","Smoke Testing"})
	public void buyProductTC() throws IOException {
	WelcomePage wp = new	WelcomePage(driver);
	wp.getLoginLink().click();
	
	LoginPage lp= new LoginPage(driver);
    Flib flib = new Flib();
    lp.validLogin(flib.readExcelData(EXCEL_PATH, "validcreds", 1, 0), flib.readExcelData(EXCEL_PATH, "validcreds", 1, 1));
    
    wp.getElectronicsLink().click();
    ElectronicPage ep = new ElectronicPage(driver);
    ep.addProductToCart();
    
    wp.getShoppingCartLink().click();
    ShoppingCartPage sp= new ShoppingCartPage(driver);
    sp.getTermsofservicecheckbox().click();
    sp.getCheckboxbutton().click();
    
   
    	
	}

}
