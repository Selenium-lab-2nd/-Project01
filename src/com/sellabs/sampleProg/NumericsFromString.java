/**
 * 
 */
package com.sellabs.sampleProg;

/**
 * @author Manjit
 *
 */
public class NumericsFromString {

	public static void NumericsFromStringTest(String s) {

		int length = s.length(); // Checking the size of String

		char[] sarr = s.toCharArray(); 

		for (int i = 0; i < length; i++) {

			if (sarr[i] >= 48 && sarr[i] <= 57) { //Checking the ASCII value of numbers  

				System.out.print(sarr[i]);

			}
		}
	}

	public static void main(String[] args) {

		NumericsFromStringTest("this is your order number 123456");

	}

}
