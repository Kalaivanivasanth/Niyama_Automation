package testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Assessment_Completion extends CommonFunctions{
	
	@Test(priority=1)
	public void assessment_Completion(){
		
		driver.findElement(By.xpath(LoginButton_Assess)).click();
}
}