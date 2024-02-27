package ucAppPages;
import lib.UCAppData;
import lib.CommonClass;
//import pageFactory.PF_Login;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends ComboAppBasePage
{
	
	public ForgotPassword() 
	{
		super();
	}

	//Login Link click	
		@FindBy(xpath="//*[@id='navbarNav']/ul/li/a[1]/em")	
		private WebElement weloginlinkField;
	
		//Forgot Link Click
		@FindBy(linkText="Forgot Password")	
		private WebElement weForgotloginlinkField;
		
		
		//Email Address
		//@FindBy(xpath="//input[@placeholder=’Enter your email address.’]")	
		@FindBy(xpath="//div[@class='modal-content']//form[@id='new_user']//input[@id='user_email']")
		private WebElement weUserEmailField;
		
		
		//Send Button
		@FindBy(xpath="//form[@id='new_user']/input[@name='commit']")	
		private WebElement weSendBtn;

		
		public void fnForgotPassword(final int iTestCaseID, UCAppData testData)throws Exception 
		{
				
			CommonClass.driver.get(CommonClass.sBaseURL);
			 waitForThread(CommonClass.iWaitForThread2);
			 System.out.print("Enter in forgot Password Method");
			//CommonClass.driver.get(CommonClass.sBaseURL);
			 waitForThread(CommonClass.iWaitForThread2);
			 weloginlinkField.click();
			 waitForThread(CommonClass.iWaitForThread2);
			 weForgotloginlinkField.click();
			 waitForThread(CommonClass.iWaitForThread1);

			 weUserEmailField.sendKeys("test@test.com");
			 waitForThread(CommonClass.iWaitForThread);
			 
			 weSendBtn.click();

			 
			 
        }
}
