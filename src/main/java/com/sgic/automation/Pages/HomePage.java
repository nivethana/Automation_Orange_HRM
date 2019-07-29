package com.sgic.automation.Pages;

import com.sgic.automation.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class HomePage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(HomePage.class);
    private static By hdrWelcome = By.id("welcome");
    private static String commonLinkString = "//a[@href='LINK']";

    /**
     * Verify Home Page Displayed    *    * @throws null    * @return boolean
     */
    public static boolean isHomePageDisplayed() {
        return getDriver().findElement(hdrWelcome).isDisplayed();
    }

    /**
     * Click Link    *    * @throws null    * @param link* @return void
     */
    public static void clickLink(String link) {
        getDriver().findElement(By.xpath(commonLinkString.replace("LINK", link))).click();
        LOGGER.info("Link " + link + " Clicked");
    }
}
