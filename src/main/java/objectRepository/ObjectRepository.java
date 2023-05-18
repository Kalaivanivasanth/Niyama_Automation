package objectRepository;

public class ObjectRepository {
	
	//Login
	public static final String EmailIdMobile_Field ="//*[@id='mobileemailverify_mobileemailverify']";
	public static final String Login_Continue_Button = "//*[@type='button']/span[text()='Continue']";
	public static final String LoginWithPassword_Button = "//*[@type='button']/span[text()='Login with Password']";
	public static final String Password_Button = "passwordlogin_password"; //ID
	public static final String Login_Button = "//*[@type='button']/span[text()='LOGIN']";
	public static final String LoginButton_Assess = "(//*[@type='button']/span[text()='LOGIN'])[2]";
	
	//Profile Card
	public static final String ProfileCard_Self = "//*[@class='ant-card-meta-detail']/div[text()='Kalaivani.R']";
	
	//Guest User Assessment
	public static final String AssessmentForTeens_Button = "//*[@type='button']/span[text()=\"Assessment for Teens\"]";
	public static final String DepressionForTeens_Button = "//*[@type='button']/span[text()=' Depression / Anxiety Assessment for Teens']";
	
	public static final String AssessmentForAdults_Button = "//*[@type='button']/span[text()='Assessment for Adults']";
	//Adolescent
	public static final String Q1_Never="(//span[text()='Never'])[1]";
	public static final String Q2_Never="(//span[text()='Never'])[2]";
	public static final String Q3_Never="(//span[text()='Never'])[3]";
	public static final String Q4_Never="(//span[text()='Never'])[4]";
	public static final String Q5_Never="(//span[text()='Never'])[5]";
	public static final String Q6_Never="(//span[text()='Never'])[6]";
	public static final String Q7_Never="(//span[text()='Never'])[7]";
	public static final String Q8_Never="(//span[text()='Never'])[8]";
	public static final String Q9_Never="(//span[text()='Never'])[9]";
	public static final String Q10_Never="(//span[text()='Never'])[10]";
	
	
	//Adult
	public static final String Q1_NearlyEveryDay="(//span[text()='Nearly every day'])[1]";
	public static final String Q2_NearlyEveryDay="(//span[text()='Nearly every day'])[2]";
	public static final String Q3_NearlyEveryDay="(//span[text()='Nearly every day'])[3]";
	public static final String Q4_NearlyEveryDay="(//span[text()='Nearly every day'])[4]";
	public static final String Q5_NearlyEveryDay="(//span[text()='Nearly every day'])[5]";
	public static final String Q6_NearlyEveryDay="(//span[text()='Nearly every day'])[6]";
	public static final String Q7_NearlyEveryDay="(//span[text()='Nearly every day'])[7]";
	public static final String Q8_NearlyEveryDay="(//span[text()='Nearly every day'])[8]";
	public static final String Q9_NearlyEveryDay="(//span[text()='Nearly every day'])[9]";
	public static final String Q10_NearlyEveryDay="(//span[text()='Nearly every day'])[10]";
	public static final String Q11_NearlyEveryDay="(//span[text()='Nearly every day'])[11]";
	public static final String Q12_NearlyEveryDay="(//span[text()='Nearly every day'])[12]";
	public static final String Q13_NearlyEveryDay="(//span[text()='Nearly every day'])[13]";
	public static final String Q14_NearlyEveryDay="(//span[text()='Nearly every day'])[14]";
	public static final String Q15_NearlyEveryDay="(//span[text()='Nearly every day'])[15]";
	public static final String Q16_NearlyEveryDay="(//span[text()='Nearly every day'])[16]";
	
			
	
	public static final String Submit_Button ="//*[@id='quiz-submit']";
	
	public static final String Result ="assesment-score-bottom-content"; //ID
	
	//Profile List
	
	public static final String ProfileList_PatientName1="(//*[@class='ant-card-meta-title'])[1]";
	public static final String ProfileList_PatientName2="(//*[@class='ant-card-meta-title'])[2]";
	
	public static final String Profile_Continue_Button1="(//*[@type='button']/span[text()='Continue'])[1]";
	public static final String Profile_Continue_Button2="(//*[@type='button']/span[text()='Continue'])[2]";
	
	//IHI
	
	public static final String SideMenu_HealthInformation="//a[contains(@href,'health-profile')]";
	public static final String PreferredLanguage_Dropdown="socio_demographic_detail_data_preferred_language_list"; //ID
	public static final String LanguageDropdown_Value1="socio_demographic_detail_data_preferred_language_list_0"; //ID
	public static final String Save_Button="//*[@class='save-button']";
	
	
	//Register
	public static final String Signup ="//*[@class='optional-button']";
	public static final String User_Type = "userType"; //ID
	public static final String UserType_SelfOption = "(//*[@class='ant-select-item-option-content'])[1]";
	public static final String UserType_SomeoneelseOption = "(//*[@class='ant-select-item-option-content'])[2]";
	public static final String Email_ID ="email"; //ID
	public static final String Email_SendOTP = "//button[@name='email']";
	public static final String Email_VerifyOTP = "//button[@id='email']";
	public static final String Mobile ="mobile"; //ID
	public static final String Mobile_SendOTP = "//button[@name='mobile']";
	public static final String Mobile_VerifyOTP = "//button[@id='mobile']";
	public static final String Register_Continue_Button = "//*[@type='button']/span[text()='Continue']";
	public static final String Name = "signup_account_holder_name"; //ID
	public static final String Set_Password = "signup_password"; //ID
	public static final String Confirm_Password = "signup_confirmPassword"; //ID
	public static final String Date_Of_Birth = "//*[@class='ant-picker-input']";
	public static final String Year = "//button[normalize-space()='2023']"; //year needs to be changed
	public static final String Previous_YearIcon = "//span[@class='ant-picker-super-prev-icon']";
	public static final String Date_Of_Year ="//div[normalize-space()='2000']";
	public static final String Date_Of_Month = "//div[normalize-space()='Feb']";
	public static final String Date_Of_Day = "//div[normalize-space()='16']";
	public static final String Gender = "signup_gender"; //ID
	public static final String Gender_Female = "//div[contains(text(),'Female')]";
	public static final String Terms_Checkbox = "signup_terms"; //ID
	public static final String Signup_Button = "//*[@type='button']/span[text()='SIGN UP']";
	
	
	
	
	
}
