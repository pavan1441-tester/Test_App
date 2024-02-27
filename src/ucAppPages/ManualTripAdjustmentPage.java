package ucAppPages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class ManualTripAdjustmentPage extends ComboAppBasePage {

	public ManualTripAdjustmentPage() 
	{
		super();
	}	
		//Click on Filters Logo
		@FindBy(css=".fa-filter")
		private WebElement clickOnFiltersLogo;
		
		//Click on Status Filter
		@FindBy(css=".collapse.panel-body > div:nth-of-type(9) .select2.select2-container.select2-container--bootstrap  span[role='combobox'] > .select2-selection__rendered  input[role='searchbox']")
		private WebElement statusFilter;
		
		//Click on Run Filter button
		@FindBy(xpath="//input[@value='Run Filters']")
		private WebElement runFilter;
		
		//Click on Clear Filter button
		@FindBy(xpath="//input[@value='Clear']")
		private WebElement clearFilter;
		
		//Click on WO number
		@FindBy(css=".card:nth-child(2) .inline-block")
		private WebElement clickOnWoNumber;
		
		//Click on Manual Adjustment Logo
		@FindBy(css=".manual-adjustment-link")
		private WebElement clickOnManualAdjustmentLogo;
		
		//Enter Check in Time
		@FindBy(css="#tradesmen_trip_services_attributes_0_service_adjustments_attributes_0_check_in_time")
		private WebElement clickOnCheckInTime;
		
		//Enter Check Out Time
		@FindBy(css="#tradesmen_trip_services_attributes_0_service_adjustments_attributes_0_check_out_time")
		private WebElement clickOnCheckOutTime;
		
		//Click on Save Button
		@FindBy(css=".w100")
		private WebElement clickOnSaveButton;
		
		public void fnManualTripAdjustment(int iTestCaseID, UCAppData testData) throws Exception 
		{
			waitForThread(CommonClass.iWaitForThread);
			clickOnFiltersLogo.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread1);
			statusFilter.click();
			waitForThread(CommonClass.iWaitForThread);
			
			statusFilter.sendKeys("Scheduled On Tech's Mobile");
			waitForThread(CommonClass.iWaitForThread);
			statusFilter.sendKeys(Keys.ENTER);
			
			waitForThread(CommonClass.iWaitForThread1);
			runFilter.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread);
			clickOnFiltersLogo.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread2);
			clickOnWoNumber.click();
			waitForThread(CommonClass.iWaitForThread1);	
			
			//Switch to New Tab
			ArrayList<String> Newtab = new ArrayList<String> (CommonClass.driver.getWindowHandles()); 
		    CommonClass.driver.switchTo().window(Newtab.get(1));
		    
			waitForThread(CommonClass.iWaitForThread2);		
			clickOnManualAdjustmentLogo.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			String woAssigneeName = CommonClass.driver.findElement(By.xpath("//div[@class='member-detail']/p")).getText();
			waitForThread(CommonClass.iWaitForThread1);
			System.out.println(woAssigneeName);

			CommonClass.driver.findElement(By.cssSelector("#select2-tradesmen_trip_contractor_id-container")).click();
			
			waitForThread(CommonClass.iWaitForThread);

			CommonClass.driver.findElement(By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input")).sendKeys(woAssigneeName);
			waitForThread(CommonClass.iWaitForThread);
			CommonClass.driver.findElement(By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input")).sendKeys(Keys.ENTER);
			
			waitForThread(CommonClass.iWaitForThread);
			clickOnCheckInTime.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread);
			clickOnCheckOutTime.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread);
			clickOnSaveButton.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			//Switch to New Tab
			ArrayList<String> parentTab = new ArrayList<String> (CommonClass.driver.getWindowHandles()); 
		    CommonClass.driver.switchTo().window(parentTab.get(0));
			
			waitForThread(CommonClass.iWaitForThread1);
			clickOnFiltersLogo.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			clearFilter.click();
			waitForThread(CommonClass.iWaitForThread1);	
			
		}
}