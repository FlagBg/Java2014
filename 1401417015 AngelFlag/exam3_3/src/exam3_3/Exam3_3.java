/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam3_3;

/**
 *
 * @author THE NET
 */
public class Exam3_3 {

    /**
     * @param args the command line arguments
     */
    
   
        public static void sumPluselem(double m[]){
		double suma = 0;
		for (int i = 0; i < m.length; i++)
                if (m[i] > 0)
		suma += m[i];

		System.out.println("Сумата на положителните елементи: " + suma);

        }
        public static void main(String[] args) {
        double m[] = {4.8,-4.1,5,-2,7};

        sumPluselem(m);
        }
    
}
