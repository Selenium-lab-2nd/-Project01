/**
 * 
 */
package com.sellabs.sampleProg;

/**
 * @author Manjit
 *
 */
public class Triangle {

	public static void starTriangle() {

		int i, j, k;
//		i is used for no. of rows

		for (i = 1; i <= 5; i++) {

//		j is used for no. of spaces

			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
//      k is used for no. of *

			for (k = 1; k <= i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		
	}

	public static void main(String[] args) {

		Triangle.starTriangle();
	}
}
