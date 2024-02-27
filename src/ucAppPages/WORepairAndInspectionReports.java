package ucAppPages;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.UCAppData;
import lib.CommonClass;

public class WORepairAndInspectionReports extends ComboAppBasePage  
{

	public WORepairAndInspectionReports() 
	{
		super();
	}
	
	//locators 1st row wo order no click
	//@FindBy(xpath="//div[@id='workorder-list-holder']/table/tbody[1]/tr[1]//strong/a/div[1]")
	@FindBy(xpath="//*[@id='workorder-tile-holder']/div/div[2]/div/div/div[2]/div[1]/span[1]/a/div")
	//@FindBy(xpath="//*[@id='workorder-tile-holder']/div/div[2]/div/div/div[1]/span/label")
	private WebElement clickwo;
	
	
	@FindBy(xpath="//*[@id='work_order_trip_modal']/div/div")
	private WebElement modelwindoww;
	
	
	//Repair Report
	@FindBy(xpath="//*[@id='trip-reports-generator-link']/i")
	private WebElement DownloadReport;
	
	//Equipment Report
	@FindBy(xpath="//*[@id='trip_report_content_types_equipment_repair']")
	private WebElement EquipmentReport;
	
	
	//Inspection Report
	@FindBy(xpath="//*[@id='trip_report_content_types_inspection']")
	private WebElement InspectionReport;
	
   //Excel Selection
	@FindBy(css=".fa.fa-5x.fa-file-excel")
	private WebElement Exceloption;
	
	//PDF Selection
	@FindBy(css=".fa.fa-5x.fa-file-pdf")
	private WebElement Pdfoption;
	
	//Export button
	@FindBy(xpath="//input[@value='Export' and @type='submit']")	
    private WebElement weBtnExport;
	
		
	
	public void fnWORepairAndInspectionReports(int iTestCaseID, UCAppData testData) throws Exception 
	{
		waitForThread(CommonClass.iWaitForThread2);

		    clickwo.click();
			waitForThread(CommonClass.iWaitForThread2);
			waitForThread(CommonClass.iWaitForThread2);
			
			//Switch to New Tab
			ArrayList<String> Newtab = new ArrayList<String> (CommonClass.driver.getWindowHandles()); 
		   CommonClass.driver.switchTo().window(Newtab.get(1));
		    
			waitForThread(CommonClass.iWaitForThread2);

			DownloadReport.click();
			waitForThread(CommonClass.iWaitForThread2);
			
		
      		EquipmentReport.click();
			
			JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
			js.executeScript("arguments[0].scrollIntoView(true);", Exceloption);
			System.out.println("Scroll Down Sucessfully and Excel file clickable");

			Exceloption.click();

			waitForThread(CommonClass.iWaitForThread2);
			
			weBtnExport.click();
			waitForThread(CommonClass.iWaitForThread2);

			
		    String originalHandle = CommonClass.driver.getWindowHandle();

		    //Do something to open new tabs

		    for(String handle : CommonClass.driver.getWindowHandles()) 
		    {
		        if (!handle.equals(originalHandle)) 
		        {
		        	CommonClass.driver.switchTo().window(handle);
		        	CommonClass.driver.close();
		        }
		    }

		    CommonClass.driver.switchTo().window(originalHandle);
			waitForThread(CommonClass.iWaitForThread2);
           //Reapair Report with excel  format close
			
			DownloadReport.click();
			waitForThread(CommonClass.iWaitForThread2);
			
		
      		EquipmentReport.click();
			
			JavascriptExecutor js1 = ((JavascriptExecutor) CommonClass.driver);
			js1.executeScript("arguments[0].scrollIntoView(true);", Pdfoption);
			System.out.println("Scroll Down Sucessfully and PDF file clickable");

			Pdfoption.click();

			waitForThread(CommonClass.iWaitForThread2);
			
			weBtnExport.click();
			waitForThread(CommonClass.iWaitForThread2);

		
			WebDriverWait wait = new WebDriverWait(CommonClass.driver, 20);
		     


		    String originalHandle1 = CommonClass.driver.getWindowHandle();

		    //Do something to open new tabs

		    for(String handle : CommonClass.driver.getWindowHandles()) 
		    {
		        if (!handle.equals(originalHandle1)) 
		        {
		        	CommonClass.driver.switchTo().window(handle);
		        	CommonClass.driver.close();
		        }
		    }

		    CommonClass.driver.switchTo().window(originalHandle1);
			waitForThread(CommonClass.iWaitForThread2);
           //Reapair Report with PDF format close

			DownloadReport.click();
			waitForThread(CommonClass.iWaitForThread2);
			
		
			InspectionReport.click();
			
			JavascriptExecutor js3 = ((JavascriptExecutor) CommonClass.driver);
			js3.executeScript("arguments[0].scrollIntoView(true);", Exceloption);
			System.out.println("Scroll Down Sucessfully and Excel file clickable");

			Exceloption.click();

			waitForThread(CommonClass.iWaitForThread2);
			
			weBtnExport.click();
			waitForThread(CommonClass.iWaitForThread2);

			
		    String originalHandle3 = CommonClass.driver.getWindowHandle();

		    //Do something to open new tabs

		    for(String handle : CommonClass.driver.getWindowHandles()) 
		    {
		        if (!handle.equals(originalHandle3)) 
		        {
		        	CommonClass.driver.switchTo().window(handle);
		        	CommonClass.driver.close();
		        }
		    }

		    CommonClass.driver.switchTo().window(originalHandle3);
			waitForThread(CommonClass.iWaitForThread2);
           //Inspection Report with excel format close

			DownloadReport.click();
			waitForThread(CommonClass.iWaitForThread2);
			
		
			InspectionReport.click();
			
			JavascriptExecutor js4 = ((JavascriptExecutor) CommonClass.driver);
			js4.executeScript("arguments[0].scrollIntoView(true);", Pdfoption);
			System.out.println("Scroll Down Sucessfully and PDF file clickable");

			Pdfoption.click();

			waitForThread(CommonClass.iWaitForThread2);
			
			weBtnExport.click();
			waitForThread(CommonClass.iWaitForThread2);

			
		    String originalHandle4 = CommonClass.driver.getWindowHandle();

		    //Do something to open new tabs

		    for(String handle : CommonClass.driver.getWindowHandles()) 
		    {
		        if (!handle.equals(originalHandle4)) 
		        {
		        	CommonClass.driver.switchTo().window(handle);
		        	CommonClass.driver.close();
		        }
		    }

		    CommonClass.driver.switchTo().window(originalHandle4);
			waitForThread(CommonClass.iWaitForThread2);
           //Inspection Report with PDF format close

		

	}
	
}


