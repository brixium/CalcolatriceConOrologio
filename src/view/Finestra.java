/*
 * http://www.channel4.com/programmes/skins/on-demand/41227-001
 */
package view;

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
    String ope; // + - * /
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
        
        ActionListener viaTempo = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ORO.setText(or.getD());
            }
        };
        Timer t = new Timer(1000, viaTempo);
        t.start();
        
        
        JBp.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){   
                    primoTermine=JTF.getText();
                    ope="+";
                    JTF.setText("");
                }
            }
        );
        JBm.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){   
                    primoTermine=JTF.getText();
                    ope="-";
                    JTF.setText("");
                }
            }
        );
        JBx.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){   
                    primoTermine=JTF.getText();
                    ope="*";
                    JTF.setText("");
                }
            }
        );
        JBd.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){   
                    primoTermine=JTF.getText();
                    ope="/";
                    JTF.setText("");
                }
            }
        );
        JBe.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    try{
                        String secondoTermine=JTF.getText();
                        if(ope.equals("+")){
                            double r=Double.parseDouble(primoTermine)+Double.parseDouble(secondoTermine);
                            JTF.setText(r+"");
                        }else if(ope.equals("-")){
                            double r=Double.parseDouble(primoTermine)-Double.parseDouble(secondoTermine);
                            JTF.setText(r+"");
                        }else if(ope.equals("*")){
                            double r=Double.parseDouble(primoTermine)*Double.parseDouble(secondoTermine);
                            JTF.setText(r+"");
                        }else if(ope.equals("/")){
                            double r=Double.parseDouble(primoTermine)/Double.parseDouble(secondoTermine);
                            JTF.setText(r+"");
                        }else{
                            JTF.setText("NAN");
                        }
                    }catch(java.lang.NumberFormatException exc){
                        System.err.println(exc);
                    }
                }
            }
        );
        JBw.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    primoTermine="";
                    JTF.setText("");
                }
            }
        );
        JBc.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    if(!JTF.getText().contains(".")){
                        JTF.setText(JTF.getText()+".");
                    }
                }
            }
        );
        JBpi.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){   
                    JTF.setText("3.14");
                }
            }
        );
        JBsqrt.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    JTF.setText(""+Math.sqrt(Double.parseDouble(JTF.getText())));
                }
            }
        );
        JBsqrd.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    JTF.setText(""+(Double.parseDouble(JTF.getText()))*Double.parseDouble(JTF.getText()));
                }
            }
        );
        JB0.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    if(!JTF.getText().equals("")){
                        JTF.setText(JTF.getText()+"0");
                    }
                }
            }
        );
        JB1.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    JTF.setText(JTF.getText()+"1");
                }
            }
        );
        JB2.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    JTF.setText(JTF.getText()+"2");
                }
            }
        );
        JB3.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    JTF.setText(JTF.getText()+"3");
                }
            }
        );
        JB4.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    JTF.setText(JTF.getText()+"4");
                }
            }
        );
        JB5.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    JTF.setText(JTF.getText()+"5");
                }
            }
        );
        JB6.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    JTF.setText(JTF.getText()+"6");
                }
            }
        );
        JB7.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    JTF.setText(JTF.getText()+"7");
                }
            }
        );
        JB8.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    JTF.setText(JTF.getText()+"8");
                }
            }
        );
        JB9.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    JTF.setText(JTF.getText()+"9");
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
        JP2.add(JBpi);
        JP2.add(JBw);
        JP2.add(JBsqrt);
        JP2.add(JBsqrd);
        JP2.add(JBe);
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