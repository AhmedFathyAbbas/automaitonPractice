package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       // BasePage x = new BasePage();
        driver.get("https://demo.nopcommerce.com/");
//        JavascriptExecutor java = (JavascriptExecutor) driver;
//        java.executeScript("scroll(0,400)");
        driver.findElement(By.className("ico-login")).click();

    }
}