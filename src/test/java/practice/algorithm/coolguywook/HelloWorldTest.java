package practice.algorithm.coolguywook;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWordTest {

	@Test
	public void testPrintHelloWorld()  throws Exception {
		String expectedStr = "HelloWorld";
		String actualStr = HelloWord.print();
		System.out.println("ExpectedStr: " + expectedStr);
		System.out.println("actualStr  : " + actualStr);
		assertEquals(expectedStr, actualStr);
	}
}
