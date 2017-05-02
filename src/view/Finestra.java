/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.*;
import javax.swing.JFrame;

/**
 *
 * @author asolan.lorenzo
 */
public class Finestra extends JFrame{
    AscoltatoreFinestra AF = new AscoltatoreFinestra();
    public Finestra(String s){
        super(s);
    }
}
