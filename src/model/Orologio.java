/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.time.*;

/**
 *
 * @author user
 */
public class Orologio {
    Date da = new Date();
    public Orologio(){
        //System.out.println(da.toString());
    }
    public String getD(){
        return da.toString();
    }
}
