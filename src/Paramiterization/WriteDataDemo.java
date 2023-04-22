package Paramiterization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class WriteDataDemo {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Population");
		Object PopINFO [][]= { {"INDIA","PAK","AUSTRALIA","SHRILANKA"},
				{"MH","2000","FALL","5050"},
				{"NZ","EASTSIDE","20202","NAVY"},
				{"WESTSIDE","BARMUDA","89656","SIMP"},
				{"NZ","EASTSIDE","20202","NAVY"}
		};
		int rows = PopINFO.length;
		int col = PopINFO[0].length;
		System.out.println(rows);
		System.out.println(col);
		for(int r=0; r<rows; r++) 
		{
			XSSFRow row = sheet.createRow(r);
			for(int c=0; c<col; c++) 
			{
				XSSFCell cell = row.createCell(c);	
				Object value = PopINFO[r][c];
				if(value instanceof String) 
					cell.setCellValue((String)value);
				if(value instanceof Integer) 
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean) 
					cell.setCellValue((Boolean)value);
			}
		}
		String FilePath = ".\\datafile\\employeeDATA.xlsx";
		FileOutputStream outputstream = new FileOutputStream(FilePath);
		workbook.write(outputstream);
		outputstream.close();
		System.out.println("Your Sheet Write Sucessfully...");
	}

}
