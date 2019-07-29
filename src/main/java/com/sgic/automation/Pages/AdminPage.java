package com.sgic.automation.Pages;

import com.sgic.automation.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class AdminPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    public static By hdrUserManagement=By.id("menu_admin_UserManagement");
    public static By txtSerchUsername=By.id("searchSystemUser_userName");
    public static By txtSerchEmployeename=By.xpath("//*[@id=\"searchSystemUser_employeeName_empName\"]");
    public static By UserROle=By.id("searchSystemUser_userType");
    public static By btnSearch=By.id("searchBtn");
    public static By Status=By.id("searchSystemUser_status");
    public static By btnReset=By.id("resetBtn");
    public static By btnAdd=By.xpath("//*[@id=\"btnAdd\"]");
    public static By btnDelete=By.id("btnDelete");
    public static By tableAdduser=By.id("frmList_ohrmListComponent");




    public static boolean isAdminPageDisplayed(){
        return getDriver().findElement(btnAdd).isDisplayed();
    }

    public static boolean isUserTableDisplayed(){
        return getDriver().findElement(tableAdduser).isDisplayed();
    }

    public static void clickUserManagement(){
        getDriver().findElement(hdrUserManagement).click();
    }

    public static void clickAdd(){
        getDriver().findElement(btnAdd).click();
    }

    public static void clickDelete(){
        getDriver().findElement(btnDelete).click();
    }

    public static void setUsername(String username){
        getDriver().findElement(txtSerchUsername).sendKeys(username);
    }

    public static void setEmplname(String empName){
        getDriver().findElement(txtSerchEmployeename).sendKeys(empName);
    }

    public static void clickSearch(){
        getDriver().findElement(btnSearch).click();
    }




}
