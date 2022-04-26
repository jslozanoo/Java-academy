package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "did-ui-view")
    private WebElement loginContainer;

    @FindBy(css = "#did-ui-view input[type='email']")
    private WebElement emailFieldLoginContainer;

    @FindBy(css = "#did-ui-view input[type='password']")
    private WebElement passwordFieldLoginContainer;

    @FindBy(css = "#did-ui-view button")
    private WebElement loginButtonLoginContainer;

    @FindBy(css = "#did-ui-view div.block a")
    private WebElement needHelpText;

    @FindBy(css = "#did-ui-view a:last-of-type.btn")
    private WebElement signUpLink;

    public MainPage(WebDriver driver){
        super(driver);
    }
}
