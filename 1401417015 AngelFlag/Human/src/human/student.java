/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human;

/**
 *
 * @author THE NET
 */
public class student extends Human{
    String Fi;

    public student(String name, int age, String Fi) {
        super(name, age);
        this.Fi = Fi;
    }
    public String toString(){
        
        return super.toString() + " Той е студент с Fi: " + Fi;
        
    }
}
