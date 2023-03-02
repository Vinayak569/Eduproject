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
public class NewCustomerTest {
	 private WebDriver driver;
	 JavascriptExecutor js;
	 @BeforeClass
	 
	 public void setup() {
		 WebDriverManager.chromedriver().setup();
		 
	 driver = new ChromeDriver();
	 js = (JavascriptExecutor) driver; 
}
@Test

public void NewCustomer() throws InterruptedException {
 driver.get("https://demo.guru99.com/V4/index.php");
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.cssSelector("input[name='uid']")).sendKeys("mngr480122");
	 
	 driver.findElement(By.cssSelector("input[name='password']")).sendKeys("yvehAjE");
	 
	 driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
	 driver.findElement(By.cssSelector("a[href='addcustomerpage.php']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Abhi");
	 driver.findElement(By.cssSelector("tbody tr:nth-child(5) td:nth-child(2) input:nth-child(1)")).click();
	 driver.findElement(By.cssSelector("#dob")).sendKeys("29101997");
	 driver.findElement(By.cssSelector("textarea[name='addr']")).sendKeys("Navekhed");
	 driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Sangli");
	 driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Maharashtra");
	 driver.findElement(By.cssSelector("input[name='pinno']")).sendKeys("416313");
	 driver.findElement(By.cssSelector("input[name='telephoneno']")).sendKeys("8600617614");
	 driver.findElement(By.cssSelector("input[name='emailid']")).sendKeys("Abhi@123.com");
	 driver.findElement(By.cssSelector("input[name='password']")).sendKeys("yvehAjE");
	 driver.findElement(By.cssSelector("input[value='Submit']")).click();
	 WebElement ele = driver.findElement(By.xpath("//p[@class='heading3']"));
	 Assert.assertTrue(ele.isDisplayed());
	 Thread.sleep(3000);
}

@AfterClass
public void tearDown() {
	 
driver.quit();
}
	 
	 
	 
}