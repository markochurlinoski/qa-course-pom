package tests;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.*;
//import pages.RegistrationPage;

public class Account {
	public static WebDriver driver;
	RegistrationPage objRegistration;
	AuthenticationPage objAuthentication;
	
	@Before
    public void setUp()
    {   
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objRegistration = PageFactory.initElements(driver, pages.RegistrationPage.class);
		objAuthentication = PageFactory.initElements(driver, pages.AuthenticationPage.class);
		driver.get("http://automationpractice.com/");
    }
	
	@After
    public void tearDown(){
    	driver.close();
    }
	
	
//	REGISTER NEW ACCOUNT
    @Test
    public void registerNewAccount() throws Exception {
		objRegistration.clickSignInLink();
		objAuthentication.setEmailAddress1TextField("test@cashcjashc.icasjhcuashu");
		objAuthentication.clickCreateAnAccountButton();
		objRegistration.setMrRadioButtonField(); 
		objRegistration.setFirstName1TextField("Test");
		objRegistration.setLastName1TextField("Testovski");
		objRegistration.setPasswordPasswordField("Testing123");
		objRegistration.setDateOfBirth1DropDownListField("15  ");
		objRegistration.setDateOfBirth2DropDownListField("February ");
		objRegistration.setDateOfBirth3DropDownListField("1990 ");
		objRegistration.setAddressTextField("Ul BUl Test Testovski 15");
		objRegistration.setCityTextField("Prilep");
		objRegistration.setStateDropDownListField("Alabama");
		objRegistration.setZippostalCodeTextField("11930");
		objRegistration.setMobilePhoneTextField("123456789");
		objRegistration.clickRegisterButton();
    	Thread.sleep(15000);
    }
    
//    LOGIN INTO EXISTING ACCOUNT
    
    
}
