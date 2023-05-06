package TestCases;

import Pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import Pages.HomePage;

public class BaseTest {
    WebDriver baseTestDriver = new ChromeDriver (  );
    HomePage home = new HomePage (baseTestDriver);
    @BeforeClass
    public void openBrowser(){
        WebDriverManager.chromedriver ().setup ();
        baseTestDriver.get ( "https://demo.nopcommerce.com/" );
        baseTestDriver.manage ().window ().maximize ();
    }

    @AfterClass
    public void closeBrowser(){

       home.clickOnLogoutLink ();
       baseTestDriver.quit ();
    }



}
