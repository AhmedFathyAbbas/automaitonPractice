package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import Pages.HomePage;

import java.io.IOException;
import java.util.Iterator;

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
