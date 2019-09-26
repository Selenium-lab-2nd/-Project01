/**
 * 
 */
package com.sellabs.testNG;

import org.testng.annotations.Test;

/**
 * @author Manjit
 *
 */
public class DataProviderTest {

	@Test(dataProvider = "DataSet", dataProviderClass = TestDP.class)
	public void add(String val1, String val2, String val3, String val4, String val5) {
		int a = Integer.parseInt(val2);
		int b = Integer.parseInt(val3);
		int c = Integer.parseInt(val4);
		int d = Integer.parseInt(val5);
		int reslt = a + b + c + d;
		System.out.println(reslt);
	}

}
