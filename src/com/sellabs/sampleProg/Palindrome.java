/**
 * 
 */
package com.sellabs.sampleProg;

/**
 * @author Manjit
 *
 */
public class Palindrome {

	static void checkpalin(String str){ // s is used for string variable and n is used for length of the string
	    int strLength = str.length();
		int odd=0;
	    for(int i=0;i<strLength;i++){
	      int cnt=0;
	      for(int j=0;j<strLength;j++){
	        if(str.charAt(i)==str.charAt(j)) // Condition to compare the index no.of the characters
	        cnt++;
	      }
	      if(cnt%2!=0)
	      odd++;
	    }
	    if(odd<=1) // Condition to check the index no of the character
	    System.out.println("Palindrome is Possible");
	    else
	    System.out.println("Palindrome is not Possible");
	  }
	
	public static void main(String[] args) {

Palindrome.checkpalin("maadm");
	}

}
