/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractise;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JavaPractise extends JFrame{
    
    
    private static final long serialVersionUID = 1L;
    public JButton button1 = new JButton("button1");
    //2. TextField1 = vizualen komponent i dobavyame stoinost s ADD v konstruktora
    //3. predi da dobavim koi komponenti dobavyame tryabva dakajeme koi layout. pak otivame v konstruktora
    //4. suzdaveme oshte poleta
     public JTextField TextField2 = new JTextField("second field",8);
     public JTextField TextField3 = new JTextField("third field",8);
     public JTextField TextField4 = new JTextField("fourth field",8);
     public JTextField TextField5 = new JTextField("fifth field",8);
     public JTextField TextField6 = new JTextField("sixth field",8);
     public JTextField TextField7 = new JTextField("seventh field",8);
     public JPanel panel = new JPanel();//Panel
     
    public JavaPractise(){
        super();
        this.setSize(300, 300); 
        this.setLocation(640,500);
        this.setLayout(new GridLayout(3,3));
        this.add(button1);
        this.add(TextField2);
        this.add(TextField3);
        this.add(TextField4);
        this.add(TextField5);
        //this.add(TextField6);
        //this.add(TextField7);
        this.add(panel);
                
        panel.setLayout(new GridLayout(1,2));
        panel.add(TextField6);
        panel.add(TextField7);
        
        button1.addActionListener(new ButtonListener()); //tryabva da suzdadem class i da go import kato interface(t.e, implement
    }
    
    public static void main(String[] args) {
        JavaPractise Practise = new JavaPractise();
        Practise.setVisible(true);
        Practise.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //dotuk sme suzdali JFrame;
        //JTextField(20)
        //JButton("OK") - tova e string, koito potrebitelyat go vijda
        //JLabel(" ")
        //JComboBox(String[])
        //JTable(array[],array[][]) - pravi tablica na ekrana
        //suzdavame dve textovi poleta! start!, otivame nad construktora i pravim textovo pole JTextField1
        
        //suzdavame button, tova e add. listener, dobavyame go sled dobavyaneto
    }
    
}
