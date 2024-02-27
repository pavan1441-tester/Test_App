package ucAppPages;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.UCAppData;
import lib.CommonClass;

public class SiteActivateandDeactivatePage extends ComboAppBasePage 
 {
	
	public SiteActivateandDeactivatePage() 
	{
		super();
	}			
		//Deactivate SITES module 

		//Goto Sites module
		@FindBy(linkText="Sites")
		private WebElement clickOnSitesModule;
		
		//Click on MySites logo
		@FindBy(css=".fa-home-lg")
		private WebElement clickOnMySitesLogo;
		
		//Click to Open-Close Filters
		@FindBy(css=".fa-filter")
		private WebElement clickOnOpenFilter;
		
		//Enter Site Name
		@FindBy(css="#user-filter-group-3 > .filter-item:nth-child(1) .select2-search__field:nth-child(1)")
		private WebElement enterSiteName;
		
		//Click on Apply Filter Button
		@FindBy(xpath="//input[@value='Run Filters']")
		private WebElement clickApplyFilterButton;
		
		//Click on Deactivate Site button
		@FindBy(css=".outer-tbody:nth-child(2) .btn-outline-danger")
		private WebElement clickOnDeactivateButton;
		
		//On confirmation Pop-up click on Deactivate button
		@FindBy(css="#deactivate-site")
		private WebElement confirmDeactivateButton;
		
		//Enter Full Name
		@FindBy(xpath="//input[@id='vendors_clients_location_last_deactivated_by']")
		private WebElement enterFullName;

		//Click on I have agree terms and condition checkbox
		@FindBy(xpath="//input[@id='vendors_clients_location_terms_of_service']")
		private WebElement clickOnTermsAndCondition;
		
		//Click On Final Deactivate Button
		@FindBy(css=".modal-footer .btn-outline-danger")
		private WebElement clickOnFinalDeactivateButton;
		
		//Activate Site
		
		//Click on Inactive Sites Logo 
		@FindBy(css=".inactive-sites-link > .fa")
		private WebElement inactiveSitesLogo;
				
		//Click on Activate Site button
		@FindBy(linkText="Activate")
		private WebElement clickOnActivateButton;
		
		//Click on Clear Filter
		@FindBy(xpath="//input[@value='Clear']")
		private WebElement clearFilter;
		
				
		public void fnMySitesActivateDeactive(int iTestCaseID, UCAppData testData) throws Exception 
		{
   		    waitForThread(CommonClass.iWaitForThread1);
			
			clickOnSitesModule.click();
	        
   		    waitForThread(CommonClass.iWaitForThread);
   		    
   		    clickOnMySitesLogo.click();
   		    
   		    waitForThread(CommonClass.iWaitForThread);
   		  
   		    clickOnOpenFilter.click();
   		    waitForThread(CommonClass.iWaitForThread);
   		 
   		    sendValue(enterSiteName,"Test My Site 514");
   		    waitForThread(CommonClass.iWaitForThread2);
   		    enterSiteName.sendKeys(Keys.ENTER);
   		    
   		    waitForThread(CommonClass.iWaitForThread);
   		    clickApplyFilterButton.click();
   		   
   		    waitForThread(CommonClass.iWaitForThread1);
   		    clickOnOpenFilter.click();
   		 
   		    WebDriverWait clickOnDeactivate = new WebDriverWait(CommonClass.driver, 30);
   		 	clickOnDeactivate.until(ExpectedConditions.elementToBeClickable(clickOnDeactivateButton));
   			clickOnDeactivateButton.click();
			//clickOnDeactivateButton.click();
   		    
   		    System.out.println("Deactivate button clicked");
   		    
   		    waitForThread(CommonClass.iWaitForThread2);
   		    
   		    confirmDeactivateButton.click();
   		    
   		    waitForThread(CommonClass.iWaitForThread);
 			
   		    sendValue(enterFullName,"Regression Scripts by PVS");
   			waitForThread(CommonClass.iWaitForThread1);

   			WebDriverWait TermsAndConditions = new WebDriverWait(CommonClass.driver, 30);
   			TermsAndConditions.until(ExpectedConditions.elementToBeClickable(clickOnTermsAndCondition));
   			clickOnTermsAndCondition.click();
			
   		    waitForThread(CommonClass.iWaitForThread1);

   		    clickOnFinalDeactivateButton.click();
   		    
   		    waitForThread(CommonClass.iWaitForThread1);
   		    
   		    inactiveSitesLogo.click();
   		    waitForThread(CommonClass.iWaitForThread2);
   		    
   		    clickOnActivateButton.click();
   		    waitForThread(CommonClass.iWaitForThread2);

   		    clickOnOpenFilter.click();
   		    waitForThread(CommonClass.iWaitForThread);
   		    
   		    clearFilter.click();
   		    waitForThread(CommonClass.iWaitForThread1);
   		    
		}

}

