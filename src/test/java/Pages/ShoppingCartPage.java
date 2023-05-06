package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ShoppingCartPage extends BasePage{
    public ShoppingCartPage ( WebDriver driver ) {
        super(driver);
    }
    private By acceptTerms = By.id("termsofservice");
    private By checkoutBtn = By.id("checkout");
    public void acceptTermsAndConditions(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),acceptTerms );
        basePageDriver.findElement(acceptTerms).click();
    }
    public void clickOnCheckout(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),checkoutBtn );
        basePageDriver.findElement(checkoutBtn).click();
    }
}
