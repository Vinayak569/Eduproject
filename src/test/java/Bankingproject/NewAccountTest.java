package Bankingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewAccountTest {
	 private WebDriver driver;
	 JavascriptExecutor js;
	 @BeforeClass
	 
	 public void setup() {
		 WebDriverManager.chromedriver().setup();
		 
	 driver = new ChromeDriver();
	 js = (JavascriptExecutor) driver; 
}
@Test

public void NewAccount() throws InterruptedException {
 driver.get("https://demo.guru99.com/V4/index.php");
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.cssSelector("input[name='uid']")).sendKeys("mngr480122");
	 
	 driver.findElement(By.cssSelector("input[name='password']")).sendKeys("yvehAjE");
	 
	 
     driver.findElement(By.cssSelector("input[value='LOGIN']")).click();

 	 driver.findElement(By.cssSelector("a[href='addAccount.php']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector("input[name='cusid']")).sendKeys("87084");
	 driver.findElement(By.cssSelector(" select[name='selaccount']")).click();
	 driver.findElement(By.cssSelector("input[name='inideposit']")).sendKeys("500");
	 driver.findElement(By.cssSelector("input[value='submit']")).click();
	 
	 WebElement ele = driver.findElement(By.xpath("//p[@class='heading3']"));
	 Assert.assertTrue(ele.isDisplayed());
	 Thread.sleep(3000);
	 
	 
	 
}

@AfterClass
public void tearDown() {
	 
driver.quit();

} 











}