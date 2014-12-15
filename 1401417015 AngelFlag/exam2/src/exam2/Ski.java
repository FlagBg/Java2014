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
public class Ski extends Product {
    private double width;
    private double length;

    public Ski(double width, double lenght, double price) {
        super(price);
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Ski{" + "width=" + width + ", length=" + length + "-" + price + '}';
    }
    
 
}
