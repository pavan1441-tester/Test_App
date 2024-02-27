package ucAppPages;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;
import ucAppPages.ComboAppBasePage;

public class ClientUploadPage extends ComboAppBasePage 
{
	
	public ClientUploadPage()
	{
		super();
	}
	//Goto Clients module
	@FindBy(linkText="Clients")	
    private WebElement clickOnClientsModule;
	
	//Click on Clients Upload Logo
	@FindBy(css=".fa-file-upload")
	private WebElement uploadClientLogo;
	
	//Click on Drag an excel file here or browse for an excel to upload
	@FindBy(css=".upload-excel")
	private WebElement uploadExcel;
	
	public void fnClientUpload(int iTestCaseID, UCAppData testData) throws Exception
	{
		waitForThread(CommonClass.iWaitForThread);
		clickOnClientsModule.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		uploadClientLogo.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		uploadExcel.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		//Actions actions = new Actions(CommonClass.driver); 
		//actions.moveToElement(uploadExcel).click().perform();	
		
		System.out.println("excel upload clicked");
		
		StringSelection clientAttachment= new StringSelection("./Upload/Upload-Client-details.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(clientAttachment,null);
		
		System.out.println("File Uploaded Succssfully");
		
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
		//waitForThread(CommonClass.iWaitForThread2);
		//waitForThread(CommonClass.iWaitForThread2);
		
		Thread.sleep(1000L);
		CommonClass.driver.navigate().refresh();
	}	

}
