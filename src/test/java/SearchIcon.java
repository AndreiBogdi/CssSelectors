import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchIcon {

    public void SearchIcon(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        WebElement searchLink = driver.findElement(By.cssSelector(".search-button"));
        searchLink.click();
        driver.findElement(By.id("search")).sendKeys("Khaki Bowery Chino Pants");
        driver.findElement(By.cssSelector(".search-button")).click();

       driver.close();
    }


}
