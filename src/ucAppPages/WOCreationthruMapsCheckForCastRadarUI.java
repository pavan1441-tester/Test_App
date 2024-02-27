package ucAppPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class WOCreationthruMapsCheckForCastRadarUI extends ComboAppBasePage
{

	public WOCreationthruMapsCheckForCastRadarUI() 
	{
		super();
	}

	@FindBy(css=".fa-2x.fa-map-marker-minus.far.top-header-icons")
    private WebElement MapoptnClick;
	
	
	@FindBy(xpath="//*[@id='map-forecast-wrapper']")
    private WebElement ForcastoptnClick;
	
	
	//@FindBy(xpath="//input[@id='forecast-6']")	
	@FindBy(xpath="//div[@id='map-layer-controls']/div[3]//div[@class='row']/div[1]/div[2]/label[@class='checkbox small']")
	 private WebElement weForcast6hBtn;
	
	@FindBy(xpath="//div[@id='map-layer-controls']/div[3]//div[@class='row']/div[1]/div[3]/label[@class='checkbox small']")
    private WebElement weForcast12hBtn;
	
	@FindBy(xpath="//div[@id='map-layer-controls']/div[3]//div[@class='row']/div[2]/div[1]/label[@class='checkbox small']")
    private WebElement weForcast24hBtn;
	
	@FindBy(xpath="//div[@id='map-layer-controls']/div[3]//div[@class='row']/div[2]/div[2]/label[@class='checkbox small']")
    private WebElement weForcast48hBtn;

	
	
	public void fnWOCreationthruMapsCheckForCastRadarUI(int iTestCaseID, UCAppData testData) throws Exception 
	{

		waitForThread(CommonClass.iWaitForThread2);
		MapoptnClick.click();
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		
		
		Actions actions= new Actions(CommonClass.driver); 
        actions.moveToElement(ForcastoptnClick).click().perform();
		waitForThread(CommonClass.iWaitForThread2);
        System.out.println("Move to the Forcast optn");

        weForcast6hBtn.click();
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);

        
        weForcast12hBtn.click();
        waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		
	       weForcast24hBtn.click();
		    waitForThread(CommonClass.iWaitForThread2);
			waitForThread(CommonClass.iWaitForThread2);
			waitForThread(CommonClass.iWaitForThread2);
			waitForThread(CommonClass.iWaitForThread2);
			weForcast48hBtn.click();
			 waitForThread(CommonClass.iWaitForThread2);
			 waitForThread(CommonClass.iWaitForThread2);
			waitForThread(CommonClass.iWaitForThread2);
			waitForThread(CommonClass.iWaitForThread2);
		
      
	}
	
	}
	




	

