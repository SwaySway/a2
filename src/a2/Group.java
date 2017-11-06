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
public class Group extends User {

    private String id;
    
    public Group(String ID){
        setID(ID);
    }
    
    @Override
    public void setID(String ID) {
        this.id = ID;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String toString() {
        return this.getID();
    }
   
}
