package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testfaacebookwithdependency {
	WebDriver driver;
  @Test
  public void openbrowser() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Drives1\\chromedriver.exe");
	    driver = new ChromeDriver(); // opens chrome(instiate object)
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);

	  
  }
  
  @Test(dependsOnMethods = {"openbrowser"})
  public void logintofacebook() {
	  driver.get("https://www.facebook.com");
	  driver.findElement(By.name("email")).sendKeys("komal19.gmail.com");
		driver.findElement(By.name("pass")).sendKeys("password");
		//driver.findElement(By.id("royal_login_button")).click();
		driver.findElement(By.name("login")).click();

	  
	  
  }
}
