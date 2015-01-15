/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darek6;

/**
 *
 * @author THE NET
 */
public class Monster1 {
    
    public static void main(String[] args)
    {
     Darek7Monster Frank = new Darek7Monster();
     
     Frank.name = "Frank";
     
        System.out.println(Frank.name+ " has an attack of " + Frank.getAttack());
        System.out.println(Frank.name+ "has health of " + Frank.getHealth());
    }
}
