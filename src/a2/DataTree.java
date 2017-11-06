/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author josue
 */
public interface DataTree {
    
    public boolean addNode(User Node, User users);
    
    public boolean contains(String ID);
    
    public User getUser(String ID);
    
    public DefaultTreeModel getModel();
    
    
    
}
