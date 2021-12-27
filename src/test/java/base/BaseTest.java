package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //driver.manage().window().maximize();

        //List<WebElement> links = driver.findElements(By.tagName("a"));
        //System.out.println(links.size());

        WebElement inputLinks = driver.findElement(By.linkText("Shifting Content"));
        inputLinks.click();

        WebElement inputLink2 =  driver.findElement(By.linkText("Example 1: Menu Element"));
        inputLink2.click();

        List<WebElement> links2 = driver.findElements(By.tagName("li"));
        System.out.println(links2.size());


        System.out.println(driver.getTitle());
//        driver.quit();
    }

    public static void main(String[] args) {
        BaseTest test = new BaseTest();
        test.setUp();

    }

}
