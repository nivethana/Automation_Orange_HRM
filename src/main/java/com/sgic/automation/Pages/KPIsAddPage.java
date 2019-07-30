package com.sgic.automation.Pages;

import com.sgic.automation.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class KPIsAddPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(KPIsAddPage.class);
    private static By AddBtn= By.id("btnAdd");
    private static By KPIsHeader= By.id("PerformanceHeading");
    private static By JobTitle= By.id("defineKpi360_jobTitleCode");
    private static By KeyPerformanceIndicator= By.id("defineKpi360_keyPerformanceIndicators");
    private static By MinimumRating= By.id("defineKpi360_minRating");
    private static By MaximumRating= By.id("defineKpi360_maxRating");
    private static By MakeDefaultScale= By.id("defineKpi360_makeDefault");
    private static By SaveBtn= By.id("saveBtn");
   // private static By SaveBtn= By.id("saveBtn");



    public static void clickAddBtn(){
        LOGGER.info("KPI Click Add Button");
        getDriver().findElement(AddBtn).click();
    }
    public static boolean isKPIsSearchDisplyed() {
        return getDriver().findElement(AddBtn).isDisplayed();
    }

    public static boolean isKPIsAddPageDisplayed() {
        return getDriver().findElement(KPIsHeader).isDisplayed();
    }
    public static void setJobTitle(String jobTitle){
        getDriver().findElement(JobTitle).sendKeys(jobTitle);
    }
    public static void setKeyPerformanceIndicator(String indicator){
        getDriver().findElement(KeyPerformanceIndicator).sendKeys(indicator);
    }
    public static void setMinimumRating(String minimumRating){
        getDriver().findElement(MinimumRating).sendKeys(minimumRating);
    }
    public static void setMaximumRating(String maximumRatingRating){
        getDriver().findElement(MaximumRating).sendKeys(maximumRatingRating);
    }
    public static void clickMakeScale(){
        getDriver().findElement(MakeDefaultScale).click();
    }
    public static void clickSaveBtn(){
        getDriver().findElement(SaveBtn).click();
    }


}
