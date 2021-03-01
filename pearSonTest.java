package toSrilaxmi;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class pearSonTest {
  @Test
  public void f() throws InterruptedException, AWTException {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\veena\\Documents\\testingSDET9\\try1\\driver\\geckodriver.exe");					
		WebDriver driver = new FirefoxDriver();
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MICROSECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("http://www.pearson.com");
		driver.findElement(By.id("search-box-input")).sendKeys("c programming text book");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='search-box-icon']")).click();
		Thread.sleep(500);
		/*clicking on Next button */
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Next")));
		WebElement Ne=driver.findElement(By.xpath("//div/div[2]/div[2]/div[1]/ul/li[7]/a"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();", Ne);
		 Ne.click();
		Thread.sleep(500);
		/*clicking on Previous button */
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Previous")));
	 WebElement prv=	driver.findElement(By.xpath("//div/div[2]/div[2]/div[1]/ul/li[1]"));
	 js.executeScript("arguments[0].scrollIntoView();", prv);
	 prv.click();
	 
	 /*clicking on article 3 */
	 int article_no  = 4;
	 Thread.sleep(500);
	 Thread.sleep(500);
	 driver.findElement(By.xpath("//section/div/div[2]/div[2]/div[1]/article['+article_no+']/a")).click();
	
	 /* closing the application */
		driver.close();
  }
}
