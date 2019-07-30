package com.sgic.automation.Testes.PerformanceTest;

import com.sgic.automation.Pages.HomePage;
import com.sgic.automation.Pages.KPIsAddPage;
import com.sgic.automation.Pages.LoginPage;
import com.sgic.automation.Pages.PerformanceMenuPage;
import com.sgic.automation.Utils.Constants;
import com.sgic.automation.Utils.TestBase;
import org.apache.bcel.classfile.Constant;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class KPIsAddTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(KPIsAddTest.class);

    @Test(groups="REGRESSION",priority = 1)
    //verify performance page Displayed
    public  void SmokeKPIsTest(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Logo is not displyed ");
        LOGGER.info("login page is displayed");
        LoginPage.setusername(com.sgic.automation.Utils.Constants.LOGIN_USER_NAME);
        LOGGER.info("set the user name");
        LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        LOGGER.info("set the password");
        LoginPage.clickSubmit();
        LOGGER.info("click the submit button");
        softAssert.assertTrue(LoginPage.MarkplaceDisply(),"Markrtplace  is not dispalyed");
        LOGGER.info("markplace is displayed");
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home page is not displayed");
        LOGGER.info("home page is displayed");
        PerformanceMenuPage.ClickPerformanceBtn();
        LOGGER.info("click the performance button");
        softAssert.assertTrue( PerformanceMenuPage.isPerformanceDisplayed(),"Performance page is not Displayed");
        LOGGER.info("perfomance is displayed");
        softAssert.assertAll();
    }
    @Test(groups="REGRESSION",priority = 2)
    //verify AddKPIs page Displayed
    public  void verifyKPIsTest(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Logo is not displyed ");
        LoginPage.setusername(com.sgic.automation.Utils.Constants.LOGIN_USER_NAME);
        LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        LoginPage.clickSubmit();
        softAssert.assertTrue(LoginPage.MarkplaceDisply(),"Markrtplace  is not dispalyed");
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home page is not displayed");
        PerformanceMenuPage.ClickPerformanceBtn();
        softAssert.assertTrue( PerformanceMenuPage.isPerformanceDisplayed(),"Performance page is not Displayed");
        PerformanceMenuPage.ClickConfigureBtn();
        PerformanceMenuPage.ClickKPIsBtn();
        KPIsAddPage.clickAddBtn();
        softAssert.assertTrue(KPIsAddPage.isKPIsAddPageDisplayed(),"KPIs Add Page is not Displayed");
        softAssert.assertAll();
    }
    @Test(groups="REGRESSION",priority = 3)
    //verify AddKpis smoke test
    public  void verifyKPIsTest2(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Logo is not displyed ");
        LOGGER.info("login page is displayed");
        LoginPage.setusername(com.sgic.automation.Utils.Constants.LOGIN_USER_NAME);
        LOGGER.info("set the user");
        LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        LOGGER.info("set the password");
        LoginPage.clickSubmit();
        LOGGER.info("click the submit");
        softAssert.assertTrue(LoginPage.MarkplaceDisply(),"Markrtplace  is not dispalyed");
        LOGGER.info("display the MarketplaceDisplay");
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home page is not displayed");
        LOGGER.info("Homepage is Displayed");
        PerformanceMenuPage.ClickPerformanceBtn();
        LOGGER.info("click the performance button");
        softAssert.assertTrue( PerformanceMenuPage.isPerformanceDisplayed(),"Performance page is not Displayed");
        LOGGER.info("performance is displayed");
        PerformanceMenuPage.ClickConfigureBtn();
        LOGGER.info("click the configure");
        PerformanceMenuPage.ClickKPIsBtn();
        LOGGER.info("click the ClickKPIsBtn");
        KPIsAddPage.clickAddBtn();
        LOGGER.info("click add button");
        softAssert.assertTrue(KPIsAddPage.isKPIsAddPageDisplayed(),"KPIs Add Page is not Displayed");
        LOGGER.info("addpage is displayed");
        KPIsAddPage.setJobTitle(Constants.JOBTITLE);
        LOGGER.info("set the JobTitle");
        KPIsAddPage.setKeyPerformanceIndicator(Constants.INDICATOR);
        LOGGER.info("set the keyperformanceIndictor");
        KPIsAddPage.setMinimumRating(Constants.MinimumRating);
        LOGGER.info("setminimum rating");
        KPIsAddPage.setMaximumRating(Constants.MaximumRating);
        LOGGER.info("setMaximumRating");
        KPIsAddPage.clickMakeScale();
        LOGGER.info("click the makeScale");
        KPIsAddPage.clickSaveBtn();
        LOGGER.info("click the save btn");
        softAssert.assertTrue(KPIsAddPage.isKPIsSearchDisplyed(),"KPIsSearch is not Displayed");
        LOGGER.info("Kpi search is displayed");
        softAssert.assertAll();

    }


}
