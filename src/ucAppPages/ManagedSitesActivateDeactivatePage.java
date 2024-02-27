package ucAppPages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.UCAppData;
import lib.CommonClass;

	public class ManagedSitesActivateDeactivatePage extends ComboAppBasePage 
	 {
		
		public ManagedSitesActivateDeactivatePage() 
		{
			super();
		}			
			//Deactivate SITES module 

			//Goto Sites module
			@FindBy(linkText="Sites")
			private WebElement clickOnSitesModule;
			
			//Click to Open-Close Filters
			@FindBy(css=".fa-filter")
			private WebElement clickOnOpenFilter;
			
			//Enter Site Name
			//@FindBy(css="#user-filter-group-3 > .filter-item:nth-child(1) .select2-search__field:nth-child(1)")
			@FindBy(xpath="//*[@id='user-filter-group-3']/div[1]/div[2]/div/div/div/span/span[1]/span/ul/li/input")
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
			
					
			public void fnManagedSitesActivateDeactivate(int iTestCaseID, UCAppData testData) throws Exception 
			{
	   		    waitForThread(CommonClass.iWaitForThread1);
				
				clickOnSitesModule.click();
		        
	   		    waitForThread(CommonClass.iWaitForThread);
	   		    	   		    
	   		    waitForThread(CommonClass.iWaitForThread);
	   		  
	   		    clickOnOpenFilter.click();
	   		    waitForThread(CommonClass.iWaitForThread);
	   		    
	   		 enterSiteName.click();
	   		 

	   		 List <WebElement> SitenameList = CommonClass.driver.findElements(By.xpath("//*[@id='select2-filters_items_location_site_name_v-results']/li"));
	   		    Random r1 = new Random();
	   	     int randomValue1 = r1.nextInt(SitenameList.size()); //Getting a random value
	   	      SitenameList.get(randomValue1).click(); //Clicking on the random item in the list.
	   			waitForThread(CommonClass.iWaitForThread2);
	   		 
	   		 
	          
	   		  //  sendValue(enterSiteName,"Advance Auto 109425");
	   		   // waitForThread(CommonClass.iWaitForThread2);
	   		   // enterSiteName.sendKeys(Keys.ENTER);
	   		    
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
	   		    
	   		    clickOnOpenFilter.click();
	   		    waitForThread(CommonClass.iWaitForThread);
	   		    
			}

	}
