/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.*;

/**
 *
 * @author THE NET
 */
public class Fibonacci {
//using formula from GOD KNOWS WHERE......BUT IT WORKSSSSS
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter number:");
        int number = input.nextInt();
        int count=1;
        int c =1,b=1,a=0;
        while(count <= number){
            c= b+a;
        System.out.print(c);
        a = b;
        b = c;
        count++;
        }
        
    }
}
