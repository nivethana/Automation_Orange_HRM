package com.sgic.automation.Pages.PIM;

import com.sgic.automation.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;


public class CustomFields extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(CustomFields.class);

    public static By CustomHeading=By.xpath("//*[text()=\"Defined Custom Fields\"]");
    public static By AddCustom = By.id("buttonAdd");



    public static String GetData(){
        return getDriver().findElement(CustomHeading).getText();
    }

    public static void ClickAddCustom(){
        getDriver().findElement(AddCustom).click();
    }

}
