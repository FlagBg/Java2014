/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1_sra;
import java.util.Random;
/**
 *
 * @author THE NET
 */
public class Project1_sra {

    /**
     * @param args the command line arguments
     */
    //public static int arr[] = {}; 
//    arr[0] = generate();
//    arr[1] = generate();
//    arr[2] = generate();
    
    public static void main(String[] args) {
        
       int[] arr = new int[7];
        //public static int arr[] = {}; 
//    arr[0] = generate();
//    arr[1] = generate();
//    arr[2] = ge
        double br = 0;
        double sum = 0;
        
        for (int i = 0; i < arr.length; i++ ) {
            
            arr[i] = generate();
            System.out.println(arr[i]);
            
            if(arr[i]%5 == 0){
                        
                sum = sum + arr[i];
                System.out.println("Няма остатък: " + arr[i]);
            
                br = br + 1;
            }
        }
        System.out.println("Сумата на елементите е : " + sum + " и броят им е : " + br);
        calc(sum, br);
        
    }
    
    private static int generate() {
    Random rand = new Random();
    int n = rand.nextInt(201);
    return n-100;
}  
    
    public static void calc(double sum, double br){
        
        double result = sum / br;
        System.out.println("средно аритметично на елементите, които се делят на 5 без остатък е: " + result);
    }
}
