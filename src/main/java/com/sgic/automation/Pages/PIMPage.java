package com.sgic.automation.Pages;

import com.sgic.automation.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class PIMPage extends PageBase {
    private static final Logger LOGGER=Logger.getLogger(PIMPage.class);

    public static By configeSub= By.id("menu_pim_Configuration");


    public static void ConfigSubClick(){getDriver().findElement(configeSub).click();}
}
