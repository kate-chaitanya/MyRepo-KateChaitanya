package com.hcl.assign2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This class is used to show how to encode and decode data in input file by
 * using secret key
 *
 */
public class EncyptDecryptFile {

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
		// read key from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		String key = sc.nextLine();
		// create input source file
		File inputfile = new File("sourcefile.txt");
		if (!inputfile.exists()) {
			inputfile.createNewFile();
			System.out.println("file created");
		}
		try {
			// writing data input into source file using bufferd writer
			FileWriter fw = new FileWriter(inputfile);
			BufferedWriter bf = new BufferedWriter(fw);
			bf.write("This is a simple text");
			bf.newLine();
			bf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// create a encode file
		File encryptfile = new File("encodefile.txt");
		if (!encryptfile.exists()) {
			{
				encryptfile.createNewFile();
				System.out.println("file created");
			}
		}

		// String inputfile="sourcefile.txt";
		String encode = "encodefile.txt";
		String line = null;
		try {
			// using printwriter write data into encrypt file
			PrintWriter pw = new PrintWriter(encryptfile);
			FileReader rf = new FileReader(inputfile);
			// reading data from input source file using buffered reader
			BufferedReader br = new BufferedReader(rf);
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				// read key from user
				System.out.println("Enter key value");
				String encodekey = sc.next();
				// checking input key and encode key equals or not
				if (key.equals(encodekey)) {
					String[] c = line.split(" ");
					StringBuffer sb;
					for (int i = 0; i < c.length; i++) {
						// reverse string by using string buffer
						sb = new StringBuffer(c[i]);
						sb = sb.reverse();
						String s = sb.toString();
						// printing string reverse
						System.out.print(s);

						if (i < c.length - 1)
							System.out.print("*");
						pw.print(s);// printing data into target file
						pw.print('*');// printing astrick in specified place

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
				// read key from user
				System.out.println("Enter key value");
				String decodekey = sc.next();
				// if key matches decode file
				if (key.equals(decodekey)) {
					System.out.println("decode file :" + line);
					FileInputStream FI = new FileInputStream(inputfile);
					FileOutputStream FO = new FileOutputStream(decryptfile);
					int b;
					// read content and write in another file
					while ((b = FI.read()) != -1) {
						FO.write(b);
					}

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
