/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darek15interfaces;

/**
 *
 * @author THE NET
 */
public class Darek15interfaces {

    public static void main(String[] args) {
        
        Vehicle car = new Vehicle(4,100.00);
        
        System.out.println("Car Max Speed  " + car.getSpeed());
        System.out.println("Num of Wheels  " + car.getWheels());
    }
    
}
