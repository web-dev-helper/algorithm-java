package practice.algorithm.coolguywook;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testPrintHelloWorld()  throws Exception {
		String expectedStr = "HelloWorld";
		String actualStr = HelloWorld.print();
		System.out.println("ExpectedStr: " + expectedStr);
		System.out.println("actualStr  : " + actualStr);
		//assertEquals(expectedStr, actualStr);
		assertThat(actualStr, is(expectedStr));
	}
}
