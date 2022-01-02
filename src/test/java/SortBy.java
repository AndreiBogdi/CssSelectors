import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortBy {

    public void SortTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        WebElement vipLink = driver.findElement(By.cssSelector("li.level0:nth-child(6) > a:nth-child(1)"));
        vipLink.click();
        driver.findElement(By.cssSelector(".category-products > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".category-products > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select:nth-child(2) > option:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".category-products > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select:nth-child(2) > option:nth-child(3)")).click();


        driver.close();
    }
}
