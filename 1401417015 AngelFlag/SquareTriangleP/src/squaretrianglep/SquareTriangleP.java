/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaretrianglep;

import java.awt.BorderLayout;

/**
 *
 * @author THE NET
 */
public class SquareTriangleP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Да се създадат обекти квадрат със страна 1,5 и триъгълник със страни 3, 4 и 5. 
        //Да се изведат данните за двете фигури.
        //Да се дефинира функция за намиране сумата от периметрите на две дадени фигури, 
        //всяка от които може да бъде и квадрат, и триъгълник.
        //Да се изведе сумата от периметрите на създадените квадрат и триъгълник.
        // TODO code application logic here
       Square S = new Square(1.5);
       Triangle T = new Triangle(3.0,4.0,5.0);
       System.out.println(S);
       System.out.println(T);
       System.out.println("Сумата от периметрите е  " + SumP(S,T));
    }
    public static double SumP( Figure F1, Figure F2 ) 
        { return F1.P()+F2.P(); }
        
    }
        
