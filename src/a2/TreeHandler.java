/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.util.*;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author josue
 */
public class TreeHandler implements Visitable, DataTree {
    
    private Map<String, User> t_map;
    private DefaultTreeModel tree;
    private messageBox message = new messageBox();

    TreeHandler(Map<String, User> map) {
        User root = new Group("Root");
        this.t_map = map;
        this.tree = new DefaultTreeModel(root);
        map.put(root.getID(), root);
    }
    
    
    @Override
    public boolean addNode(User parentUser, User currentUser) {
      if(contains(currentUser.getID())){
          message.alert("User already exists!");
          return false;
      }if(!parentUser.getAllowsChildren()){
          message.alert("Cannot create a user here - Select a group or root first!");
          return false;
      }
      t_map.put(currentUser.getID(),currentUser);
      tree.insertNodeInto(currentUser, parentUser, parentUser.getChildCount());
      return true;
    }

    @Override
    public boolean contains(String ID) {
        return t_map.containsKey(ID);
    }

    @Override
    public User getUser(String ID) {
        if(contains(ID)){
            return t_map.get(ID);
        }
        return null;
    }

    @Override
    public DefaultTreeModel getModel() {
        return this.tree;
    }

    @Override
    public void accept(Visitor visitor) {
        for(Map.Entry<String,User> current:t_map.entrySet()){
            visitor.visit(current.getValue());
        }
    }
    
    
}
