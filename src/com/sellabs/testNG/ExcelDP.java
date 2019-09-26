/**
 * 
 */
package com.sellabs.testNG;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * @author Manjit
 *
 */
public class ExcelDP {

	@Test(dataProvider="DataSet")
	public void add (String val1, String val2, String val3) {
		int a = Integer.parseInt(val1);
		int b = Integer.parseInt(val2);
		int c = Integer.parseInt(val3);		
		int reslt = a +b +c;
		System.out.println(reslt);
	}

	
	@DataProvider(name="DataSet")
	public Object [][] readExcel() throws IOException,Exception  {
		File f = new File("E:\\Selenium lab-Automation Testing\\TestBook1.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh = wb.getSheet(0);
		int rows = sh.getRows();
//		int rows = sh.getRows() - 1; //If headers are present use '-1'
		int colmns = sh.getColumns();
//		System.out.println(rows);
//		System.out.println(colmns);
		String[][] inptdata = new String[rows][colmns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colmns; j++) {
				Cell c = sh.getCell(j, i);
//				Cell c = sh.getCell(j, i+1); //If headers are present use 'i+1'
				inptdata[i][j] = c.getContents();
//				System.out.println(inptdata [i] [j]);

			}

		}
		return inptdata;

	}
}
