package exam1stoyan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author THE NET
 */
public class circle implements calculateable {
    
    private double r;
    
    
    @Override
    public void readParameters() {
        System.out.print("\nPlease enter r: ");
        System.out.println("");
        r = Exam1Stoyan.input.nextDouble();
    }

    @Override
    public double calculateSurface() {
       return Math.PI * r * r;
    }

   

    
    
}

