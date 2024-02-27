package ucAppPages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class BulkWOUploadPage extends ComboAppBasePage
{

	public BulkWOUploadPage() 
	{
		super();
	}
	
		@FindBy(css=".btn.btn-sm.ml10.white > .fa.fa-file-upload.fs20.grey")
        private WebElement BulkuplodoptnClick;
	
		
		@FindBy(xpath="//form[@id='new_background_task']/div[@class='upload-excel-holder']/label/div[.='Drag an excel file here or browse for an excel to upload']")
        private WebElement BulkuplodBrowseoptnClick;
	

		public void fnBulkUploadWOReportFile(int iTestCaseID, UCAppData testData) throws Exception 
		{

			waitForThread(CommonClass.iWaitForThread2);
			CommonClass.driver.navigate().refresh();

			waitForThread(CommonClass.iWaitForThread2);

		    BulkuplodoptnClick.click();
		    
		  //File Upload Function
			   //CommonClass.driver.navigate().refresh();
			waitForThread(CommonClass.iWaitForThread2);
			BulkuplodBrowseoptnClick.click();
			waitForThread(CommonClass.iWaitForThread2);

			  StringSelection ss= new StringSelection("/home/harish/Desktop/Selenim_projects/testing-framework/FIG_App/Upload/bulk-WO-upload.xlsx");
			 
			  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

			  Robot robot = new Robot();

			  robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
			  waitForThread(CommonClass.iWaitForThread2);
			  robot.keyPress(KeyEvent.VK_ENTER);
			  waitForThread(CommonClass.iWaitForThread2);
			  robot.keyRelease(KeyEvent.VK_ENTER);
				
				waitForThread(CommonClass.iWaitForThread2);
				waitForThread(CommonClass.iWaitForThread2);
				waitForThread(CommonClass.iWaitForThread2);
				waitForThread(CommonClass.iWaitForThread2);
				waitForThread(CommonClass.iWaitForThread2);
				waitForThread(CommonClass.iWaitForThread2);
				waitForThread(CommonClass.iWaitForThread2);
				waitForThread(CommonClass.iWaitForThread2);
				waitForThread(CommonClass.iWaitForThread2);
				waitForThread(CommonClass.iWaitForThread2);
				Thread.sleep(5000L);

					  
			  //CommonClass.driver.manage().timeouts().setScriptTimeout(100,SECONDS);
				CommonClass.driver.navigate().refresh();
				//End of File upload functionality
				

		}
}
