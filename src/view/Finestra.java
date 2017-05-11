/*
 * http://www.channel4.com/programmes/skins/on-demand/41227-001
 */
package view;

import controller.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    JPanel JP21 = new JPanel();
    JPanel JP22 = new JPanel();
    JPanel JP23 = new JPanel();
    JPanel JP24 = new JPanel();
    JButton JB10 = new JButton();
    JButton JB11 = new JButton();
    JButton JB12 = new JButton();
    JTextField ORO = new JTextField();
    JTextField JTF = new JTextField();
    
    JButton JB0 = new JButton("0");
    JButton JB1 = new JButton("1");
    JButton JB2 = new JButton("2");
    JButton JB3 = new JButton("3");
    JButton JB4 = new JButton("4");
    JButton JB5 = new JButton("5");
    JButton JB6 = new JButton("6");
    JButton JB7 = new JButton("7");
    JButton JB8 = new JButton("8");
    JButton JB9 = new JButton("9");
    JButton JBp = new JButton("+");
    JButton JBm = new JButton("-");
    JButton JBx = new JButton("*");
    JButton JBd = new JButton("/");
    JButton JBc = new JButton(",");
    JButton JBe = new JButton("ENTER");
    JButton JBw = new JButton("WIPE");
    JButton JBpi = new JButton("π");
    JButton JBsqrt = new JButton("√");
    JButton JBsqrd = new JButton("x^2");
    
    String primoTermine;
    public Finestra(String s){
        super(s);
        ORO.setColumns(5);
        ORO.setSize(50, 60);
        ORO.setText(or.getD());
        ORO.setEditable(false);
        JTF.setColumns(25);
        JTF.setSize(350, 60);
        JTF.setEditable(false);
        JTF.setText("");
        JP1.add(JTF);
        JP1.add(ORO);
        JP2.setLayout(new GridLayout(5, 3));
        /*
        JP2.add(JP21);
        JP2.add(JP22);
        JP2.add(JP23);
        JP2.add(JP24);
        */
        JBp.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){   
                    primoTermine=JTF.getText();
                }
            }
        );
        JBm.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){   
                    primoTermine=JTF.getText();
                }
            }
        );
        JBx.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){   
                    primoTermine=JTF.getText();
                }
            }
        );
        JBd.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){   
                    primoTermine=JTF.getText();
                }
            }
        );
        JP2.add(JBp);
        JP2.add(JBm);
        JP2.add(JBx);
        JP2.add(JBd);
        JP2.add(JB9);
        JP2.add(JB8);
        JP2.add(JB7);
        JP2.add(JB6);
        JP2.add(JB5);
        JP2.add(JB4);
        JP2.add(JB3);
        JP2.add(JB2);
        JP2.add(JB1);
        JP2.add(JB0);
        JP2.add(JBc);
        JP2.add(JBe);
        JP2.add(JBw);
        JP2.add(JBpi);
        JP2.add(JBsqrd);
        JP2.add(JBsqrt);
        add(JP1);
        add(JP2);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //addWindowListener(AF);
        setLayout(new GridLayout(2, 1));
        setVisible(true);
        
    }
    public String getTextField(){
        return JTF.getText();
    }
    public void setTextField(String replace){
        JTF.setText(replace);
    }
}
