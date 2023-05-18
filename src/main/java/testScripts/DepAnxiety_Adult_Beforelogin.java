package testScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DepAnxiety_Adult_Beforelogin extends CommonFunctions{
	@Test(priority = 0)
	public void depAnxiety_Adult_Beforelogin() {
		
		driver.findElement(By.xpath(AssessmentForAdults_Button)).click();
		
		driver.findElement(By.xpath(Q1_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q2_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q3_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q4_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q5_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q6_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q7_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q8_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q9_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q10_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q11_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q12_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q13_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q14_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q15_NearlyEveryDay)).click();
		driver.findElement(By.xpath(Q16_NearlyEveryDay)).click();
		
		driver.findElement(By.xpath(Submit_Button)).click();
	}

}
