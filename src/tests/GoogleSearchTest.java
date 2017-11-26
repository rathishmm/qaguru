package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;


public class GoogleSearchTest {
	
	WebDriver driver;
	String currentPath = System.getProperty("user.dir");
	
	@BeforeTest
	public void beforeTest(){
		System.setProperty("webdriver.chrome.driver", currentPath+"/resources/windows/chromedriver_2.33/chromedriver.exe");
	}
	
	@BeforeMethod
	public void setup(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	

	@Test
	public void GoogleSearch(){
		GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
		googleSearchPage.searchGoogle("india");

	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
