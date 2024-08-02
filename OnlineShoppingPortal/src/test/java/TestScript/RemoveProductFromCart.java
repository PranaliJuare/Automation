package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseClass;
import genericPackage.Flib;
import pomPackage.ElectronicPage;
import pomPackage.LoginPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

public class RemoveProductFromCart extends BaseClass {
	@Test(groups = "Integration Testing")
	public void removeProduct() throws IOException {
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLogin(flib.readExcelData(EXCEL_PATH, "validcreds", 1, 0), flib.readExcelData(EXCEL_PATH, "validcreds", 1, 1));
	    
		wp.getElectronicsLink().click();
		ElectronicPage ep = new ElectronicPage(driver);
		ep.addProductToCart();
		wp.getShoppingCartLink().click();
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.getSmartPhoneLCartElement().click();
		sp.getCheckboxbutton().click();
		sp.getUpdatecartbutton().click();
	}

}
