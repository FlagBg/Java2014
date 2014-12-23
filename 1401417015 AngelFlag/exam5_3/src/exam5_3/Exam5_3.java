/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam5_3;

/**
 *
 * @author THE NET
 */
public class Exam5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person Angel = new Person("Angel","Bayraktarov", 30);
        //Angel.name = "Angel";
        //Angel.age = 33;
        //Angel.setName("Angel");
        //Angel.setSurname("Bayraktarov");
        //Angel.setAge(33);
        Angel.introduceYourself();
        
        //System.out.println("I am a person! My name is " + Angel.getName() + " " + Angel.getSurname() + " and I am " + Angel.getAge() + " Old");
    
        Person Nina = new Person("Nina", "Genov", 30);
        //Nina.setName("Nina");
        //Nina.setSurname("Genov");
        //Nina.setAge(30);
        Nina.introduceYourself();
        //System.out.println("I am a person! My name is " + Nina.getName() + " " + Nina.getSurname() + " and I am " + Nina.getAge() + " Old");

        Person Ivan = new Person();
        Ivan.introduceYourself();
    }
    
    
}
