package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class myIntegerTest {

	@Test
	public void testEven() {
		MyInteger myInt = new MyInteger(2);
		assertTrue(myInt.isEven());
		assertTrue(MyInteger.isEven(2));
		assertTrue(MyInteger.isEven(myInt));
		assertFalse(MyInteger.isEven(3));
		
	}
	
	@Test
	public void testOdd() {
		MyInteger myInt = new MyInteger(3);
		assertTrue(myInt.isOdd());
		assertTrue(MyInteger.isOdd(3));
		assertTrue(MyInteger.isOdd(myInt));
		assertFalse(MyInteger.isOdd(2));
	}
	
	@Test
	public void testPrime() {
		MyInteger myInt = new MyInteger(7);
		assertTrue(myInt.isPrime());
		assertTrue(MyInteger.isPrime(7));
		assertTrue(MyInteger.isPrime(myInt));
		assertFalse(MyInteger.isPrime(4));
	}
	
	@Test
	public void testEquals() {
		MyInteger myInt = new MyInteger(9);
		assertTrue(myInt.isEquals(9));
		assertTrue(myInt.isEquals(myInt));
		assertFalse(myInt.isEquals(10));
	}

}
