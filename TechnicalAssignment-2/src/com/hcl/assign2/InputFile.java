package com.hcl.assign2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class is used to create a source file
 *
 */
public class InputFile {

	/**
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if (args.length == 0 || args[0].equals("-h") || args[0].equals("-help")) {
			System.out.println(
					"Usage and program Description\n\nThis program is used to read data from sourcefile and encode data into another file and decode into its original format by using a secret key");
		}
		// creating a source file
		File inputfile = new File("sourcefile.txt");
		// checking file is created or not if not create a new file
		if (!inputfile.exists()) {
			inputfile.createNewFile();
			System.out.println("file created");
		}
		try {

			// write data into file using bufferedWriter

			FileWriter fw = new FileWriter(inputfile);
			BufferedWriter bf = new BufferedWriter(fw);
			bf.write("This is a simple text");
			bf.newLine();

			// always close files
			bf.close();
			System.out.println("file created");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
