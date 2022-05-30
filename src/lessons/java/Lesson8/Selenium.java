//First example of Chrome Selenium Test
package Lesson8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;



public class Selenium {
    public static void main(String[] args) {
//        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","C:/path/to/chromedriver.exe"); // מסלול לקובץ שקיבלתם לפני השיעור
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        String actualTitle = driver.getTitle();
        String expectedTitle="Google1";
        assertEquals("Google title",expectedTitle,actualTitle);
//        driver.quit();
    }

}
