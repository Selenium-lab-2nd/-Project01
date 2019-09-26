/**
 * 
 */
package com.sellabs.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Manjit
 *
 */
public class SampleTestTwo {
	
	@Parameters("input")
	@Test
	 public void ops(String val) {
		
		System.out.println("Entered value is: "+val);
	}
	

}
