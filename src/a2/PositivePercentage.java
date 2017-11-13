/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.util.*;

/**
 *
 * @author josue
 */
public class PositivePercentage implements Visitor {
    
    //Would put them into a textfile but time constraints
    String[] positiveKeywords = {"good", "positive", "able", "accept", "beatify", "care", "empathy", "fantastic", 
        "generous", "wholesome", "like", "love", "luv", "fam", "yas"};
    
    double total;
    double messageTotal;
    
    @Override
    public void visit(User user) {
        if(user instanceof SocialUser){
           Object[] listofmessages = ((SocialUser)user).getMessages();
           String[] messages = Arrays.copyOf(listofmessages, listofmessages.length, String[].class);
           messageTotal += messages.length-1;
           for(String currentWord : positiveKeywords){
               for(String currentMsg : messages){
                   if(currentMsg.toLowerCase().contains(currentWord)){
                       total++;
                   }
               }
           }
        }
    }
    
    public double getTotal(){
        return ((total*100.00)/messageTotal);
    }
}
