package ucAppPages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class CreateNewItemPage extends ComboAppBasePage
{

	public CreateNewItemPage() 
	{
		super();
	}
		//Click on Main Menu List
		@FindBy(xpath="//*[@id='lockNavbar']")
		 private WebElement mainMenu;
		
		//Click on Sales-Expenses Menu
		@FindBy(css="#sales > .dropdown-toggle > .sidenav-text")
		 private WebElement salesExpenses;
		
		//Click on Items Sub-Menu
		@FindBy(css="#items .sidenav-text")
		 private WebElement items;
		
		//Click on Add Item Type
		@FindBy(linkText="ADD ITEM TYPE")
		 private WebElement itemType;
		
		//Click on Department
		@FindBy(css="#select2-item_type_department_id-container")
		 private WebElement clickOnDepartment;
		
		//Enter Item Type
		@FindBy(xpath="//input[@id='item_type_name']")
		 private WebElement enterItemType;
		
		//Click on Select Parent Item Type
		@FindBy(xpath="//form[@id='new_item_type']/div[1]/div/div[3]/span//span[@role='combobox']")
		 private WebElement clickOnParentItemType;
		
		//Click on Save Button
		@FindBy(css=".btn:nth-child(2)")
		 private WebElement clickOnSave;
		
		//Click on WorkOrder Module
		@FindBy(linkText="Work Orders")
		 private WebElement workOrderModule;
		
		//Click on plus icon of Labor Item Type
		//@FindBy(css="#item-type-178901 .ml10 > .fa")
		@FindBy(css="tbody:nth-of-type(5) .ml10 > .fa.fa-plus-square")
		 private WebElement clickOnLaborItemType;
		
		//enter Description on sales form
		@FindBy(css="#item_sales_description")
		 private WebElement salesDesciption;
		
		//Sales price/rate
		@FindBy(css="#item_unit_price")
		 private WebElement unitPrice;
		
		//enter Tax Code
		@FindBy(css="#item_tax_code")
		 private WebElement taxCode;
		
		//enter Item Code
		@FindBy(css="#item_item_code")
		 private WebElement itemCode;
		
		//click on purchase service from vendor checkbox
		@FindBy(css="#item_is_purchase_type")
		 private WebElement purchaseType;
		
		//enter Description on Purchase Form
		@FindBy(css="#item_purchase_description")
		 private WebElement purchaseDescription;
		
		//enter purchase cost
		@FindBy(css="#item_purchase_cost")
		 private WebElement purchaseCost;
		
		
		public void fnCreateNewItemType(int iTestCaseID, UCAppData testData) throws Exception
		{
			
			waitForThread(CommonClass.iWaitForThread);
			mainMenu.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			salesExpenses.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			items.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			mainMenu.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			itemType.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			clickOnDepartment.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			List<WebElement> departmentNames = CommonClass.driver.findElements(By.xpath("//*[@id='select2-item_type_department_id-results']/li")); //select random Department Name
			Random randomDepartmentName = new Random();
			int randomValue = randomDepartmentName.nextInt(departmentNames.size()); //Getting a random value
			departmentNames.get(randomValue).click(); //Clicking on the random item in the list.
			waitForThread(CommonClass.iWaitForThread2);
			
			//sendValue(enterItemType,"AT Item Type","Enter Item Type");
			
			waitForThread(CommonClass.iWaitForThread);
			String ItemType = "AT Regression Type Sep" + new Random().nextInt(1000);
			enterItemType.sendKeys(ItemType);
		
			waitForThread(CommonClass.iWaitForThread1);

			//waitForThread(CommonClass.iWaitForThread);
			clickOnParentItemType.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			List<WebElement> parentItemType = CommonClass.driver.findElements(By.xpath("//*[@id='select2-item_type_parent_id-results']/li")); // select random parent Item Type
			Random randomparentItemType = new Random();
			int randomItemTypeValue = randomparentItemType.nextInt(parentItemType.size()); //Getting a random value
			parentItemType.get(randomItemTypeValue).click(); //Clicking on the random item in the list.
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			clickOnSave.click();
			waitForThread(CommonClass.iWaitForThread2);
		
		}	
		public void fnCreateNewItemName(int iTestCaseID, UCAppData testData) throws Exception
		{
			waitForThread(CommonClass.iWaitForThread);
			workOrderModule.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			mainMenu.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			salesExpenses.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			items.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			mainMenu.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			waitForThread(CommonClass.iWaitForThread);
			clickOnLaborItemType.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			//Add New Item Popup page
			String randoemItemName = "AT Item name" + new Random().nextInt(1000);
			CommonClass.driver.findElement(By.cssSelector(".string > #item_name")).sendKeys(randoemItemName);
			
			//Sales information
			//Description on Sales forms
			sendValue(salesDesciption,"test 123","Enter Sales Description");
			waitForThread(CommonClass.iWaitForThread1);
			
			sendValue(unitPrice,"100.77","Enter Unit price");
			waitForThread(CommonClass.iWaitForThread1);
			
			sendValue(taxCode,"AT007","Enter Tax Code");
			waitForThread(CommonClass.iWaitForThread1);
			
			sendValue(itemCode,"ATITEM004","Enter Item Code");
			waitForThread(CommonClass.iWaitForThread1);
				
			Actions selectPurchaseType = new Actions(CommonClass.driver);
			selectPurchaseType.moveToElement(purchaseType).click().perform();
			waitForThread(CommonClass.iWaitForThread1);

			sendValue(purchaseDescription,"Purchase form AT test","Enter TDescription on the purchase form");
			waitForThread(CommonClass.iWaitForThread1);
			
			sendValue(purchaseCost,"474.85","Enter Purchase Cost");
			waitForThread(CommonClass.iWaitForThread1);
			
			waitForThread(CommonClass.iWaitForThread);
			clickOnSave.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			
		}
		
}

