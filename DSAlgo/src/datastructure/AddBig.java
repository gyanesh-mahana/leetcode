package datastructure;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class AddBig {

	public AddBig() {
	}

	public Number add(Number num1, Number num2) {

		if (num1 instanceof BigInteger && num2 instanceof BigInteger) {
			System.out.println("****Input is BigInteger****");
			BigInteger b1 = new BigInteger(num1.toString());
			BigInteger b2 = new BigInteger(num2.toString());
//			System.out.println("num1= "+b1+" num2= "+b2);
			return b1.add(b2);
		} else if (num1 instanceof BigDecimal && num2 instanceof BigDecimal) {
			System.out.println("****Input is BigDecimal****");
			BigDecimal b1 = new BigDecimal(num1.toString());
			BigDecimal b2 = new BigDecimal(num2.toString());
//			System.out.println("num1= "+b1+" num2= "+b2);
			return b1.add(b2);
		}
//		System.out.println(num1);
//		res.add((BigDecimal) num1);
//		res.add((BigDecimal) num2);
		return null;
//		System.out.println(num1.byteValue()+num2.byteValue());

	}

	public static void main(String[] str) {
		AddBig t = new AddBig();
		BigInteger n1 = new BigInteger(100, new Random());
		BigInteger n2 = new BigInteger(100, new Random());

		BigDecimal d1 = new BigDecimal(n1, 2);
		BigDecimal d2 = new BigDecimal(n2, 3);

		System.out.println(t.add(n1, n2));
		System.out.println(t.add(d1, d2));

		Number sn1 = BigInteger.ZERO;
		Number sn2 = BigInteger.ONE;
		for (int i = 0; i < 10000; i++) {
			System.out.println(sn1 + " " + sn2);
			if (i % 2 == 1) {
				sn1 = ((BigInteger) (sn1)).shiftLeft(1).flipBit(0);
				sn2 = ((BigInteger) (sn2)).shiftLeft(1).flipBit(0);
			} else {
				sn1 = ((BigInteger) (sn1)).shiftLeft(1);
				sn2 = ((BigInteger) (sn2)).shiftLeft(1);
			}

		}
		System.out.println(t.add(sn1, sn2));
//		t.add(Byte.parseByte("010", 2), Byte.parseByte("101", 2));
	}

}
