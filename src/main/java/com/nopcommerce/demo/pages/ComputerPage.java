package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(xpath = "//div[@class='category-grid sub-category-grid']//h2/a")
    List<WebElement> subMenuLinks;


    public String getPageTitleText() {
        String message = getTextFromElement(pageTitle);
        log.info("Get pageTitle text : " + pageTitle.getText() + "<br>");
        return message;
    }

    public void clickOnSubMenu(String subTab) {
        for (WebElement menu : subMenuLinks) {
            if (menu.getText().contains(subTab)) {

                log.info("Click on '" + subTab + "' link <br>");
                clickOnElement(menu);
                break;
            }
        }
    }
}
