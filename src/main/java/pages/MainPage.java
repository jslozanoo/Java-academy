package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    @FindBy(id = "global-user-trigger")
    private WebElement dropdownMainMenu;

    @FindBy(css = ".global-user[style]")
    private WebElement dropdownMainMenuContainer; //To find this, the container must be displayed

    @FindBy(css = ".global-user[style] div ul:first-child li:first-child")
    private WebElement dropdownMainMenuTitle;

    @FindBy(css = ".global-user[style] a[data-regformid]")
    private WebElement dropdownMainMenuLoginButton;

    public MainPage(WebDriver driver){
        super(driver);
    }

}
