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

import org.apache.commons.io.filefilter.TrueFileFilter;
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

public class OldBulkSchedulerPage extends ComboAppBasePage {

	public OldBulkSchedulerPage() 
	{
		super();
	}
		//Goto Sites module
		@FindBy(linkText="Sites")
		private WebElement clickOnSitesModule;

		//Click on All Sites Selection Checkbox
		@FindBy(xpath="//div[@id='locations-list-holder']/table//th[@class='display-flex']//label[@class='checkbox-custom-label']")	
	    private WebElement selectAllSitesCheckbox;
		
	   //Click on Old bulk schedular button
		@FindBy(xpath="//div[@id='locations-list-holder']/table//th[@class='display-flex']/span[@class='pl6 pt5 schedule-sites-icon']/a/i")	
	    private WebElement oldBulkscheduleButton;
		
		//Select Start Date and Time
		@FindBy(css="input#bulk_work_order_start_date")
	    private WebElement workorderStartDate;
		
		/*Select End Date and Time
		@FindBy(css="input#bulk_work_order_end_date")
	    private WebElement workorderCloseDate;

		//Select Expiration Date and Time
		@FindBy(css="input#bulk_work_order_expiration_date")
	    private WebElement workorderExpirationDate;		*/
		
		//Click On Trade Name
		@FindBy(xpath="//form[@id='new_bulk_work_order']/div[5]/div/div[1]/div/span//span[@role='combobox']/span[@role='textbox']")
	    private WebElement clickOnTrade;
		
		//Enter Trade Name
		@FindBy(xpath="(//input[@type='search'])[33]")
	    private WebElement searchName;
		
		//Select Trade Name
		
		//Click On Trade Service Name
		@FindBy(css=".bulk_work_order_trade_service_id [role='textbox']")
	    private WebElement clickOnTradeService;
		
		//Enter Trade Service Name
		@FindBy(css=".select2-dropdown.select2-dropdown--below  input[role='searchbox']")
	    private WebElement enterTradeServiceName;
		
		//Select Trade-Service Name		
		
		//Select Task Name
		
		//Click On Task Name
		@FindBy(css=".select2.select2-container.select2-container--default  span[role='combobox'] > .select2-selection__rendered  input[role='searchbox']")
	    private WebElement clickOnTask;
		
		//Enter Task Name
		@FindBy(css=".select2.select2-container.select2-container--below.select2-container--default  span[role='combobox'] > .select2-selection__rendered  input[role='searchbox']")
	    private WebElement enterTaskName;
		
		//Select Trade-Service Name	
		
		//Enter Comment
		@FindBy(css="trix-editor#bulk_work_order_problem")
		private WebElement enterComment;
		
		//Mark Vendor has to accept or reject trip checkbox
		@FindBy(css="input#bulk_work_order_vendor_acceptance_required")
		private WebElement markVendorHasTo;

		//Mark Send WO Updates to Vendor
		@FindBy(css="input#bulk_work_order_send_updates_to_vendor")
		private WebElement markSendUpdatesToVendor;

		//Mark Send Estimated Start and End Date to vendor
		@FindBy(css="input#bulk_work_order_send_est_start_and_end_time_to_vendor")
		private WebElement markSendEstimatesToVendor;

		//Click On Create Button
		@FindBy(css="form#new_bulk_work_order input[name='commit']")
		private WebElement createButton;

		//Add new Functions
		public void fnOldBulkScheduler(int iTestCaseID, UCAppData testData) throws Exception
		{
		 
		waitForThread(CommonClass.iWaitForThread);
		clickOnSitesModule.click();
		waitForThread(CommonClass.iWaitForThread2);
		 
		waitForThread(CommonClass.iWaitForThread);
		selectAllSitesCheckbox.click();
		waitForThread(CommonClass.iWaitForThread2);
		 
		waitForThread(CommonClass.iWaitForThread);
		oldBulkscheduleButton.click();
		waitForThread(CommonClass.iWaitForThread2);
		 
		waitForThread(CommonClass.iWaitForThread);
		workorderStartDate.click();
		waitForThread(CommonClass.iWaitForThread);
		 
		waitForThread(CommonClass.iWaitForThread);
		clickOnTrade.click();
		waitForThread(CommonClass.iWaitForThread);
		
		//sendValue(searchName,"Land","Enter the Trade Name");
		//waitForThread(CommonClass.iWaitForThread);
		//searchName.sendKeys(Keys.ENTER);
		
		  List<WebElement> calltypelist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-bulk_work_order_trade_id-results']/li")); //select random Department Name
			Random randomCalltypetName = new Random();
			int randomValue = randomCalltypetName.nextInt(calltypelist.size()); //Getting a random value
			calltypelist.get(randomValue).click(); //Clicking on the random item in the list.
			waitForThread(CommonClass.iWaitForThread2);
	    
		
		waitForThread(CommonClass.iWaitForThread);
		clickOnTradeService.click();
		waitForThread(CommonClass.iWaitForThread);
		
		
		
		List<WebElement> Tradeservicelist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-bulk_work_order_trade_service_id-results']/li")); //select random Department Name
		if (Tradeservicelist == null || Tradeservicelist.isEmpty()) 
	       {
			
			System.out.println("Service is Empty");
			
			sendValue(enterComment,"AT test old bulk Scheduler testing","Enter the Comment");
			waitForThread(CommonClass.iWaitForThread);
			
			waitForThread(CommonClass.iWaitForThread);
			markVendorHasTo.click();
			 
			waitForThread(CommonClass.iWaitForThread);
			markSendUpdatesToVendor.click();

			
			waitForThread(CommonClass.iWaitForThread);
			markSendEstimatesToVendor.click();

			waitForThread(CommonClass.iWaitForThread);
			createButton.click();
			waitForThread(CommonClass.iWaitForThread);

	       }

			 else
				{
					System.out.println("Service is Not empty");
	        
					Random randomTradeName = new Random();
					int randomValue1 = randomTradeName.nextInt(Tradeservicelist.size()); //Getting a random value
					Tradeservicelist.get(randomValue1).click(); //Clicking on the random item in the list.
					waitForThread(CommonClass.iWaitForThread2);
					
					sendValue(enterComment,"AT test old bulk Scheduler testing","Enter the Comment");
					waitForThread(CommonClass.iWaitForThread);
					
					waitForThread(CommonClass.iWaitForThread);
					markVendorHasTo.click();
					 
					waitForThread(CommonClass.iWaitForThread);
					markSendUpdatesToVendor.click();

					
					waitForThread(CommonClass.iWaitForThread);
					markSendEstimatesToVendor.click();

					waitForThread(CommonClass.iWaitForThread);
					createButton.click();
					waitForThread(CommonClass.iWaitForThread);

			    
				 
				}
			
		}
}
		
		
		//sendValue(searchName,"Debris Removal","Enter the Trade-Service Name");
		//sendValue(searchName,"Landscaping Services","Enter the Trade-Service Name");

		//waitForThread(CommonClass.iWaitForThread);
		//searchName.sendKeys(Keys.ENTER);
		
		//waitForThread(CommonClass.iWaitForThread);
		//clickOnTask.click();
		//waitForThread(CommonClass.iWaitForThread2);
		
		//sendValue(searchName,"Land","Enter the Task Name");
		//waitForThread(CommonClass.iWaitForThread);
		//searchName.sendKeys(Keys.ENTER);
		
		//waitForThread(CommonClass.iWaitForThread2);
				//}
		//}
//}
//}