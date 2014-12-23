/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaretrianglep;

/**
 *
 * @author THE NET
 */
public class Square extends Figure{
    private double a=1.0;
    public Square(double a){
        this.a=a;}
    public double P(){return 4.0*a;}
    public String toString()
    {return "Квадрат със страна " + a + " и периметър " +P() + ".";}
         
    
    }
