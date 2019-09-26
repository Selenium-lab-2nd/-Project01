/**
 * 
 */
package com.sellabs.sampleProg;

/**
 * @author Manjit
 *
 */
public class OddEven {

	public static void oddOrEven() {
		
//		Syntax to check the odd numbers

		System.out.println("ODD NUMBERS: ");

		int i;
		
//		i is used for assigning the range of numbers

		for (i = 1; i <= 21; i++) {

			if (i % 2 != 0)

				System.out.print(i + " ");

		}

		System.out.println();
		
//		Syntax to check the even numbers

		System.out.println("EVEN NUMBERS: ");

		for (i = 1; i <= 21; i++) {

			if (i % 2 == 0)

				System.out.print(i + " ");

		}
	}

	public static void main(String args[]) {

		OddEven.oddOrEven();


	}
}
