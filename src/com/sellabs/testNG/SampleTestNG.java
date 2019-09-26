/**
 * 
 */
package com.sellabs.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Manjit
 *
 */
public class SampleTestNG {
	
	@BeforeTest
	public void beforeTest() {

		System.out.println("Before Test");

	}
	@AfterTest
	public void afterTest() {

		System.out.println("After Test");

	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before Method");

	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("After Method");

	}
	@Test
	public void opsOne() {

		System.out.println("test-1");
	}

	@Test
	public void opsTwo() {

		System.out.println("Test-2");

	}
}
