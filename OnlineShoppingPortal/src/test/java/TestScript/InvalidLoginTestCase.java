package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseClass;
import genericPackage.Flib;
import pomPackage.LoginPage;
import pomPackage.WelcomePage;

public class InvalidLoginTestCase extends BaseClass {
	@Test(groups = "Functionality Testing")
	public void invalidloginTC() throws EncryptedDocumentException, IOException, InterruptedException {
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		LoginPage lp = new LoginPage(driver);

		Flib flib = new Flib();
		int rc = flib.getLastRowCount(EXCEL_PATH, "invalidcreds");

		for (int i = 1; i <= rc; i++) {
			String email = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);

			lp.validLogin(email, password);
			Thread.sleep(1000);
			lp.getEmailTextBox().clear();

		}
	}

}
