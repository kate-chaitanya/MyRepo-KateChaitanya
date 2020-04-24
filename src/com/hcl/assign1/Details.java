package com.hcl.assign1;

import java.util.Scanner;

/**
 * This class is used to illustrate the private variables,constructor and member
 * functions
 *
 */
public class Details { // main class
	static void employeeDetails() // static method
	{
		System.out.println("Employee Details ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				"Usage of the program \n The program is used for displaying employee details\n Need input valuesto display\ne.g. java Details 47656 F");
		employeeDetails(); // call static method
		Employee e = new Employee();// Creating object for Employee class
		e.display(); // call diaplay method
	}

}

class Employee // employee class
{
	// initializing private variables
	private int employeeRegdNo;
	private char employeeGender;

	// default constructor
	/**
	 * This is the default constructor
	 */
	public Employee() {

	}

	/**
	 * This is paramaterized constructor
	 * 
	 * @param employeeRegdNo
	 * @param employeeGender
	 */
	public Employee(int employeeRegdNo, char employeeGender) {
		super();
		this.employeeRegdNo = employeeRegdNo;
		this.employeeGender = employeeGender;
	}

	// display method
	/**
	 * This method is used to display all the details
	 */
	void display() {
		Scanner sc = new Scanner(System.in);// Scanner to read input from user
		System.out.println("Enter Employee Registration Id : ");
		employeeRegdNo = sc.nextInt();
		System.out.println("Enter Employee gender : ");
		employeeGender = sc.next().charAt(0);
		// printing output
		System.out.println("Employee Registration Id : " + employeeRegdNo);
		System.out.println("Employee Gender : " + employeeGender);
	}

}
