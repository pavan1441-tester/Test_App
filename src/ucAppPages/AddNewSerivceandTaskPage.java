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

public class AddNewSerivceandTaskPage extends ComboAppBasePage
{

	public AddNewSerivceandTaskPage()
	{
		super();
	}
	
	//Click Main menu slide
	@FindBy(css=".fa-plus")
	private WebElement clickOnMainMenu;

	//click on Services Module    
	@FindBy(css="#services > .dropdown-toggle")
	private WebElement clickOnServicesModule;

	//click on Service Section
	@FindBy(css="#trade_services .sidenav-text")
	private WebElement clickOnServiceSection;

	//click on New Service button    
	@FindBy(linkText ="NEW SERVICE")
	private WebElement clickOnNewService;
	
	
	@FindBy(xpath="//*[@id='new_trade_service_emodal']")
	private WebElement modelwindow;
	

	//Click On Select Trade Name
	//@FindBy(css=".select2-container--below .select2-selection")
	//@FindBy(xpath="//form[@id='new-trade']/div[@class='form-group required']/div[@class='col-sm-10']/div/span//span[@role='combobox']/ul[@class='select2-selection__rendered']//input[@role='searchbox']")
	//*[@id="new-trade"]/div[1]/div[1]/div/span/span[1]/span/ul/li/input
    //@FindBy(xpath="//input[@placeholder='Select Trade']")
	//@FindBy(xpath="//input[contains(@placeholder, 'Select Trade')]")
	@FindBy(xpath="//*[@id='new-trade-service']/div/div/div[1]/div[1]/div/div/div/div[1]/span/span[1]")
  	private WebElement tradeNameClick;


	//Enter Trade Name
	//@FindBy(xpath="//input[@type='search']")
	//@FindBy(xpath="//ul[@id='select2-task_trade_id-results']/li[contains('Land')]")
	@FindBy(xpath="//*[@id='select2-trade-service-0-results']/li[1]")
	private WebElement enterName; //control +enter sendkeys

	//Enter Service Name
	//@FindBy(xpath="//input[@id='trade_service_name']")
	@FindBy(xpath="//*[@id='trade_service_name']")
	private WebElement enterServiceName;

	//Enter Service Description
	@FindBy(xpath="//textarea[@id='trade_service_description']")
	private WebElement enterDescription;

	//Click on Create New Task link
	@FindBy(linkText="Create New Task")
	private WebElement createNewTask;

	//ENter Task Name
	@FindBy(xpath="//input[@id='task_name']")
	private WebElement taskName;



	//Enter Cost Code
	@FindBy(xpath="//input[@id='task_cost_code']")
	private WebElement costCode;

	//Click On Save Button
	@FindBy(xpath="(//input[@name='commit'])[2]")
	private WebElement clickTaskSaveButton;

	//Select Newly added Task 
	@FindBy(xpath="//li[contains(.,'Pipe Task')]")
	private WebElement selectNewlyAddedTask;

	@FindBy(xpath="//input[@name='commit']")
	private WebElement clickServiceSaveButton;
	
	@FindBy(xpath="//*[@id='mySidenav']")
	 private WebElement WebElementsidenavbar;

	@FindBy(xpath="//li[@id='sales']/a/div[@class='sidenav-text']")
	 private WebElement WebElementNvbar;


	//@FindBy(xpath="//*[@id='sales']/ul")
	//@FindBy(xpath="//*[@id='sales']/a/div")
	//@FindBy(xpath="/html/body/div[1]/div[3]/div/div/ul/li[6]/a/div")
	///html/body/div[1]/div[3]/div/div/ul/li[6]/a/div
	//*[@id="services"]/a/div
	//@FindBy(xpath="//*[@id='services']/a/div")
	@FindBy(xpath="//li[@id='services']/a/div[@class='sidenav-text']")
	private WebElement WebElementSalesandExpenses;
	
	@FindBy(linkText="Work Orders")
	private WebElement workOrderModule;
	


	//Add new Functions
	public void fnServiceCreation(int iTestCaseID, UCAppData testData) throws Exception
	{
		workOrderModule.click();
		waitForThread(CommonClass.iWaitForThread2);

		Actions actions = new Actions(CommonClass.driver); 
	       actions.moveToElement(WebElementsidenavbar).click().perform();
			waitForThread(CommonClass.iWaitForThread);
			System.out.println("Navigation Menu fuction click");

			WebElementNvbar.click();
		/*Actions actions1 = new Actions(CommonClass.driver); 
	       actions1.moveToElement(WebElementNvbar).click();
			waitForThread(CommonClass.iWaitForThread2);
			System.out.println("Navigation Menu fuction click");*/

			waitForThread(CommonClass.iWaitForThread2);

	//	Actions actions2 = new Actions(CommonClass.driver); 
	     //  actions2.moveToElement(WebElementSalesandExpenses).click().perform();
	       WebElementSalesandExpenses.click();
	       
			waitForThread(CommonClass.iWaitForThread2);

	     // WebElementPurchaseorder.click();
			//waitForThread(CommonClass.iWaitForThread1);

	/*waitForThread(CommonClass.iWaitForThread1);
	clickOnMainMenu.click();
	waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	clickOnServicesModule.click();
	waitForThread(CommonClass.iWaitForThread1);*/

	waitForThread(CommonClass.iWaitForThread1);
	clickOnServiceSection.click();
	waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	clickOnNewService.click();
	waitForThread(CommonClass.iWaitForThread1);
	
	
	Actions actions3 = new Actions(CommonClass.driver); 
    actions3.moveToElement(modelwindow).click().perform();
 

	waitForThread(CommonClass.iWaitForThread1);
	tradeNameClick.click();
	waitForThread(CommonClass.iWaitForThread1);

	//sendValue(enterName,"drainage Pipes","Enter Trade Name");
	//*[@id="trade_service_name"]
	//waitForThread(CommonClass.iWaitForThread1);
	//sendValue(enterName,"Drainage Pipe","Enter Trade Name");

	//waitForThread(CommonClass.iWaitForThread1);
	//sendValue(enterServiceName,"Snow","Enter SIC Code");
	enterName.click();

	waitForThread(CommonClass.iWaitForThread1);
	//sendValue(enterServiceName,"Snow","Enter SIC Code");
	 String NewSerN = "Snow" + new Random().nextInt(1000);
		CommonClass.driver.findElement(By.id("trade_service_name")).sendKeys(NewSerN);
		
    //CommonClass.driver.findElement(locator).sendKeys("Name" +" - "+"Test" + " - " + RandomStringUtils.randomAlphabetic(3));
	//String firstName =CommonClass.ClassName.generateRandomName(9); // 9 Characters long
	//driver.findElement(By.xpath("Your xpath")).sendKeys(firstName);
	
	waitForThread(CommonClass.iWaitForThread);

	sendValue(enterDescription,"Service Added by automation","Enter Description");

	waitForThread(CommonClass.iWaitForThread1);
	createNewTask.click();
	waitForThread(CommonClass.iWaitForThread1);

	sendValue(taskName,"Pipe Task","Enter Task Name");

	waitForThread(CommonClass.iWaitForThread1);
	sendValue(costCode,"500","Enter Cost Code");

	waitForThread(CommonClass.iWaitForThread1);
	clickTaskSaveButton.click();
	waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	selectNewlyAddedTask.click();
	waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	clickServiceSaveButton.click();
	waitForThread(CommonClass.iWaitForThread1);


	}


}
