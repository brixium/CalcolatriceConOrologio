/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.*;
import java.util.Calendar;

/**
 *
 * @author user
 */
public class Orologio {
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    Date da=new Date();
    String b="";

    public String getD(){
        b="";
        b= b+""+LocalDateTime.now().getHour();
        b= b+":"+LocalDateTime.now().getMinute();
        b= b+":"+LocalDateTime.now().getSecond();
        return b;
    }
}