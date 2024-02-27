package ucAppPages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class NewTaskRateBulkUploadPage extends ComboAppBasePage {

	public NewTaskRateBulkUploadPage() 
	{
		super();
	}
		//Goto Sites module
		@FindBy(linkText="Sites")
		private WebElement clickOnSitesModule;
		
		//Click on Bulk Upload Sites Logo
		@FindBy(css="a[title='Bulk Upload Sites'] > .fa.fa-file-upload")
		private WebElement bulkUploadSitesLogo;
		
		//Click on Task Rate bulk Upload-Drag excel here
		@FindBy(css=".row > div:nth-of-type(3) form#new_background_task img")
		private WebElement taskRatebulkUpload;
		
		public void fnNewTaskRateBulkUpload(int iTestCaseID, UCAppData testData) throws Exception 
		{
			waitForThread(CommonClass.iWaitForThread);
			clickOnSitesModule.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			bulkUploadSitesLogo.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread);
			taskRatebulkUpload.click();
			waitForThread(CommonClass.iWaitForThread1);			
			
			//File Upload Function
			//CommonClass.driver.navigate().refresh();

			StringSelection bulkSitesUpload= new StringSelection("./Upload/BV-Task-rate-bulk-upload.xlsx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(bulkSitesUpload,null);

			System.out.println("File is Uploaded Successfully");
			
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

			CommonClass.driver.navigate().refresh();
			
			Thread.sleep(10000L);
			//End of File upload functionality
		}
}
