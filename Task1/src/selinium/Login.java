package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Login {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
		}
	@Test
	public void use() throws InterruptedException {
		 driver.get("https://practicetestautomation.com/practice-test-login/");
         driver.findElement(By.name("username")).sendKeys("student");
         Thread.sleep(2000);

		 driver.findElement(By.name("password")).sendKeys("Password123");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("submit")).click();
		 Thread.sleep(2000);
		 
         
	     driver.quit();
	}
	
	

}
