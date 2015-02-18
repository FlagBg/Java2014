/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author THE NET
 */
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal[] myAnimals = new Animal[5];
        Animal fluffy = new Cat();
        Animal sharo = new Dog();
        
       // fluffy.onlyForCat();
        
        myAnimals[0] = fluffy;
        myAnimals[1] = sharo;
        
        myAnimals[0].makeNoise();
        myAnimals[1].makeNoise();
        
        fluffy.makeNoise();
        sharo.makeNoise();
        
    }
    
}
