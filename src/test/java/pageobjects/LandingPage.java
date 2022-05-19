package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage {
public WebDriver driver;

public WebDriverWait wait;


public LandingPage(WebDriver driver){
    this.driver = driver;
}


    public By searchField = By.cssSelector("input[type='search']");
    public By getProductName = By.xpath("//h4[contains(text(),'Tomato')]");

    public By topDeals = By.linkText("Top Deals");


    public void searchItem(String product){
        driver.findElement(searchField).sendKeys(product);
    }

    public String getProductName(){
        WebElement tomato_item = driver.findElement(getProductName);
        wait  = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(tomato_item));
        return  tomato_item.getText();
    }

    public void navigateToTopDeals(){
        driver.findElement(topDeals).click();
    }
}
