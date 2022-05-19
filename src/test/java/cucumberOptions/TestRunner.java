package cucumberOptions;


import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/login.feature",tags = "not(@Functional or @Regression)",
        glue = {"cucumber"},plugin = {"pretty","html:target/index.html",
         "json:target/cucumber.json",
          "junit:target/cucumber.xml"}
)

public class TestRunner {


}
