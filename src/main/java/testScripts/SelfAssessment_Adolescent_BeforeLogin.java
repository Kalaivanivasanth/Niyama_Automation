package testScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class SelfAssessment_Adolescent_BeforeLogin extends CommonFunctions{
	
	@Test(priority = 0)
	public void selfAssessment_Adolescent_Questions() throws IOException {
		test.log(LogStatus.INFO, "SelfAssessment testcase is started");
		
		driver.findElement(By.xpath(AssessmentForTeens_Button)).click();
		
		
		test.log(LogStatus.INFO, "User answering the SelfAssessment Questions");

		driver.findElement(By.xpath(Q1_Never)).click();
		
		driver.findElement(By.xpath(Q2_Never)).click();

		driver.findElement(By.xpath(Q3_Never)).click();
		
		driver.findElement(By.xpath(Q4_Never)).click();

		driver.findElement(By.xpath(Q5_Never)).click();
		
		driver.findElement(By.xpath(Q6_Never)).click();
		
		driver.findElement(By.xpath(Q7_Never)).click();
		
		driver.findElement(By.xpath(Q8_Never)).click();
		
		driver.findElement(By.xpath(Q9_Never)).click();
		
		driver.findElement(By.xpath(Q10_Never)).click();
		
			
		driver.findElement(By.xpath(Submit_Button)).click();
		
	}
	

}

