/*
 * 21. How to find if a string is present in a text file?
 * 
 */
package com.misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckStringInTextFile {

	public boolean isStringPresentInFile(String txt, String fPath) throws FileNotFoundException {

		File f = new File(fPath);
		Scanner sc = new Scanner(f);
		if (f.canRead()) {

			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				if (s.matches(".*" + txt + ".*")) {
					sc.close();
					return true;
				}
				// alternative
//				if (s.contains(txt)) {
//					sc.close();
//					return true;
//				}
			}
		}
		sc.close();
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckStringInTextFile csit = new CheckStringInTextFile();
		try {
			System.out.println(csit.isStringPresentInFile("localhost", "errorFile.log"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
