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
public class Bicycle extends Product{
    private String model;

    public Bicycle(String model, double price) {
        super(price);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "model=" + model + "-" + price +'}';
    }
    
         
    
}
