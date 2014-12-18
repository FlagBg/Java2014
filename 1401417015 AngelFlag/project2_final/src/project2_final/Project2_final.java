/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_final;

import java.util.Scanner;



/**
 *
 * @author THE NET
 */
public class Project2_final {

    Scanner Keyboard = new Scanner(System.in);
    int myChoice = Keyboard.nextInt();
    String[] array = new String[50];
    
 
    public static void main(String[] args) {
        
        System.out.println("Меню"); // Извеждане на менюто в конзолата
        System.out.println(" 1. Въвеждане на градове от конзола");
        System.out.println(" 2. Въвеждане на градове от задание");
        System.out.println(" 3. Принти масива");
        System.out.println(" 4. Особената част!");
        System.out.println(" 5. Изход");
        System.out.print("Изберете възможност (1-5): ");
        System.out.println("assfafads");
        
        String Text;
        switch(myChoice){
            
            case 1: Text = "Вие избрахте 1: Въвеждане на градове от конзола"; 
                    input();
                    break;
                       
            case 2: Text = "Вие избрахте 2: Въвеждане на градове от задание";
                   autoTown();
                       break;
                       
                   case 3: Text = "Вие избрахте да принтирате масива";
                       break;
                   
                   case 4: Text = "Вие избрахте да принтирате Особена част";
                       break;
                   case 5: Text = "Изход";
                       break;
                   default: Text = "Въвели сте грешен избор!";
        }
        
    }
    //Scanner scan = new Scanner (System.in);
    //int num1 = scan.nextInt();
    
    
  //need to create the Scanner variable:
//emember to right click on the main page, select source, and then select organize imports. Next you need to create an int variable to store the first input.
//Read more: http://www.java-made-easy.com/java-scanner.html#ixzz3MHQU8mMd

    /**
     * @param args the command line arguments
     */
    
    
}
