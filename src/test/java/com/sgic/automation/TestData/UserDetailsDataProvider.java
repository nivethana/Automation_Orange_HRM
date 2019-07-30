package com.sgic.automation.TestData;


import com.sgic.automation.Utils.Constants;
import org.testng.annotations.DataProvider;

/**
 * UserDetailsDataProvider.java - To Manage User related Data Set
 * Created by SrirankanK on 10/3/2018.
 */
public class UserDetailsDataProvider {

    @DataProvider
    public static Object[][] MultipleUserDetails() {
        return new Object[][]{
                {"", "",Constants.LOGIN_INVALID_MSG},
                {"John", "John123",Constants.LOGIN_INVALID_MSG2},
                {"Siva", "Siva456",Constants.LOGIN_INVALID_MSG2},
                {Constants.LOGIN_USER_NAME, "rfffggg",Constants.LOGIN_INVALID_MSG2},
                { "rfffggg",Constants.LOGIN_PASSWORD, Constants.LOGIN_INVALID_MSG2},
                {Constants.LOGIN_USER_NAME, "",Constants.LOGIN_INVALID_MSG3},
                { "",Constants.LOGIN_PASSWORD, Constants.LOGIN_INVALID_MSG4},




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
