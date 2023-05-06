package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SuccsesPage extends BasePage{
    public SuccsesPage ( WebDriver driver ) {
        super(driver);
    }
    private By succsessMsg = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong");
    public String getSuccessMsg(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),succsessMsg );

        return basePageDriver.findElement(succsessMsg).getText();
    }
}
