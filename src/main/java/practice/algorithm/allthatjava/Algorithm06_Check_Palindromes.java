package practice.algorithm.allthatjava;

public class Algorithm06_Check_Palindromes {

    public static boolean isPalindromeInArray(String input){
        
        if( input == null )
            return false;
        
        byte[] inputArr = input.getBytes();
        for(int i=0; i < inputArr.length; i++)
        {
            int backwardIndex = inputArr.length-(i+1);
            
            char f = (char)inputArr[i];
            char b = (char)inputArr[backwardIndex];
            
            System.out.println(i+"["+f+"]:"+backwardIndex+"["+b+"]");
            
            if( f != b )
                return false;
        }
        
        return true;
    }
    
    
    public static boolean isPalindromeInRecursiveMethod(String input, int index){
        
        if( input == null )
            return false;
        
        if( index+1 > input.length())
            return true;
        
        int backwardIndex = input.length()-(index+1);
        
        char forwardChar = input.charAt(index);
        char backwardChar = input.charAt( backwardIndex );
        
        System.out.println(index+"["+forwardChar+"]:"+backwardIndex+"["+backwardChar+"]");
        
        if( forwardChar == backwardChar)
            return isPalindromeInRecursiveMethod(input, index+1);
        else
            return false;
    }
}
