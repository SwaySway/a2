/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

/**
 *
 * @author Josue Ruiz
 */
public class Verification implements Visitor{
    String currentUserID;
    String currentGroupID;
    boolean verified = true;
    
    @Override
    public void visit(User user) {
       if(user instanceof SocialUser){
           if(currentUserID == null){
               currentUserID = user.getID();
               return;
           }
           if((!currentUserID.equals(user.getID())) 
                   && user.getID().equals(user.getID().replaceAll("\\s+",""))){
               currentUserID = user.getID();
           }else{
                verified = false;
           }
       }
       if(user instanceof Group){
          if(currentGroupID == null){
               currentGroupID = user.getID();
               return;
           }
           if((!currentGroupID.equals(user.getID())) 
                   && user.getID().equals(user.getID().replaceAll("\\s+",""))){
               currentGroupID = user.getID();
           }else{
                verified = false;
           } 
       }
    }

    public String verdict() {
        if(verified){
            return "User/Group ID's verified!";
        }
        return "User/Group ID's not verified!";
    }
    
}
