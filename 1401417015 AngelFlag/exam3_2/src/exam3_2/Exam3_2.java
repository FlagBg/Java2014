/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam3_2;

/**
 *
 * @author THE NET
 */
public class Exam3_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void srednoAritm(double m[]){
        
        double suma = 0; 
        for (int i = 0; i < m.length; i++)  
        suma += m[i]; 
    
        double rezultat = suma / m.length;
        System.out.println("Средно аритметичната сума е: " + rezultat);
    }
    
    public static void main(String[] args) {
        double m[] = {4.5,-8.1,9,-3,8};

    srednoAritm(m);
    
}
}
