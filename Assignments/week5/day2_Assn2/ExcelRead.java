package week5.day2_Assn2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public String[][] readExcel(String fileName) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/" + fileName + ".xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		short cellCount = ws.getRow(1).getLastCellNum();

		String[][] data = new String[rowCount][cellCount];

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				String values = ws.getRow(i).getCell(j).getStringCellValue();
				data[i - 1][j] = values;

			}

		}
		wb.close();
		return data;
	}

}
