/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat;

/**
 *
 * @author THE NET
 */
public class cat {
    
        private String name;
        private String color;

    cat(String johny, String green) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return this.color;  
    }
    
    public void setColor(String color) {
        this.color = color;  
    }

    public cat(){
        this.name= "Lisi";
        this.color= "gray";
    }
        
    /**
     *
     */
    public void sayMiau(){
        System.out.printf("Cat %s said: Miauuuuuu!%n", name);
    }
    
    }