package cucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/searchProduct.feature",glue ={"cucumber"} ,
        monochrome = true)

public class SearchProductRunner {
}
