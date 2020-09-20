package PagePackages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJetHomePage {
	
	By SignIn = By.xpath("//a[@id='ctl00_HyperLinkLogin']");
	By SpiceClubMember = By.xpath("//a[contains(text(),'SpiceClub Members')]");
	By SignUp = By.xpath("//a[contains(text(),'Sign up')]");
	By departureCity = By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']");
	By selectedDepartureCity = By.cssSelector("a[value='AMD']");
	By arrivalCity = By.xpath("//input[@name='ctl00_mainContent_ddl_destinationStation1_CTXT']");
	By selectedArrivalCity = By.xpath("(//a[@value='GWL'])[2]");
	By departureDatePicker = By.className("ui-datepicker-trigger");
	By selectedDepartureDate = By.xpath("//div[@id='ui-datepicker-div']/div[2]/table/tbody/tr[5]/td[1]/a");
	By passengers = By.id("divpaxinfo");
	By passengersAdultDropBox = By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']");
	By PassengersCount = By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']//option[contains(text(),'4')]");
	By Search = By.xpath("//span[@class='btn-find-flight-home'] //input[@value='Search']");
	
	WebDriver driver;
	public SpiceJetHomePage(WebDriver webdriver) {
		
		driver = webdriver;
		
	}
	
	public ClubRegistrationPage ClickOnSignUp() {
		Actions action = new Actions(driver); 
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SignIn));

		action.moveToElement(driver.findElement(SignIn)).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(SpiceClubMember));
	
		action.moveToElement(driver.findElement(SpiceClubMember)).perform();
		
		driver.findElement(SignUp).click();
		
		ClubRegistrationPage RegistrationPage = new ClubRegistrationPage(driver);
		return RegistrationPage;
				
	}
	
	public void selectDepartureCity() {
		driver.findElement(departureCity).click();
		driver.findElement(selectedDepartureCity).click();
	}
	
	public void selectArrivalCity() {
		driver.findElement(arrivalCity).click();
		driver.findElement(selectedArrivalCity).click();
	}
	
	public void selectDepartureDate() {
		driver.findElement(selectedDepartureDate).click();	
		
		}
	     
	public void NumberOfPassangers() {
		driver.findElement(passengers).click();
		driver.findElement(passengersAdultDropBox).click();
		driver.findElement(PassengersCount).click();		
	    }
	
	public SearchResultPage ClickOnSearch() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Search));
		driver.findElement(Search).click();
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		return searchResultPage;
	}

	
}
