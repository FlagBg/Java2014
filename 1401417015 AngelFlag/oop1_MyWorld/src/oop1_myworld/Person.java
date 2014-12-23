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
public class Person {
    //public String name;
    //public int Age;
    private String name;
    private int age;
    
    public static final double PI = 3.14;
    
    public static String nationality = "Bulgarian.";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public Person(){
        this("Anonymous", 22);
        
    }
    
    public void introduceYourself()
    {
            System.out.println("I am a person! My name is " + name + " I am " + age + " Old " + "and I am " + nationality);
    }
}
