/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam5_1;

/**
 *
 * @author THE NET
 */
public class Exam5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person Angel = new Person();
        Angel.name = "Angel";
        Angel.surname = "Bayraktarov";
        Angel.age = 34;
        
        System.out.println("I am a person! My name is " + Angel.name + " " + Angel.surname + " and I am " + Angel.age + " old");
    }
    
}
