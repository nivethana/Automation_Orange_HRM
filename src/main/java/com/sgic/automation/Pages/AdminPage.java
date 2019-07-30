package com.sgic.automation.Pages;

import com.sgic.automation.Utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AdminPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    public static By hdrUserManagement=By.id("menu_admin_UserManagement");
    public static By hdrUser=By.id("menu_admin_viewSystemUsers");
    public static By txtSerchUsername=By.id("searchSystemUser_userName");
    public static By txtSerchEmployeename=By.xpath("//*[@id=\"searchSystemUser_employeeName_empName\"]");
    public static By UserROle=By.id("searchSystemUser_userType");
    public static By btnSearch=By.id("searchBtn");
    public static By Status=By.id("searchSystemUser_status");
    public static By btnReset=By.id("resetBtn");
    public static By btnAdd=By.xpath("//*[@id=\"btnAdd\"]");
    public static By btnDelete=By.id("btnDelete");
    public static By tableAdmin= By.xpath("//a[text()=\"test121\"]");
    public static By msgInvalidSearch=By.xpath("//*[@colspan=\"5\"]");





    public static boolean isAdminPageDisplayed(){
        return getDriver().findElement(btnSearch).isDisplayed();
    }

    public static String getInvalidSearchMsg(){
        return getDriver().findElement(msgInvalidSearch).getText();
    }
    public static void clickUserManagement(){
        getDriver().findElement(hdrUserManagement).click();
    }

    public static void clickUser(){
        getDriver().findElement(hdrUser).click();
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

    public static void waittillAdminPageLoad() {
        waiTillVisible(tableAdmin, 2);
    }

    public static String getUsername(){
       return getDriver().findElement(tableAdmin).getText();
    }

    public static String getRoleSelection(){
        Select option = new Select(getDriver().findElement(UserROle));
        return option.getFirstSelectedOption().getText();
    }

    public static void setRoleSelection(String role){
        Select option = new Select(getDriver().findElement(UserROle));
         option.selectByVisibleText(role);
    }

    public static String getStatusSelection(){
        Select option = new Select(getDriver().findElement(Status));
        return option.getFirstSelectedOption().getText();
    }

    public static void setStatusSelection(String status){
        Select option = new Select(getDriver().findElement(Status));
        option.selectByVisibleText(status);
    }


}








