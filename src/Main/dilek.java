package Main;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dilek extends BaseDriver {

    @Test
    public void test1() {

        driver.get("https://demo.nopcommerce.com/");
        WebElement login=driver.findElement(By.cssSelector("a[class='ico-login]"));
        login.click();
        WebElement email= driver.findElement(By.cssSelector("input[class=email]"));
        email.sendKeys("dilekatilla@outlook.com");
        WebElement password= driver.findElement(By.cssSelector("input[class='password]"));
        password.sendKeys("ahmet2303");


    }


}
