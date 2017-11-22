/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josue Ruiz
 */
public class LatestUpdate implements Visitor {
    private Date currentTimeStamp;
    private Date newTimeStamp;
    private String userid;
    private messageBox alertMsg = new messageBox();
    private DateFormatter gts = new DateFormatter();
   
    
    @Override
    public void visit(User user) {
       try 
       {
            if(user instanceof SocialUser){
                if(currentTimeStamp == null){
                    String temp = ((SocialUser) user).getlastUpdate();
                    if(temp.equals("")){
                        alertMsg.alert("No Updated Message!");
                        return;
                    }
                    currentTimeStamp = gts.getDateFormat(temp);
                    userid = user.getID();
                }else{
                    String newtimestampStr = ((SocialUser) user).getlastUpdate();
                    newTimeStamp = gts.getDateFormat(newtimestampStr);
                    if(newTimeStamp.after(currentTimeStamp)){
                        currentTimeStamp = newTimeStamp;
                        userid = user.getID();
                    }
                }
            }
       } catch (ParseException ex) {
           Logger.getLogger(LatestUpdate.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public String userwithLatestUpdate(){
       return userid;
    }
    
}
