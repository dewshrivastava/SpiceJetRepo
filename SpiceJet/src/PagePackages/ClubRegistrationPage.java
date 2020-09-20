package PagePackages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClubRegistrationPage{
	
	By title = By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle");
    By titleValue = By.cssSelector("option[value='MR']");
    By firstName = By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName");
    By lastName = By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName");
    By mobileNumber = By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER");
    By password = By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword");
    By confirmedPassword = By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm");
    By dateOfBirth = By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINPUTDOB");
	By selectedDOY = By.xpath("//span[contains(text(),'1997')]");
	By selectDOM = By.xpath("//tbody[@class='datepickerMonths']/tr[1]/td[2]/a");
	By selectDate = By.xpath("//tbody[@class='datepickerDays']/tr[2]/td[3]/a");
    By emailAddress = By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail");
    By agreeCheckBox = By.id("chkSpiceClubTnC");
    By submitButton = By.id("CONTROLGROUPREGISTERVIEW_ButtonSubmit");
    By submissiontext = By.xpath("//label[contains(text(),'Enter one time password (OTP)')]");
    
    WebDriver driver;
    public ClubRegistrationPage (WebDriver webdriver) {
    	driver = webdriver;
    	
    }
    
    public void waitPageLoad() {
    	WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(title));
		
    }
  
    
    public void selectTitle(){
    	driver.findElement(title).click();
    	Select select = new Select(driver.findElement(title));
    	select.selectByIndex(1);    	
    }
    
    public void provideFirstName(String firstname){
    	driver.findElement(firstName).sendKeys(firstname);
    }
     
    public void provideLastName(String lastname){
    	driver.findElement(lastName).sendKeys(lastname);    	
    }
    
    public void provideMobileNumber(int mobilenumber) {
    	driver.findElement(mobileNumber).sendKeys(String.valueOf(mobilenumber));
    }
    
    public void providePassword(String password1) {
    	driver.findElement(password).sendKeys(password1);
    }
    
    public void provideConfirmPassword(String confirmpassword) {
    	driver.findElement(confirmedPassword).sendKeys(confirmpassword);
    }
    
    public void selectDateOfBirth() {
    	WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(dateOfBirth));
    	driver.findElement(dateOfBirth).click();
    	driver.findElement(selectedDOY).click();
    	driver.findElement(selectDOM).click();
    	driver.findElement(selectDate).click();    	
    }
    
    public void provideEmailAddress(String emailaddress) {
    	driver.findElement(emailAddress).sendKeys(emailaddress);
    }
    
    public void checkBoXCheck() {
    	driver.findElement(agreeCheckBox).click();;
    }
    
    public void clickOnSubmit() {
    	driver.findElement(submitButton).click();
    }
    
    public String submission() {
    	String text = driver.findElement(submissiontext).getText();
    	return text;
    }
}
