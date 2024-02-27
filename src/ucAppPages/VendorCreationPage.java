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


public class VendorCreationPage extends ComboAppBasePage 
{
	public VendorCreationPage() 
	{
	super();
    }

   //client option select
	@FindBy(xpath="//*[@id='clients']/a/div[1]/i")	
  private WebElement weClientopt;
	
	//popup close
	@FindBy(xpath="//*[@id='Embed']/div/div/div/div/div/div/div[1]/div/button[2]")
	 private WebElement wepopup;

	@FindBy(xpath="//*[@id='webWidget']")
    private WebElement wepopupframe;

	

	   //vendor option select
		@FindBy(xpath="//div[@id='client-list-holder']/div[@class='container-fluid p0']//div[@class='col-sm-5 mb3']/a[@role='tab']/i[@class='fa fa-hard-hat']")	
	  private WebElement weVendoropt;
		

		//@FindBy(linkText="Add a new vendor")
		@FindBy(xpath="//*[@id='page-content']/a/i")
	     private WebElement weVensoroptPlus;
		
	@FindBy(xpath="//div[@id='page-content']/div[@class='main-page']/div/div[@class='row']/div[@class='col-sm-10 col-sm-offset-1']//a[@href='/company/wizard/contractors/new']")
	     private WebElement weCreateNewVendor;
	
	@FindBy(xpath="//*[@id='vendor-selection']")
    private WebElement weVcompanyName;

	@FindBy(linkText="Add a new vendor")
	 private WebElement weAddnewVendor;
	
	@FindBy(xpath="//*[@id='company_name']")
    private WebElement weVendorName;

	@FindBy(xpath="//*[@id='company_legal_address_attributes_formatted_address']")	               
    private WebElement weVcompanyAddress;
	
	@FindBy(xpath="//*[@id='new_company']/div[1]/div[2]/div/div[1]/div[2]/a/i")	               
    private WebElement weVcompanyLegalAddressAdd;

	//*[@id="company_legal_address_attributes_address1"]
	@FindBy(xpath="//input[@id='company_legal_address_attributes_address1']")
    private WebElement weVcompanyAddress1;


	//*[@id="company_legal_address_attributes_city"]
	@FindBy(xpath="//input[@id='company_legal_address_attributes_city']")
    private WebElement weVcompanyCityDetais;

	
	@FindBy(xpath="//input[@id='company_legal_address_attributes_state']")
    private WebElement weVcompanyStateDetais;


	@FindBy(xpath="//*[@id='company_recommended_ein']")
    private WebElement weEINNo;
	
	
	@FindBy(xpath="//form[@id='new_company']/div[1]/a[@href='javascript:void()']/u[.='ADVANCED']")
    private WebElement weAdvancedLink;
	
	
	@FindBy(xpath="//div[@id='advanced']//div[@class='image-wrapper']/label")
    private WebElement weCompanylogo;
	
	
	@FindBy(xpath="//input[@id='company_website']")
    private WebElement weVcompanywebsiteDetails;


	
	@FindBy(xpath="//input[@id='company_vendor_number']")
    private WebElement weVcompanyVendornumber;

	
	@FindBy(xpath="//input[@id='company_fax']")
    private WebElement weVcompanyVendorfax;


	@FindBy(xpath="//input[@id='company_phone']")
    private WebElement weVcompanyVendorphone;
	

	@FindBy(xpath="//input[@id='company_send_platform_invite']")
    private WebElement weVendorInvite;
	
	
	@FindBy(xpath="//input[@id='company_legal_address_attributes_zip_code']")
    private WebElement weVcompanyZipcodeDetails;

	
	@FindBy(xpath="//input[@id='company_email']")
    private WebElement weVcompanyEmailDetails;
	
	
	@FindBy(xpath="//select[@id='company_state_id']")
    private WebElement weVcompanystates;
	
	//*[@id="company_phone"]
	@FindBy(xpath="//input[@id='company_phone']")
    private WebElement weVcompanyPhoneNoDetails;
	

	//*[@id="company_extension"]
	@FindBy(xpath="//input[@id='company_extension']")
    private WebElement weVcompanyExtensionDetails;
	
	//*[@id="company_website"]
	@FindBy(xpath="//input[@id='company_website']")
    private WebElement weVcompanyWebsiteDetails;
	

	//*[@id="company_vendor_number"]
	@FindBy(xpath="//input[@id='company_vendor_number']")
    private WebElement weVcompanyVendorNoDetails;
	
	@FindBy(xpath="//*[@id='company_vendor_invite_email_attributes_recipient_phone']")
    private WebElement weVenPrimarymobileno;
	
	
	
	@FindBy(xpath="//*[@id='company_vendor_invite_email_attributes_subject']")
    private WebElement weVenemailSubject;
	
	
	@FindBy(xpath="//*[@id='company_vendor_invite_email_attributes_message']")
    private WebElement weVenemailmessage;

	//*[@id="company_description"]
	//*[@id="company_description"]
	@FindBy(xpath="//*[@id='company_description']")
    private WebElement weVcompanyDescriptionDetails;
	

	//*[@id="company_vendor_coins_connection_attributes_external_id"]
		@FindBy(xpath="//input[@id='company_vendor_coins_connection_attributes_external_id']")
        private WebElement weVcompanyCoinsDetails;
	
		
		@FindBy(xpath="//form[@id='new_company']/div[1]//label/i[@class='fa fa-upload']")
        private WebElement weVcompanyUploadLogo;
	

		//Continue button
		@FindBy(xpath="//input[@value='CONTINUE' and @type='submit']")	
		 private WebElement weBtnContinue;
		
		//Continue button
		@FindBy(xpath="//input[@value='SEND' and @type='submit']")	
	     private WebElement weBtnSend;
				
		
		
		//Tab 2 Company Administration
		
		@FindBy(xpath="//input[@id='company_contacts_attributes_0_first_name']")
        private WebElement weVAdminFirstName;
		

		//*[@id="company_contacts_attributes_0_last_name"]
		@FindBy(xpath="//input[@id='company_contacts_attributes_0_last_name']")
        private WebElement weVAdminLastName;
		

		//*[@id="company_contacts_attributes_0_title"]
		@FindBy(xpath="//input[@id='company_contacts_attributes_0_title']")
        private WebElement weVAdminTitle;
		
		//*[@id="company_contacts_attributes_0_email"]
		@FindBy(xpath="//input[@id='company_contacts_attributes_0_email']")
        private WebElement weVAdminEmail;

		//*[@id="company_contacts_attributes_0_phone"]
		
		
		//*[@id="company_contacts_attributes_0_mobile"]
		@FindBy(xpath="//input[@id='company_contacts_attributes_0_mobile']")
        private WebElement weVAdminMobile;
		
	//for the Existing vendor Locators
		
			@FindBy(xpath="//*[@id='vendor-selection']")
        private WebElement weExistVendorname;
		
				
		@FindBy(xpath="//*[@id='selected-company-list']/div/a[1]/div/div/div/div[1]/div/i")
        private WebElement weExistVendorCompnyName;
		
		//Invite button
		@FindBy(xpath="//input[@value='Invite' and @type='submit']")	
		 private WebElement weBtnInvite;
		
		//For Vendor menu Oprations
		
		@FindBy(xpath="//div[@id='client-list-holder']/div[@class='container-fluid p0']//div[@class='col-sm-5 mb3']/span[3]/a/i[@class='fa fa-bullseye']")	
		 private WebElement weActiveVendors;
		
		@FindBy(xpath="//div[@id='client-list-holder']/div[@class='container-fluid p0']//div[@class='col-sm-5 mb3']/span[4]/a/i[@class='fa fa-clock']")	
		 private WebElement wePendingVendors;
		
		@FindBy(xpath="//div[@id='client-list-holder']/div[@class='container-fluid p0']//div[@class='col-sm-5 mb3']/span[5]/a/i[@class='fa fa-ban']")	
		 private WebElement weBlockVendors;

		@FindBy(css="div:nth-of-type(1) > .card-body.fs12 > .row > .col-sm-1.p0.pr15 > .pull-right > .dropdown.mb5.panel-list-option.pull-right > .dropdown-toggle.no-action > .fa.fa-2x.fa-ellipsis-v")
		private WebElement weBlockActiveVendorlink;
		
		@FindBy(linkText="Block")
		private WebElement weBlockActiveVendor;
		
		
		@FindBy(linkText="Unblock")
		private WebElement weUnBlockActiveVendor;
		
	
		@FindBy(linkText="RESEND INVITATION")
		private WebElement wePendingVendorResendInvitation;
		
		
		@FindBy(xpath="//*[@id='alert-msg']/div/div/div[1]/button/span[1]/i")
		private WebElement weEmailInvitation;
		
		@FindBy(xpath="//div[@class='col-sm-12 company_list']/div/div[@class='card-body fs12']/div[@class='row']/div[5]/div[2]/div[.!='0/0']")
		private WebElement weVendoruseinWO;
								

		public void fnVendorCreation(int iTestCaseID, UCAppData testData) throws Exception
		{
			
			waitForThread(CommonClass.iWaitForThread2);

			weClientopt.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			
			weVendoropt.click();

			waitForThread(CommonClass.iWaitForThread2);
			//waitForThread(CommonClass.iWaitForThread1);
			
			
			//if(wepopupframe.isDisplayed()== true)
				
			if(!CommonClass.driver.findElements(By.xpath("//*[@id='webWidget']")).isEmpty())
				 {
	
		         System.out.println("frame Unable");

			    CommonClass.driver.switchTo().frame(wepopupframe);	
				
				System.out.println("iframe switch properly");
				Actions actions6 = new Actions(CommonClass.driver); 
		        actions6.moveToElement(wepopup).click().perform();
		      }
	           else
	            {
	            	System.out.println("frame disable");
	            	
	          }
			
			weVensoroptPlus.click();
			
			waitForThread(CommonClass.iWaitForThread1);

					
			waitForThread(CommonClass.iWaitForThread);
			String Vendorname = "AT Regression Vendor OCT" + new Random().nextInt(1000);
			weVcompanyName.sendKeys(Vendorname);
			
			waitForThread(CommonClass.iWaitForThread2);

			weAddnewVendor.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			
			String NewVendorame = "AT Vendor OCT" + new Random().nextInt(1000);
			weVendorName.sendKeys(Vendorname);

			weVcompanyAddress.sendKeys("Gdańsk, Poland"); //api address
			waitForThread(CommonClass.iWaitForThread);		
			weVcompanyAddress.sendKeys(Keys.DOWN);
		
			waitForThread(CommonClass.iWaitForThread);
			weVcompanyAddress.sendKeys(Keys.ENTER);
			
	      	waitForThread(CommonClass.iWaitForThread);
	      	
	      	weVcompanyLegalAddressAdd.click();
	      	
	      	weVcompanyAddress1.sendKeys("Area 51, NV, USA");
	      	
				
			String emaildetl = "harishpatil+" + new Random().nextInt(1000)+ "@utilizecore.com";
			CommonClass.driver.findElement(By.id("company_email")).sendKeys(emaildetl);


			//weVcompanystates.click();
			
			WebElement drpDwnList = CommonClass.driver.findElement(By.xpath("//*[@id='company_state_id']"));
					//Using FindElements to create a List object
					//List <WebElement> weblist = driver.findElements(By.xpath(“.//*[@id=’drpdwnTopics’]/option”));
					//Using Select Class to fetch the count
					Select objSel = new Select(drpDwnList);
					List <WebElement> weblist = objSel.getOptions();
					//Taking the count of items
					int iCnt = weblist.size();
					//Using Random class to generate random values
					Random num = new Random();
					int iSelect = num.nextInt(iCnt);
					//Selecting value from DropDownList
					objSel.selectByIndex(iSelect);
					//Selected Value
					//System.out.println(drpDwnList.getAttribute(“value”));


			waitForThread(CommonClass.iWaitForThread);
			
			weEINNo.sendKeys("123456789");

			weAdvancedLink.click();
			waitForThread(CommonClass.iWaitForThread);

			weCompanylogo.click();
			
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
			  
				waitForThread(CommonClass.iWaitForThread);

			
			  WebElement drpDwnListTax = CommonClass.driver.findElement(By.xpath("//select[@id='company_legal_tax_classification']"));
			//Using Select Class to fetch the count
				Select objSel1 = new Select(drpDwnListTax);
				List <WebElement> weblist1 = objSel1.getOptions();
				//Taking the count of items
				int iCnt1 = weblist1.size();
				//Using Random class to generate random values
				Random num1 = new Random();
				int iSelect1 = num.nextInt(iCnt1);
				//Selecting value from DropDownList
				objSel1.selectByIndex(iSelect1);
				
				weVcompanywebsiteDetails.sendKeys("www.test.com");
				
				weVcompanyVendornumber.sendKeys("+3 555 888 88888");
				weVcompanyVendorfax.sendKeys("+3 666 888 88888");
				weVcompanyVendorphone.sendKeys("+3 555 999 9999");
				
				waitForThread(CommonClass.iWaitForThread);
				weVendorInvite.click();
			
			weBtnContinue.click();
   			System.out.println("Continue button Successfully done");
			waitForThread(CommonClass.iWaitForThread2);
			//weBtnContinue.click();
			waitForThread(CommonClass.iWaitForThread2);

			weBtnContinue.click();
			//waitForThread(CommonClass.iWaitForThread1);

		   // sendValue(weVAdminMobile,"5558885555","Enter the Admin Phone Details");

		    
			sendValue(weVenemailSubject,"Testsubject","Enter the subjects");

			sendValue(weVAdminEmail,"test@test.com","Enter the Admin Email Details");

		    sendValue(weVenPrimarymobileno,"+3 555 777 44444","Enter the Admin Phone Details");

		  
		    sendValue(weVenemailmessage,"AT Testing Purpose","Enter the At Testing message Details");

		 
			waitForThread(CommonClass.iWaitForThread1);
			weBtnSend.click();			
			
			
}

        //For Existing User
		public void fnExistingVendor(int iTestCaseID, UCAppData testData) throws Exception
		{
			
			waitForThread(CommonClass.iWaitForThread2);

			weClientopt.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			
			weVendoropt.click();
			waitForThread(CommonClass.iWaitForThread1);

             weVensoroptPlus.click();
			
			waitForThread(CommonClass.iWaitForThread1);

		    weExistVendorname.sendKeys("abc");
			waitForThread(CommonClass.iWaitForThread1);
			
			weExistVendorCompnyName.click();
			waitForThread(CommonClass.iWaitForThread1);

			weBtnInvite.click();
			waitForThread(CommonClass.iWaitForThread1);

			
		}

		public void fnVendormenuOprations(int iTestCaseID, UCAppData testData) throws Exception
		{
			
			waitForThread(CommonClass.iWaitForThread2);

			weClientopt.click();
			waitForThread(CommonClass.iWaitForThread1);
						
			weVendoropt.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			weActiveVendors.click();
			waitForThread(CommonClass.iWaitForThread1);

			wePendingVendors.click();
			waitForThread(CommonClass.iWaitForThread1);

			weBlockVendors.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			weActiveVendors.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			weBlockActiveVendorlink.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			weBlockActiveVendor.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			weBlockVendors.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			weBlockActiveVendorlink.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			weUnBlockActiveVendor.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			wePendingVendors.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			wePendingVendorResendInvitation.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			weEmailInvitation.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			weActiveVendors.click();
			waitForThread(CommonClass.iWaitForThread2);
			waitForThread(CommonClass.iWaitForThread2);
			
			//weVendoruseinWO.click();
			 JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
			 waitForThread(CommonClass.iWaitForThread2);
			 waitForThread(CommonClass.iWaitForThread2);

			js.executeScript("arguments[0].scrollIntoView(true);", weVendoruseinWO);
			//waitForThread(CommonClass.iWaitForThread2);
			waitForThread(CommonClass.iWaitForThread2);
			
				System.out.println("Scroll Down Sucessfully and and used Vendor clickable");

						
			//Actions actions = new Actions(CommonClass.driver); 
		    //actions.moveToElement(weVendoruseinWO).moveToElement(weBlockActiveVendorlink).click().perform();
		    //waitForThread(CommonClass.iWaitForThread1);
		    
		    weBlockActiveVendorlink.click();
			waitForThread(CommonClass.iWaitForThread1);

		}
}