package com.hcl.assign1;

import java.util.Scanner;
import java.util.*;

/**
 * This Program is used to find the sum of squares of first n natural numbers
 * 
 * @author CHAITANYA
 *
 */
public class Numbers { // main class

	/**
	 * This method is used for calculating sum of squares of first n natural numbers
	 * 
	 */
	public static int squaresum(int n)// static method
	{

		return (n * (n + 1) / 2) * (2 * n + 1) / 3;// formula for sum of squares of first n natural numbers
	}

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		int n; // initialise input variable
		
		Scanner sc = new Scanner(System.in); // scanner statement for read input
		System.out.println("input : "); // printing input
		n = sc.nextInt();
		System.out.println("output : " + squaresum(n)); // printing output
	}

}
