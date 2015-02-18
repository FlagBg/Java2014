/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractis;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JavaPractis extends JFrame {
    
    
    public JPanel gorenPanel = new JPanel();
    public JPanel dolenPanel = new JPanel();
    
    public JLabel fLabel = new JLabel("First Name");
    public JLabel lLabel = new JLabel("Last Name");
    public JLabel ageLabel = new JLabel("Age");
    
    public JButton addButton = new JButton("Add");
    public JButton editButton = new JButton("Edit");
    public JButton deleteButton = new JButton("Delete");
    public JButton printButton = new JButton("Print All");
    
    public JTextField firstNameText = new JTextField();
    public JTextField lastNameText = new JTextField();
    public JTextField ageNameText = new JTextField();
    
    public ArrayList<Person> PersonList = new ArrayList();
    
    public JavaPractis(){
        super();
        this.setSize(500,500);
        this.setLocation(200,300);
        this.setLayout(new GridLayout(2,1));
        
        this.add(gorenPanel);
        this.add(dolenPanel);
        
        this.add(fLabel);
        this.add(lLabel);
        this.add(ageLabel);
        
        //upPanel
        gorenPanel.setLayout(new GridLayout(3,2));
        gorenPanel.add(fLabel);
        gorenPanel.add(firstNameText);
        gorenPanel.add(lLabel);
        gorenPanel.add(lastNameText);
        gorenPanel.add(ageLabel);
        gorenPanel.add(ageNameText);
        
        
        dolenPanel.setLayout(new FlowLayout());
        dolenPanel.add(addButton);
        dolenPanel.add(editButton);
        dolenPanel.add(deleteButton);
        dolenPanel.add(printButton);
        
        //public JButton addButton = new JButton("ADD");
        
        addButton.addActionListener(new ButtonListener());
        //editButton.addActionListener(null);
        
        //
        
    }
    
    
   
    public static void main(String[] args) {
        JavaPractis Practise = new JavaPractis();
        Practise.setVisible(true);
        Practise.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
    }

    private LayoutManager FlowLayout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
