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
public class MyTestClass1 extends SeleniumAbstractTest{
	@Test
	public void myTestMethod1() {
//		System.out.println("myTestMethod1");
		Reporter.log("myTestMethod1", true);
	}

	@Test
	public void myTestMethod2() {
//		System.out.println("myTestMethod2");
		Reporter.log("myTestMethod2", true);
	}

}
