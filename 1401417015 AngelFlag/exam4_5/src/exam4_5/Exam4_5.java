/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam4_5;

/**
 *
 * @author THE NET
 */
public class Exam4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(факториелЦикъл(4));
		System.out.println(факториелРекурсия(4));
	}

	public static long факториелЦикъл(int num) {
		long result = 1;

		for (int i = 2; i <= num; i++)
			result *= i;

		return result;
	}
	
	public static long факториелРекурсия(int num) {
		if(num<2)     // Условие за край - прекъсване на рекурсията
			return 1;

		return num*факториелРекурсия(num-1); 

    }
    
}
