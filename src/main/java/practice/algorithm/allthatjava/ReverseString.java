package practice.algorithm.allthatjava;

public class ReverseString{

	public static String reverse(String inputStr) {
		
		// Null check, throws IllegalArgumentException
		if( inputStr == null)
			throw new IllegalArgumentException("inputStr cannot be null");
		
		// Result builder
		StringBuilder builder = new StringBuilder();
		
		// Reverse
		int length = inputStr.length();
		for(int i=length-1; i >= 0; i--)
		{
			builder.append( inputStr.charAt(i));
		}
		
		return builder.toString();
	}
}
