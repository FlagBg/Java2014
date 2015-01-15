/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darek2;

import java.util.Scanner;

public class Darek2 {
    
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
      System.out.println("Your favorite number: ");
        
            if(userInput.hasNextInt()){
                
                int numberEntered = userInput.nextInt();
                
                System.out.println("you entered: " + numberEntered);
                
                int numberEntered2 = numberEntered + numberEntered;
                System.out.println(numberEntered + "+" + numberEntered + "=" + numberEntered2);
            
        }
            else {
                System.out.println("Enter an integer next time");
                
            }
        }
    }
