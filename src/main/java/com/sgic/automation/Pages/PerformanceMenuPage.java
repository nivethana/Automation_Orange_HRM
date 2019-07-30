package com.sgic.automation.Pages;

import com.sgic.automation.Utils.PageBase;
import org.openqa.selenium.By;

public class PerformanceMenuPage extends PageBase {
    private static By PerformanceBtn= By.id("menu__Performance");
    private static By ConfigureBtn= By.id("menu_performance_Configure");
    private static By TextConfigure= By.id("menu_performance_Configure");
    private static By ManageReviewBtn= By.id("menu_performance_ManageReviews");
    private static By EmployeeTrackerBtn= By.id("menu_performance_viewEmployeePerformanceTrackerList");
   private static By KPIsBtn= By.id("menu_performance_searchKpi");
    private static By TrackersBtn= By.id("menu_performance_addPerformanceTracker");
    private static By ManageReviewSearchBtn= By.id("menu_performance_searchPerformancReview");


    public static void ClickPerformanceBtn() {
        getDriver().findElement(PerformanceBtn).click();
    }
    public static boolean isPerformanceDisplayed() {
        return getDriver().findElement(TextConfigure).isDisplayed();
}

    public static void ClickConfigureBtn() {
        getDriver().findElement(ConfigureBtn).click();
    }

    public static void ClickManageReviewBtn() {
        getDriver().findElement(ManageReviewBtn).click();
    }

    public static void ClickEmployeeTrackBtn() {
        getDriver().findElement(EmployeeTrackerBtn).click();
    }
    public static void ClickKPIsBtn() {
        getDriver().findElement(KPIsBtn).click();
    }
    public static void ClickTrackersBtn() {
        getDriver().findElement(TrackersBtn).click();
    }
    public static void ClickManageReviwBtn() {
        getDriver().findElement(ManageReviewSearchBtn).click();
    }
}
