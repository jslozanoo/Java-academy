package pages;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page to create an account
 */
public class SignupPage extends BasePage {
    @FindBy(name = "firstName")
    private WebElement firstNameField;
    @FindBy(name = "lastName")
    private WebElement lastNameField;
    @FindBy(name = "email")
    private WebElement emailField;
    @FindBy(name = "newPassword")
    private WebElement passwordField;
    @FindBy(css = ".btn.btn")
    private WebElement signupButton;

    public SignupPage(WebDriver driver){
        super(driver);
    }

}
