package projectDemo;

import java.io.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {

	public static void ReadAllData() throws IOException {
		// Path of the file
		File file = new File(".\\Excel\\Ss.xlsx");

		// To Read the Located file
		FileInputStream fis = new FileInputStream(file);

		// Going to the desired Woorkbook
		Workbook wb = new XSSFWorkbook(fis);

		// Going to the desired sheet
		Sheet sheetAt = wb.getSheetAt(0);

		// To get the Physical no.of rows
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
		// To get the Physical no.of cells
		int cellCount = row.getPhysicalNumberOfCells();
		
		for (int j = 0; j < cellCount; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				
				System.out.println(stringCellValue);
			}
			else if (cellType.equals(CellType.NUMERIC)){
				
				double numericCellValue = cell.getNumericCellValue();
				int data = (int) numericCellValue;
				System.out.println(data);
				
			}
			wb.close();
			}
		}
	}
	public static void main(String[] args) throws IOException {
		ReadAllData();
	}
}
