import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    public void Register(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        WebElement accountLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountLink.click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Andrei");
        driver.findElement(By.id("lastname")).sendKeys("Nica");
        driver.findElement(By.id("email_address")).sendKeys("andreiselenium@gmai.com");
        driver.findElement(By.id("password")).sendKeys("Wethepeople_2011");
        driver.findElement(By.id("confirmation")).sendKeys("Wethepeople_2011");
        WebElement newsLink = driver.findElement(By.cssSelector("#is_subscribed"));
        newsLink.click();




        driver.close();
    }

}
