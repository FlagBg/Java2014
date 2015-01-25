/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darekanimal;

/**
 *
 * @author THE NET
 */
public class Animal {
    
    private String name = "Animal";
    public String favFood = "Food";
    
    protected final void changeName(String newName){
        this.name = newName;
        
    }
    protected final String getName(){
        return this.name;
    }
    public void eatStuff(){
        System.out.println("Yum " + favFood);
    }
    
    public void walkAround(){
        System.out.println(this.name + "walks around");
    }
    
    public Animal(){
        
    }
    
    public Animal(String name, String favFood){
        this.changeName(name);
        this.favFood = favFood;
    }
    
}
