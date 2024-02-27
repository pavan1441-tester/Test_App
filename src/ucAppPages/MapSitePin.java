package ucAppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import lib.UCAppData;
import lib.CommonClass;

public class MapSitePin extends ComboAppBasePage
{

	public MapSitePin()
	{
		super();
	}
	
	//Click on Map 
	@FindBy(css=".fa-2x.fa-map-marker-minus.far.top-header-icons")
    private WebElement MapoptnClick;
	
	@FindBy(xpath="//*[@id='map-canvas']/div/div/div[2]/div[1]/div[4]/div/div/div[30]/canvas")
    private WebElement MapcanvasClick;
	
	//Click on sitepins
		@FindBy(xpath="//*[@id='map-search-list']")
	    private WebElement Mapoptnseacrhlist;
		
		
		//@FindBy(xpath="/a[@href]/br/span[@class='short_name']/text()")
		//@FindBy(xpath="a[class='nav_links ml5 location title']")
		//@FindBy(xpath="//a[contains(@class,'nav_links ml5 location title')]")
		@FindBy(xpath="//*[@id='map-search-list']/ul/li[1724]/a/span")
	    private WebElement temp;
		
		
		@FindBy(xpath="//button[@class='x close']")
		private WebElement close;
		
		
		@FindBy(xpath="//*[@id='map-search-list']/ul/li[2]/a")
	    private WebElement unscheduledselectn;
	

	
	public void fnMapSitePin(int iTestCaseID, UCAppData testData) throws Exception
	{
		
		waitForThread(CommonClass.iWaitForThread);
		MapoptnClick.click();
		waitForThread(CommonClass.iWaitForThread2);
		waitForThread(CommonClass.iWaitForThread2);
		
		//Mapoptnseacrhlist.click();
		
		//WebElement temp = CommonClass.driver.findElement(By.xpath("//img[contains(@src,'/assets/unscheduled/')]"));
		
		WebElement unscheduled = CommonClass.driver.findElement(By.xpath("//img[contains(@src,'/assets/unscheduled')]"));
		((JavascriptExecutor) CommonClass.driver).executeScript("arguments[0].scrollIntoView(true);", unscheduled);
		//Thread.sleep(500); 
		//element.click();
		
		//WebElement temp = CommonClass.driver.findElement(By.xpath("/a[@href='#']@nav_links ml5 location title"));
		
				
		waitForThread(CommonClass.iWaitForThread2);

		temp.click();
		
		//element.click();/a[@href="#"]@ml5 location title">
		   //JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
			//js.executeScript("arguments[0].scrollIntoView(true);", temp);
			//System.out.println("Scroll Down Sucessfully and and Unschdule be the clickable");
			//temp.click();

		
		//CommonClass.action.moveByOffset(500, 100).click().perform();
		
		//Actions actions = new Actions(CommonClass.driver); 
		//actions.moveToElement(MapcanvasClick).click().perform();
		
		waitForThread(CommonClass.iWaitForThread);
		
		close.click();

		//Mapoptnsitepin.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		WebElement Notdispatched = CommonClass.driver.findElement(By.xpath("//img[contains(@src,'/assets/scheduled_not_dispatched')]"));
		((JavascriptExecutor) CommonClass.driver).executeScript("arguments[0].scrollIntoView(true);", Notdispatched);
		
		waitForThread(CommonClass.iWaitForThread2);

		unscheduledselectn.click();
	
       	waitForThread(CommonClass.iWaitForThread2);
		close.click();
	

}
}
