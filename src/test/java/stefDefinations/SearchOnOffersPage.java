package stefDefinations;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.LandingPage;
import pageobjects.OffersPage;
import pageobjects.PageObjectManager;
import utils.ContextSetup;

import java.util.Iterator;
import java.util.Set;

public class SearchOnOffersPage {
   PageObjectManager pageObjectManager;


    ContextSetup contextSetup;

    public SearchOnOffersPage(ContextSetup contextSetup){
        this.contextSetup = contextSetup;

    }

    @Then("User search with same shortname {string} in offers page")
    public void user_search_with_same_shortname_in_offers_page(String string1) throws InterruptedException {
       //new LandingPage(contextSetup.driver);
        //new OffersPage(contextSetup.driver);
        //pageObjectManager = new PageObjectManager(contextSetup.testBase.driver);
        LandingPage landingPage = contextSetup.pageObjectManager.getLandingPage();
        //contextSetup.pageObjectManager.getOffersPage();

        OffersPage offersPage = contextSetup.pageObjectManager.getOffersPage();
        landingPage.navigateToTopDeals();


        contextSetup.testEntity.switchToChild();
        offersPage.searchItem(string1);
        contextSetup.offersPageText = offersPage.getProductName().trim();

   //     contextSetup.driver.switchTo().window(parentWindow);

//        while (it.hasNext()) {
//            String childWindow = it.next();
//            if (!parentWindow.equalsIgnoreCase(childWindow)) {
//                contextSetup.driver.switchTo().window(childWindow);
//
//
//
//
//            }
//        }




    }
}
