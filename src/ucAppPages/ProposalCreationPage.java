package ucAppPages;
import lib.UCAppData;
import lib.CommonClass;
import net.bytebuddy.asm.Advice.Enter;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
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

public class ProposalCreationPage extends ComboAppBasePage
{

	public ProposalCreationPage() 
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
	
	@FindBy(xpath="//li[@id='proposals']//div[@class='sidenav-text']")
	 private WebElement WebElementProposal;
		
	@FindBy(xpath="//div[@id='page-content']//a[@href='/company/proposals/new']/i")
	 private WebElement WebElementPlusbtn;
	
	//*[@id="page-content"]/div[11]/a/i
	
	/*//SearchName
	
	//Click Main menu slide
	@FindBy(css=".fa-plus")	
    private WebElement clickOnMainMenu;
	
	//click on Sales/expenses
	@FindBy(css="#sales .caret")	
	private WebElement clickOnSalesAndExpense;
	
	//Click On Proposals
	@FindBy(css="#proposals > a")	
   	private WebElement clickOnProposalsModule;*/
	
	//popup close
	@FindBy(xpath="//*[@id='Embed']/div/div/div/div/div/div/div[1]/div/button[2]")
	 private WebElement wepopup;
	
	
	@FindBy(xpath="//*[@id='webWidget']")
    private WebElement wepopupframe;
	

	//Click On Plus Button
	@FindBy(linkText="CREATE PROPOSAL")	
	private WebElement createProposalButton;
	
	//Click On Company Name
	@FindBy(css="span[id*='select2-proposal_company_id-container']")	
	private WebElement clickCompanyName;
	
	//Enter Comapany Name
	@FindBy(css="body > span > span > span.select2-search.select2-search--dropdown > input")	
	private WebElement SearchName;
			
	//Select Entered Company Name
	@FindBy(css="#select2-proposal_company_id-results")	
	private WebElement selectComapanyName;
	
	//Enter Email Address
	@FindBy(xpath="//input[@id='proposal_email_to']")	
	private WebElement emailAddress;
			
	//Click On Site Name
	@FindBy(xpath="//span[@id='select2-proposal_location_id-container']")	
	private WebElement clickOnSiteName;

	//Search Site Name

	//Select Entered Site Name
	@FindBy(css="#select2-proposal_location_id-results > li")	
	private WebElement selectSiteName;
			
	
	//Enter Description Displayed on Proposal
	@FindBy(xpath="//textarea[@id='proposal_invoice_message']")	
	private WebElement EnterProposalDescription;
	
	//Click on Due Date
	//@FindBy(xpath="//*[@id=’proposal_proposal_date’]")
	@FindBy(xpath="//input[@id='proposal_proposal_date']")
	private WebElement clickOnDueDate;


	//Enter Internal Notes
		//@FindBy(xpath="//*[@id=’proposal_statement_memo’]")	
		@FindBy(xpath="/html//textarea[@id='proposal_statement_memo']")
	   private WebElement internalNotes;
			
	//Enter Trip Number
	//@FindBy(css="")	
	//private WebElement tripNumber;
	
	//Enter Custom Proposal Name
	//@FindBy(xpath="//*[@id=’proposal_custom_proposal_name’]")	
	@FindBy(xpath="/html//input[@id='proposal_custom_proposal_name']")
	private WebElement customProposalName;
	
	//Cick On Item Type
	//@FindBy(xpath="//*[@id=’select2-proposal_proposal_items_attributes_0_item_type_name-container’]/span")	
	@FindBy(xpath="//form[@id='proposal-form']/div[@class='container-fluid proposal-form']/div[1]/div[@class='col-sm-12']//table//tr[@class='proposal-item-tr']/td[1]/div/span//span[@role='combobox']/span[@role='textbox']")
	private WebElement itemType;
	
	//Search Item Name

	//Select entered Item Name
//	@FindBy(xpath="//*[@id=’select2-proposal_proposal_items_attributes_0_item_type_name-results’]")	
	@FindBy(xpath="//ul[@role='listbox']/li[@role='option']")
	private WebElement selectItemType;

	//Cick On Item Name
	
	//@FindBy(xpath="//*[@id=’select2-proposal_proposal_items_attributes_0_item_name-container’]/span")	
@FindBy(xpath="//form[@id='proposal-form']/div[@class='container-fluid proposal-form']//div[@class='bg-items-grey br0']/table/tbody//div[@class='item-name-selection-div']/div/span//span[@role='combobox']/span[@role='textbox']")
	private WebElement itemName;
	
	//Search Item Name

	//Select entered Item Name
	//@FindBy(xpath="//*[@id=’select2-proposal_proposal_items_attributes_0_item_name-results’]")	
	//@FindBy(xpath="//ul[@role='listbox']/li[5]")
	//@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[5]")
    @FindBy(xpath="//*[@id='select2-proposal_proposal_items_attributes_0_item_name-results']/li[1]")
	private WebElement selectItemName;

	
	//Enter Quantity
	@FindBy(xpath="//input[@id='proposal_proposal_items_attributes_0_quantity']")	
	///html//input[@id='proposal_proposal_items_attributes_0_quantity']
	 private WebElement quantity;
	
	//Enter Unit
	@FindBy(xpath="//input[@id='proposal_proposal_items_attributes_0_unit']")	
	private WebElement unit;

	//Enter Cost-Price(MU)
	//@FindBy(css="#proposal_proposal_items_attributes_0_price")	
	//@FindBy(xpath="/html//input[@id='proposal_proposal_items_attributes_0_price']")
	@FindBy(xpath="//*[@id='proposal_proposal_items_attributes_0_price']")
	private WebElement costPriceMu;
			
	//Enter Cost-Tax
	@FindBy(xpath="//input[@id='proposal_proposal_items_attributes_0_base_tax']")	
	private WebElement costTax;
	
	//enter Margin
	@FindBy(xpath="//input[@id='proposal_proposal_items_attributes_0_multiplier']")	
	private WebElement margin;
	
	
	@FindBy(xpath="//body/div[5]/div[@class='modal-dialog']")	
	private WebElement EmailModel;

	
	//Click on Send button
	@FindBy(xpath="//input[@id='send-proposal-email']")	
	private WebElement sendButton;
	
	//Enter CC Email Address
	//@FindBy(xpath="//*[@id=’proposal_email_email_cc’]")	
	@FindBy(xpath="/html//input[@id='proposal_email_email_cc']")	
	private WebElement ccEmailAddress;
	
	
	@FindBy(xpath="/html//trix-editor[@id='proposal_email_email_message']")	
	private WebElement Emailmessage;
	
	
	//Click on Send button
	//@FindBy(xpath="//form[@id='proposal-email-form']/input")	
	@FindBy(xpath="//input[@value='Send' and @type='submit']")	
	private WebElement finalSendButton;

	//Add new Functions
	public void fnProposalCreation(int iTestCaseID, UCAppData testData) throws Exception
	{
		
	waitForThread(CommonClass.iWaitForThread2);
		
		Actions actions = new Actions(CommonClass.driver); 
	       actions.moveToElement(WebElementsidenavbar).click().perform();
			waitForThread(CommonClass.iWaitForThread);
			System.out.println("Navigation Menu fuction click");

		
		Actions actions1 = new Actions(CommonClass.driver); 
	       actions1.moveToElement(WebElementNvbar).click();
			waitForThread(CommonClass.iWaitForThread2);
			System.out.println("Navigation for sales fuction click");


		Actions actions2 = new Actions(CommonClass.driver); 
	       actions2.moveToElement(WebElementSalesandExpenses).click().perform();
			System.out.println("sales and expenses Menu fuction click");

	       
			waitForThread(CommonClass.iWaitForThread2);

	      WebElementProposal.click();
			waitForThread(CommonClass.iWaitForThread1);
			
			
			/*Actions actions3 = new Actions(CommonClass.driver); 
		       actions3.moveToElement(WebElementsidenavbar).click().perform();
				waitForThread(CommonClass.iWaitForThread1);
				System.out.println("Navigation Menu fuction click");*/

	      
			/*Actions actions3 = new Actions(CommonClass.driver); 
	       actions3.moveToElement(WebElementPlusbtn).click();
			waitForThread(CommonClass.iWaitForThread2);
			System.out.println("pius Button click");*/
			
			//Iframe code by Harish
			//if(wepopupframe.isDisplayed()== true)
	 			 if(!CommonClass.driver.findElements(By.xpath("//*[@id='webWidget']")).isEmpty())

	      			
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
            	
          }
			//waitForThread(CommonClass.iWaitForThread2);


	              
	       WebElementPlusbtn.click();

		
		/*waitForThread(CommonClass.iWaitForThread2);
		clickOnMainMenu.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread2);
		clickOnSalesAndExpense.click();
		waitForThread(CommonClass.iWaitForThread2);
	
		waitForThread(CommonClass.iWaitForThread2);
		clickOnProposalsModule.click();
		waitForThread(CommonClass.iWaitForThread2);*/

		//waitForThread(CommonClass.iWaitForThread2);
		//createProposalButton.click();
		//waitForThread(CommonClass.iWaitForThread1);

		waitForThread(CommonClass.iWaitForThread2);
		clickCompanyName.click();
		waitForThread(CommonClass.iWaitForThread);
	
		//sendValue(SearchName,"Core International LLC”)

		waitForThread(CommonClass.iWaitForThread);
		selectComapanyName.click();
		waitForThread(CommonClass.iWaitForThread);

		
		sendValue(emailAddress,"pavan@utilizecore.com","Enter the Email Address");			


		waitForThread(CommonClass.iWaitForThread);
		clickOnSiteName.click();
		waitForThread(CommonClass.iWaitForThread2);

		//sendValue(SearchName,"Test for SP 1”)

		waitForThread(CommonClass.iWaitForThread);
		selectSiteName.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		clickOnDueDate.click();
		 waitForThread(CommonClass.iWaitForThread);
		//clickOnDueDate.clear();
		// waitForThread(CommonClass.iWaitForThread);
		 clickOnDueDate.sendKeys("08/24/2021");
			clickOnDueDate.click();

		waitForThread(CommonClass.iWaitForThread2);
		

		sendValue(EnterProposalDescription, "Regression Proposal testing");
		

		waitForThread(CommonClass.iWaitForThread);
		//clickOnDueDate.click();
		
	   // sendValue(internalNotes,"Regression Notes added for testing","Enter the Internal Notes");	
	    internalNotes.sendKeys("Regression Notes added for testing");
				

		waitForThread(CommonClass.iWaitForThread1);
		sendValue(customProposalName,"Proposal added by AT regression","Enter the PropsalAdded");

		waitForThread(CommonClass.iWaitForThread);
		itemType.click();
		waitForThread(CommonClass.iWaitForThread2);

		
		sendValue(SearchName,"labor","Enter the Labor");

				

		waitForThread(CommonClass.iWaitForThread1);
		selectItemType.click();
		waitForThread(CommonClass.iWaitForThread1);

		

		waitForThread(CommonClass.iWaitForThread1);
		itemName.click();
		waitForThread(CommonClass.iWaitForThread1);

		
		sendValue(SearchName,"mulch","Enter the Search");

		waitForThread(CommonClass.iWaitForThread1);
		selectItemName.click();
		waitForThread(CommonClass.iWaitForThread1);
		
		
		sendValue(quantity,"20","Enter the Quantity");
	

		waitForThread(CommonClass.iWaitForThread);	
		//sendValue(costPriceMu,"40","Enter the Cost Price");
		costPriceMu.sendKeys(Keys.BACK_SPACE);
		//costPriceMu.clear();
		waitForThread(CommonClass.iWaitForThread);	

		costPriceMu.sendKeys("100.000");


		waitForThread(CommonClass.iWaitForThread2);
		sendValue(costTax,"7","Enter the Cost tax");
		

		waitForThread(CommonClass.iWaitForThread2);
		sendValue(margin,"5","Enter the margin");

		waitForThread(CommonClass.iWaitForThread2);
		sendButton.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		Actions actions6 = new Actions(CommonClass.driver); 
        actions6.moveToElement(EmailModel).click().perform();
		System.out.println("Email box click properly");


		waitForThread(CommonClass.iWaitForThread2);
	
				sendValue(ccEmailAddress,"harishpatil@utilizecore.com","Enter the email address");
				waitForThread(CommonClass.iWaitForThread);

				sendValue(Emailmessage,"Regression Test Purpose","Enter the email message");

				waitForThread(CommonClass.iWaitForThread2);
				
				ccEmailAddress.click();
				waitForThread(CommonClass.iWaitForThread);
			
				finalSendButton.click();
		        waitForThread(CommonClass.iWaitForThread2);
	

}
}