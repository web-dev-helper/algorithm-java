package practice.algorithm.allthatjava;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Algorithm05_CheckIfItHasMoreThanTwoDuplicatedValuesTest {

	@Test
	public void testMoreThan_one_duplication_within_array() throws Exception{
		
		// One duplicated values
		String[] arrayWithOneDuplicatedValues = {"a","b","a","c","d","e","f","g"};
		boolean hasMoreThanTwoDuplicatedValues = Algorithm05_CheckIfItHasMoreThanTwoDuplicatedValues.hasMoreThanTwoDuplicatedValues(arrayWithOneDuplicatedValues);
		assertFalse(hasMoreThanTwoDuplicatedValues);
		
		// Two duplicated values
		String[] arrayWithoutDuplicatedValues = {"a","b","a","d","e","f","e","a"};
		boolean hasMoreThanTwoDuplicatedValues2 = Algorithm05_CheckIfItHasMoreThanTwoDuplicatedValues.hasMoreThanTwoDuplicatedValues(arrayWithoutDuplicatedValues);
		assertTrue( hasMoreThanTwoDuplicatedValues2 );
		
		// Five duplicated values
		String[] arrayWithFiveDuplicatedValues = {"a","b","a","b","a","c","c","c","d","e","d","d","e","f","g"};
		boolean hasMoreThanTwoDuplicatedValues5 = Algorithm05_CheckIfItHasMoreThanTwoDuplicatedValues.hasMoreThanTwoDuplicatedValues(arrayWithFiveDuplicatedValues);
		assertTrue( hasMoreThanTwoDuplicatedValues5 );
	}
}
