/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Josue Ruiz
 */
public class DateFormatter {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    public String getCurrentTimeStamp() {
        
        return sdf.format(new Date());
    }
    
    public Date getDateFormat(String timestamp) throws ParseException{
        return sdf.parse(timestamp);
    }
    
    public String getStringDate(Date date){
        return sdf.format(date);
    }
}
