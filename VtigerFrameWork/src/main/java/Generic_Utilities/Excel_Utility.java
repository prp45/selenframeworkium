package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	/**
	 * this method is use to fetch data from excel
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Throwable
	 */

public String getExcelData(String sheetName,int rowNum,int cellNum) throws Throwable
{
	
	FileInputStream fes=new FileInputStream("./src/test/resources/ExcelFeb.xlsx");
	Workbook book=WorkbookFactory.create(fes);
	Sheet sheet = book.getSheet("sheetName");
	Row row = sheet.getRow(rowNum);
	Cell cell =row .getCell(cellNum);
	String Value = cell.getStringCellValue();
	return Value;
	//DataFormatter format=new DataFormatter();
//String data = format.formatCellValue(book.getSheet(sheetName).getRow(rowNum).getCell(cellNum));
//return data;
	public String getExcelUsingDataFormatter

	 
	
}
	
}

