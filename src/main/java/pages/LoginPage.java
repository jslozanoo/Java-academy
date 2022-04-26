package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page for interface displayed after click login button on main menu. It's in an iframe
 */
public class LoginPage extends BasePage{

    @FindBy(css = "form input[type='email']")
    private WebElement emailFieldLoginForm;

    @FindBy(css = "form input[type='password']")
    private WebElement passwordFieldLoginForm;

    @FindBy(css = "form button")
    private WebElement loginButtonLoginForm;

    @FindBy(css = "div.block a")
    private WebElement needHelpText;

    @FindBy(css = "a.btn")
    private WebElement signUpLink;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    /**
     * For sending keys to text input boxes
     * @param element
     * @param keyToSend
     */
    public void setTextBox(WebElement element, String keyToSend){
            waitElementVisibility(element);
            element.click();
            element.sendKeys(keyToSend);
    }

    /**
     * Click on login button
     * @return
     */
    public MainPage clickLoginButton(){
        loginButtonLoginForm.click();
        return new MainPage(getDriver());
    }

    /**
     * Click on sign up to create an account
     * @return
     */
    public SignUpPage signUp() {
        signUpLink.click();
        return new SignUpPage(getDriver());
    }
}
