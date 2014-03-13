/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;
import java.util.regex.Pattern;

/**
 *
 * @author Aaron
 */
public class IsPalendrome {
    /**
     * determines if the given string is a palindrome
     * @param str the string to be evaluated
     * @return returns a boolean
     */
    public static boolean isStringPalindrome (String str){
        str = (str.replaceAll("\\W","")).toLowerCase();
        char[] stringChars = str.toCharArray();
        boolean bool = true;
        for (int i = 0, i2 = stringChars.length - 1; i<stringChars.length/2; i++,i2--)
            {
                if (stringChars[i] != stringChars[i2])
                        bool = false;                
            }
        return bool;
        }
    public static boolean isStringPalindromeRecursively (String str)
    {
        System.out.println(str);
        if (str.length() == 0 || str.length()==1)
            return true;
        
        char char1 = Character.toLowerCase(str.charAt(0));
        char char2 = Character.toLowerCase(str.charAt(str.length()-1));
  
        if (Character.toString(char1).matches("\\W"))
            return isStringPalindromeRecursively (str.substring(1,str.length()));
            
        if (Character.toString(char2).matches("\\W"))
            return isStringPalindromeRecursively (str.substring(0,str.length()-1));
        
        if (char1 == char2)
            return isStringPalindromeRecursively(str.substring(1,str.length()-1));

        return false;
    }
    

}
