/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1_1;
import java.util.Random;

//б) произведението на ненулевите нечетни елементи;
/**
 *
 * @author THE NET
 */
public class Project1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int arr[] = new int[6];
        
        int multiplied = 1;//инициализираме сума, която ти трябва за формулата;
        
        for (int i = 0; i < arr.length; i++ ) {
            
            arr[i] = generate();
            System.out.println(arr[i]);
            
            // тук изваждаме всички нечетни числа, които получаваме, когато разделим на две и имаме остатък едно!
            //различно от нула.
            
            if(arr[i]%2 != 0 && arr[i] != 0){              
                multiplied = multiplied * arr[i];
                
            }
            
        }
        System.out.println("Произведението на всички нечетни числа различни от нула e: " + multiplied);
    }

    private static int generate() {
            Random rand = new Random();
            int n = rand.nextInt(201);
            return n-100;
            
    }
    
}
