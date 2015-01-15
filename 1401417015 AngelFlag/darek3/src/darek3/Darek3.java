/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darek3;


    public class Darek3 {

    public static void main(String[] args) {
        
        int randomNumber = (int)(Math.random() * 50);
        
        if (randomNumber < 25){
            System.out.println("The randomNumber is less than 25");
        }
        
        else if (randomNumber > 40){
            System.out.println("The randomNumber is bigger than 40");
        }
            
         else if (randomNumber == 18){
            System.out.println("The randomNumber is equal to 18");
        }
        
         else if (randomNumber != 40){
            System.out.println("The randomNumber is not equal to 40");
        }
        
         else if (randomNumber > 40){
            System.out.println("The randomNumber is bigger than 40");
        }
         else {
            System.out.println("Nothing worked");
         }
            System.out.println("The randomNumber is " + randomNumber);
    }
    
}
