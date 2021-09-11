package java_classes;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {

		Workbook workbook = new XSSFWorkbook("C:\\Users\\Varsha\\Desktop\\Book2.xlsx");

		Sheet sheet = workbook.getSheetAt(0);

		int rowCount = sheet.getLastRowNum();

		for (int i = 0; i <= rowCount; i++) {

			int cellCount = sheet.getRow(i).getLastCellNum();

			for (int j = 0; j < cellCount; j++) {

				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}

		}

	}

	
	public void getData(String TestcaseName, String ColumnName)//TC06, Salary
	{
		
	}
}
