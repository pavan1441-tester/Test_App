package ucAppPages;

import lib.UCAppData;
import lib.CommonClass;
import net.bytebuddy.asm.Advice.Enter;

import java.awt.Robot;
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

public class NewRoleCreationPage extends ComboAppBasePage
{

	public NewRoleCreationPage() 
	{
		super();
	}
	
	@FindBy(xpath="//*[@id='mySidenav']")
	 private WebElement WebElementsidenavbar;

	//@FindBy(xpath="//*[@id='lockNavbar']")
	 //private WebElement WebElementNvbar;
	
	@FindBy(xpath="//li[@id='labor']/a/div[@class='sidenav-text']")
	 private WebElement WebElementworkforce;

	@FindBy(xpath="//li[@id='team_members']//div[@class='sidenav-text']")
	 private WebElement WebElementTeammember;

	
	//https://brightview.staging.utilizecore.com/company/roles
		//Click Main menu slide
		@FindBy(css=".fa-plus")
		private WebElement clickOnMainMenu;

		//click on WorkForce Module    
		@FindBy(css="#labor > .dropdown-toggle > .sidenav-text")
		private WebElement clickOnWorkForceModule;

		//click on Roles Section
		@FindBy(xpath="//a[contains(@href, '/company/roles')]")
		private WebElement clickOnRolesModule;

		//Click On New Role Link
		@FindBy(linkText="NEW ROLE")
		private WebElement newRoleLink;
		//Click on Limited Access 1 Month Free Trail button
		@FindBy(css="#package_2 .btn")
		private WebElement freeTrailButton;
		//Enter Role Name
		@FindBy(css="#role_name")
		private WebElement roleName;
		//Enter Description
		@FindBy(css="#role_description")
		private WebElement description;
		//Select Admin Role
		@FindBy(css="#role_admin")
		private WebElement adminRole;
		
		
		//Save button
		@FindBy(xpath="//input[@value='Save Role' and @type='submit']")	
		 private WebElement weBtnSAVERole;
		
		//Select Profile Feature
		@FindBy(xpath="//*[@id='role_role_features_attributes_0_access']")
		private WebElement markProfileFeature;
		//Select Dashboard Feature
		@FindBy(css="#role_role_features_attributes_1_access")
		private WebElement markDashboardFeature;
		//Select Calendar Feature
		@FindBy(css="#role_role_features_attributes_2_access")
		private WebElement markCalendarFeature;
		//Select Map Feature
		@FindBy(css="#role_role_features_attributes_3_access")
		private WebElement markMapFeature;
		//Select Regions Feature
		@FindBy(css="#role_role_features_attributes_4_access")
		private WebElement markRegionsFeature;
		//Select Work Orders Feature
		@FindBy(css="#role_role_features_attributes_5_access")
		private WebElement markWorkOrderFeature;
		//Select WO Can Send Vendor Work Orders Feature
		@FindBy(css="#role_role_features_attributes_6_access")
		private WebElement markCansendWoFeature;

		//Select Can see received work orders Feature
		@FindBy(css="#role_role_features_attributes_7_access")
		private WebElement markCanReceivedWoFeature;
		//Select Can see sent work orders Feature
		@FindBy(css="#role_role_features_attributes_8_access")
		private WebElement markCanSeeWoFeature;
		//Select Can Create work orders Feature
		@FindBy(css="#role_role_features_attributes_9_access")
		private WebElement markCanCreateWoFeature;
		//Select Can be assigned work orders (Can see 'TO DO' work orders + Check In Feature
		@FindBy(css="#role_role_features_attributes_10_access")
		private WebElement markCanAssignWoFeature;
		//Select Clients Feature
		@FindBy(css="#role_role_features_attributes_11_access")
		private WebElement markClientsFeature;
		//Select Clients Edit, delete or create contacts Feature
		@FindBy(css="#role_role_features_attributes_12_access")
		private WebElement markEditDeleteClientFeature;
		//Select Sites Feature
		@FindBy(css="#role_role_features_attributes_13_access")
		private WebElement markSitesFeature;
		//Select Sites Edit, delete or create contacts Feature
		@FindBy(css="#role_role_features_attributes_14_access")
		private WebElement markEditDeleteSitesFeature;
		//Select Sites Can Edit Feature
		@FindBy(css="#role_role_features_attributes_15_access")
		private WebElement markCanEditSitesFeature;
		//Select Sites Can see every site Feature
		@FindBy(css="#role_role_features_attributes_16_access")
		private WebElement markCanSeeSitesFeature;
		//Select Invoices Feature
		@FindBy(css="#role_role_features_attributes_17_access")
		private WebElement markInvoiceFeature;
		//Select Proposals Feature
		@FindBy(css="#role_role_features_attributes_18_access")
		private WebElement markProposalsFeature;
		//Select Equipment Feature
		@FindBy(css="#role_role_features_attributes_19_access")
		private WebElement markequipmentFeature;
		//Select Team Members Feature
		@FindBy(css="#role_role_features_attributes_20_access")
		private WebElement markTeamMembersFeature;

		//Select Vendors Feature
		@FindBy(css="#role_role_features_attributes_21_access")
		private WebElement markVendorsFeature;
		//Select Agreements Feature
		@FindBy(css="#role_role_features_attributes_22_access")
		private WebElement markAgreementsFeature;
		//Select Material Feature
		@FindBy(css="#role_role_features_attributes_23_access")
		private WebElement markMaterialFeature;
		//Select Purchase Order Feature
		@FindBy(css="#role_role_features_attributes_24_access")
		private WebElement markPurchaseOrderFeature;
		//Select Support Feature
		@FindBy(css="#role_role_features_attributes_25_access")
		private WebElement markSupportFeature;
		//Select Payments Feature
		@FindBy(css="#role_role_features_attributes_26_access")
		private WebElement markPaymentsFeature;
		//Select TimeTracker Feature
		@FindBy(css="#role_role_features_attributes_27_access")
		private WebElement markTimeTrackerFeature;
		//Select Adjust Time Stamp Feature
		@FindBy(css="#role_role_features_attributes_28_access")
		private WebElement markAdjustTimeStampFeature;
		//Select Lock Unlock Timestamps Feature
		@FindBy(css="#role_role_features_attributes_29_access")
		private WebElement markLockUnlockTimestampsFeature;
		//Select Team Member Timestamp Feature
		@FindBy(css="#role_role_features_attributes_30_access")
		private WebElement markTeamMemberTimestampFeature;
		//Select Trades Feature
		@FindBy(css="#role_role_features_attributes_31_access")
		private WebElement markTradesFeature;
		//Select Services Feature
		@FindBy(css="#role_role_features_attributes_32_access")
		private WebElement markServicesFeature;
		//Select Rates Feature
		@FindBy(css="#role_role_features_attributes_33_access")
		private WebElement markRatesFeature;
		//Select Items Feature
		@FindBy(css="#role_role_features_attributes_34_access")
		private WebElement markItemsFeature;
		//Select Roles Feature
		@FindBy(css="#role_role_features_attributes_35_access")
		private WebElement markRolesFeature;
		//Select Report Summary Feature
		@FindBy(css="#role_role_features_attributes_36_access")
		private WebElement markReportSummaryFeature;
		//Select BES DATA Feature
		@FindBy(css="#role_role_features_attributes_37_access")
		private WebElement markBesDataFeature;
		//Select Estimates Feature
		@FindBy(css="#role_role_features_attributes_38_access")
		private WebElement markEstimatesFeature;
		//Select BuyersGuide Feature
		@FindBy(css="#role_role_features_attributes_39_access")
		private WebElement markBuyersGuideFeature;
		//Select Sourcing Assignment Feature
		@FindBy(css="#role_role_features_attributes_40_access")
		private WebElement markSourcingAssignmentFeature;
		//Select Sourcing Selection Feature
		@FindBy(css="#role_role_features_attributes_41_access")
		private WebElement markSourcingSelectionFeature;
		//Select Tasks Feature
		@FindBy(css="#role_role_features_attributes_42_access")
		private WebElement markTasksFeature;
		//Select Site Reports Feature
		@FindBy(css="#role_role_features_attributes_43_access")
		private WebElement markSiteReportsFeature;
		//Select Save Role 
		//@FindBy(css=".pl20 > .btn")
		
		@FindBy(linkText="Work Orders")
		private WebElement workOrderModule;
		
		//Click on Main Menu List
				@FindBy(xpath="//*[@id='lockNavbar']")
				private WebElement mainMenu;
	

		//Add new Functions
		public void fnNewRoleCreation(int iTestCaseID, UCAppData testData) throws Exception
		{
		
			workOrderModule.click();
			
			waitForThread(CommonClass.iWaitForThread1);
			mainMenu.click();
			waitForThread(CommonClass.iWaitForThread1);

			//waitForThread(CommonClass.iWaitForThread1);
			//WebElementNvbar.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			WebElementworkforce.click();
		
		//waitForThread(CommonClass.iWaitForThread1);
		//clickOnMainMenu.click();
		//waitForThread(CommonClass.iWaitForThread1);

		//waitForThread(CommonClass.iWaitForThread1);
		//clickOnWorkForceModule.click();
		//waitForThread(CommonClass.iWaitForThread1);

		waitForThread(CommonClass.iWaitForThread1);
		clickOnRolesModule.click();
		waitForThread(CommonClass.iWaitForThread1);

		waitForThread(CommonClass.iWaitForThread1);
		newRoleLink.click();
		waitForThread(CommonClass.iWaitForThread1);

		waitForThread(CommonClass.iWaitForThread1);
		freeTrailButton.click();
		waitForThread(CommonClass.iWaitForThread1);

		//sendValue(roleName,"regressionrol"+str_num,"enter Role Name");
		String Roles = "RegressionSeprol" + new Random().nextInt(1000);
		CommonClass.driver.findElement(By.id("role_name")).sendKeys(Roles);
		//@FindBy(css="#role_name")

		//eval($('add').value = $('roleName').value +1);
		//i++;
		//p = i++ ;

	    //printf("Entered integer is: %d", i);
		
		//System.out.println("Scroll Down Sucessfully and Profile Button clickable");
       
		//str_num++;


		waitForThread(CommonClass.iWaitForThread);
		sendValue(description,"Regression role added by AT script Sept","Enter Description");

		waitForThread(CommonClass.iWaitForThread1);
		//adminRole.click();
		waitForThread(CommonClass.iWaitForThread1);
			
		//JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
		//js.executeScript("arguments[0].scrollIntoView(true);", markProfileFeature);
		//System.out.println("Scroll Down Sucessfully and Profile Button clickable");
		CommonClass.driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		
		
		waitForThread(CommonClass.iWaitForThread);
		markProfileFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markDashboardFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markCalendarFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markMapFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markRegionsFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markWorkOrderFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markCansendWoFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markCanReceivedWoFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markCanSeeWoFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markCanCreateWoFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markCanAssignWoFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markClientsFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markEditDeleteClientFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markSitesFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markEditDeleteSitesFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markCanEditSitesFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markCanSeeSitesFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markInvoiceFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markProposalsFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markequipmentFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread);
		markTeamMembersFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markVendorsFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markAgreementsFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markMaterialFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markPurchaseOrderFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markSupportFeature.click();
		waitForThread(CommonClass.iWaitForThread);

	//	waitForThread(CommonClass.iWaitForThread1);
		markPaymentsFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markTimeTrackerFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markAdjustTimeStampFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markLockUnlockTimestampsFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markTeamMemberTimestampFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markTradesFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markServicesFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markRatesFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markItemsFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markRolesFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markReportSummaryFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markBesDataFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markEstimatesFeature.click();
		//waitForThread(CommonClass.iWaitForThread1);

		waitForThread(CommonClass.iWaitForThread);
		markBuyersGuideFeature.click();
		//waitForThread(CommonClass.iWaitForThread1);

		waitForThread(CommonClass.iWaitForThread);
		markSourcingAssignmentFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markSourcingSelectionFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markTasksFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		markSiteReportsFeature.click();
		waitForThread(CommonClass.iWaitForThread);

		//waitForThread(CommonClass.iWaitForThread1);
		//saveRoleButtton.click();
		weBtnSAVERole.click();
		waitForThread(CommonClass.iWaitForThread2);
		}
		
		//Role edit Addtional locators
		
		//private WebElement workorder;
		@FindBy(xpath="/html//li[@id='work_order']/a/div[1]")
		private WebElement workorderclick;
		
		@FindBy(xpath="//*[@id='page-content']/div/div/table/tbody/tr[1]/th[2]")
		private WebElement contentclick;
		
		
		@FindBy(linkText="Edit")
		private WebElement EditRoleclick;
		
		//Extra locatrors for Delete the role
		
		@FindBy(xpath="//*[@id='page-content']/div/div/table/tbody/tr[1]/th[4]")
		private WebElement DeleteContectclick;
		
		@FindBy(xpath="(//table/tbody/tr)[last()]/td[1]/label")
		private WebElement Lastrowcheckboxclick;
		
		
		@FindBy(xpath="//div[@id='page-content']//h1")
		private WebElement pageheading1;
		
		
		//@FindBy(xpath="//*[@id='role-delete-link']")
		@FindBy(linkText="Delete")
		private WebElement Deleteoptn;


       //Role Edit Method
		public void fnNewRoleEdition(int iTestCaseID, UCAppData testData) throws Exception
		{
			
			//CommonClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			waitForThread(CommonClass.iWaitForThread2);
			System.out.println("Start the functionality of Role Edition");

			//WebDriverWait Tripbtn = new WebDriverWait(CommonClass.driver, 20);
             workOrderModule.click();
			
			waitForThread(CommonClass.iWaitForThread1);
			mainMenu.click();
			waitForThread(CommonClass.iWaitForThread1);
			//waitForThread(CommonClass.iWaitForThread1);

			//waitForThread(CommonClass.iWaitForThread1);
			//WebElementNvbar.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			WebElementworkforce.click();
		
	

		waitForThread(CommonClass.iWaitForThread1);
		clickOnRolesModule.click();
		waitForThread(CommonClass.iWaitForThread1);
		
		contentclick.click();
		waitForThread(CommonClass.iWaitForThread1);
		
		System.out.println("Edit of Role start");
   
		EditRoleclick.click();
		
		waitForThread(CommonClass.iWaitForThread1);
		freeTrailButton.click();
		waitForThread(CommonClass.iWaitForThread1);
		
		String Roles = "regressionEditrol" + new Random().nextInt(1000);
		CommonClass.driver.findElement(By.id("role_name")).sendKeys(Roles);
	
		waitForThread(CommonClass.iWaitForThread);
		sendValue(description,"Regression role Edited by AT script Sept","Enter Description");
		
		
		if(!markProfileFeature.isSelected())
			markProfileFeature.click();
		
		if(!markDashboardFeature.isSelected())
			markDashboardFeature.click();
		
		 if(!markCalendarFeature.isSelected())	
			markCalendarFeature.click();
			waitForThread(CommonClass.iWaitForThread);
	
		  if(!markMapFeature.isSelected())
			markMapFeature.click();
		  
	        JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
			js.executeScript("arguments[0].scrollIntoView(true);", weBtnSAVERole);
			System.out.println("Scroll Down Sucessfully and and Save Edited role clickable");
			waitForThread(CommonClass.iWaitForThread2);

			
		  		  weBtnSAVERole.click();
			waitForThread(CommonClass.iWaitForThread2);
		
							
			
		}

       //Role Deletion method
		public void fnRoleDeletion(int iTestCaseID, UCAppData testData) throws Exception
		{
			
			waitForThread(CommonClass.iWaitForThread2);
			System.out.println("Start the functionality of Role Deletion");

             workOrderModule.click();
			
			waitForThread(CommonClass.iWaitForThread1);
			mainMenu.click();
			waitForThread(CommonClass.iWaitForThread1);
			waitForThread(CommonClass.iWaitForThread1);

			//waitForThread(CommonClass.iWaitForThread1);
			//WebElementNvbar.click();
			//waitForThread(CommonClass.iWaitForThread1);
			
			WebElementworkforce.click();
		
			System.out.println("click  on the workforce");


		  waitForThread(CommonClass.iWaitForThread1);
		  clickOnRolesModule.click();
		   waitForThread(CommonClass.iWaitForThread1);
		
		  DeleteContectclick.click();
		  waitForThread(CommonClass.iWaitForThread1);
		  
		  //Scroll down upto last record
		     JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
			js.executeScript("arguments[0].scrollIntoView(true);", Lastrowcheckboxclick);
			System.out.println("Scroll Down Sucessfully and Last Row chexkbox clickable");

			  waitForThread(CommonClass.iWaitForThread);

			Lastrowcheckboxclick.click();
			 waitForThread(CommonClass.iWaitForThread);

			
			 //Scroll Up upto Page Heading option visible
		     JavascriptExecutor js1 = ((JavascriptExecutor) CommonClass.driver);
			js1.executeScript("arguments[0].scrollIntoView(true);", pageheading1);
			System.out.println("Scroll up Sucessfully and Delete option visible and clickable");
			
			  waitForThread(CommonClass.iWaitForThread2);
			 
			  Deleteoptn.click();
					
			  waitForThread(CommonClass.iWaitForThread2);
			  
			  //Pop up window handles for Accept
				CommonClass.driver.switchTo().alert().accept();
				
				waitForThread(CommonClass.iWaitForThread1);

	
		

		}

}
