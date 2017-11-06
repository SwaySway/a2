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
public interface Subject {
    
    public void attach(Observer obs);
    
    public void detach(Observer obs);
    
    public void notifyObservers();
    
    public String getUpdate(Observer obs);
    
}
