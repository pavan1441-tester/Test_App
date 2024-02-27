package ucAppPages;

//import lib.ComboAppData;
//import lib.CommonClass;
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
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.UCAppData;
import lib.CommonClass;

	public class ClientCreation extends ComboAppBasePage {
		
		public ClientCreation()
		{
			super();
		}
		//Goto Clients module
		@FindBy(linkText="Clients")	
	    private WebElement clickOnClientsModule;
		
		//Click on plus button
		@FindBy(css=".fa-plus")	
	    private WebElement clickOnNewClientCreationButton;
		
		//Click on create new company link
		@FindBy(css="#new_company_engagement > div.row.gray-panel > div > a")	
		private WebElement clickOnCreateNewCompanyLink;
		
		//logo of client
		@FindBy(xpath="//div[@class='upload-small-text']")	
			private WebElement ClientLogo;
		
		
		//Enter client Name
		@FindBy(css="#company_name")	
		private WebElement enterClientName;
		
		//Enter Apt suit name
		@FindBy(xpath="//*[@id='company_headquarter_address_attributes_apt_or_suite']")	
		private WebElement enterAptSuit;
		
		//Enter api address
		@FindBy(xpath="//*[@id='company_headquarter_address_attributes_formatted_address']")	
		private WebElement apiAddress;
		

		//Enter Details address
			@FindBy(xpath="//*[@id='company_headquarter_address_attributes_address1']")	
			private WebElement atrubutesAddress;
				

				//Enter City address
				@FindBy(xpath="//*[@id='company_headquarter_address_attributes_city']")	
				private WebElement cityAddress;

			//Enter State address
			 @FindBy(xpath="//*[@id='company_headquarter_address_attributes_state']")	
			private WebElement stateAddress;

			//Enter Details address
			@FindBy(xpath="//*[@id='company_headquarter_address_attributes_zip_code']")	
			 private WebElement ZipcodeAddress;
		
						
				
		//Enter Buisness email address
		@FindBy(xpath="//*[@id='company_email']")	
		private WebElement buisnessEmailAddress;
		
		//Enter Company phone number
		@FindBy(xpath="//*[@id='company_phone']")	
		private WebElement companyPhoneNumber;
				
		//Enter company Fax
		@FindBy(xpath="//*[@id='company_fax']")	
		private WebElement companyFax;
				
		
		//Enter Permanent client instruction
		@FindBy(xpath="//*[@id='company_instruction_attributes_notes']")	
		private WebElement clientInstruction;
		
		//Click on continue button
		@FindBy(css="#tab1 > div:nth-child(3) > div > a.btn-continue.next")
		private WebElement continueButton;
		
		//Next page-Contact Details
		
	
		//Upload Image 
				@FindBy(xpath="//div[@class='fa fa-upload']")	
				private WebElement Imageupload;
				
				
		//Enter first name
		@FindBy(css="input[id*='0_first_name']")	
		private WebElement firstName;
				
		//Enter last name
		@FindBy(css="input[id*='0_last_name']")	
		private WebElement lastName;

		
		//Enter the Title
				@FindBy(xpath="input[id*='0_last_name']")	
				private WebElement Title;

		
		//Enter Email address
		@FindBy(css="input[id*='0_email']")	
		private WebElement emailAddress;
		
		//Enter phone number
		@FindBy(css="input[id*='0_phone']")	
		private WebElement phoneNumber;
		
		//Enter mobile number
		@FindBy(css="input[id*='0_mobile']")	
		private WebElement mobileNumber;
		
		//mark Checkbox Use this contact as billing person
		@FindBy(id="company_contacts_attributes_0_is_billing_person")	
		private WebElement billingPerson;
		
		//Click on Create & Invite button
		@FindBy(css="input[class*='btn btn-default btn-continue']")	
		private WebElement createAndInviteButton;
				
		//Step 1 Save & Continue
		@FindBy(xpath="//*[@id='new_company_engagement']/div[3]/div/span/input[2]")	
		private WebElement saveAndContinueButton;
		
		//Step 2 Save & continue on personal details form
		@FindBy(css="input[value*='Save & Continue']")	
		private WebElement saveAndContinueBtnStep2;
		
		//Step 3 Add Service Rates
		@FindBy(linkText="[add services]")	
		private WebElement addServiceRates;
		
		//Click Service Name 
		@FindBy(css="#select2-service_rate_trade_service_id-container")	
		private WebElement serviceName;
		
		//Enter in Service Name Search box
		@FindBy(css="body > span > span > span.select2-search.select2-search--dropdown > input")	
		private WebElement serviceNameSearchBox;
		
		//Select displayed Service Name
		@FindBy(css="#select2-service_rate_trade_service_id-results > li.select2-results__option.select2-results__option--highlighted")	
		private WebElement selectServiceName;
		
		//Enter Per Service Rate
		@FindBy(xpath="//*[@id='service_rate_client_rate']")	
		private WebElement perServiceRate;
		
		//Enter Per PM Service
		@FindBy(xpath="//*[@id='service_rate_client_pm_rate']")	
		private WebElement perPmSerivceRate;
		
		//Enter Vendor Per Service
		@FindBy(xpath="//*[@id='service_rate_vendor_rate']")	
		private WebElement vendorperServiceRate;
		
		//Enter vendor Per PM Service
		@FindBy(xpath="//*[@id='service_rate_vendor_pm_rate']")	
		private WebElement VendorperPmSerivceRate;
		
		//Click Save Service Rates button
		@FindBy(css="#new-rate > div:nth-child(5) > div > div > input")	
		private WebElement saveServiceRatesButton;
		
		//Step 3 Click on Next button
		@FindBy(linkText="NEXT")	
		private WebElement nextButtonStep3;
		
		//Step 4
		//IVR Web checkbox
		@FindBy(xpath="//*[@id='company_ivr_attributes_required']")	
		private WebElement iVRcheckbox;
		
		//Enter procedure 
		@FindBy(xpath="//*[@id='company_ivr_attributes_procedure']")	
		private WebElement procedure;
		
		//Enter IVR Phone
		@FindBy(xpath="//*[@id='company_ivr_attributes_phone_no']")	
		private WebElement Ivrphone;
		
		//Enter IVR Pin
		@FindBy(xpath="//*[@id='company_ivr_attributes_pin']")	
		private WebElement Ivrpin;
		
		//Enter web url
		@FindBy(xpath="//*[@id='company_ivr_attributes_web_url']")	
		private WebElement webUrl;
		
		//Enter User ID
		@FindBy(xpath="//*[@id='company_ivr_attributes_user_id']")	
		private WebElement userID;
		
		//Enter Password
		@FindBy(xpath="//*[@id='company_ivr_attributes_user_password']")	
		private WebElement password;
		
		//Click Save & Continue
		@FindBy(css="input[value*='Save & Continue']")	
		private WebElement saveAndContinueStep4;
		
		//Step 5
		//Check Display WO to Client checkbox
		//@FindBy(css="#company_company_vendors_attributes_0_display_wo_client")	
		@FindBy(xpath="//*[@id='company_company_vendors_attributes_0_display_wo_client']")	
		private WebElement displayWoToClientCheckbox;
		
		//Check Display Serivce to Client checkbox
		@FindBy(css="#company_company_vendors_attributes_0_display_service_request")	
		private WebElement displayServiceRequestToClientCheckbox;
				
		
		//Click Save & Continue
		@FindBy(css="input[value*='Save & Continue']")	
		private WebElement saveAndContinueStep5;
		
		//SITES module //Step 1 Site Information
		
		//Click on Add New Site button 
		@FindBy(linkText="Add New")	
		private WebElement addNewSiteButton;
		
		//Step1 SITE INFORMATION	
		
		//Enter Site Name
		
		@FindBy(xpath="//*[@id='location_name']")	
		private WebElement siteName;
		
		//Enter COIN ID
		@FindBy(xpath="//*[@id='location_coins_connection_attributes_external_id']")	
		private WebElement CoinID;
		
		//Enter apt Suit
		@FindBy(css="input[id*='location_address_attributes_apt_or_suite']")	
		private WebElement aptSuit;
				
		//Enter api address
		@FindBy(xpath="//*[@id='location_address_attributes_formatted_address']")	
		private WebElement apiAddressStep1;
		
		
		//Enter address
		@FindBy(xpath="//*[@id='location_address_attributes_address1']")	
	    		private WebElement apiAddressdetStep1;
		
				
		
		//Click on Region
				@FindBy(xpath="//*[@id='select2-location_cc_location_territory_id-container']")	
		private WebElement clickRegion;
		
		//Enter Region
		@FindBy(css="body > span > span > span.select2-search.select2-search--dropdown > input")	
		private WebElement enterRegion;
				
		//Click entered Region
	//	@FindBy(xpath="//*[@id='select2-location_cc_location_territory_id-result-g2j5-2']")
		@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--above']//ul[@role='listbox']/li[2]")
		private WebElement selectEnteredRegion;
	

		
		//Checkbox This Site is tax exempt
		@FindBy(xpath="//*[@id='location_tax_exempt']")	
		private WebElement taxExempt;
		
		
		//Click on Property Management
		@FindBy(xpath="//*[@id='select2-location_property_managements_attributes_0_company_id-container']")	
		private WebElement clickPropertyManagement;
		
		//Enter Property Management
		//@FindBy(css="body > span > span > span.select2-search.select2-search--dropdown > input")
		@FindBy(xpath="//*[@id='select2-location_property_managements_attributes_0_company_id-results']/li[2]")
		private WebElement enterPropertyManagement;
		
		//Select entered Property Management
		@FindBy(css="#select2-location_property_managements_attributes_0_company_id-results > li")	
		private WebElement selectPropertyManagement;
		
		
		//External District
		@FindBy(xpath="//*[@id='location_cc_agreement_attributes_external_district")
		private WebElement weextenaldist;
		
		//External District
		//*[@id=""]
		@FindBy(xpath="//*[@id='location_cc_agreement_attributes_external_region")
		private WebElement weextenalregion;
		

		//External Trigger
		@FindBy(xpath="//*[@id='location_cc_agreement_attributes_trigger")
		private WebElement weextenalTrigger;
		
				
		//Enter Permanent Site Instructions
		@FindBy(xpath="//*[@id='location_cc_agreement_attributes_permanent_site_instructions']")	
		private WebElement siteInstruction;
		
		//Click on Save & Continue button
		@FindBy(css="input[value*='Save & Continue']")	
		private WebElement saveAndContinueStep1;
		
		//Step 2 - BILLING ADDRESS	
		
		//Enter Apt Suit
		@FindBy(css="input[id*='location_billing_address_attributes_apt_or_suite']")	
		private WebElement aptSuitStep2;
		
		//Enter In Care OF
		@FindBy(css="input[id*='location_billing_address_attributes_in_care_of']")	
		private WebElement inCareOff;
		
		//Enter Address(Google API)
		@FindBy(id="location_billing_address_attributes_formatted_address")	
		private WebElement addressGoogle;
		
		
		//Enter  bill location address
		@FindBy(xpath="//*[@id='location_billing_address_attributes_address1']")	
	    private WebElement weBilllocAdress;
		
		
		//Click on Save & Continue button
		//@FindBy(css="input[value*='Save & Continue']")	
		@FindBy(xpath="//input[@value='Save & Continue' and @type='submit']")	
		private WebElement saveAndContinueStep2;
		
		 


		//Step 3 CONTACTS	 
		//Enter First Name
		@FindBy(id="location_contacts_attributes_0_first_name")	
		private WebElement firstNameContacts;
		
		//Enter Last Name
		@FindBy(id="location_contacts_attributes_0_last_name")	
		private WebElement lastNameContacts;
		
		//Enter Title
		@FindBy(css="input[id*='0_title']")	
		private WebElement title;
		
		//Enter Email Address
		//@FindBy(css="location_contacts_attributes_0_email")
		@FindBy(xpath="//*[@id='location_contacts_attributes_0_email']")	
		private WebElement emailAddressContacts;
		
		//Enter phone
		@FindBy(css="input[id*='0_phone']")	
		private WebElement phoneContacts;
		
		//Enter Mobile Number
		@FindBy(css="input[id*='0_mobile']")	
		private WebElement mobileNumberContacts;
		
	
		//Click on CHECKBOX This contact is billable
		@FindBy(id="location_contacts_attributes_0_is_billing_person")	
		private WebElement billable;
		
		//Click on Save & Continue button
		@FindBy(css="input[value*='Save & Continue']")	
		private WebElement saveAndContinueStep3;
		
		//Step4-EQUIPMENT
		//Click on Save & Continue button
		@FindBy(css="input[value*='Save & Continue']")	
		private WebElement saveAndContinueEquipment;
		
		//Step5-ADDITIONAL
		//Click on Save & Continue button
		@FindBy(css="input[value*='Save & Continue']")	
		//Continue button
		//@FindBy(xpath="//input[@value='Save & Continue' and @type='submit']")	
		//@FindBy(xpath="button[@type='submit'][@class='btn btn-continue']")
		private WebElement saveAndContinueAdditional;
		
		//STEP 6-ASSIGNEE
		
		//Enter Assignee
		@FindBy(xpath="//div[@id='ms-location_tradesmen_ids']/div/input")	
		private WebElement assignee;
		
		//Select Assignee
		//@FindBy(id="51587247-selectable")	
		//@FindBy(xpath="//div[@id='ms-location_tradesmen_ids']/div[@class='ms-selectable']/ul/li[text() = 'Harish T Pat']")
		
		@FindBy(xpath="//div[@id='ms-location_tradesmen_ids']/div[@class='ms-selectable']/ul/li[109]")
         private WebElement assigneeSelect;                                                  
		
		//Click on Save & Continue button
		@FindBy(css="input[value*='Save & Continue']")	
		private WebElement saveAndContinueAssignee;
		
		//Step 7-Team Members
		
		//Click on Select User
		@FindBy(xpath="//span[@id='select2-team-members-0-container']")	
		private WebElement clickTeamMember;
		
		//Search Team Member Name
		@FindBy(xpath="//input[@type='search']")	
		private WebElement searchTeamMemberName;
		
		//Click on Searched Team Member
		@FindBy(css="li[id*='select2-team-members-0-result']")	
		private WebElement SelectTeamMemberName;
		
		//Click on Select Role
		@FindBy(xpath="//span[@id='select2-account-role-0-container']")	
		private WebElement clickTeamMemberRole;
		
		//Search Role
		@FindBy(xpath="//input[@type='search']")	
		private WebElement searchTeamMemberRole;
		
		//Click on Searched Team Member
		@FindBy(css="li[id*='select2-account-role-0-result']")	
		private WebElement SelectTeamMemberRole;
		
		//Click on Save & Continue button
		@FindBy(css="input[value*='Save & Continue']")	
		private WebElement saveAndContinueTM;
		
		//STEP8- SERVICE RATE
		
		//Click on Plus Button
		@FindBy(css=".ml10:nth-child(1)")	
		private WebElement clickPlusButton;
		
		//Select Trade Checkbox on Add Serivce Popup
		@FindBy(css="#location_locations_trade_services_attributes_19__destroy")	
		//@FindBy(xpath="//*[@id='location_location_default_service_rates_attributes_0__destroy']")
		private WebElement SelectTrade;
		
		//Click on Save
		@FindBy(css=".btn-default:nth-child(2)")	
		private WebElement SaveButton;
		
		//Click on Per Service
		@FindBy(css=".row:nth-child(3) > .col-sm-1 > .btn")	
		private WebElement perServicePlusButton;
		
		//Click on Add Services link
		@FindBy(linkText="[add services]")	
		private WebElement addServicesLink;
		
		//Click on Service Name
		@FindBy(css="#select2-service_rate_trade_service_id-container")	
		private WebElement clickServiceNameStep8;
		
		//Enter Service Name
		@FindBy(xpath="//input[@type='search']")	
		private WebElement enterServiceName;
		
		
		@FindBy(xpath="//*[@id='select2-service_rate_trade_service_id-results']/li[1]")	
		private WebElement enterServiceNamesel;
		
		
		//Click on Save button
			@FindBy(xpath="//input[@value='SAVE' and @type='submit']")	
		private WebElement savebtn;

		
		//Select entered Service Name
		//Refer line 125 to 145 till save button
		
		//Repeat line 373
			
			@FindBy(xpath="//*[@id='location-default-service-rates']/div/div")
			private WebElement Selectframe;

			
			
			
			@FindBy(xpath="//*[@id='location_location_default_service_rates_attributes_0__destroy']")	
			private WebElement SelectTrade1;

			
			

		
		//Click on Add Assignee
		@FindBy(xpath="//input[@value='Add Assignee' and @type='submit']")	
		 private WebElement addAssignee;

		
		//Click on Continue Button
		//@FindBy(linkText="(//*[@class='btn btn-default btn-primary ml10'])[1]")	
		@FindBy(xpath="//a[text()='Continue']")	
		private WebElement clickContinueButton;	
		
		//STEP8- AGREEMENT
		
		//Enter Min Price Range
		@FindBy(xpath="//*[@id='agreement_material_markups_attributes_0_range_min']")	
		private WebElement minRange;	
		
		//Enter Max Price Range
		@FindBy(xpath="//*[@id='agreement_material_markups_attributes_0_range_max']")	
		private WebElement maxRange;	
		
		//Enter Markup Multiplier
		@FindBy(xpath="//*[@id='agreement_material_markups_attributes_0_multiplier']")	
		private WebElement markupMultiplier;	
		
		//Click on Save & Exit button
		@FindBy(xpath="//input[@name='commit'][1]")	
		private WebElement saveAndExit;
		
		//popup close
		@FindBy(xpath="//*[@id='Embed']/div/div/div/div/div/div/div[1]/div/button[2]")
		 private WebElement wepopup;

		@FindBy(xpath="//*[@id='webWidget']")
	    private WebElement wepopupframe;

		
		//Add new Functions
		public void fnClientCreation(int iTestCaseID, UCAppData testData) throws Exception
		{
						
			// TODO Auto-generated method stub
			waitForThread(CommonClass.iWaitForThread2);
			clickOnClientsModule.click();
			//waitForThread(CommonClass.iWaitForThread);
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

			
			
			waitForThread(CommonClass.iWaitForThread1);
			clickOnNewClientCreationButton.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread2);
			clickOnCreateNewCompanyLink.click();
			waitForThread(CommonClass.iWaitForThread);
			
			ClientLogo.click();
			waitForThread(CommonClass.iWaitForThread);

			 StringSelection ss= new StringSelection("./Upload/index.jpg");
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

			
			String ClientName = "NewClient AT Sep" + new Random().nextInt(1000);
			CommonClass.driver.findElement(By.id("company_name")).sendKeys(ClientName);
			
			
			//sendValue(enterClientName,"RV_Test222213","Enter the Client Name");	
			
			waitForThread(CommonClass.iWaitForThread1);
			
			sendValue(enterAptSuit,"NewClient AT Sep","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			apiAddress.sendKeys("Gdańsk, Poland"); //api address
			
			waitForThread(CommonClass.iWaitForThread1);

					
			
			apiAddress.sendKeys(Keys.DOWN);
			//Thread.sleep(2000L);
			waitForThread(CommonClass.iWaitForThread1);
			apiAddress.sendKeys(Keys.ENTER);
			waitForThread(CommonClass.iWaitForThread1);

			//sendValue(atrubutesAddress,"1859 Floin Rd, Sacramento, CA 95889","Enter the Address Details");	
			atrubutesAddress.sendKeys("1859 Floin Rd, Sacramento, CA 95889");
			waitForThread(CommonClass.iWaitForThread1);

			
			sendValue(cityAddress,"Sacramento","Enter the City Details");	

			waitForThread(CommonClass.iWaitForThread1);

			
			//sendValue(stateAddress,"CA","Enter the State Details");	

		//	waitForThread(CommonClass.iWaitForThread2);
		//	sendValue(ZipcodeAddress,"96849","Enter the Zip Details");	

			
			//waitForThread(CommonClass.iWaitForThread2);

			
			//Thread.sleep(2000L);

			
			//sendValue(buisnessEmailAddress,"harishpatil+13@utilizecore.com","Enter the New comapny Email");	
			String buisnessEmail = "harishpatil+" + new Random().nextInt(1000)+ "@utilizecore.com";
			CommonClass.driver.findElement(By.id("company_email")).sendKeys(buisnessEmail);

			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(companyPhoneNumber,"+1 666 555 5895","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(companyFax,"+1 222 555 333","Enter the New comapny FAX");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(clientInstruction,"Test Instruction sep","Enter the New comapny Instruction");			
			waitForThread(CommonClass.iWaitForThread);
			
			//waitForThread(CommonClass.iWaitForThread1);
			continueButton.click();
			
			//contacts Tab
			waitForThread(CommonClass.iWaitForThread);
			Imageupload.click();
			waitForThread(CommonClass.iWaitForThread);

			 StringSelection ss2= new StringSelection("./Upload/20943580.jpg");
	 		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2,null);

			  Robot robot2 = new Robot();

			  robot2.keyPress(KeyEvent.VK_CONTROL);
			  robot2.keyPress(KeyEvent.VK_V);
			  robot2.keyRelease(KeyEvent.VK_V);
			  robot2.keyRelease(KeyEvent.VK_CONTROL);
			  waitForThread(CommonClass.iWaitForThread2);
			  robot2.keyPress(KeyEvent.VK_ENTER);
			  waitForThread(CommonClass.iWaitForThread2);
			  robot2.keyRelease(KeyEvent.VK_ENTER);
			
			//Imageupload.sendKeys("/home/harish/Pictures/20943580.jpg");

				waitForThread(CommonClass.iWaitForThread);

			
			
			sendValue(firstName,"RV_TesFnameSep","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(lastName,"RV_TesLnameSep","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			
			sendValue(title,"Mr","Enter the Title");			
			waitForThread(CommonClass.iWaitForThread);
			
			//sendValue(emailAddress,"harishpatil+11@utilizecore.com","Enter the Email Details");			
			waitForThread(CommonClass.iWaitForThread1);
			String emailAddress = "harishpatil+" + new Random().nextInt(1000)+ "@utilizecore.com";
			CommonClass.driver.findElement(By.id("company_contacts_attributes_0_email")).sendKeys(emailAddress);

			
			sendValue(phoneNumber,"+1 222 445 9985","Enter the Phone Number");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(mobileNumber,"9998885555","Enter the New Mobile Number");			
			//waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread);
			billingPerson.click();
			waitForThread(CommonClass.iWaitForThread);
			
			waitForThread(CommonClass.iWaitForThread);
			createAndInviteButton.click();
			waitForThread(CommonClass.iWaitForThread);
			
			waitForThread(CommonClass.iWaitForThread);
			saveAndContinueButton.click();
			waitForThread(CommonClass.iWaitForThread);
			
			waitForThread(CommonClass.iWaitForThread);
			saveAndContinueBtnStep2.click();
			waitForThread(CommonClass.iWaitForThread);
			
			waitForThread(CommonClass.iWaitForThread);
			addServiceRates.click();
			waitForThread(CommonClass.iWaitForThread);
			
			waitForThread(CommonClass.iWaitForThread);
			serviceName.click();
			waitForThread(CommonClass.iWaitForThread);
			
			//sendValue(serviceNameSearchBox,"snow removal","Enter the New comapny Name");	
			 List <WebElement> servicenameList = CommonClass.driver.findElements(By.xpath("//*[@id='select2-service_rate_trade_service_id-results']/li"));
	       	    Random r1 = new Random();
		        int randomValue1 = r1.nextInt(servicenameList.size()); //Getting a random value
		        servicenameList.get(randomValue1).click(); //Clicking on the random item in the list.
	       		waitForThread(CommonClass.iWaitForThread2);
			
			//sendValue(serviceNameSearchBox,"Plumbing Services","Enter the New comapny Name");	
			
			waitForThread(CommonClass.iWaitForThread1);
			
			//waitForThread(CommonClass.iWaitForThread);
		//	selectServiceName.click();
		//	waitForThread(CommonClass.iWaitForThread);
			
			sendValue(perServiceRate,"250","Enter the Service Rate");			
			waitForThread(CommonClass.iWaitForThread1);
			
			sendValue(perPmSerivceRate,"125","Enter the per Month Rate");			
			waitForThread(CommonClass.iWaitForThread1);
			
			sendValue(vendorperServiceRate,"200","Enter the Service Rate");			
			waitForThread(CommonClass.iWaitForThread1);
			
			sendValue(VendorperPmSerivceRate,"50","Enter the PM Service Rate");			
			waitForThread(CommonClass.iWaitForThread);
			
			//waitForThread(CommonClass.iWaitForThread1);
			saveServiceRatesButton.click();
			waitForThread(CommonClass.iWaitForThread);
			
			waitForThread(CommonClass.iWaitForThread);
			nextButtonStep3.click();
			waitForThread(CommonClass.iWaitForThread);
			
			waitForThread(CommonClass.iWaitForThread);
			iVRcheckbox.click();
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(procedure,"Regression Test Procedure Sep","Enter the Procedure Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(Ivrphone,"+1 555 222 9898","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(Ivrpin,"96855","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(webUrl,"www.rvtest.com","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(userID,"RT123145","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(password,"123123","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			waitForThread(CommonClass.iWaitForThread);
			saveAndContinueStep4.click();
			waitForThread(CommonClass.iWaitForThread);
			
			//waitForThread(CommonClass.iWaitForThread1);
			displayWoToClientCheckbox.click();
			waitForThread(CommonClass.iWaitForThread);
			
			//waitForThread(CommonClass.iWaitForThread1);
			//clickOnClientsModule.click();
			//waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread);
			displayServiceRequestToClientCheckbox.click();
			//waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			saveAndContinueStep5.click();
			//waitForThread(CommonClass.iWaitForThread1);
			
			//Site Creation Functionality
			
			waitForThread(CommonClass.iWaitForThread);
			addNewSiteButton.click();
			waitForThread(CommonClass.iWaitForThread);
			
			//sendValue(siteName,"RV_Test202210","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			String siteDetl = "AT Regression Site Sep" + new Random().nextInt(1000);
			CommonClass.driver.findElement(By.id("location_name")).sendKeys(siteDetl);
			
			
			
			//sendValue(CoinID,"RV_Test020810","Enter the New comapny Name");
			
			
			 if(!CommonClass.driver.findElements(By.xpath("//*[@id='location_coins_connection_attributes_external_id']")).isEmpty())
			 {

		    System.out.println("coin id Unable");
		    String CoinID = "RV_TestS139" + new Random().nextInt(1000);
			CommonClass.driver.findElement(By.id("location_coins_connection_attributes_external_id")).sendKeys(CoinID);
				
			System.out.println("iframe switch properly");

		    }
		  else
		   {
		   	System.out.println("coin id disable");
		   	
		 }

			waitForThread(CommonClass.iWaitForThread2);
			//String CoinIDDetl = "RV_Test280721" + new Random().nextInt(1000);
			//CommonClass.driver.findElement(By.id("location_coins_connection_attributes_external_id")).sendKeys(CoinIDDetl);
			
			
			sendValue(aptSuit,"AT Regression Site Sept1","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			
             apiAddressStep1.sendKeys("Houston, TX, USA"); //api address
         	waitForThread(CommonClass.iWaitForThread);
             apiAddressStep1.sendKeys(Keys.DOWN);
 			//Thread.sleep(2000L);
 			waitForThread(CommonClass.iWaitForThread);

 			apiAddressStep1.sendKeys(Keys.ENTER);

			
			//Thread.sleep(2000L);
			waitForThread(CommonClass.iWaitForThread);
			
			//apiAddressStep1.sendKeys(Keys.DOWN);
			//Thread.sleep(2000L);
			//waitForThread(CommonClass.iWaitForThread1);

			apiAddressdetStep1.sendKeys("Houston, TX, USA");
			
			//sendValue(apiAddressdetStep1,"RV_Test202122","Enter the New comapny Name");			
		   waitForThread(CommonClass.iWaitForThread1);
			

			//apiAddressdetStep1.sendKeys(Keys.DOWN);
			//waitForThread(CommonClass.iWaitForThread);
			//apiAddressdetStep1.sendKeys(Keys.ENTER);
			
		   //Scroll Down up to Next Button view 
					JavascriptExecutor js1 = ((JavascriptExecutor) CommonClass.driver);
					js1.executeScript("arguments[0].scrollIntoView(true);", taxExempt);
					System.out.println("Scroll Down Sucessfully and Next Button clickable");
			
			waitForThread(CommonClass.iWaitForThread1);
			//clickRegion.click();
			//waitForThread(CommonClass.iWaitForThread);
			
			//sendValue(enterRegion,"RV_Test202218","Enter the New comapny Name");			
			//waitForThread(CommonClass.iWaitForThread1);
			
			//waitForThread(CommonClass.iWaitForThread1);
		//	selectEnteredRegion.click();
			//waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread);
			taxExempt.click();
			waitForThread(CommonClass.iWaitForThread);

			waitForThread(CommonClass.iWaitForThread);
			clickPropertyManagement.click();
			waitForThread(CommonClass.iWaitForThread);
			
			//sendValue(enterPropertyManagement,"Core International LLC","Enter the property  Name");			
			//waitForThread(CommonClass.iWaitForThread1);
						
			
			waitForThread(CommonClass.iWaitForThread);
			enterPropertyManagement.click();
			//selectPropertyManagement.click();
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(weextenaldist,"Core International LLC","Enter the property  Name");			
			waitForThread(CommonClass.iWaitForThread);

			sendValue(weextenalregion,"LLC","Enter the property  Name");			
			waitForThread(CommonClass.iWaitForThread1);

			sendValue(weextenalTrigger,"LLC","Enter the property  Name");			
			waitForThread(CommonClass.iWaitForThread1);

			
					
			
			sendValue(siteInstruction,"RT_InstructionSep","Enter the site Instruction");			
			waitForThread(CommonClass.iWaitForThread);
			
			
			
			waitForThread(CommonClass.iWaitForThread);
			saveAndContinueStep1.click();
			waitForThread(CommonClass.iWaitForThread);
			
			//Step 2 
			
			sendValue(aptSuitStep2,"RV_TestSep202218","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(inCareOff,"RV_TestSep202218","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			addressGoogle.sendKeys("Gdańsk, Poland"); //api address
			
			//Thread.sleep(2000L);
			waitForThread(CommonClass.iWaitForThread1);
			
			addressGoogle.sendKeys(Keys.DOWN);
			//Thread.sleep(2000L);
			waitForThread(CommonClass.iWaitForThread);
			addressGoogle.sendKeys(Keys.ENTER);
			
			waitForThread(CommonClass.iWaitForThread1);

			weBilllocAdress.sendKeys("5889 Floin Rd, Sacramento, CA 95889, USA");
			
			waitForThread(CommonClass.iWaitForThread1);
			saveAndContinueStep2.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			sendValue(firstNameContacts,"RV_TestFNameSep","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread1);
			
			sendValue(lastNameContacts,"RV_TestLNameSep","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(title,"Mr","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(emailAddressContacts,"harishpatil+13@utilizecore.com","Enter the Email details");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(phoneContacts,"+1 333 8888 5987","Enter the Phone Details");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(mobileNumberContacts,"2228986666","Enter the Contact Details");			
			waitForThread(CommonClass.iWaitForThread1);
			
			//waitForThread(CommonClass.iWaitForThread1);
			billable.click();
			waitForThread(CommonClass.iWaitForThread);
			
			waitForThread(CommonClass.iWaitForThread);
			saveAndContinueStep3.click();
			waitForThread(CommonClass.iWaitForThread);
			
			waitForThread(CommonClass.iWaitForThread1);
			saveAndContinueEquipment.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread1);
			saveAndContinueAdditional.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			//sendValue(assignee,"Harish T Pat","Enter the Trademan Name");
			assignee.click();
			waitForThread(CommonClass.iWaitForThread);
			
		    
	      
			
			//waitForThread(CommonClass.iWaitForThread1);
			//assigneeSelect.click();
			//waitForThread(CommonClass.iWaitForThread);
			
			 List <WebElement> listings2 = CommonClass.driver.findElements(By.xpath("//*[@id='ms-location_tradesmen_ids']/div[1]/ul/li"));
	       	    Random r2 = new Random();
		        int randomValue2 = r2.nextInt(listings2.size()); //Getting a random value
		        listings2.get(randomValue2).click(); //Clicking on the random item in the list.
	       		waitForThread(CommonClass.iWaitForThread2);

			
			waitForThread(CommonClass.iWaitForThread1);
			saveAndContinueAssignee.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread);
			clickTeamMember.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			//sendValue(searchTeamMemberName,"Harish Patil","Enter the Team Member Name");			
			//waitForThread(CommonClass.iWaitForThread);
			
			
			 List <WebElement> TeammenerList = CommonClass.driver.findElements(By.xpath("//*[@id='select2-team-members-0-results']/li"));
	       	    Random r3 = new Random();
		        int randomValue3 = r3.nextInt(TeammenerList.size()); //Getting a random value
		        TeammenerList.get(randomValue3).click(); //Clicking on the random item in the list.
	       		waitForThread(CommonClass.iWaitForThread2);
			
		//	waitForThread(CommonClass.iWaitForThread);
		//	SelectTeamMemberName.click();
		//	waitForThread(CommonClass.iWaitForThread);
			
			waitForThread(CommonClass.iWaitForThread);
			clickTeamMemberRole.click();
			waitForThread(CommonClass.iWaitForThread);
			
			//sendValue(searchTeamMemberRole,"MM","Enter the Role of Team Memmber");			
			//waitForThread(CommonClass.iWaitForThread);
			
			
			 List <WebElement> TeamemRoleList = CommonClass.driver.findElements(By.xpath("//*[@id='select2-account-role-0-results']/li"));
	       	    Random r4 = new Random();
		        int randomValue4 = r4.nextInt(TeamemRoleList.size()); //Getting a random value
		        TeamemRoleList.get(randomValue4).click(); //Clicking on the random item in the list.
	       		waitForThread(CommonClass.iWaitForThread2);
			
			//waitForThread(CommonClass.iWaitForThread);
			//SelectTeamMemberRole.click();
			//waitForThread(CommonClass.iWaitForThread);
			
			waitForThread(CommonClass.iWaitForThread1);
			saveAndContinueTM.click();
			//waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread1);
			clickPlusButton.click();
		//	waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread);
			SelectTrade.click();
			//waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread);
			SaveButton.click();
			waitForThread(CommonClass.iWaitForThread);
			
			//waitForThread(CommonClass.iWaitForThread1);
			perServicePlusButton.click();
			waitForThread(CommonClass.iWaitForThread);
			
			//waitForThread(CommonClass.iWaitForThread1);
			addServicesLink.click();
		//	waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread1);
			clickServiceNameStep8.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			sendValue(enterServiceName,"Mulch","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			enterServiceNamesel.click();
			
			waitForThread(CommonClass.iWaitForThread);

			
			sendValue(perServiceRate,"100","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(perPmSerivceRate,"50","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(vendorperServiceRate,"250","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(VendorperPmSerivceRate,"60","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread1);
			
			
			savebtn.click();
			
			//*[@id="location-default-service-rates"]/div/div
			
			
			
			Actions actions6 = new Actions(CommonClass.driver); 
	        actions6.moveToElement(Selectframe).click().perform();
			System.out.println("Active element click properly");


						
			waitForThread(CommonClass.iWaitForThread1);
			//SelectTrade.click();
			SelectTrade1.click();
			waitForThread(CommonClass.iWaitForThread);
			
		//	waitForThread(CommonClass.iWaitForThread1);
			addAssignee.click();
			//waitForThread(CommonClass.iWaitForThread1);
			
			
			waitForThread(CommonClass.iWaitForThread2);
			clickContinueButton.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			sendValue(minRange,"500","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(maxRange,"1000","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread1);

			
			sendValue(markupMultiplier,"202122","Enter the New comapny Name");			
			waitForThread(CommonClass.iWaitForThread);
			
			waitForThread(CommonClass.iWaitForThread1);
			saveAndExit.click();
			waitForThread(CommonClass.iWaitForThread2);
			
		}
		
}
