package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTest {

	WebDriver driver = null;
	
	@Parameters ("browser")
	@BeforeClass
	public void browserInit(String browser1) {
		
		
		if (browser1.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Trainings\\Selenium\\Drivers\\chromedriver_win32_V2.33\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(true);
			
			driver = new ChromeDriver();
			
		}
		else if (browser1.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Trainings\\Selenium\\Drivers\\geckodriver-v0.19.0\\geckodriver.exe");
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"C:\\temp\\logs.txt");
			
			FirefoxOptions options = new FirefoxOptions();
			options.setHeadless(true);
			
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void TestCse1() {
	
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
	}
	
	@Test
	public void verifyTitle() {
		System.out.print("Verify Title Result:");
		Assert.assertEquals(driver.getTitle(), "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM");;
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
}
