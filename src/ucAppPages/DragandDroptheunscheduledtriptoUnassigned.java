package ucAppPages;
import lib.UCAppData;
import lib.CommonClass;
import net.bytebuddy.asm.Advice.Enter;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
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
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.Page;

public class DragandDroptheunscheduledtriptoUnassigned extends ComboAppBasePage 
{

	public DragandDroptheunscheduledtriptoUnassigned() 
	{
		super();
	}
	
	@FindBy(css=".fa-2x.fa-calendar-minus.far.top-header-icons")
    private WebElement Clanderclick;
	
	@FindBy(linkText="Team Members")
	//@FindBy(linkText="Tradesmen")
    private WebElement Teammemberoptn;
	
	
	@FindBy(css="div:nth-of-type(2) > button:nth-of-type(5)")
	private WebElement Teammemberoptnweek;
	

	@FindBy(css="button:nth-of-type(1) > .fa.fa-calendar")
	private WebElement Teammemberoptcalender;
	
	
	public void fnDragandDroptheunscheduledtriptoUnassigned(int iTestCaseID, UCAppData testData) throws Exception
	{
		
		waitForThread(CommonClass.iWaitForThread2);

		Clanderclick.click();
		waitForThread(CommonClass.iWaitForThread2);

		Teammemberoptn.click();
		waitForThread(CommonClass.iWaitForThread2);

		waitForThread(CommonClass.iWaitForThread2);
		
		Teammemberoptnweek.click();
		
		waitForThread(CommonClass.iWaitForThread2);

		waitForThread(CommonClass.iWaitForThread2);
		
		Teammemberoptcalender.click();
		
		waitForThread(CommonClass.iWaitForThread2);

		waitForThread(CommonClass.iWaitForThread2);


		
		//Element which needs to drag.    		
    	WebElement From=CommonClass.driver.findElement(By.xpath("//div[@id='calendar']/div[@class='fc-view-container']/div/table/tbody[@class='fc-body']//td[@class='fc-time-area fc-widget-content']/div[@class='fc-scroller-clip']/div[@class='fc-scroller']/div[@class='fc-scroller-canvas']//div[@class='fc-rows']/table/tbody/tr[2]/td[@class='fc-widget-content']/div"));	
       // act.dragAndDropBy(From,135, 40).build().perform();		
    	waitForThread(CommonClass.iWaitForThread2);

       //Element on which need to drop.		
       WebElement To=CommonClass.driver.findElement(By.xpath("//div[@id='calendar']/div[@class='fc-view-container']/div/table/tbody[@class='fc-body']//td[@class='fc-time-area fc-widget-content']/div[@class='fc-scroller-clip']/div[@class='fc-scroller']/div[@class='fc-scroller-canvas']//div[@class='fc-rows']/table/tbody/tr[3]/td[@class='fc-widget-content']/div"));					
		waitForThread(CommonClass.iWaitForThread2);

       //Using Action class for drag and drop.		
       Actions act=new Actions(CommonClass.driver);					
		waitForThread(CommonClass.iWaitForThread2);

       //Dragged and dropped.		
        act.dragAndDrop(From, To).build().perform();
        //act.dragAndDropBy(From,135, 40).build().perform();		
		waitForThread(CommonClass.iWaitForThread2);

}
}