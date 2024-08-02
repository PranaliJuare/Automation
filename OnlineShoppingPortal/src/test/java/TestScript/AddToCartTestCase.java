package TestScript;

import org.testng.annotations.Test;

import genericPackage.BaseClass;
import pomPackage.ElectronicPage;
import pomPackage.WelcomePage;

public class AddToCartTestCase extends BaseClass {
	@Test(groups = "Integration Testing")
	public void addToCartTestCase() {
		WelcomePage wp = new WelcomePage(driver);
		wp.getElectronicsLink().click();

		ElectronicPage ep = new ElectronicPage(driver);
		ep.addProductToCart();
	}
}
