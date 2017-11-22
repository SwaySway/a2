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
    
    private String creationTimeStamp;
    
    public Group(String ID){
        creationTimeStamp = new DateFormatter().getCurrentTimeStamp();
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

    @Override
    public String getCreationTimeStamp() {
        return creationTimeStamp;
    }
   
}
