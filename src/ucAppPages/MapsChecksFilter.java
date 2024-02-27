package ucAppPages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.google.inject.Key;

import lib.UCAppData;
import lib.CommonClass;

public class MapsChecksFilter extends ComboAppBasePage
{

	public MapsChecksFilter()
	{
		super();
	}
	
	@FindBy(css=".fa-2x.fa-map-marker-minus.far.top-header-icons")
    private WebElement MapoptnClick;
	
	
	@FindBy(xpath="//span[@id='filter-control']/i")
    private WebElement FilteroptnClick;
	
	@FindBy(css=".select2.select2-container.select2-container--below.select2-container--bootstrap  span[role='combobox'] > .select2-selection__rendered  input[role='searchbox']")
	 private WebElement clientname;
	
	//@FindBy(xpath="//input[@class=’select2-search__field’ AND  @placeholder=’Name’]")
	@FindBy(xpath="//input[@placeholder='Name']")
	 private WebElement clientnamec;
	
	//@FindBy(xpath="//*[@id='select2-filters_items_location_client_name_v-results']/li")
	//@FindBy(xpath="//ul[@role='listbox']/li[@role='option']")
	@FindBy(xpath="//ul[@role='listbox']/li[2]")
	 private WebElement clientnamecSEL;
	
	
	@FindBy(xpath="//div[1]/input[@role='button']")
	 private WebElement RunfilterBtn;
	

	@FindBy(xpath="//div[3]/input[@role='button']")
	 private WebElement RunfilterClearBtn;
	
	//@FindBy(xpath="//form[@id='new_filters']/div[@class='form-inputs']/div[2]/div[2]/div[1]/div[@class='input-container']/div/div/div/span//span[@role='combobox']/ul[@class='select2-selection__rendered']//input[@role='searchbox']")
	 
	@FindBy(xpath="//*[@id='user-filter-group-1']/div[1]/div[2]/div/div/div/span/span[1]/span/ul/li/input")
	private WebElement ClientpromangName;
	
	@FindBy(xpath="//ul[@role='listbox']/li[1]")
	 private WebElement PrognamecSEL;
	
	
	@FindBy(xpath="//input[@placeholder='Billing Apt/Suite']")
	 private WebElement BillingAppsuite;
	
	
	@FindBy(xpath="//ul[@role='listbox']/li[2]")
	 private WebElement BillingAppsuiteSEL;
	
	
	@FindBy(xpath="//input[@placeholder='In Care of']")
	 private WebElement Incareof;
	
	
	@FindBy(xpath="//input[@placeholder='Billing Address']")
	 private WebElement BillingAdd;
	
	
	 @FindBy(xpath="//input[@placeholder='Billing State']")
	 private WebElement Billingstate;
	 
	 
	 @FindBy(xpath="//input[@placeholder='Billing City']")
	 private WebElement Billingcity;
	 
	 
	 @FindBy(xpath="//input[@placeholder='Billing Zip']")
	 private WebElement Billingzip;
	 
	 
	 @FindBy(xpath="//input[@placeholder='District']")
	 private WebElement Distdet;
	
	 
	 @FindBy(xpath="//input[@placeholder='Region']")
	 private WebElement Regiondet;
	
	 
	@FindBy(xpath="//input[@placeholder='Site Name']")
	 private WebElement Sitedet;
	
	
	@FindBy(xpath="//input[@placeholder='Site Open Time']")
	 private WebElement Siteopentime;
	
	
	@FindBy(xpath="//input[@placeholder='Trigger']")
	 private WebElement trigger;
	
	
	@FindBy(xpath="//input[@placeholder='Custom Site ID']")
	 private WebElement CustomSID;
	
	
	@FindBy(xpath="//input[@placeholder='Country']")
	 private WebElement country;
	

	
	@FindBy(xpath="//input[@placeholder='State']")
	 private WebElement state;
	

	
			@FindBy(xpath="//input[@placeholder='City']")
	 private WebElement city;
	

	
	@FindBy(xpath="//input[@placeholder='Zip']")
	 private WebElement zip;
	

	
	@FindBy(xpath="//input[@placeholder='Address']")
	 private WebElement address;
	
	

	
	public void fnMapsChecksFilter(int iTestCaseID, UCAppData testData) throws Exception
	{
		
		waitForThread(CommonClass.iWaitForThread2);
		MapoptnClick.click();
		waitForThread(CommonClass.iWaitForThread2);

		FilteroptnClick.click();
		waitForThread(CommonClass.iWaitForThread2);

		clientnamec.click();
		waitForThread(CommonClass.iWaitForThread2);

		//clientnamec.sendKeys("Ader test");
		//waitForThread(CommonClass.iWaitForThread2);

		clientnamecSEL.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		ClientpromangName.click();
		waitForThread(CommonClass.iWaitForThread2);

		PrognamecSEL.click();
		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		BillingAppsuite.click();
		waitForThread(CommonClass.iWaitForThread2);

		//BillingAppsuite.sendKeys("104");
		//waitForThread(CommonClass.iWaitForThread2);

		BillingAppsuiteSEL.click();
		waitForThread(CommonClass.iWaitForThread2);

		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		Incareof.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		//Incareof.sendKeys("BrightView Enterprise Solution");
		//waitForThread(CommonClass.iWaitForThread2);

		clientnamecSEL.click();		
		waitForThread(CommonClass.iWaitForThread2);
		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		
		BillingAdd.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		//BillingAdd.sendKeys("0442 Paicaví");
		
		//waitForThread(CommonClass.iWaitForThread2);

		clientnamecSEL.click();		
		waitForThread(CommonClass.iWaitForThread2);
		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		Billingstate.click();
		waitForThread(CommonClass.iWaitForThread2);

		//Billingstate.sendKeys("AL");
		//waitForThread(CommonClass.iWaitForThread2);

		PrognamecSEL.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		Billingcity.click();
		waitForThread(CommonClass.iWaitForThread2);

		
		//Billingcity.sendKeys("Albertson");
		//waitForThread(CommonClass.iWaitForThread2);
		
		PrognamecSEL.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		Billingzip.click();
		
		//Billingzip.sendKeys("02114");
		waitForThread(CommonClass.iWaitForThread2);
		
		PrognamecSEL.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		Distdet.click();

		waitForThread(CommonClass.iWaitForThread2);

		PrognamecSEL.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);
	
		
		Regiondet.click();
		
		waitForThread(CommonClass.iWaitForThread2);

		PrognamecSEL.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);
	
		Sitedet.click();
		waitForThread(CommonClass.iWaitForThread2);

		PrognamecSEL.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);
		
	    JavascriptExecutor js = ((JavascriptExecutor) CommonClass.driver);
		js.executeScript("arguments[0].scrollIntoView(true);", Siteopentime);
		System.out.println("Scroll Down Sucessfully and and Site open time clickable");
		waitForThread(CommonClass.iWaitForThread2);

		
		Siteopentime.click();
		waitForThread(CommonClass.iWaitForThread2);

		PrognamecSEL.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		
		trigger.click();
		waitForThread(CommonClass.iWaitForThread2);

		PrognamecSEL.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		
		CustomSID.click();
		waitForThread(CommonClass.iWaitForThread2);

		PrognamecSEL.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		country.click();
		waitForThread(CommonClass.iWaitForThread2);

		PrognamecSEL.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		state.click();
		waitForThread(CommonClass.iWaitForThread2);

		PrognamecSEL.click();
		waitForThread(CommonClass.iWaitForThread2);
		
		RunfilterBtn.click();
		waitForThread(CommonClass.iWaitForThread2);

		RunfilterClearBtn.click();
		waitForThread(CommonClass.iWaitForThread2);




	}
	
	
	
}
