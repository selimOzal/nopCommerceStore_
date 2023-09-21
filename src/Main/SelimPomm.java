package Main;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelimPomm {
    public SelimPomm() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

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

