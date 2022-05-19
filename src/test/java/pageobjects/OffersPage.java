package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OffersPage {

    WebDriver driver;
    WebDriverWait wait;
    public By offersSearchField = By.xpath("//input[@id='search-field']");
    public By getProductName = By.xpath("//tbody/tr/td[1]");

    public OffersPage(WebDriver driver){
        this.driver = driver;
    }

    public void searchItem(String product){
        driver.findElement(offersSearchField).sendKeys(product);
    }

    public String getProductName(){
        WebElement tomato_item = driver.findElement(getProductName);
        wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(tomato_item));
        return  tomato_item.getText();
    }

}
