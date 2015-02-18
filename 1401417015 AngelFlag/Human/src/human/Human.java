/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human;

public class Human {
        String Name;
        int Age;
        
        public Human(String name,int age)
        {
            this.Name = name;//Name = name;
            this.Age = age;  //Age = age;
        }
        @Override
        public String toString()
        {
            return "My name is " + Name +" and I am " + Age + " years old";
                    }
    /**
     * @param args the command line arguments
     */
        //public static void main(String[] args) {
       //     Human metod = new Human("Ivan",20);
       // System.out.println(metod.Name + "-" + metod.Age);
       // System.out.println(metod.toString());
       // System.out.println(metod);
    }
    
//}
