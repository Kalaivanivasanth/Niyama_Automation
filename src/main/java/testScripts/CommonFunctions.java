package testScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions extends objectRepository.ObjectRepository{
	
	public static WebDriver driver = null;
	static ExtentReports report;
	static ExtentTest test;


	
	

	@BeforeTest
	public void browserLaunch() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		report=new ExtentReports("C:\\Users\\Kalaivani.R\\eclipse-workspace\\Niyama_Modules\\Report\\Report.html", true);
		test= report.startTest("Self Assessment Before Login");


		FileInputStream stream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(stream);

		String URL= properties.getProperty("ApplicationURL");

		driver.get(URL);
	}

	@AfterTest 

	public void tearDown() { 

		//driver.close(); 
		report.endTest(test);
		report.flush(); 
	}



}
