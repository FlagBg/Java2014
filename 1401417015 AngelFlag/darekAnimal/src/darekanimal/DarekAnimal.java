/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darekanimal;


public class DarekAnimal {
    
    public static void main(String[] args) {
       
        Animal genericAnimal = new Animal();
        
        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);
        
        Cats morris = new Cats("Morris", "Tuna", "Rubber mouse");
        
        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.favToy);
        
        Animal tabby = new Cat("Tabby", "Salmon", "Ball");
        
        acceptAnimal(tabby);
    }
        public static void acceptAnimal(Animal randAnimal){
        System.out.println();
        System.out.println(randAnimal.getName());
        System.out.println(randAnimal.favFood);
        System.out.println();
        
        randAnimal.walkAround();
        
        System.out.println(randAnimal.favFood);
        Cats tempCat = (Cats) randAnimal;
        System.out.println(tempCat.favToy);
        
        System.out.println(((Cats)randAnimal).favToy);
       // ((Cats)randAnimal)
        if( randAnimal instanceof Cats){
            System.out.println(randAnimal.getName() + "is a Cat");
        }
    }
}

    

