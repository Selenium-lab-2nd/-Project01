/**
 * 
 */
package com.sellabs.sampleProg;

/**
 * @author Manjit
 *
 */
public class ThreeDimensionalArray {

	public static void threeDimen() {
		// Array of size 3x3 to hold integers.
		int[][] values = { { 1, 2, 3 }, { 2, 4, 6 }, { 7, 9, 11 } };
		{
			// Nested loops to print the array in tabular form.
			for (int row = 0; row < 3; row++) {
				for (int col = 0; col < 3; col++) {
					System.out.print(values[row][col] + " ");
				}

				System.out.println(); // Print new line.
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("The multidimentional Array is: ");
		ThreeDimensionalArray.threeDimen();
	}
}
