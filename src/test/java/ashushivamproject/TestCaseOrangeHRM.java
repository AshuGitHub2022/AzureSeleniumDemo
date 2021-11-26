package ashushivamproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseOrangeHRM {
	
	@Test
	public void loginOrangeHRM() {
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		WebElement Usrname = driver.findElement(By.id("txtUsername"));
		
		Usrname.sendKeys("admin");
		
		
		
		WebElement Password = driver.findElement(By.id("txtPassword"));
		Password.sendKeys("admin123");
		
		
		
		driver.findElement(By.cssSelector("#btnLogin")).click();
		
		
		
		Actions act = new Actions(driver);
		
		WebElement Admin =  driver.findElement(By.cssSelector("#menu_admin_viewAdminModule"));
		WebElement UsrMgmt =  driver.findElement(By.cssSelector("#menu_admin_UserManagement"));
		WebElement Usrs =  driver.findElement(By.cssSelector("#menu_admin_viewSystemUsers"));
		
		act.moveToElement(Admin).build().perform();
		act.moveToElement(UsrMgmt).build().perform();
		act.moveToElement(Usrs).click().build().perform();
		
		driver.close();
	}

}
