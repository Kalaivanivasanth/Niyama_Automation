package testScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Register_Self_B2C extends CommonFunctions{
	@Test(priority=0)
	public void register_self_B2C () throws InterruptedException, IOException {
		
		FileInputStream stream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(stream);


		String Register_Email_ID = properties.getProperty("EMAIL");
		String Register_Password = properties.getProperty("PASSWORD");
		String Patient_Name = properties.getProperty("PatientName");
		String Register_Mobile_Number = properties.getProperty("MobileNumber");
	
		driver.findElement(By.xpath(Signup)).click();
		driver.findElement(By.id(User_Type)).click();
		driver.findElement(By.xpath(UserType_SelfOption)).click();
		driver.findElement(By.id(Email_ID)).sendKeys(Register_Email_ID);
		driver.findElement(By.xpath(Email_SendOTP)).click();
		//Thread.sleep(10000);
		//driver.findElement(By.xpath(Email_VerifyOTP)).click();
		driver.findElement(By.id(Mobile)).sendKeys(Register_Mobile_Number);
		driver.findElement(By.xpath(Mobile_SendOTP)).click();
		
		//driver.findElement(By.xpath(Mobile_VerifyOTP)).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath(Register_Continue_Button)).click();
		driver.findElement(By.id(Name)).sendKeys(Patient_Name);
		driver.findElement(By.id(Set_Password)).sendKeys(Register_Password);
		driver.findElement(By.id(Confirm_Password)).sendKeys(Register_Password);
		driver.findElement(By.xpath(Date_Of_Birth)).click();
		driver.findElement(By.xpath(Year)).click();
		driver.findElement(By.xpath(Previous_YearIcon)).click();
		driver.findElement(By.xpath(Previous_YearIcon)).click();
		driver.findElement(By.xpath(Date_Of_Year)).click();
		driver.findElement(By.xpath(Date_Of_Month)).click();
		driver.findElement(By.xpath(Date_Of_Day)).click();
		driver.findElement(By.id(Gender)).click();
		driver.findElement(By.xpath(Gender_Female)).click();
		driver.findElement(By.id(Terms_Checkbox)).click();
		driver.findElement(By.xpath(Signup_Button)).click();
	}

}
