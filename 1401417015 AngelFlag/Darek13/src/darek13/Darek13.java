/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darek13;
    import java.util.Arrays;

public class Darek13 {
    
    
    public static void main(String[] args) {
        String randomString = "I am just a random string";
        String gotToQuote= "He said, \"I'm here\"";
        
        int numTwo = 2;
        
        System.out.println(randomString + " " + numTwo);
        
        String uppercaseStr = "BIG";
        String lowercaseStr = "big";
        
        if(uppercaseStr.equalsIgnoreCase(lowercaseStr)){
            System.out.println("They are equal");
        }
        
        String letters = "abcde";
        String moreLetters = "fghijk";
        
        
        System.out.println("2nd char:" + letters.charAt(1));
        System.out.println(letters.compareTo(moreLetters));
        System.out.println("Letters contains abc: " + letters.contains("abc"));
        System.out.println(letters.endsWith("de"));
        System.out.println(letters.indexOf("bc"));
        System.out.println("Letters length is " + letters.length());
        System.out.println(letters.replace("abc", "xy"));
        
        String[] letterArray = letters.split("");
        
        System.out.println(Arrays.toString(letterArray));
    
        char[] charArray = letters.toCharArray();
        System.out.println(Arrays.toString(charArray));
    }
    
}
