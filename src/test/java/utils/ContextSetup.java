package utils;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pageobjects.PageObjectManager;

public class ContextSetup {
   public WebDriver driver;
   public String searchPageText;
   public String offersPageText;
   public PageObjectManager pageObjectManager;
   public TestBase testBase;
   public TestEntity testEntity;

   public ContextSetup(){
      testBase = new TestBase();
      pageObjectManager = new PageObjectManager(testBase.driverManager());
      testEntity = new TestEntity(testBase.driverManager());
   }

}
