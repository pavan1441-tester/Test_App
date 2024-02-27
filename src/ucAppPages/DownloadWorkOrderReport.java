package ucAppPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class DownloadWorkOrderReport extends ComboAppBasePage
{

	public DownloadWorkOrderReport() 
	{
		super();
	}
	
	     //Goto Download Report
	     // @FindBy(css=".checkbox-custom-label.m0")
	      @FindBy(xpath="//*[@id='page-content']/div[2]/div/div/div[1]/div[1]/span/label")
	      private WebElement clickOnselectall;
	

	       //Goto Download Report
			@FindBy(css="a > .fa.fa-cloud-download.fs20")
			private WebElement clickOnReportDownload;
			
				
			//Model window
			@FindBy(xpath="//*[@id='eModal']/div/div")	
			 private WebElement WebElementmodelwindow;
			
			@FindBy(xpath="//*[@id='report_report_format_xlsx']")
			 private WebElement WebElementexcelformat;
						
			
			//Export csv button
			@FindBy(xpath="//input[@value='Export' and @type='submit']")	
			 private WebElement WebElementBtnExport;
			
			
			@FindBy(xpath="//input[@id='report_report_type_simplified']")	
			 private WebElement WebElementsimplifiedRadioptn;
			
			//Advanced option selection
			@FindBy(xpath="//input[@id='report_report_type_advanced']")	
			 private WebElement WebElementsAdvancedRadioptn;
			
			
			//Task option selection
			@FindBy(xpath="//input[@id='report_report_type_simplified_with_tasks']")	
			 private WebElement WebElementSimplifiedRadioptn;
			
					
			//Custom option selection
			@FindBy(xpath="//input[@id='report_report_type_custom']")	
			 private WebElement WebElementCustomRadioptn;
			
			
			//Reports includes Photos 
			@FindBy(xpath="//input[@id='report_include_photos']")	
			 private WebElement WebElementPhotoptn;
			
			
						
			
			public void fnDownloadWorkOrderReport(int iTestCaseID, UCAppData testData) throws Exception 
			{
				waitForThread(CommonClass.iWaitForThread1);

				clickOnselectall.click();
				waitForThread(CommonClass.iWaitForThread1);

			   clickOnReportDownload.click();
				waitForThread(CommonClass.iWaitForThread1);
				
				
				Actions actions = new Actions(CommonClass.driver); 
			    actions.moveToElement(WebElementmodelwindow).perform();
			    waitForThread(CommonClass.iWaitForThread);
				  
			    
			    //Export with Excel Format
			    WebElementexcelformat.click();
			    waitForThread(CommonClass.iWaitForThread);

				WebElementBtnExport.click();
			    waitForThread(CommonClass.iWaitForThread2);

				clickOnReportDownload.click();
				waitForThread(CommonClass.iWaitForThread1);
				
			   //Export with csv Format
				WebElementBtnExport.click();
			    waitForThread(CommonClass.iWaitForThread2);
			    
			    
			    //End - Standard Work Order Reports
			    
			    clickOnReportDownload.click();
				waitForThread(CommonClass.iWaitForThread1);

				
			    WebElementsimplifiedRadioptn.click();
				waitForThread(CommonClass.iWaitForThread1);

			    
				    
			    //Export with Excel Format
			    WebElementexcelformat.click();
			    waitForThread(CommonClass.iWaitForThread);

				WebElementBtnExport.click();
			    waitForThread(CommonClass.iWaitForThread2);

				clickOnReportDownload.click();
				waitForThread(CommonClass.iWaitForThread1);
				
				WebElementsimplifiedRadioptn.click();
				waitForThread(CommonClass.iWaitForThread1);
				
			   //Export with csv Format
				WebElementBtnExport.click();
			    waitForThread(CommonClass.iWaitForThread2);

			    //End - Simplified Work Order Reports   
			    
			    
			    clickOnReportDownload.click();
				waitForThread(CommonClass.iWaitForThread1);

				
				WebElementsAdvancedRadioptn.click();
				waitForThread(CommonClass.iWaitForThread1);

			    
				    
			    //Export with Excel Format
			    WebElementexcelformat.click();
			    waitForThread(CommonClass.iWaitForThread);

				WebElementBtnExport.click();
			    waitForThread(CommonClass.iWaitForThread2);

				clickOnReportDownload.click();
				waitForThread(CommonClass.iWaitForThread1);
				
				WebElementsAdvancedRadioptn.click();
				waitForThread(CommonClass.iWaitForThread1);
				
			   //Export with csv Format
				WebElementBtnExport.click();
			    waitForThread(CommonClass.iWaitForThread2);

			    //End - Adanced Work Order Reports   
			    
			    			    
			    clickOnReportDownload.click();
				waitForThread(CommonClass.iWaitForThread1);

				
				WebElementSimplifiedRadioptn.click();
				waitForThread(CommonClass.iWaitForThread1);

			    
				    
			    //Export with Excel Format
			    WebElementexcelformat.click();
			    waitForThread(CommonClass.iWaitForThread);

				WebElementBtnExport.click();
			    waitForThread(CommonClass.iWaitForThread2);

				clickOnReportDownload.click();
				waitForThread(CommonClass.iWaitForThread1);
				
				WebElementSimplifiedRadioptn.click();
				waitForThread(CommonClass.iWaitForThread1);
				
			   //Export with csv Format
				WebElementBtnExport.click();
			    waitForThread(CommonClass.iWaitForThread2);

			    //End - Task Reports   			    
			    
			    clickOnReportDownload.click();
				waitForThread(CommonClass.iWaitForThread1);
				
				WebElementCustomRadioptn.click();
				waitForThread(CommonClass.iWaitForThread1);
			    				    
			    //Export with Excel Format
			    WebElementexcelformat.click();
			    waitForThread(CommonClass.iWaitForThread);

				WebElementBtnExport.click();
			    waitForThread(CommonClass.iWaitForThread2);

				clickOnReportDownload.click();
				waitForThread(CommonClass.iWaitForThread1);
				
				WebElementCustomRadioptn.click();
				waitForThread(CommonClass.iWaitForThread1);
				
			   //Export with csv Format
				WebElementBtnExport.click();
			    waitForThread(CommonClass.iWaitForThread2);

			    //End - Custom Reports   

			  
			    
			    clickOnReportDownload.click();
				waitForThread(CommonClass.iWaitForThread1);
				
				WebElementCustomRadioptn.click();
				waitForThread(CommonClass.iWaitForThread1);
			    				    
			    //Export with Excel Format
			    WebElementexcelformat.click();
			    waitForThread(CommonClass.iWaitForThread);
			    
			    WebElementPhotoptn.click();
			    waitForThread(CommonClass.iWaitForThread);


				WebElementBtnExport.click();
			    waitForThread(CommonClass.iWaitForThread2);

				clickOnReportDownload.click();
				waitForThread(CommonClass.iWaitForThread1);
				
				WebElementSimplifiedRadioptn.click();
				waitForThread(CommonClass.iWaitForThread1);
				
				 WebElementPhotoptn.click();
				  waitForThread(CommonClass.iWaitForThread);

				
			   //Export with csv Format
				WebElementBtnExport.click();
			    waitForThread(CommonClass.iWaitForThread2);

			    //End - Custom Reports   


}
}
