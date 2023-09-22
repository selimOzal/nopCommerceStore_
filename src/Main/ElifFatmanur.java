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

        //dogum tarihi secimi
        WebElement dropdownElementDay = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        WebElement dropdownElementMonth = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        WebElement dropdownElementYear = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));

        Select day = new Select(dropdownElementDay);
        Select month = new Select(dropdownElementMonth);
        Select year = new Select(dropdownElementYear);

        day.selectByVisibleText("3");
        month.selectByVisibleText("October");
        year.selectByVisibleText("1990");

        MyFunc.Bekle(3);

        //kullanici bilgileri
        WebElement firstName = driver.findElement(By.id("FirstName"));
        WebElement lastName = driver.findElement(By.id("LastName"));
        WebElement eMail = driver.findElement(By.id("Email"));
        WebElement password = driver.findElement(By.id("Password"));
        WebElement confirmPass = driver.findElement(By.id("ConfirmPassword"));

        firstName.sendKeys("Ayse");
        lastName.sendKeys("deniz");
        eMail.sendKeys("ayse050a0@gmail.com");
        password.sendKeys("ays.123");
        confirmPass.sendKeys("ays.123");

        WebElement rgstButton = driver.findElement(By.id("register-button"));
        rgstButton.click();

        //basarili kayit mesaji dogrulamasi
        WebElement textSuccess = driver.findElement(By.cssSelector("div[class='result']"));
        Assert.assertTrue(textSuccess.getText().equals("Your registration completed"));

        WebElement cntButton = driver.findElement(By.cssSelector("a[class='button-1 register-continue-button']"));
        cntButton.click();

        //ana sayfaya yonlendirilme dogrulamasi
        Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://demo.nopcommerce.com/"));

    }
    }
