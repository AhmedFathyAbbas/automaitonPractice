package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage extends BasePage{

    public HomePage ( WebDriver driver ) {
        super(driver);
    }
    private By registerLink = By.xpath ( "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a" );
    private  By loginLink = By.className("ico-login");
    private By booksLink = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a");
    private  By shoppingCartLink =By.className("cart-label");
    private By myAccountInfo = By.linkText ( "My account" );
    private By logoutLink = By.xpath ( "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a" );

    public void clickOnRegisterLink(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),registerLink );
        basePageDriver.findElement(registerLink).click();
    }
    public void clickOnLoginLink(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),loginLink );
        basePageDriver.findElement(loginLink).click();
    }
    public void clickOnBooksLink(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),booksLink );
        basePageDriver.findElement(booksLink).click();
    }
    public void clickOnShoppingCartLink(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),shoppingCartLink );
        basePageDriver.findElement(shoppingCartLink).click();
    }

    public void clickOnLogoutLink(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),logoutLink );
        basePageDriver.findElement ( logoutLink).click ();

    }
}
