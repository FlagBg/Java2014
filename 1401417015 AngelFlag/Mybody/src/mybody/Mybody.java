/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybody;

/**
 *
 * @author THE NET
 */
public class Mybody {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person Angel = new Person();
        //Angel.name ="Angel";
        //Angel.age = 33;
        Angel.setName("Angel");
        Angel.setAge(33);
      
        System.out.println("I am a person!" + "My name is:" + Angel.getName() + " и съм на " + Angel.getAge() +"Години");
    }
    
}
