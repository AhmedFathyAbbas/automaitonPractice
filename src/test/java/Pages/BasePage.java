package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver basePageDriver;
    BasePage(WebDriver driver){
        basePageDriver = driver;
    }

    public void waitElements( WebDriver driver , Duration time , By elementName){
        WebDriverWait wait = new WebDriverWait(driver ,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementName));
    }
}
