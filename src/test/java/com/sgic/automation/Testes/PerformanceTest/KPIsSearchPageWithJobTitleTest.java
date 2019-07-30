package com.sgic.automation.Testes.PerformanceTest;

import com.sgic.automation.Pages.KPIsSearchPageWithJobTitle;
import com.sgic.automation.Pages.LoginPage;
import com.sgic.automation.Pages.PerformanceMenuPage;
import com.sgic.automation.Utils.Constants;
import com.sgic.automation.Utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class KPIsSearchPageWithJobTitleTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(KPIsSearchPageWithJobTitleTest.class);
    @Test(groups="REGRESSION",priority = 1)
    public void SmokeSearchKpisTest(){
        softAssert = new SoftAssert();

        PerformanceMenuPage.ClickPerformanceBtn();
        LOGGER.info("click the performance button");
        PerformanceMenuPage.ClickConfigureBtn();
        LOGGER.info("click the cofigure");
        PerformanceMenuPage.ClickKPIsBtn();
        LOGGER.info("click the Kpis");
        KPIsSearchPageWithJobTitle.getSelectedOption();
        LOGGER.info("get the option");
        KPIsSearchPageWithJobTitle.setDropDownOption(Constants.JOBTITLE1);
        LOGGER.info("set the dropdown");
        KPIsSearchPageWithJobTitle.ClickSearchBtn();
        LOGGER.info("click the search button");
        KPIsSearchPageWithJobTitle.getMessage();
        LOGGER.info("get the message");
        softAssert.assertAll();
    }

}
