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
public interface Observer {
    
    public void update(Subject subject);
    
    public void setSubject(Subject subject);
    
    
}
