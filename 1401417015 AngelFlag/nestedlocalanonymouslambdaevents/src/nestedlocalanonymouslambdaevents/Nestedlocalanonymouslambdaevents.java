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
public class Nestedlocalanonymouslambdaevents {

    /**
     * @param args the command line arguments
     */
    
    private static class NestedListener implements MyEventHandler{

        @Override
        public void happened(Object sender) {
            System.out.println("Something happend. Event handler in my nested class");
        }
        
    }
    
    
    
    public static void main(String[] args) {
        Notifier notifier = new Notifier();
        notifier.doSomething();
        notifier.onSomething = new Listener();
        notifier.doSomething();
    }
    
}
