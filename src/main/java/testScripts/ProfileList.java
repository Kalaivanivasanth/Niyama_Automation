package testScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ProfileList extends CommonFunctions{
	
	@Test(priority=2)
	public void profileList() throws IOException {
		
		/*FileInputStream stream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(stream);
		
		String PatientName= properties.getProperty("PatientName");
		String PatientNameText1=driver.findElement(By.xpath(ProfileList_PatientName1)).getText();
		String PatientNameText2=driver.findElement(By.xpath(ProfileList_PatientName2)).getText();
		
		System.out.println(PatientNameText1);
		System.out.println(PatientNameText2);
		
		if(PatientName==PatientNameText1) {
		
			driver.findElement(By.xpath(Profile_Continue_Button1)).click();
		
	} else  {
		
		driver.findElement(By.xpath(Profile_Continue_Button2)).click();
		
	}*/

		driver.findElement(By.xpath(Profile_Continue_Button1)).click();
}
	
}
