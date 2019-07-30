package com.sgic.automation.TestData;


import com.sgic.automation.Utils.Constants;
import org.testng.annotations.DataProvider;

/**
 * UserDetailsDataProvider.java - To Manage User related Data Set
 *
 */
public class UserDetailsDataProvider {

    @DataProvider
    public static Object[][] MultipleUserDetails() {
        return new Object[][]{
        	    {"", ""},
        		{"John", "John123"},
                {"Siva", "Siva456"},
                //{Constants.LOGIN_USER_NAME,"errorPassword"},
                {"errorUsername","admin123"}
        };
    }

    @DataProvider
    public static Object[][] MultipleUserDetailsMsg(){
       return new Object[][]{

              // {"John", "Admin","sanath","Enabled",Constants.ADMIN_INVALID_SEARCH_MSG},
               {"test121", "ESS","first002 DR michellM","Enabled","test121"},
             //  {"John", "Admin","","Enabled"},
              // {"John", "","hema sree ch","Enabled"},

       };
    }


}
