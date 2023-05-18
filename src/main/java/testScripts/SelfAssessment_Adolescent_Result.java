package testScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class SelfAssessment_Adolescent_Result extends CommonFunctions{
	
	@Test(priority=4)
public void selfAssessment_Adolescent_Result() {
		
		
		String result= driver.findElement(By.className(Result)).getText();
		System.out.println(result);
				test.log(LogStatus.PASS, result);
		
		
	}

	
}
