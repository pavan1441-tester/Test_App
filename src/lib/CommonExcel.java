package lib;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.hpsf.Date;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CommonExcel
{

	
	
	public static Logger log = LogManager.getLogger(CommonExcel.class);

	public static Sheet sheet;
	public static int iCount;
	public static int colIndex;
	public static Workbook wb;
	public static Cell Cell;
   // public XSSFCell cell = null;


	
	
	//if(fis==null)
	//{
		//fis=new FileInputStream();
		
	//}
	
	/*@DataProvider(name = "getdata")
	public String[][] getTestData() {
		String[][] testRecords = getdata()throws Exception
		return testRecords;*/
		
	//}
	
	@DataProvider(name="getdata")
	private static Object[][] getData() throws Exception
	//private static void main(String[][] args) throws Exception {
	{
		Object [][] vedData = null;
	
		//fis=new FileInputStream();
		FileInputStream fis=null;
		//FileInputStream fis=new FileInputStream(CommonClass.DATA_PATH);
		try
		{
			log.debug("Opening file");

		
			 fis=new FileInputStream(CommonClass.DATA_PATH);
			 
			 
			// fis=new FileInputStream("E:\\selenium\\2021\\FIG_App\\data\\data.xls");
			 System.out.println("File path open");
			//Workbook wb= WorkbookFactory.create(fis);
			wb= WorkbookFactory.create(fis);
			 System.out.println("workbook fact");
			//Sheet sheet = wb.getSheet(CommonClass.SHEET);
			sheet = wb.getSheet(CommonClass.SHEET);
			System.out.println("geet sheet");
			//int iCount = CommonClass.TESTCASES;
			 iCount = CommonClass.TESTCASES;
			vedData = new Object[iCount][2];

			vedData = UCAppData.getData(sheet, iCount);
			    	
			System.out.println("ved data sheet and count taken");
			
			

		  

		    

		}
		catch(Exception ex)
		{
			log.error("Exception:" + ex.getMessage());
			log.error(BaseClass.getStackTrace(ex));
		}
		finally
		{
			if(fis != null)
			{
				try 
				{ 
					fis.close(); 
				}
				catch(Exception ex)
				{
					
				}
			}
		}
		return vedData;
	}
	
	public String getCellDataStringValue(int rowNum, int colNum)
	{
		Cell = sheet.getRow(rowNum).getCell(colNum);
		String cellData = Cell.getStringCellValue();
		log.info("Cell Data of String value is returned from the excel - " + cellData);
		return cellData;
	
	}//End of method
	
	
	public double getCellDataNumericValue(int rowNum, int colNum)
	{
		Cell = sheet.getRow(rowNum).getCell(colNum);
		double cellData = Cell.getNumericCellValue();
		log.info("Cell Data of Numeric value is returned from the excel - " + cellData);
		return cellData;
	}//End of method
	
	
	
	/*public String getCellData(String sheetName,int colNum,int rowNum, Row row, int iCell)
    {
		String sRetValue = "";

        try
        {
            //sheet = workbook.getSheet(sheetName);
            row = sheet.getRow(rowNum);
            Cell = row.getCell(colNum);
            if(Cell.getCellTypeEnum() == CellType.STRING)
                return Cell.getStringCellValue();
            else if(Cell.getCellTypeEnum() == CellType.NUMERIC || Cell.getCellTypeEnum() == CellType.FORMULA)
            {
                String cellValue  = String.valueOf(Cell.getNumericCellValue());
                //if (HSSFDateUtil.isCellDateFormatted(Cell))
                //{
                   // DateFormat df = new SimpleDateFormat("dd/MM/yy");
                  //  Date date = Cell.getDateCellValue();
                   // cellValue = df.format(date);
                }
                return cellValue;
            }
            else if(Cell.getCellTypeEnum() == CellType.BLANK)
                return "";
            else
                return String.valueOf(Cell.getBooleanCellValue());
        }*/
    
		

	public static String getExcelCellValue(Row row, int iCell)
	{
		
		
		
		String sRetValue = "";
		//int colIndex = 0;
		try
		{
						
		for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) 
			
				{
			
				  row = sheet.getRow(rowIndex);
				  //Cell=row.getCell(colIndex);

				
				  if (row != null) 
				  {
					//for (int colIndex = 0; colIndex <= sheet.getLastColNum(); colIndex++) 
				  
				    Cell cell = row.getCell(colIndex);
		           // for(int j=0;j<cellcount;j++){    
				  				    
				    if (cell != null) 
				    {
				      // Found column and there is value in the cell.
				    	sRetValue = cell.getStringCellValue();
				    	
						//sRetValue = row.getCell(iCell).getStringCellValue();

						//cellData

				    	//sRetValue = iCell.getStringCellValue();
				    	//sRetValue = row.getCell(iCell).getStringCellValue();
				    	//sRetValue = row.getCell(iCell).getStringCellValue().trim();

				    	
				      // Do something with the cellValueMaybeNull here ...
				      // break; ???
				    }
				    
				  }
		  
				}
    
		  //colIndex++;

		  
			    
		}
		
		catch(NullPointerException ex) 
		{
			
		}

	    return sRetValue;
	}
	
	}

