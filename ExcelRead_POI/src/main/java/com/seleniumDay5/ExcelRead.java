package com.seleniumDay5;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class ExcelRead {

	public String ReadCellData(int vRow, int vColumn) throws IOException  
	{  
	String value=null;          //variable for storing the cell value  
	Workbook wb=null;           //initialize Workbook null
	
	//reading data from a file in the form of bytes  
	FileInputStream fis=new FileInputStream("./srcdata/data.xlsx");  
	//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
	wb=new XSSFWorkbook(fis);  
	Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
	Row row=sheet.getRow(vRow); //returns the logical row  
	Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
	value=cell.getStringCellValue();    //getting cell value  
	return value;               //returns the cell value  
	}  


	public String ReadCellData1(int vRow, int vColumn) throws IOException  
	{   
	String value1=null;          //variable for storing the cell value  
	Workbook wb1=null;           //initialize Workbook null  
	//reading data from a file in the form of bytes  
	FileInputStream fis=new FileInputStream("./Data1/SampleTestcase_Mpetzone1.xlsx");  
	//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
	wb1=new XSSFWorkbook(fis);  
	Sheet sheet=wb1.getSheetAt(1);   //getting the XSSFSheet object at given index  
	Row row=sheet.getRow(vRow); //returns the logical row  
	Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
	value1=cell.getStringCellValue();    //getting cell value  
	//cell.getNumericCellValue();
	//cell.getDateCellValue();
	return value1;               //returns the cell value  
	}
//	public static void main(String[] args) throws IOException {
//		ExcelRead obj=new ExcelRead();
//		String res=obj.ReadCellData(0,1);
//		System.out.println(res);
//	}
	public void Excelread11(WebDriver driver) {
		 this.driver=driver;
	 }
	WebDriver driver= new ChromeDriver();
//	
//	public void UploadFile()   {
//	    ((WebElement) driver.findElements(By.xpath("//*[@id='file1'])"))).sendKeys("./srcdata/Data1.docx");
//	
//	}
	
	
}