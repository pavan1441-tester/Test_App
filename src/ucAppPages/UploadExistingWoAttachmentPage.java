package ucAppPages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class UploadExistingWoAttachmentPage extends ComboAppBasePage {

	public UploadExistingWoAttachmentPage() 
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
				
				//Click on Attachments option
				@FindBy(xpath="//a[@id='workorder-attachments-btn']")	
				private WebElement clickOnAttachment;
					
				//Click on Plus Button
				@FindBy(css="#workorder-attachments-panel .btn-float")
			    private WebElement clickOnPlusButton;
				
				//New Attachment Popup Page
				//Enter Name
				@FindBy(xpath="//input[@id='attachment_name']")
			    private WebElement enterName;
				
				//Enter Description
				@FindBy(xpath="//textarea[@id='attachment_description']")
			    private WebElement enterDescription;
				
				//Click on Make file available to client
				@FindBy(xpath="//input[@id='attachment_make_file_available_to_client']")
			    private WebElement markFileAvailable;
				
				//Upload WO attachment File
				//@FindBy(css="#attachment_attachment")
			    //private WebElement abc;
				
				//Attacment form
				@FindBy(xpath="//input[@id='attachment_attachment']")
				private WebElement weAttachmentform;
				
				//Click on the Save Button
				@FindBy(css="form#attachemnt > div:nth-of-type(3) input[name='commit']")
			    private WebElement saveButton;
								
				public void fnUploadWoAttachment1(int iTestCaseID, UCAppData testData) throws Exception 
				{
					waitForThread(CommonClass.iWaitForThread);
					clickOnFilters.click();
					waitForThread(CommonClass.iWaitForThread1);
					
					clickOnSiteNameFilter.sendKeys("BV Client Amityville");
					waitForThread(CommonClass.iWaitForThread1);
					clickOnSiteNameFilter.sendKeys(Keys.ENTER);
					
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
					clickOnAttachment.click();
					waitForThread(CommonClass.iWaitForThread2);
					
					waitForThread(CommonClass.iWaitForThread);
					clickOnPlusButton.click();
					waitForThread(CommonClass.iWaitForThread1);	
					
					enterName.sendKeys("Automation-WO Attachment");
					waitForThread(CommonClass.iWaitForThread1);	
										
					enterDescription.sendKeys("Description added by AT Script");
					waitForThread(CommonClass.iWaitForThread1);	
					
					waitForThread(CommonClass.iWaitForThread);
					markFileAvailable.click();
					waitForThread(CommonClass.iWaitForThread1);	
					
					System.out.println("mark avaiable is checked");
					
					waitForThread(CommonClass.iWaitForThread);
					
					//Actions actions = new Actions(CommonClass.driver); 
					//actions.moveToElement(weAttachmentform).click().perform();
					
					//WebElement uploadElement = CommonClass.driver.findElement(By.xpath("//input[@id='attachment_attachment']"));
					//uploadElement.sendKeys("/home/ror/Desktop/UC-AT-Projects/Bulk Uploads/mobile_Attachment.jpeg");
					
					//CommonClass.driver.findElement (By.cssSelector("input#attachment_attachment")).click();
					//waitForThread(CommonClass.iWaitForThread1);			
					//System.out.println("Clicked on WO Attachment FIle");


					/*StringSelection woAttachment= new StringSelection("home/harish/Upload/20943580.jpg");
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(woAttachment,null);

					System.out.println("File is Uploaded Successfully");
					
					Robot robot = new Robot();

					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					waitForThread(CommonClass.iWaitForThread2);
					robot.keyPress(KeyEvent.VK_ENTER);
					waitForThread(CommonClass.iWaitForThread2);
					robot.keyRelease(KeyEvent.VK_ENTER);*/
					
					weAttachmentform.sendKeys("./Upload/20943580.jpg");

					waitForThread(CommonClass.iWaitForThread2);

					waitForThread(CommonClass.iWaitForThread);
					saveButton.click();
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
					
					//Thread.sleep(1000L);
					//End of File upload functionality
				}	
}