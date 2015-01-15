/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedlocalanonymouslambdaevents;

/**
 *
 * @author THE NET
 */
public class Listener implements MyEventHandler {
    
    @Override
    public void happened(Object sender){
        System.out.println("The Event was Triggered");
    }
}
