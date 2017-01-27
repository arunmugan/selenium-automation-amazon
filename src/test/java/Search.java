import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Search {

    @Test
    public void TestSelenium(){

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement searchBox=driver.findElement(By.cssSelector(("#twotabsearchtextbox")));
        searchBox.sendKeys("Book");
        WebElement searchButton=driver.findElement(By.cssSelector((".nav-search-submit")));
        searchButton.click();
        driver.quit();
        
    }
}
