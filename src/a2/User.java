/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.util.ArrayList;
import javax.swing.tree.*;

/**
 *
 * @author josue
 */
public abstract class User extends DefaultMutableTreeNode{
    
    public abstract void setID (String ID);
    
    public abstract String getID();
   
    public abstract String getCreationTimeStamp();
    
    @Override
    public abstract String toString();

}
