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

public class TaskDeleteAndRestorePage extends ComboAppBasePage 
{
	public TaskDeleteAndRestorePage() 
	{
		super();
	}
	
	//popup close
			@FindBy(xpath="//*[@id='Embed']/div/div/div/div/div/div/div[1]/div/button[2]")
			 private WebElement wepopup;
			
			
			@FindBy(xpath="//*[@id='webWidget']")
		    private WebElement wepopupframe;
		
	
	@FindBy(xpath="//*[@id='mySidenav']")
	 private WebElement WebElementsidenavbar;
		
	//services menu optn click	
	//@FindBy(xpath="//li[@id='services']/a/div")
	@FindBy(xpath="//*[@id='services']/a/div")
	
	//@FindBy(xpath="//*[@id='services']/a")
	//*[@id="services"]/a
	//@FindBy(css="#services [href='#'] .sidenav-text")
	 private WebElement WebElementservice;
	
	//Task click  
	@FindBy(xpath="//*[@id='tasks']//div")
	private WebElement WebElemenTask;
	
	
	@FindBy(xpath="//*[@id='task-list']/table/thead/tr/th[3]")
	private WebElement WebElemenTaskcode;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[1]/span/label")
	private WebElement WebElemenTaskedel;
	
	//Existing Task selection for delete
	@FindBy(xpath="//td[contains(text(),'Test')]/preceding::td/span/label")
	private WebElement WebElementExistTaskdel;

		
	//Trade selection for delete entry option
		@FindBy(xpath="//a[@id='dropdownMenuButton']/span")
		 private WebElement WebElementradedelsel;
	
		@FindBy(linkText="Delete")
		 private WebElement WebElemendelete;
		
	
		@FindBy(xpath="//*[@id='delete-confirm-dialog-task']/div/div")
	     private WebElement WebElemendeletemodel;
		
		@FindBy(xpath="/html//button[@id='delete']")
		 private WebElement WebElemetconfirmYes;
		
		
		@FindBy(css="tr:nth-of-type(1) .fa-trash-restore.fad.green")
		 private WebElement WebElemetDeltedRestore;
		
	
	
	public void fnTaskDeleteAndRestore(int iTestCaseID, UCAppData testData) throws Exception 
	{
		
		waitForThread(CommonClass.iWaitForThread2);

				if(!CommonClass.driver.findElements(By.xpath("//*[@id='webWidget']")).isEmpty())
		 {

        System.out.println("frame Unable");

	    CommonClass.driver.switchTo().frame(wepopupframe);	
		
		System.out.println("iframe switch properly");
		Actions actions6 = new Actions(CommonClass.driver); 
       actions6.moveToElement(wepopup).click().perform();
     }
      else
       {
       	System.out.println("frame disable");
       	
     }

	
	waitForThread(CommonClass.iWaitForThread1);
	WebElementsidenavbar.click();
	waitForThread(CommonClass.iWaitForThread1);

	//waitForThread(CommonClass.iWaitForThread1);
	//WebElementNvbar.click();
	waitForThread(CommonClass.iWaitForThread1);
	
	WebElementservice.click();
	
	//Actions actions1 = new Actions(CommonClass.driver); 
   // actions1.moveToElement(WebElementservice).click();
	//waitForThread(CommonClass.iWaitForThread2);

	
	waitForThread(CommonClass.iWaitForThread2);
	//waitForThread(CommonClass.iWaitForThread2);


	WebElemenTask.click();
	waitForThread(CommonClass.iWaitForThread2);
	//waitForThread(CommonClass.iWaitForThread2);
	
	WebElemenTaskcode.click();
	waitForThread(CommonClass.iWaitForThread2);

	Actions actions2 = new Actions(CommonClass.driver); 
    actions2.moveToElement(WebElemenTaskedel).click().perform();
	waitForThread(CommonClass.iWaitForThread2);

    WebElementradedelsel.click();
	waitForThread(CommonClass.iWaitForThread1);

    WebElemendelete.click();
	waitForThread(CommonClass.iWaitForThread1);
	
	Actions actions3 = new Actions(CommonClass.driver); 
    actions3.moveToElement(WebElemendeletemodel).click().perform();

	waitForThread(CommonClass.iWaitForThread1);

	Actions actions4 = new Actions(CommonClass.driver); 
    actions4.moveToElement(WebElemetconfirmYes).click().perform();
	waitForThread(CommonClass.iWaitForThread1);

	Actions actions5 = new Actions(CommonClass.driver); 
    actions5.moveToElement(WebElemetDeltedRestore).click().perform();


	}
}
