package AnanayMahajan.TestComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import AnanayMahajan.PageObjects.Page;


public class BaseTest {

	public WebDriver driver;
	public Page objPage;
	
	
	
	public WebDriver initialization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	@BeforeMethod
	public Page launchapplication() {
		driver = initialization();
		objPage = new Page(driver);
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/selenium-playground/table-sort-search-demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return objPage;
	}
}
