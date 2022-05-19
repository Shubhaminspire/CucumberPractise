package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    public WebDriver driver;

    public WebDriver driverManager() {
        if(driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            driver.manage().window().maximize();
        }


        return driver;
    }

}
