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
public class Notifier {
    
    public MyEventHandler onSomething;
    
    public void doSomething(){
        System.out.println("Do something was called");
        if (onSomething != null) {
            onSomething.happened(this);
            
            
        }
    }
}
