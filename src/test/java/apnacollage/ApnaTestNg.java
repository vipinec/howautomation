package apnacollage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;

public class ApnaTestNg {

	WebDriver driver;

	@Test
	public void doney() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://google.com");

		driver.quit();

	}

}
