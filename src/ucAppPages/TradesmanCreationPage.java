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

public class TradesmanCreationPage extends ComboAppBasePage 
{

	public TradesmanCreationPage() 
	{
		super();
	}
	
	@FindBy(xpath="//*[@id='mySidenav']")
	 private WebElement WebElementsidenavbar;

	@FindBy(xpath="//*[@id='lockNavbar']")
	 private WebElement WebElementNvbar;
	
	
	@FindBy(xpath="//li[@id='labor']/a/div[@class='sidenav-text']")
	 private WebElement WebElementworkforce;
	
	
	@FindBy(xpath="//li[@id='team_members']//div[@class='sidenav-text']")
	 private WebElement WebElementTeammember;


	//click on Tradesman Section
	@FindBy(css="#tradesmen .sidenav-text")
	private WebElement clickOnTradesmanModule;

	//click on Invite your Tradesman button    
	@FindBy(linkText  ="INVITE YOUR TRADESMEN")
	private WebElement clickOnNewTradesman;
	//Enter User Name
	@FindBy(xpath="//input[@id='company_tradesmens_attributes_0_ftc_user_name']")
	private WebElement userName;

	//Enter Email
	@FindBy(xpath="//input[@id='company_tradesmens_attributes_0_email']")
	private WebElement email;
	//Enter First Name
	@FindBy(xpath="//input[@id='company_tradesmens_attributes_0_first_name']")
	private WebElement firstName;

	//Enter Last Name
	@FindBy(xpath="//input[@id='company_tradesmens_attributes_0_last_name']")
	private WebElement lastName;

	//Enter Phone
	@FindBy(xpath="//input[@id='company_tradesmens_attributes_0_phone']")
	private WebElement phone;

	//click on Invite Button
	@FindBy(xpath="//input[@name='commit']")
	private WebElement clickOnInviteButton;

	//Add new Functions
	public void fnTradesmanCreation(int iTestCaseID, UCAppData testData) throws Exception
	{
		
		//CommonClass.driver.navigate().refresh();
		//WebDriverWait Tripbtn = new WebDriverWait(CommonClass.driver, 20);

	waitForThread(CommonClass.iWaitForThread1);
	WebElementsidenavbar.click();
	waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	WebElementNvbar.click();
	
	waitForThread(CommonClass.iWaitForThread1);
	WebElementworkforce.click();
	waitForThread(CommonClass.iWaitForThread1);
	//clickOnTeamMembers.click();
	//waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	clickOnTradesmanModule.click();
	waitForThread(CommonClass.iWaitForThread1);

	waitForThread(CommonClass.iWaitForThread1);
	clickOnNewTradesman.click();
	waitForThread(CommonClass.iWaitForThread1);

	//sendValue(userName,"ATuser123","enter User Name");
	String usrName = "ATRegSepUsr" + new Random().nextInt(1000);
	//CommonClass.driver.findElement(By.xpath("//input[@id='company_tradesmens_attributes_0_ftc_user_name']")).sendKeys(usName);
	userName.sendKeys(usrName);

	waitForThread(CommonClass.iWaitForThread1);
	//sendValue(email,"pavan+14@utilizecore.com","enter Email");
	String Email = "pavan+" + new Random().nextInt(1000)+ "@utilizecore.com";
	//CommonClass.driver.findElement(By.xpath("//input[@id='company_tradesmens_attributes_0_email']")).sendKeys(email);
	email.sendKeys(Email);

	waitForThread(CommonClass.iWaitForThread1);
	sendValue(firstName,"Smiths","enter First Name");

	waitForThread(CommonClass.iWaitForThread1);
	sendValue(lastName,"colonels","enter Last Name");

	waitForThread(CommonClass.iWaitForThread1);
	sendValue(phone,"+917485968874","enter Phone Number");

	waitForThread(CommonClass.iWaitForThread1);
	clickOnInviteButton.click();
	waitForThread(CommonClass.iWaitForThread1);


	}


}
