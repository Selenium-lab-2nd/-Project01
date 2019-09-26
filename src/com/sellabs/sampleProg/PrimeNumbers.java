/**
 * 
 */
package com.sellabs.sampleProg;

/**
 * @author Manjit
 *
 */
public class PrimeNumbers {

	public static void detectPrimeNumbers() {
//		i is used for checking the modulus 
		int i;
		System.out.println("Prime Numbers From 1 to 33 Are : ");

//		num is used for assigning the range of numbers
		
		for (int num = 1; num <= 33; num++) {
			
//			Syntax to check the prime numbers
			
			for (i = 2; num % i != 0; i++)
				;

			if (i == num) {
				System.out.print(" " + num);
			}
		}
	}

	public static void main(String[] args) {

		PrimeNumbers.detectPrimeNumbers();
	}
}