package ucAppPages;

import lib.UCAppData;
import lib.CommonClass;
//import pageFactory.PF_Login;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ComboAppBasePage 
{
	public static Logger log = LogManager.getLogger(ComboAppBasePage.class);

	public LoginPage() 
	{
		super();
	}

	//Login Link click	
	@FindBy(xpath="//*[@id='navbarNav']/ul/li/a[1]/em")	
	//@FindBy(xpath="//*[@id='navbarNav']/ul/li[11]/a[1]/em")
	private WebElement weloginlinkField;
	
	//Email Address input field
	  @FindBy(id="user_email")	
	  private WebElement weEmailid;
		
		//Password input field
		@FindBy(id="user_password")	
		 private WebElement wePassword;
		
				
		//login to your account button
		@FindBy(xpath="//input[@value='Login to your Account' and @type='submit']")	
	    private WebElement weLoginSubmit;
		
		
		
		//SingUp Link Click
		
		public static By signupField = By.linkText("Sign up");
		
		
	    //New User First Name
	    public static By firstName = By.xpath("//*[@id='user_first_name']");
	    
		//New User Last Name
		public static By lastName = By.xpath("//*[@id='user_last_name']");
		
	    //New User Phone Number
		public static By phoneNumber = By.xpath("//*[@id='user_primary_phone_attributes_number']");
		
	    //New User Email
		public static By email =  By.xpath("//*[@id='user_email']");
		
	     //New User Password
		public static By password = By.xpath("//*[@id='user_password']");
		
		//New User Confirm Password
		public static By ConfirmPassword = By.xpath("//*[@id='user_password_confirmation']");
		
	     //New User Terms Condition Click
		public static By termsCondition = By.xpath("//*[@id='user_terms_and_conditions']");
		
	     //New User Next Button
		public static By nextButton = By.xpath("//input[@value='Next' and @type='submit']");



	public void fnHomePage(final int iTestCaseID, UCAppData testData)throws Exception 
	{
			
		CommonClass.driver.get(CommonClass.sBaseURL);
		 waitForThread(CommonClass.iWaitForThread2);
		//CommonClass.driver.get(CommonClass.sBaseURL);
		 
		 if(testData.sUsername!="")
	        { 
	        	System.out.println("This is Login Case");
	            waitForThread(CommonClass.iWaitForThread2);
	            log.info("Verifying page title - Login to Your Account!");
	   		    waitForThread(CommonClass.iWaitForThread);
	   			weloginlinkField.click();
	   			
	   			sendValue(weEmailid,testData.sUsername,"Enter the User Name");
	   			waitForThread(CommonClass.iWaitForThread);
	   			//sendValue(wePassword,testData.sPassword,"Enter the password");
	   			sendValue(wePassword,"DRftgyhu@12","Enter the password");

	   			weLoginSubmit.click();
	   		
	            
	        }
		 else
		   {
			 System.out.print("This is Sign Up case");

		   }    
             
                    
		 }
}
	
	
