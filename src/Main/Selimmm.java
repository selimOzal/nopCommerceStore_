package Main;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Selimmm  extends BaseDriver {


    @Test(dataProvider = "userData")

    public void  PozitifNegatifLogin(String email, String password) {
        SelimPomm sp=new SelimPomm();

        driver.get("https://demo.nopcommerce.com/");


        sp.Login.click();

        sp.Email.sendKeys(email);

        sp.Password.sendKeys(password);

        sp.rememberMe.click();

        sp.LogInButton.click();
    }

    @DataProvider()
    public Object[][] userData() {

        Object[][] data = {
                {"slm01@gmail.com", "slm01"},
                {"slm02@gmail.com", "slm02"},
                {"slm03@gmail.com", "slm03"},
                {"slm04@gmail.com", "slm04"},
                {"slm05@gmail.com", "slm05"},
                {"slm06@gmail.com", "slm06"},

        };

        return data;
    }
}