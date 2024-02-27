package ucAppPages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class SiteReportExportPage extends ComboAppBasePage
{

	public SiteReportExportPage() 
	{
		super();
	}
	
	//Click on WorkOrder Module
	@FindBy(linkText="Work Orders")
	 private WebElement workOrderModule;
	
	//Click on Main Menu List
	@FindBy(xpath="//*[@id='lockNavbar']")
	 private WebElement mainMenu;
	
	//Click on Sites Report Menu
	@FindBy(css="#work_order_report .sidenav-text")
	 private WebElement siteReport;
	
	//Open Filters
	@FindBy(xpath="//span[@id='filter-control']/i")	
    private WebElement clickOnFilters;
	
	//Site Trade as Snow Filter
	@FindBy(css="#user-filter-group-7 > .filter-item:nth-child(1) .select2-search__field:nth-child(1)")
	 private WebElement siteTrade;
	
	//Click on Run Filter
	@FindBy(xpath="//input[@value='Run Filters']")	
    private WebElement runFilter;
	
	//Click on Clear Filter button
	@FindBy(xpath="//input[@value='Clear']")
	private WebElement clearFilter;
	
	//Click on Select All checkboxes
	@FindBy(css=".pl8 > .checkbox-custom-label")
	 private WebElement selectAllCheckbox;
	
	//Click on Export Button
	@FindBy(linkText="Export")
	 private WebElement exportButton;
	
	//Click on Simple Site Report Export (all columns are present in the data export) Radio Button
	@FindBy(xpath="//input[@id='report_report_type_simple']")
	 private WebElement selectSimpleSiteReport;
	
	//Click State column
	//@FindBy(xpath="//li[@id='52-selection']")
	@FindBy(xpath="//*[@id='ms-report_location_report_header_ids']")
	 private WebElement clickStateColumn;
	
	//Click on Export repots Button
	@FindBy(css=".btn-continue")
	 private WebElement exportReportsButton;
	
	public void fnSimpleSiteReportExport(int iTestCaseID, UCAppData testData) throws Exception
	{
		waitForThread(CommonClass.iWaitForThread);
		workOrderModule.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		mainMenu.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		siteReport.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		mainMenu.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		clickOnFilters.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		//siteTrade.sendKeys("Snow");
		//waitForThread(CommonClass.iWaitForThread1);
		//siteTrade.sendKeys(Keys.ENTER);
		
		siteTrade.click();
		waitForThread(CommonClass.iWaitForThread2);

		List<WebElement> sitelist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-filters_items_location_trade_v-results']/li")); //select random Department Name
		Random randomItem1 = new Random();
		int randomValue1 = randomItem1.nextInt(sitelist.size()); //Getting a random value
		sitelist.get(randomValue1).click(); //Clicking on the random item in the list.
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		runFilter.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		clickOnFilters.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		selectAllCheckbox.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		exportButton.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		selectSimpleSiteReport.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		exportReportsButton.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		clickOnFilters.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		clearFilter.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		clickOnFilters.click();
		waitForThread(CommonClass.iWaitForThread2);
	}
	
	//Method for Site report Export
	public void fnCustomSiteReportExport(int iTestCaseID, UCAppData testData) throws Exception
	{
		waitForThread(CommonClass.iWaitForThread);
		mainMenu.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		siteReport.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		mainMenu.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		clickOnFilters.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		siteTrade.click();
		//siteTrade.sendKeys("Snow");
		waitForThread(CommonClass.iWaitForThread1);
		//siteTrade.sendKeys(Keys.ENTER);
		List<WebElement> sitelist = CommonClass.driver.findElements(By.xpath("//*[@id='select2-filters_items_location_trade_v-results']/li")); //select random Department Name
		Random randomItem1 = new Random();
		int randomValue1 = randomItem1.nextInt(sitelist.size()); //Getting a random value
		sitelist.get(randomValue1).click(); //Clicking on the random item in the list.
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		runFilter.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		clickOnFilters.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		selectAllCheckbox.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		exportButton.click();
		//waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		//clickStateColumn.click();
		
		clickStateColumn.click();
		waitForThread(CommonClass.iWaitForThread);

	
		List<WebElement> Locationlist = CommonClass.driver.findElements(By.xpath("//*[@id='ms-report_location_report_header_ids']/div[1]/ul/li")); //select random Department Name
		Random randomlocatn1 = new Random();
		int randomValue2 = randomlocatn1.nextInt(Locationlist.size()); //Getting a random value
		Locationlist.get(randomValue2).click(); //Clicking on the random item in the list.
		waitForThread(CommonClass.iWaitForThread2);
		
		
		//waitForThread(CommonClass.iWaitForThread);
		exportReportsButton.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		clickOnFilters.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		clearFilter.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		waitForThread(CommonClass.iWaitForThread);
		clickOnFilters.click();
		waitForThread(CommonClass.iWaitForThread2);
	}



}
