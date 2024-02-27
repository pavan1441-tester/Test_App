package ucAppPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class TradesDeletes extends ComboAppBasePage
{

	public TradesDeletes() 
	{
		super();
	}

	@FindBy(xpath="//*[@id='mySidenav']")
	 private WebElement WebElementsidenavbar;
		
	//services menu optn click	
	@FindBy(xpath="//li[@id='services']/a/div[@class='sidenav-text']")
	 private WebElement WebElementservice;
	
	//Trades click  
	@FindBy(xpath="//li[@id='trades']//div[@class='sidenav-text']")
	 private WebElement WebElementrades;
	
	
	@FindBy(xpath="//*[@id='trade-list']/table/thead/tr/th[3]")
	 private WebElement WebElementsub;
	
	//New Trade selection for delete
	//@FindBy(xpath="//*[@id='trade-50300']/td[1]/span/label")
	//@FindBy(xpath="//td[contains(text(),'drainage Pipes')]/preceding::label[@class='checkbox-custom-label']")
	@FindBy(xpath="//table/tbody/tr[6]/td[1]/span/label")
	//@FindBy(xpath="//td[contains(text(),'Floor Maint')]/preceding::td/span/label")
	private WebElement WebElementradedel;
	
	//Existing Trade selection for delete
	@FindBy(xpath="//td[contains(text(),'Floor Maint')]/preceding::td/span/label")
	private WebElement WebElementExistdel;

		
	//Trade selection for delete entry option
		@FindBy(xpath="//a[@id='dropdownMenuButton']/span")
		 private WebElement WebElementradedelsel;
	
		@FindBy(linkText="Delete")
		 private WebElement WebElemendelete;
		
	
		@FindBy(xpath="//*[@id='delete-confirm-dialog-trade']/div/div")
		 private WebElement WebElemendeletemodel;
		
		@FindBy(xpath="/html//button[@id='delete']")
		 private WebElement WebElemetconfirmYes;
		
	public void fnTradesDeletion(int iTestCaseID, UCAppData testData) throws Exception 
	{
	
	waitForThread(CommonClass.iWaitForThread1);
	WebElementsidenavbar.click();
	waitForThread(CommonClass.iWaitForThread1);

	//waitForThread(CommonClass.iWaitForThread1);
	//WebElementNvbar.click();
	waitForThread(CommonClass.iWaitForThread1);
	
	WebElementservice.click();
	waitForThread(CommonClass.iWaitForThread1);

	WebElementrades.click();
	waitForThread(CommonClass.iWaitForThread2);
	waitForThread(CommonClass.iWaitForThread2);
	WebElementsub.click();
	waitForThread(CommonClass.iWaitForThread2);
	//WebElementradedel.click();
	Actions actions1 = new Actions(CommonClass.driver); 
    actions1.moveToElement(WebElementradedel).click().perform();
	waitForThread(CommonClass.iWaitForThread2);

    WebElementradedelsel.click();
	waitForThread(CommonClass.iWaitForThread1);

    WebElemendelete.click();
	waitForThread(CommonClass.iWaitForThread1);
	
	Actions actions2 = new Actions(CommonClass.driver); 
    actions2.moveToElement(WebElemendeletemodel).click().perform();

	waitForThread(CommonClass.iWaitForThread1);

	Actions actions3 = new Actions(CommonClass.driver); 
    actions3.moveToElement(WebElemetconfirmYes).click().perform();
}
	
	
    // Method For Existing Trade Entry Deletion

	public void fnExistingTradesDeletion(int iTestCaseID, UCAppData testData) throws Exception
	{
		// TODO Auto-generated method stub
		waitForThread(CommonClass.iWaitForThread1);
		WebElementsidenavbar.click();
		waitForThread(CommonClass.iWaitForThread1);

		//waitForThread(CommonClass.iWaitForThread1);
		//WebElementNvbar.click();
		waitForThread(CommonClass.iWaitForThread1);
		
		WebElementservice.click();
		waitForThread(CommonClass.iWaitForThread1);

		WebElementrades.click();
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		WebElementsub.click();
		waitForThread(CommonClass.iWaitForThread2);
		//WebElementradedel.click();
		Actions actions1 = new Actions(CommonClass.driver); 
	    actions1.moveToElement(WebElementExistdel).click().perform();
		waitForThread(CommonClass.iWaitForThread2);

	    WebElementradedelsel.click();
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
