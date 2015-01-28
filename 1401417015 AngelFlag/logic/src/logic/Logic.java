/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Scanner;

public class Logic {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a= ");
        int a= input.nextInt();
        System.out.print("Enter b= ");
        int b= input.nextInt();
        
        System.out.print("a + b = "+ (a+b));
        System.out.print("a*b = " + (a*b));
        System.out.println ("a | b " + (a | b)); // + (a | b);
        System.out.println("a & b " + (a & b));
        System.out.println("a ^ b " +  (a ^ b));
        
        String name = "Boris";
        String town = "Plovdiv";
        String s = name;
        int age = 18;
             //string replace
        System.out.println("My name is " + s + " from " + town  +" and " + "I am " + age + " Old");
        
        System.out.printf("The time is: %1$tH:%1$tM:%1$tS.\n",new java.util.Date());
        //System.out.printf("The time is: %1$tH:%1$tM:%1$tS.\n",new java.util.Timer());
        
        
        System.out.println("Enter First number = ");
        int firstNumber = input.nextInt();
        System.out.println("Enter Second Number = ");
        int secondNumber = input.nextInt();
        
        int biggerNumber = firstNumber;
        if (secondNumber>firstNumber){
            biggerNumber = secondNumber;}
        System.out.printf("The bigger number is: %d%n", biggerNumber); 
        
        if (biggerNumber >= 5){
            System.out.println("The Bigger number is >5");}
            else {
            System.out.println("The Bigger number is <5");
        }
        //if,else, for
        
        while (biggerNumber<10)
        {
            System.out.println(biggerNumber);
            biggerNumber++;
        }
        //triugulnik
        System.out.print("enter value for n:= ");
        int n = input.nextInt();
        
    for(int row =1; row <= n; row++){
        for(int col =1; col <= row; col++){
            System.out.print(col); //" ");
        }
        System.out.println();
    }
        System.out.println("enter value for k:= ");
    int k = input.nextInt();
        
    for(int row = 1; row<=k; row++){
        for(int row2 = 1; row2<row; row2++){
        System.out.print(row2);
    }
        System.out.println(row);
    }
    
    //toto 6/49
    
//   for (int i1=1; i1 <=44; i1++)
//       for(int i2= i1+1; i2 <=45; i2++)
//           for(int i3= i2+1; i3 <= 46; i3++)
//               for(int i4=i3+1; i4<=47;i4++)
//                   for(int i5=i4+1;i5<=48;i5++)
//                       for(int i6 = i5+1; i6<=49;i6++)
//                           System.out.printf(
//                                   "%d %d %d %d %d %d%n",
//                                   i1,i2,i3,i4,i5,i6);
    
   // int[] myArray = new int[6];
//    int[] myArray = {1,2,3,4,5,6};
//        System.out.println(myArray[6]);
////        for(int i=1;i<myArray.length;i++){
////            System.out.println(myArray[6]);
//        
//        for(int elements : myArray) {
//        System.out.println(elements);
}
}