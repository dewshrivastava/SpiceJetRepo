package TestPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PagePackages.ClubRegistrationPage;
import PagePackages.SpiceJetHomePage;

public class RegistrationTest {
	
	@Test
	public void spiceClubMembershipRegistration() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ketanpc\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");		
		SpiceJetHomePage HomePage = new SpiceJetHomePage(driver);
		ClubRegistrationPage RegistrationPage = HomePage.ClickOnSignUp();
		RegistrationPage.selectTitle();
		RegistrationPage.provideFirstName("peter");
		RegistrationPage.provideLastName("parker");
		RegistrationPage.provideMobileNumber(1234581257);
		RegistrationPage.providePassword("peter@1parker");
		RegistrationPage.provideConfirmPassword("peter@1parker");
		RegistrationPage.selectDateOfBirth();
		RegistrationPage.provideEmailAddress("peterparker5@gmail.com");
		RegistrationPage.checkBoXCheck();
		RegistrationPage.clickOnSubmit();
		String text = RegistrationPage.submission();
		Assert.assertEquals(text,"Enter one time password (OTP)");
		driver.quit();
				
	}

}
