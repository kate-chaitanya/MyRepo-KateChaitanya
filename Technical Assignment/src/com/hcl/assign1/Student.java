package com.hcl.assign1;

import java.util.Scanner;

/**
 * This program is used to illustrate the different ways of intializing private
 * variables
 * 
 */
public class Student { // main class
	// declaring variables
	private String name;
	private int rollno;

	// default constructor

	public Student() {

	}

	// parameterized constructor
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
		System.out.println(name);
		System.out.println(rollno);
	}

	// display method
	/**
	 * This method is used to display the details of student
	 */
	void display() {
		Scanner sc = new Scanner(System.in);// reading input from keyboard
		System.out.println("Enter name : ");
		name = sc.next();
		System.out.println("Enter rollnumber : ");
		rollno = sc.nextInt();
	}

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		System.out.println(
				"Usage of the program \n The program is used for displaying the student name,rollnumber\n Need a input value to display \n e.g. java Student rani 5");
		Student s = new Student(); // creating object
		s.display();// calling display method
		// printing output
		System.out.println("Student name is : " + s.name);
		System.out.println("Student rollnumber is : " + s.rollno);
	}
}
