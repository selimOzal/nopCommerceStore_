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
        SearchElements elm = new SearchElements();
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
            Assert.assertTrue(elm.tabMenu.getText().contains(menuExpectedList.get(i)));
        }

        //Rastgele fisizksel hediye secme
        elm.giftCardsBtn.click();
        int randomSecim = (int) (Math.random() * elm.giftCardsDetails.size());
        elm.giftCardsDetails.get(randomSecim).click();

        //Zorunlu alanlar doldurulmadiginda uyari mesaji
        elm.addToChartBtn.click();
        for(WebElement h: elm.hataMesaji)
            Assert.assertTrue(h.getText().contains("Enter valid"));

        elm.hataMesajiKapatma.click();

        //Zorunlu alanlari doldurma
        elm.recipName.sendKeys("Teo Leo");
        elm.yourName.sendKeys("Ben Ben");
        elm.message.sendKeys("Happy new year");
        if (elm.recipEmail.size()!=0){
            elm.recipEmail.get(0).sendKeys("teoleo@hotmail.com");
            elm.yourEmail.sendKeys("osman@hotmail.com");
        }

        elm.addToChartBtn.click();

        //Urunun sepete eklendigini dogrulama
        Assert.assertEquals(elm.dogrulamaMesaji.getText(), "The product has been added to your shopping cart");
        }
}












