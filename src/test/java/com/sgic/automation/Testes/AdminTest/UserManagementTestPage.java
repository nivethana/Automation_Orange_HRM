package com.sgic.automation.Testes.AdminTest;

import com.sgic.automation.Pages.AdminAddPage;
import com.sgic.automation.Pages.AdminPage;
import com.sgic.automation.Pages.HomePage;
import com.sgic.automation.Pages.LoginPage;
import com.sgic.automation.TestData.UserDetailsDataProvider;
import com.sgic.automation.Utils.Constants;
import com.sgic.automation.Utils.PageBase;
import com.sgic.automation.Utils.TestBase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UserManagementTestPage extends TestBase {

    //** VerifyHomePage **

    @Test(groups = "REGRESSION", priority = 1)
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
        AdminPage.clickUserManagement();
        AdminPage.clickUser();
        softAssert.assertTrue(AdminPage.isAdminPageDisplayed(), "Home Page is not Displayed");
        AdminPage.clickAdd();
        AdminAddPage.setSelectionRole("ESS");
        softAssert.assertEquals(AdminAddPage.getSelectionRole(),"Admin","Admin is not visible");
        AdminAddPage.setEmployeename("Arjun Deepika Kamal");
        AdminAddPage.setUsername("Abirame sel");
        AdminAddPage.setSelectionStatus("Enabled");
        softAssert.assertEquals(AdminAddPage.getSelectionStatus(),"Enabled","Status is not visible");
        AdminAddPage.setPassword("12345678abi");
        AdminAddPage.setConformPassword("12345678abi");
        AdminAddPage.clickAddSave();




        softAssert.assertAll();

    }

    @Test(groups = "REGRESSION",priority = 3 , dataProviderClass = UserDetailsDataProvider.class, dataProvider = "MultipleUserDetailsMsg")
    public void testSearchAdmin(String username,String role,String Employeename , String status , String message){
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Logo is not displyed ");
        LoginPage.setusername(Constants.LOGIN_USER_NAME);
        LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        LoginPage.clickSubmit();
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
        HomePage.clickLink(Constants.ADMIN_LINK);
        AdminPage.clickUserManagement();
        AdminPage.clickUser();
        softAssert.assertTrue(AdminPage.isAdminPageDisplayed(), "Home Page is not Displayed");
        AdminPage.setUsername(username);
        AdminPage.setRoleSelection(role);
        softAssert.assertEquals(AdminPage.getRoleSelection(),role,"Role is not equal");
        AdminPage.setEmplname(Employeename);
        AdminPage.setStatusSelection(status);
        softAssert.assertEquals(AdminPage.getStatusSelection(),status,"Status is not equal");
        AdminPage.clickSearch();

        softAssert.assertEquals(AdminPage.getUsername(),message,"not equal");
        softAssert.assertAll();


    }





}
