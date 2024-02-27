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
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WorkOrderTripcreationAllowvendortoproposeschedule extends ComboAppBasePage
{
	public WorkOrderTripcreationAllowvendortoproposeschedule() 
	{
		super();
	}
	
	@FindBy(xpath="//*[@id='work_order']/a/div[1]/i")
	private WebElement workorderclick;
	
	
	@FindBy(xpath="//*[@id='workorder-list-holder']/table/tbody[1]/tr[1]/td[3]/div/strong/a/div")
	private WebElement workorderNo;
	
	@FindBy(xpath="//*[@id='workorder-trips-panel']/div[2]/a")
	private WebElement workorderAddtrip;
	
	
	@FindBy(xpath="//div[@class='modal-body']/div//div[@class='col-sm-3 p0']/span[2]//span[@role='combobox']/span[@role='presentation']/b[@role='presentation']")
	private WebElement workordertripschdulemode;
	
	@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--below']//input[@role='searchbox']")
	private WebElement workordertripschdulemodeAdd;
	
	
	
	@FindBy(xpath="//ul[@id='select2-scheduling_mode-results']/li[@role='option']")
	private WebElement workordertripschdulemodeflexible;
	
	@FindBy(xpath="//*[@id='draft_trip_propose_start_date']")
	private WebElement workordertripstartdate;
	
	
	@FindBy(xpath="//*[@id='draft_trip_propose_end_date']")
	private WebElement workordertripenddate;

	
	@FindBy(xpath="//*[@id='draft_trip_propose_expiration_date']")
	private WebElement workordertripexpirationdate;
	
	
	@FindBy(xpath="//*[@id='draft_trip_propose_description']")
	private WebElement workordertripdescription;
	
	@FindBy(xpath="//*[@id='assignee_type_vendor']/div[1]/div/div/span/span[1]/span/span[2]/b")
	private WebElement assignee_type_vendor;
	
	@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--above']//input[@role='searchbox']")
	private WebElement vendorname;
	
	@FindBy(xpath="//*[@id='draft_trip_propose_vendor_acceptance_required']")
	private WebElement vendoracceptancereq;
	
	//send Draft trip button
		@FindBy(xpath="//input[@value='Send Draft Trip' and @type='submit']")	
		 private WebElement weBtnSendTrip;
		
		@FindBy(xpath="//*[@id='wo-trip-trade-accordion']/div/div/div[1]/div[2]/div/span/span[1]/span/span[2]/b")
		private WebElement weTradeoptn;
		
		@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[@role='option']")
		private WebElement weTradsel;
		
		@FindBy(xpath="//*[@id='page-content']/div[1]/div[2]/div[2]/div/div[2]/div")
		private WebElement weGettingwono;
		
		
		@FindBy(xpath="//*[@id='page-content']/div[1]/div[2]/div[3]/ul/li[2]/a")
		private WebElement weActivity;
		
		@FindBy(xpath="//*[@id='workorder-trips-panel']/div[1]/div/div[2]/span[1]/a")
		private WebElement weBackoptn;
		
		@FindBy(xpath="//div[@class='trip-details-header']/div[2]/span/a/i")
		private WebElement weTripdetails;
	
	    //Invite the Team Member
		public void fnWoTripCvendortoPseschduleCreation(int iTestCaseID, UCAppData testData) throws Exception
		{
			workorderclick.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			workorderNo.click();
			waitForThread(CommonClass.iWaitForThread1);
			workorderAddtrip.click();
			waitForThread(CommonClass.iWaitForThread1);

			workordertripschdulemode.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			workordertripschdulemodeAdd.sendKeys("Flexible (draft)");
			waitForThread(CommonClass.iWaitForThread1);

			workordertripschdulemodeflexible.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			workordertripstartdate.clear();
			waitForThread(CommonClass.iWaitForThread1);


			workordertripstartdate.sendKeys("10/18/2021 - 12:18 PM");
			waitForThread(CommonClass.iWaitForThread1);

			workordertripenddate.clear();
			waitForThread(CommonClass.iWaitForThread1);

			workordertripenddate.sendKeys("10/16/2021 - 12:18 PM");
			waitForThread(CommonClass.iWaitForThread1);

			workordertripexpirationdate.clear();
			waitForThread(CommonClass.iWaitForThread1);

			workordertripexpirationdate.sendKeys("10/30/2021 - 12:18 PM");
			waitForThread(CommonClass.iWaitForThread1);

			workordertripdescription.sendKeys("Test flow Trip creation - Allow vendor to propose schedule");
			waitForThread(CommonClass.iWaitForThread1);

			assignee_type_vendor.click();
			waitForThread(CommonClass.iWaitForThread1);

			vendorname.sendKeys("a");
			waitForThread(CommonClass.iWaitForThread1);

			
			 List<WebElement> vendorsellist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-draft_trip_propose_contractor_id-results']/li")); //select random Vendor Name
				Random randomvendorlist = new Random();
				int randomValue = randomvendorlist.nextInt(vendorsellist.size()); //Getting a random value
				vendorsellist.get(randomValue).click(); //Clicking on the random item in the list.
				waitForThread(CommonClass.iWaitForThread2);
				
				 //Scroll down upto last record for Edit Link 
			    JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
				js.executeScript("arguments[0].scrollIntoView(true);", weBtnSendTrip);
				System.out.println("Scroll Down Sucessfully and Particular Row checkbox clickable");
				waitForThread(CommonClass.iWaitForThread);

				
				vendoracceptancereq.click();
				waitForThread(CommonClass.iWaitForThread);

				weTradeoptn.click();
				waitForThread(CommonClass.iWaitForThread);

				workordertripschdulemodeAdd.click();
				waitForThread(CommonClass.iWaitForThread);

				//vendorname.sendKeys("a");
				weTradsel.click();
				waitForThread(CommonClass.iWaitForThread);

				weBtnSendTrip.click();
				
				//String elementval=weGettingwono.getAttribute("value");
				
				String getText = weGettingwono.getText();
				//String getText = weGettingwono.getAttribute("value");
				System.out.println(getText);
				
				String WONumber = getText;
				WONumber = WONumber.substring(1);
				System.out.println(WONumber);
				waitForThread(CommonClass.iWaitForThread);
				weActivity.click();
				
				waitForThread(CommonClass.iWaitForThread);

				  //JavascriptExecutor js1 = ((JavascriptExecutor) CommonClass.driver);
					//js1.executeScript("window.scrollBy(0,200)","");
				  ///js1.executeScript("arguments[0].scrollBy(0,250)","");
				  
				  waitForThread(CommonClass.iWaitForThread);
				  weBackoptn.click();
				  
				  waitForThread(CommonClass.iWaitForThread);
				  weTripdetails.click();				  
			  					
									
		}
	
}
