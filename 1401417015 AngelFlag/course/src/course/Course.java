/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author THE NET
 */
import java.util.Scanner;

//Дефинирайте клас който отразява човек.
//За решаване на конкретен проблем от всички характерситики на човека ни интересуват име,
//фамилия и години. Класът трябва да съдържа функционалност,
//която позволява на всеки конкретен обект
//от този клас да се представи с името, фамилията и възрастта си.
public class Course {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Keyboard= new Scanner(System.in);

        System.out.println("Какво е вашето име?");
        String Name = Keyboard.nextLine();

        System.out.println("Каква е вашата фамилия?");
        String Family = Keyboard.nextLine();

        System.out.println("На колко години сте?");
        int Age = Keyboard.nextInt();
    
        
        Person();
    }
    
        
    public static void Person() {
        String Name = ("Angel"); 
        int Age = 33;
        
        System.out.print("Моето име е:" + Name + " И съм на " + Age + "Години");
    }
}

        