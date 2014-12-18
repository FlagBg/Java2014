/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package zad1;
import java.util.*;
/**
 *
 * @author THE NET
 */
public class random {
    	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 
		  getRandomMembers();
	
	}*/

		
	private static int getRandomNum(int range) {
	        Random rand = new Random();
		   
		    return Math.abs(rand.nextInt()) % range + 1;
	   }
   
	  private static int[] printArray(int[] randArray ){
		   System.out.print("Random array from -100 to 100 [ ");
		   for (int print: randArray) {
				System.out.print(print + ", ");
		   }		
		   System.out.print("]");
		   System.out.println();
		   return randArray;
	     }
	
   

	    public void getRandomMembers() {
	    	int c = getRandomNum(50);	 
	    	int [] randArray = new int[c];
	    	int membersCount = 0;
	    	boolean isEven = false;
	    	for (int i = 0; i < c; i++) {
	                  randArray[i] =  getRandomNum(200) -100;
	                  if (randArray[i] <= 30 && randArray[i] >= -30 ) {
	  					  if(isEven = i % 2 == 0) {
	                       	  membersCount++;
	  				      }
	                  }
	    	
	    	}
	    	
	    	printArray(randArray);
	    	System.out.println(membersCount + " from array elements are in interval from -30 to 30 and have even index" );
	    	
            }
}

