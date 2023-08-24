package projectDemo;
import java.io.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadSingleData {

	public static void ReadSingleData() throws IOException {
		
		File file = new File (".\\Excel\\Ss.xlsx");
		
		//To read the data from the excel file
		FileInputStream fis = new FileInputStream(file);
		
		//To interact with the workbook
		Workbook wb = new XSSFWorkbook(fis);
		
		//To interact with the Sheet
		Sheet sheetAt = wb.getSheetAt(0);
		
		//To Interact from the Row
		Row row = sheetAt.getRow(0);
		
		Cell cell = row.getCell(0);
		
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
	public static void main(String[] args) throws IOException {
		ReadSingleData();
	}
}
