/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.*;
import java.awt.*;
import javax.swing.*;
import model.*;

/**
 *
 * @author asolan.lorenzo
 */
public class Finestra extends JFrame{
    AscoltatoreFinestra AF = new AscoltatoreFinestra();
    Orologio or = new Orologio();
    JPanel JP1 = new JPanel();
    JPanel JP2 = new JPanel();
    JPanel JP3 = new JPanel();
    JPanel JP4 = new JPanel();
    JPanel JP5 = new JPanel();
    JPanel JP6 = new JPanel();
    JButton JB10 = new JButton();
    JButton JB11 = new JButton();
    JButton JB12 = new JButton();
    JTextField ORO = new JTextField();
    JTextField JTF = new JTextField();
    public Finestra(String s){
        super(s);
        ORO.setColumns(5);
        ORO.setSize(50, 60);
        ORO.setText(or.getD());
        ORO.setEditable(false);
        JTF.setColumns(25);
        JTF.setSize(350, 60);
        JTF.setEditable(false);
        JTF.setText("Numeri qui");
        JP1.add(JTF);
        JP1.add(ORO);
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
