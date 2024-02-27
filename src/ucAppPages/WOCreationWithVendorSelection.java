package ucAppPages;

import lib.UCAppData;
import lib.CommonClass;
import net.bytebuddy.asm.Advice.Enter;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.openqa.selenium.Alert;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WOCreationWithVendorSelection extends ComboAppBasePage 
{

	public WOCreationWithVendorSelection() 
	{
		super();
	}
		
	//plus button button
		@FindBy(css=".create-trip-button")	
	    private WebElement weCreateTripBtn;
		
	   //Site aelection click opration
		@FindBy(xpath="//*[@id='select2-wo-location-selection-container']")	
	    private WebElement weSiteNameselBtn;
		
		//Site selection
		@FindBy(xpath="//*[@id='select2-wo-location-selection-results']/li[2]")	
	    private WebElement weSiteNameselction;
		

		//Site selection
		@FindBy(xpath="//*[@id='work_order_problem']")	
	    private WebElement weComments;
		
		
		//date selection
			@FindBy(id="work_order_past_work_order_date")	
		      private WebElement weDateselctn;
			
			//Client Billing method selection
					@FindBy(xpath="//*[@id='select2-work_order_work_order_type-container']")	
				    private WebElement weclientBilmethod;
				
					//Client Billing method selection
					@FindBy(xpath="//*[@id='select2-work_order_work_order_type-result-oubh-Time and Materials']")	
				    private WebElement weclientBilmethodselctn;
			
					
					//Client Call Type selection
					@FindBy(xpath="//span[@id='select2-work_order_call_type-container']")
				    private WebElement weclientcallType;
				
					//@FindBy(xpath="//*[@id=\'general-notes\']/div/div/div/div[1]/div[1]/div[4]/div/span/span[1]/span")
				    //private WebElement weclientcallType;
					
					@FindBy(xpath="/html/body/span/span/span[1]/input")
				    private WebElement weclientcallTypetxt;
					
					//Client Call Problem selection
					@FindBy(xpath="//*[@id='general-notes']/div/div/div/div[1]/div[1]/div[5]/div/span/span[1]/span")
				    private WebElement weclientProblemType;
					

					@FindBy(xpath="//*[@id='select2-work_order_priority-container']")
				    private WebElement weclientcallPriority;
					
					
					//Client Internal notes
					@FindBy(xpath="//*[@id='notes']")
				    private WebElement weclientnotes;
					

					//popup close
					@FindBy(xpath="//*[@id='Embed']/div/div/div/div/div/div/div[1]/div/button[2]")
					 private WebElement wepopup;
					
					
					@FindBy(xpath="//*[@id='webWidget']")
				    private WebElement wepopupframe;
					
								

					@FindBy(xpath="//*[@id='wo_notes_panel']/div[1]/div[2]/a")
				    private WebElement weclientnotesSend;
					

					//@FindBy(xpath="//input[@class=’select2-search__field′ and @placeholder=’Select work order manager’]")
					//@FindBy(xpath="//*[contains(@placeholder, ‘Select work order manager)]")
					@FindBy(xpath="//input[contains(@placeholder, 'Select work order manager')]")
				    private WebElement weworkordermanager;
					
					@FindBy(xpath="//span[contains(@class,'select2-dropdown select2-dropdown--below') and contains(text(),'PS nkolo')]")
					private WebElement weworkdodermanagerselct;

					
					@FindBy(xpath="//*[@id='select2-work_order_assigned_user_ids-results']/li")
				    private WebElement weworkordermanagec;
					
					
					@FindBy(xpath="//*[@id='select2-work_order_department_id-container']")
				    private WebElement weworkorderDept;
					

					@FindBy(xpath="//*[@id='select2-work_order_department_id-results']/li[2]")
				    private WebElement weworkorderDeptsel;
					
					@FindBy(xpath="//*[@id='work_order_work_order_name']")
				    private WebElement weworkordername;
					
					
					@FindBy(xpath="//*[@id='work_order_nte']")
				    private WebElement weClientExdNTE;
					
					
					@FindBy(xpath="//input[contains(@placeholder, 'Select Trade')]")
				    private WebElement weworkorderTrade;
					
					//@FindBy(xpath="//*[@id='select2-work_order_wo_trade_ids-results']/li[3]")
					@FindBy(xpath="//*[@id='select2-work_order_wo_trade_ids-results']/li[text() = 'Land']")
				    private WebElement weworkorderTradesel;
					
					
					
					
					@FindBy(xpath="//input[contains(@placeholder, 'Select Services')]")
				    private WebElement weworkorderTradeServices;
					

					
					//@FindBy(xpath="/li[@class='select2-results__option select2-results__option--highlighted']/strong[@class='fs14']/text()")
					//@FindBy(xpath="//ul[@class='select2-results__options’]/li[last()-2]")
					@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--above']//ul[@role='listbox']/li[2]")
					//@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown—below']//ul[@role='listbox']/li[@role='option']")
					private WebElement weworkorderTradeServicesSelctn;
					

					
					@FindBy(xpath="//input[contains(@placeholder, 'Select Task')]")
				    private WebElement weworkorderTask;
					
					//@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown—below']//ul[@role='listbox']/li[@role='option']")
					@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--above']//ul[@role='listbox']/li[text() = 'Trash']")
					 private WebElement weworkorderTaskSelctn;
					
					
					
					//Continue button
					@FindBy(xpath="//input[@value='CONTINUE' and @type='submit']")	
					//@FindBy(xpath="//input[@value='CONTINUE']")
				    private WebElement weBtnContinue;
					
					//page 2
					
					@FindBy(xpath="//*[@id='trip_work_order_expiration_date']")
				    private WebElement weworkorderclosedate;
					
					
					@FindBy(xpath="//*[@id='work_order_trips_attributes_0_start_date']")
				    private WebElement wewtripstartdate;
					
					//By default assigne radio button selected as Vendor
					//@FindBy(xpath="//*[@id='team_member_assignee_type']")
					//@FindBy(xpath="//*[@id='tradesmen_assignee_type']")
				    //private WebElement weselectAssigntype;
					
					//*[@id="tradesmen_assignee_type"]
					
					//@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_team_member_ids-container']")
					//@FindBy(xpath="//span[@id='select2-work_order_trips_attributes_0_contractor_id-container']")
				
					@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_contractor_id-container']/span")
				    private WebElement weselectAssignVendor;
					
					@FindBy(xpath="/html/body/span/span/span[1]/input")
				    private WebElement weEnterAssignVendor;

					
					//@FindBy(xpath="//span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[text() = 'Test Crew1']")
					
					///html/body/span/span/span[2]/ul/li[1]/ul/li[4]
					//@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_team_member_ids-results']/li[1]/ul/li[2]")
							
					//@FindBy(xpath="//div[#'vendor_logo']/strong[@innertext='Regression vendor - active']")
					
					//div[#'vendor_logo']/strong[@innertext='Regression vendor - active']
					@FindBy(xpath="//*[@id='vendor_logo']")
				    private WebElement weselectAssignVendorsel;
					
					
					@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_trade_id-container']")
				    private WebElement weselectTrade;

					
					
					@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_trade_id-results']/li[text() = 'Land']")
				    private WebElement weselectTradeSel;
					
					@FindBy(xpath="//input[contains(@placeholder, 'Select Trade Service')]")
				    private WebElement weTradeServices;
					
					//@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_trip_wo_service_trade_ids-results]/li[text() = 'Debris Removal']")
					//@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_trip_wo_service_trade_ids-results]/li[text() = 'Debris Removal']")				               
					//@FindBy(xpath="//span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[text() = 'Debris Removal']")
					//@FindBy(xpath="//span[@class='select2-dropdown select2-dropdown—below']//ul[@role='listbox']/li[text() = 'Debris Removal']")
					@FindBy(xpath="//span[@class='select2-dropdown select2-dropdown—below']//ul[@role='listbox']/li[@role='option']")
				    private WebElement weTradeServicesSel;
					
					

					@FindBy(xpath="//*[@id='status']/label[1]")
				    private WebElement weStatus;
					
					
					@FindBy(xpath="//input[contains(@placeholder, 'Select Task')]")
				    private WebElement weTradeTask;
					
								

					@FindBy(xpath="//*[@id='add-more-trip']/a")
				    private WebElement weAddtrip;
					

					@FindBy(linkText ="FINISH")
				    private WebElement webtnFinish;
					


			public void fnWOCreationWithVendorSelection(int iTestCaseID, UCAppData testData) throws Exception 
			{
				// TODO Auto-generated method stub
				WebDriverWait Tripbtn = new WebDriverWait(CommonClass.driver, 20);
				//WebElement CreateTripBtn = CommonClass.driver.findElement(By.cssSelector(""));
				
				//Tripbtn.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".create-trip-button")));
				Tripbtn.until(ExpectedConditions.elementToBeClickable(weCreateTripBtn));
				weCreateTripBtn.click();
				
				System.out.println("workorder click done");
				
				Actions actions = new Actions(CommonClass.driver); 
		        actions.moveToElement(weSiteNameselBtn).click().perform();

		        weSiteNameselction.click();
		        
	   		    waitForThread(CommonClass.iWaitForThread);

	   			sendValue(weComments,"Regression Test Description","Enter the Description");
	   			waitForThread(CommonClass.iWaitForThread);
	   			
	   			
	   			Actions actions1 = new Actions(CommonClass.driver); 
		        actions1.moveToElement(weDateselctn).click().perform();
	   			//weDateselctn.click();
	   			//weDateselctn.sendKeys("07/13/2021 - 08:01 PM");
	   			//07/13/2021 - 08:01 PM
		        
		        //weComments.click();

	   			waitForThread(CommonClass.iWaitForThread);
	   			
	   			//Actions actions2 = new Actions(CommonClass.driver); 
		       // actions2.moveToElement(weclientBilmethodselctn).click().perform();

		      //  weclientBilmethodselctn.click();
		        waitForThread(CommonClass.iWaitForThread);
		       weComments.click();
		        
		      //*[@id="select2-work_order_call_type-container"]
	   		//	Actions actions3 = new Actions(CommonClass.driver); 
		     //   actions3.moveToElement(weclientcallType).click().perform();
		        
		        weclientcallType.click();
		        waitForThread(CommonClass.iWaitForThread);

		        List<WebElement> calltypelist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-work_order_call_type-results']/li")); //select random Department Name
				Random randomCalltypetName = new Random();
				int randomValue = randomCalltypetName.nextInt(calltypelist.size()); //Getting a random value
				calltypelist.get(randomValue).click(); //Clicking on the random item in the list.
				waitForThread(CommonClass.iWaitForThread2);
		     			
		
	   			System.out.println("client call type selection done");



	   							
				//Actions actions5 = new Actions(CommonClass.driver); 
		       // actions5.moveToElement(weclientcallPriority).click().perform();
		        weclientcallPriority.click();
		        waitForThread(CommonClass.iWaitForThread);


			//	Actions SelectPriority = new Actions(CommonClass.driver);
			//	SelectPriority.moveToElement(CommonClass.driver.findElement(By.cssSelector("#select2-work_order_priority-results > li:nth-child(19)"))).build().perform();
			//	Thread.sleep(3000L);
				//CommonClass.driver.findElement(By.cssSelector("#select2-work_order_priority-results > li:nth-child(19)")).click();
			//	CommonClass.driver.findElement(By.xpath("//*[@id='select2-work_order_priority-results']/li[2]")).click();
		        
		        List<WebElement> Prioritylist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-work_order_priority-results']/li")); //select random Department Name
				Random randompriority = new Random();
				int randomValue1 = randompriority.nextInt(Prioritylist.size()); //Getting a random value
				Prioritylist.get(randomValue1).click(); //Clicking on the random item in the list.
				waitForThread(CommonClass.iWaitForThread2);
		        
				
				sendValue(weclientnotes,"Regression Test Notes","Enter the Notes");
				waitForThread(CommonClass.iWaitForThread);
				
			//Iframe code by Harish
				//if(wepopupframe.equals(""))
		      			
	            //{
				//{
				
			//CommonClass.driver.switchTo().frame(wepopupframe);	
				//*[@id="webWidget"]
				//System.out.println("iframe switch properly");
				//Actions actions6 = new Actions(CommonClass.driver); 
		      // actions6.moveToElement(wepopup).click().perform();
		      //}
	           // else
	            //{
	            	//System.out.println("frame disable");
	            	
	          // }
				


				/*if(CommonClass.driver.switchTo().alert() != null)
				{
				    Alert alert = CommonClass.driver.switchTo().alert();
				    String alertText = alert.getText();
				    alert.dismiss(); // alert.accept();

				}*/
				
				
				

		    	waitForThread(CommonClass.iWaitForThread);
				
				weclientnotesSend.click();
				waitForThread(CommonClass.iWaitForThread);
				
				weclientnotesSend.sendKeys(Keys.PAGE_DOWN);
				
				

				
		    	waitForThread(CommonClass.iWaitForThread);
		    	System.out.println("scroll down properly");
		    	
		    	weworkordermanager.click();
		    	waitForThread(CommonClass.iWaitForThread);
		    	
		    	weworkordermanager.sendKeys("harish patil");
	   			//weclientcallTypetxt.sendKeys(Keys.PAGE_DOWN);
		    	weworkordermanagec.click();
		    	waitForThread(CommonClass.iWaitForThread);
				CommonClass.driver.findElement(By.cssSelector("#select2-work_order_assigned_user_ids-results > li")).click();
	   			
				weworkorderDept.click();
				waitForThread(CommonClass.iWaitForThread);
				
				  List<WebElement> deptlist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-work_order_department_id-results']/li")); //select random Department Name
					Random randomdept = new Random();
					int randomValue2 = randomdept.nextInt(deptlist.size()); //Getting a random value
					deptlist.get(randomValue2).click(); //Clicking on the random item in the list.
					waitForThread(CommonClass.iWaitForThread2);
				
				sendValue(weworkordername,"Regression Test Work Order","Enter the Work order Name");
				
				waitForThread(CommonClass.iWaitForThread);
				
				sendValue(weClientExdNTE,"500","Enter the ClientExdNTE");
				waitForThread(CommonClass.iWaitForThread);
				
				//weworkorderTrade.sendKeys("Land");
				waitForThread(CommonClass.iWaitForThread);
				weworkorderTrade.click();

	           // Actions actions7 = new Actions(CommonClass.driver); 
	            //actions7.moveToElement(weworkorderTrade).click();
	        	waitForThread(CommonClass.iWaitForThread1);
				//List<WebElement> optionsToSelect =CommonClass.driver.findElements(By.xpath("//*[@id='select2-work_order_wo_trade_ids-results']"));
		        System.out.println("ul list select proper");                              

		        List<WebElement> tradelist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-work_order_wo_trade_ids-results']/li")); //select random Department Name
				Random randomtrade = new Random();
				int randomValue3 = randomtrade.nextInt(tradelist.size()); //Getting a random value
				tradelist.get(randomValue3).click(); //Clicking on the random item in the list.
				waitForThread(CommonClass.iWaitForThread2);
		        
				weworkorderTradeServices.click();
				waitForThread(CommonClass.iWaitForThread2);
				
				 List <WebElement> Service = CommonClass.driver.findElements(By.xpath("//body/span/span[@class='select2-dropdown select2-dropdown--above']//ul[@role='listbox']/li"));
					if (Service == null || Service.isEmpty()) 
				       {
				    	   
		
						waitForThread(CommonClass.iWaitForThread);
						weClientExdNTE.click();
						waitForThread(CommonClass.iWaitForThread);

					        JavascriptExecutor js2 = ((JavascriptExecutor) CommonClass.driver);
							js2.executeScript("arguments[0].scrollIntoView(true);", weBtnContinue);
							System.out.println("Service is empty");
							weBtnContinue.click();
				       		
							
						}
			        else
					{
						System.out.println("Service is Not empty");
		        
			        Random r1 = new Random();
			        int randomValue4 = r1.nextInt(Service.size()); //Getting a random value
			        Service.get(randomValue4).click(); //Clicking on the random item in the list.
					waitForThread(CommonClass.iWaitForThread);
					
					  JavascriptExecutor js2 = ((JavascriptExecutor) CommonClass.driver);
						js2.executeScript("arguments[0].scrollIntoView(true);", weBtnContinue);
						System.out.println("Service is empty");
						weBtnContinue.click();
					}

				
				//Page2
				waitForThread(CommonClass.iWaitForThread2);
				
				weworkorderclosedate.clear();
				waitForThread(CommonClass.iWaitForThread1);
				weworkorderclosedate.sendKeys("09/27/2021 - 12:15 PM");
				System.out.println("close date select properly");
				waitForThread(CommonClass.iWaitForThread2);
				wewtripstartdate.clear();
				waitForThread(CommonClass.iWaitForThread1);
				//wewtripstartdate.click();
				wewtripstartdate.sendKeys("09/27/2021 - 12:18 PM");
				waitForThread(CommonClass.iWaitForThread2);
				//weselectAssignVendor.sendKeys(Keys.PAGE_DOWN);
			    JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
				js.executeScript("arguments[0].scrollIntoView(true);", weselectAssignVendor);
				System.out.println("Scroll Down Sucessfully and and vendor clickable");

				//System.out.println("page down properly work");

				waitForThread(CommonClass.iWaitForThread2);
				weselectAssignVendor.click();
				waitForThread(CommonClass.iWaitForThread1);
				System.out.println("vendor click properly work");

			
				
			
				  List<WebElement> Vendorlist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-work_order_trips_attributes_0_contractor_id-results']/li")); //select random Department Name
					Random randomvendor = new Random();
					int randomValue4 = randomvendor.nextInt(Vendorlist.size()); //Getting a random value
					Vendorlist.get(randomValue4).click(); //Clicking on the random item in the list.
					waitForThread(CommonClass.iWaitForThread2);
			        
				weselectTrade.click();
				waitForThread(CommonClass.iWaitForThread1);
				
				 List<WebElement> tradelist1 = CommonClass.driver.findElements(By.xpath("//*[@id='select2-work_order_trips_attributes_0_trade_id-results']/li")); //select random Department Name
					Random randomtradel = new Random();
					int randomValue5 = randomtradel.nextInt(tradelist1.size()); //Getting a random value
					tradelist1.get(randomValue5).click(); //Clicking on the random item in the list.
					waitForThread(CommonClass.iWaitForThread2);
			    
				
				weStatus.click();
				
				waitForThread(CommonClass.iWaitForThread1);
			
				//weStatus.sendKeys(Keys.PAGE_DOWN);

				weBtnContinue.click();
				waitForThread(CommonClass.iWaitForThread1);
				waitForThread(CommonClass.iWaitForThread2);
				webtnFinish.click();
			}	

}
