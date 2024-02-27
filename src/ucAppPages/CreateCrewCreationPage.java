package ucAppPages;
import lib.UCAppData;
import lib.CommonClass;
import net.bytebuddy.asm.Advice.Enter;

import static org.testng.Assert.assertEquals;

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

public class CreateCrewCreationPage extends ComboAppBasePage
{

	public CreateCrewCreationPage() 
	{
		super();
	}
	
	
	//Click Main menu slide
	//@FindBy(css=".fa-plus")
	//private WebElement clickOnMainMenu;

	//click on WorkForce Module    
	//@FindBy(css="#labor > .dropdown-toggle > .sidenav-text")
	//private WebElement clickOnWorkForceModule;
	
	@FindBy(xpath="//*[@id='mySidenav']")
	 private WebElement WebElementsidenavbar;

	@FindBy(xpath="//*[@id='lockNavbar']")
	 private WebElement WebElementNvbar;
	
	//@FindBy(xpath="//li[@id='labor']/a/div[@class='sidenav-text']")
	@FindBy(xpath="//*[@id='labor']/a/div")
	 private WebElement WebElementworkforce;
	
	
	@FindBy(xpath="//li[@id='team_members']//div[@class='sidenav-text']")
	 private WebElement WebElementTeammember;

	
	//click on Tradesman Section
	@FindBy(css="#crew .sidenav-text")
	private WebElement clickOnCrewModule;
		

	//click on New Crew button    
	@FindBy(linkText ="NEW CREW")
	private WebElement clickOnNewCrew;

	//Enter Crew Name
	@FindBy(xpath="//input[@id='crew_name']")
	private WebElement crewName;

	//Enter Description
	@FindBy(xpath="//textarea[@id='crew_description']")
	private WebElement description;

	//Search Team Member
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement searchTeamMemberName;

	//Select Team Member Name
	//@FindBy(xpath="//li[@id='1542274-selectable']")
	//@FindBy(xpath="//div[@id='ms-crew_team_member_ids']/div[@class='ms-selectable']/ul/li[63]")
	//li[contains(.,"outer")]
	//@FindBy(xpath="//li/a/span[.='Pavan Shelar']")
	@FindBy(xpath="//div[@id='ms-crew_team_member_ids']/div[@class='ms-selectable']/ul/li[contains(.,'Shelar')]")
	private WebElement selectTeamMember1;

	//Select Team Member Name
	//@FindBy(xpath="//li[@id='47715436-selectable']")
	//@FindBy(xpath="//div[@id='ms-crew_team_member_ids']/div[@class='ms-selectable']/ul/li[75]")
	//@FindBy(xpath="//div[@id='ms-crew_team_member_ids']/div[@class='ms-selectable']/ul/li[contains(.,'Patil')]")
	@FindBy(xpath="//div[@class='ms-selectable']/ul/li/span[.='Harish Patil']")
	private WebElement selectTeamMember2;

	
	//Save button
	@FindBy(xpath="//input[@value='Save Crew' and @type='submit']")	
	 private WebElement weBtnSAVE;
	
	//private WebElement workorder;
	//@FindBy(xpath="/html//li[@id='work_order']/a/div[1]")
	@FindBy(xpath="//*[@id='work_order']/a/div[2]")
	private WebElement workorderclick;
	
	//For crew Deletion additional elements
	
	@FindBy(xpath="//table/tbody/tr[1]/th[2]")
	private WebElement Nameoptnclick;
	
	@FindBy(xpath="//table/tbody/tr[3]/td[1]/label")
	private WebElement Crewdelencheckboxclick;
	
	@FindBy(linkText="Delete")
	 private WebElement WebElemendelete;
	
	
	


	//Add new Crew Functions
	public void fnCrewCreation(int iTestCaseID, UCAppData testData) throws Exception
	{
		//CommonClass.driver.navigate().refresh();
		waitForThread(CommonClass.iWaitForThread2);

		//WebDriverWait Tripbtn = new WebDriverWait(CommonClass.driver, 20);
		workorderclick.click();


	waitForThread(CommonClass.iWaitForThread1);
	WebElementsidenavbar.click();
	waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	WebElementNvbar.click();
	waitForThread(CommonClass.iWaitForThread1);
	
	WebElementworkforce.click();

	waitForThread(CommonClass.iWaitForThread1);
	clickOnCrewModule.click();
	waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	clickOnNewCrew.click();
	waitForThread(CommonClass.iWaitForThread1);

	//sendValue(crewName,"AT Regression Crew","Enter Crew Name");
	String crewName = "ATTCrew" + new Random().nextInt(1000);
	CommonClass.driver.findElement(By.xpath("//input[@id='crew_name']")).sendKeys(crewName);


	waitForThread(CommonClass.iWaitForThread1);
	sendValue(description,"AT Sept Regression description","Enter Description");
	
	waitForThread(CommonClass.iWaitForThread1);
	searchTeamMemberName.clear();
	waitForThread(CommonClass.iWaitForThread1);
	//sendValue(searchTeamMemberName,"Harish patil","Search Team Member Name2");
	searchTeamMemberName.sendKeys("Harish patil");
	waitForThread(CommonClass.iWaitForThread2);
	selectTeamMember2.click();
	waitForThread(CommonClass.iWaitForThread1);
	

	sendValue(searchTeamMemberName,"pavan shelar","Search Team Member Name");
	//searchTeamMemberName.click();
	waitForThread(CommonClass.iWaitForThread2);
	selectTeamMember1.click();
	//String sTeamMember1 = "Pavan Shelar";
	//CommonClass.driver.findElement(By.xpath("//input[@type='text'])[2]")).sendKeys(sTeamMember1);

	

	//waitForThread(CommonClass.iWaitForThread1);
  //   clickOnSaveCrewButton();
     weBtnSAVE.click();
	waitForThread(CommonClass.iWaitForThread1);

	}
	
	
	//Deletion of the Crew

	public void fnCrewDeletion(int iTestCaseID, UCAppData testData) throws Exception
	{
		
		waitForThread(CommonClass.iWaitForThread2);
		System.out.println("Start the functionality of Crew Deletion");

		//WebDriverWait Tripbtn = new WebDriverWait(CommonClass.driver, 20);
		workorderclick.click();


	waitForThread(CommonClass.iWaitForThread2);
	WebElementsidenavbar.click();
	//waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	//WebElementNvbar.click();
	//waitForThread(CommonClass.iWaitForThread1);
	
	WebElementworkforce.click();
	waitForThread(CommonClass.iWaitForThread2);

	
	WebElementworkforce.click();

	waitForThread(CommonClass.iWaitForThread1);
	clickOnCrewModule.click();
	waitForThread(CommonClass.iWaitForThread1);
	
	Nameoptnclick.click();
	waitForThread(CommonClass.iWaitForThread1);
	
	//by harish
	
    	//end

	Crewdelencheckboxclick.click();
	waitForThread(CommonClass.iWaitForThread1);

	WebElemendelete.click();
	waitForThread(CommonClass.iWaitForThread1);
	
    //Pop up window handles for Accept
	CommonClass.driver.switchTo().alert().accept();
	
	waitForThread(CommonClass.iWaitForThread1);

		
	}


}