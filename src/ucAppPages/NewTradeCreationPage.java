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

public class NewTradeCreationPage extends ComboAppBasePage

{

	public NewTradeCreationPage() 
	{
		super();
	}
	
	@FindBy(xpath="//*[@id='mySidenav']")
	 private WebElement WebElementsidenavbar;

	
	//Click Main menu slide
	@FindBy(css=".fa-plus")
	private WebElement clickOnMainMenu;

	//click on Services Module    
	@FindBy(css="#services > .dropdown-toggle")
	private WebElement clickOnServicesModule;
	
	
	@FindBy(xpath="//*[@id='sales']/a/div")
	 private WebElement WebElementsidenavsales;


	//click on Trades Section
	@FindBy(css="#trades .sidenav-text")
	private WebElement clickOnTradesSection;

	//click on New Trade button    
	@FindBy(linkText  ="NEW TRADE")
	private WebElement clickOnNewTrade;

	//Click On Trade Name
	//@FindBy(css=".select2-container--below .select2-selection")
	@FindBy(xpath="//form[@id='new-trade']/div[1]/div/div/span//span[@role='combobox']")
	private WebElement tradeNameClick;



	//Enter Trade Name
	@FindBy(xpath="//input[@type='search']")
	private WebElement enterName; //control +enter sendkeys
	
	//Enter Trade Name selection
		@FindBy(xpath="//ul[@id='select2-trade_name-results']/li[@role='option']")
		private WebElement SeltradeName; //control +enter sendkeys
		
	

	//Enter SIC Code
	@FindBy(xpath="//input[@id='trade_sic_code']")
	private WebElement sicCode;

	//Enter Authorization Number
	@FindBy(xpath="//input[@id='trade_authorization_number']")
	private WebElement authorizationNumber;

	//Select State Registered to Collect Taxes
	@FindBy(xpath="//select[@id='trade_state']")
	private WebElement selectStateRegisteredName; //sendkeys down arrow nd control+enter

	//Enter Description
	@FindBy(xpath="//textarea[@id='trade_description']")
	private WebElement enterDescription;



	//Click On Save Button
	@FindBy(xpath="//input[@name='commit']")
	private WebElement clickSaveButton;
	//Add new Functions
	
	//Trade selection for delete entry option
	
	//services menu optn click	
		//@FindBy(xpath="//li[@id='services']/a/div")
		//*[@id="services"]/a/div
		@FindBy(xpath="//*[@id='services']/a/div")
		 private WebElement WebElementservice;
		
		//Trades click  
		@FindBy(xpath="//li[@id='trades']//div[@class='sidenav-text']")
		 private WebElement WebElementrades;
		
		
		@FindBy(xpath="//*[@id='trade-list']/table/thead/tr/th[3]")
		 private WebElement WebElementsub;
		
		//New Trade selection for delete
		//@FindBy(xpath="//*[@id='trade-50300']/td[1]/span/label")
		//@FindBy(xpath="//td[contains(text(),'drainage Pipes')]/preceding::label[@class='checkbox-custom-label']")
		@FindBy(xpath="//table/tbody/tr[6]/td[1]/span/label")
		//@FindBy(xpath="//td[contains(text(),'Floor Maint')]/preceding::td/span/label")
		private WebElement WebElementradedel;
			@FindBy(xpath="//a[@id='dropdownMenuButton']/span")
			 private WebElement WebElementradedelsel;
		
			@FindBy(linkText="Delete")
			 private WebElement WebElemendelete;
			
		
			@FindBy(xpath="//*[@id='delete-confirm-dialog-trade']/div/div")
			 private WebElement WebElemendeletemodel;
			
			@FindBy(xpath="/html//button[@id='delete']")
			 private WebElement WebElemetconfirmYes;
			
			//Existing Trade selection for delete
			//@FindBy(xpath="//td[contains(text(),'Floor Maint')]/preceding::td/span/label")
			@FindBy(xpath="//td[contains(text(),'ATSrade')]/preceding::td/span/label[1]")
			//table/tbody/tr[5]/td[2]
			private WebElement WebElementExistdel;	
			
			@FindBy(linkText="Work Orders")
			private WebElement workOrderModule;
			
			//Click on Main Menu List
					@FindBy(xpath="//*[@id='lockNavbar']")
					private WebElement mainMenu;
		
			
			
			
	public void fnTradesCreation(int iTestCaseID, UCAppData testData) throws Exception
	{
		
		
		waitForThread(CommonClass.iWaitForThread1);
		WebElementsidenavbar.click();
		waitForThread(CommonClass.iWaitForThread1);

		
	//waitForThread(CommonClass.iWaitForThread1);
	//clickOnMainMenu.click();
	//waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	clickOnServicesModule.click();
	waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	clickOnTradesSection.click();
	waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	clickOnNewTrade.click();
	waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	tradeNameClick.click();
	waitForThread(CommonClass.iWaitForThread1);

	//sendValue(enterName,"Drainag Pipes","Enter Trade Name");
	//String enterName = "ATTrade+" + new Random().nextInt(1000);
	//CommonClass.driver.findElement(By.id("company_tradesmens_attributes_0_ftc_user_name")).sendKeys(enterName);
	//CommonClass.driver.findElement(By.xpath("input[role='searchbox']")).sendKeys(enterName);
	
	String randoemItemTrade = "ATTrade" + new Random().nextInt(1000);
	enterName.sendKeys(randoemItemTrade);



	waitForThread(CommonClass.iWaitForThread1);
	//sendValue(enterName,"control+enter key","Enter Trade Name");
	SeltradeName.click();

	waitForThread(CommonClass.iWaitForThread1);
	sendValue(sicCode,"104785","Enter SIC Code");

	waitForThread(CommonClass.iWaitForThread1);
	sendValue(authorizationNumber,"204050","Enter Authorization Number");

	//waitForThread(CommonClass.iWaitForThread1);
	//selectStateRegisteredName.click();
	//waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	//sendValue(selectStateRegisteredName,"down arrow + enter button keyboard input","Select State Registered");
	Select State = new Select(CommonClass.driver.findElement(By.id("trade_state")));
	State.selectByVisibleText("Florida");




	waitForThread(CommonClass.iWaitForThread1);
	sendValue(enterDescription,"Trade Added through AT Regression Script","Enter Description");

	waitForThread(CommonClass.iWaitForThread1);
	clickSaveButton.click();
	waitForThread(CommonClass.iWaitForThread1);


	}
	
	public void fnTradesDeletion(int iTestCaseID, UCAppData testData) throws Exception 
	{
	
		
		     workOrderModule.click();
			
			waitForThread(CommonClass.iWaitForThread2);
			mainMenu.click();
			waitForThread(CommonClass.iWaitForThread1);
		

	//WebElementsidenavbar.click();
	//waitForThread(CommonClass.iWaitForThread1);

	//waitForThread(CommonClass.iWaitForThread1);
	//WebElementNvbar.click();
			WebElementsidenavsales.click();
	waitForThread(CommonClass.iWaitForThread2);
	
	WebElementservice.click();
	waitForThread(CommonClass.iWaitForThread1);

	WebElementrades.click();
	waitForThread(CommonClass.iWaitForThread2);
	waitForThread(CommonClass.iWaitForThread2);
	WebElementsub.click();
	waitForThread(CommonClass.iWaitForThread2);
	//WebElementradedel.click();
	Actions actions1 = new Actions(CommonClass.driver); 
    actions1.moveToElement(WebElementradedel).click().perform();
	waitForThread(CommonClass.iWaitForThread2);

    WebElementradedelsel.click();
	waitForThread(CommonClass.iWaitForThread1);

    WebElemendelete.click();
	waitForThread(CommonClass.iWaitForThread1);
	
	Actions actions2 = new Actions(CommonClass.driver); 
    actions2.moveToElement(WebElemendeletemodel).click().perform();

	waitForThread(CommonClass.iWaitForThread1);

	Actions actions3 = new Actions(CommonClass.driver); 
    actions3.moveToElement(WebElemetconfirmYes).click().perform();
}
	
	  // Method For Existing Trade Entry Deletion

		public void fnExistingTradesDeletion(int iTestCaseID, UCAppData testData) throws Exception
		{
			// TODO Auto-generated method stub
			
			  workOrderModule.click();
				
				waitForThread(CommonClass.iWaitForThread2);
				mainMenu.click();
				waitForThread(CommonClass.iWaitForThread1);
				//waitForThread(CommonClass.iWaitForThread1);

				//waitForThread(CommonClass.iWaitForThread1);
				//WebElementNvbar.click();

			//waitForThread(CommonClass.iWaitForThread1);
			//WebElementsidenavbar.click();
			//waitForThread(CommonClass.iWaitForThread1);

			//waitForThread(CommonClass.iWaitForThread1);
			//WebElementNvbar.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			WebElementservice.click();
			waitForThread(CommonClass.iWaitForThread1);

			WebElementrades.click();
			waitForThread(CommonClass.iWaitForThread2);
			waitForThread(CommonClass.iWaitForThread2);
			WebElementsub.click();
			waitForThread(CommonClass.iWaitForThread2);
			//WebElementradedel.click();
			//Actions actions1 = new Actions(CommonClass.driver); 
		   // actions1.moveToElement(WebElementExistdel).click().perform();
			//waitForThread(CommonClass.iWaitForThread2);
			
			  List <WebElement> listings3 = CommonClass.driver.findElements(By.xpath("//label[@class='checkbox-custom-label']"));
		        Random r3 = new Random();
		        int randomValue3 = r3.nextInt(listings3.size()); //Getting a random value
		        listings3.get(randomValue3).click(); //Clicking on the random item in the list.	        
				waitForThread(CommonClass.iWaitForThread2);


		    WebElementradedelsel.click();
			waitForThread(CommonClass.iWaitForThread1);

		    WebElemendelete.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			Actions actions2 = new Actions(CommonClass.driver); 
		    actions2.moveToElement(WebElemendeletemodel).click().perform();
		    
		    Actions actions3 = new Actions(CommonClass.driver); 
		    actions3.moveToElement(WebElemetconfirmYes).click().perform();

		    
		 //   if(isAlertPresent==true)
		    WebDriverWait wait = new WebDriverWait(CommonClass.driver, 500 /*timeout in seconds*/);
		    if(wait.until(ExpectedConditions.alertIsPresent())==null)

		  //  if(isAlertPresent()==null))
		    {
				waitForThread(CommonClass.iWaitForThread1);

			    System.out.println("No alert Present");
		    	
		    }
		    
		    else
		    {
				waitForThread(CommonClass.iWaitForThread1);

			    CommonClass.driver.switchTo( ).alert( ).accept();

		    }
		    
		    

			waitForThread(CommonClass.iWaitForThread1);

			
		    
			
		}



	
}
