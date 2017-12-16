package practice.algorithm.allthatjava;

public class Algorithm03_ReverseString {

	public static String reverse(String inputStr) throws Exception {
		
		// Null check
		if( inputStr == null)
			throw new Exception("inputStr cannot be null");
		
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
