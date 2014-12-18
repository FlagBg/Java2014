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
public class Student extends Person{
  
    private String fNumber;

    public String getfNumber() {
        return fNumber;
    }

    public void setfNumber(String fNumber) {
        this.fNumber = fNumber;
    }

    public Student(String fNumber, String name, int age) {
        super(name, age);
        this.fNumber = fNumber;
    }

    public Student() {
        this("Test",45);
        fNumber = "No facult number";
    }
    
        public Student(String name,int age) {
    super(name,age);  
   
    }
        @Override
            public void introduceYourself(){
                super.introduceYourself();
                System.out.println("I am a student. My name is: " + name + " and  My fNumber is = " + fNumber);
            }

            @Override
            public String toString(){
                return "Student{"+ "fNumber=" + fNumber + '}';
            }
}

    

