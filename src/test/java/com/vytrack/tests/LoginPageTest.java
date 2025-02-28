package com.vytrack.tests;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    @Test
    public void positiveLoginTest(){
        LoginPage loginPage = new LoginPage();

        //goto login page
        //enter username
        //enter password

        //click the login button
        String driver_username = ConfigurationReader.getProperty("driver_username");
        String driver_password = ConfigurationReader.getProperty("driver_password");
        loginPage.login(driver_username,driver_password);

        //verify page header
        //BrowserUtils.sleep(5);

        BrowserUtils.verifyTitle("Dashboard");

    }

}
