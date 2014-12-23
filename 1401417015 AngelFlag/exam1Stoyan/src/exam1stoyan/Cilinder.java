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
public class Cilinder implements calculateable {
    
    private double r;
    private double h;
    
    @Override
    public void readParameters() {
        System.out.print("\nPlease enter r: ");
        System.out.println("");
        r = Exam1Stoyan.input.nextDouble();
        System.out.print("\nPlease enter h: ");
        System.out.println("");
        h = Exam1Stoyan.input.nextDouble();
        System.out.println("\n Obemat e: ");
        //System.out.println("obemat e:" + calculateV);
    }

    @Override
    public double calculateV() {
       return Math.PI  *(r * r) *h;
    }
////Ако прав кръгов цилиндър има височина h и радиус r, то обемът му се дава с формулата
        //V = \PI r^2 h,
   

    
    
}

