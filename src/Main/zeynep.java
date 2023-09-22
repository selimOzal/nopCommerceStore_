package Main;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class zeynep extends BaseDriver {

     @Test
     public void BilgisayarSiparisi() {

          driver.get("https://demo.nopcommerce.com/");

          WebElement computer = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
          computer.click();

          WebElement desktopComputers = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a"));
          desktopComputers.click();

          WebElement addCart = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]"));
          addCart.click();

          WebElement dogrulamaMesaji = driver.findElement(By.xpath("//div[@class='bar-notification success']"));
          Assert.assertEquals(dogrulamaMesaji.getText(), "The product has been added to your shopping cart");

          WebElement viewCart = driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/a"));
          viewCart.click();

          WebElement terms = driver.findElement(By.id("termsofservice"));
          terms.click();

          WebElement login = driver.findElement(By.cssSelector("a[class='ico-login']"));
          login.click();

          WebElement email = driver.findElement(By.cssSelector("input[class=email]"));
          email.sendKeys("yilmazfatma@gmail.com");

          WebElement password = driver.findElement(By.cssSelector("input[class='password']"));
          password.sendKeys("yilmaz123");

          //WebElement remember = driver.findElement(By.cssSelector("input[id='RememberMe']"));
          //remember.click();

          //WebElement forgot = driver.findElement(By.linkText("Forgot password?"));
          //forgot.click();

          WebElement login2 = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
          login2.click();


     }

}
