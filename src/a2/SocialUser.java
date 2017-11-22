/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.util.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author josue
 */
public class SocialUser extends User implements Observer, Subject {
    
    private String tweeterID;
    
    private String message;
    
    private String timeStampCreation;
    
    private String lastUpdate = "";
    
    private userWindow userwindow;
    
    //List of followers
    private List<Observer> followerList = new ArrayList<Observer>();
    
    //List of people user is following
    private List<Subject> followedList = new ArrayList<Subject>();
    //list of news to send out
    //will automatically sent due to the type being dfm
    private DefaultListModel newsList = new DefaultListModel();
  
    
    public SocialUser(String id){
        timeStampCreation = new DateFormatter().getCurrentTimeStamp();
        setID(id);
        newsList.addElement("Tweet Feed:");
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
        String updates = subject.getUpdate(this);
        String tweetUpdate = "- "+subject.toString()+": "+updates;
        newsList.addElement(tweetUpdate);
    }

    @Override
    public void setSubject(Subject subject) {
        followedList.add(subject);
    }
    
    public void updateTimeStamp(){
        this.lastUpdate = new DateFormatter().getCurrentTimeStamp();
        userwindow.lastUpdateLabel(lastUpdate);
    }
    
    public String getlastUpdate(){
        return lastUpdate;
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
        for(Object user : followerList){
            ((Observer) user).update(this);
            ((SocialUser) user).updateTimeStamp();
        }
    }
    

    @Override
    public String getUpdate(Observer obs) {
       return this.message;
    }
    
    public void postTweet(String tweet){
        this.message = tweet;
        this.updateTimeStamp();
        newsList.addElement("-"+this.getID()+": "+tweet);
        notifyObservers();
    }
    
    public Object[] getMessages(){
        return this.newsList.toArray();
    }
    
    public ArrayList getFollowers(){
        return (ArrayList) followedList;
    }
    
    public DefaultListModel getNewsModel(){
        return this.newsList;
    }

    @Override
    public String getCreationTimeStamp() {
        return timeStampCreation;
    }

    void setPanel(userWindow userwindow) {
        this.userwindow = userwindow;
    }
    
}
