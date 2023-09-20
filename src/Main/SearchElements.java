package Main;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchElements {

    public SearchElements() {
            PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(id="small-searchterms")
        public WebElement searchBox;

    @FindBy(xpath = "//*[@class='product-title']")
        public WebElement product;



}
