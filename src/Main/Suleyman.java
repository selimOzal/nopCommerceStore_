package Main;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Suleyman extends BaseDriver {

    @Test
    public void tabMenuKontrolu(){
        HediyeSiparisiPom hsp = new HediyeSiparisiPom();
        driver.get("https://demo.nopcommerce.com/");

        //Sayfa üzerinde sekme menüsünün bulunduğunu ve
        // bu menünün elemanlarının listelendiğini doğrulayabilmeliyim.
        List<String> menuExpectedList= new ArrayList<>();
        menuExpectedList.add("Computers");
        menuExpectedList.add("Electronics");
        menuExpectedList.add("Apparel");
        menuExpectedList.add("Digital downloads");
        menuExpectedList.add("Books");
        menuExpectedList.add("Jewelry");
        menuExpectedList.add("Gift Cards");

        for (int i = 0; i < menuExpectedList.size(); i++) {
            Assert.assertEquals(menuExpectedList.get(i), hsp.tabMenu1.get(i).getText());
        }

        //Sekme menüsündeki her bir elemana tıklayabilmeliyim ve
        //her bir elemana tıkladığımda beni kendi sayfasına yönlendirdiğine emin olmalıyım.
        for (int i = 0; i < hsp.tabMenu1.size(); i++) {
            hsp.tabMenu1.get(i).click();
            Assert.assertEquals(hsp.tabMenuBaslik.getText(), menuExpectedList.get(i));
        }
        //Alt menü içeren bir sekme elemanı varsa her birinin tıklanabilir olduğuna ve
        // kendi sayfasına yönlendirdiğine emin olmalıyım.
        for (int i = 0; i < hsp.tabMenu1.size(); i++) {
            hsp.tabMenu1.get(i).click();
            if (hsp.tabMenuAltListe.size()>1){
                for (int j = 0; j < hsp.tabMenuAltListe.size(); j++) {
                    hsp.tabMenuAltListe.get(j).click();
                    Assert.assertEquals(hsp.tabMenuAltListe.get(j).getText(), hsp.tabMenuBaslik.getText());
                }
            }

        }
    }
}

