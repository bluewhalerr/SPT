package projectDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void WriteData() throws IOException {

		// Provide the path of the file
		File file = new File("C:\\Users\\user\\Desktop\\Book2.xlsx");

		// To read the located file and the use the .get() method
		FileInputStream fis = new FileInputStream(file);

		// Going to the desired Workbook
		Workbook wb = new XSSFWorkbook(fis);
//
//		// Creating A Sheet
//		Sheet createSheet = wb.createSheet("User2");
//
//		// Create a Row
//		Row createRow = createSheet.createRow(0);
//
//		// Create a cell
//		Cell createCell = createRow.createCell(0);
//		createCell.setCellValue("S.No");
		
		//Single Line code the above Finleinputstream is used because to use getSheet().method
//		wb.createSheet("User3").createRow(0).createCell(0).setCellValue("S.no");
		wb.getSheet("User3").createRow(0).createCell(0).setCellValue("S.No");
		wb.getSheet("User3").createRow(0).createCell(1).setCellValue("Names");
		wb.getSheet("User3").createRow(1).createCell(0).setCellValue("1");
	
		
		//To write the content in the workbook
		FileOutputStream fos =  new FileOutputStream(file);
		
		wb.write(fos);
		
        // Close the resources
        fis.close();
        fos.close();
        wb.close();
	}

	public static void main(String[] args) throws IOException {
		WriteData();
//System.exit(0);
		System.out.println("Data written successfully.");
	}
}
