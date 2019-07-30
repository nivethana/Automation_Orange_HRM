package com.sgic.automation.Testes.PerformanceTest;


import com.sgic.automation.Pages.LoginPage;


import com.sgic.automation.TestData.UserDetailsDataProvider;
import com.sgic.automation.Utils.Constants;
import com.sgic.automation.Utils.TestBase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class Logintest extends TestBase {
    // logger  cant use why


//data provider,data give that  String username, String password,String status
@Test(groups = "REGRESSION",priority = 1)
    public void LoginSmokeTest(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Logo is not displyed ");
//        LoginPage.setusername(Constants.LOGIN_USER_NAME);
//        LoginPage.setPassword(Constants.LOGIN_PASSWORD);
//        LoginPage.clickSubmit();
       softAssert.assertTrue(LoginPage.MarkplaceDisply(),"Markrtplace  is not dispalyed");
        softAssert.assertAll();




}

    @Test( groups="REGRESSION",priority = 2, dataProvider ="MultipleUserDetails", dataProviderClass = UserDetailsDataProvider.class)
    public void LoginSuperTest(String username,String password,String status  ) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(), "Login Logo is not displyed ");
        LoginPage.setusername(username);
        LoginPage.setPassword(password);
        LoginPage.clickSubmit();
        softAssert.assertEquals(LoginPage.getmassge(), status);
        softAssert.assertAll();


    }
}
