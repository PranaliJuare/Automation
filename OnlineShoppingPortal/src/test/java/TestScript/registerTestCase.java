package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseClass;
import genericPackage.Flib;
import pomPackage.RegisterPage;
import pomPackage.WelcomePage;

public class registerTestCase extends BaseClass {
	@Test
	public void registerTC() throws IOException {
		WelcomePage wp = new WelcomePage(driver);
		wp.getRegisterLink().click();

		RegisterPage rp = new RegisterPage(driver);
		
		Flib flib = new Flib();
		String fn = flib.readExcelData(EXCEL_PATH, "registercreds", 1, 0);
		String ln = flib.readExcelData(EXCEL_PATH, "registercreds", 1, 1);
		String email = flib.readExcelData(EXCEL_PATH, "registercreds", 1, 2);
		String password = flib.readExcelData(EXCEL_PATH, "registercreds", 1, 3);
		
		rp.registerUser(fn, ln, email, password);

	}

}
