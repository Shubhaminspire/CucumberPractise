/*
package cucumber;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.ContextAware;
import utils.ContextSetup;
import utils.ObjectRepositories;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

*/
/**
 * Unit test for simple App.
 *//*

//
public class ValidLogin extends ObjectRepositories {
    static ContextSetup contextSetup;

    public ValidLogin(ContextSetup contextSetup) {
        ValidLogin.contextSetup = contextSetup;
    }

    @Given("When the Chrome Browser Setup")
    public void setUpBrowser() {
        WebDriverManager.chromedriver().setup();
        contextSetup.driver = new ChromeDriver();
        contextSetup.driver.manage().window().maximize();
        contextSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @Given("User is on Login Page")
    public void user_is_on_login_page() {

        contextSetup.driver.get("https://opensource-demo.orangehrmlive.com/");


    }

    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void provideValidCredentials(String usernames, String paswords) {
        contextSetup.driver.findElement(username).sendKeys(usernames);
        contextSetup.driver.findElement(password).sendKeys(paswords);


    }

    @And("Tap on Submit Button")
    public void clickSubmit() {

        contextSetup.driver.findElement(login_btn).click();
    }

    @Then("User login Successfully and navigate on Home Screen")
    public void successfullyLogin() {
        String expectedurl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        String currenturl = contextSetup.driver.getCurrentUrl();
        Assert.assertEquals(currenturl, expectedurl);

        contextSetup.wait = new WebDriverWait(contextSetup.driver, Duration.ofSeconds(10));
        WebElement dashboards = contextSetup.driver.findElement(dashboard);
        contextSetup.wait.until(ExpectedConditions.visibilityOf(dashboards));
        Boolean dashboardenable = dashboards.isEnabled();
        System.out.println(dashboardenable);


    }

    @When("User enters username and password")
    public void user_enters_username_and_password(DataTable dataTable) {
        List<List<String>> table = dataTable.cells();
        contextSetup.driver.findElement(username).sendKeys(table.get(0).get(0));
        contextSetup.driver.findElement(password).sendKeys(table.get(0).get(1));


    }

    @When("^User enters combinations \"(.*)\" and \"(.*)\"$")
    public void tryMultipleCombinations(String Username, String Passwords) {
        contextSetup.driver.findElement(username).sendKeys(Username);
        contextSetup.driver.findElement(password).sendKeys(Passwords);


    }

    @After

    public void closeBrowser() {

        try {
            contextSetup.driver.close();
            contextSetup.driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


}
*/
