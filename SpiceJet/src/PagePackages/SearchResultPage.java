package PagePackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {
	
	By modifyButton = By.className("trip-modify-btn");
	
	WebDriver driver;
	
	public SearchResultPage(WebDriver webdriver) {
		driver = webdriver;
	}
	
	public boolean isSearchPageLoaded() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(modifyButton));
		return true;
		
	}

}
