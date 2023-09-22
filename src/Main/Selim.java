package Main;

import Utility.BaseDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Selim  extends BaseDriver {


    @Test(dataProvider = "userData")

    public void  PozitifNegatifLogin(String email, String password) {
        SearchElements elm = new SearchElements();

        driver.get("https://demo.nopcommerce.com/");


        elm.Login.click();

        elm.Email.sendKeys(email);

        elm.Password.sendKeys(password);

        elm.rememberMe.click();

        elm.LogInButton.click();
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