/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1stoyan;
import java.util.Scanner;
/**
 *
 * @author THE NET
 */
public class Exam1Stoyan {
    public static Scanner input=new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please choose the figure 1.Circle, 2.Trapeze");
        int choice = input.nextInt();
        
        calculateable figure;
        if (choice == 1) figure = new circle();
        else figure = new Trapeze();// TODO code application logic here
        figure.readParameters();
        System.out.printf("%.2f", figure.calculateSurface());
    }
    
}
