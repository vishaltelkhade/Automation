package Paramiterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrtmFetchXL {

	public static void main(String[] args) throws IOException, InterruptedException  {
		String path ="C:\\Users\\vtelk\\OneDrive\\Desktop\\XlSheeet\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		//Thread.sleep(4000);
//		String Data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(Data);
		String Data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(Data);
	}

}
