package ucAppPages;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.UCAppData;
import lib.CommonClass;

public class ProfileDetailsPage extends ComboAppBasePage 
{

	public ProfileDetailsPage() 
	{
		super();
	}
 
	@FindBy(xpath="//*[@id='mySidenav']")
	 private WebElement WebElementsidenavbar;

	
	@FindBy(xpath="//*[@id='profile']/a/div")
	 private WebElement WebElementProfile;
	
	@FindBy(linkText="GO THROUGH THE WIZARD")
	 private WebElement WebElementGoWizard;
	
	@FindBy(xpath="//label[@for='clone_contact_yes']")
	 private WebElement WebElementContactYes;
	
	@FindBy(xpath="//*[@id='company_contact_title']")
	 private WebElement WebElementCompanyTitle;
	
	
	@FindBy(xpath="//*[@id='company_contact_phone']")
	 private WebElement WebElementCompanyPhone;
	
	//Contcts Details xpath
	@FindBy(xpath="//label[@for='contact_yes']")
	 private WebElement WebElementContactselYes;
	

	@FindBy(xpath="//*[@id='company_contacts_attributes_0_title']")
	 private WebElement WebElementContactTitle;
	
	
	@FindBy(xpath="//*[@id='company_contacts_attributes_0_email']")
	 private WebElement WebElementContactEmail;
	
	
	@FindBy(xpath="//input[@placeholder='Extension']")
	//@FindBy(xpath="//div[@id='contact-fields']/div[1]/div[2]/div[@class='col-md-6 form-editabel']//input[@name='company[contacts_attributes][0][extension]']")
	 private WebElement WebElementContactExtension;
	
	
	@FindBy(xpath="//*[@id='company_contacts_attributes_0_mobile']")
	 private WebElement WebElementContactmobile;
	

	
	@FindBy(xpath="//input[@value='Next' and @type='submit']")	
	 private WebElement WebElementBtnNext;
	
	//for Confirm your addresses tab
	@FindBy(xpath="//input[@value='NEXT' and @type='submit']")	
	 private WebElement WebElementBtnNextbtn;
	
	//tab 4 Tell us a bit more about your company (where available) locators
	
	
	@FindBy(xpath="//*[@id='company_fax']")	
	 private WebElement WebElementCompnyFax;
	
	
	@FindBy(xpath="//input[@id='company_phone']")	
	 private WebElement WebElementCompnyPhone;
	
	
	@FindBy(xpath="//input[@id='company_extension']")	
	 private WebElement WebElementCompnyextension;
	
	
	@FindBy(xpath="//input[@id='company_after_hours_phone']")	
	 private WebElement WebElementCompnyafterhoursphone;
	
	
	@FindBy(xpath="//input[@id='company_technicians_count']")	
	 private WebElement WebElementCompnytechniciancount;
	

	@FindBy(xpath="//input[@id='company_business_hour']")	
	 private WebElement WebElementCompnybusinesshour;
	
	
	@FindBy(xpath="//input[@id='company_tax_id']")	
	 private WebElement WebElementtaxid;
	
	//Trade details Additional Locators
	
	//click on New Trade button    
		@FindBy(linkText  ="NEW TRADE")
		private WebElement clickOnNewTrade;

		//Click On Trade Name
		//@FindBy(css=".select2-container--below .select2-selection")
		@FindBy(xpath="//form[@id='new-trade']/div[1]/div/div/span//span[@role='combobox']")
		private WebElement tradeNameClick;



		//Enter Trade Name
		@FindBy(xpath="//input[@type='search']")
		private WebElement enterName; //control +enter sendkeys
		
		//Enter Trade Name selection
			@FindBy(xpath="//ul[@id='select2-trade_name-results']/li[@role='option']")
			private WebElement SeltradeName; //control +enter sendkeys
			
		//Enter SIC Code
		@FindBy(xpath="//input[@id='trade_sic_code']")
		private WebElement sicCode;

		//Enter Authorization Number
		@FindBy(xpath="//input[@id='trade_authorization_number']")
		private WebElement authorizationNumber;

		//Select State Registered to Collect Taxes
		@FindBy(xpath="//select[@id='trade_state']")
		private WebElement selectStateRegisteredName; //sendkeys down arrow nd control+enter

		//Enter Description
		@FindBy(xpath="//textarea[@id='trade_description']")
		private WebElement enterDescription;


		//Click On Save Button
		@FindBy(xpath="//input[@name='commit' and @value='SAVE']")
		private WebElement clickSaveButton;
		
		
		//Updating Trades Additional Locators
		
		@FindBy(xpath="//table/tbody/tr[2]/td[6]/span/a/i")
		private WebElement Updtes2ndrecord;


	      //Adding new Servicable Area locators
		
		@FindBy(linkText="NEW SERVICEABLE AREA")
		private WebElement Servicablearaeclick;
		
		
		@FindBy(xpath="//*[@id='profile_region']/div[2]/span/span[1]/span/ul")
		private WebElement Tradesclick;

		
		@FindBy(xpath="//*[@id='select2-trade_name-results']/li[1]")
		private WebElement TradesResultclick;

		
		@FindBy(linkText="SAVE")
		private WebElement SaveserAreaBtn;
		
			
		@FindBy(xpath="//*[@id='region_name']")
		private WebElement regionname;
		
		//Trade by Rate locators
		
		@FindBy(xpath="//*[@id='rates_list']")
		private WebElement RatesList;
		
		
		
		@FindBy(linkText="Union")
		private WebElement PageHeading;
		
		@FindBy(linkText="Non Union")
		private WebElement PageHeadingNonUn;
		

		
		
		//@FindBy(xpath="//*[contains(@id, 'union-labor-rates')]/h4[1]/span[2]/a/i")
		//@FindBy(xpath="//a[@data-toggle='emodal']/i[@class='fa fa-plus-circle']")
		
		//@FindBy(xpath="//div[@id='rates_list']//i[@class='fa fa-plus-circle']")
		//@FindBy(xpath="//div[1]/div/div[2]/div/div[1]/h4[1]/span[2]/a/i")
		//@FindBy(xpath="//div[@class='tabel-trade-header']/div[4]/div[@class='panel panel-default']/div[2]/div/div[1]//a[contains(@href, '/labor_rates/new?union=true')]/i[@class='fa fa-plus-circle']")
		//@FindBy(xpath="//a[contains(@href, '/labor_rates/new?union=true')]/i[@class='fa fa-plus-circle'][1]")
		//@FindBy(xpath="//div[contains(@id, 'union-labor-rates')]/h4[1]/span[2]/a[1]")
		//@FindBy(css=".union-labor-rates")	
		//@FindBy(xpath="//div[@id='rates_list']/div[@class='trade-page']/div[@class='tabel-trade-header']//div[contains(@id, '')]/div[@class='panel panel-default']/div[2]/div/div[1]//a[contains(@href,'/labor_rates/new?union=true')]/i[@class='fa fa-plus-circle']")
		//@FindBy(xpath="//h4[1]/span[2]//a[contains(@href,'/labor_rates/new?union=true')]/i[1]")
		//@FindBy(xpath="//div[contains(@id,'-union-labor-rates')]/h4[1]/span[2]//a[contains(@href,'/labor_rates/new?union=true')][1]/i[@class='fa fa-plus-circle']")
		//@FindBy(xpath="//div[contains(@id,'-union-labor-rates')]/h4[1]/span[2]/a[1]/i")
		@FindBy(xpath="//html/body/div[1]/div[1]/div[3]/div/div/div[2]/div/div/form/div[1]/div/div/div[4]/div/div[2]/div/div[1]/h4[1]/span[2]/a/i")
		private WebElement AllAreaRate;
		
		@FindBy(xpath="//*[@id='page-content']")
		private WebElement Pagecontent;
		
		
		@FindBy(xpath="//*[@id='labor_rate_name']")
		private WebElement LabourRateName;


	
		@FindBy(xpath="//*[@id='labor_rate_description']")
		private WebElement LabourRateDescription;

		

		
		@FindBy(xpath="//*[@id='labor_rate_regular_rate']")
		private WebElement LabourRateRegularRate;

	

		
		@FindBy(xpath="//*[@id='labor_rate_overtime_rate']")
		private WebElement LabourRateOverTRate;


		
		@FindBy(xpath="//*[@id='labor_rate_double_rate']")
		private WebElement LabourRateDoubleRate;

	
		@FindBy(xpath="//*[@id='labor_rate_vendor_regular_rate']")
		private WebElement LabourRateVendorRegularRate;

		
		@FindBy(xpath="//*[@id='labor_rate_vendor_overtime_rate']")
		private WebElement LabourRateVendorOTRate;

		
		@FindBy(xpath="//*[@id='labor_rate_vendor_double_rate']")
		private WebElement LabourRateVendorDoubleRate;

		@FindBy(xpath="//input[@value='Save' and @type='submit']")	
		 private WebElement WebElementBtnSave;
		
				
		@FindBy(xpath="//table/thead/tr/th[1]")	
		 private WebElement WebElementColapsebyname;
		
		
		@FindBy(xpath="//div[@class='panel panel-default']/div[2]/div[@class='col-sm-12 links']/div[2]/a[@href='#']/div//i[1]")	
		 private WebElement WebElementPlusclick;
	
	public void fnProfileDetails(int iTestCaseID, UCAppData testData) throws Exception
	{
		
		waitForThread(CommonClass.iWaitForThread1);
		WebElementsidenavbar.click();
		waitForThread(CommonClass.iWaitForThread1);
		WebElementProfile.click();
		waitForThread(CommonClass.iWaitForThread);
		
		Actions actions= new Actions(CommonClass.driver); 
        actions.moveToElement(WebElementGoWizard).perform();
		waitForThread(CommonClass.iWaitForThread2);
        System.out.println("Move to the Go to the  wizrd Button");
        
		waitForThread(CommonClass.iWaitForThread);

		WebElementGoWizard.click();
		
		
       // boolean searchisSelected = WebElementContactYes.isSelected();
        
       // if (searchisSelected=true)
        //{
        	//WebElementCompanyTitle.getText().isEmpty();
        	//String textInsideInputBox = WebElementCompanyTitle.getAttribute("value");
        	if (WebElementCompanyTitle.getAttribute("value").isEmpty()) 
        	{
        		WebElementCompanyTitle.sendKeys("TestPurpose");
        	}
        	else if(WebElementCompanyPhone.getAttribute("value").isEmpty())
            	{
            		WebElementCompanyPhone.sendKeys("123456");
            	}
                       	        	        	
      //  }
        else
        {
        	System.out.print("This is for No case");
        
        }
        
        //contcats details
       // boolean searchisSelectedcontacts = WebElementContactYes.isSelected();

       // if(searchisSelectedcontacts=true)
       // {
    		waitForThread(CommonClass.iWaitForThread);
    		
    		WebElementContactselYes.click();

        	if (WebElementContactTitle.getAttribute("value").isEmpty()) 
        	{
        		WebElementContactTitle.sendKeys("Mr");
        	}
        	else if(WebElementContactEmail.getAttribute("value").isEmpty())
            	{
        		WebElementContactEmail.sendKeys("test@test.com");
        		waitForThread(CommonClass.iWaitForThread);
               		
        		// JavascriptExecutor js1 = ((JavascriptExecutor) CommonClass.driver);
     			//js1.executeScript("arguments[0].scrollIntoView(true);", WebElementBtnNext);
     			//System.out.println("Scroll up Sucessfully and Next option visible");
     			
        		//waitForThread(CommonClass.iWaitForThread2);
            	}
    	
      	    else if(WebElementContactExtension.getAttribute("value").isEmpty())
        	{
        		//WebElementContactExtension.click();
     			System.out.println("Enter in Contact Extension case");

        		waitForThread(CommonClass.iWaitForThread1);
        		WebElementContactExtension.sendKeys("000");
        		//sendvalue(WebElementContactExtension)
    			//sendValue(WebElementContactExtension,"000","Enter the extenshion details");			
            }
        	
        	else if(WebElementContactmobile.getAttribute("value").isEmpty())
        	{
        		WebElementContactmobile.sendKeys("123456789");
        		waitForThread(CommonClass.iWaitForThread);

        	}
        	
        	
        	WebElementBtnNext.click();

        	                       	        	        	
      //  }
        
        /* else
        {
        	System.out.print("This is for No case");
        	WebElementBtnNext.click();
        }*/
        
    	//WebElementBtnNext.click();

        	
        	//Confirm your addresses
    		waitForThread(CommonClass.iWaitForThread2);

        	JavascriptExecutor js2 = ((JavascriptExecutor) CommonClass.driver);
 			js2.executeScript("arguments[0].scrollIntoView(true);", WebElementBtnNextbtn);
 			System.out.println("Scroll up Sucessfully and Next option visible");
 			
    		waitForThread(CommonClass.iWaitForThread2);

    		WebElementBtnNextbtn.click();
        	
              //3rd tab 	  	

    		waitForThread(CommonClass.iWaitForThread2);

    		WebElementBtnNextbtn.click();
    		
    		
    		//4th tab Tell us a bit more about your company (where available)
    		waitForThread(CommonClass.iWaitForThread);
            System.out.print("4th tab Tell us a bit more about your company");
            
            
           /* JavascriptExecutor jse = (JavascriptExecutor)CommonClass.driver;
            jse.executeScript("document.getElementById('company_fax').focus();");
            System.out.print("Focus on company Fax");*/

    		waitForThread(CommonClass.iWaitForThread);

    	
          
    		   if(WebElementCompnyFax.getAttribute("value").isEmpty())
    		    {
    			
        		waitForThread(CommonClass.iWaitForThread);           
        		
        		WebElementCompnyFax.sendKeys("+44-208-1234567");
        	    }

    		   else if(WebElementCompnyPhone.getAttribute("value").isEmpty())
            	{
        		waitForThread(CommonClass.iWaitForThread);
        		WebElementCompnyPhone.sendKeys("123456789");
            	}
            
             	else if(WebElementCompnyextension.getAttribute("value").isEmpty())
        	    {
        		WebElementCompnyextension.sendKeys("123456789");
        	    }
        	   else if(WebElementCompnyafterhoursphone.getAttribute("value").isEmpty())
        	   {
        		WebElementCompnyafterhoursphone.sendKeys("123456789");
        	   }
        	else if(WebElementCompnytechniciancount.getAttribute("value").isEmpty())
        	{
        		WebElementCompnytechniciancount.sendKeys("123456789");
        	}
    		
        	else if(WebElementCompnybusinesshour.getAttribute("value").isEmpty())
        	{
        		WebElementCompnybusinesshour.sendKeys("123456789");
        	}
        	else if(WebElementtaxid.getAttribute("value").isEmpty())
        	{
        		WebElementtaxid.sendKeys("123456789");
        	}
    		    	       
        	else
            {
            	System.out.print("This is for No case");
            	WebElementBtnNextbtn.click();
            }
       		waitForThread(CommonClass.iWaitForThread);

    		   
    		   JavascriptExecutor js3 = ((JavascriptExecutor) CommonClass.driver);
    			js3.executeScript("arguments[0].scrollIntoView(true);", WebElementBtnNextbtn);
    			System.out.println("Scroll up Sucessfully and Next option visible");

        		waitForThread(CommonClass.iWaitForThread);

    			WebElementBtnNextbtn.click();
    			
    			
    			//tab 5
    			
        		waitForThread(CommonClass.iWaitForThread);

    			
    			JavascriptExecutor js4 = ((JavascriptExecutor) CommonClass.driver);
    			js4.executeScript("arguments[0].scrollIntoView(true);", WebElementBtnNextbtn);
    			System.out.println("Scroll up Sucessfully and Next option visible");

        		waitForThread(CommonClass.iWaitForThread);

    			WebElementBtnNextbtn.click();

    			System.out.print("fifth tab working properly");
    			
    			//tab 6
                 waitForThread(CommonClass.iWaitForThread);

    			
    			JavascriptExecutor js5 = ((JavascriptExecutor) CommonClass.driver);
    			js5.executeScript("arguments[0].scrollIntoView(true);", WebElementBtnNextbtn);
    			System.out.println("Scroll up Sucessfully and Next option visible");

        		waitForThread(CommonClass.iWaitForThread);

    			WebElementBtnNextbtn.click();
    			
    			System.out.print("six tab working properly");
    			
    			//tab 7
                waitForThread(CommonClass.iWaitForThread);

   			
   		/*	JavascriptExecutor js6 = ((JavascriptExecutor) CommonClass.driver);
   			js6.executeScript("arguments[0].scrollIntoView(true);", WebElementBtnNextbtn);
   			System.out.println("Scroll up Sucessfully and Next option visible");*/

       		waitForThread(CommonClass.iWaitForThread2);
       		//waitForThread(CommonClass.iWaitForThread);

   			WebElementBtnNextbtn.click();
   			System.out.print("seven tab working properly");
   			
   			//New Trade functionality
   			waitForThread(CommonClass.iWaitForThread2);
   			
   			waitForThread(CommonClass.iWaitForThread2);
   			clickOnNewTrade.click();
   			waitForThread(CommonClass.iWaitForThread1);

   			waitForThread(CommonClass.iWaitForThread1);
   			tradeNameClick.click();
   			waitForThread(CommonClass.iWaitForThread1);

   	   			
   			//by Harish
   		      //Random Value selction from drop down list
	       /* List <WebElement> listings = CommonClass.driver.findElements(By.xpath("//*[@id='select2-trade_name-results']/li"));
	        Random r = new Random();
	        int randomValue = r.nextInt(listings.size()); //Getting a random value
	        listings.get(randomValue).click(); //Clicking on the random item in the list.*/

	        
	        String TradeName = "ATSrade" + new Random().nextInt(1000);
			CommonClass.driver.findElement(By.xpath("//span[1]/input")).sendKeys(TradeName);
			
   			waitForThread(CommonClass.iWaitForThread1);

			TradesResultclick.click();
   			//waitForThread(CommonClass.iWaitForThread1);
   			//sendValue(enterName,"control+enter key","Enter Trade Name");
   			//SeltradeName.click();

   			waitForThread(CommonClass.iWaitForThread1);
   			//sendValue(sicCode,"104785","Enter SIC Code");
   			String SICcodeName = "0209" + new Random().nextInt(1000);
   		   	sicCode.sendKeys(SICcodeName);

   			waitForThread(CommonClass.iWaitForThread1);
   			//sendValue(authorizationNumber,"204050","Enter Authorization Number");
   			String AuthorzationNumber = "0309" + new Random().nextInt(1000);
   			authorizationNumber.sendKeys(AuthorzationNumber);

   			waitForThread(CommonClass.iWaitForThread1);

   		    List <WebElement> selects = CommonClass.driver.findElements(By.xpath("//*[@id='trade_state']//option"));
   		     selects.get(getRandomNumberInBetween(1, selects.size() - 1)).click();
   		                  
	       
   			waitForThread(CommonClass.iWaitForThread1);
   			sendValue(enterDescription,"Trade Added through Profile AT Regression Script","Enter Description");

   			waitForThread(CommonClass.iWaitForThread1);
   			clickSaveButton.click();
   			waitForThread(CommonClass.iWaitForThread1);
   			
   			
   			//Update Existing Trades
   			
   			Updtes2ndrecord.click();
   			
   			waitForThread(CommonClass.iWaitForThread1);
   			sendValue(enterDescription,"Trade Updated through Profile AT Regression Script","Enter Description");

   			waitForThread(CommonClass.iWaitForThread1);
   			clickSaveButton.click();
   			waitForThread(CommonClass.iWaitForThread1);
   			
   			  		
   			JavascriptExecutor js7 = ((JavascriptExecutor) CommonClass.driver);
   			js7.executeScript("arguments[0].scrollIntoView(true);", WebElementBtnNextbtn);
   			System.out.println("Scroll up Sucessfully and Next option visible");

       		waitForThread(CommonClass.iWaitForThread);

   			WebElementBtnNextbtn.click();
   			
   			//Add new servicable area
       		waitForThread(CommonClass.iWaitForThread2);
       		      		
       		
       		Servicablearaeclick.click();
       		waitForThread(CommonClass.iWaitForThread2);
       		
	        regionname.clear();
       		waitForThread(CommonClass.iWaitForThread1);


	        String RegionName = "ATTrade" + new Random().nextInt(1000);
	        regionname.sendKeys(RegionName);
		
       		
       		waitForThread(CommonClass.iWaitForThread2);
       		
       		Tradesclick.click();
       		waitForThread(CommonClass.iWaitForThread2);


   		    List <WebElement> listings2 = CommonClass.driver.findElements(By.xpath("//*[@id='select2-region_trade_ids-results']/li"));
       	    Random r2 = new Random();
	        int randomValue2 = r2.nextInt(listings2.size()); //Getting a random value
	        listings2.get(randomValue2).click(); //Clicking on the random item in the list.
       		waitForThread(CommonClass.iWaitForThread2);

	       	        
	        List <WebElement> listings3 = CommonClass.driver.findElements(By.xpath("//a[@class='jstree-anchor']//i[1]"));
	        Random r3 = new Random();
	        int randomValue3 = r3.nextInt(listings3.size()); //Getting a random value
	        listings3.get(randomValue3).click(); //Clicking on the random item in the list.	        
	                     
	        
       		waitForThread(CommonClass.iWaitForThread1);

	        SaveserAreaBtn.click();
       		waitForThread(CommonClass.iWaitForThread1);
       		
       		JavascriptExecutor js8 = ((JavascriptExecutor) CommonClass.driver);
   			js8.executeScript("arguments[0].scrollIntoView(true);", WebElementBtnNextbtn);
   			System.out.println("Scroll up Sucessfully and Next option visible");

       		waitForThread(CommonClass.iWaitForThread);

   			WebElementBtnNextbtn.click();
   			
   			//Rate List functionality
   			
       		waitForThread(CommonClass.iWaitForThread2);

   		    List <WebElement> listings4 = CommonClass.driver.findElements(By.xpath("//*[@id='rates_list']/div/div/div"));
	        Random r4 = new Random();
	        int randomValue4 = r4.nextInt(listings4.size()); //Getting a random value
	        listings4.get(randomValue4).click(); //Clicking on the random item in the list.	 
       		waitForThread(CommonClass.iWaitForThread2);
       		//waitForThread(CommonClass.iWaitForThread2);
       		//waitForThread(CommonClass.iWaitForThread2);
       		
       		
        	//JavascriptExecutor js9 = ((JavascriptExecutor) CommonClass.driver);

        	//js9.executeScript("window.scrollBy(0,1000)");
        	
        	//js9.executeScript("scroll(0, 250);");
       		waitForThread(CommonClass.iWaitForThread2);
       		
       		JavascriptExecutor js9 = ((JavascriptExecutor) CommonClass.driver);
   			js9.executeScript("arguments[0].scrollIntoView(true);", PageHeading);
   			System.out.println("Scroll up Sucessfully and heading option visible");
   			//PageHeadingNonUn.click();
       		
   		
       		waitForThread(CommonClass.iWaitForThread2);
       		//waitForThread(CommonClass.iWaitForThread2);
       		
       		//AllAreaRate.click();
       		//waitForThread(CommonClass.iWaitForThread2);

       		//AllAreaRate.click();


   			//PageHeading.click();
       		
			Actions actions6 = new Actions(CommonClass.driver); 
       		waitForThread(CommonClass.iWaitForThread);
	        actions6.moveToElement(AllAreaRate).click().perform();
       		waitForThread(CommonClass.iWaitForThread2);

			System.out.println("scroll move element Rate list properly");
			//AllAreaRate.click();
			
			JavascriptExecutor executor = (JavascriptExecutor)CommonClass.driver;
			executor.executeScript("arguments[0].click();", AllAreaRate);
			
			//JavascriptExecutor js9 = ((JavascriptExecutor) CommonClass.driver);

        	//js9.executeScript("window.scrollBy(0,1000)");
        	
        	//js9.executeScript("scroll(0, 350);");

		

       		//waitForThread(CommonClass.iWaitForThread2);
       		
			/*Actions actions7 = new Actions(CommonClass.driver); 
	        actions7.moveToElement(AllAreaRate).perform();*/
	        
	       // a.doubleClick(trialaction).perform();;
			//System.out.println("scroll move Rate plus Button click properly");
			
			//new WebDriverWait(CommonClass.driver, 20).until(AllAreaRate)).click();
       		//waitForThread(CommonClass.iWaitForThread2);

       		//AllAreaRate.click();
       		waitForThread(CommonClass.iWaitForThread2);
       		
       		//LabourRateName.sendKeys("RtestRate");
       		waitForThread(CommonClass.iWaitForThread2);
       	    String LabourRate = "TestLaboursep" + new Random().nextInt(1000);
       	 LabourRateName.sendKeys(LabourRate);

       		LabourRateDescription.sendKeys("RtestDescription");
       		waitForThread(CommonClass.iWaitForThread1);

       		LabourRateRegularRate.sendKeys("250");
       		waitForThread(CommonClass.iWaitForThread1);

       		LabourRateOverTRate.sendKeys("320");
       		waitForThread(CommonClass.iWaitForThread1);

       		LabourRateDoubleRate.sendKeys("300");
       		waitForThread(CommonClass.iWaitForThread1);

       		LabourRateVendorRegularRate.sendKeys("350");
       		waitForThread(CommonClass.iWaitForThread1);

       		LabourRateVendorOTRate.sendKeys("380");
       		waitForThread(CommonClass.iWaitForThread2);

       		LabourRateVendorDoubleRate.sendKeys("400");
       		waitForThread(CommonClass.iWaitForThread1);

       		WebElementBtnSave.click();
       		waitForThread(CommonClass.iWaitForThread1);

       		
       		JavascriptExecutor js10 = ((JavascriptExecutor) CommonClass.driver);
   			js10.executeScript("arguments[0].scrollIntoView(true);", WebElementBtnNextbtn);
   			System.out.println("Scroll up Sucessfully and Next option visible");

       		waitForThread(CommonClass.iWaitForThread2);

   			WebElementBtnNextbtn.click();
   			waitForThread(CommonClass.iWaitForThread2);

   			WebElementBtnNextbtn.click();
   			waitForThread(CommonClass.iWaitForThread2);

   			WebElementBtnNextbtn.click();
   			waitForThread(CommonClass.iWaitForThread2);

   			WebElementBtnNextbtn.click();
   			
   			waitForThread(CommonClass.iWaitForThread2);

   			JavascriptExecutor js11 = ((JavascriptExecutor) CommonClass.driver);
   			js11.executeScript("arguments[0].scrollIntoView(true);", WebElementColapsebyname);
   			System.out.println("Scroll up Sucessfully and Name option visible");

   			//commonclass.moveWebElementColapsebyname
   			waitForThread(CommonClass.iWaitForThread2);


   		    List <WebElement> listings5 = CommonClass.driver.findElements(By.xpath("//table/thead/tr/th[1]"));
	        Random r5 = new Random();
	        int randomValue5 = r5.nextInt(listings5.size()); //Getting a random value
	        listings5.get(randomValue5).click();
	        
   			waitForThread(CommonClass.iWaitForThread2);
   			
   			JavascriptExecutor js12 = ((JavascriptExecutor) CommonClass.driver);
   			js12.executeScript("arguments[0].scrollIntoView(true);", WebElementPlusclick);
   			System.out.println("Scroll up Sucessfully and Plus option visible");
   			waitForThread(CommonClass.iWaitForThread2);

	        WebElementPlusclick.click();		
	
		waitForThread(CommonClass.iWaitForThread2);

	}  	  
	


	     private int getRandomNumberInBetween(int lowerBound, int upperBound) 
	      {
		    Random r = new Random();
	        return (r.nextInt(upperBound) + lowerBound);
	       }
		
	        
      }

       
      
        
        
        

        
       

