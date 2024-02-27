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


public class PurchaseOrderCreationPage  extends ComboAppBasePage  
{

	public PurchaseOrderCreationPage() 
	{
		super();
	}
	
	@FindBy(xpath="//*[@id='mySidenav']")
	 private WebElement WebElementsidenavbar;

	@FindBy(xpath="//*[@id='lockNavbar']")
	 private WebElement WebElementNvbar;

	

	//@FindBy(xpath="//*[@id='sales']/ul")
	//@FindBy(xpath="//*[@id='sales']/a/div")
	@FindBy(xpath="/html/body/div[1]/div[3]/div/div/ul/li[5]/a/div")
	//@FindBy(xpath="//*[@id='sales']/a/div")
	//@FindBy(xpath="//li[@id='sales']/a[@href='#']")
	//@FindBy(xpath="//li[@id='sales']/a/i")
	//@FindBy(xpath="//li[#'sales']/?/?/i")
	
	private WebElement WebElementSalesandExpenses;
	
	@FindBy(xpath="//li[@id='purchase_order']//div[@class='sidenav-text']")
	 private WebElement WebElementPurchaseorder;

	

	//Click Main menu slide
	@FindBy(css=".fa-plus")
	private WebElement clickOnMainMenu;

	//click on Sales/expenses
	@FindBy(css="#sales .caret")
	private WebElement clickOnSalesAndExpense;

	//Click On Purchase Order Module
	@FindBy(css="#purchase_order > a")
	private WebElement clickOnPurchaseOrderModule;

	//Click On Plus Button
	@FindBy(linkText="CREATE PURCHASE ORDER")
	private WebElement createPurchaseOrderButton;

	//Click On Vendor Name
	@FindBy(xpath="//span[@id='select2-purchase_order_vendor_id-container']")
	private WebElement clickVendorName;

	//Search Vendor Name
	@FindBy(xpath="//input[@type='search']")
	private WebElement search;

	//Select Entered Vendor Name
	@FindBy(xpath="//ul[@id='select2-purchase_order_vendor_id-results']")
	private WebElement selectVendorName;

	//Enter Email Address
	@FindBy(css=".col-sm-3 #purchase_order_purchase_order_emails_attributes_0_email_to")
	private WebElement emailAddress;

	//Click On WO Number
	//@FindBy(css=".select2-container--below .select2-selection")
	@FindBy(xpath="//form[@id='purchase-order-form']/div/div[@class='row']/div[@class='col-sm-12']/div[2]/div[3]/div[1]/span//span[@role='combobox']")
	private WebElement clickOnWoNumber;

	//Enter WO Number in Search

	//Select WO Number
	@FindBy(xpath="//*[@id='select2-purchase_order_purchase_order_assignment_attributes_work_order_id-results']/li[1]")
	private WebElement selectWoNumber;

	//Click on Item Type
	@FindBy(css=".select2-container--above .select2-selection")
	private WebElement clickOnItemType;

	//Enter Item Type in Search 


	//Select Item Type
	@FindBy(xpath="//form[@id='purchase-order-form']/div/div[@class='row']/div[@class='col-sm-12']/div[5]//table/tbody/tr[2]/td[2]/div/span//span[@role='combobox']") 
	//Keyboard event of enter button only
	private WebElement selectItemType;

	//Click on Item Name
	@FindBy(xpath="//*[@id='select2-purchase_order_purchase_order_items_attributes_0_item_type_name-results']/li[17]")
	private WebElement clickOnItemName;

	//Enter Item Type in Search 


	//Select Item Type
	//@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[@role='option']")
	@FindBy(xpath="//form[@id='purchase-order-form']/div/div[@class='row']/div[@class='col-sm-12']/div[5]//table//div[@class='item-name-selection-div']/div/span//span[@role='combobox']")
	private WebElement selectItemNamedropdwm;

	
	@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[4]")
	private WebElement selectItemNamedropdwmsel;

	
	//Enter Item Description
	@FindBy(xpath="//textarea[@id='purchase_order_purchase_order_items_attributes_0_description']")
	private WebElement itemDescription;

	//Enter Unit Price
	@FindBy(xpath="//input[@id='purchase_order_purchase_order_items_attributes_0_price']")
	private WebElement unitPrice;

	//Enter Quantity Ordered
	@FindBy(xpath="//input[@id='purchase_order_purchase_order_items_attributes_0_quantity']")
	private WebElement quantityOrdered;

	//Enter Tax
	@FindBy(xpath="//input[@id='tax_text']")
	private WebElement tax;

	//Enter Message Displayed On Purchase Order
	@FindBy(css="#purchase_order_message")
	private WebElement messageDisplayedOnPo;


	//Enter Statement Memo
	@FindBy(css="#purchase_order_statement_memo")
	private WebElement statementMemo;

	//Cick On Send Button
	@FindBy(css="#send-purchase-order")
	private WebElement sendButton;

	//Enter CC EMail Address
	@FindBy(xpath="(//input[@id='purchase_order_purchase_order_emails_attributes_0_email_cc'])[2]")
	private WebElement ccEmailAddress;
	
	@FindBy(xpath="//form[@id='purchase-order-email-form']/div[@class='modal-body']/div[@class='purchase-order-email']//textarea[@name='purchase_order[purchase_order_emails_attributes][0][email_subject]']")
	private WebElement Emailsubject;

	
	
	@FindBy(xpath="//form[@id='purchase-order-email-form']/div[@class='modal-body']/div[@class='purchase-order-email']//textarea[@name='purchase_order[purchase_order_emails_attributes][0][email_message]']")
	private WebElement Emailmessgae;
	
	//Cick On  Send Button
		@FindBy(xpath="//*[@id='purchase-order-email-form']/div[3]/button[2]")
		private WebElement SaveButton;

	

	//Cick On Final Send Button
	@FindBy(css=".fa-arrow-circle-right")
	private WebElement finalSendButton;

	//Add new Functions
	public void fnPurchaseOrderCreation(int iTestCaseID, UCAppData testData) throws Exception
	{
		
		Actions actions = new Actions(CommonClass.driver); 
	       actions.moveToElement(WebElementsidenavbar).click().perform();
			waitForThread(CommonClass.iWaitForThread);
			System.out.println("Navigation Menu fuction click");

		
		Actions actions1 = new Actions(CommonClass.driver); 
	       actions1.moveToElement(WebElementNvbar).click();
			waitForThread(CommonClass.iWaitForThread2);
			System.out.println("Navigation Menu fuction click");


		Actions actions2 = new Actions(CommonClass.driver); 
	       actions2.moveToElement(WebElementSalesandExpenses).click().perform();
	       
			waitForThread(CommonClass.iWaitForThread2);

	      WebElementPurchaseorder.click();
			waitForThread(CommonClass.iWaitForThread1);

	//waitForThread(CommonClass.iWaitForThread2);
	//clickOnMainMenu.click();
	//waitForThread(CommonClass.iWaitForThread2);

	//waitForThread(CommonClass.iWaitForThread2);
	//clickOnSalesAndExpense.click();
	//waitForThread(CommonClass.iWaitForThread2);

	//waitForThread(CommonClass.iWaitForThread2);
//	clickOnPurchaseOrderModule.click();
	//waitForThread(CommonClass.iWaitForThread2);

	waitForThread(CommonClass.iWaitForThread2);
	createPurchaseOrderButton.click();
	waitForThread(CommonClass.iWaitForThread2);

	waitForThread(CommonClass.iWaitForThread2);
	clickVendorName.click();
	waitForThread(CommonClass.iWaitForThread2);

	//sendValue(search,"Zulu","Search Vendor Name");
	
	
	 List<WebElement> Vendorlist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-purchase_order_vendor_id-results']/li")); //select random Department Name
		Random randomvendortypetName = new Random();
		int randomValue = randomvendortypetName.nextInt(Vendorlist.size()); //Getting a random value
		Vendorlist.get(randomValue).click(); //Clicking on the random item in the list.
		waitForThread(CommonClass.iWaitForThread2);

	//waitForThread(CommonClass.iWaitForThread2);
	//selectVendorName.click();
	//waitForThread(CommonClass.iWaitForThread1);

	sendValue(emailAddress,"pavan@utilizecore.com");

	waitForThread(CommonClass.iWaitForThread2);
	clickOnWoNumber.click();
	waitForThread(CommonClass.iWaitForThread1);
	
	 List<WebElement> wolist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-purchase_order_purchase_order_assignment_attributes_work_order_id-results']/li")); //select random Department Name
		Random randomwo = new Random();
		int randomValue1 = randomwo.nextInt(wolist.size()); //Getting a random value
		wolist.get(randomValue1).click(); //Clicking on the random item in the list.
		waitForThread(CommonClass.iWaitForThread2);

	//sendValue(search,"1298025","Search WO Number");

	//waitForThread(CommonClass.iWaitForThread1);
	//selectWoNumber.click();
	//waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread);
	selectItemType.click();
	waitForThread(CommonClass.iWaitForThread2);

	//sendValue(search,"Labor","Search Item Type");

	//waitForThread(CommonClass.iWaitForThread2);
	//clickOnItemName.click();
	//waitForThread(CommonClass.iWaitForThread2);
	
	
	 List<WebElement> Itemlist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-purchase_order_purchase_order_items_attributes_0_item_type_name-results']/li")); //select random Department Name
		Random randomItem = new Random();
	  int randomValue2 = randomItem.nextInt(Itemlist.size()); //Getting a random value
		Itemlist.get(randomValue2).click(); //Clicking on the random item in the list.
		//waitForThread(CommonClass.iWaitForThread2);


	//waitForThread(CommonClass.iWaitForThread2);
	selectItemNamedropdwm.click();
	//waitForThread(CommonClass.iWaitForThread2);

	//sendValue(search,"Mulch","Search Item Name");
	//selectItemNamedropdwmsel.click();
	//waitForThread(CommonClass.iWaitForThread);
	
	                                                
	                                                                      
	
	List<WebElement> ItemNamelist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-purchase_order_purchase_order_items_attributes_0_item_name-results']/li[@role='alert']")); //select random Department Name
		//if (ItemNamelist== null || ItemNamelist.isEmpty()) 
	     if (ItemNamelist == null || ItemNamelist.isEmpty()) 
	       {
			System.out.println("Item Name is Empty");
			
			List<WebElement> Itemlist1 = CommonClass.driver.findElements(By.xpath("//*[@id='select2-purchase_order_purchase_order_items_attributes_0_item_name-results']/li")); //select random Department Name
			Random randomItem1 = new Random();
			int randomValue3 = randomItem1.nextInt(Itemlist1.size()); //Getting a random value
			Itemlist1.get(randomValue3).click(); //Clicking on the random item in the list.
			waitForThread(CommonClass.iWaitForThread2);
			
			
			//List<WebElement> Itemlist1 = CommonClass.driver.findElements(By.xpath("//*[@id='select2-purchase_order_purchase_order_items_attributes_0_item_type_name-results']/li")); //select random Department Name
			//Random randomItem1 = new Random();
			//int randomValue3 = randomItem1.nextInt(Itemlist1.size()); //Getting a random value
			//Itemlist1.get(randomValue3).click(); //Clicking on the random item in the list.
			//waitForThread(CommonClass.iWaitForThread2);
			
	       }
		else
		{
			System.out.println("Item Name is Not Empty");
	      	/*waitForThread(CommonClass.iWaitForThread);

			Random randomItemname = new Random();
			int randomValue4 = randomItemname.nextInt(ItemNamelist.size()); //Getting a random value
			ItemNamelist.get(randomValue4).click(); //Clicking on the random item in the list.
			waitForThread(CommonClass.iWaitForThread2);*/
			waitForThread(CommonClass.iWaitForThread);
			selectItemType.click();
			waitForThread(CommonClass.iWaitForThread);
			
			Random randomItem1 = new Random();
			  int randomValue3 = randomItem.nextInt(Itemlist.size()); //Getting a random value
				Itemlist.get(randomValue3).click();
				waitForThread(CommonClass.iWaitForThread2);
				
				List<WebElement> Itemlist2 = CommonClass.driver.findElements(By.xpath("//*[@id='select2-purchase_order_purchase_order_items_attributes_0_item_name-results']/li")); //select random Department Name
				Random randomItem2 = new Random();
				int randomValue4 = randomItem2.nextInt(Itemlist2.size()); //Getting a random value
				Itemlist2.get(randomValue4).click(); //Clicking on the random item in the list.
				waitForThread(CommonClass.iWaitForThread2);
				
	      
		}
	
	   
	sendValue(itemDescription,"Labor added as item type with mulch item name","Enter Description");

	waitForThread(CommonClass.iWaitForThread);
	sendValue(unitPrice,"878","Enter Unit Price");

	waitForThread(CommonClass.iWaitForThread);
	sendValue(quantityOrdered,"1000","Enter Quantity Ordered");

	waitForThread(CommonClass.iWaitForThread);
	//tax.clear();
	//waitForThread(CommonClass.iWaitForThread);

	//sendValue(tax,"8.000","Enter Tax");

	waitForThread(CommonClass.iWaitForThread);
	sendValue(messageDisplayedOnPo,"Purchase Order created with laobor and mulch item type","Enter Message displayed on Memo");

	waitForThread(CommonClass.iWaitForThread);
	sendValue(statementMemo,"AT Regression Testing","Enter Statement Memo");

	waitForThread(CommonClass.iWaitForThread);
	sendButton.click();
	waitForThread(CommonClass.iWaitForThread);

	sendValue(ccEmailAddress,"harishpatil@utilizecore.com","Enter CC Email Address");
	waitForThread(CommonClass.iWaitForThread);
	
	
	Emailsubject.sendKeys("Regression AT JULY Purchase Order email through Automation");
	waitForThread(CommonClass.iWaitForThread);


	Emailmessgae.sendKeys("Regression Testing Purpose");
	//sendValue(Emailmessgae,"Regression Testing Purpose","Enter the  messge");
	waitForThread(CommonClass.iWaitForThread);

	SaveButton.click();

	waitForThread(CommonClass.iWaitForThread);
	finalSendButton.click();
	waitForThread(CommonClass.iWaitForThread2);



}
}