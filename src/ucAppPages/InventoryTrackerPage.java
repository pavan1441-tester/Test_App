package ucAppPages;

import lib.UCAppData;
import lib.CommonClass;
import net.bytebuddy.asm.Advice.Enter;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
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
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.Page;


public class InventoryTrackerPage extends ComboAppBasePage 
{

	public InventoryTrackerPage() 
	{
		super();
	}

	@FindBy(xpath="//*[@id='mySidenav']")
	 private WebElement WebElementsidenavbar;

	
	//Click Main menu slide
	@FindBy(xpath="//div[@id='mySidenav']//ul[@class='nav navbar-nav']/li[@id='clients']/a/div[@class='sidenav-text']")
	private WebElement clickOnAssetmonitorsModule;

	//click on Services Module    
	//@FindBy(xpath="//li[@id='materials']//div[@class='sidenav-text']")
	//private WebElement clickOnAssetmonitorsModule;

	//click on Inventory Section
	@FindBy(xpath="//li[@id='materials']//div[@class='sidenav-text']")
	private WebElement clickOnWebElementAssetMonitor;
	
	@FindBy(xpath="//a[@title='Upload Materials']")
	private WebElement clickupload;
	
	
	@FindBy(xpath="//form[@id='new_background_task']//label")
	private WebElement clickDragtoUpload;
	
	
	@FindBy(linkText="CREATE NEW MATERIAL")
	private WebElement newMaterialLink;
	
	
	@FindBy(linkText="Manual Input")
	private WebElement ManuaInputBtn;
	
	
	@FindBy(xpath="//input[@id='company_material_name']")
	 private WebElement WebElementMaterialName;
	
	
	@FindBy(xpath="//textarea[@id='company_material_description']")
	 private WebElement WebElementMaterialDescription;

	
	@FindBy(xpath="//input[@id='company_material_unit_cost']")
	 private WebElement WebElementMaterialUnitcost;


	@FindBy(xpath="//input[@id='company_material_unit_sell']")
	 private WebElement WebElementMaterialUnitsell;

	
	@FindBy(xpath="//form[@id='company_material']/div[5]/div/span//span[@role='combobox']")
	 private WebElement WebElementMaterialUnitcombo;


	
	@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[3]")
	 private WebElement WebElementMaterialUnitcombosel;

	
	@FindBy(xpath="//input[@id='company_material_units']")
	 private WebElement WebElementMaterialUnit;

	
	@FindBy(xpath="//input[@id='company_material_amount_in_stock']")
	 private WebElement WebElementMaterialAmtstock;


	@FindBy(xpath="//input[@id='company_material_barcode']")
	 private WebElement WebElementMaterialbarcode;


	@FindBy(xpath="//input[@id='company_material_public']")
	 private WebElement WebElementMaterialPublic;

	
	//Save button
	@FindBy(xpath="//input[@value='SAVE' and @type='submit']")	
	 private WebElement WebElementBtnSave;
	
	 //div[@id='invoice-list']/table/tbody/tr[2]/td[.='Test Material']
	
	@FindBy(xpath="//td[contains(text(),'Test Material')])")
	 private WebElement tdtext;
	
	//INCREASE stock
	   @FindBy(xpath="//*[contains(@class,'fa fa-plus-square space-plus-square')]")
	   private WebElement Addstockclick;
	   
	  //css=a[href*='company/company_materials '][class='fa fa-plus-square space-plus-square']");

	   
	 
	  // @FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown—below']//input[@role='searchbox']")
	  // @FindBy(xpath="/form[@id='new_company_material_log']/div[4]//div[@class='col-sm-9']/span//span[@role='combobox']")
	   @FindBy(xpath="//*[@id='new_company_material_log']/div[4]/div/div/span")
	   private WebElement Addstockbysel;
	   
	
	   @FindBy(xpath="//ul[@id='select2-unit-material-input-results']/li[2]")
	   private WebElement Addstockbyoption;
	   
	   
	   @FindBy(xpath="//input[@id='company_material_log_amount']")
	   private WebElement AddstockbyAmount;
	   
	 //Minus Stock  
	   @FindBy(xpath="//*[contains(@class,'fa fa-minus-square')]")
	   private WebElement Minusstockclick;
	   
	 //Transfer From another material
	   @FindBy(xpath="//span[@id='filter-control']/i")
	   private WebElement Filteroptnsel;
	   
	   
	   @FindBy(xpath="//div[@id='user-filter-group-0']/div[1]/div[@class='input-container']/div/div/div/span//span[@role='combobox']/ul[@class='select2-selection__rendered']//input[@role='searchbox']")
	   private WebElement Filtername;
	   
	   @FindBy(xpath="//*[@id='select2-filters_items_name|materials#index_v-results']/li")
	   private WebElement Filternamesel;
	
	   
	 
	   @FindBy(xpath="//div[1]/input[@role='button']")
	   private WebElement RunFilterBtnclick;
	   
	   
	   @FindBy(xpath="/html//select[@id='company_material_log_resource_type']")
	   private WebElement Fromclick;
	   
	 
	   @FindBy(xpath="//*[@id='company_material_log_resource_type']/option[3]")
	   private WebElement selectworkordmerge;
	   
	 
	   @FindBy(xpath="//form[@id='new_company_material_log']/div[3]//div[@class='col-sm-9']/span//span[@role='combobox']")
	   private WebElement MaterilaLogclick;

	
	   @FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown—below']//ul[@role='listbox']/li[2]")
	   private WebElement MaterilaLogclicksel;
	   
	   
	 
	   @FindBy(xpath="/html/body/span/span/span[1]/input")
	   private WebElement Materilcode;
	   
	 
	   @FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[1]")
	   private WebElement Materilcodesel;
	  
	   
	
	// @FindBy(xpath="/html//span[@id='select2-company_material_log_unit-container']")
	 @FindBy(xpath="//form[@id='new_company_material_log']/div[5]//div[@class='col-sm-9']/span//span[@role='combobox']")
	   private WebElement Bysel;

	
	  @FindBy(xpath="//ul[@id='select2-company_material_log_unit-results']/li[2]")
	   private WebElement Byseloptn;
	  
	  @FindBy(xpath="//div[@id='user-filter-group-0']/div[1]/div[@class='input-container']/div/div/div/span//span[@role='combobox']/ul[@class='select2-selection__rendered']/li[@title='Item 101 Automation']/span[@role='presentation']")
	   private WebElement Byseloptnremovefromfilter;
	  
	  
	
	   //popup close
		@FindBy(xpath="//*[@id='Embed']/div/div/div/div/div/div/div[1]/div/button[2]")
		 private WebElement wepopup;
		
		
		@FindBy(xpath="//*[@id='webWidget']")
	    private WebElement wepopupframe;
		
		//wo locators
		//@FindBy(xpath="//a[@innertext='Core International LLC']")
		@FindBy(css="strong > a > div:nth-of-type(1)")
	    private WebElement wonmaesel;
		
		
		@FindBy(xpath="//a[@id='workorder-materials-btn']/i")
	    private WebElement womaterialTabsel;
		
		@FindBy(xpath="//*[@id='workorder-materials-panel']/div/a/i")
		private WebElement womaterialAdd;
		
		@FindBy(xpath="//div[@id='material_modal']/div[@class='modal-dialog modal-lg']/div[@class='modal-content']//div[@class='modal-body']/div/div//div[@class='company-material-search']/div[1]/span//span[@role='combobox']/ul[@class='select2-selection__rendered']//input[@role='searchbox']")
		private WebElement womaterialsearch;
		
		@FindBy(xpath="//ul[@id='select2-q_name_cont_any-results']/li[1]")
		private WebElement womaterialsearchsel;
		
		///a[@innertext='SEARCH']
		@FindBy(linkText="SEARCH")
	    private WebElement saerchbtn;
		
		
		@FindBy(css="tr:nth-of-type(1) .fa.fa-plus")
	    private WebElement wonmaeseladd;
		
		@FindBy(linkText="ACCEPT")
	    private WebElement Acceptbtn;

		
		

	public void fnInventoryTrackerCreation(int iTestCaseID, UCAppData testData) throws Exception
	{
		
		
		waitForThread(CommonClass.iWaitForThread1);
		WebElementsidenavbar.click();
		waitForThread(CommonClass.iWaitForThread1);
		

		
	//waitForThread(CommonClass.iWaitForThread1);
	//clickOnMainMenu.click();
   // waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	clickOnAssetmonitorsModule.click();
	waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	clickOnWebElementAssetMonitor.click();
	waitForThread(CommonClass.iWaitForThread1);
	
	//clickupload.click();

	//waitForThread(CommonClass.iWaitForThread1);
//	clickDragtoUpload.click();
	waitForThread(CommonClass.iWaitForThread1);
	
	//File Upload Function
	   //CommonClass.driver.navigate().refresh();

	/*  StringSelection ss= new StringSelection("/home/harish/company_materials.xlsx");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

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
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		//waitForThread(CommonClass.iWaitForThread2);
		//waitForThread(CommonClass.iWaitForThread2);

			  
	  //CommonClass.driver.manage().timeouts().setScriptTimeout(100,SECONDS);
		CommonClass.driver.navigate().refresh();
		//End of File upload functionality
		
	    waitForThread(CommonClass.iWaitForThread2);*/
	   newMaterialLink.click();
	   waitForThread(CommonClass.iWaitForThread1);
	
	//ManuaInputBtn.click();
	Actions actions = new Actions(CommonClass.driver); 
    actions.moveToElement(ManuaInputBtn).click().perform();
    waitForThread(CommonClass.iWaitForThread);
    
   // sendValue(WebElementMaterialName,"TestMaterial”, materialInformation);"
    sendValue(WebElementMaterialName, "TestMaterial");
    
    
    sendValue(WebElementMaterialDescription, "TestDescriptionMaterial202");
    
    sendValue(WebElementMaterialUnitcost, "200");
    
    
    sendValue(WebElementMaterialUnitsell,"100");

    WebElementMaterialUnitcombo.click();
    waitForThread(CommonClass.iWaitForThread1);

    WebElementMaterialUnitcombosel.click();

    
    sendValue(WebElementMaterialUnit,"25");

    
    sendValue(WebElementMaterialAmtstock,"10");
    
    //sendValue(WebElementMaterialbarcode,"ABCS123");
    String Barcode = "ATBC" + new Random().nextInt(1000);
	CommonClass.driver.findElement(By.xpath("//input[@id='company_material_barcode']")).sendKeys(Barcode);
    waitForThread(CommonClass.iWaitForThread);


    WebElementMaterialPublic.click();
    waitForThread(CommonClass.iWaitForThread1);

    WebElementBtnSave.click();
    
    //Increase stock
    waitForThread(CommonClass.iWaitForThread2);
    
    //driver.FindElement(By.XPath("//a[child::img[@title='Material Increase'] and parent::td[following-sibling::td[text()='" + Test Material + "']]]")).Click();
    
    //WebElement overview = CommonClass.driver.findElement(By.id("invoice-list"));// considering the complete webtable
    /*List<WebElement> individualRows = overview.findElements(By.tagName("tr"));//considering invidual user
    for (WebElement wb: individualRows)
    {
        List<WebElement> indWb = wb.findElements(By.tagName("td"));// considering individual columns for individual users
        System.out.println(indWb.get(1).getText());
       // if (indWb.get(1).getText().equalsIgnoreCase(Name))// if the username equals the expected
        //{
            List<WebElement> allButtons = wb.findElements(By.tagName("button"));// getting all the buttons of that user
            for (WebElement edit: allButtons)
            {
                System.out.println(edit.getAttribute("title"));
                if (edit.getAttribute("title").matches("Edit"))
                {
                    edit.click();// clicking on button where title is Edit.
                    break;
                }
            }
            break;
        //}
   }*/
  
    
    //td[contains(text(),'Test Group 2')]/..//td[4]//button
    
    //String editButton = "//td[text(),'+Test Material+ ']";
    // CommonClass.driver.findElement(By.xpath(editButton)).click();
     
    // find the customer table
     WebElement table = CommonClass.driver.findElement(By.xpath("//*[@id='invoice-list']/table"));

     // find the row
     //WebElement customer = table.findElement(By.xpath("//tr/td[contains(text(), 'testttt')]"));
    WebElement customer = table.findElement(By.xpath(".//td[contains(., 'Test L 10 Automation')]"));
   ///td
    // WebElement customer = table.findElement(By.xpath("td[contains(text(), 'testttt')]"));
     		//AND (//td[contains(text(),'Testing materials updated from sheet')]"));
                                                       //div[text()='USER NAME' OR text()='USER ID']                    

     // click on the row
     customer.click();
 
     waitForThread(CommonClass.iWaitForThread1);
     System.out.println("customer click perform");
    
    Addstockclick.click();
    waitForThread(CommonClass.iWaitForThread1);

    Addstockbysel.click();
    waitForThread(CommonClass.iWaitForThread);

    Addstockbyoption.click();
    waitForThread(CommonClass.iWaitForThread);

    sendValue(AddstockbyAmount,"02");

    waitForThread(CommonClass.iWaitForThread);
    WebElementBtnSave.click();
    waitForThread(CommonClass.iWaitForThread2);

    Minusstockclick.click();
    waitForThread(CommonClass.iWaitForThread1);
    Addstockbysel.click();
    waitForThread(CommonClass.iWaitForThread);

    //waitForThread(CommonClass.iWaitForThread);

    Addstockbyoption.click();
    waitForThread(CommonClass.iWaitForThread);

    sendValue(AddstockbyAmount,"02");
    waitForThread(CommonClass.iWaitForThread);
    WebElementBtnSave.click();
    waitForThread(CommonClass.iWaitForThread);

    
	}



	public void fnTransferFromanothermaterial(int iTestCaseID, UCAppData testData) throws Exception
	{
		waitForThread(CommonClass.iWaitForThread1);
		WebElementsidenavbar.click();
		waitForThread(CommonClass.iWaitForThread1);

		
	//waitForThread(CommonClass.iWaitForThread1);
	//clickOnMainMenu.click();
   // waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	clickOnAssetmonitorsModule.click();
	waitForThread(CommonClass.iWaitForThread1);
	
	/*if(!CommonClass.driver.findElements(By.xpath("//*[@id='webWidget']")).isEmpty())			
        //{
		 {
		
	    CommonClass.driver.switchTo().frame(wepopupframe);	
		//*[@id="webWidget"]
		System.out.println("iframe switch properly");
		Actions actions6 = new Actions(CommonClass.driver); 
        actions6.moveToElement(wepopup).click().perform();
        }
       else
       {
        	System.out.println("frame disable");
        	
       }*/

	waitForThread(CommonClass.iWaitForThread1);
	clickOnWebElementAssetMonitor.click();
	waitForThread(CommonClass.iWaitForThread1);
	Filteroptnsel.click();
	waitForThread(CommonClass.iWaitForThread1);

	Filtername.click();
	waitForThread(CommonClass.iWaitForThread);
	//Filtername.sendKeys("Item 101 Automation");
	List<WebElement> MaterialNames = CommonClass.driver.findElements(By.xpath("//*[@id='select2-filters_items_name|materials#index_v-results']/li")); //select random Department Name
	Random randomDepartmentName = new Random();
	int randomValue = randomDepartmentName.nextInt(MaterialNames.size()); //Getting a random value
	MaterialNames.get(randomValue).click(); //Clicking on the random item in the list.
	waitForThread(CommonClass.iWaitForThread2);
//	waitForThread(CommonClass.iWaitForThread1);
	//Filternamesel.click();
	waitForThread(CommonClass.iWaitForThread1);
	RunFilterBtnclick.click();
	waitForThread(CommonClass.iWaitForThread2);
	waitForThread(CommonClass.iWaitForThread);
	Addstockclick.click();
	waitForThread(CommonClass.iWaitForThread);
	//Addstockbysel.click();
	Fromclick.click();
	waitForThread(CommonClass.iWaitForThread);
	selectworkordmerge.click();
	waitForThread(CommonClass.iWaitForThread);
	MaterilaLogclick.click();
	waitForThread(CommonClass.iWaitForThread);
	//Materilcode.sendKeys("B73DA15R");
	//waitForThread(CommonClass.iWaitForThread);
	List<WebElement> Materialcodelist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-company_material_log_resource_id-results']/li")); //select random Department Name
	Random randommaterialName = new Random();
	int randomValue1 = randommaterialName.nextInt(Materialcodelist.size()); //Getting a random value
	Materialcodelist.get(randomValue1).click(); //Clicking on the random item in the list.
	//Materilcodesel.click();
	
	//MaterilaLogclicksel.click();
	waitForThread(CommonClass.iWaitForThread2);
	
	Bysel.click();
	waitForThread(CommonClass.iWaitForThread);
	Byseloptn.click();
	waitForThread(CommonClass.iWaitForThread);
	sendValue(AddstockbyAmount,"02");
    waitForThread(CommonClass.iWaitForThread);
    WebElementBtnSave.click();
    waitForThread(CommonClass.iWaitForThread2);
    Byseloptnremovefromfilter.click();
    waitForThread(CommonClass.iWaitForThread2);

	RunFilterBtnclick.click();

		
	}

	
     //Adding Material To Work Order
	public void fnAddingMaterialtoWO(int iTestCaseID, UCAppData testData) throws Exception
	{
	    waitForThread(CommonClass.iWaitForThread2);
		wonmaesel.click();
	    waitForThread(CommonClass.iWaitForThread2);

		womaterialTabsel.click();
	    waitForThread(CommonClass.iWaitForThread2);

		womaterialAdd.click();
	    waitForThread(CommonClass.iWaitForThread2);

		womaterialsearch.sendKeys("Item 10Automation");
	    waitForThread(CommonClass.iWaitForThread2);

		womaterialsearchsel.click();
	    waitForThread(CommonClass.iWaitForThread2);

		saerchbtn.click();
	    waitForThread(CommonClass.iWaitForThread2);

		wonmaeseladd.click();
	    waitForThread(CommonClass.iWaitForThread2);
	    
	    JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
		js.executeScript("arguments[0].scrollIntoView(true);", Acceptbtn);
		System.out.println("Scroll Down Sucessfully and and Join compny clickable");

		System.out.println("Aceept button  element visible properly");
		
		waitForThread(CommonClass.iWaitForThread1);
		//JoinCompanyLink.click();

		Acceptbtn.click();
	}
}
