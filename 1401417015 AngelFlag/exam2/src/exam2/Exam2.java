/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

/**
 *
 * @author THE NET
 */
public class Exam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ski mySki = new Ski(5.3, 150.5,234.00);
        Bicycle myBicycle = new Bicycle("Mountain bike model 345", 468.95);
        System.out.println(Products(mySki,myBicycle));
        
        System.out.println("");
        
    }
    
    private static double Products(Product pr1,Product pr2){
        return (pr1.getPrice() < pr2.getPrice())? pr1.getPrice() : pr2.getPrice();
        
        
}
}
