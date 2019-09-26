/**
 * 
 */
package com.sellabs.testNG;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * @author Manjit
 *
 */
public class TestDP {

	@DataProvider(name = "DataSet")
	public static Object[][] readExcel() throws IOException, Exception {
		File f = new File("E:\\Selenium lab-Automation Testing\\DataSheet-1.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh = wb.getSheet(0);
		int rows = sh.getRows();
		int colmns = sh.getColumns();
		String[][] inptdata = new String[rows][colmns];
		for (int i = 0; i < rows; i++) {
			for (int j = 1; j < colmns; j++) {
				Cell c = sh.getCell(j, i);
				inptdata[i][j] = c.getContents();

			}

		}
		return inptdata;

	}

}
