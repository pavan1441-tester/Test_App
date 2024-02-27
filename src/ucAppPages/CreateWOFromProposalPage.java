package ucAppPages;

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

public class CreateWOFromProposalPage extends ComboAppBasePage
{

	public CreateWOFromProposalPage() 
	{
		super();
	}
		//Click on Main Menu List
		@FindBy(xpath="//*[@id='lockNavbar']")
		 private WebElement mainMenu;
		
		//Click on Sales-Expenses Menu
		@FindBy(css="#sales > .dropdown-toggle > .sidenav-text")
		 private WebElement salesExpenses;
		
		//Click on Proposals Sub-Menu
		@FindBy(css="#proposals .sidenav-text")
		 private WebElement proposals;
		
		//@FindBy(xpath="//*[@id='proposal-list']/table/thead/tr[1]/th[9]")
		@FindBy(xpath="//*[@id='page-content']")
		 private WebElement MenuHeading;
					
		
		
				//Click on wo Sub-Menu
				//@FindBy(css="a[class*='auto-create-wo m5']")
		       // @FindBy(css="a[class*='auto-create-wo m5' ]")
				//@FindBy(xpath="//div[@id='proposal-list']/table/tbody/tr/td[9]/div/span[3]/a/i[@class='fa fa-random']")
				//@FindBy(xpath="//div[@id='proposal-list']/table/tbody/tr/td[9]/div/span[3]/a/i[@class='fa fa-random'][1]")
		        //@FindBy(xpath="//a[@data-toggle='tooltip']/i[@class='fa fa-random'][1]")
		       // @FindBy(xpath="//html/body/div[1]/div[1]/div[3]/div[2]/div[8]/div[1]/table/tbody/tr[46]/td[9]/div/span[3]/a/i")
		       // @FindBy(xpath="//*[@id='proposal_1106']/td[3]")
		       // @FindBy(xpath="//table/tbody/tr/td[9]/div/span[3]/a/i[@class='fa fa-random'][1]")
		       // @FindBy(xpath="//table/tbody/tr/td[9]/div/span[3]/a[1]")
		        @FindBy(xpath="/table/tbody/tr[5]/td[7]/a/div")
				 private WebElement createwoSel;
				
		
		//Click on Accept button
		@FindBy(xpath="//div[@id='eFooter']/button")
		 private WebElement acceptButton;
		
		
		//ENter Comment
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
		@FindBy(xpath="//*[@id='select2-work_order_wo_trade_ids-results']/li[2]")
	    private WebElement weworkorderTradesel;
		
		
		
		
		@FindBy(xpath="//input[contains(@placeholder, 'Select Services')]")
	    private WebElement weworkorderTradeServices;
		

		
	
		@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--above']//ul[@role='listbox']/li[1]")
		//@FindBy(xpath="//span[@class='select2-dropdown select2-dropdown--above']//li")
		//@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown—below']//ul[@role='listbox']/li[@role='option']")
		private WebElement weworkorderTradeServicesSelctn;
		
		@FindBy(xpath="//span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[@role='alert']")
		private WebElement weworkorderTradeServicesNoResultFoundSelctn;

		
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
		
		
		//@FindBy(xpath="//*[@id='team_member_assignee_type']")
		@FindBy(xpath="//*[@id='tradesmen_assignee_type']")
	    private WebElement weselectAssigntype;
		
		//*[@id="tradesmen_assignee_type"]
		
		//@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_team_member_ids-container']")
		@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_tradesmen_ids-container']")
	    private WebElement weselectAssignTrademan;
		
	
		
		//@FindBy(xpath="//span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[text() = 'Test Crew1']")
		
		///html/body/span/span/span[2]/ul/li[1]/ul/li[4]
		//@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_team_member_ids-results']/li[1]/ul/li[2]")
				
		@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_tradesmen_ids-results']/li[1]/ul/li[text() = 'Test Crew']")
	    private WebElement weselectAssignTeammembersel;
		
		
		@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_trade_id-container']")
	    private WebElement weselectTrade;

		
		
		@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_trade_id-results']/li[2]")
	    private WebElement weselectTradeSel;
		
		@FindBy(xpath="//input[contains(@placeholder, 'Select Trade Service')]")
	    private WebElement weTradeServices;
		
		//@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_trip_wo_service_trade_ids-results]/li[text() = 'Debris Removal']")
		//@FindBy(xpath="//*[@id='select2-work_order_trips_attributes_0_trip_wo_service_trade_ids-results]/li[text() = 'Debris Removal']")				               
		//@FindBy(xpath="//span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[text() = 'Debris Removal']")
		//@FindBy(xpath="//span[@class='select2-dropdown select2-dropdown—below']//ul[@role='listbox']/li[text() = 'Debris Removal']")
		@FindBy(xpath="//span[@class='select2-dropdown select2-dropdown—below']//ul[@role='listbox']/li[@role='option']")
	    private WebElement weTradeServicesSel;
		
		
		@FindBy(xpath="//*[@id='notes_text_div']")
	    private WebElement weText;

		@FindBy(xpath="//*[@id='status']/label[1]")
	    private WebElement weStatus;
		
		
		@FindBy(xpath="//input[contains(@placeholder, 'Select Task')]")
	    private WebElement weTradeTask;
		
					

		@FindBy(xpath="//*[@id='add-more-trip']/a")
	    private WebElement weAddtrip;
		

		@FindBy(linkText ="FINISH")
	    private WebElement webtnFinish;
		
		public void fnCreateWOFromProposal(int iTestCaseID, UCAppData testData) throws Exception
		{  
			waitForThread(CommonClass.iWaitForThread);
			mainMenu.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			salesExpenses.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			proposals.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			mainMenu.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread2);
			
			//MenuHeading.click();
			
		    CommonClass.action.moveToElement(MenuHeading).click().build().perform();
			waitForThread(CommonClass.iWaitForThread);

   			System.out.println("click opration done");

			/*JavascriptExecutor js = (JavascriptExecutor) CommonClass.driver;
			js.executeScript("window.scrollBy(0,750)", "");
			waitForThread(CommonClass.iWaitForThread2);*/
			
   			//System.out.println("First scroll done");

			
			JavascriptExecutor js1 = ((JavascriptExecutor) CommonClass.driver);
			js1.executeScript("arguments[0].scrollIntoView(true);", createwoSel);
			//js1.executeScript("arguments[0].scrollIntoView();", createwoSel);
			waitForThread(CommonClass.iWaitForThread2);
			waitForThread(CommonClass.iWaitForThread2);

			createwoSel.click();

   		/*	System.out.println("second scroll done");

			//List <WebElement> createWo = CommonClass.driver.findElements(By.cssSelector("a[class*='auto-create-wo m5']"));
			List <WebElement> createWo = CommonClass.driver.findElements(By.xpath("//table/tbody/tr/td[9]/div/span[3]/a[1]"));
         
			waitForThread(CommonClass.iWaitForThread);
			
			
			Random Wo = new Random();
			int randomValue = Wo.nextInt(createWo .size()); //Getting a random value
			//by harish
			waitForThread(CommonClass.iWaitForThread);

			
			
			createWo.get(randomValue).click(); //Clicking on the random item in the list.
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);*/

			 
			//CommonClass.driver.switchTo().frame("eFooter");
			//System.out.println("Switched to Frame success");
			waitForThread(CommonClass.iWaitForThread);
			acceptButton.click();
			waitForThread(CommonClass.iWaitForThread1);

			
			//Pop up window handles for Accept
			//CommonClass.driver.switchTo().alert().accept();
			
			waitForThread(CommonClass.iWaitForThread1);
			
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
   			Actions actions3 = new Actions(CommonClass.driver); 
	        actions3.moveToElement(weclientcallType).click().perform();
	        
	        Actions SelectCallType = new Actions(CommonClass.driver);
			SelectCallType.moveToElement(CommonClass.driver.findElement(By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input"))).build().perform();
			Thread.sleep(2000L);
			CommonClass.driver.findElement(By.cssSelector("#select2-work_order_call_type-results > li:nth-child(2)")).click();
        
	        

	       // weclientcallType.click();
	        waitForThread(CommonClass.iWaitForThread);
	        
			//Select dropdown = new Select(weclientcallTypetxt);
			//dropdown.selectByVisibleText("Maintenance");
			//dropdown.selectByIndex(1);
	

	        
   			//sendValue(weclientcallTypetxt,"Maintenance","Enter the call type");
   			
   			
	       // sendkeys(weclientcallTypetxt,"Maintenance","Enter the call type");
   			System.out.println("client call type selection done");
	        //weclientcallTypetxt.sendKeys("Maintenance");
	        
	        waitForThread(CommonClass.iWaitForThread);

   			//weclientcallTypetxt.sendKeys(Keys.PAGE_DOWN);
	        //waitForThread(CommonClass.iWaitForThread);


   			/*Actions actions4 = new Actions(CommonClass.driver); 
	        actions4.moveToElement(weclientProblemType).click().perform();
         
	        waitForThread(CommonClass.iWaitForThread);

	        //sendValue(weclientProblemType,"Enhancement","Enter the Problem type");
	       // waitForThread(CommonClass.iWaitForThread);
			Actions SelectProblemType = new Actions(CommonClass.driver);
			SelectProblemType.moveToElement(CommonClass.driver.findElement(By.cssSelector("li[id*='Enhancement']"))).build().perform();
			Thread.sleep(2000L);
			CommonClass.driver.findElement(By.cssSelector("li[id*='Enhancement']")).click();*/
			
			
			/*	WebElement Priority = driver.findElement(By.xpath("//span[@id='select2-work_order_priority-container']"));
			Priority.click();
			System.out.println("Text priority box is displayed: " + 	Priority.isDisplayed());
			Thread.sleep(6000L);*/
			
			
			
			Actions actions5 = new Actions(CommonClass.driver); 
	        actions5.moveToElement(weclientcallPriority).click().perform();
         
	        waitForThread(CommonClass.iWaitForThread);


			Actions SelectPriority = new Actions(CommonClass.driver);
			SelectPriority.moveToElement(CommonClass.driver.findElement(By.cssSelector("#select2-work_order_priority-results > li:nth-child(19)"))).build().perform();
			Thread.sleep(3000L);
			//CommonClass.driver.findElement(By.cssSelector("#select2-work_order_priority-results > li:nth-child(19)")).click();
			CommonClass.driver.findElement(By.xpath("//*[@id='select2-work_order_priority-results']/li[2]")).click();
					
			
			waitForThread(CommonClass.iWaitForThread);
			
			//Robot robot = new Robot();
			//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			
			//robot.keyPress(KeyEvent.);
			//((JavascriptExecutor)CommonClass.driver).executeScript("scroll(0,250)");
			
		      // JavascriptExecutor js = (JavascriptExecutor)CommonClass.driver;
		       
		       //specify the number of pixels the page has to be scrolled
		       //js.executeScript("window.scrollBy(0,3000)");
		       //js.executeScript("scroll(0,-250);");
			waitForThread(CommonClass.iWaitForThread);
			
			//Actions a = new Actions(CommonClass.driver);
			//WebElement el = CommonClass.driver.findElement(By.xpath("//*[@id='work_order_modal']"));
			//a.moveToElement(el).clickAndHold().moveByOffset(0, 1000000).release().perform();
			//el.sendKeys(Keys.PAGE_DOWN);
			
			//waitForThread(CommonClass.iWaitForThread2);


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
			
			//Robot robot = new Robot();
			//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			//robot.keyPress(KeyEvent.);
			
		     // ((JavascriptExecutor)CommonClass.driver).executeScript("arguments[0].scrollIntoView(true);", weworkordermanager);

			
			//((JavascriptExecutor)CommonClass.driver).executeScript("scroll(0,1000)");
			//((JavascriptExecutor)CommonClass.driver).executeScript("window.scrollBy(0,70)", "");
			//((JavascriptExecutor)CommonClass.driver).executeScript("window.scrollTo(0, 250)");

			//Actions actions7 = new Actions(CommonClass.driver); 
	        //actions7.keyDown(null).click();

			
	    	waitForThread(CommonClass.iWaitForThread);
	    	System.out.println("scroll down properly");
	    	
	    	weworkordermanager.click();
	    	waitForThread(CommonClass.iWaitForThread);
	    	/*Actions actions7 = new Actions(CommonClass.driver); 
	        actions7.moveToElement(weworkdodermanagerselct);
	     	waitForThread(CommonClass.iWaitForThread);
	        weworkdodermanagerselct.click();*/
	    	weworkordermanager.sendKeys("harish patil");
   			//weclientcallTypetxt.sendKeys(Keys.PAGE_DOWN);
	    	weworkordermanagec.click();
	    	waitForThread(CommonClass.iWaitForThread);
			CommonClass.driver.findElement(By.cssSelector("#select2-work_order_assigned_user_ids-results > li")).click();
   			
			weworkorderDept.click();
			waitForThread(CommonClass.iWaitForThread);
			//weworkorderDept.sendKeys("QA");
			weworkorderDeptsel.click();
			waitForThread(CommonClass.iWaitForThread);
			sendValue(weworkordername,"Regression Test Work Order","Enter the Work order Name");
			
			waitForThread(CommonClass.iWaitForThread);
			
			sendValue(weClientExdNTE,"500","Enter the ClientExdNTE");
			waitForThread(CommonClass.iWaitForThread);
			
			//weworkorderTrade.sendKeys("Land");
			waitForThread(CommonClass.iWaitForThread);
			weworkorderTrade.click();

           // Actions actions7 = new Actions(CommonClass.driver); 
            //actions7.moveToElement(weworkorderTrade).click();
        	waitForThread(CommonClass.iWaitForThread2);
			//List<WebElement> optionsToSelect =CommonClass.driver.findElements(By.xpath("//*[@id='select2-work_order_wo_trade_ids-results']"));
	        System.out.println("ul list select proper");                              

			/*waitForThread(CommonClass.iWaitForThread2);
			for(WebElement option : optionsToSelect)
			{
			    System.out.println(option);
			    if(option.getText().equals("Land")) 
			    {
			        System.out.println("Trying to select: "+"Land");
			        option.click();
			        break;
			    }
			}*/
			
		//	weworkorderTradesel.click();
			//*[@id="select2-work_order_wo_trade_ids-results"]/li
	        //by harish
	        //Random Value selction from drop down list
	        List <WebElement> Tradesel = CommonClass.driver.findElements(By.xpath("//*[@id='select2-work_order_wo_trade_ids-results']/li"));
	        Random r = new Random();
	        int randomValue1 = r.nextInt(Tradesel.size()); //Getting a random value
	        Tradesel.get(randomValue1).click(); //Clicking on the random item in the list.


			waitForThread(CommonClass.iWaitForThread);
			//CommonClass.driver.findElement(By.cssSelector("#select2-work_order_wo_trade_ids-results > li")).click();
			waitForThread(CommonClass.iWaitForThread);
			weworkorderTradeServices.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			//*[@id="select2-work_order_work_order_trades_attributes_1631113484424_wo_trade_service_ids-results"]/li
			
	      //  List <WebElement> Service = CommonClass.driver.findElements(By.xpath("//*[@id='select2-work_order_work_order_trades_attributes_1631113484424_wo_trade_service_ids-results']/li"));
			 List <WebElement> Service = CommonClass.driver.findElements(By.xpath("//body/span/span[@class='select2-dropdown select2-dropdown--above']//ul[@role='listbox']/li"));
			if (Service == null || Service.isEmpty()) 
		       {
		    	   
					//weBtnContinue.click();
					//System.out.print("Service is No Result found case");
				//	Actions actions = new Actions(CommonClass.driver); 
		       	//	waitForThread(CommonClass.iWaitForThread);
			     //   actions.moveToElement(weBtnContinue).perform();
				waitForThread(CommonClass.iWaitForThread);
				weText.click();
				waitForThread(CommonClass.iWaitForThread2);

			        JavascriptExecutor js2 = ((JavascriptExecutor) CommonClass.driver);
					js2.executeScript("arguments[0].scrollIntoView(true);", weBtnContinue);
					System.out.println("Service is empty");
					weBtnContinue.click();
		       		
					
				}
	        else
			{
				System.out.println("Service is Not empty");
        
	        Random r1 = new Random();
	        int randomValue2 = r1.nextInt(Service.size()); //Getting a random value
	        Service.get(randomValue2).click(); //Clicking on the random item in the list.
			waitForThread(CommonClass.iWaitForThread2);

	    	weworkorderTask.click();
			waitForThread(CommonClass.iWaitForThread2);
			weworkorderTaskSelctn.click();

			
			waitForThread(CommonClass.iWaitForThread1);
			weBtnContinue.click();
			System.out.println("1st page properly work");

			}
	        
	       //if(Service.isEmpty())
	    /*	   if (Service == null || Service.isEmpty()) 
	       {
	    	   
				//weBtnContinue.click();
				System.out.print("Service is No Result found case");
				Actions actions = new Actions(CommonClass.driver); 
	       		waitForThread(CommonClass.iWaitForThread);
		        actions.moveToElement(weBtnContinue).perform();
	       		
				
			}*/
			/*else
			{
				weworkorderTradeServicesSelctn.click();
				waitForThread(CommonClass.iWaitForThread2);
				weworkorderTask.click();
				waitForThread(CommonClass.iWaitForThread2);
				weworkorderTaskSelctn.click();
				

			}*/
			
					
			//Page2
			waitForThread(CommonClass.iWaitForThread2);
			//weworkorderclosedate.click();
			//WebElement dateWidget = driver.findElement(your locator);
			//List<WebElement> columns=weworkorderclosedate.findElements(By.tagName("td"));

			/*for (WebElement cell: columns){
			   //Select 13th Date 
			   if (cell.getText().equals("16"))
			   {
			      cell.findElement(By.linkText("16")).click();
			      break;
			    }*/
			weworkorderclosedate.clear();
			waitForThread(CommonClass.iWaitForThread1);
			weworkorderclosedate.sendKeys("08/17/2021 - 12:15 PM");
			System.out.println("close date select properly");
			waitForThread(CommonClass.iWaitForThread2);
			wewtripstartdate.clear();
			waitForThread(CommonClass.iWaitForThread1);
			//wewtripstartdate.click();
			wewtripstartdate.sendKeys("08/17/2021 - 12:18 PM");
			waitForThread(CommonClass.iWaitForThread2);
			weselectAssigntype.click();
			waitForThread(CommonClass.iWaitForThread2);
			weselectAssigntype.sendKeys(Keys.PAGE_DOWN);
			waitForThread(CommonClass.iWaitForThread2);
			weselectAssignTrademan.click();
			waitForThread(CommonClass.iWaitForThread1);
			//selectValue(weselectAssignTrademan, "Harish patil", "selettctrademan");
			weselectAssignTeammembersel.click();
			waitForThread(CommonClass.iWaitForThread2);
			weselectTrade.click();
			waitForThread(CommonClass.iWaitForThread1);
			weselectTradeSel.click();
			waitForThread(CommonClass.iWaitForThread1);
			//weTradeServices.click();
			//waitForThread(CommonClass.iWaitForThread1);
			//weTradeServicesSel.click();
			//waitForThread(CommonClass.iWaitForThread2);
			//weTradeTask.click();
			weStatus.click();
			
			waitForThread(CommonClass.iWaitForThread1);
		
			//weStatus.sendKeys(Keys.PAGE_DOWN);

			weBtnContinue.click();
			waitForThread(CommonClass.iWaitForThread1);
			waitForThread(CommonClass.iWaitForThread2);
			webtnFinish.click();
			

		}	
	
		
		
}