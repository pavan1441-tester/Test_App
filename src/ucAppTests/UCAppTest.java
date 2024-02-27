package ucAppTests;

import lib.BaseClass;
import lib.CommonExcel;
import ucAppPages.AddMaterialToWoPage;
import ucAppPages.AddMultipletripstoasingeWoPage;
import ucAppPages.AddNewSerivceandTaskPage;
import ucAppPages.AdvancedBulkSchedulerSitesPage;
import ucAppPages.BulkWOUploadPage;
import ucAppPages.ClientCreation;
import ucAppPages.ClientUploadPage;
import ucAppPages.CreateCrewCreationPage;
import ucAppPages.CreateNewItemPage;
import ucAppPages.CreateWOFromProposalPage;
import ucAppPages.DownloadWorkOrderReport;
import ucAppPages.DragandDroptheunscheduledtriptoUnassigned;
import ucAppPages.ExportManagerReportPage;
import ucAppPages.ExportSPReportPage;
import ucAppPages.ForgotPassword;
import ucAppPages.InventoryTrackerPage;
import ucAppPages.InvoiceCreationPage;
import ucAppPages.JoinCompanyPage;
import ucAppPages.LoginPage;
import ucAppPages.ManagedSitesActivateDeactivatePage;
import ucAppPages.ManualTripAdjustmentPage;
import ucAppPages.MapSitePin;
import ucAppPages.MapsChecksFilter;
import ucAppPages.MySitesActivateDeactivePage;
import ucAppPages.NewCompanyCreationPage;
import ucAppPages.NewMySiteCreation;
import ucAppPages.NewRoleCreationPage;
import ucAppPages.NewServiceRateBulkUploadPage;
import ucAppPages.NewSiteCreationBulkUploadPage;
import ucAppPages.NewTaskRateBulkUploadPage;
import ucAppPages.NewTradeCreationPage;
import ucAppPages.OldBulkSchedulerPage;
import ucAppPages.ProfileDetailsPage;
import ucAppPages.ProposalCreationPage;
import ucAppPages.PurchaseOrderCreationPage;
import ucAppPages.RegionDeleteRegion;
import ucAppPages.ReportSummaryExportPage;
import ucAppPages.ServicesDeleteNewAndExistingServicePage;
import ucAppPages.SiteActivateandDeactivatePage;
import ucAppPages.SiteCreationPage;
import ucAppPages.SiteReportExportPage;
import ucAppPages.SnowFallPage;
import ucAppPages.TaskDeleteAndRestorePage;
import ucAppPages.TeamMemberCreationPage;
import ucAppPages.TradesDeletes;
import ucAppPages.TradesmanCreationPage;
import ucAppPages.UploadExistingWoAttachmentPage;
import ucAppPages.UploadWOAttachmentToExistingTripPage;
import ucAppPages.UploadWoAttachmentPage;
import ucAppPages.VendorCreationPage;
import ucAppPages.WOCreationWithVendorSelection;
import ucAppPages.WOCreationthruMaps;
import ucAppPages.WOCreationthruMapsAddingSchedularforDefaultsites;
import ucAppPages.WOCreationthruMapsAddingSchedularforfilteredClientName;
import ucAppPages.WOCreationthruMapsCheckForCastRadarUI;
import ucAppPages.WORepairAndInspectionReports;
import ucAppPages.WoCreationpage;
import ucAppPages.WorkOrderTripcreationAllowvendortoproposeschedule;
import lib.UCAppData;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;




public class UCAppTest extends BaseClass
{
	public static Logger log = LogManager.getLogger(UCAppTest.class);
	
	@Test(dataProvider="getdata", dataProviderClass=CommonExcel.class)
	public void ulipKotakTest(final int iTestCaseID, UCAppData testData) throws Exception 
	{
		long tmStart = 0, tmEnd = 0;
		try 
		{ 
			tmStart = System.nanoTime();	
			
			log.info("@@@@@Start Test:" + iTestCaseID);
			log.debug("Test Data:" + testData);
			
					
			
			   LoginPage mPage = new LoginPage();
			   mPage.fnHomePage(iTestCaseID, testData);
			   
					
			 //  NewCompanyCreationPage NCmpcreationpage= new NewCompanyCreationPage();//1
			 //  NCmpcreationpage.fnCompanyCreation(iTestCaseID, testData);//done for BV

			//  JoinCompanyPage NJoinCmpnypage=new JoinCompanyPage();//2
			//  NJoinCmpnypage.fnJoinCompany(iTestCaseID, testData);

			
			 // NewRoleCreationPage Newrolecreatpage= new NewRoleCreationPage();//3
			  // Newrolecreatpage.fnNewRoleCreation(iTestCaseID, testData);
			   //Newrolecreatpage.fnNewRoleEdition(iTestCaseID, testData);
				//Newrolecreatpage.fnRoleDeletion(iTestCaseID, testData);

			   
		   //TeamMemberCreationPage TeMemcreationPage=new TeamMemberCreationPage();//4
		 //  TeMemcreationPage.fnTeamMemberEdition(iTestCaseID, testData);
			 //  TeMemcreationPage.fnTeamMemberUploadthruexcel(iTestCaseID, testData);
			   

			 //  ProfileDetailsPage profdetlpage = new ProfileDetailsPage();//5
			//  profdetlpage.fnProfileDetails(iTestCaseID, testData);

			  
				//ClientCreation CCreationPage = new ClientCreation();//6
			//	CCreationPage.fnClientCreation(iTestCaseID, testData);

			
				//ClientUploadPage ClientUpload= new ClientUploadPage();//7
				//ClientUpload.fnClientUpload(iTestCaseID, testData);//Pavan

		
				//SiteCreationPage SiteCreation= new SiteCreationPage();//8
				//SiteCreation.fnSiteCreation(iTestCaseID, testData);//issue

			
	          //  NewSiteCreationBulkUploadPage newsitecreationbulkupload = new NewSiteCreationBulkUploadPage();//9
	           // newsitecreationbulkupload.fnNewSiteCreationBulkUpload(iTestCaseID, testData);//issue

			
			 //  NewMySiteCreation NewMySiteCreationPage= new NewMySiteCreation();//10
			//  NewMySiteCreationPage.fnNewMySiteCreation(iTestCaseID, testData);//pavan

			
			//   MySitesActivateDeactivePage MySitesActivateDeactivePage = new MySitesActivateDeactivePage();//11
			  // MySitesActivateDeactivePage.fnMySitesActivateDeactive(iTestCaseID, testData);//pavan
		   

			 // ManagedSitesActivateDeactivatePage ManagedSitesActivateDeactivatePage = new ManagedSitesActivateDeactivatePage();//12
			 // ManagedSitesActivateDeactivatePage.fnManagedSitesActivateDeactivate(iTestCaseID, testData);//pavan
			  

			  // VendorCreationPage vcpage = new VendorCreationPage();//13
			  // vcpage.fnVendorCreation(iTestCaseID, testData);
			  // vcpage.fnExistingVendor(iTestCaseID, testData);
			   //vcpage.fnVendormenuOprations(iTestCaseID, testData);

			
			//  TradesmanCreationPage TradesmanCratPage=new TradesmanCreationPage();//14
			 // TradesmanCratPage.fnTradesmanCreation(iTestCaseID, testData);

			   
			 // CreateCrewCreationPage Crewcreationpage= new CreateCrewCreationPage();//15
			  // Crewcreationpage.fnCrewCreation(iTestCaseID, testData);
			  // Crewcreationpage.fnCrewDeletion(iTestCaseID, testData);

			   

			  // CreateNewItemPage CreateNewItem= new CreateNewItemPage();//16
			//  CreateNewItem.fnCreateNewItemType(iTestCaseID, testData);
			 // CreateNewItem.fnCreateNewItemName(iTestCaseID, testData);//pavan
			   

			  // NewTradeCreationPage Tradecreationpage= new NewTradeCreationPage();//17
			  // Tradecreationpage.fnTradesCreation(iTestCaseID, testData);//proper work
			 // Tradecreationpage.fnTradesDeletion(iTestCaseID, testData);//For New Trade Entry Deletion Method
				//Tradecreationpage.fnExistingTradesDeletion(iTestCaseID, testData);//For Existing Trade Entry Deletion Method
				   
			   

			//   AddNewSerivceandTaskPage NewServiceandTask= new AddNewSerivceandTaskPage();//18
			 // NewServiceandTask.fnServiceCreation(iTestCaseID, testData);//Proper work

			  
			  // NewServiceRateBulkUploadPage newserviceratebulkuplod = new NewServiceRateBulkUploadPage();//19
			 // newserviceratebulkuplod.fnNewServiceRateBulkUpload(iTestCaseID, testData);//pavan

				
			//	NewTaskRateBulkUploadPage newratebulkupload = new NewTaskRateBulkUploadPage();//20
			//	newratebulkupload.fnNewTaskRateBulkUpload(iTestCaseID, testData);//pavan
				
					   
				
				//ServicesDeleteNewAndExistingServicePage  sernewandexistingdel = new ServicesDeleteNewAndExistingServicePage();//22
				//sernewandexistingdel.fnServicesDeleteNewAndExistingServicePage(iTestCaseID, testData);
				//sernewandexistingdel.fnServicesAddTasktoServicePage(iTestCaseID, testData);//pending 

				

				//TaskDeleteAndRestorePage Taskdelrestore= new TaskDeleteAndRestorePage();//23
				//Taskdelrestore.fnTaskDeleteAndRestore(iTestCaseID, testData);//For Deletion and then Restore Task Method//pending
				

				//RegionDeleteRegion Regiondeletn =new RegionDeleteRegion();//24 
				//Regiondeletn.fnDeleteRegion(iTestCaseID, testData);//For New Region Entry Deletion Method
				//Regiondeletn.fnExistingDeleteRegion(iTestCaseID, testData);//For Existing Region Entry Deletion Method//pending

				
				//InventoryTrackerPage NInventrycreationpage= new InventoryTrackerPage();//25
				//NInventrycreationpage.fnInventoryTrackerCreation(iTestCaseID, testData);
				//NInventrycreationpage.fnTransferFromanothermaterial(iTestCaseID, testData);//issue
				//NInventrycreationpage.fnAddingMaterialtoWO(iTestCaseID, testData);
				

				//WoCreationpage wordPage = new WoCreationpage();//26
				//wordPage.fnworkordcreation(iTestCaseID, testData);//done

					
		        // WOCreationWithVendorSelection wocreatnwithvendorselctn= new WOCreationWithVendorSelection();//27
				//wocreatnwithvendorselctn.fnWOCreationWithVendorSelection(iTestCaseID, testData);	

				
				//BulkWOUploadPage buploadwofile = new BulkWOUploadPage();//28
				//buploadwofile.fnBulkUploadWOReportFile(iTestCaseID, testData);//done

				
				//AddMultipletripstoasingeWoPage addmutipletripsinglewo= new AddMultipletripstoasingeWoPage();//29
			   // addmutipletripsinglewo.fnAddMultipletripstoasingeWoPage(iTestCaseID, testData);//pavan

				
			    // UploadWoAttachmentPage UploadWoAttachment= new UploadWoAttachmentPage();//30
				// UploadWoAttachment.fnUploadWoAttachment(iTestCaseID, testData);
					

				//UploadWOAttachmentToExistingTripPage UploadWOAttachmentToExistingTrip= new UploadWOAttachmentToExistingTripPage();//31
				//UploadWOAttachmentToExistingTrip.fnUploadWOAttachmentToExistingTrip(iTestCaseID, testData);//pavan	

				   

				//WORepairAndInspectionReports worepairinsepReport = new WORepairAndInspectionReports();//32
				//worepairinsepReport.fnWORepairAndInspectionReports(iTestCaseID, testData);

					
				//ManualTripAdjustmentPage ManualTripAdjustment= new ManualTripAdjustmentPage();//33
				//ManualTripAdjustment.fnManualTripAdjustment(iTestCaseID, testData);//pavan  //pending

				   
				//DownloadWorkOrderReport downloadwokoderReport = new DownloadWorkOrderReport();//34
				//downloadwokoderReport.fnDownloadWorkOrderReport(iTestCaseID, testData);
					

				//AddMaterialToWoPage AddMaterialToWo= new AddMaterialToWoPage();//35
				//AddMaterialToWo.fnAddMaterialToWo(iTestCaseID, testData);//pavan

					 
			   // MapSitePin mapsitep = new MapSitePin();//36
				//mapsitep.fnMapSitePin(iTestCaseID, testData);//pending

			

				//MapsChecksFilter mapchkfilter=new MapsChecksFilter();//37
				//mapchkfilter.fnMapsChecksFilter(iTestCaseID, testData);

				

				//WOCreationthruMaps wordcratntmap=new WOCreationthruMaps();//38
				//wordcratntmap.fnWOCreationthruMaps(iTestCaseID, testData);//pending

			

			//	WOCreationthruMapsAddingSchedularforDefaultsites wordcratntmapdefualtsite =new WOCreationthruMapsAddingSchedularforDefaultsites();//39
				//wordcratntmapdefualtsite.fnWOCreationthruMapsAddingSchedularforDefaultsites(iTestCaseID, testData);

			
				//WOCreationthruMapsAddingSchedularforfilteredClientName wordcratntmapfiltercientname =new WOCreationthruMapsAddingSchedularforfilteredClientName();//40
				//wordcratntmapfiltercientname.fnWOCreationthruMapsAddingSchedularforfiltClientName(iTestCaseID, testData);

					 
				//WOCreationthruMapsCheckForCastRadarUI  checkForCastRadarUI= new WOCreationthruMapsCheckForCastRadarUI();//41
				//checkForCastRadarUI.fnWOCreationthruMapsCheckForCastRadarUI(iTestCaseID, testData);

			
			  //  OldBulkSchedulerPage oldbulkschdule = new OldBulkSchedulerPage();//42
				//oldbulkschdule.fnOldBulkScheduler(iTestCaseID, testData);//Pavan

					
				//AdvancedBulkSchedulerSitesPage addvancebulkschdule = new AdvancedBulkSchedulerSitesPage();//43
				//addvancebulkschdule.fnAdvancedBulkSchedulerSites(iTestCaseID, testData);//Pavan

					
				//ProposalCreationPage Pcreationpage=new ProposalCreationPage();//44
				//Pcreationpage.fnProposalCreation(iTestCaseID, testData);

						
				//CreateWOFromProposalPage CreateWOFromProposal= new CreateWOFromProposalPage();//45
				//CreateWOFromProposal.fnCreateWOFromProposal(iTestCaseID, testData);

				
				//PurchaseOrderCreationPage PurOrdcreationpage= new PurchaseOrderCreationPage();//46
				//PurOrdcreationpage.fnPurchaseOrderCreation(iTestCaseID, testData);

				
				//InvoiceCreationPage Invcpage= new InvoiceCreationPage();//47
				//Invcpage.fnInvoiceCreation(iTestCaseID, testData);

				
			    //ExportManagerReportPage ExportManagerReport= new ExportManagerReportPage();//48
			   // ExportManagerReport.fnExportManagerReport(iTestCaseID, testData);

				
				//ExportSPReportPage ExportSPReport= new ExportSPReportPage();//49
				//ExportSPReport.fnExportSPReport(iTestCaseID, testData);

					
			    //ReportSummaryExportPage ExportReport = new ReportSummaryExportPage();//50
				//ExportReport.fnExportManagerReport(iTestCaseID, testData);
				//ExportReport.fnExportSPReport(iTestCaseID, testData);//pavan
				
				//SiteReportExportPage SiteReportExport= new SiteReportExportPage();//51
				//SiteReportExport.fnSimpleSiteReportExport(iTestCaseID, testData);
				//SiteReportExport.fnCustomSiteReportExport(iTestCaseID, testData);//Pavan
				
			//	ForgotPassword forgetpasswrd= new ForgotPassword();//52
			//	forgetpasswrd.fnForgotPassword(iTestCaseID, testData);
				
				
				//UploadExistingWoAttachmentPage UploadWoAttachmentn= new UploadExistingWoAttachmentPage();
				//UploadWoAttachmentn.fnUploadWoAttachment1(iTestCaseID, testData);//pavan*/
				
				//Extra page
				
			//	SnowFallPage snowfalpage = new SnowFallPage();
			//	snowfalpage.fnSnowFallPage(iTestCaseID, testData);
			   
			   
			   WorkOrderTripcreationAllowvendortoproposeschedule wotripcretiontoscedule = new WorkOrderTripcreationAllowvendortoproposeschedule();
			   wotripcretiontoscedule.fnWoTripCvendortoPseschduleCreation(iTestCaseID, testData);	   
					
			 	
			log.info("@@@@@End Test:" + iTestCaseID);
			
		}
		// Catch exceptions on the complete test 
		catch (Exception ex) 
		{
			log.error("------************************************------");
			log.error("@@@@@Failed Test:" + iTestCaseID);
			log.error(getStackTrace(ex));
			log.error("------********Data Start******************------");
			log.error("Test Data:" + testData);
			log.error("------********Data End********************------");

			vTakeImage("Error.TCID-"+iTestCaseID);
			
			
			throw ex;
		}
		finally
		{
			tmEnd= System.nanoTime();
			log.debug("Total Time for Execution : " + ((tmEnd-tmStart)/(1000*1000)) + " msecs");
		}
	}
}
