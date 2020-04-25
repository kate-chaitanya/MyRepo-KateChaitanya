package com.hcl.assign1;

/**
 * This class illustrates the difference between access specifiers
 
 *
 */
/**
 *
 */
public class Addition { // main class
	private int a, b; // intialise valriables in private access
	protected int c, d;// initialise variables in protected access
	public int i, j; // initialise variables in public access

	/**
	 * This protected method is used within package and subclass in other package
	 */
	protected int addTwoNumbers(int c, int d)// protected method arguments
	{
		return c + d; // return result of two add numbers
	}

	/**
	 * This private method is used within class only
	 */
	public int addTwoNumbers1(int i, int j) // public method arguments
	{
		return i + j; // return result of two add numbers
	}

	/**
	 * This public is used in anywhere
	 */
	private int addTwoNumbers2(int a, int b) // private method arguments
	{
		return a + b; // return result of two add numbers
	}

	
	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		System.out.println("Usage of the program\n The program is used to illustrate the access specifiers");
		Addition obj = new Addition(); // Creating object for class
		System.out.println(obj.addTwoNumbers(2, 87));// calling private method by using object
	}

}
