package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends CommonFunctions implements ITestListener {

	public void onTestFailure(ITestResult result) {
		
		 
		 System.out.println("Screenshot code works!");
		 if(ITestResult.FAILURE==result.getStatus()){
			 File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 try {
				FileUtils.copyFile(screenshot1, new File("C:\\Users\\Kalaivani.R\\git\\Niyama\\Niyama_Modules\\failedscreenshot.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 else {
			 File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 try {
				FileUtils.copyFile(screenshot2, new File("C:\\Users\\Kalaivani.R\\git\\Niyama\\Niyama_Modules\\Screenshot.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
	 
}