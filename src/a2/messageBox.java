/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class messageBox {
    //A simple class which uses Joption pane to create an alert message to the user
    public void inform(String message, String title){
        JOptionPane.showMessageDialog(null, message,"Message: "+title, JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void alert(String message){
        JOptionPane.showMessageDialog(null, message, "Alert!", JOptionPane.ERROR_MESSAGE);
    }
   
}
