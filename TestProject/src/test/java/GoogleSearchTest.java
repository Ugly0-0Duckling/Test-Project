import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\TestJavaProject\\Test-Project\\TestProject\\chromedriver.exe");
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Hello world!", Keys.ENTER);
        Thread.sleep(50000);
        System.out.println(driver.findElement(By.xpath("(//h3)[3]")).getText());
        Thread.sleep(3000);
        driver.quit();
    }
}