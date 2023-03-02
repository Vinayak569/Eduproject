package Bankingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	 private WebDriver driver;
	 JavascriptExecutor js;
	 @BeforeClass
	 
	 public void setup() {
		 WebDriverManager.chromedriver().setup();
		 
	 driver = new ChromeDriver();
	 js = (JavascriptExecutor) driver; 
}
@Test

public void Login() throws InterruptedException {
driver.get("https://demo.guru99.com/V4/index.php");
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.cssSelector("input[name='uid']")).sendKeys("mngr480122");
	 
	 driver.findElement(By.cssSelector("input[name='password']")).sendKeys("yvehAjE");
	 
	 driver.findElement(By.cssSelector("input[value='LOGIN']")).click();

}


@AfterClass
public void tearDown() {
	 
driver.quit();

}

}