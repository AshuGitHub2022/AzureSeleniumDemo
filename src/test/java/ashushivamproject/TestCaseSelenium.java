package ashushivamproject;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseSelenium {
	
	@Test
	
	public void LoginTest()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		WebElement Signin = driver.findElement(By.cssSelector("span[class='nav-line-2 ']"));
		act.moveToElement(Signin).click().perform();
		//driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][text()='Sign in']")).click();
		
		WebElement Username = driver.findElement(By.cssSelector("#ap_email"));
		Username.sendKeys("ashushivam007@gmail.com");
		
		driver.findElement(By.xpath("//span[@id='continue']")).click();
		
		WebElement Password = driver.findElement(By.cssSelector("#ap_password"));
		
		Password.sendKeys("ashuamazon");
		
		driver.findElement(By.cssSelector("#signInSubmit")).click();
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
		
		
		driver.close();
		
		
	}

	
}
