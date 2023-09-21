package Main;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class HediyeSiparisiPom {

    public HediyeSiparisiPom() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy (css = "[class='ico-login']")
    public WebElement loginBtn;

    @FindBy(id="Email")
    public WebElement emailInput;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement loginBtn2;

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










}
