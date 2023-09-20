package Main;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElifFatmanur extends BaseDriver {

    @Test
    public void navigateToRegistrationPage() {
        driver.get(" https://demo.nopcommerce.com/");

        //register butonunun tiklanabilir olma dogrulamasi
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='ico-register']")));
        WebElement resgistrationLink = driver.findElement(By.xpath("//a[@class='ico-register']"));

        resgistrationLink.click();
        MyFunc.Bekle(2);

        //kayit sayfasina erisim dogrulamasi
        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("register"));

        WebElement dropdownElement1 = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Select dropdown1 = new Select(dropdownElement1);
        dropdown1.selectByVisibleText("3");

        WebElement dropdownElement2 = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        Select dropdown2 = new Select(dropdownElement2);
        dropdown2.selectByVisibleText("October");

        WebElement dropdownElement3 = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        Select dropdown3 = new Select(dropdownElement3);
        dropdown3.selectByVisibleText("1990");

        MyFunc.Bekle(3);
        System.out.println();
    }
    }
