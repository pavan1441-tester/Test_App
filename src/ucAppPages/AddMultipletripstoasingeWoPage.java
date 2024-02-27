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

public class AddMultipletripstoasingeWoPage extends ComboAppBasePage 
{

	public AddMultipletripstoasingeWoPage() 
	{
		super();
	}			
				//Open Filters
				@FindBy(xpath="//span[@id='filter-control']/i")	
			    private WebElement clickOnFilters;
				
				//Click on Site Name Filter
				@FindBy(css="div:nth-of-type(9) > .collapse.panel-body > div:nth-of-type(1) .select2.select2-container.select2-container--bootstrap  span[role='combobox'] > .select2-selection__rendered  input[role='searchbox']")	
			    private WebElement clickOnSiteNameFilter;
				
				//Click on Run Filter
				@FindBy(xpath="//input[@value='Run Filters']")	
			    private WebElement runFilter;
				
				//Click on Clear Filter button
				@FindBy(xpath="//input[@value='Clear']")
				private WebElement clearFilter;
				
				//Click on WO number
				@FindBy(css=".card:nth-child(2) .inline-block")
				private WebElement clickOnWoNumber;
				
				//Click on Plus button to add new button
				@FindBy(css=".create-trip-button > .fa")	
				private WebElement clickOnCreateTripBtn;
					
				@FindBy(xpath="//*[@id='trip_work_order_expiration_date']")
			    private WebElement weworkorderclosedate;
				
				@FindBy(xpath="//*[@id='work_order_trips_attributes_0_start_date']")
			    private WebElement wewtripstartdate;
				
				//@FindBy(xpath="//*[@id='team_member_assignee_type']")
				@FindBy(xpath="//*[@id='tradesmen_assignee_type']")
			    private WebElement weselectAssigntype;
				
				//*[@id="tradesmen_assignee_type"]
				
				//@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_team_member_ids-container']")
				//@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_tradesmen_ids-container']")
				@FindBy(xpath="//*[@id='select2-trip_tradesmen_ids-container']/span")
			    private WebElement weselectAssignTrademan;
					
				//@FindBy(xpath="//span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[text() = 'Test Crew1']")
				
				///html/body/span/span/span[2]/ul/li[1]/ul/li[4]
				//@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_team_member_ids-results']/li[1]/ul/li[2]")
						
				//@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_tradesmen_ids-results']/li[1]/ul/li[text() = 'Test Crew']")
			   // private WebElement weselectAssignTeammembersel;
				
				//@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_trade_id-container']/span")
				@FindBy(xpath="//*[@id='select2-trip_trade_id-container']")
			    private WebElement weselectTrade;
				
				@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_trade_id-results']/li[text() = 'Land']")
			    private WebElement weselectTradeSel;
				
				//@FindBy(xpath="//input[contains(@placeholder, 'Select Trade Service')]")
				@FindBy(xpath="//*[@id='wo-trip-trade-services-panel']/div[2]/div/span/span[1]/span/ul/li/input")
				               //*[@id="wo-trip-trade-services-panel"]/div[2]/div/span/span[1]/span/ul/li/input
						    private WebElement weTradeServices;
				
				@FindBy(xpath="//span[@class='select2-dropdown select2-dropdown—below']//ul[@role='listbox']/li[@role='option']")
			    private WebElement weTradeServicesSel;
				
				@FindBy(xpath="//*[@id='status']/label[1]")
			    private WebElement weStatus;
							
				@FindBy(xpath="//input[contains(@placeholder, 'Select Task')]")
			    private WebElement weTradeTask;
			
				//Click On Dispatch Button
				@FindBy(xpath="//div[@id='trip-nested-fields-new-trip']/div[2]/div/input[1]")
			    private WebElement clickOnDispatch;

	public void fnAddMultipletripstoasingeWoPage(int iTestCaseID, UCAppData testData) throws Exception 
	{
		waitForThread(CommonClass.iWaitForThread);
		clickOnFilters.click();
		waitForThread(CommonClass.iWaitForThread1);
		
		//clickOnSiteNameFilter.sendKeys("BV Client Amityville");
		clickOnSiteNameFilter.click();
		waitForThread(CommonClass.iWaitForThread);

		 List<WebElement> sitelist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-filters_items_locations_name|work_orders#index_v-results']/li")); //select random Department Name
			Random randomsite = new Random();
			int randomValue5 = randomsite.nextInt(sitelist.size()); //Getting a random value
			sitelist.get(randomValue5).click(); //Clicking on the random item in the list.
			waitForThread(CommonClass.iWaitForThread2);
	    
		
		//waitForThread(CommonClass.iWaitForThread);
		//clickOnSiteNameFilter.sendKeys(Keys.ENTER);
		
		waitForThread(CommonClass.iWaitForThread1);
		runFilter.click();
		waitForThread(CommonClass.iWaitForThread1);
		
		waitForThread(CommonClass.iWaitForThread);
		clickOnFilters.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		clickOnWoNumber.click();
		waitForThread(CommonClass.iWaitForThread1);	
		
		//Switch to New Tab
		ArrayList<String> Newtab = new ArrayList<String> (CommonClass.driver.getWindowHandles()); 
	    CommonClass.driver.switchTo().window(Newtab.get(1));
		
		waitForThread(CommonClass.iWaitForThread);
		clickOnCreateTripBtn.click();
		waitForThread(CommonClass.iWaitForThread1);
		
		
		
		waitForThread(CommonClass.iWaitForThread2);
		weselectAssigntype.click();
		waitForThread(CommonClass.iWaitForThread2);
		weselectAssigntype.sendKeys(Keys.PAGE_DOWN);
		waitForThread(CommonClass.iWaitForThread2);
		weselectAssignTrademan.click();
		waitForThread(CommonClass.iWaitForThread1);
		//selectValue(weselectAssignTrademan, "Harish patil", "selettctrademan");
		//weselectAssignTeammembersel.click();
		
		 List<WebElement> Trdaesmenlist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-trip_tradesmen_ids-results']/li[2]/ul/li")); //select random Department Name
			Random randomtradesmen = new Random();
			int randomValue6 = randomtradesmen.nextInt(Trdaesmenlist.size()); //Getting a random value
			Trdaesmenlist.get(randomValue6).click(); //Clicking on the random item in the list.
			waitForThread(CommonClass.iWaitForThread2);
	    
		//waitForThread(CommonClass.iWaitForThread2);
		weselectTrade.click();
		waitForThread(CommonClass.iWaitForThread1);
	//	weselectTradeSel.click();                                                
		 List<WebElement> tradelist1 = CommonClass.driver.findElements(By.xpath("//*[@id='select2-trip_trade_id-results']/li")); //select random Department Name
			Random randomtradel = new Random();
			int randomValue7 = randomtradel.nextInt(tradelist1.size()); //Getting a random value
			waitForThread(CommonClass.iWaitForThread2);
			tradelist1.get(randomValue7).click(); //Clicking on the random item in the list.
			waitForThread(CommonClass.iWaitForThread2);
	        
		//waitForThread(CommonClass.iWaitForThread1);
		weTradeServices.click();
		waitForThread(CommonClass.iWaitForThread1);
		weTradeServicesSel.click();
		waitForThread(CommonClass.iWaitForThread2);
		weStatus.click();
		
		waitForThread(CommonClass.iWaitForThread1);
		weTradeTask.click();
		
		//weStatus.sendKeys(Keys.PAGE_DOWN);
		waitForThread(CommonClass.iWaitForThread1);
		
		waitForThread(CommonClass.iWaitForThread1);
		clickOnDispatch.click();
		waitForThread(CommonClass.iWaitForThread1);
		
			//switch control to Parent tab
		ArrayList<String> parenttab = new ArrayList<String> (CommonClass.driver.getWindowHandles()); 
	    CommonClass.driver.switchTo().window(parenttab.get(0));
		
		waitForThread(CommonClass.iWaitForThread);
		clickOnFilters.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		clearFilter.click();
		waitForThread(CommonClass.iWaitForThread1);	

}

}




