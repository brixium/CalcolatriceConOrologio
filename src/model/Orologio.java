/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.time.*;
import java.util.Calendar;

/**
 *
 * @author user
 */
public class Orologio {
    Date da;
    public Orologio(){
        da = new Date();
    }
    public String getD(){
        String r = da.toString();
        r= r.substring(11);
        return r;
    }
}
