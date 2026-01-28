package StepDefinitionFile;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtil {
		static Workbook workbook;
	    static Sheet sheet;
	 
	    public static int getRowCount(String filePath, String sheetName) throws IOException {
	        FileInputStream fis = new FileInputStream(filePath);
	        workbook = new XSSFWorkbook(fis);
	        sheet = workbook.getSheet(sheetName);
	        return sheet.getLastRowNum();
	    }
	 
	    public static String getCellData(String filePath, String sheetName, int rowNum, int colNum)
	            throws IOException {
	 
	        FileInputStream fis = new FileInputStream(filePath);
	        workbook = new XSSFWorkbook(fis);
	        sheet = workbook.getSheet(sheetName);
	 
	        Row row = sheet.getRow(rowNum);
	        Cell cell = row.getCell(colNum);
	 
	        return cell.toString();
	    }
	}
