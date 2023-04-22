package Paramiterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
                // TO FETCH NUMERIC DATA FROM XL SHEET
public class NumericDataFetch {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\vtelk\\OneDrive\\Desktop\\XlSheeet\\Book1.xlsx";
		FileInputStream store = new FileInputStream(path);
	    double data = WorkbookFactory.create(store).getSheet("Sheet1").getRow(2).getCell(3).getNumericCellValue();
	    System.out.println(data);

	}

}
