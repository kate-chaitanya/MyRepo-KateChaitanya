package com.assign1;

import com.hcl.assign1.*;

/**
 * This class extends the main class
 *
 */
class Test extends Addition { // inheriting main class

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		Test obj = new Test(); // Creating object for Test class
		Addition add = new Addition(); // Creating object for Addition class
		System.out.println(obj.addTwoNumbers(10, 12)); // printing output by using object
		System.out.println(add.addTwoNumbers1(100, 1)); // printing output by using object

	}

}
