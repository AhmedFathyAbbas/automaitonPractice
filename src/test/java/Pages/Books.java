package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Books extends BasePage{
    public Books ( WebDriver driver ) {
        super(driver);
    }
    private By sortByFilter = By.xpath("//*[@id=\"products-orderby\"]");
    private By chooseSecondItem = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]");
    public void filterByPrice(){
        waitElements ( basePageDriver, Duration.ofSeconds ( 20 ),sortByFilter );
        Select filterByLowPrice = new Select(basePageDriver.findElement(sortByFilter));
        filterByLowPrice.selectByIndex (3);
    }
    public void addSecondItemToCart() throws InterruptedException {
        try {
            Thread.sleep ( 1000 );
        } catch (InterruptedException e) {
            throw new RuntimeException ( e );
        }
        basePageDriver.findElement(chooseSecondItem).click();
    }


}
