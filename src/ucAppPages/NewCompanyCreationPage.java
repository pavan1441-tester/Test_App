package ucAppPages;
import lib.UCAppData;
import lib.CommonClass;
import net.bytebuddy.asm.Advice.Enter;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class NewCompanyCreationPage extends ComboAppBasePage

{

	public NewCompanyCreationPage() 
	{
		super();
	}
	
	//Legal tax classification, roles, state needs keyboard down arrow then enter 
	//Click On All Companies Slide
	@FindBy(xpath="/html/body/div[1]/nav/div/div[2]/ul/div/li/span[2]/img")	
    	private WebElement SwitchCompany;
	
	//popup close
		@FindBy(xpath="//*[@id='Embed']/div/div/div/div/div/div/div[1]/div/button[2]")
		 private WebElement wepopup;
		
		
		@FindBy(xpath="//*[@id='webWidget']")
	    private WebElement wepopupframe;
		
	
	//*[@id="curent_user_comapnies_list"]/ul
	@FindBy(xpath="//div[@id='curent_user_comapnies_list']/ul[@class='dropdown-menu with-max-ht500']")	
	private WebElement companiesSlideD;



	//Click On All Companies Slide
	@FindBy(xpath="//*[@id=’curent_user_comapnies_list’]")	
    	private WebElement companiesSlide;


	//Click On Create Company option
	@FindBy(linkText="Create Company")	
	private WebElement createCompanyLink;
	
	//logo of compny
	@FindBy(xpath="//div[@class='upload-logo-text']")	
	private WebElement companyLogo;
	
		
	//Enter Legal Company Name
	@FindBy(xpath="/html//input[@id='company_name']")	
	private WebElement companyName;
		
	//Enter Doing Buisness As
	@FindBy(xpath="/html//input[@id='company_dba_attributes_dba_name']")	
   	private WebElement doingBuisnessAs;

	//Click On Legal Tax Classification
	@FindBy(xpath="/html//select[@id='company_legal_tax_classification']")	
	private WebElement legalTaxClassification;
	
	//Enter Legal Address -google API
	@FindBy(xpath="//input[@id='company_legal_address_attributes_formatted_address']")
	private WebElement legalAddress;
	
	//Enter Legal Address -google API
	@FindBy(xpath="//input[@id='company_legal_address_attributes_address1']")
	private WebElement DetailAddress;
			
		
	//Click state of Registration
	@FindBy(xpath="//*[@id=’company_state_id’]")	
	private WebElement stateOfRegistration;
			
	//Enter EIN Number
	@FindBy(xpath="//input[@id='company_recommended_ein']")	
	private WebElement einNumber;
	
	//Enter Company Email Address
	@FindBy(xpath="//input[@id='company_email']")	
	private WebElement companyEmailAddress;
			
	//Click On Next button
	//@FindBy(css="button[type*=’submit’]")	
	@FindBy(linkText="Next")	
	private WebElement clickOnNext;
	
	
	//On 2nd Next Page

	//Enter Choose your URL
	@FindBy(xpath="/html//input[@id='company_subdomain']")		        
	private WebElement ChooseUrl;
			
	//Click On Next button
	//@FindBy(xpath="//input[@value='Next' and @type='submit']")	
	@FindBy(xpath="//button[@class ='btn btn-default btn btn-lg btn-primary login-submit-btn next btn-custom']")
	 private WebElement weBtnNext;

	//On 3rd Page		

	//Enter First Name
	@FindBy(xpath="//*[@id='company_company_users_attributes_0_first_name']")
	private WebElement firstName;

	//Enter Last Name
	@FindBy(xpath="//*[@id='company_company_users_attributes_0_last_name']")
	private WebElement LasttName;
	
	//Click on Roles
	@FindBy(xpath="//*[@id=’company_company_users_attributes_0_role_id’]")	
	private WebElement roles;
			
	//Enter Email
	@FindBy(xpath="//input[@id='company_company_users_attributes_0_email']")	
	private WebElement email;
	
	@FindBy(xpath="//button[@class ='btn btn-default btn btn-lg btn-primary p-10-40 login-submit-btn next btn-custom']")
	//@FindBy(xpath="//button[text()='Next']")
	//@FindBy(xpath="//button[@title='Next']")
	//@FindBy(xpath="//button[@type, 'submit' and text()='Next']")
	 private WebElement weBtnNext3;
	
	
	//Enter Email
		@FindBy(xpath="//*[@id='mySidenav']")	
		private WebElement Hsdown;
	
	
	   //Click on Next Button
		@FindBy(xpath="//button[@class ='btn btn-default btn btn-lg btn-primary p-10-40 login-submit-btn next profile_region_submit_link btn-custom']")
		 private WebElement weBtnNext4;
	
	
	//Check Regions Serviced
	   @FindBy(xpath="//*[@id='state-23_anchor']/i[1]")	
	   private WebElement regionServiced;

	//Click on Next Button
	  // @FindBy(xpath="btn btn-default btn btn-lg btn-primary p-10-40 login-submit-btn next btn-custom")
	   @FindBy(xpath="//button[@class ='btn btn-default btn btn-lg btn-primary p-10-40 login-submit-btn next btn-custom']")
		 private WebElement weBtnNext5;
	  
	   
	   //@FindBy(linkText="Save your progress and exit")
	  // @FindBy(xpath="//a[@innertext='Save your progress and exit']")
	   @FindBy(xpath="//a[text()='Save your progress and exit']")
		private WebElement clickSaveEXIT;
	//Click on Next Button
	   
	 
	   @FindBy(xpath="//*[@id='draggable-video-container']/div[1]/button/i")
		private WebElement clickclosevideo;
	   
	   //switch to brightview site
	   
	 //Click On Company option
		//@FindBy(xpath="//div[@id='curent_user_comapnies_list']/ul[@class='dropdown-menu with-max-ht500']//strong[.='BrightView Enterprise Solutions']")	
		@FindBy(xpath="//div[@id='curent_user_comapnies_list']/ul[@class='dropdown-menu with-max-ht500']//strong[.='Majestic Facility Experts, Inc.']")
		private WebElement BrightviewCompanyLink;
		
		
		@FindBy(xpath="//*[@id='work_order_count']/div/div/div[1]/button")
		private WebElement popupclosebutonclick;
		
	
	//Certificate Of Insurance
	//Click on Next Button

	//Add new Functions
	public void fnCompanyCreation(int iTestCaseID, UCAppData testData)throws Exception
	{
		
		waitForThread(CommonClass.iWaitForThread1);
		
        SwitchCompany.click();
 		waitForThread(CommonClass.iWaitForThread1);
 		
 		//if(wepopupframe.isDisplayed()== true)
 			 if(!CommonClass.driver.findElements(By.xpath("//*[@id='webWidget']")).isEmpty())
  			
            //{
			{
			
		CommonClass.driver.switchTo().frame(wepopupframe);	
			//*[@id="webWidget"]
			System.out.println("iframe switch properly");
			Actions actions6 = new Actions(CommonClass.driver); 
	        actions6.moveToElement(wepopup).click().perform();
	      }
           else
            {
            	System.out.println("frame disable");
            	
          }
 		

        
        JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
		js.executeScript("arguments[0].scrollIntoView(true);", createCompanyLink);
		System.out.println("Scroll Down Sucessfully and and create compny clickable");



		System.out.println("Drop down element click properly");

 		waitForThread(CommonClass.iWaitForThread);
 		

 		//companiesSlideD.sendKeys(Keys.DOWN);
    
		//waitForThread(CommonClass.iWaitForThread2);
		//companiesSlide.click();
	//	waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread1);
		createCompanyLink.click();
		waitForThread(CommonClass.iWaitForThread1);
		
 		companyLogo.click();
 		
 		
		  StringSelection ss= new StringSelection("./Upload/20943580.jpg");
 		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

		  Robot robot = new Robot();

		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  waitForThread(CommonClass.iWaitForThread2);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  waitForThread(CommonClass.iWaitForThread2);
		  robot.keyRelease(KeyEvent.VK_ENTER);
			
			waitForThread(CommonClass.iWaitForThread2);
			//waitForThread(CommonClass.iWaitForThread2);

	
		//sendValue(companyName, "AT Regression Company”,”Enter Company Name”);"
		//sendValue(companyName,"AT Regression Compaan15","enter the company");
		String CompName = "AT Regression Sept" + new Random().nextInt(1000);
		CommonClass.driver.findElement(By.id("company_name")).sendKeys(CompName);
	
		waitForThread(CommonClass.iWaitForThread);

		//sendValue(doingBuisnessAs,"AT Regression Company","Enter Doing Buisness As");
		String BuisnessAs = "AT Regression Sept" + new Random().nextInt(1000);
		CommonClass.driver.findElement(By.id("company_dba_attributes_dba_name")).sendKeys(BuisnessAs);

		waitForThread(CommonClass.iWaitForThread);
		//legalTaxClassification.click();
		//waitForThread(CommonClass.iWaitForThread2);
		Select Tax = new Select(CommonClass.driver.findElement(By.id("company_legal_tax_classification")));
		Tax.selectByVisibleText("C Corporation");
		//Tax.selectByIndex(1);
		waitForThread(CommonClass.iWaitForThread);

		legalAddress.sendKeys("Ata");
		waitForThread(CommonClass.iWaitForThread);

	//	sendValue(legalAddress,"Flagstaff, AZ, USA","Enter Legal Address");
		legalAddress.sendKeys(Keys.DOWN);
		//Thread.sleep(2000L);
		waitForThread(CommonClass.iWaitForThread1);

		legalAddress.sendKeys(Keys.ENTER);
		waitForThread(CommonClass.iWaitForThread);
				
		sendValue(DetailAddress,"9889 Atami, Shizuoka, Japan","Enter Legal Address");
		waitForThread(CommonClass.iWaitForThread);
		
		Select State = new Select(CommonClass.driver.findElement(By.id("company_state_id")));
		State.selectByVisibleText("Florida");
		//Tax.selectByIndex(1);
		waitForThread(CommonClass.iWaitForThread1);

		//stateOfRegistration.click();
		//waitForThread(CommonClass.iWaitForThread);

		sendValue(einNumber,"8529325”,”Enter EIN Number");

		//sendValue(companyEmailAddress,"pavan+3260@utilizecore.com","Enter Company Email Address");
		String companyEmail = "pavan+" + new Random().nextInt(1000)+ "@utilizecore.com";
		CommonClass.driver.findElement(By.id("company_email")).sendKeys(companyEmail);

		waitForThread(CommonClass.iWaitForThread2);
		clickOnNext.click();
		waitForThread(CommonClass.iWaitForThread2);
	
		//sendValue(ChooseUrl,"ATCompanyDomain","Enter URL");
		//ChooseUrl.sendKeys("ataonynkoknnmloko");
		String ChooseUrl = "ATRegressionSept" +new Random().nextInt(1000);
		CommonClass.driver.findElement(By.id("company_subdomain")).sendKeys(ChooseUrl);

		waitForThread(CommonClass.iWaitForThread);
		weBtnNext.click();
		waitForThread(CommonClass.iWaitForThread);

		sendValue(firstName,"Bounty","Enter First Name");
		
		sendValue(LasttName,"Deltos","Enter Last Name");

		waitForThread(CommonClass.iWaitForThread2);
		//roles.click();
		Select roles = new Select(CommonClass.driver.findElement(By.id("company_company_users_attributes_0_role_id")));
		roles.selectByVisibleText("Admin");
		
		waitForThread(CommonClass.iWaitForThread);

		//sendValue(email,"pavan+89@utilizecore.com","Enter Email Address");
		String emaildetl = "pavan+" + new Random().nextInt(1000)+ "@utilizecore.com";
		CommonClass.driver.findElement(By.id("company_company_users_attributes_0_email")).sendKeys(emaildetl);

		waitForThread(CommonClass.iWaitForThread2);
		//clickOnNext.click();
		weBtnNext3.click();
	//	waitForThread(CommonClass.iWaitForThread2);

		waitForThread(CommonClass.iWaitForThread2);
		regionServiced.click();
		waitForThread(CommonClass.iWaitForThread1);
		
		//Actions actions2 = new Actions(CommonClass.driver); 
       // actions2.moveToElement(regionServiced).sendKeys(Keys.DOWN);
        
       /* Actions act = new Actions(CommonClass.driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();	//Page Down
        System.out.println("Scroll down perfomed");*/
		
		//((JavascriptExecutor)CommonClass.driver).executeScript("window.scrollTo(0,document.body.scr‌​ollHeight);");
		//CommonClass.driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
	   
		 
		//move to Right hand Navigation menu
		  Actions actions = new Actions(CommonClass.driver); 
	       actions.moveToElement(Hsdown).click().perform();
			waitForThread(CommonClass.iWaitForThread1);
			System.out.println("Navigation Menu fuction click");

		      //Scroll Down up to Next Button view 
			JavascriptExecutor js1 = ((JavascriptExecutor) CommonClass.driver);
			js1.executeScript("arguments[0].scrollIntoView(true);", weBtnNext4);
			System.out.println("Scroll Down Sucessfully and Next Button clickable");


	//	regionServiced.sendKeys(null);

		waitForThread(CommonClass.iWaitForThread2);
		weBtnNext4.click();
		//weBtnNext2.click();

		//waitForThread(CommonClass.iWaitForThread2);

		waitForThread(CommonClass.iWaitForThread2);
		weBtnNext5.click();
		//weBtnNext2.click();

	//	waitForThread(CommonClass.iWaitForThread2);


		//waitForThread(CommonClass.iWaitForThread2);
		//clickOnNext.click();
		//weBtnNext2.click();

		waitForThread(CommonClass.iWaitForThread1);

		clickSaveEXIT.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		clickclosevideo.click();
		
		waitForThread(CommonClass.iWaitForThread2);
		
		SwitchCompany.click();
 		waitForThread(CommonClass.iWaitForThread1);
 		
 		 JavascriptExecutor js2 = ((JavascriptExecutor) CommonClass.driver);
 		js2.executeScript("arguments[0].scrollIntoView(true);", BrightviewCompanyLink);
 		System.out.println("Scroll Down Sucessfully and and Brightview compny clickable");



  		waitForThread(CommonClass.iWaitForThread2);
  		BrightviewCompanyLink.click();

		//waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		
         if(!CommonClass.driver.findElements(By.xpath("//*[@id='work_order_count']/div/div")).isEmpty())
  			
            //{
			{
			
    	        popupclosebutonclick.click();
    	        System.out.println("pop up  window close sucessusfully");
            	
			
		
	      }
           else
            {
            	System.out.println("pop up  window disable");
            	
          }
		
		

		//CommonClass.driver.navigate().refresh();
		//waitForThread(CommonClass.iWaitForThread2);



}
}