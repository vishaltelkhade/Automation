package Paramiterization;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.*;

public class FetchAllData {

	public static void main(String[] args) throws IOException{

		String FilePath = "C:\\Users\\vtelk\\OneDrive\\Desktop\\XlSheeet\\NEW.xlsx";
		FileInputStream inputStream = new FileInputStream(FilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheetAt(2);
		int rows = sheet.getLastRowNum();
		int col = sheet.getRow(1).getLastCellNum();
		System.out.println(rows);
		System.out.println(col);
		for(int r=0; r<=rows; r++ )
		{
			XSSFRow row = sheet.getRow(r);	
			for(int c=0; c<col; c++) 
			{
				XSSFCell cell = row.getCell(c);  
				switch (cell.getCellType()) 
				{
				case STRING : System.out.print(cell.getStringCellValue());break;
				case NUMERIC : System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN : System.out.print(cell.getBooleanCellValue());break; 
				}
				System.out.print(" || ");
			}
			System.out.println(); 
		}
	}
}




