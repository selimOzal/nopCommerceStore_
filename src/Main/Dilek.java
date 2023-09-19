package Main;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dilek extends BaseDriver {

    @Test
    public void test1() {

        driver.get("https://demo.nopcommerce.com/");
        WebElement login = driver.findElement(By.cssSelector("a[class='ico-login']"));
        login.click();
        WebElement email = driver.findElement(By.cssSelector("input[class=email]"));
        email.sendKeys("dilekatilla@outlook.com");
        WebElement password = driver.findElement(By.cssSelector("input[class='password']"));
        password.sendKeys("ahmet2303");
        WebElement remember = driver.findElement(By.cssSelector("input[id='RememberMe']"));
        remember.click();
        WebElement forgot = driver.findElement(By.linkText("Forgot password?"));
        forgot.click();
        WebElement login2 = driver.findElement(By.cssSelector("button[type='submit']"));
        login2.click();


    }


}
