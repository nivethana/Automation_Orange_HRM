package com.sgic.automation.Pages;

import com.sgic.automation.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class KPIsSearchPageWithJobTitle extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(KPIsSearchPageWithJobTitle.class);

    private static By SetJobTitle= By.id("kpi360SearchForm_jobTitleCode");
    private static By SearchBtn= By.id("searchBtn");
    private static By getResult= By.xpath("//*[@class=\"left\"]");


    public static String getSelectedOption() {
        Select dropDownOption = new Select(getDriver().findElement(SetJobTitle));
        return dropDownOption.getFirstSelectedOption().getText();
    }
    public static void setDropDownOption(String option) {
        Select dropDownOption = new Select(getDriver().findElement(SetJobTitle));
        dropDownOption.selectByVisibleText(option);
    }
    public static void ClickSearchBtn(){
        getDriver().findElement(SearchBtn).click();
    }
    public static  String getMessage() {
        return getDriver().findElement(getResult ).getText();
    }



















}
