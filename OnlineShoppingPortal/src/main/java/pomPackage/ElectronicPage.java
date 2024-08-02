package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicPage {
	@FindBy(partialLinkText = "Cell phones")
	private WebElement cellphonesLink;
	@FindBy(partialLinkText = "Smartphone")
	private WebElement SmartphoneLink;
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@value='Add to cart']")
	private WebElement SmartphoneAddToCartLink;
	@FindBy(xpath = "//p[text()='The product has been added to your ']/descendant::a[text()='shopping cart']")
	private WebElement ProductAddedToCartMessage;

	public ElectronicPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getCellphonesLink() {
		return cellphonesLink;
	}

	public WebElement getSmartphoneLink() {
		return SmartphoneLink;
	}

	public WebElement getSmartphoneAddToCartLink() {
		return SmartphoneAddToCartLink;
	}

	public WebElement getProductAddedToCartMessage() {
		return ProductAddedToCartMessage;
	}

	public void addProductToCart() {
		cellphonesLink.click();
		SmartphoneAddToCartLink.click();
		ProductAddedToCartMessage.isDisplayed();

	}
}
