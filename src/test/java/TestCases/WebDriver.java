package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class WebDriver {
    public static void main (String args[]) {
        @BeforeMethod
        public void setUp () {
            //Browser driver exe
            System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
            //Create Chrome instance
            WebDriver driver = new ChromeDriver();
            //Open application
            driver.get("https://www.rokomari.com/my-section/orders");
        }
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}