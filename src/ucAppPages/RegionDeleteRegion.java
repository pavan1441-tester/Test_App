package ucAppPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class RegionDeleteRegion extends ComboAppBasePage 
{
	public RegionDeleteRegion() 
	{
		super();
	}
	
	@FindBy(xpath="//*[@id='mySidenav']")
	 private WebElement WebElementsidenavbar;
		
	//services menu optn click	
	@FindBy(xpath="//li[@id='services']/a/div[@class='sidenav-text']")
	 private WebElement WebElementservice;
	
	//Regions click
	@FindBy(xpath="//li[@id='regions']/a/div[@class='sidenav-text']")
	 private WebElement WebElementregion;
	
	
	@FindBy(xpath="//*[@id='territory-list']/table/tbody/tr[1]/th[3]")
	 private WebElement WebElementsub;
	
	
	
	//for New region deletion
	@FindBy(xpath="//table/tbody/tr[2]/td[1]/span/label")
	 private WebElement WebElementregiondel;
	

	//for Existing region deletion
     @FindBy(xpath="//table/tbody/tr[2]/td[1]/span/label")
	 private WebElement WebElementExistingregiondel;
	
	
	@FindBy(xpath="//*[@id='dropdownMenuButton']/span")
	 private WebElement WebElementregiondelsel;
	
	
	@FindBy(linkText="Delete")
	 private WebElement WebElemendelete;
		
	@FindBy(xpath="//*[@id='delete-confirm-dialog-territory']/div/div")
	 private WebElement WebElemendeletemodel;
	
	@FindBy(xpath="/html//button[@id='delete']")
	 private WebElement WebElemetconfirmYes;
		
	
	public void fnDeleteRegion(int iTestCaseID, UCAppData testData) throws Exception
	{
		waitForThread(CommonClass.iWaitForThread1);
		WebElementsidenavbar.click();
		waitForThread(CommonClass.iWaitForThread1);

		//waitForThread(CommonClass.iWaitForThread1);
		//WebElementNvbar.click();
		waitForThread(CommonClass.iWaitForThread1);
		
		WebElementservice.click();
		waitForThread(CommonClass.iWaitForThread1);

		WebElementregion.click();
		waitForThread(CommonClass.iWaitForThread1);
		
		waitForThread(CommonClass.iWaitForThread2);
		
		WebElementsub.click();

		
		waitForThread(CommonClass.iWaitForThread1);
		Actions actions1 = new Actions(CommonClass.driver); 
	    actions1.moveToElement(WebElementregiondel).click().perform();
		waitForThread(CommonClass.iWaitForThread2);


		WebElementregiondelsel.click();
		waitForThread(CommonClass.iWaitForThread1);

		WebElemendelete.click();
		
		
			waitForThread(CommonClass.iWaitForThread1);
			
			Actions actions2 = new Actions(CommonClass.driver); 
		    actions2.moveToElement(WebElemendeletemodel).click().perform();

			waitForThread(CommonClass.iWaitForThread1);

			Actions actions3 = new Actions(CommonClass.driver); 
		    actions3.moveToElement(WebElemetconfirmYes).click().perform();

     }


    // Method For Existing Region Entry Deletion

	public void fnExistingDeleteRegion(int iTestCaseID, UCAppData testData) throws Exception
	{
		
		waitForThread(CommonClass.iWaitForThread1);
		WebElementsidenavbar.click();
		waitForThread(CommonClass.iWaitForThread1);

		//waitForThread(CommonClass.iWaitForThread1);
		//WebElementNvbar.click();
		waitForThread(CommonClass.iWaitForThread1);
		
		WebElementservice.click();
		waitForThread(CommonClass.iWaitForThread1);

		WebElementregion.click();
		waitForThread(CommonClass.iWaitForThread1);
		
		waitForThread(CommonClass.iWaitForThread2);
		
		WebElementsub.click();

		
		waitForThread(CommonClass.iWaitForThread1);
		Actions actions1 = new Actions(CommonClass.driver); 
	    actions1.moveToElement(WebElementExistingregiondel).click().perform();
		waitForThread(CommonClass.iWaitForThread2);


		WebElementregiondelsel.click();
		waitForThread(CommonClass.iWaitForThread1);

		WebElemendelete.click();
		
		
			waitForThread(CommonClass.iWaitForThread1);
			
			Actions actions2 = new Actions(CommonClass.driver); 
		    actions2.moveToElement(WebElemendeletemodel).click().perform();

			waitForThread(CommonClass.iWaitForThread1);

			Actions actions3 = new Actions(CommonClass.driver); 
		    actions3.moveToElement(WebElemetconfirmYes).click().perform();



		
	}
}
