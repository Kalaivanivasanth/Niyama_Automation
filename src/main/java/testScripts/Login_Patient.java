package testScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Login_Patient extends CommonFunctions{
	

	@Test(priority = 1)
	public void login_patient() throws IOException {

		test.log(LogStatus.INFO, "Login testcase is started");

		FileInputStream stream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(stream);


		String Email_ID = properties.getProperty("EMAIL");
		String Password = properties.getProperty("PASSWORD");

		
		driver.findElement(By.xpath(EmailIdMobile_Field)).sendKeys(Email_ID);
		driver.findElement(By.xpath(Login_Continue_Button)).click();
		driver.findElement(By.xpath(LoginWithPassword_Button)).click();
		driver.findElement(By.id(Password_Button)).sendKeys(Password);
		driver.findElement(By.xpath(Login_Button)).click();

		test.log(LogStatus.PASS, "Login Testcase passed");
	}
}

