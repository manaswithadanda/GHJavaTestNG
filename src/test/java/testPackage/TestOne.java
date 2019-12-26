package testPackage;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestOne {
	
	@Test
	public void test1() {
		assertTrue(true);
	}
	
	@Test
	public void test2() {
		assertTrue(false);
	}
	
	@Test
	public void test3() {
		assertTrue(false);
	}
}
