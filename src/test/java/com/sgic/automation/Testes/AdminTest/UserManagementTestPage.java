package com.sgic.automation.Testes.AdminTest;

import com.sgic.automation.Pages.AdminAddPage;
import com.sgic.automation.Pages.AdminPage;
import com.sgic.automation.Pages.HomePage;
import com.sgic.automation.Pages.LoginPage;
import com.sgic.automation.Utils.Constants;
import com.sgic.automation.Utils.TestBase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UserManagementTestPage extends TestBase {

    //** VerifyHomePage **

    @Test( priority = 1)
    public void testVerifyAdminPage() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Logo is not displyed ");
        LoginPage.setusername(Constants.LOGIN_USER_NAME);
        LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        LoginPage.clickSubmit();
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        HomePage.clickLink(Constants.ADMIN_LINK);
        softAssert.assertTrue(AdminPage.isAdminPageDisplayed(), "Home Page is not Displayed");
        softAssert.assertAll();

    }

    @Test(groups = "REGRESSION",priority = 2)
    public void testAddAdminPage(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Logo is not displyed ");
        LoginPage.setusername(Constants.LOGIN_USER_NAME);
        LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        LoginPage.clickSubmit();
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        HomePage.clickLink(Constants.ADMIN_LINK);
        softAssert.assertTrue(AdminPage.isAdminPageDisplayed(), "Home Page is not Displayed");
        AdminPage.clickAdd();
        AdminAddPage.setSelectionRole("Admin");
        softAssert.assertEquals(AdminAddPage.getSelectionRole(),"Admin","Admin is not visible");
        AdminAddPage.setEmployeename("hema sree ch");
        AdminAddPage.setUsername("Thusya");
        AdminAddPage.setSelectionStatus("Enabled");
        softAssert.assertEquals(AdminAddPage.getSelectionStatus(),"Enabled","Status is not visible");
        AdminAddPage.setUsername("12345678");
        AdminAddPage.setConformPassword("12345678");
        AdminAddPage.clickAddSave();
       softAssert.assertTrue(AdminPage.isUserTableDisplayed(),"Table is not displyed");

        softAssert.assertAll();

    }





}
