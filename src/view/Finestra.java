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
    
    private Orologio or = new Orologio();
    private JPanel JP1 = new JPanel();
    private JPanel JP2 = new JPanel();
    private JTextField ORO = new JTextField();
    private JTextField JTF = new JTextField();
    
    private JButton JB0 = new JButton("0");
    private JButton JB1 = new JButton("1");
    private JButton JB2 = new JButton("2");
    private JButton JB3 = new JButton("3");
    private JButton JB4 = new JButton("4");
    private JButton JB5 = new JButton("5");
    private JButton JB6 = new JButton("6");
    private JButton JB7 = new JButton("7");
    private JButton JB8 = new JButton("8");
    private JButton JB9 = new JButton("9");
    private JButton JBplus = new JButton("+");
    private JButton JBminus = new JButton("-");
    private JButton JBmultiply = new JButton("*");
    private JButton JBdivide = new JButton("/");
    private JButton JBcomma = new JButton(",");
    private JButton JBenter = new JButton("ENTER");
    private JButton JBwipe = new JButton("WIPE");
    private JButton JBclearLast = new JButton("CLEAR LAST");
    private JButton JBsqrt = new JButton("√");
    private JButton JBsqrd = new JButton("x^2");
    
    private String primoTermine;
    private String ope; // + - * /
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

        JBplus.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){   
                    primoTermine=JTF.getText();
                    ope="+";
                    JTF.setText("");
                }
            }
        );
        JBminus.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){   
                    primoTermine=JTF.getText();
                    ope="-";
                    JTF.setText("");
                }
            }
        );
        JBmultiply.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){   
                    primoTermine=JTF.getText();
                    ope="*";
                    JTF.setText("");
                }
            }
        );
        JBdivide.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){   
                    primoTermine=JTF.getText();
                    ope="/";
                    JTF.setText("");
                }
            }
        );
        JBenter.addActionListener(
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
        JBwipe.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    primoTermine="";
                    ope="";
                    JTF.setText("");
                }
            }
        );
        JBcomma.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){
                    if(!JTF.getText().contains(".")){
                        JTF.setText(JTF.getText()+".");
                    }
                }
            }
        );
        JBclearLast.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent e){   
                    JTF.setText("");
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
            
        JP2.add(JBplus);
        JP2.add(JBminus);
        JP2.add(JBmultiply);
        JP2.add(JBdivide);
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
        JP2.add(JBcomma);        
        JP2.add(JBclearLast);
        JP2.add(JBwipe);
        JP2.add(JBsqrt);
        JP2.add(JBsqrd);
        JP2.add(JBenter);
        add(JP1);
        add(JP2);
        setSize(450,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1, 0, 0));
        setVisible(true);
    }
}