/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darek15interfaces;

/**
 *
 * @author THE NET
 */
public abstract class Crashable {
    boolean carDrivable = true;
    
    public void youCrashed(){
        this.carDrivable = false;
    }
    
    public abstract void setCarStrength(int carStrenght);
    
    public abstract int getCarStrenthg();
    
}
