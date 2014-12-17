/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam5_8;

/**
 *
 * @author THE NET
 */
public class Dog {
    private String Poroda;
    private int age;

    public String getPoroda() {
        return Poroda;
    }

    public void setPoroda(String Poroda) {
        this.Poroda = Poroda;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String Poroda, int age) {
        this.Poroda = Poroda;
        this.age = age;
    }
    public void moetoDog(){
        
       System.out.println(" и моето куче е " + Poroda + " и е на " + age + " години");
    }
    
}
