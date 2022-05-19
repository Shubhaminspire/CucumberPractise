package stefDefinations;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ContextSetup;

public class OffersExist {

    ContextSetup contextSetup;

   public OffersExist(ContextSetup contextSetup){
        this.contextSetup = contextSetup;
    }

    @And("Validate if the product exists")
    public void validate_if_the_product_exists() {
        System.out.println("SearchPageText is: " + contextSetup.searchPageText + " and OffersPageText is: " + contextSetup.offersPageText);
        Assert.assertEquals(contextSetup.searchPageText, contextSetup.offersPageText);


    }
}
