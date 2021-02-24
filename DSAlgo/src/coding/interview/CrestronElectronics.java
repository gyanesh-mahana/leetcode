/*
 * CrestronElectronics Class involves two methods as a part of 
 * solutions to the String manipulation problems:
 * 
 * 1. getResultProblem1(String) and 
 * 2. getResultProblem2(String)
 * 
 */

package coding.interview;

import java.io.IOException;

public class CrestronElectronics {

	/*
	 * @input = "AAABBCCCABC"
	 * 
	 * @output = "A3B2C3A1B1C1"
	 */
	public static String getResultProblem1(String str) throws Throwable {

		int countChar = 1; // counter to count continuous characters
		char currCh = (char) 0;
		char nextCh = (char) 0;

		// Checking for boundary conditions
		// input string should not be null or empty
		if (null == str || str.isEmpty()) {
			throw new IOException("Input cannot be Empty or Null");
		} else if (str.length() == 1) { // check if string contains only a single character
			return str + 1;
		}

		int len = str.length();
		StringBuilder sb = new StringBuilder(); // StringBuilder object to store the result

		for (int i = 1; i < len; i++) {
			currCh = str.charAt(i - 1);
			nextCh = str.charAt(i);
			if (currCh == nextCh) { // check for the continuous character and count their occurrence(frequency)
				countChar++;
			} else {
				// add the partial result once the continuity of character breaks
				sb.append(currCh);
				sb.append(countChar);
				// reset the counter for next character occurrence
				countChar = 1;
			}

		}
		// add the final character and its count occurrence(frequency)
		sb.append(nextCh);
		sb.append(countChar);

		// return the result as string
		return sb.toString();
	}

	/*
	 * @input: "1.080.0007" in the form of "x.yyy.zzzz" i.e., first part must
	 * contain 1 digit second part must contain 3 digits third part must contain 4
	 * digits
	 * 
	 * @output: "1.080.0008" i.e., the last part of the number should increase by 1
	 * In case last part is 9999 return the same string
	 * 
	 */
	public static String getResultProblem2(String str) throws Throwable {

		// Checking for boundary conditions
		// input string should not be null or empty
		if (null == str || str.isEmpty()) {
			throw new IOException("Input cannot be Empty or Null");
		}

		// splitting the string with respect to '.' character
		// this will return the String[] with three substrings
		String sub[] = str.split("[.]");

		// check for the valid pattern of the input string
		if ((sub[0].length() != 1) || (sub[1].length() != 3) || (sub[2].length() != 4)) {
			throw new IOException("Input Pattern must be: x.yyy.zzzz");
		}

		int countZero = 0; // to count the preceding number of 0's in the last substring
		boolean flag = false; // a flag to raise when there is a need of change in the number of digit after
								// adding 1
		int len = sub[2].length(); // length of last substring

		for (int i = 0; i < len; i++) {

			// counting the number of preceding 0's
			if (sub[2].charAt(i) == '0') {
				countZero++;
			}

			if (sub[2].charAt(i) != '0') {
				break;
			}
		}

		// setting flag to true if there is only '9' as continuous set of digits
		// eg. 0009, 0099, 0999, 9999 (here 9999 is exception, as per question)
		// Logic:
		// there will be change in the digit of non 0 part, only if the all of them are
		// '9'
		if (sub[2].matches("0*9*")) {
			flag = true;
		}

		// now building our result string

		if (flag) { // if substring matches the regular expression [0*9*]
			if (countZero == 0) { // case of all 9 i.e, 9999
				// return the original string
				return str;
			} else { // case if there are preceding 0's
				StringBuilder sb = new StringBuilder();
				int temp = Integer.parseInt(sub[2]);
				temp = temp + 1; // increment the number

				// build the new substring with one less 0, as the number of digits
				// of non zero part has increased by 1
				while (countZero > 1) {
					sb.append('0');
					countZero--;
				}
				sb.append(temp); // add the non 0 number after 0's

				// return the new result string
				return sub[0] + "." + sub[1] + "." + sb.toString();
			}
		}

		// if flag is false, i.e., when there are no continuous 0's and 9's in the same
		// order, respectively
		// then increment the non 0 number by 1 normally
		StringBuilder sb = new StringBuilder();
		int temp = Integer.parseInt(sub[2]);
		temp = temp + 1; // increment number by 1
		while (countZero > 0) {
			sb.append('0'); // add all the 0's as original counts
			countZero--;
		}

		sb.append(temp); // add the non 0 number after preceding 0's

		// return the new result string
		return sub[0] + "." + sub[1] + "." + sb.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Problem 1
			System.out.println(getResultProblem1("ABCCCABBBBAAACD"));

			// Problem 2
			System.out.println(getResultProblem2("1.051.9989"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
