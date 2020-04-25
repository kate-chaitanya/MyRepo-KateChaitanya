package com.hcl.assign1;

import java.util.Scanner;

/**
 * This program defines the usage of variable scope
 * 
 * @author CHAITANYA
 *
 */

public class Volume { // main class
	static int width = 5; // static width(class level scope)

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		int length; // method level variable scope
		Scanner sc = new Scanner(System.in); // scanner statement
		System.out.println("Enter length : ");// printng input length
		length = sc.nextInt();
		System.out.println("Enter n value");// read n value from user
		int n = sc.nextInt();
		System.out.println("Volume of Cuboid of different breadth values");

		for (int breadth = 5; breadth <= n; breadth++)// for loop scope
		{

			int volume = length * breadth * width; // calculate volume
			System.out.println("Volume of Cuboid : " + volume + " where breadth is " + breadth);// printing volume for
																								// given breadth
		}

	}

}