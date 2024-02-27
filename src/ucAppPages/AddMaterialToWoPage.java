package ucAppPages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class AddMaterialToWoPage extends ComboAppBasePage {

	public AddMaterialToWoPage() 
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
					
				//Click on Materials button
				@FindBy(css="#workorder-materials-btn")
			    private WebElement clickOnMaterialsButton;
				
				//Click on Plus button
				@FindBy(css="#workorder-materials-panel .btn-float")
			    private WebElement clickOnPlusButton;
				
				//Search Existing Material
				
				//Move to Popup window
				@FindBy(xpath="//*[@id='material_modal']/div")
			    private WebElement clickPopupWinodw;
				
				//Enter Name
				//@FindBy(xpath="//input[contains(@placeholder, 'Name')]")
				@FindBy(xpath="//*[@id='material_modal']/div/div/div[2]/div[1]/div/div/div[1]/div/div/div/div/div[1]/span/span[1]/span")
				//@FindBy(xpath="//*[@id='material_modal']/div/div/div[2]/div[1]/div/div/div[1]/div/div/div/div/div[1]/span/span[1]/span/ul/li/input")
			    private WebElement enterName;
				
				@FindBy(xpath="//*[@id='select2-q_name_cont_any-results']/li[1]")
			    private WebElement nameresults;
				
				
				//Enter Description
				@FindBy(xpath="//input[contains(@placeholder, 'Description')]")
			    private WebElement enterDescription;
				
				//Enter Material Code
				@FindBy(xpath="//input[contains(@placeholder, 'Material Code')]")
			    private WebElement enterMaterialCode;
				
				//Click on Search button
				@FindBy(linkText="SEARCH")
			    private WebElement clickOnSearchButton;
				
				//Click on Action Plus Icon
				@FindBy(css="tr:nth-of-type(1) .fa.fa-plus")
			    private WebElement clickOnPlusIcon;
				
				//Click on Accept Button
				@FindBy(linkText="ACCEPT")
			    private WebElement clickOnAcceptButton;
									
				public void fnAddMaterialToWo(int iTestCaseID, UCAppData testData) throws Exception 
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
					
					 List<WebElement> sitelist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-filters_items_locations_name|work_orders#index_v-results']/li")); //select random Department Name
						Random randomsite = new Random();                                  
						int randomValue5 = randomsite.nextInt(sitelist.size()); //Getting a random value
						sitelist.get(randomValue5).click(); //Clicking on the random item in the list.
						waitForThread(CommonClass.iWaitForThread2);
				    
					
					//waitForThread(CommonClass.iWaitForThread1);
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
					clickOnMaterialsButton.click();
					waitForThread(CommonClass.iWaitForThread2);
					
					waitForThread(CommonClass.iWaitForThread);
					clickOnPlusButton.click();
					waitForThread(CommonClass.iWaitForThread1);	
					
					Actions actions = new Actions(CommonClass.driver); 
			        actions.moveToElement(clickPopupWinodw).click().perform();
					waitForThread(CommonClass.iWaitForThread2);
			        System.out.print("model switch properly");
			        enterName.click();
					waitForThread(CommonClass.iWaitForThread1);

				     //enterName.sendKeys("Item 101 Automation");
					//waitForThread(CommonClass.iWaitForThread1);	
					//enterName.sendKeys(Keys.ENTER);
					//;.waitForThread(CommonClass.iWaitForThread1);	
			       /* List<WebElement> Nameslist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-q_name_cont_any-results']/li")); //select random Department Name
					Random randomNames = new Random();
					int randomValue6 = randomNames.nextInt(Nameslist.size()); //Getting a random value
					Nameslist.get(randomValue6).click(); //Clicking on the random item in the list.
					waitForThread(CommonClass.iWaitForThread2);*/
			      //*[@id="select2-q_name_cont_any-results"]/li[1]
			        nameresults.click();
					waitForThread(CommonClass.iWaitForThread1);

					
					enterDescription.sendKeys("Item updated from sheet 10 Aug");
					waitForThread(CommonClass.iWaitForThread1);	
					enterDescription.sendKeys(Keys.ENTER);
					enterMaterialCode.click();
					
					//waitForThread(CommonClass.iWaitForThread1);	
					//enterMaterialCode.sendKeys("X73DA15R");
					//waitForThread(CommonClass.iWaitForThread1);	
					//enterMaterialCode.sendKeys(Keys.ENTER);
					
				    List<WebElement> Materiallist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-q_material_code_cont_any-results']/li")); //select random Department Name
					Random randomMaterials = new Random();
					int randomValue7 = randomMaterials.nextInt(Materiallist.size()); //Getting a random value
					Materiallist.get(randomValue7).click(); //Clicking on the random item in the list.
					waitForThread(CommonClass.iWaitForThread2);
			    
					
					waitForThread(CommonClass.iWaitForThread);
					clickOnSearchButton.click();
					waitForThread(CommonClass.iWaitForThread1);	
					
					waitForThread(CommonClass.iWaitForThread);
					clickOnPlusIcon.click();
					waitForThread(CommonClass.iWaitForThread1);	
					
					waitForThread(CommonClass.iWaitForThread);
					clickOnAcceptButton.click();
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