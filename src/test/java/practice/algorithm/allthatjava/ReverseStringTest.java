package practice.algorithm.allthatjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testReversString_withValidData_shouldReturnTrue() throws Exception{
		
		String inputStr = "abcdef";
		String expectedStr = "fedcba";
		String actualStr = ReverseString.reverse(inputStr);
		System.out.println("expectedStr:["+expectedStr+"], actualStr:["+actualStr+"]");
		assertEquals( expectedStr, actualStr);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testReversString_withNullData_throwsIllegalArguementException(){
			ReverseString.reverse(null);
	}
}
