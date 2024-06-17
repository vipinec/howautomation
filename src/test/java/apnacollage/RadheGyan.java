package apnacollage;

//public class RadheGyan {


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadheGyan {
 @Test
 public void test_google_search() {
  System.setProperty("webdriver.chrome.driver","/Users/vipinyadav/Downloads/drivers/chromedriver.exe");
  WebDriver browser = new ChromeDriver();
  browser.get("https://www.google.com");
  
  WebElement keywordInput = browser.findElement(By.xpath("//input[@name='q']"));
  keywordInput.sendKeys("selenium");
  keywordInput.sendKeys(System.lineSeparator());
  
  WebElement firstResult = browser.findElement(By.xpath("//a[contains(@href, 'www.selenium.dev')]"));
  firstResult.click();
  Assert.assertEquals(browser.getCurrentUrl(), "https://www.selenium.dev/");
 }
}


