package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
@Test(dataProvider = "testData")

public class RegisterPage extends BasePage {

    public RegisterPage ( WebDriver driver ) {
        super ( driver );
    }

    private By gender = By.id ( "gender-male" );
    private By firstName = By.id ( "FirstName" );
    private By lastName = By.id ( "LastName" );
    private By day = By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]" );
    private By month = By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]" );
    private By year = By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]" );
    private By emailfiled = By.id ( "Email" );
    private By companyName = By.id ( "Company" );
    private By newsLetter = By.id ( "Newsletter" );
    private By passwordFiled = By.id ( "Password" );
    private By confirmPassword = By.id ( "ConfirmPassword" );
    private By registerBtn = By.id ( "register-button" );
    private By resultOfRegistration = By.className ( "result" );
    private By continueBtn = By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a" );

    public void chooseYourGender ( ) {
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),gender );
        basePageDriver.findElement ( gender ).click ( );
    }

    public void enterFirstName () {
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),firstName );
        basePageDriver.findElement ( firstName ).sendKeys ( "ali");
    }

    public void enterLastName () {
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),lastName );
        basePageDriver.findElement ( lastName ).sendKeys ( "bahgat");
    }

    public void selectDay ( ) {
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),day );
        Select chooseDay = new Select ( basePageDriver.findElement ( day ) );
        chooseDay.selectByValue ("15");
    }

    public void selectMonth ( ) {
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),month );
        Select chooseMonth = new Select ( basePageDriver.findElement ( month ) );
        chooseMonth.selectByIndex ( 7 );
    }

    public void selectyear () {
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),year );
        Select chooseYear = new Select ( basePageDriver.findElement ( year ) );
        chooseYear.selectByValue ("1998" );
    }

    public void enterEmail () {
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),emailfiled );
        basePageDriver.findElement ( emailfiled ).sendKeys ("aliBahgat@gmail.com");
    }

    public void enterCompanyName () {
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),companyName );
        basePageDriver.findElement ( companyName ).sendKeys ( "company" );
    }

    public void uncheckNewsletter ( ) {
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),newsLetter );
        basePageDriver.findElement ( newsLetter ).click ( );
    }

    public void enterPassword () {
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),passwordFiled );

        basePageDriver.findElement ( passwordFiled ).sendKeys (  "alidondaly");
    }

    public void confirmPassword () {
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),confirmPassword );
        basePageDriver.findElement ( confirmPassword ).sendKeys ( "alidondaly");
    }

    public void clickOnRegister ( ) {
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),registerBtn );
        basePageDriver.findElement ( registerBtn ).click ( );
    }


}
