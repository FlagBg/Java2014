/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darek8;

import java.util.Arrays;

public class Darek8 {
    
    static char[][] battleBoard = new char[10][10];
    
    public static void buildBattleBoard(){
        
        for(char[] row : battleBoard)
        {
            Arrays.fill(row, '*');
        }
    }
    
    public static void redrawBoard()
    {
        int k=1;
        while(k<=30){System.out.println('-'); k++;}
        System.out.println();
     
        for
                (int i = 0; i < battleBoard.length; i++)
        {
            for (int j=0; j<battleBoard[i].length;j++)
            {
                System.out.println("|" + battleBoard[i][j] + "|");
       
            }
            System.out.println();
        }
        k=1;
        while(k<=30){System.out.println('-'); k++;}
        System.out.println();
    }
    public final String TOMBSTONE = "HERE LIES A DEAD MONSTER";
    
    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    
    private boolean alive = true;
    
    public String name = "Big monster";
    public char nameChar1 = 'B';
    public int xPosition = 0;
    public int yPosition =0;
    public static int numOfMonsters;
    
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
    
    public Darek8(int health, int attack, int movement)
    {
        this.health = newHealth;
        this.attack = newAttack;
        this.movement = newMovement;
        
    }
    //default Constructor
    public Darek8()
    {
        
    }
    
    public static void main(String[] args){
        Darek8 Frank = new Darek8();
        
        System.out.println(Frank.attack);
        System.out.println(Frank.health);
    }
}
