package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(xpath = "//span[text()=\"Shopping cart\"]")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath  = "//span[text()=\"Wishlist\"]")
	private WebElement wishlistLink;
	
	@FindBy(partialLinkText  = "BOOKS")
	private WebElement booksLink;
	
	@FindBy(partialLinkText  = "COMPUTERS")
	private WebElement computersLink;
	
	@FindBy(partialLinkText  = "ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(partialLinkText  = "APPAREL & SHOES")
	private WebElement apparelAndShoesLink;
	
	@FindBy(partialLinkText  = "DIGITALS DOWNLOADS")
	private WebElement digitalDownloadLink;
	
	@FindBy(partialLinkText  = "JEWELARY")
	private WebElement jewelaryLink;
	
	@FindBy(partialLinkText  = "GIFT CARDS")
	private WebElement giftCardsLink;
	
	@FindBy(id  = "small-searchterms")
	private WebElement searchBox;
	
	@FindBy(xpath = "//input[@value=\"Search\"]")
	private WebElement searchButton;
	
	//Initialization
	public WelcomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
	public WebElement getWishlistLink() {
		return wishlistLink;
	}
	public WebElement getBooksLink() {
		return booksLink;
	}
	public WebElement getComputersLink() {
		return computersLink;
	}
	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}
	public WebElement getDigitalDownloadLink() {
		return digitalDownloadLink;
	}
	public WebElement getJewelaryLink() {
		return jewelaryLink;
	}
	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}
	public WebElement getSearchBox() {
		return searchBox;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}

	
}
