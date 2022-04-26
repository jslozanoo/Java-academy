package com.automation.web.tests;

import driver.Driver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class CreateAccountTest {
    @Test
    public void testCreateAccount(){
        Driver driver = new Driver("chrome");
        driver.getDriver().manage().window().maximize();
        driver.getDriver().get("https://www.espnqa.com/?src=com&_adblock=true&espn=cloud");
        HomePage homePage = new HomePage(driver.getDriver());
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setEmail("test-globant@gmail.com");
        loginPage.setPassword("142308Jslp");
        loginPage.clickLoginButton();


        // loginPage.setTextBox(loginPage.emailFieldLoginContainer, "test-globant@gmail.com");
        // loginPage.setTextBox(loginPage.passwordFieldLoginContainer, "142308Jslp");

    }
}
