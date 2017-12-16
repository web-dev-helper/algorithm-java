package practice.algorithm.allthatjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Algorithm03_ReverseStringTest {

	@Test
	public void testReversString() throws Exception{
		
		String inputStr = "abcdef";
		String expectedStr = "fedcba";
		String actualStr = Algorithm03_ReverseString.reverse(inputStr);
		System.out.println("expectedStr:["+expectedStr+"], actualStr:["+actualStr+"]");
		assertEquals( expectedStr, actualStr);
	}
}
