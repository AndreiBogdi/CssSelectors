import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteProduct {
    public void DeleteProductFromCart(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        WebElement vipLink = driver.findElement(By.cssSelector("li.level0:nth-child(6) > a:nth-child(1)"));
        vipLink.click();
        driver.findElement(By.cssSelector("#product-collection-image-412")).click();
        driver.findElement(By.cssSelector("#swatch26 > span:nth-child(1) > img:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#swatch79 > span:nth-child(1)")).click();
        driver.findElement(By.cssSelector("button.btn-cart:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
        vipLink.click();
        WebElement saleLink = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a"));
        saleLink.click();
        driver.findElement(By.cssSelector("#product-collection-image-448")).click();
        driver.findElement(By.cssSelector("#links_20"));
        driver.findElement(By.cssSelector("button.btn-cart:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
        driver.findElement(By.cssSelector("tr.odd > td:nth-child(6) > a:nth-child(1)")).click();


        driver.close();
    }
}
