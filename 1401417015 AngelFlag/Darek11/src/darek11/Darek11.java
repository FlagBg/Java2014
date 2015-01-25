/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darek11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class Darek11 {

    public static void main(String[] args) {
        ArrayList arrayListOne;
        arrayListOne = new ArrayList();
        
        //ArrayList arrayListTwo = new ArrayList();
        
        ArrayList<String> names = new ArrayList<String>();
        names.add("John Smith");
        names.add("Angel Ivanov");
        names.add("Oliver Miller");
        
        names.add(2, "Jack Ryan");
        
        names.set(0, "John Adams");
        
        names.remove(3);
        //names.remove(2);
        
        for (int i = 0; i<names.size(); i++)
        {
            System.out.println(names.get(i));
        }
        for (String name : names) {
            System.out.println(name);
        }
        //enchanced loop better!

        for(String i : names)
        {
            System.out.println(i);
        }
        
        Iterator indivItems = names.iterator();
        while(indivItems.hasNext()){
            System.out.println(indivItems.next());
        }
    ArrayList nameCopy = new ArrayList();
    ArrayList nameBackup = new ArrayList();
    
    nameCopy.addAll(names);
        System.out.println(nameCopy);
        
    String paulYoung = "Paul young";
    
    names.add(paulYoung);
    
    if(names.contains(paulYoung))
    {
        System.out.println("Paul is here");
    }
    
    if(nameCopy.containsAll(nameCopy))
    {System.out.println("Everything in nameCopy is in names");
}
    names.clear();
    
    if(names.isEmpty())
    {
        System.out.println("ArrayList is empty");
    }
    Object[] moreNames = new Object[4];
    moreNames = nameCopy.toArray();
    
        System.out.println(Arrays.toString(moreNames));
        //System.out.println(moreNames);
    
}
}

//[John Adams, Angel Ivanov, Jack Ryan]
//John Adams
//Angel Ivanov
//Jack Ryan
//John Adams
//Angel Ivanov
//Jack Ryan
//[John Adams, Angel Ivanov, Jack Ryan]
//Paul is here
//Everything in nameCopy is in names
//ArrayList is empty
////[John Adams, Angel Ivanov, Jack Ryan]
