package stefDefinations;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pageobjects.LandingPage;
import pageobjects.PageObjectManager;
import utils.ContextSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//Factory Design Pattern
public class ProductLandingPage {
    PageObjectManager pageObjectManager;

    ContextSetup contextSetup;
    LandingPage landingPage;

    public ProductLandingPage(ContextSetup contextSetup){

        this.contextSetup = contextSetup;
    }


    @Given("User is on the Greenkart Landing Page")
    public void landingGreenCartPage() {
    contextSetup.testBase.driverManager();


    }

    @When("User Search with shortname {string} and extract the actual name of product")
    public void searchAndExtractProductName(String string) throws InterruptedException {
       // new LandingPage(contextSetup.driver);
       // pageObjectManager = new PageObjectManager(contextSetup.testBase.driver);

        landingPage = contextSetup.pageObjectManager.getLandingPage();
        landingPage.searchItem(string);

        contextSetup.searchPageText = landingPage.getProductName().split("-")[0].trim();

        System.out.println(contextSetup.searchPageText);

    }


    @After
    public void closeBrow() {
       contextSetup.testBase.driver.quit();
    }

}
