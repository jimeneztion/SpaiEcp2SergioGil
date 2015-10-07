package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

	private DecimalCollection dc;

	private double[] decimals;

	@Before
	public void before() {
		dc = new DecimalCollection();

		decimals = new double[] { 0.1231, 16.99, -1.3122, 4.1298 };

		for (double decimal : decimals) {
			dc.add(decimal);
		}
	}

	@Test
	public void testSizeEmpty() {
		dc = new DecimalCollection();
		assertEquals(0, dc.size());
	}

	@Test
	public void testSumEmpty() {
		dc = new DecimalCollection();
		assertEquals(0.0, dc.sum(), 0);
	}

	@Test
	public void testSize() {
		assertEquals(decimals.length, dc.size());
	}

	@Test
	public void testSum() {
		double sum = 0;
		for (double decimal : decimals) {
			sum += decimal;
		}

		assertEquals(sum, dc.sum(), 10e-5);
	}

	@Test
	public void testHigherEmpty() {
		dc = new DecimalCollection();
		assertEquals(Double.NEGATIVE_INFINITY, dc.higher(), 10e-5);
	}

	@Test
	public void testHigher() {
		assertEquals(16.99, dc.higher(), 10e-5);
	}
	
	@Test
	public void testMedium(){
		assertEquals(4.9826, dc.medium(), 10e-5);
	}

}
