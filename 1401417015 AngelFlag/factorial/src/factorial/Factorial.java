/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package factorial;
import java.util.*;

/**
 *
 * @author THE NET
 */
public class Factorial {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, c, fact = 1;
 
      System.out.println("Enter an integer to calculate factorial");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
 
      if ( n < 0 )
         System.out.println("Number should be non-negative.");
      else
      {
         for ( c = 1 ; c <= n ; c++ )
            fact = fact*c;
 
         System.out.println("Factorial of "+n+" is = "+fact);
    }
    
}
}

