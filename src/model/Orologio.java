package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.*;

/**
 *
 * @author user
 */
public class Orologio {
    private DateFormat dF = new SimpleDateFormat("HH:mm:ss");
    private Date da=new Date();
    private String b="";

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