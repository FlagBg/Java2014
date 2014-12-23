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
public class usingHuman {
    
     public static void main(String[] args) {
     Human metod = new Human("Ivan",20);
        System.out.println(metod.Name + "-" + metod.Age);
        System.out.println(metod.toString());
        System.out.println(metod);
    }
}

