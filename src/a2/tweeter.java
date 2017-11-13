/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.util.*;

/**
 *
 * @author josue
 */
public class tweeter extends User implements Observer, Subject {
    
    private String tweeterID;
    
    private String message;
    
    //List of followers
    private List<Observer> followerList = new ArrayList<Observer>();
    
    //List of people user is following
    private List<Subject> followedList = new ArrayList<Subject>();
    //list of news to send out
    private List<String> newsList = new ArrayList<String>();
    
    public tweeter(String id){
        setID(id);
        this.allowsChildren=false;
    }

   @Override
    public void setID(String ID) {
       this.tweeterID = ID;
    }

    @Override
    public String getID() {
        return tweeterID;
    }

    @Override
    public String toString() {
        return this.getID();
    }

    @Override
    public void update(Subject subject) {
        String updates = getUpdate(this);
        String tweetUpdate = "- "+subject.toString()+": "+updates;
        this.newsList.add(tweetUpdate);
    }

    @Override
    public void setSubject(Subject subject) {
        followedList.add(subject);
    }

    @Override
    public void attach(Observer obs) {
        followerList.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        followerList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        
       
    }

    @Override
    public String getUpdate(Observer obs) {
       return this.message;
    }
    
    public Object[] getMessages(){
        return this.newsList.toArray();
    }
    
}
