package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage ( WebDriver driver ) {
        super (driver);
    }

    private By emailFiled = By.id ("Email");
    private By passwordFiled = By.id ("Password");
    private By rememberMe = By.id ("RememberMe");
    private By loginBtn = By.xpath ("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");

    public void enterEmail () {

        basePageDriver.findElement (emailFiled).sendKeys ("ahmed.fathy1@gmail.com");
    }

    public void enterPassword () {

        basePageDriver.findElement (passwordFiled).sendKeys ("fathy1234567");
    }

    public void clickOnRememberMe () {
        basePageDriver.findElement (rememberMe).click ();
    }

    public void clickOnLoginBtn () {
        basePageDriver.findElement (loginBtn).click ();
    }

}
