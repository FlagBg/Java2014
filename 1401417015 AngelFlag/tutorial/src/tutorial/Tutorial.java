/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

/**
 *
 * @author THE NET
 */
public class Tutorial {
    
    //static String randomString = "String to Print";
    //static final Double PINUM = 3.141529;
        int integerOne =22;
        int integerTwo = integerOne + 1;
    
    public static void main(String[] args) {
        //int integerOne =22;
       // int integerTwo = integerOne + 1;
        
        //System.out.println(integerTwo);
        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 2100000000;
        long bigLong = 9220000000000000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.148237948727347923748;
        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        
        boolean trueOrFalse = true;
        
        char randomChar = 66;
        char anotherChar = 'A';
        
        char escapedChars = '\\';
        
        String randomString = "I am a random String";
        String anotherString = "Stuff";
        
        String andAnotherString = randomString + " " + anotherString;
        
        String byteString = Byte.toString(bigByte);
        String shortString = Short.toString(bigByte);
        String intString = Integer.toString(bigByte);
        String longString = Long.toString(bigByte);
        String floatString = Float.toString(bigByte);
        String doubleString = Double.toString(bigByte);
        String booleanString = Boolean.toString(true);
                
        double aDoubleValue = 3.14546466464;
        int doubleToInt = (int) aDoubleValue;
        
        System.out.println(randomChar);
        System.out.println(andAnotherString);
        System.out.println(doubleToInt);
    }
    
}
