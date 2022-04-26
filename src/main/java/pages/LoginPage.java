package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page for interface displayed after click login button on main menu
 */
public class LoginPage extends BasePage{

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

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public boolean isLoginInterfaceVisible(){
        return loginContainer.isDisplayed();
    }

    public void setTextBox(WebElement element, String keyToSend){
        if (isLoginInterfaceVisible()){
            waitElementVisibility(element);
            element.click();
            element.sendKeys(keyToSend);
        }
    }

    public void clickLoginButton(){
        loginButtonLoginContainer.click();
    }

    public SignUpPage signUp() {
        signUpLink.click();
        return new SignUpPage(getDriver());
    }
}
