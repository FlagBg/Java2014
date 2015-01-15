/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darek6;

public class Darek7Monster {

    public final String TOMBSTONE = "HERE LIES A DEAD MONSTER";
    
    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    //private int xPosition = 0;
    //private int yPosition =0;
    private boolean alive = true;
    
    public String name = "Big monster";
    
    public int getAttack(){
        return attack;
    }
    
    public int getMovement(){
        return movement;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int decreaseHealth)
    {
        health = health - decreaseHealth;
        if(health <0)
        {
            alive = false;
        }
    }
    
    public void setHealth(double decrease)
    {
        int intDecreaseHealth = (int) decreaseHealth;
        health = health - intDecreaseHealth;
        if (health < 0)
        {
            alive = false;
        }
    }
    
    public Darek7Monster(int health, int attack, int movement)
    {
        this.health = newHealth;
        this.attack = newAttack;
        this.movement = newMovement;
        
    }
    //default Constructor
    public Darek7Monster()
    {
        
    }
    
    public static void main(String[] args){
        Darek7Monster Frank = new Darek7Monster();
        
        System.out.println(Frank.attack);
        System.out.println(Frank.health);
    }
}
