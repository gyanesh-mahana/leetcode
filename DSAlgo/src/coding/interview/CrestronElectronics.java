package coding.interview;

import java.io.IOException;

public class CrestronElectronics {

	/*
	 * @input = "AAABBCCCABC"
	 * 
	 * @output = "A3B2C3A1B1C1"
	 */
	public static String getResultProblem1(String str) {
		int len = str.length();
		int countChar = 1;
		char currCh = (char) 0;
		char nextCh = (char) 0;
		StringBuilder sb = new StringBuilder();

		if (str.isEmpty()) {
			return str;
		} else if (str.length() == 1) {
			return str + 1;
		}

		for (int i = 1; i < len; i++) {
			currCh = str.charAt(i - 1);
			nextCh = str.charAt(i);
			if (currCh == nextCh) {
				countChar++;
			} else {
				sb.append(currCh);
				sb.append(countChar);
				countChar = 1;
			}

		}
		sb.append(nextCh);
		sb.append(countChar);

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

		if (null == str || str.isEmpty()) {
			throw new IOException("Input cannot be Empty or Null");
		}

		String sub[] = str.split("[.]");
		// check the pattern
		if ((sub[0].length() != 1) || (sub[1].length() != 3) || (sub[2].length() != 4)) {
			throw new IOException("Input Pattern must be: x.yyy.zzzz");
		}

		int countZero = 0;
		boolean flag = false;
		int len = sub[2].length();
		for (int i = 0; i < len; i++) {
			if (sub[2].charAt(i) == '0') {
				countZero++;
			}
			if (sub[2].charAt(i) == '9') {
				flag = true;
			}
			if (sub[2].charAt(i) != '0') {
				break;
			}
		}

		System.out.println("Count of Zeros: " + countZero);

		System.out.println("Status of flag: " + flag);
		if (flag) {
			if (countZero == 0) {
				return sub[0] + "." + sub[1] + "." + sub[2];
			} else {
				StringBuilder sb = new StringBuilder();
				int temp = Integer.parseInt(sub[2]);
				temp = temp + 1;
				System.out.println("Value of third part: " + temp);
				while (countZero > 1) {
					sb.append('0');
					countZero--;
				}
				sb.append(temp);
				System.out.println(sb.toString());
				return sub[0] + "." + sub[1] + "." + sb.toString();
			}
		}

		StringBuilder sb = new StringBuilder();
		int temp = Integer.parseInt(sub[2]);
		temp = temp + 1;
		while (countZero > 0) {
			sb.append('0');
			countZero--;
		}
		sb.append(temp);
		return sub[0] + "." + sub[1] + "." + sb.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getResultProblem1("ABCD"));
		String str = "1.051.0000";
		try {
			System.out.println(getResultProblem2(str));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
