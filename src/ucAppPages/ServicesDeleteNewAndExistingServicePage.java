package ucAppPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class ServicesDeleteNewAndExistingServicePage extends ComboAppBasePage 

	
	{
		public ServicesDeleteNewAndExistingServicePage() 
		{
			super();
		}
		
		@FindBy(xpath="//*[@id='mySidenav']")
		 private WebElement WebElementsidenavbar;
			
		//services menu optn click	
		//@FindBy(xpath="//li[@id='services']/a/div[@class='sidenav-text']")
		@FindBy(xpath="//*[@id='services']/a/div")
		 private WebElement WebElementservice;
		
		//Services click
		//@FindBy(xpath="//li[@id='trade_services']//div[@class='sidenav-text']")
		@FindBy(xpath="//*[@id='trade_services']/a/div")
		 private WebElement WebElemenserviceclick;
		
		
		//Services sub Trade click
		@FindBy(xpath="//*[@id='trade-list']/table/thead/tr/th[3]")
		 private WebElement WebElementsubTrade;
		
	
		//Services click For the Deletion
		@FindBy(xpath="//table/tbody/tr[1]/td[1]/span/label")
		 private WebElement WebElementserviceselctforDel;
		
	
		//Services click For the Delete optn
		@FindBy(xpath="//*[@id='dropdownMenuButton']/span")
		 private WebElement WebElementserviceselctfordeloptn;

		
		@FindBy(linkText="Delete")
		 private WebElement WebElemendelete;
			
		@FindBy(xpath="//*[@id='delete-confirm-dialog-trade-service']/div/div")
		private WebElement WebElemendeletemodel;
		
		@FindBy(xpath="//button[@id='delete']")
		 private WebElement WebElemetconfirmYes;
		
		//Locators for new Task add under the services
		
		//click on New Service button    
		@FindBy(linkText ="NEW SERVICE")
		private WebElement clickOnNewService;
		
		@FindBy(xpath="//*[@id='new_trade_service_emodal']")
		private WebElement modelwindow;
		
		
		//@FindBy(xpath="//b[@role='presentation']")
		@FindBy(xpath="//form[@id='new-trade-service']//div[@class='col-sm-12']/div[1]/div/div/div/div[1]/span//span[@role='combobox']")
		private WebElement comboclick;
		
		@FindBy(xpath="//*[@id='select2-trade-service-0-results']/li[1]")
		private WebElement enterName; 
		
		
		@FindBy(linkText="Create New Task")
		private WebElement LinkCreateNtask; 
		
	
		@FindBy(xpath="//input[@id='task_name']")
		private WebElement Taskname; 
		
		
		
		@FindBy(xpath="//input[@id='task_cost_code']")
		private WebElement Taskcode; 
		

		//Save button
		@FindBy(xpath="//input[@value='Save' and @type='submit']")	
		    private WebElement weBtnSave;
		
		//CLose the window button
				@FindBy(xpath="//*[@id='new_trade_service_emodal']/div/div/div[1]/button")	
				    private WebElement wecloseoptn;
				
				@FindBy(xpath="//*[@id='work_order']/a/div[2]")
			    private WebElement weBtnwooptn;
			
				
				
		
				

		public void fnServicesDeleteNewAndExistingServicePage(int iTestCaseID, UCAppData testData) throws Exception
		{
			waitForThread(CommonClass.iWaitForThread1);
			WebElementsidenavbar.click();
			waitForThread(CommonClass.iWaitForThread1);

			//waitForThread(CommonClass.iWaitForThread1);
			//WebElementNvbar.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			WebElementservice.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			WebElemenserviceclick.click();
			
			waitForThread(CommonClass.iWaitForThread2);
			
			WebElementsubTrade.click();
			
			waitForThread(CommonClass.iWaitForThread2);

			
			Actions actions1 = new Actions(CommonClass.driver); 
		    actions1.moveToElement(WebElementserviceselctforDel).click().perform();
		    
			waitForThread(CommonClass.iWaitForThread1);
			
			WebElementserviceselctfordeloptn.click();
			
			waitForThread(CommonClass.iWaitForThread1);

			
			WebElemendelete.click();
			
			
			waitForThread(CommonClass.iWaitForThread1);
			
			Actions actions2 = new Actions(CommonClass.driver); 
		    actions2.moveToElement(WebElemendeletemodel).click().perform();

			waitForThread(CommonClass.iWaitForThread1);

			Actions actions3 = new Actions(CommonClass.driver); 
		    actions3.moveToElement(WebElemetconfirmYes).click().perform();
			waitForThread(CommonClass.iWaitForThread1);
			//CommonClass.driver.navigate().refresh();
			weBtnwooptn.click();
			waitForThread(CommonClass.iWaitForThread2);
			waitForThread(CommonClass.iWaitForThread2);
			

  	    
		    

}

        // New Task add under the service Method
		public void fnServicesAddTasktoServicePage(int iTestCaseID, UCAppData testData)  throws Exception
		{
			
			System.out.println("Jump to the Add task service");
			waitForThread(CommonClass.iWaitForThread2);
			WebElementsidenavbar.click();
			waitForThread(CommonClass.iWaitForThread1);
			System.out.println("side navigation click");

			waitForThread(CommonClass.iWaitForThread1);
			//weBtlocknav.click();
			//waitForThread(CommonClass.iWaitForThread2);
			
			WebElementservice.click();
			System.out.println("side nav text click");

			waitForThread(CommonClass.iWaitForThread2);

             WebElemenserviceclick.click();
             
 			System.out.println("services click  text click");

			
			waitForThread(CommonClass.iWaitForThread2);
			
			WebElementsubTrade.click();
			
			waitForThread(CommonClass.iWaitForThread2);

			clickOnNewService.click();
			
			waitForThread(CommonClass.iWaitForThread2);

			Actions actions = new Actions(CommonClass.driver); 
		    actions.moveToElement(modelwindow).click().perform();
		    
			waitForThread(CommonClass.iWaitForThread2);

		    comboclick.click();
			waitForThread(CommonClass.iWaitForThread2);

			enterName.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			LinkCreateNtask.click();
			waitForThread(CommonClass.iWaitForThread2);

		   	sendValue(Taskname,"Regression Test Task","Enter the task Details");
			waitForThread(CommonClass.iWaitForThread);

            
		   	sendValue(Taskcode,"RT001","Enter the task CODE");
			waitForThread(CommonClass.iWaitForThread);

		   	weBtnSave.click();
		   	
			waitForThread(CommonClass.iWaitForThread2);
			
			wecloseoptn.click();
			waitForThread(CommonClass.iWaitForThread);


			
		}
}