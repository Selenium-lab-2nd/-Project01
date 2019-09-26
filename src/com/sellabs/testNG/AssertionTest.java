/**
 * 
 */
package com.sellabs.testNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author Manjit
 *
 */
public class AssertionTest {
	
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
	public void softAssert(){
		SoftAssert sa= new SoftAssert();
		System.out.println("softAssert Method Started");
		sa.assertTrue(false);
		System.out.println("softAssert Method Executed");
		sa.assertAll();
	}
	
	@Test
	public void hardAssert(){
		System.out.println("hardAssert Method Started");
		Assert.assertTrue(false);
		System.out.println("hardAssert Method Executed");
	}

}
