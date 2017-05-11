package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.*;
/**
 *
 * @author user
 */
public class AscoltatoreBottone implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if(s.equalsIgnoreCase("0")|| s.equalsIgnoreCase("1") || s.equalsIgnoreCase("2") ){
            
        }
        // classe inutile
        
    }
    
}