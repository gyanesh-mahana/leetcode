package datastructure;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestAddBig {

	@Test(dataProvider = "getData")
	public void testAdd(Number n1, Number n2) {
		System.out.println(n1);
		System.out.println(n2);
		AddBig a = new AddBig();
		System.out.println(a.add(n1, n2));

	}

	@DataProvider
	public Iterator<Number[]> getData() {

		List<Number[]> data = new ArrayList<Number[]>();
		for (int i = 0; i < 1; i++) {
			Number n[] = { null, null };
			Random rand = new Random();

			n[0] = new BigInteger(rand.nextInt(1000), new Random());
			n[1] = new BigInteger(rand.nextInt(1000), new Random());
			data.add(n);

			Number m[] = { null, null };
			m[0] = new BigDecimal(new BigInteger(rand.nextInt(1000), new Random()), 2);
			m[1] = new BigDecimal(new BigInteger(rand.nextInt(1000), new Random()), 3);
			data.add(m);

			Number d[] = { null, null };

//			d[0] = BigInteger.ZERO.shiftLeft(1000).subtract(BigInteger.ONE);
//			d[1] = BigInteger.ZERO.shiftLeft(1000).subtract(BigInteger.ONE);
//			d[0] = BigInteger.ZERO.shiftLeft(1000);
//			d[1] = BigInteger.ZERO.shiftLeft(1000).subtract(BigInteger.ONE);
			d[0] = BigInteger.ZERO;
			d[1] = BigInteger.ONE;
			for (int j = 0; j < 1000; j++) {
				if (j % 2 == 1) {
					d[0] = ((BigInteger) (d[0])).shiftLeft(1).flipBit(0);
					d[1] = ((BigInteger) (d[1])).shiftLeft(1).flipBit(0);
				} else {
					d[0] = ((BigInteger) (d[0])).shiftLeft(1);
					d[1] = ((BigInteger) (d[1])).shiftLeft(1);
				}

			}
			data.add(d);
			System.out.println(((BigInteger) (d[0])));

		}

		return data.iterator();

	}

}
