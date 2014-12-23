/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1_myworld;

/**
 *
 * @author THE NET
 */
public class Oop1_MyWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("I am proud with my greatest invention PI " + Person.PI);
        // TODO code application logic here
        Person angel = new Person("Angel", 30);
        //angel.name = "Angel";
        //angel.Age = 33;
        //angel.setName("Angel");
        //angel.setAge(33);
    //System.out.println("I am a person! My name is " + angel.name + " I am " + angel.Age + " Old");
    //System.out.println("I am a person! My name is " + angel.getName() + " I am " + angel.getage() + " Old");
        angel.introduceYourself();
        
        Person mariya = new Person("mariya", 21);
        //mariya.name = "Mari
       // mariya.Age = 30;
        //mariya.setName("Mariya");
        //mariya.setAge(30);
    //System.out.println("I am a person! My name is " + mariya.name + " I am " + mariya.Age + " Old");
    //System.out.println("I am a person! My name is " + mariya.getName() + " I am " + mariya.getage() + " Old");
    
        mariya.introduceYourself();
    Person Anonymous = new Person();
    
        Anonymous.introduceYourself();
        //System.out.println("I am a person! My name is " + Anonymous.getName() + " I am " + Anonymous.getage() + " Old");
    
    } 
   
    
}
