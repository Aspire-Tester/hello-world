package chapter3_9_1.chapter3_9_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {
	private WebDriver driver;
	private String baseUrl;
	
	public Google(WebDriver driver) {
		this.driver = driver;
		baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
		System.out.println(driver.getTitle());
		if (!driver.getTitle().equals("Google")) {
			throw new WrongPageException("Incorrect Page for Google");
		}
	}

	public GoogleSearchPage goToSearchPage() {
		System.out.println(driver.findElement(By.name("q")).getTagName());
		driver.findElement(By.name("q")).sendKeys("Mastering Selenium Testing Tools");
		driver.findElement(By.className("lsb")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("ab_options")));
		return new GoogleSearchPage(driver);
	}
	
}
