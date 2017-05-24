package dataprovider;

import java.io.File;
import java.io.FileInputStream;


import org.openqa.selenium.WebDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Readexcel {
	WebDriver driver;
	Workbook wb;
	Sheet sheet;
	Cell cell;
	public Readexcel() throws Exception{
		File file= new File("E:\\workspace\\com.divinitiautomation\\Exceldata\\Credentials.xls");
		FileInputStream fin= new FileInputStream(file);
		wb=Workbook.getWorkbook(fin);
	}
	public String getcellvalue(int sheet_num, int row_num, int col_num){
		sheet=wb.getSheet(sheet_num);
		String data=sheet.getCell(row_num, col_num).getContents();
		return data;
	}
	public int getlastrownum(int sheet_num){
		int rows=wb.getSheet(sheet_num).getRows();
		return rows;
		}
   }
