/**
 * 
 */
package com.sellabs.sampleProg;

/**
 * @author Manjit
 *
 */
public class CheckPallindrome {

	public static void pallindrome() {
		String a = "maadm";
		int j = a.length() - 1;
		for (int i = 0; i < a.length() / 2; i++) {// Conditions to check the index of characters 
			if (a.charAt(i) != a.charAt(j)) {// Conditions to compare the characters at given index
				System.out.println("NOT PALINDROME!");
				break;
			}
			j--;
		}

	}

	public static void main(String[] args) {

		CheckPallindrome.pallindrome();
	}
}
