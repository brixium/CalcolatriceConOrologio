/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author asolan.lorenzo
 */
public class Finestra extends JFrame{
    AscoltatoreFinestra AF = new AscoltatoreFinestra();
    JPanel JP1 = new JPanel();
    JPanel JP2 = new JPanel();
    JPanel JP3 = new JPanel();
    JPanel JP4 = new JPanel();
    JPanel JP5 = new JPanel();
    JPanel JP6 = new JPanel();
    JButton JB10 = new JButton();
    JButton JB11 = new JButton();
    JButton JB12 = new JButton();
    //JTextArea JTA = new JTextArea();
    JTextField JTF = new JTextField();
    public Finestra(String s){
        super(s);
        
        JTF.setEditable(false);
        JP1.add(JTF);
        JTF.setText("Hello");
        add(JP1);
        add(JP2);
        add(JP3);
        add(JP4);
        add(JP5);
        add(JP6);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //addWindowListener(AF);
        setLayout(new GridLayout(6, 1));
        setVisible(true);
        
        
        
    }
}
