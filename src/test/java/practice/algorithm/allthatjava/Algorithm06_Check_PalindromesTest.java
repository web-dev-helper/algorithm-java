package practice.algorithm.allthatjava;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Algorithm06_Check_PalindromesTest {
    
    @Test
    public void testCheckPalindromeInArray_withValidPalidrome_shouldBeTrue(){
        
        System.out.println("Array === Valid case");
        String input = "mom";
        
        assertThat(Algorithm06_Check_Palindromes.isPalindromeInArray(input), is(equalTo(true)));
    }
    
    @Test
    public void testCheckPalindromeInArray_withInvalidPalidrome_shouldBeFalse(){
        
        System.out.println("Array === Invalid case");
        String input = "m01m";
        
        assertThat(Algorithm06_Check_Palindromes.isPalindromeInArray(input), is(equalTo(false)));
    }
    
    @Test
    public void testCheckPalindromeInRecursiveMethod_withValidPalidrome_shouldBeTrue(){
        
        System.out.println("Recursive === Valid case");
        String input = "hannah";
        
        assertThat(Algorithm06_Check_Palindromes.isPalindromeInRecursiveMethod(input, 0), is(equalTo(true)));
    }
    
    @Test
    public void testCheckPalindromeInRecursiveMethod_withInvalidPalidrome_shouldBeFalse(){
        
        System.out.println("Recursive === Invalid case");
        String input = "han12nah";
        
        assertThat(Algorithm06_Check_Palindromes.isPalindromeInRecursiveMethod(input, 0), is(equalTo(false)));
    }
}
