package chapter3_9_1.chapter3_9_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	private WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
		System.out.println(driver.getTitle());
		if (!driver.getTitle().trim().contains("Mastering Selenium Testing Tools")) {
			throw new WrongPageException("Incorrect page for Google search");
		}
	}

	public String getNumberOfResults() {
		String numberOfResults = driver.findElement(By.id("resultStats")).getText().toString();
		System.out.println(numberOfResults);
		return numberOfResults;
	}

}
