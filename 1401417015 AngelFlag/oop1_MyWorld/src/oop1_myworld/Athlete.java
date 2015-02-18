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
public class Athlete extends Person{
    protected String Sport;

    public String getSport() {
        return Sport;
    }

    public void setSport(String Sport) {
        this.Sport = Sport;
    }

    public Athlete(String Sport, String name, int age){
        super(name,age);
        this.Sport = Sport;
        
    }
    
    @Override
    public void introduceYourself(){
        super.introduceYourself();
        System.out.println("I am an Athlete. My name is " + name + " My sport is " + Sport + " and I am " + age + " years old");
    
    }
}
