/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darek12;

import java.util.Arrays;
import java.util.LinkedList;

public class Darek12 {

    public static void main(String[] args) {
        
        LinkedList LinkListOne = new LinkedList();
        LinkedList<String> names = new LinkedList<String>();
        
        names.add("Ivan Petrov");
        names.add("Angel Ivanov");
        
        names.addLast("Dragan Petkanov");
        names.addFirst("Angel Bayraktarov");
        
        names.add(0, "Peter Pan");
        names.set(2, "Paul Newman"); //smeni Paul Newman, vmesto Ivan Petrov 
        
        //names.remove(2);
        //names.remove("Angel Ivanov");
        System.out.println("nFirst index is " + names.get(0));
        System.out.println("nLast index is " + names.getLast());
        
        LinkedList<String> nameCopy = new LinkedList<String>(names);
        
        System.out.println("Newlist nameCopy" + nameCopy);
        
        if(names.contains("Peter Pan")){
            System.out.println("Peter Pan is here!");
        }
        System.out.println("ArrayList size is " + names.size());
        
        for (String name : names){
            System.out.println(name);
        }   
        
        Object[] nameArray = new Object[5];
        nameArray = names.toArray();
        System.out.println(Arrays.toString(nameArray));
        names.clear();
    }
}
