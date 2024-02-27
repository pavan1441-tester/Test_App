package ucAppPages;

import lib.UCAppData;
import lib.CommonClass;


import java.util.List;
import java.util.Random;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SnowFallPage extends ComboAppBasePage
{

	public SnowFallPage()
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
	
	@FindBy(xpath="//span[@id='filter-control']/i")
    private WebElement FilteroptnClick;
	
	@FindBy(css=".select2.select2-container.select2-container--below.select2-container--bootstrap  span[role='combobox'] > .select2-selection__rendered  input[role='searchbox']")
	 private WebElement clientname;
	
	//@FindBy(xpath="//input[@class=’select2-search__field’ AND  @placeholder=’Name’]")
	@FindBy(xpath="//input[@placeholder='Name']")
	 private WebElement clientnamec;
	
	@FindBy(xpath="//div[1]/input[@role='button']")
	 private WebElement RunfilterBtn;
	

	@FindBy(xpath="//div[2]/input[@role='button']")
	 private WebElement RunfilterClearBtn;
	
	@FindBy(xpath="//*[@id='filter-control']/i")
	 private WebElement RunfilterRedBtn;
	
	
	@FindBy(xpath="//*[@id='button-collapse']")
	 private WebElement Collapsebtn;
	

	
	@FindBy(xpath="//*[@id='map-canvas']/div/div/div[4]/div/div[2]/button")
    private WebElement DrawcircleClick;
	
	//click on filter
	
	@FindBy(xpath="/html//div[@id='navbar']")
    private WebElement ClickonFilter;
	
	
	

	
	
	public void fnSnowFallPage(int iTestCaseID, UCAppData testData) throws Exception
	{
		
		waitForThread(CommonClass.iWaitForThread2);
		MapoptnClick.click();
		waitForThread(CommonClass.iWaitForThread2);
		///waitForThread(CommonClass.iWaitForThread2);
		//waitForThread(CommonClass.iWaitForThread2);
		//waitForThread(CommonClass.iWaitForThread2);
		//waitForThread(CommonClass.iWaitForThread2);
		
		
		Actions actions= new Actions(CommonClass.driver); 
        actions.moveToElement(ForcastoptnClick).click().perform();
		waitForThread(CommonClass.iWaitForThread2);
        System.out.println("Move to the Forcast optn");
        
        
        
		//if(!weForcast6hBtn.isSelected())
			weForcast6hBtn.click();

       // weForcast6hBtn.click();
		waitForThread(CommonClass.iWaitForThread2);
		//waitForThread(CommonClass.iWaitForThread2);
		///waitForThread(CommonClass.iWaitForThread2);
		//waitForThread(CommonClass.iWaitForThread2);

        
        weForcast12hBtn.click();
        waitForThread(CommonClass.iWaitForThread2);
		//waitForThread(CommonClass.iWaitForThread2);
		//waitForThread(CommonClass.iWaitForThread2);
		//waitForThread(CommonClass.iWaitForThread2);
		
        FilteroptnClick.click();
		waitForThread(CommonClass.iWaitForThread2);

		clientnamec.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		//Random Value selction from drop down list
		 List <WebElement> listings = CommonClass.driver.findElements(By.xpath("//*[@id='select2-filters_items_location_client_name_v-results']/li"));
	        Random r = new Random();
	        int randomValue = r.nextInt(listings.size()); //Getting a random value
			waitForThread(CommonClass.iWaitForThread1);

	        listings.get(randomValue).click(); //Clicking on the random item in the list.

			waitForThread(CommonClass.iWaitForThread2);

			RunfilterBtn.click();
			waitForThread(CommonClass.iWaitForThread2);
			
			RunfilterRedBtn.click();
			
			waitForThread(CommonClass.iWaitForThread2);
			
			//Collapsebtn.click();
			
			Actions actions2 = new Actions(CommonClass.driver); 
	        actions2.moveToElement(Collapsebtn).perform();

			waitForThread(CommonClass.iWaitForThread2);


			//DrawcircleClick.click();
			Actions actions1 = new Actions(CommonClass.driver); 
	        actions1.moveToElement(DrawcircleClick).click().perform();

			System.out.println("CIRCLE NAME SELCTION");

	        Actions builder = new Actions(CommonClass.driver);
	        Action drawAction = builder.moveToElement(CommonClass.driver.findElement(By.cssSelector("[id='map-canvas']"))) //start points x axis and y axis. 
	        		//Action drawAction = builder.moveToElement(CommonClass.driver.findElement(By.cssSelector("/html/body/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/div[2]/div[3]")))
	        //Action drawAction = builder.moveToElement(DrawcircleClick) //start points x axis and y axis. 
	                       .clickAndHold()
	                  .moveByOffset(-5, 60) // 2nd points (x1,y1)
	                  .moveByOffset(-30, -50)// 3rd points (x2,y2)
	                  .moveByOffset(60, 60) // 2nd points (x1,y1)
	                  .moveByOffset(-20, -50)// 3rd points (x2,y
	                  .doubleClick()
	                  .build();
	        drawAction.perform();
	        Thread.sleep(6000);
	        
	        

	                   


	                  
	                  Thread.sleep(6000);
			waitForThread(CommonClass.iWaitForThread2);
			
			RunfilterRedBtn.click();
			waitForThread(CommonClass.iWaitForThread2);

        RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread);





	

}
}
