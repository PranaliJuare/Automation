package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "Email")
	private WebElement emailTextBox;

	@FindBy(id = "Password")
	private WebElement passwordTextBox;

	// @FindBy(id = "RememberMe")
	// private WebElement rememberMeCheckBox;

	@FindBy(xpath = "//input[@class=\"button-1 login-button\"]")
	private WebElement logInButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	/*
	 * public WebElement getRememberMeCheckBox() { return rememberMeCheckBox; }
	 */

	public WebElement getLogInButton() {
		return logInButton;
	}

	public void validLogin(String email, String pwd) {
		emailTextBox.clear();
		emailTextBox.sendKeys(email);

		passwordTextBox.clear();
		passwordTextBox.sendKeys(pwd);

		//rememberMeCheckBox.clear();
		//rememberMeCheckBox.click();

		logInButton.click();

	}

}
