package com.sgic.automation.TestData;


import org.testng.annotations.DataProvider;

/**
 * UserDetailsDataProvider.java - To Manage User related Data Set
 * Created by SrirankanK on 10/3/2018.
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

   // @DataProvider
   // public static Object[][] MultipleUserDetailsMsg(){
      //  return new Object[][]{
             //   {"", "",Constants.LOGIN_INVALID_MSG},
          //      {"John", "John123",Constants.LOGIN_INVALID_MSG},
         //       {"Siva", "Siva456",Constants.LOGIN_INVALID_MSG},
           //     {Constants.LOGIN_USER_NAME,"errorPassword",Constants.LOGIN_INVALID_MSG1},
            //    {"errorUsername",Constants.LOGIN_PASSWORD,Constants.LOGIN_INVALID_MSG}

      //  };
    //}


}
