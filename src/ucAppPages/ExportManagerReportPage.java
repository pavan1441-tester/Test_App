package ucAppPages;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class ExportManagerReportPage extends ComboAppBasePage {

	public ExportManagerReportPage() 
	{
		super();
	}			
				//Click on Menu list Nav bar
				@FindBy(xpath="//*[@id='lockNavbar']")
				 private WebElement WebElementNvbar;
				
				//Click on Report Summary Module
				@FindBy(css="#report_summary > a")	
			    private WebElement clickOnReportSummaryTab;
				
				//Click on Export Button
				@FindBy(linkText="Export")	
			    private WebElement exportButton;
				
				//On New Pop-up Page-Manager Report
				
				//Enter Service CheckIn time range 
				@FindBy(css="#report_service_start_time")
				private WebElement serviceCheckInDate;
				
				//Click on Calender previous month
				@FindBy(css=".datepicker-days .prev")
				private WebElement calenderPreviousMonth;
				
				//Select Date
				@FindBy(css="tr:nth-child(2) > .day:nth-child(6)")
				private WebElement selectDate;
				
				//Click on Attension Modal
				@FindBy(css=".modal-title:nth-child(2)")
				private WebElement attensionModal;
				
				//Enter Service CheckOut time range 
				//@FindBy(css="#report_service_end_time")
				//private WebElement serviceCheckOutDate;
					
				//Click on Include Assignee Information Checkbox
				@FindBy(xpath="//*[@id='report_include_vendor_information']")
			    private WebElement includeAssigneeInformation;
				
				//Click on Export button
				@FindBy(css="input[name='commit']")
			    private WebElement clickOnExportButton;
									
				public void fnExportManagerReport(int iTestCaseID, UCAppData testData) throws Exception 
				{
					waitForThread(CommonClass.iWaitForThread);
					WebElementNvbar.click();
					waitForThread(CommonClass.iWaitForThread2);
					
					waitForThread(CommonClass.iWaitForThread);
					clickOnReportSummaryTab.click();
					waitForThread(CommonClass.iWaitForThread2);
					
					waitForThread(CommonClass.iWaitForThread);
					exportButton.click();
					waitForThread(CommonClass.iWaitForThread2);
					
					//serviceCheckInDate.sendKeys(Keys.CONTROL);
					serviceCheckInDate.click();
					waitForThread(CommonClass.iWaitForThread1);
					
					calenderPreviousMonth.click();
					waitForThread(CommonClass.iWaitForThread);
					calenderPreviousMonth.click();
					waitForThread(CommonClass.iWaitForThread);
			
					selectDate.click();
					waitForThread(CommonClass.iWaitForThread1); 
					
				//	selectDate.sendKeys(Keys.TAB);
					//waitForThread(CommonClass.iWaitForThread1); 
					
					attensionModal.click();
					waitForThread(CommonClass.iWaitForThread1); 

					Actions Assignee = new Actions(CommonClass.driver);
					Assignee.moveToElement(includeAssigneeInformation).click().perform();
			        
					waitForThread(CommonClass.iWaitForThread1);
					System.out.println("Assignee clicked");

					
					waitForThread(CommonClass.iWaitForThread);
					clickOnExportButton.click();
					waitForThread(CommonClass.iWaitForThread2);
					
					Thread.sleep(1000L);
					//End of File upload functionality
				}	
}
