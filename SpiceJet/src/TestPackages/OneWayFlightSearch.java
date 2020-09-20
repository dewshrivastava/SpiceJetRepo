package TestPackages;



import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PagePackages.SearchResultPage;
import PagePackages.SpiceJetHomePage;

public class OneWayFlightSearch {
	
			
	@Test
	public void SearchForOneWayFlight(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketanpc\\OneDrive\\Documents\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		SpiceJetHomePage oneWaySearch = new SpiceJetHomePage(driver);
		oneWaySearch.selectDepartureCity();
		oneWaySearch.selectArrivalCity(); 
		oneWaySearch.selectDepartureDate();
		oneWaySearch.NumberOfPassangers();
		SearchResultPage searchResultPage = oneWaySearch.ClickOnSearch();
		searchResultPage.isSearchPageLoaded();
		Assert.assertTrue(searchResultPage.isSearchPageLoaded());
		driver.quit();
		
	} 
	
}

