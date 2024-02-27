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
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TeamMemberCreationPage extends ComboAppBasePage
{

	public TeamMemberCreationPage() 
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
	

	//searchRole sendkeys Keys.ENTER
	
	//popup close
		@FindBy(xpath="//*[@id='Embed']/div/div/div/div/div/div/div[1]/div/button[2]")
		 private WebElement wepopup;
		
		
		@FindBy(xpath="//*[@id='webWidget']")
	    private WebElement wepopupframe;
		

	//Click Main menu slide
	@FindBy(css=".fa-plus")
	private WebElement clickOnMainMenu;

	//click on WorkForce Module    
	@FindBy(css="#labor > .dropdown-toggle > .sidenav-text")
	private WebElement clickOnWorkForceModule;

	//Click On Team Member Module
	@FindBy(css="#team_members .sidenav-text")
	private WebElement clickOnTeamMembers;

	//Click On Create New Team Member Button
	@FindBy(linkText="CREATE NEW TEAM MEMBER")
	private WebElement createNewTeamMember;
	
		//Click On model popup move
		@FindBy(xpath="//*[@id='eModal']")
		private WebElement movemodelpopup;
		
		

	//Enter Email
	@FindBy(xpath="//input[@id='company_company_users_attributes_0_email']")
	private WebElement email;


	//Enter First Name
	//@FindBy(xpath="//input[@id='company_company_users_attributes_0_first_name']")
	@FindBy(xpath="//input[@name='company[company_users_attributes][0][first_name]']")

	private WebElement firstName;
	//Enter Last Name
	//@FindBy(xpath="//input[@id='company_company_users_attributes_0_last_name']")
	@FindBy(xpath="//input[@name='company[company_users_attributes][0][last_name]']")
	private WebElement lastName;
	//Click on Role
	@FindBy(css="#select2-company_company_users_attributes_0_role_id-container > .select2-selection__placeholder")
	private WebElement clickRole;

	//Search Role
	@FindBy(xpath="(//input[@type='search'])[4]")
	private WebElement searchRole;
	//select role by keys.enter
	
	
	@FindBy(xpath="//*[@id='select2-company_company_users_attributes_0_role_id-results']/li[6]")
	private WebElement searchRolesel;
	
	
	@FindBy(xpath="//*[@id='team_member-fields']/div/div[2]/div[6]/div/span/span[1]/span/ul/li/input")
	private WebElement searchRegion;
	
	//@FindBy(xpath="//*[@id='select2-company_company_users_attributes_0_territory_ids-result-hl0y-3']")
	@FindBy(xpath="//*[starts-with(@id,'select2-company_company_users_attributes_0_territory_ids-result-')]")
	private WebElement searchRegionSel;
	
		
	//@FindBy(xpath="//*[@id='team_member-field']/div/div[3]/div[2]/div/span/span[1]/span/ul/li/input")
	@FindBy(xpath="//div[@id='team_member-fields']/div[@class='nested-fields']/div[3]/div[2]/div/span//span[@role='combobox']/ul[@class='select2-selection__rendered']//input[@role='searchbox']")
	private WebElement searchDept;
	
	//@FindBy(xpath="//*[@id='select2-company_company_users_attributes_0_department_ids-result-uk8j-27']")
	@FindBy(xpath="//body/span/span[@class='select2-dropdown select2-dropdown--below']//ul[@role='listbox']/li[2]")
	private WebElement searchDeptsel;
	

	//Click On Invite button
	@FindBy(css=".btn-save")
	private WebElement inviteButton;
	//Add new Functions
	
	//Test Senario-2 Add New Role
	@FindBy(xpath="//form[@id='invite-team-members']/div[2]//a[@href='/company/roles/new']")
	private WebElement NewRoleLink;
	
	
	@FindBy(xpath="//*[@id='new_roles_emodal']")
	private WebElement NewRolemodel;
	
	
	@FindBy(xpath="//div[@id='payment_selection']/div[1]/div[@class='panel panel-default']//div[@class='btn btn-primary']")
	private WebElement NewRoleFreeTRailButon;
	
	
	@FindBy(xpath="//input[@id='role_name']")
	private WebElement NewRoleName;

	
	@FindBy(xpath="//textarea[@id='role_description']")
	private WebElement NewRoleDescription;

	
	@FindBy(xpath="//input[@id='role_admin']")
	private WebElement NewRoleAdminclick;

	
	@FindBy(xpath="//form[@id='new_role']/div[@class='col-sm-12 pt40']//input[@name='commit']")
	private WebElement NewRoleSaveclick;

	//@FindBy(xpath="/html//li[@id='work_order']/a/div[1]")
	@FindBy(xpath="//*[@id='work_order']/a/div[1]/i")
	private WebElement workorderclick;
	
	
	//Additional loacators for Edit Team Member
	
	@FindBy(linkText="VIEW ALL")
	private WebElement Viewalloptnclick;

	@FindBy(xpath="//table/tbody/tr[contains(.,'Roma')]/td[contains(.,'User')]/following-sibling::td/a[. = 'Edit']")
	private WebElement selectrowEditoptnclick;
	
	
	@FindBy(xpath="//div[1]/div[4]/div/span/span[1]/span/span[2]/b")
	private WebElement Roleupdationclick;
	
	
	@FindBy(xpath="//*[@id='select2-company_user_role_id-results']/li[6]")
	private WebElement RoleupdationRoleselctn;
	
	
	
	//Update button
	@FindBy(xpath="//input[@value='Update' and @type='submit']")	
	 private WebElement weBtnUPDATE;
	
	//Aditional locators for upload team Member functionality
	
	
	@FindBy(xpath="//*[@id='page-content']/div[3]/div[2]")	
	 private WebElement wepagecontent;
	
	
	@FindBy(xpath="//div[@id='page-content']//a[@role='button']/i[@class='fa fa-sort-down']")	
	 private WebElement weBtnSortdown;
	
	
	 @FindBy(xpath="//form[@action='/company/company_users/read_excel']//div[@class='text-center']")	
	 private WebElement wedragandupload;
	
		


	//Invite the Team Member
	public void fnTeamMemeberCreation(int iTestCaseID, UCAppData testData) throws Exception
	{
		System.out.println("Enter In Invite Team Member Method");

		waitForThread(CommonClass.iWaitForThread2);
		//waitForThread(CommonClass.iWaitForThread2);
		workorderclick.click();
		waitForThread(CommonClass.iWaitForThread2);

		  Actions actions = new Actions(CommonClass.driver); 
	       actions.moveToElement(WebElementsidenavbar).click().perform();
			waitForThread(CommonClass.iWaitForThread2);
			System.out.println("Navigation Menu fuction click");
			//WebElementNvbar.click();
			waitForThread(CommonClass.iWaitForThread1);
			WebElementworkforce.click();
			//WebElementTeammember.click();
			Actions actions1 = new Actions(CommonClass.driver); 
		    actions1.moveToElement(WebElementTeammember).click().perform();
			waitForThread(CommonClass.iWaitForThread2);

		  //Iframe code by Harish
			//if(wepopupframe.isDisplayed()== true)
			
			/*List<WebElement> dynamicElement = CommonClass.driver.findElements(By.id("webWidget"));
				
			if(dynamicElement.size() != 0)
			{
				 //If list size is non-zero, element is present
				 System.out.println("Element present");
				//}
		    //{
			//{
			
		    CommonClass.driver.switchTo().frame(wepopupframe);	
			//*[@id="webWidget"]
			System.out.println("iframe switch properly");
			Actions actions6 = new Actions(CommonClass.driver); 
		    actions6.moveToElement(wepopup).click().perform();
		  }
		   else
		    {
		    	System.out.println("frame disable");
		    	
		    }*/
			
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

		
	 
	waitForThread(CommonClass.iWaitForThread);
	createNewTeamMember.click();
	waitForThread(CommonClass.iWaitForThread);
	
		
	Actions actions2 = new Actions(CommonClass.driver); 
    actions2.moveToElement(movemodelpopup).click().perform();
		waitForThread(CommonClass.iWaitForThread2);
		System.out.println("Navigation model fuction click");


	//sendValue(email,"pavan+104@utilizecore.com","enter Email");
	String email = "pavan+" + new Random().nextInt(1000)+"@utilizecore.com";
	CommonClass.driver.findElement(By.id("company_company_users_attributes_0_email")).sendKeys(email);
	

	waitForThread(CommonClass.iWaitForThread);
	sendValue(firstName,"Pavans","enter First Name");

	waitForThread(CommonClass.iWaitForThread);
	sendValue(lastName,"Smith","enter Last Name");

	waitForThread(CommonClass.iWaitForThread);
	clickRole.click();
	waitForThread(CommonClass.iWaitForThread);

	//sendValue(searchRole,"admin with company setting","Search the role name");
	//waitForThread(CommonClass.iWaitForThread);
	searchRolesel.click();
	//searchRole.sendKeys("West");
	waitForThread(CommonClass.iWaitForThread);
	
	
	waitForThread(CommonClass.iWaitForThread2);

	searchDept.click();
	waitForThread(CommonClass.iWaitForThread);

	searchDeptsel.click();

	waitForThread(CommonClass.iWaitForThread);
	inviteButton.click();
	waitForThread(CommonClass.iWaitForThread2);
	waitForThread(CommonClass.iWaitForThread2);


	}

		
    //Adding The New Team Member
	public void fnNewTeamMemberCreation(int iTestCaseID, UCAppData testData)throws Exception 
	{
		System.out.println("Enter In Add New Team Member Method");

		waitForThread(CommonClass.iWaitForThread);

		workorderclick.click();
	
		waitForThread(CommonClass.iWaitForThread2);

		
		 Actions actions = new Actions(CommonClass.driver); 
	       actions.moveToElement(WebElementsidenavbar).click().perform();
			waitForThread(CommonClass.iWaitForThread2);
			System.out.println("Navigation Menu fuction click");
			//WebElementNvbar.click();
			waitForThread(CommonClass.iWaitForThread2);
			WebElementworkforce.click();
			//WebElementTeammember.click();
			Actions actions1 = new Actions(CommonClass.driver); 
		    actions1.moveToElement(WebElementTeammember).click().perform();
			waitForThread(CommonClass.iWaitForThread2);

		  //Iframe code by Harish
			
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

		    
			//waitForThread(CommonClass.iWaitForThread2);
	    	createNewTeamMember.click();
	    	waitForThread(CommonClass.iWaitForThread2);
	    	
	    	Actions actions2 = new Actions(CommonClass.driver); 
	        actions2.moveToElement(movemodelpopup).click().perform();
	    		waitForThread(CommonClass.iWaitForThread1);
	    		System.out.println("Navigation model fuction click");
	    		NewRoleLink.click();
	    		waitForThread(CommonClass.iWaitForThread1);
	    		
	 
	    		Actions actions7 = new Actions(CommonClass.driver); 
			    actions7.moveToElement(NewRolemodel).click().perform();
	    		waitForThread(CommonClass.iWaitForThread);

			    NewRoleFreeTRailButon.click();
	    		waitForThread(CommonClass.iWaitForThread);

	
			   // NewRoleName.sendKeys("RvRole1");
			    String NewRoleN = "RTRoleSep" + new Random().nextInt(1000);
				CommonClass.driver.findElement(By.id("role_name")).sendKeys(NewRoleN);
				
	    		waitForThread(CommonClass.iWaitForThread);

			    NewRoleDescription.sendKeys("Rev Test Desciptions Sep");
	    		waitForThread(CommonClass.iWaitForThread);

			    NewRoleAdminclick.click();
	    		waitForThread(CommonClass.iWaitForThread);

			    NewRoleSaveclick.click();

		
	}

   //Edit Existing Team Member Method 
	public void fnTeamMemberEdition(int iTestCaseID, UCAppData testData) throws Exception
	{
		System.out.println("Enter In Edit Existing Team Member Method");
		waitForThread(CommonClass.iWaitForThread);

		workorderclick.click();
	
		waitForThread(CommonClass.iWaitForThread2);

		
		 Actions actions = new Actions(CommonClass.driver); 
	       actions.moveToElement(WebElementsidenavbar).click().perform();
			waitForThread(CommonClass.iWaitForThread2);
			System.out.println("Navigation Menu fuction click");
			//WebElementNvbar.click();
			waitForThread(CommonClass.iWaitForThread2);
			WebElementworkforce.click();
			//WebElementTeammember.click();
			Actions actions1 = new Actions(CommonClass.driver); 
		    actions1.moveToElement(WebElementTeammember).click().perform();
			waitForThread(CommonClass.iWaitForThread2);
			
			Viewalloptnclick.click();
			waitForThread(CommonClass.iWaitForThread2);
			System.out.println("View all Sucessfully click");


			  //Scroll down upto last record for Edit Link 
		     JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
			js.executeScript("arguments[0].scrollIntoView(true);", selectrowEditoptnclick);
			System.out.println("Scroll Down Sucessfully and Particular Row checkbox clickable");

			  waitForThread(CommonClass.iWaitForThread);

			  selectrowEditoptnclick.click();
			 waitForThread(CommonClass.iWaitForThread);
			 
			//Edit role 
			    Roleupdationclick.click();
				waitForThread(CommonClass.iWaitForThread);
				//RoleupdationRoleselctn.click();
				
			    
		        //Random Value selction from drop down list
		        List <WebElement> listings = CommonClass.driver.findElements(By.xpath("//*[@id='select2-company_user_role_id-results']/li"));
		        Random r = new Random();
		        int randomValue = r.nextInt(listings.size()); //Getting a random value
		        listings.get(randomValue).click(); //Clicking on the random item in the list.

				waitForThread(CommonClass.iWaitForThread);

				weBtnUPDATE.click();
	
		
	}

   ///Upload the Team Member
	public void fnTeamMemberUploadthruexcel(int iTestCaseID, UCAppData testData) throws Exception
	{
		System.out.println("Enter In Upload Team Member Method");
		waitForThread(CommonClass.iWaitForThread);

		workorderclick.click();
	
		waitForThread(CommonClass.iWaitForThread2);

		
		 Actions actions = new Actions(CommonClass.driver); 
	       actions.moveToElement(WebElementsidenavbar).click().perform();
			waitForThread(CommonClass.iWaitForThread2);
			System.out.println("Navigation Menu fuction click");
			//WebElementNvbar.click();
			waitForThread(CommonClass.iWaitForThread1);
			WebElementworkforce.click();
			//WebElementTeammember.click();
			Actions actions1 = new Actions(CommonClass.driver); 
		    actions1.moveToElement(WebElementTeammember).click().perform();
			waitForThread(CommonClass.iWaitForThread2);
			//WebElementsidenavbar.click();
			
	    	actions.moveToElement(weBtnSortdown).perform();
   
			waitForThread(CommonClass.iWaitForThread1);

			 Actions actions2 = new Actions(CommonClass.driver); 
		       actions2.moveToElement(weBtnSortdown).click().perform();

		      // wedragandupload.sendKeys("");
		       wedragandupload.click();
		       
		       StringSelection TeamMemberAttachment= new StringSelection("./Upload/Upload Team Members.xlsx");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(TeamMemberAttachment,null);

				//System.out.println("File is Uploaded Successfully");
				
				Robot robot = new Robot();

				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				waitForThread(CommonClass.iWaitForThread2);
				robot.keyPress(KeyEvent.VK_ENTER);
				waitForThread(CommonClass.iWaitForThread2);
				robot.keyRelease(KeyEvent.VK_ENTER);
		
				waitForThread(CommonClass.iWaitForThread2);
				
				
		        JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
				js.executeScript("arguments[0].scrollIntoView(true);", inviteButton);
				System.out.println("Scroll Down Sucessfully and Invite Button clickable");
				waitForThread(CommonClass.iWaitForThread2);

				inviteButton.click();

				waitForThread(CommonClass.iWaitForThread2);

		}
		
	}

