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
public class TreeHandler implements DataTree {
    
    private Map<String, User> t_map;
    private DefaultTreeModel tree;

    TreeHandler(Map<String, User> map) {
        User root = new Group("Root");
        this.t_map = map;
        this.tree = new DefaultTreeModel(root);
        map.put(root.getID(), root);
    }
    
    
    @Override
    public boolean addNode(User Node, User users) {
      //Users root = new UserGroup("root");
      return true;
    }

    @Override
    public boolean contains(String ID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public User getUser(String ID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DefaultTreeModel getModel() {
        return this.tree;
    }
    
    
}
