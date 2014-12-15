/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam3_1;

/**
 *
 * @author THE NET
 */
public class Exam3_1 {
    
        String Name; //String Name;
        int Age;    // int Age;
        
        public Exam3_1(String име, int възраст){ //public Exam3_1(String име, int възраст){
            Name = име;
            Age = възраст;
        }
            public String toString()
            {
               return "My name is " + Name +" and I am " + Age + " years old";
            }
            
    public static void main(String[] args) {
        Exam3_1 human = new Exam3_1("sadfas",26);
    
        System.out.print(human);
     
        // TODO code application logic here
    }
    
}
