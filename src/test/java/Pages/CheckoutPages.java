package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class CheckoutPages extends BasePage{
    public CheckoutPages ( WebDriver driver ) {
        super(driver);
    }
    private By firstName = By.xpath("//*[@id=\"BillingNewAddress_FirstName\"]");
    private By lastName = By.xpath("//*[@id=\"BillingNewAddress_LastName\"]");
    private By emailFiled = By.xpath("//*[@id=\"BillingNewAddress_Email\"]");
    private By companyName =By.xpath("//*[@id=\"BillingNewAddress_Company\"]");
    private By countryList = By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]");
    private By state = By.id ( "BillingNewAddress_CountryId" );
    private By city =By.xpath("//*[@id=\"BillingNewAddress_City\"]");
    private By address1 =By.xpath("//*[@id=\"BillingNewAddress_Address1\"]");
    private By address2 = By.xpath("//*[@id=\"BillingNewAddress_Address2\"]");
    private By postalCode =By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]");
    private By phoneNumber =By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]");
    private By faxNumber =By.xpath("//*[@id=\"BillingNewAddress_FaxNumber\"]");
    private By continueBtnForBilling = By.xpath ( "//*[@id=\"billing-buttons-container\"]/button[4]" );
    private By shippingOption = By.id ( "shippingoption_1" );
    private By continueForShipping = By.xpath ( "//*[@id=\"shipping-method-buttons-container\"]/button" );
    private By continueBtnForPayment = By.xpath ( "//*[@id=\"payment-method-buttons-container\"]/button" );
    private By continueForPaymentInfo = By.xpath ( "//*[@id=\"payment-info-buttons-container\"]/button" );

    private By confirmBtn = By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");

    public void selectCountry(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),countryList );
        Select chooseCountry = new Select(basePageDriver.findElement(countryList));
        chooseCountry.selectByIndex (1);
    }
    public void selectState(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),state );
        Select chooseState = new Select(basePageDriver.findElement(state));
        chooseState.selectByIndex ( 6 );
    }
    public void enterCity(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),city );
        basePageDriver.findElement(city).sendKeys("New York");
    }
    public void enterAddress1(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),address1 );
        basePageDriver.findElement(address1).sendKeys("street50");
    }
    public void enterAddress2(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),address2 );
        basePageDriver.findElement(address2).sendKeys("street1000");
    }
    public void enterPostalCode(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),postalCode );
        basePageDriver.findElement(postalCode).sendKeys("0666");
    }
    public void enterPhoneNumber(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),phoneNumber );
        basePageDriver.findElement(phoneNumber).sendKeys("01234567899");
    }
    public void enterFaxNumber(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),faxNumber );
        basePageDriver.findElement(faxNumber).sendKeys("222333");
    }

    public void clickOnShippingOption(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),shippingOption );
        basePageDriver.findElement ( shippingOption ).click ();
    }
    public void continueForShipping(){
        waitElements ( basePageDriver , Duration.ofSeconds ( 20 ) , continueForShipping );
        basePageDriver.findElement ( continueForShipping ).click ();
    }


    public void clickContinueForBilling(){
        waitElements ( basePageDriver , Duration.ofSeconds ( 20 ), continueBtnForBilling );
        basePageDriver.findElement ( continueBtnForBilling ).click ();
    }
    public void clickContinueForPayment(){
        waitElements ( basePageDriver , Duration.ofSeconds ( 20 ), continueBtnForPayment );
        basePageDriver.findElement ( continueBtnForPayment ).click ();
    }
    public void clickContinueForPaymentInfo(){
        waitElements ( basePageDriver , Duration.ofSeconds ( 20 ), continueForPaymentInfo );
        basePageDriver.findElement ( continueForPaymentInfo ).click ();
    }


    public void clickOnConfirmBtn(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),confirmBtn );
        basePageDriver.findElement(confirmBtn).click();
    }



}
