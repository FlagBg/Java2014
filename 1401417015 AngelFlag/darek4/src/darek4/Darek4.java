/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darek4;

import java.util.Scanner;

public class Darek4 {

    static Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args) {
       int i = 0;
       
       while(i<=20){
          if (i==3){
              i+=2;
              continue;
           }
           System.out.println(i);
           i++;
           
           if((i%2)==0)
           {
               i++;
           }
           if (i>10){
               break;
           }
        }  
    m1();
    }
    public static void m1(){
       
       String contYorN = "Y";
       
       int h = 1;
       
       while(contYorN.equalsIgnoreCase("y"))
       {
       System.out.println(h);
       System.out.println("Continue Y or N?");
       contYorN = userInput.nextLine();
       h++;
       
       
        }
    }
}
