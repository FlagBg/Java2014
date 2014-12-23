/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam4_2;

/**
 *
 * @author THE NET
 */
public class Exam4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String imena[] = {"Иван","Мария","Петър","Ивайло","Марин"};
       низовеЗапочващиС(imena, "и");
    }
    
    public static void низовеЗапочващиС(String m[], String search){
        System.out.println("Елементи съдържащи 'и'" + search + ":");
        
            for (int i=0; i<m.length; i++)
                if (m[i].toLowerCase().contains(search.toLowerCase()))
            
                    System.out.println(m[i]);
                
    }
}
