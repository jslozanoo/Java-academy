package com.automation.web.tests;

import com.automation.web.data.User;
import driver.Driver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;

public class CreateAccountTest {
    @Test
    public void testLogin(){
        Driver driver = new Driver("chrome");
        driver.getDriver().manage().window().maximize();
        driver.getDriver().get("https://www.espnqa.com/?src=com&_adblock=true&espn=cloud");
        HomePage homePage = new HomePage(driver.getDriver());
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setEmail("test-globant@gmail.com");
        loginPage.setPassword("142308Jslp");
        loginPage.clickLoginButton();
        driver.getDriver().close();
        // Ok method
    }

    @Test
    public void testCreateAccount(){
        Driver driver = new Driver("chrome");
        driver.getDriver().manage().window().maximize();
        driver.getDriver().get("https://www.espnqa.com/?src=com&_adblock=true&espn=cloud");
        HomePage homePage = new HomePage(driver.getDriver());
        LoginPage loginPage = homePage.clickLoginButton(); // I'm in the iframe
        SignupPage signupPage = loginPage.clickSignupButton();
        User user = new User("sofia", "acosta", "sofiacosta@gmail.com",
                "sofi2008");
        signupPage.setFirstName(user.getFirstName() , user.getLastName(), user.getEmail(),
                user.getPassword());
        signupPage.clickSignUpButton();
        driver.getDriver().close();
    }
}
