package apnacollage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {

    WebDriver driver;

    @Test
    void chromesetup() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://fb.com");

        driver.quit();
        System.out.println("browser closed");
    }

}
