/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darekanimal;

public class Cat extends Animal{
  
    public String favToy = "Yarn";
  
    public void playWith(){
      System.out.println("Yeah " + favToy);
  }
  
    public void walkAround(){
      
        System.out.println(this.getName() + "stalks around then sleeps ");
  }
  
  
  public String getToy(){
    return this.favToy;
}
  
  public Cat(){
      
  }
  
  public Cat(String name, String favFood, String favToy){
      super(name,favFood);
      this.favToy = favToy;
  }
}
