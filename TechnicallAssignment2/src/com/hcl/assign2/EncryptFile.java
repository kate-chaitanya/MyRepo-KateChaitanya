package com.hcl.assign2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * This class is used to encode data in source file and save into a encode file
 * and decode the encoded data into its original format
 *
 */

public class EncryptFile {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// create a encode file
		File encryptfile = new File("encodefile.txt");
		if (!encryptfile.exists()) {
			{
				encryptfile.createNewFile();
				System.out.println("file created");
			}
		}
		// initialise data in source file as string
		String inputfile = "sourcefile.txt";
		String encode = "encodefile.txt";
		String line = null;
		try {
			// read key from user
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the key");
			String key = sc.nextLine();
			// using printwriter to write data into encode file
			PrintWriter pw = new PrintWriter(encryptfile);
			// read data from source file using file reader
			FileReader rf = new FileReader(inputfile);
			BufferedReader br = new BufferedReader(rf);
			while ((line = br.readLine()) != null) {
				// print data
				System.out.println(line);
				System.out.println("Enter the key");
				String key1 = sc.nextLine();
				// if given key equals to sourcekey encode file
				if (key.equals(key1)) {
					String[] c = line.split(" ");
					StringBuffer sb;
					for (int i = 0; i < c.length; i++) {
						// reverse string by using string buffer
						sb = new StringBuffer(c[i]);
						sb = sb.reverse();
						String s = sb.toString();

						System.out.print(s);
						if (i < c.length - 1)
							System.out.print("*");// print astrik in specified place
						pw.print(s); // printing data into target file
						pw.print('*');

					}
					pw.close();
				} else {
					System.out.println("key doesnot exists");
				}
				// create decode file
				File decryptfile = new File("decodefile.txt");
				if (!decryptfile.exists()) {
					{
						decryptfile.createNewFile();
						System.out.println("file created");
					}
				}

				System.out.println("Enter key value");
				String keyvalue = sc.next();
				// if key matches decode file
				if (key.equals(keyvalue)) {
					System.out.println("decode file :" + line);
					FileInputStream FI = new FileInputStream(inputfile);
					FileOutputStream FO = new FileOutputStream(decryptfile);
					int b;
					// read content and write in another file
					while ((b = FI.read()) != -1) {
						FO.write(b);
					}
					// System.out.println("\nFile Copied...");
				}

				else {
					System.out.println("key doesnot exists");
				}

			}

			// Always close files.
			br.close();

		} catch (IOException e) {
			System.out.println("error in file opening");
		}
	}

}
