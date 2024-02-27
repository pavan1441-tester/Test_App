package ucAppPages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.google.inject.Key;

import lib.UCAppData;
import lib.CommonClass;

public class JoinCompanyPage extends ComboAppBasePage 
{
	
	public JoinCompanyPage()
	{
		super();
	}

	@FindBy(xpath="/html/body/div[1]/nav/div/div[2]/ul/div/li/span[2]/img")	
	private WebElement SwitchCompany;

    //popup close
	@FindBy(xpath="//*[@id='Embed']/div/div/div/div/div/div/div[1]/div/button[2]")
	 private WebElement wepopup;
	
	
	@FindBy(xpath="//*[@id='webWidget']")
    private WebElement wepopupframe;
	

    //*[@id="curent_user_comapnies_list"]/ul
    @FindBy(xpath="//div[@id='curent_user_comapnies_list']/ul[@class='dropdown-menu with-max-ht500']")	
     private WebElement companiesSlideD;


   //Click On All Companies Slide
    @FindBy(xpath="//*[@id=’curent_user_comapnies_list’]")	
	private WebElement companiesSlide;


      //Click On Create Company option
   @FindBy(linkText="Join Company")	
   private WebElement JoinCompanyLink;
   
 
   @FindBy(xpath="//*[@id='company-selection']")	
   private WebElement CompanyName;
   
 
   @FindBy(xpath="//*[@id='selected-company-list']")	
     private WebElement CompanyNameclick;
   
 
   //@FindBy(xpath="//button[@innertext='Join Company']")	
   @FindBy(xpath="//*[contains(@class,'login-submit-btn next btn btn-secondary-custom btn-center')]")
   private WebElement JoinCmpclick;

 //Continue button
	@FindBy(xpath="//input[@value='CONTINUE' and @type='submit']")	
	 private WebElement weBtnCONTINUE;
	
	  //switch to brightview site
	   
		 //Click On Company option
			
	//@FindBy(xpath="//div[@id='curent_user_comapnies_list']/ul[@class='dropdown-menu with-max-ht500']//strong[.='BrightView Enterprise Solutions']")	
	@FindBy(xpath="//div[@id='curent_user_comapnies_list']/ul[@class='dropdown-menu with-max-ht500']//strong[.='Majestic Facility Experts, Inc.']")
			private WebElement BrightviewCompanyLink;
			
			
			@FindBy(xpath="//*[@id='work_order_count']/div/div/div[1]/button")
			private WebElement popupclosebutonclick;
		
	   

  public void fnJoinCompany(int iTestCaseID, UCAppData testData)throws Exception
    {
	
	waitForThread(CommonClass.iWaitForThread1);
	
       SwitchCompany.click();
		waitForThread(CommonClass.iWaitForThread1);
		
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
		
	//Actions actions6 = new Actions(CommonClass.driver); 
    //actions6.moveToElement(companiesSlideD).click().perform();
   // actions6.moveToElement(companiesSlideD).sendKeys(Keys.DOWN);
    
    JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
	js.executeScript("arguments[0].scrollIntoView(true);", JoinCompanyLink);
	System.out.println("Scroll Down Sucessfully and and Join compny clickable");

	System.out.println("Drop down element click properly");
	
	waitForThread(CommonClass.iWaitForThread1);
	JoinCompanyLink.click();
	waitForThread(CommonClass.iWaitForThread1);

	//sendValue(CompanyName,"RV_Test20213","Enter the Join comapny Name");
	//CompanyName.sendKeys("RV_Test20213");
	String Compnydetl = "RTSep" + new Random().nextInt(1000);
	CompanyName.sendKeys(Compnydetl);
	waitForThread(CommonClass.iWaitForThread);
	//Actions builder = new Actions(CommonClass.driver);        
	CompanyName.sendKeys(Keys.ENTER);
	waitForThread(CommonClass.iWaitForThread);
	CompanyName.click();
	waitForThread(CommonClass.iWaitForThread1);

	CompanyNameclick.click();
	waitForThread(CommonClass.iWaitForThread1);

	JoinCmpclick.click();
	waitForThread(CommonClass.iWaitForThread1);

	
	weBtnCONTINUE.click();
	
	//recdirect on staging
	waitForThread(CommonClass.iWaitForThread2);
	
	SwitchCompany.click();
		waitForThread(CommonClass.iWaitForThread1);
		
		 JavascriptExecutor js2 = ((JavascriptExecutor) CommonClass.driver);
		js2.executeScript("arguments[0].scrollIntoView(true);", BrightviewCompanyLink);
		System.out.println("Scroll Down Sucessfully and and Brightview compny clickable");



		waitForThread(CommonClass.iWaitForThread2);
		BrightviewCompanyLink.click();

	//waitForThread(CommonClass.iWaitForThread2);
	waitForThread(CommonClass.iWaitForThread2);
	
     if(!CommonClass.driver.findElements(By.xpath("//*[@id='work_order_count']/div/div")).isEmpty())
			
        //{
		{
		
	        popupclosebutonclick.click();
	        System.out.println("pop up  window close sucessusfully");
        	
		
	
      }
       else
        {
        	System.out.println("pop up  window disable");
        	
      }
	
	

	//CommonClass.driver.navigate().refresh();
	//waitForThread(CommonClass.iWaitForThread2);



}
}

