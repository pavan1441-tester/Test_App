
package ucAppPages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class NewMySiteCreation extends ComboAppBasePage 
{
	
	public NewMySiteCreation() 
	{
		super();
	}

     
	//SITES module 

	//Goto Sites module
	@FindBy(linkText="Sites")
	private WebElement clickOnSitesModule;
	
	//Click on plus button
	@FindBy(xpath="//a[@class='create-trip-button rb-fixed text-white location']")
	private WebElement clickOnNewSiteCreationButton;
	
	//Click on My Site Option
	@FindBy(css=".col-md-6:nth-child(3) > .choose-type:nth-child(2)")
	private WebElement clickOnMySiteOption;

	
	//Click on Continue Button on Manage site
	//@FindBy(css="input[value*='Continue']")
	@FindBy(xpath="//input[@value='Continue' and @type='submit']")	
	//@FindBy(xpath="//input[@value='CONTINUE']")
	private WebElement clickOnContinueButton;
	
	//Click on Continue Button
	
	//@FindBy(xpath="//div[@id='active-sites']/table[@class='table table-expandable']//div[@class='col-sm-2 mt20']/a[@href='/company/wizard/clients/6/locations/new']")
	@FindBy(linkText="Add New")
	private WebElement AddnewSite;
	
	
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
	// @FindBy(xpath="//*[@id='select2-location_cc_location_territory_id-result-g2j5-2']")
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
	
	//Add new Functions
	public void fnNewMySiteCreation(int iTestCaseID, UCAppData testData) throws Exception
	{
	// TODO Auto-generated method stub
	
	//Site Creation Functionality
	 
	waitForThread(CommonClass.iWaitForThread);
	clickOnSitesModule.click();
	waitForThread(CommonClass.iWaitForThread2);
	 
	waitForThread(CommonClass.iWaitForThread2);
	clickOnNewSiteCreationButton.click();
	waitForThread(CommonClass.iWaitForThread);
	
	waitForThread(CommonClass.iWaitForThread);
	clickOnMySiteOption.click();
	waitForThread(CommonClass.iWaitForThread);
	 
	waitForThread(CommonClass.iWaitForThread);
	clickOnContinueButton.click();
	waitForThread(CommonClass.iWaitForThread2);
	 
	AddnewSite.click();
	 
	//sendValue(siteName,"RV_Test202210","Enter the New comapny Name");
	//waitForThread(CommonClass.iWaitForThread);
	waitForThread(CommonClass.iWaitForThread1);
	String siteName = "AT Regresion Aug site" + new Random().nextInt(1000);
	CommonClass.driver.findElement(By.id("location_name")).sendKeys(siteName);
	
	
	 
	//sendValue(CoinID,"RV_Test202210","Enter the New comapny Name");
	//waitForThread(CommonClass.iWaitForThread);
	
	 if(!CommonClass.driver.findElements(By.xpath("//*[@id='location_coins_connection_attributes_external_id']")).isEmpty())
	 {
	
	System.out.println("coin id Unable");
	String CoinID = "RV_Test0803" + new Random().nextInt(1000);
	CommonClass.driver.findElement(By.id("location_coins_connection_attributes_external_id")).sendKeys(CoinID);
		
	System.out.println("iframe switch properly");
	
	    }
	  else
	   {
	   	System.out.println("coin id disable");
	   	
	 }
		
	/*waitForThread(CommonClass.iWaitForThread);
	String CoinID = "RV_TestS29807" + new Random().nextInt(1000);
	CommonClass.driver.findElement(By.id("location_coins_connection_attributes_external_id")).sendKeys(CoinID);*/

	//sendValue(aptSuit,"RV_Test202210","Enter the New comapny Name");
	//waitForThread(CommonClass.iWaitForThread);
	
	String aptSuit = "RV_TestS29807" + new Random().nextInt(1000);
	CommonClass.driver.findElement(By.id("location_address_attributes_apt_or_suite")).sendKeys(aptSuit);

	 apiAddressStep1.sendKeys("Houston, TX, USA"); //api address
	 waitForThread(CommonClass.iWaitForThread);
	 apiAddressStep1.sendKeys(Keys.DOWN);
	 //Thread.sleep(2000L);
	 waitForThread(CommonClass.iWaitForThread1);
	 
	 apiAddressStep1.sendKeys(Keys.ENTER);
	 
	 
	//Thread.sleep(2000L);
	waitForThread(CommonClass.iWaitForThread2);
	 
	//apiAddressStep1.sendKeys(Keys.DOWN);
	//Thread.sleep(2000L);
	//waitForThread(CommonClass.iWaitForThread1);
	 
	apiAddressdetStep1.sendKeys("Houston, TX, USA");
	 
	//sendValue(apiAddressdetStep1,"RV_Test202122","Enter the New comapny Name");
	 waitForThread(CommonClass.iWaitForThread1);
	 
	 
	apiAddressdetStep1.sendKeys(Keys.DOWN);
	waitForThread(CommonClass.iWaitForThread1);
	apiAddressdetStep1.sendKeys(Keys.ENTER);
	 
	waitForThread(CommonClass.iWaitForThread1);
	
	 if(!CommonClass.driver.findElements(By.xpath("//*[@id='select2-location_cc_location_territory_id-container']")).isEmpty())
	 {
	
	System.out.println("Region is Unable");
	clickRegion.click();
	
	   // String CoinID = "RV_Test0803" + new Random().nextInt(1000);
	//CommonClass.driver.findElement(By.css("")).sendKeys(CoinID);
	//clickRegion.click();
	
	//sendValue(enterRegion,"RV_Test200319","Enter the Region Name");
	selectEnteredRegion.click();	
	    }
	  else
	   {
	   	System.out.println("Region is disable");
	
	}
	
	
	//clickRegion.click();
	//waitForThread(CommonClass.iWaitForThread1);
	 
	//sendValue(enterRegion,"RV_Test202218","Enter the New comapny Name");
	//waitForThread(CommonClass.iWaitForThread1);
	 
	//waitForThread(CommonClass.iWaitForThread1);
	//selectEnteredRegion.click();
	//waitForThread(CommonClass.iWaitForThread1);
	 
	waitForThread(CommonClass.iWaitForThread2);
	taxExempt.click();
	waitForThread(CommonClass.iWaitForThread1);
	 
	waitForThread(CommonClass.iWaitForThread1);
	clickPropertyManagement.click();
	waitForThread(CommonClass.iWaitForThread1);
	 
	//sendValue(enterPropertyManagement,"Core International LLC","Enter the property  Name");
	//waitForThread(CommonClass.iWaitForThread1);
	 
	waitForThread(CommonClass.iWaitForThread1);
	enterPropertyManagement.click();
	//selectPropertyManagement.click();
	waitForThread(CommonClass.iWaitForThread1);
	 
	sendValue(weextenaldist,"Core International LLC","Enter the property  Name");
	waitForThread(CommonClass.iWaitForThread1);
	 
	sendValue(weextenalregion,"LLC","Enter the property  Name");
	waitForThread(CommonClass.iWaitForThread1);
	 
	sendValue(weextenalTrigger,"LLC","Enter the property  Name");
	waitForThread(CommonClass.iWaitForThread1);
	 
	sendValue(siteInstruction,"RT_Instruction","Enter the site Instruction");
	waitForThread(CommonClass.iWaitForThread1);
	 
	waitForThread(CommonClass.iWaitForThread1);
	saveAndContinueStep1.click();
	waitForThread(CommonClass.iWaitForThread1);
	 
	//Step 2
	 
	sendValue(aptSuitStep2,"RV_Test202218","Enter the New comapny Name");
	waitForThread(CommonClass.iWaitForThread1);
	 
	sendValue(inCareOff,"RV_Test202218","Enter the New comapny Name");
	waitForThread(CommonClass.iWaitForThread1);
	 
	addressGoogle.sendKeys("Gdańsk, Poland"); //api address
	 
	//Thread.sleep(2000L);
	waitForThread(CommonClass.iWaitForThread1);
	 
	addressGoogle.sendKeys(Keys.DOWN);
	//Thread.sleep(2000L);
	waitForThread(CommonClass.iWaitForThread1);
	addressGoogle.sendKeys(Keys.ENTER);
	 
	waitForThread(CommonClass.iWaitForThread);
	 
	weBilllocAdress.sendKeys("5889 Floin Rd, Sacramento, CA 95889, USA");
	 
	waitForThread(CommonClass.iWaitForThread);
	saveAndContinueStep2.click();
	waitForThread(CommonClass.iWaitForThread2);
	 
	sendValue(firstNameContacts,"RV_TestFName","Enter the New comapny Name");
	waitForThread(CommonClass.iWaitForThread1);
	 
	sendValue(lastNameContacts,"RV_TestLName","Enter the New comapny Name");
	waitForThread(CommonClass.iWaitForThread);
	 
	sendValue(title,"Mr","Enter the New comapny Name");
	waitForThread(CommonClass.iWaitForThread);
	 
	sendValue(emailAddressContacts,"harishpatil+13@utilizecore.com","Enter the Email details");
	waitForThread(CommonClass.iWaitForThread);
	 
	sendValue(phoneContacts,"+1 333 8888 5987","Enter the Phone Details");
	waitForThread(CommonClass.iWaitForThread1);
	 
	sendValue(mobileNumberContacts,"2228986666","Enter the Contact Details");
	waitForThread(CommonClass.iWaitForThread1);
	 
	//waitForThread(CommonClass.iWaitForThread1);
	billable.click();
	waitForThread(CommonClass.iWaitForThread1);
	 
	waitForThread(CommonClass.iWaitForThread1);
	saveAndContinueStep3.click();
	waitForThread(CommonClass.iWaitForThread1);
	 
	waitForThread(CommonClass.iWaitForThread1);
	saveAndContinueEquipment.click();
	waitForThread(CommonClass.iWaitForThread1);
	 
	waitForThread(CommonClass.iWaitForThread1);
	saveAndContinueAdditional.click();
	waitForThread(CommonClass.iWaitForThread1);
	 
	//sendValue(assignee,"Harish T Pat","Enter the Trademan Name");
	//waitForThread(CommonClass.iWaitForThread1);
	 
	assignee.click();
	waitForThread(CommonClass.iWaitForThread);
		
	//waitForThread(CommonClass.iWaitForThread1);
	//assigneeSelect.click();
	
	 List <WebElement> listings2 = CommonClass.driver.findElements(By.xpath("//*[@id='ms-location_tradesmen_ids']/div[1]/ul/li"));
	    Random r2 = new Random();
      int randomValue2 = r2.nextInt(listings2.size()); //Getting a random value
      listings2.get(randomValue2).click(); //Clicking on the random item in the list.
		waitForThread(CommonClass.iWaitForThread2);
	//waitForThread(CommonClass.iWaitForThread);
	
	waitForThread(CommonClass.iWaitForThread1);
	saveAndContinueAssignee.click();
	waitForThread(CommonClass.iWaitForThread);
	
	waitForThread(CommonClass.iWaitForThread);
	clickTeamMember.click();
	waitForThread(CommonClass.iWaitForThread1);
	
	//sendValue(searchTeamMemberName,"Harish Patil","Enter the Team Member Name");			
	//waitForThread(CommonClass.iWaitForThread);
	
	//waitForThread(CommonClass.iWaitForThread);
	//SelectTeamMemberName.click();
	//waitForThread(CommonClass.iWaitForThread);
	
	 List <WebElement> TeammenerList = CommonClass.driver.findElements(By.xpath("//*[@id='select2-team-members-0-results']/li"));
	    Random r4 = new Random();
  int randomValue4 = r4.nextInt(TeammenerList.size()); //Getting a random value
  TeammenerList.get(randomValue4).click(); //Clicking on the random item in the list.
		waitForThread(CommonClass.iWaitForThread2);

	
	waitForThread(CommonClass.iWaitForThread);
	clickTeamMemberRole.click();
	waitForThread(CommonClass.iWaitForThread);
	
	//sendValue(searchTeamMemberRole,"MM","Enter the Role of Team Memmber");			
	//waitForThread(CommonClass.iWaitForThread);
	
	//waitForThread(CommonClass.iWaitForThread);
	//SelectTeamMemberRole.click();
	//waitForThread(CommonClass.iWaitForThread);
	

	 List <WebElement> TeamemRoleList = CommonClass.driver.findElements(By.xpath("//*[@id='select2-account-role-0-results']/li"));
	    Random r5 = new Random();
    int randomValue5 = r5.nextInt(TeamemRoleList.size()); //Getting a random value
    TeamemRoleList.get(randomValue5).click(); //Clicking on the random item in the list.
		waitForThread(CommonClass.iWaitForThread2);
	
	waitForThread(CommonClass.iWaitForThread);
	saveAndContinueTM.click();
	//waitForThread(CommonClass.iWaitForThread1);
	
	waitForThread(CommonClass.iWaitForThread);
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
	
	//sendValue(enterServiceName,"Mulch","Enter the New comapny Name");			
	//waitForThread(CommonClass.iWaitForThread);
	
	List <WebElement> ServNameList = CommonClass.driver.findElements(By.xpath("//*[@id='select2-service_rate_trade_service_id-results']/li"));
    Random r6 = new Random();
   int randomValue6 = r6.nextInt(TeamemRoleList.size()); //Getting a random value
    ServNameList.get(randomValue6).click(); //Clicking on the random item in the list.
	waitForThread(CommonClass.iWaitForThread2);
	
	//enterServiceNamesel.click();
	
	waitForThread(CommonClass.iWaitForThread);
	
	sendValue(perServiceRate,"100","Enter the New comapny Name");			
	waitForThread(CommonClass.iWaitForThread);
	
	sendValue(perPmSerivceRate,"50","Enter the New comapny Name");			
	waitForThread(CommonClass.iWaitForThread);
	
	sendValue(vendorperServiceRate,"250","Enter the New comapny Name");			
	waitForThread(CommonClass.iWaitForThread);
	
	sendValue(VendorperPmSerivceRate,"60","Enter the New comapny Name");			
	waitForThread(CommonClass.iWaitForThread);
	
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
	
	waitForThread(CommonClass.iWaitForThread);
	clickContinueButton.click();
	waitForThread(CommonClass.iWaitForThread);
	
	sendValue(minRange,"500","Enter the New comapny Name");			
	waitForThread(CommonClass.iWaitForThread);
	
	sendValue(maxRange,"1000","Enter the New comapny Name");			
	waitForThread(CommonClass.iWaitForThread);
	
	sendValue(markupMultiplier,"202122","Enter the New comapny Name");			
		waitForThread(CommonClass.iWaitForThread);
		
		waitForThread(CommonClass.iWaitForThread);
		saveAndExit.click();
		waitForThread(CommonClass.iWaitForThread);
	
}

}
