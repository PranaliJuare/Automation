package genericPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass extends Flib implements IAutoConstant {

	public static WebDriver driver=null;

	@BeforeMethod
	public void openBrowser() throws IOException {
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "browser1");

		if (browserValue.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserValue.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserValue.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Enter valid browser name ");
		}
		String url = flib.readPropertyData(PROP_PATH, "url");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}

	@AfterMethod
	public void browserTearDown() {
		driver.quit();
	}

}
