package Main;

import Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Emrullah extends BaseDriver {
    @Test
    @Parameters("searchText")
    void test(String key) {
        SearchElements elm = new SearchElements();
        driver.get("https://demo.nopcommerce.com/");

        elm.searchBox.sendKeys(key + Keys.ENTER);

        Assert.assertTrue(elm.product.getText().equals(key), "Product bulunamdi!!!");
    }



}
