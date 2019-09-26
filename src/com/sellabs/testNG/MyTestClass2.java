/**
 * 
 */
package com.sellabs.testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author Manjit
 *
 */
public class MyTestClass2 extends SeleniumAbstractTest{
	@Test
	public void myTestMethod3() {
//		System.out.println("myTestMethod3");
		Reporter.log("myTestMethod3", true);
	}

	@Test
	public void myTestMethod4() {
//		System.out.println("myTestMethod4");
		Reporter.log("myTestMethod4", true);
	}

}
