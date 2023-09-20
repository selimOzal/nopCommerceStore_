package Main;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
import java.util.ArrayList;
import java.util.List;

public class Osman extends BaseDriver {

    @Test
    public void hediyeSiparisiVerme(){
        HediyeSiparisiPom hsp = new HediyeSiparisiPom();
        driver.get("https://demo.nopcommerce.com/");

        //Tab Menu kontrolu
        List<String> menuExpectedList= new ArrayList<>();
        menuExpectedList.add("Computers");
        menuExpectedList.add("Electronics");
        menuExpectedList.add("Apparel");
        menuExpectedList.add("Digital downloads");
        menuExpectedList.add("Books");
        menuExpectedList.add("Jewelry");
        menuExpectedList.add("Gift Cards");

        for (int i = 0; i <menuExpectedList.size() ; i++) {
            Assert.assertTrue(hsp.tabMenu.getText().contains(menuExpectedList.get(i)));
        }

        //Rastgele fisizksel hediye secme
        hsp.giftCardsBtn.click();
        int randomSecim = (int) (Math.random() * hsp.giftCardsDetails.size());
        hsp.giftCardsDetails.get(randomSecim).click();

        //Zorunlu alanlar doldurulmadiginda uyari mesaji
        hsp.addToChartBtn.click();
        for(WebElement h: hsp.hataMesaji)
            Assert.assertTrue(h.getText().contains("Enter valid"));

        hsp.hataMesajiKapatma.click();

        //Zorunlu alanlari doldurma
        hsp.recipName.sendKeys("Teo Leo");
        hsp.yourName.sendKeys("Ben Ben");
        hsp.message.sendKeys("Happy new year");
        if (hsp.recipEmail.size()!=0){
            hsp.recipEmail.get(0).sendKeys("teoleo@hotmail.com");
            hsp.yourEmail.sendKeys("osman@hotmail.com");
        }

        hsp.addToChartBtn.click();

        //Urunun sepete eklendigini dogrulama
        Assert.assertEquals(hsp.dogrulamaMesaji.getText(), "The product has been added to your shopping cart");

        }

}












