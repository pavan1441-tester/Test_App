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

import com.gargoylesoftware.htmlunit.Page;

public class InvoiceCreationPage extends ComboAppBasePage 


{

	public InvoiceCreationPage() 
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
	 private WebElement WebElementSalesandExpenses;
	
		@FindBy(xpath="//*[@id='invoice']/a/div")
	 private WebElement WebElementInvoice;
		
		@FindBy(xpath="//div[@id='page-content']/div[3]/div[1]/div[@class='panel-body']//a[@href='/company/invoices/new']")
		 private WebElement WebElementCreateNewInvoice;
			

		@FindBy(xpath="//span[@id='select2-invoice_company_id-container']/span[@class='select2-selection__placeholder']")			
		 private WebElement WebElementNewClient;
		
		
		 
			
		//@FindBy(xpath="//ul[@id='select2-invoice_company_id-results']/li[2]//span[@class='fs12']")
		@FindBy(xpath="//*[@id='select2-invoice_company_id-results']/li[1]")
		 private WebElement WebElementClientSel;

		//@FindBy(xpath="//*[@id='select2-invoice_company_id-results']/li[text() = 'core']")
		//@FindBy(xpath="//li[contains(text(), 'core')]")
		//@FindBy(xpath="//*[@id='select2-invoice_company_id-results']/li[2]")
		//*[@id="select2-invoice_company_id-results"]/li[1]
		//WebElement el = driver.findElement(By.xpath("//div[@id = 'colLeft_OrderGroups']/descendant::li[text() = '" + text + "']"));
		//@FindBy(xpath="//ul[@id='select2-invoice_company_id-results']/descendant::li[text() = '" + core + "'])")
		//@FindBy(xpath="//*[@id='select2-invoice_company_id-results']/li[contains(text(), 'core')]")
		
		@FindBy(xpath="//ul[@id=’select2-invoice_company_id-results’]/li")
		 private WebElement WebElementClientSit;
	
			

		@FindBy(xpath="//*[@id='select2-invoice_invoice_locations_attributes_0_location_id-container']")			
		 private WebElement WebElementClientSite;
		
	
		@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[1]")			
		 private WebElement WebElementClientSiteSel;
		
		
		
		@FindBy(xpath="//*[@id='select2-invoice_resource_id-container']")			
		 private WebElement WebElementWorkorder;
		
		

		@FindBy(xpath="//*[@id='select2-invoice_resource_id-results']/li[1]")			
		 private WebElement WebElementWorkorderSel;
		
		

		@FindBy(xpath="//*[@id='invoice_custom_invoice_number']")			
		 private WebElement WebElementCustomInvoicenum;
		
		
		@FindBy(xpath="//*[@id='select2-invoice_department_id-container']")			
		 private WebElement WebElementDept;
		
		
		@FindBy(xpath="//*[@id='select2-invoice_department_id-results']/li[2]")			
		 private WebElement WebElementDeptSel;
		

		//*[@id=""]
		@FindBy(xpath="//*[@id='invoice_due_date']")			
		 private WebElement WebElementInvoiceDueDate;
		
		
		@FindBy(xpath="//*[@id='invoice-form']/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[2]/div/span/span[1]/span")
		private WebElement WebElementItemType;
		
		
		@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[2]")
		private WebElement WebElementItemTypeSelctn;
		
			
		@FindBy(xpath="//*[@id='invoice-form']/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[3]/div/div/span/span[1]/span")
		private WebElement WebElementItemName;
		
		
		@FindBy(xpath="//*[@id='select2-invoice_invoice_items_attributes_0_item_name-results']/li[2]")
		private WebElement WebElementItemNameSel;
		
		
	
		@FindBy(xpath="//*[@id='invoice_invoice_items_attributes_0_price']")
		private WebElement WebElementItemPrice;
		
		
		@FindBy(xpath="//*[@id='invoice_invoice_items_attributes_0_quantity']")
		private WebElement WebElementItemQty;
		
		
		@FindBy(xpath="//*[@id='invoice_invoice_message']")
		private WebElement WebElementInvoicemessge;
		
		                
		@FindBy(xpath="//*[@id='invoice_statement_memo']")
		//@FindBy(xpath="//textarea[@id='invoice_statement_memo']")
		private WebElement WebElementStatemMemo;
		
		
		@FindBy(xpath="//*[@id='invoice_remit_payments_to']")
		private WebElement WebElementRemitPayment;
		
		
		//Approved to Send button
		@FindBy(xpath="//input[@value='Approve to Send' and @type='submit']")	
		 private WebElement weBtnAPPROVEDTOSEND;
		
		
	

	public void fnInvoiceCreation(int iTestCaseID, UCAppData testData) throws Exception
	{
		// TODO Auto-generated method stub
			System.out.println("Invoice fuction done");

		waitForThread(CommonClass.iWaitForThread2);
		
		Actions actions = new Actions(CommonClass.driver); 
	       actions.moveToElement(WebElementsidenavbar).click().perform();
			waitForThread(CommonClass.iWaitForThread2);
			System.out.println("Navigation Menu fuction click");

		
		/*Actions actions1 = new Actions(CommonClass.driver); 
	       actions1.moveToElement(WebElementNvbar).click();
			waitForThread(CommonClass.iWaitForThread2);
			System.out.println("Navigation Menu fuction click");*/


		Actions actions2 = new Actions(CommonClass.driver); 
	       actions2.moveToElement(WebElementSalesandExpenses).click().perform();
	       
			waitForThread(CommonClass.iWaitForThread2);

	       WebElementInvoice.click();

		//WebElementSalesandExpenses.click();
		System.out.println("Invoice selection done");
		waitForThread(CommonClass.iWaitForThread2);
		
		Actions actions3 = new Actions(CommonClass.driver); 
	       actions3.moveToElement(WebElementCreateNewInvoice).click().perform();
	       waitForThread(CommonClass.iWaitForThread);
	       WebElementNewClient.click();
	       waitForThread(CommonClass.iWaitForThread2);
	      // WebElementNewClient.findElement(By.cssSelector("li[value=' + core + ']")).click();
	       
	       
	       //WebElementClientSel.click();
	   
	       
	       List<WebElement> Compnylist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-invoice_company_id-results']/li")); //select random Department Name
			Random randomItem1 = new Random();
			int randomValue1 = randomItem1.nextInt(Compnylist.size()); //Getting a random value
			Compnylist.get(randomValue1).click(); //Clicking on the random item in the list.
			waitForThread(CommonClass.iWaitForThread2);
		 
	       
	       
	       
	       System.out.println("drop down list option work");
	       waitForThread(CommonClass.iWaitForThread);

	       WebElementClientSite.click();
	       waitForThread(CommonClass.iWaitForThread);
	       WebElementClientSiteSel.click();
	       waitForThread(CommonClass.iWaitForThread);
	       //WebElementWorkorder.click();
	       waitForThread(CommonClass.iWaitForThread2);
	       
	       
	       Actions actions4 = new Actions(CommonClass.driver); 
	       actions4.moveToElement(WebElementWorkorder).click().perform();
	    
	      // WebElementWorkorder.click();
	       waitForThread(CommonClass.iWaitForThread2);
	       waitForThread(CommonClass.iWaitForThread);

	       WebElementWorkorderSel.click();
	       waitForThread(CommonClass.iWaitForThread2);
			sendValue(WebElementCustomInvoicenum,"TestInvoice2021071","Enter the Invoice Name");	
			 waitForThread(CommonClass.iWaitForThread2);
			// WebElementInvoiceDueDate.clear();
			// waitForThread(CommonClass.iWaitForThread);
			// WebElementInvoiceDueDate.sendKeys("08/24/2021");
			 waitForThread(CommonClass.iWaitForThread);
			WebElementDept.click();
			 waitForThread(CommonClass.iWaitForThread2);
			// WebElementDeptSel.click();
			
			  List<WebElement> Deptlist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-invoice_department_id-results']/li")); //select random Department Name
				Random randomItem2 = new Random();
				int randomValue4 = randomItem2.nextInt(Deptlist.size()); //Getting a random value
				Deptlist.get(randomValue4).click(); //Clicking on the random item in the list.
				waitForThread(CommonClass.iWaitForThread2);
			 
			 WebElementItemType.click();
			 waitForThread(CommonClass.iWaitForThread2);
			 WebElementItemTypeSelctn.click();
			 waitForThread(CommonClass.iWaitForThread2);
			 WebElementItemName.click();
			 waitForThread(CommonClass.iWaitForThread2);
			 WebElementItemNameSel.click();


            waitForThread(CommonClass.iWaitForThread1);
            sendValue(WebElementItemPrice,"500","Enter the Item Price Name");	


          waitForThread(CommonClass.iWaitForThread1);
          sendValue(WebElementItemQty,"50","Enter the Item Qty Name");	


         waitForThread(CommonClass.iWaitForThread1);
         sendValue(WebElementInvoicemessge,"Test message for Regression Testing","Enter the Message Details");	
         waitForThread(CommonClass.iWaitForThread2);

         //WebElementInvoicemessge.sendKeys(Keys.DOWN);
         waitForThread(CommonClass.iWaitForThread2);
         //sendValue(WebElementStatemMemo,"Test Regresion Memo","Enter the Memo");	
         WebElementStatemMemo.sendKeys("Test Regresion Memo");

        waitForThread(CommonClass.iWaitForThread1);
        sendValue(WebElementRemitPayment,"4000","Enter the Remit Payment");	

			
			 waitForThread(CommonClass.iWaitForThread1);
			 weBtnAPPROVEDTOSEND.click();
	      /* WebElement countryUL= CommonClass.driver.findElement(By.xpath("//ul[@id='select2-invoice_company_id-results']"));
	       List<WebElement> countriesList=countryUL.findElements(By.tagName("li"));
	       for (WebElement li : countriesList) 
	       {
	       if (li.getText().equals("core")) 
	       {
	            li.click();
	          }
	       }*/
	    

		//WebElementCreateNewInvoice.click();
		
	}

}
