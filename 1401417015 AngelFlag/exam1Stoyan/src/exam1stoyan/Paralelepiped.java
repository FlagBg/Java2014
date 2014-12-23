/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1stoyan;

/**
 *
 * @author THE NET
 */
public class Paralelepiped implements calculateable {
    
    private double a;
    private double b;
    private double h;

    @Override
    public void readParameters() {
        System.out.print("\n Please enter a: ");
        a = Exam1Stoyan.input.nextDouble();

        System.out.print("\n Please enter b: ");
        b = Exam1Stoyan.input.nextDouble();
        
       System.out.print("\n Please enter h: ");
       h = Exam1Stoyan.input.nextDouble();
        System.out.print("\n Обемът е: ");
            }

    @Override
    public double calculateV() {
        //return ((a+b)/2)*h;
        return a*b*h;
        
    }
    }

