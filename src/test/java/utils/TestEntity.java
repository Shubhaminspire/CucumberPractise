package utils;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class TestEntity {
   public WebDriver driver;


   public  TestEntity(WebDriver drivers){
       driver = drivers;
   }

    public void switchToChild(){
       String parentWindow = driver.getWindowHandle();
        Set<String> child = driver.getWindowHandles();
        Iterator<String> it = child.iterator();
        String parentClass= it.next();
        String childClass = it.next();

        driver.switchTo().window(childClass);
    }
}
