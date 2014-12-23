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
public class Triangle extends Figure {
    private double a=1.0 , b=1.0 , c=1.0;
public Triangle( double a , double b , double c ) { this.a=a; this.b=b; this.c=c; }
public double P( ) { return a+b+c; }
public String toString( ) {
return "Триъгълник със страни "+a+", "+b+" и "+c+" и периметър "+P()+".";
    }
}
