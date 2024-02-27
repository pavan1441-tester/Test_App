package ucAppPages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class UploadWOAttachmentToExistingTripPage extends ComboAppBasePage {

	public UploadWOAttachmentToExistingTripPage() 
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
				
				//Click on 3 dots 
				@FindBy(css="#dropdownMenuButton > .fa-2x")	
				private WebElement clickOnThreeDots;
					
				//Click on Edit text
				@FindBy(linkText="Edit")
			    private WebElement clickOnEditLink;
				
				//Click on New Attachment button
				@FindBy(linkText="NEW ATTACHMENT")
			    private WebElement clickOnNewAttachmentButton;
				
				//Enter Name
				@FindBy(xpath="//input[@type='text' and @class='string optional form-control']")
			    private WebElement enterName;
				
				//Enter Description
				@FindBy(xpath="//textarea[contains(@id, 'trip_attachments_')]")
			    private WebElement enterDescription;
				
				//Click on choose file button
				@FindBy(xpath="//input[@type='file' and @class='file required form-control attachment-input']")
			    private WebElement clickOnChooseFileButton;
				
				
				  @FindBy(xpath="//*[@id='work_order_trip_modal']/div/div/div[2]/div[1]")
			    private WebElement scrollpostion;
				 
				
				//Click on Dispatch Button
				//@FindBy(css=".review-btn:nth-child(1)")
				//Click on Dispatch Button
				@FindBy(xpath="//input[@value='DISPATCH' and @type='submit']")	
				 private WebElement weBtnDispatch;

			    private WebElement clickOnDispatchButton;
									
				public void fnUploadWOAttachmentToExistingTrip(int iTestCaseID, UCAppData testData) throws Exception 
				{
					waitForThread(CommonClass.iWaitForThread);
					clickOnFilters.click();
					waitForThread(CommonClass.iWaitForThread1);
					
					waitForThread(CommonClass.iWaitForThread);
					clearFilter.click();
					waitForThread(CommonClass.iWaitForThread2);
					clickOnSiteNameFilter.click();
					//clickOnSiteNameFilter.sendKeys("BV Client Amityville");
					//waitForThread(CommonClass.iWaitForThread1);
					//clickOnSiteNameFilter.sendKeys(Keys.ENTER);
					waitForThread(CommonClass.iWaitForThread);

					 List<WebElement> sitelist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-filters_items_locations_name|work_orders#index_v-results']/li")); //select random Department Name
						Random randomsite = new Random();
						int randomValue5 = randomsite.nextInt(sitelist.size()); //Getting a random value
						sitelist.get(randomValue5).click(); //Clicking on the random item in the list.
						waitForThread(CommonClass.iWaitForThread2);
				    
					
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
					clickOnThreeDots.click();
					waitForThread(CommonClass.iWaitForThread2);
					
					waitForThread(CommonClass.iWaitForThread);
					clickOnEditLink.click();
					waitForThread(CommonClass.iWaitForThread1);	
					
					waitForThread(CommonClass.iWaitForThread);
					clickOnNewAttachmentButton.click();
					waitForThread(CommonClass.iWaitForThread1);
						
					enterName.sendKeys("Automation-WO Attachment");
					waitForThread(CommonClass.iWaitForThread1);	
										
					enterDescription.sendKeys("Description added by AT Script");
					waitForThread(CommonClass.iWaitForThread1);	
					
					
					/*Actions actions = new Actions(CommonClass.driver); 
					actions.moveToElement(clickOnChooseFileButton).click().perform();
							
					System.out.println("Clicked on WO Attachment FIle");
					waitForThread(CommonClass.iWaitForThread2);

					StringSelection tripAttachment= new StringSelection("/home/harish/Upload/20943580.jpg");
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(tripAttachment,null);

					//System.out.println("File is Uploaded Successfully");
					
					Robot robot = new Robot();

					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					waitForThread(CommonClass.iWaitForThread2);
					robot.keyPress(KeyEvent.VK_ENTER);
					waitForThread(CommonClass.iWaitForThread2);
					robot.keyRelease(KeyEvent.VK_ENTER);*/
					
					clickOnChooseFileButton.click();
					   //click on ‘Choose file’ to upload the desired file
					  // clickOnChooseFileButton.sendKeys("./Upload/20943580.jpg"); //Uploading the file using sendKeys
					   //System.out.println("File is Uploaded Successfully");
					
					StringSelection clientAttachment= new StringSelection("/home/harish/Upload/20943580.jpg");
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
					System.out.println("Image Uploaded Sucessfully");
					
					//waitForThread(CommonClass.iWaitForThread2);
					//scrollpostion.click();
					waitForThread(CommonClass.iWaitForThread2);

					Actions actions1 = new Actions(CommonClass.driver); 
					actions1.sendKeys(Keys.PAGE_DOWN).click().perform();
					
					waitForThread(CommonClass.iWaitForThread2);

					/*JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
					js.executeScript("arguments[0].scrollIntoView(true);", clickOnDispatchButton);*/
					
					System.out.println("Scroll Down Sucessfully and and dispatch button clickable");

					
					//waitForThread(CommonClass.iWaitForThread2);
					clickOnDispatchButton.click();
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