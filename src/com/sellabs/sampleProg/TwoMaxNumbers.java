/**
 * 
 */
package com.sellabs.sampleProg;

/**
 * @author Manjit
 *
 */
public class TwoMaxNumbers {

	public void printTwoMaxNumbers(int[] nums) {
		int maxOne = 0;
		int maxTwo = 0;
		for (int n : nums) { //Assigning n as temporary variable 
			if (maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			} else if (maxTwo < n) {
				maxTwo = n;
			}
		}
		System.out.println("First Max Number: " + maxOne);
		System.out.println("Second Max Number: " + maxTwo);
	}
//Printing the value of two maximum numbers
	public static void main(String a[]) {
		int num[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
		TwoMaxNumbers tmn = new TwoMaxNumbers();
		tmn.printTwoMaxNumbers(num);
	}

}
