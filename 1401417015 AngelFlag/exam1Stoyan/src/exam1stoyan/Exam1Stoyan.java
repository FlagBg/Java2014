/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1stoyan;
import java.util.Scanner;

public class Exam1Stoyan {
    public static Scanner input=new Scanner(System.in);
    
     //Чрез диалог да се избере или куб, или цилиндър. Какъвто и да е изборът, чрез
     //един и същ програмен код да се въведат размерите на фигурата и да се изведе обемът й.
     //Обем на куб V \, = \, a^3 \, = \, a . a . a 
        //
        //Ако прав кръгов цилиндър има височина h и радиус r, то обемът му се дава с формулата
        //V = \PI r^2 h,
    public static void main(String[] args) {
        System.out.println("Please choose the figure 1.Цилиндър, 2.Паралелепипед");
        int choice = input.nextInt();
        
        calculateable figure;
        if (choice == 1) figure = new Cilinder();
        else figure = new Paralelepiped();
        figure.readParameters();
        System.out.printf("%.2f", figure.calculateV());
    }
    
    
}
