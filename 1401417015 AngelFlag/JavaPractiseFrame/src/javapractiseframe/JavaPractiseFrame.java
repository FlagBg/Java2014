/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractiseframe;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class JavaPractiseFrame extends JFrame
{
    private static final long serialVersionUID = 1L;
    
    public Jpanel1 panel = new Jpanel1();
    //public Jpanel2 panel = new Jpanel2();
    
        public JTextField TextField2 = new JTextField("ADD",8);
        public JTextField TextField3 = new JTextField("EDIT",8);
        public JTextField TextField4 = new JTextField("DELETE",8);
        public JTextField TextField5 = new JTextField("PRINT ALL",8);
    
    public JButton button1 = new JButton();
    
    public JavaPractiseFrame(){
        super();
        this.setSize(500,500); 
        this.setLocation(640,500);
        this.setLayout(new GridLayout(2,3));
        //this.add(panel);
        this.add(TextField2);
        this.add(TextField3);
        
                
        
        
        //panel.setLayout(new GridLayout(3,3));
       //panel.add(TextField2);
        //panel.add(TextField3);
        //panel.add(TextField4);
        
        
    }
    public static void main(String[] args) {
        JavaPractiseFrame Practise = new JavaPractiseFrame();
        Practise.setVisible(true);
        Practise.setDefaultCloseOperation(EXIT_ON_CLOSE);
            
        }
    }
    

