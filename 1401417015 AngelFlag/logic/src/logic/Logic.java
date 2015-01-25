/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;


public class Logic {

    
    public static void main(String[] args) {
        
        short a = 3;
        short b = 5;
        
        System.out.println ("a | b " + (a | b)); // + (a | b);
        System.out.println("a & b " + (a & b));
        System.out.println("a ^ b " +  (a ^ b));
        
        String name = "Boris";
        String town = "Plovdiv";
        int age = 18;
        String s = name;
             
        System.out.println("My name is " + s + " from " + town  +" and " + "I am " + age + " Old");
        
        System.out.printf("The time is: %1$tH:%1$tM:%1$tS.\n",new java.util.Date());
        //System.out.printf("The time is: %1$tH:%1$tM:%1$tS.\n",new java.util.Timer());
    }
    
}
