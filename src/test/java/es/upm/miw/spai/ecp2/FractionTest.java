package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	private Fraction fr;

	@Before
	public void before() {
		fr = new Fraction(1, 2);
	}

	@Test
	public void testFraction() {
		fr = new Fraction();
		assertEquals(1, fr.getNumerator());
		assertEquals(1, fr.getDenominator());
	}

	@Test
	public void testFractionIntInt() {
		assertEquals(1, fr.getNumerator());
		assertEquals(2, fr.getDenominator());
	}

	@Test
	public void testDecimal() {
		assertEquals(0.5, fr.decimal(), 10e-2);
	}

	@Test
	public void testDecimalWithDenominatorZero() {
		fr = new Fraction(3, 0);
		assertEquals(Double.POSITIVE_INFINITY, fr.decimal(), 10e-1);
	}

}
