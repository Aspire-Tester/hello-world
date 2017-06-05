package chapter3_9_1.chapter3_9_1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchGoogleTest {
	private WebDriver driver;
	private Google googlePage;
	private GoogleSearchPage searchPage;
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/ellobo/Downloads/geckodriver 2");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void searchGoogleTest() throws Exception {
		googlePage = new Google(driver);
		searchPage = googlePage.goToSearchPage();
		searchPage.getNumberOfResults();
		
	}
}
