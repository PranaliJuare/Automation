package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseClass;
import genericPackage.Flib;
import pomPackage.LoginPage;
import pomPackage.WelcomePage;

public class loginTestCase extends BaseClass {
	@Test(groups   = "Functionality Testing")
	public void loginTC() throws IOException {
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, "validcreds", 1, 0);
		String password = flib.readExcelData(EXCEL_PATH, "validcreds", 1, 1);
		
		lp.validLogin(email, password);

	}
}
