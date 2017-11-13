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
public class GroupTotal implements Visitor {
    private int total = 0;
    @Override
    public void visit(User user) {
        if(user instanceof Group){
            total++;
        }
    }
    
    public int getTotal(){
        return total;
    }
    
}
