/**
 * 
 */
package com.sellabs.testNG;

import org.testng.annotations.Test;

/**
 * @author Manjit
 *
 */
public class SampleTest {
	
	
	@Test(priority=1)
	public void D() {

		System.out.println("D");

	}

	@Test(priority=4)
	public void C() {

		System.out.println("C");

	}

	@Test(priority=3)
	public void A() {

		System.out.println("A");

	}

	@Test(priority=2)
	public void E() {

		System.out.println("E");

	}

}
