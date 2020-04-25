package com.hcl.assign1;

/**
 * This class is created for checking the data type and size of input
 * 
 * @author CHAITANYA
 * @version 1.8
 */
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     if(args.length==0 || args[0].equals("-h") || args[0].equals("-help")){
		System.out.println(
				"Usage description of the program\n\nThe program is used for finding the datatype and size of the input\n Need a input value to detemine it \ne.g.  java Program 1 a Sss 4.563");
     }
		System.out.println("Output : ");// printing output
		for (int i = 0; i < args.length; i++)// for loop
		{

			try {
				int a = Integer.parseInt(args[i]);// checking integer
				System.out.println(a + " integer " + Integer.SIZE / 8);// size of integer
			} catch (Exception e1) {
				try {
					System.out.println(Float.parseFloat(args[i]) + " float/double " + Float.SIZE / 8);// checking
																										// float/double
																										// and size of
																										// float/double
				} catch (Exception e) {
					if (args[i].length() == 1) // if condition
					{
						System.out.println(args[i] + " char " + Character.SIZE / 8);// checking character and size of
																					// character
					} else {
						System.out.println(args[i] + " string " + args[i].length());// checking string and size of
																					// string
					}

				}
			}

		}
	}
}
