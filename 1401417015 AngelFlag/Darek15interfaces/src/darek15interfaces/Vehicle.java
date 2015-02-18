/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darek15interfaces;


public class Vehicle implements Drivable {
    
    
    int numOfWheels = 2;
    double theSpeed = 0;
    
    int carStrength = 0;
    
    
    public int getWheels(){
        return this.numOfWheels;
    }
    
    public void setWheels(int numWheels){
        this.numOfWheels = numOfWheels;
    }
    
    public double getSpeed(){
        return this.theSpeed;
    }
    
    public void setSpeed(double speed){
        this.theSpeed = speed;
    }
    
    public Vehicle(int wheels, double speed){
        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }
}
