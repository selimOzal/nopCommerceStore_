package Main;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchElements {

    public SearchElements() {
            PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(id="small-searchterms")
        public WebElement searchBox;

    @FindBy(xpath = "//*[@class='product-title']")
        public WebElement product;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']")
    public WebElement tabMenu;

    @FindBy(linkText = "Gift Cards")
    public WebElement giftCardsBtn;

    @FindBy(css = "[class='details'] [class='product-title']")
    public List<WebElement> giftCardsDetails;

    @FindBy(css = "[class='bar-notification error'] p")
    public List<WebElement> hataMesaji;

    @FindBy (css = "[class='close']")
    public WebElement hataMesajiKapatma;

    @FindBy (xpath="//input[@class='recipient-name']")
    public  WebElement recipName;

    @FindBy(xpath = "//input[@class='recipient-email']")
    public List<WebElement> recipEmail;

    @FindBy(xpath = "//input[@class='sender-name']")
    public WebElement yourName;

    @FindBy(xpath = "//input[@class='sender-email']")
    public WebElement yourEmail;

    @FindBy(xpath="//textarea[@class='message']")
    public WebElement message;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart-button')]")
    public WebElement addToChartBtn;

    @FindBy(xpath = "//div[@class='bar-notification success']")
    public WebElement dogrulamaMesaji;

    @FindBy(xpath="//*[@class='top-menu notmobile']/li")
    public List<WebElement> tabMenu1;

    @FindBy (xpath = "//div[@class='page-title']//h1")
    public WebElement tabMenuBaslik;

    @FindBy (xpath = "//*[@class='sublist']//a")
    public List<WebElement> tabMenuAltListe;

    @FindBy(linkText = "Log in")
    public WebElement Login;

    @FindBy(id="Email")
    public WebElement Email;

    @FindBy(id="Password")
    public WebElement Password;

    @FindBy(id="RememberMe")
    public WebElement rememberMe;

    @FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    public WebElement LogInButton;
}
