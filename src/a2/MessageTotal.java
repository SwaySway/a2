/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

/**
 *
 * @author josue
 */
public class MessageTotal implements Visitor {
    int total = 0;
    
    @Override
    public void visit(User user) {
        if(user instanceof SocialUser){
           total += ((SocialUser) user).getMessages().length;
        }
    }
    
    public int getTotal(){
        return total;
    }
}
