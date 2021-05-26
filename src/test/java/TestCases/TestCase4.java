package TestCases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestCase4 {
	@Test
	public void s() {
		
		try {
			XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\ssa\\eclipse-workspace\\com.tiqri.automation\\Files\\new1.xlsx");
			XSSFSheet sheet =workbook.getSheet("Sheet1");
			String value = sheet.getRow(1).getCell(1).getStringCellValue();
			double value1 = sheet.getRow(1).getCell(2).getNumericCellValue();
			System.out.println(value);
			System.out.println(value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
