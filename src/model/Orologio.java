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
        if(LocalDateTime.now().getHour()>=0 && LocalDateTime.now().getHour()<10){
            b= b+"0"+LocalDateTime.now().getHour();
        }else{
            b= b+""+LocalDateTime.now().getHour();
        }
        if(LocalDateTime.now().getMinute()>=0 && LocalDateTime.now().getMinute()<10){
            b= b+":0"+LocalDateTime.now().getMinute();
        }else{
            b= b+":"+LocalDateTime.now().getMinute();
        }
        if(LocalDateTime.now().getSecond()>=0 && LocalDateTime.now().getSecond()<10){
            b= b+":0"+LocalDateTime.now().getSecond();
        }else{
            b= b+":"+LocalDateTime.now().getSecond();
        }
        return b;
    }
}