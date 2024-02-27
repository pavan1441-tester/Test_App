package ucAppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class WOCreationthruMapsAddingSchedularforDefaultsites extends ComboAppBasePage
{

	public WOCreationthruMapsAddingSchedularforDefaultsites() 
	{
		super();
	}
	
	//popup close
	@FindBy(xpath="//*[@id='Embed']/div/div/div/div/div/div/div[1]/div/button[2]")
	 private WebElement wepopup;
	
	
	@FindBy(xpath="//*[@id='webWidget']")
    private WebElement wepopupframe;
	
	
	@FindBy(css=".fa-2x.fa-map-marker-minus.far.top-header-icons")
    private WebElement MapoptnClick;
	
	@FindBy(xpath="//div[@id='map-forecast-wrapper']/div[@class='rb-fixed-wrapper']/a[@href='#']/i")
    private WebElement Addootn;
	
	//wo page
		@FindBy(xpath="//form[@id='new_bulk_work_order_task']//div[@class='col-sm-8 p0']/div[1]/div[1]/span//span[@role='combobox']/span[@role='textbox']/span[@class='select2-selection__placeholder']")
	    private WebElement calltype;
		
		
		@FindBy(xpath="//body//span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[1]")
	    private WebElement calltypesel;
		
		@FindBy(xpath="	//form[@id='new_bulk_work_order_task']//div[@class='col-sm-8 p0']/div[1]/div[3]/span//span[@role='combobox']/span[@role='textbox']/span[@class='select2-selection__placeholder']")
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
		
		//@FindBy(xpath="//div[contains(@id,'select2-bulk_work_order_task_assignee_type')]")
		@FindBy(xpath="//*[starts-with(@id,'select2-bulk_work_order_task_assignee_type')]")
	    private WebElement AssignOptn;
		
	
		//@FindBy(xpath="//*[@id=\"select2-bulk_work_order_task_assignee_type_72202-result-nhrz-Tradesmen\"]")
		//@FindBy(xpath="//*[ends-with(@id,'Tradesmen')]")
		@FindBy(xpath="//body//span[@class='select2-dropdown select2-dropdown--below']//input[@role='searchbox']")
		    private WebElement AssignOptnsel;
		
		//@FindBy(xpath="//body//span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[@role='option']")
	    //@FindBy(xpath="//id[contains(text(),'Tradesmen')]")
	    @FindBy(xpath="//body//span//ul[@role='listbox']/li[@role='option']")
	    private WebElement AssignOptnselction;

		
		@FindBy(xpath="//input[contains(@placeholder, 'Tradesmen Assignee')]")
	    private WebElement weTradesmenAssignee;
		
		
		@FindBy(xpath="//body//span//ul[@role='listbox']/li[@role='option']")
	    private WebElement weTradesmenNamesel;
		
		@FindBy(xpath="//input[@value='Save' and @type='submit']")
	    private WebElement saveBtn;
	

		
		@FindBy(xpath="//a[text()='Schedule']")	
		 private WebElement weScheduleBtn;
		

	
	
	public void fnWOCreationthruMapsAddingSchedularforDefaultsites(int iTestCaseID, UCAppData testData) throws Exception 
	{
		
		waitForThread(CommonClass.iWaitForThread2);
		MapoptnClick.click();
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		
		 if(!CommonClass.driver.findElements(By.xpath("//*[@id='webWidget']")).isEmpty())
		 {

        System.out.println("frame Unable");

	    CommonClass.driver.switchTo().frame(wepopupframe);	
		
		System.out.println("iframe switch properly");
		Actions actions6 = new Actions(CommonClass.driver); 
       actions6.moveToElement(wepopup).click().perform();
     }
      else
       {
       	System.out.println("frame disable");
       	
     }

		
	    Thread.sleep(12000);
	    
	   

	    waitForThread(CommonClass.iWaitForThread2);
		Addootn.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		calltype.click();
		waitForThread(CommonClass.iWaitForThread2);

		calltypesel.click();
		waitForThread(CommonClass.iWaitForThread2);
        priority.click();
	   waitForThread(CommonClass.iWaitForThread2);

		prioritysel.click();
	   waitForThread(CommonClass.iWaitForThread2);

		//Mwoname.sendKeys("MapATworkorder");
		//waitForThread(CommonClass.iWaitForThread2);

		//Mwomanagername.click();			   
		//waitForThread(CommonClass.iWaitForThread2);

		//Mwomanagername.sendKeys("pavan@utilizecore.com");
		//waitForThread(CommonClass.iWaitForThread2);

		//Mwomanagernamesel.click();
		//waitForThread(CommonClass.iWaitForThread1);
		
		Tarrivaldate.clear();
		waitForThread(CommonClass.iWaitForThread1);


		Tarrivaldate.sendKeys("08/17/2021 - 12:15 PM");
		waitForThread(CommonClass.iWaitForThread1);

		//Tarrexpdate.sendKeys("08/17/2021 - 12:18 PM");
		
		//Trade.click();
		//waitForThread(CommonClass.iWaitForThread1);
		//Trade.sendKeys("HVAC");
		//Tradeinput.sendKeys("HVAC");
		//waitForThread(CommonClass.iWaitForThread1);

		//Tradesel.click();
		//waitForThread(CommonClass.iWaitForThread1);

		//Tradesevice.click();
		//waitForThread(CommonClass.iWaitForThread1);
		//Tradesevice.sendKeys("HVAC Services");
		//Tradeinput.sendKeys("HVAC Services");

		//waitForThread(CommonClass.iWaitForThread1);
		//Tradesevicesel.click();
		//waitForThread(CommonClass.iWaitForThread1);

		//Descriptiondetl.sendKeys("AT as the trip description");
		//waitForThread(CommonClass.iWaitForThread1);

		//Updatetovendor.click();
		//waitForThread(CommonClass.iWaitForThread1);

		//Updatetovendorwstartenddate.click();
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
		
		
		JavascriptExecutor js1 = ((JavascriptExecutor) CommonClass.driver);
		js1.executeScript("arguments[0].scrollIntoView(true);", AssignOptn);
		System.out.println("Assignee option click");
		waitForThread(CommonClass.iWaitForThread2);
		AssignOptn.click();
		waitForThread(CommonClass.iWaitForThread2);

		//AssignOptnsel.click();
		AssignOptnsel.sendKeys("Tradesmen");
		waitForThread(CommonClass.iWaitForThread2);

		AssignOptnselction.click();
		waitForThread(CommonClass.iWaitForThread2);
		weTradesmenAssignee.sendKeys("Default Tradesman");
		waitForThread(CommonClass.iWaitForThread2);
		
		weTradesmenNamesel.click();
		waitForThread(CommonClass.iWaitForThread2);

		
		saveBtn.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		

	    JavascriptExecutor js2 = ((JavascriptExecutor) CommonClass.driver);
		js2.executeScript("arguments[0].scrollIntoView(true);", weScheduleBtn);
		System.out.println("Schedule button visible");
		waitForThread(CommonClass.iWaitForThread2);

		weScheduleBtn.click();
      
		System.out.println("Schedule button click");

	}
}
