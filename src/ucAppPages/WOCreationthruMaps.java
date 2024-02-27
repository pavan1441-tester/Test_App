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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WOCreationthruMaps extends ComboAppBasePage 
{

	public WOCreationthruMaps() 
	{
		super();
	}
	
	@FindBy(css=".fa-2x.fa-map-marker-minus.far.top-header-icons")
    private WebElement MapoptnClick;
	
	
	@FindBy(xpath="//*[@id='map-canvas']")
    private WebElement MapcanvasClick;
	
	
	//@FindBy(xpath="//button[@title='Draw a circle']")
	@FindBy(xpath="//*[@id='map-canvas']/div/div/div[4]/div/div[2]/button")
    private WebElement DrawcircleClick;
	
	//click on filter
	
	@FindBy(xpath="/html//div[@id='navbar']")
    private WebElement ClickonFilter;
	
	
	
	@FindBy(xpath="//div[@id='map-forecast-wrapper']/div[@class='rb-fixed-wrapper']/a[@href='#']/i")
    private WebElement Addootn;
	
	//wo page
	//@FindBy(xpath="//form[@id='new_bulk_work_order_task']//div[@class='col-sm-8 p0']/div[1]/div[1]/span//span[@role='combobox']/span[@role='textbox']/span[@class='select2-selection__placeholder']")
	@FindBy(xpath="//span[@id='select2-work_order_call_type-container']")
   // private WebElement weclientcallType;
	private WebElement calltype;
	
	
	@FindBy(xpath="//body//span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[1]")
    private WebElement calltypesel;
	
	//@FindBy(xpath="	//form[@id='new_bulk_work_order_task']//div[@class='col-sm-8 p0']/div[1]/div[3]/span//span[@role='combobox']/span[@role='textbox']/span[@class='select2-selection__placeholder']")
	@FindBy(xpath="//*[@id='select2-work_order_priority-container']")
	private WebElement priority;
	
	
	@FindBy(xpath="//ul[@role='listbox']/li[1]")
    private WebElement prioritysel;
	
	@FindBy(xpath="//input[@id='bulk_work_order_task_work_order_name']")
    private WebElement Mwoname;
	
	@FindBy(xpath="	//form[@id='new_bulk_work_order_task']/div[5]/div[@class='col-sm-8 p0']/div[2]/div[2]/span//span[@role='combobox']/ul[@class='select2-selection__rendered']//input[@role='searchbox']")
    private WebElement Mwomanagername;
	
	//@FindBy(xpath="//ul[@role='listbox']/li[1]")
	@FindBy(xpath="//*[@id='select2-bulk_work_order_task_assigned_user_ids-results']/li")
    private WebElement Mwomanagernamesel;
	
	
	@FindBy(xpath="//*[@id='bulk_work_order_task_trip_start_date']")
    private WebElement Tarrivaldate;
	
	@FindBy(xpath="//input[@id='trip_object_expiration_date']")
    private WebElement Tarrexpdate;
	
	@FindBy(xpath="//form[@id='new_bulk_work_order_task']//div[@class='col-sm-8 p0']/div[5]/div[1]/span//span[@role='combobox']/span[@role='textbox']")
    private WebElement Trade;
	
	@FindBy(xpath="/html/body/span/span/span[1]/input")
    private WebElement Tradeinput;
	
	
	@FindBy(xpath="//*[@id='select2-bulk_work_order_task_trade_id-results']/li")
    private WebElement Tradesel;
	
	@FindBy(xpath="//form[@id='new_bulk_work_order_task']/div[5]/div[@class='col-sm-8 p0']/div[5]/div[2]/span//span[@role='combobox']/span[@role='textbox']/span[@class='select2-selection__placeholder']")
    private WebElement Tradesevice;
	
	//@FindBy(xpath="/html/body/span/span/span[1]/input")
    //private WebElement Tradeinput;
	


	@FindBy(xpath="//*[@id='select2-bulk_work_order_task_trade_service_id-results']/li[1]")
    private WebElement Tradesevicesel;
	
	@FindBy(xpath="/html//trix-editor[@id='bulk_work_order_task_problem']")
    private WebElement Descriptiondetl;
	
	
	@FindBy(xpath="/html//input[@id='bulk_work_order_task_send_updates_to_vendor']")
    private WebElement Updatetovendor;
	
	
	@FindBy(xpath="//*[@id='bulk_work_order_task_send_est_start_and_end_time_to_vendor']")
    private WebElement Updatetovendorwstartenddate;
	
	@FindBy(xpath="//*[@id='bulk_work_order_task_can_dispatch']")
    private WebElement woDispatchuncheck;
	

	
	@FindBy(xpath="//input[@value='Apply' and @type='submit']")
    private WebElement ApplyBtn;

	
	public void fnWOCreationthruMaps(int iTestCaseID, UCAppData testData) throws Exception 
	{
		
		waitForThread(CommonClass.iWaitForThread2);
		MapoptnClick.click();
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);

		
	    
        Thread.sleep(12000);

		//DrawcircleClick.click();
		Actions actions = new Actions(CommonClass.driver); 
        actions.moveToElement(DrawcircleClick).click().perform();

		System.out.println("CIRCLE NAME SELCTION");

        Actions builder = new Actions(CommonClass.driver);
        Action drawAction = builder.moveToElement(CommonClass.driver.findElement(By.cssSelector("[id='map-canvas']"))) //start points x axis and y axis. 
        		//Action drawAction = builder.moveToElement(CommonClass.driver.findElement(By.cssSelector("/html/body/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/div[2]/div[3]")))
        //Action drawAction = builder.moveToElement(DrawcircleClick) //start points x axis and y axis. 
                       .clickAndHold()
                  .moveByOffset(-5, 60) // 2nd points (x1,y1)
                  .moveByOffset(-30, -50)// 3rd points (x2,y2)
                  .moveByOffset(60, 60) // 2nd points (x1,y1)
                  .moveByOffset(-20, -50)// 3rd points (x2,y
                  .doubleClick()
                  .build();
        drawAction.perform();
        Thread.sleep(6000);
        
        
              

		System.out.println("draw action done");
		waitForThread(CommonClass.iWaitForThread2);


		ClickonFilter.click();

	   
			waitForThread(CommonClass.iWaitForThread2);
			Addootn.click();
			waitForThread(CommonClass.iWaitForThread2);

			calltype.click();
			waitForThread(CommonClass.iWaitForThread2);

			//calltypesel.click();
			//waitForThread(CommonClass.iWaitForThread2);
			
			  List<WebElement> calltypelist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-work_order_call_type-results']/li")); //select random Department Name
				Random randomCalltypetName = new Random();
				int randomValue = randomCalltypetName.nextInt(calltypelist.size()); //Getting a random value
				calltypelist.get(randomValue).click(); //Clicking on the random item in the list.
				waitForThread(CommonClass.iWaitForThread2);
		        
            priority.click();
		   waitForThread(CommonClass.iWaitForThread2);

			//prioritysel.click();
		  // waitForThread(CommonClass.iWaitForThread2);
		   
		   //weclientcallPriority.click();
	         
	        //waitForThread(CommonClass.iWaitForThread);
	        
	             
	        List<WebElement> Prioritylist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-work_order_priority-results']/li")); //select random Department Name
			Random randompriority = new Random();
			int randomValue1 = randompriority.nextInt(Prioritylist.size()); //Getting a random value
			Prioritylist.get(randomValue1).click(); //Clicking on the random item in the list.
			waitForThread(CommonClass.iWaitForThread2);
	    

			Mwoname.sendKeys("MapATworkorder");
			waitForThread(CommonClass.iWaitForThread2);

			Mwomanagername.click();			   
			waitForThread(CommonClass.iWaitForThread2);
  
			Mwomanagername.sendKeys("pavan@utilizecore.com");
			waitForThread(CommonClass.iWaitForThread2);

			Mwomanagernamesel.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			Tarrivaldate.clear();
			waitForThread(CommonClass.iWaitForThread1);


			Tarrivaldate.sendKeys("08/17/2021 - 12:15 PM");
			waitForThread(CommonClass.iWaitForThread1);

			Tarrexpdate.sendKeys("08/17/2021 - 12:18 PM");
			
			Trade.click();
			waitForThread(CommonClass.iWaitForThread1);
			//Trade.sendKeys("HVAC");
			Tradeinput.sendKeys("HVAC");
			waitForThread(CommonClass.iWaitForThread1);

			Tradesel.click();
			waitForThread(CommonClass.iWaitForThread1);
 
			Tradesevice.click();
			waitForThread(CommonClass.iWaitForThread1);
			//Tradesevice.sendKeys("HVAC Services");
			Tradeinput.sendKeys("HVAC Services");

			waitForThread(CommonClass.iWaitForThread1);
			Tradesevicesel.click();
			waitForThread(CommonClass.iWaitForThread1);

			Descriptiondetl.sendKeys("AT as the trip description");
			waitForThread(CommonClass.iWaitForThread1);

			Updatetovendor.click();
			waitForThread(CommonClass.iWaitForThread1);

			Updatetovendorwstartenddate.click();
			waitForThread(CommonClass.iWaitForThread1);
			woDispatchuncheck.click();
			waitForThread(CommonClass.iWaitForThread1);
			
		    JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
			js.executeScript("arguments[0].scrollIntoView(true);", ApplyBtn);
			System.out.println("Apply button clickable");
			waitForThread(CommonClass.iWaitForThread1);

			ApplyBtn.click();
			waitForThread(CommonClass.iWaitForThread2);
			waitForThread(CommonClass.iWaitForThread1);


	}
}
