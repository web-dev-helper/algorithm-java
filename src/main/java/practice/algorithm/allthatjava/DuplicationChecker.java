package practice.algorithm.allthatjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicationChecker{

	public static boolean hasMoreThanTwoDuplicatedValues(String[] inputArr) throws Exception 
	{
		// Null Check
		if( inputArr == null )
			throw new IllegalArgumentException("inputArr cannot be null");
		
		Set<String> resultSet = new HashSet<String>();
		Set<String> duplicated = new HashSet<String>();
		
		List<String> list = Arrays.asList(inputArr);
		for(String s : list)
		{
			if( !resultSet.add(s) )
				duplicated.add(s);
		}
		
		System.out.println("Duplicated values:"+duplicated);
		return duplicated.size() >= 2;
	}
}
