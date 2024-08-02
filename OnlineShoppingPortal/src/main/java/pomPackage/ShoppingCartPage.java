package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	@FindBy(xpath = "(//a[text()='Smartphone'])")
	private WebElement smartPhoneLCartElement;
	@FindBy(xpath = "//input[@name='removefromcart']")
	private WebElement removefromcartcheckbox;
	@FindBy(name = "updatecart")
	private WebElement updatecartbutton;
	@FindBy(name = "continueshopping")
	private WebElement continueShoppingButton;
	@FindBy(name = "termsofservice")
	private WebElement termsofservicecheckbox;
	@FindBy(id = "checkout")
	private WebElement checkboxbutton;
	//@FindBy(xpath = "//input[@name='removefromcart']")
	//private WebElement checkbox;

	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSmartPhoneLCartElement() {
		return smartPhoneLCartElement;
	}

	public WebElement getRemovefromcartcheckbox() {
		return removefromcartcheckbox;
	}

	public WebElement getUpdatecartbutton() {
		return updatecartbutton;
	}

	public WebElement getContinueShoppingButton() {
		return continueShoppingButton;
	}

	public WebElement getTermsofservicecheckbox() {
		return termsofservicecheckbox;
	}

	public WebElement getCheckboxbutton() {
		return checkboxbutton;
	}

	/*public WebElement getCheckbox() {
		return checkbox;
	}*/

}