/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2_11;
//import java.util.Scanner;
/**
 *
 * @author THE NET
 */
public class Exam2_11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] myArray = {1,2,3,4,5};
        int[] array = {1,2,3,4,5};
        m1(myArray); 
        m2(array);
        }   
        
    public static void m1(int[] m) {
        
        for (int i=0; i<m.length; i++){
            System.out.println(m[i]);
        }
    }
    public static void m2(int[] n){
            
        for(int i = n.length - 1; 1 >=0; i--){
            System.out.println(n[i]);
            
        }
    }
 
//Scanner inphut = new Scanner(System.in);
        //int n = input.nextInt();
        //int[] array = new int[n];

//for(int i= 0; i < n; i++) {
        //array[i] = input.nextInt();
       
    }
    
}
}
