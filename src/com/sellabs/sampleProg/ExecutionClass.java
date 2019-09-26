/**
 * 
 */
package com.sellabs.sampleProg;

/**
 * @author Manjit
 *
 */
public class ExecutionClass {

	/**
	 * 
	 */
	public ExecutionClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("using external classs AND class members inside client");
		PrimeNumbers n1 = new PrimeNumbers();
		n1.detectPrimeNumbers();
	}
}
