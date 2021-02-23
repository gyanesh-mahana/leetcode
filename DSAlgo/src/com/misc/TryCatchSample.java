package com.misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("errorFile.log");
		try {


			Scanner scan = new Scanner(f);
//			FileInputStream stream = new FileInputStream("/");

			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
			
		} catch (FileNotFoundException | IllegalAccessError e) {
			e.printStackTrace();
		} finally {
		}

	}

}
