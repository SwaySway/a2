/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author josue
 */
public class userWindow extends javax.swing.JFrame {

    /**
     * Creates new form userWindow
     */
    // Variables declaration//
    private javax.swing.JButton followUser;
    private javax.swing.JList<String> followingList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> newsFeed;
    private javax.swing.JButton postTweet;
    private javax.swing.JTextField tweetMessage;
    private javax.swing.JTextField userid;
    private javax.swing.JLabel creationTime;
    private String creationTimeStamp;
    private String lastUpdatedTimeStamp;
    private javax.swing.JLabel lastUpdated;
    private TreeHandler datatree;
    private SocialUser user;
    private messageBox message = new messageBox();
    private DefaultListModel following = new DefaultListModel();
    
    
    
    public userWindow(TreeHandler datatree, SocialUser user){
        creationTimeStamp = user.getCreationTimeStamp();
        this.datatree = datatree;
        this.user = user;
        user.setPanel(this);
        initComponents();
        showFollowing();
        this.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        userid = new javax.swing.JTextField();
        followUser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        followingList = new javax.swing.JList<>();
        tweetMessage = new javax.swing.JTextField();
        postTweet = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        newsFeed = new javax.swing.JList<>();
        newsFeed.setModel(user.getNewsModel());
        creationTime = new JLabel();
        lastUpdated = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
         setTitle("Hello "+user.getID());
        setResizable(false);
        creationTime.setText("Created: "+creationTimeStamp);
        lastUpdated.setText("Last Udpated: "+user.getlastUpdate());
        userid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userid.setText("User ID");
        userid.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                userid.setText("");
            }
        });
        
        followUser.setText("Follow User");
        followUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followUserActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(followingList);

        tweetMessage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tweetMessage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tweetMessage.setText("Tweet Message");
        tweetMessage.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                tweetMessage.setText("");
            }
        });

        postTweet.setText("Post Tweet");
        postTweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postTweetActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(newsFeed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(creationTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(lastUpdated)
                .addGap(144, 144, 144))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(tweetMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(postTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(followUser, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creationTime)
                    .addComponent(lastUpdated))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(followUser, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tweetMessage)
                    .addComponent(postTweet, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold> 
    
    private void followUserActionPerformed(ActionEvent evt) {
        String findUserID = userid.getText().trim();
        findUserID = findUserID.replaceAll("\\s+","");
        if(findUserID.equals("User ID") || findUserID.equals("")){
            return;
            //essentially do nothing
            //does this so it dosen't waste time with next if
        }
        if(datatree.contains(findUserID)){
            SocialUser foundUser = (SocialUser) datatree.getUser(findUserID);
            attach(foundUser);
            
        }else{
            message.alert("User Not Found!");
        }
        
    }
    
     private void postTweetActionPerformed(ActionEvent evt) {
        String tweet = tweetMessage.getText().trim();
        this.user.postTweet(tweet);
    }

    private void attach(SocialUser foundUser) {
        if(followingCheck(foundUser)){
            user.setSubject(foundUser);
            foundUser.attach(user);
            updateList(foundUser);
        }
        else{
            return;
        }
}

    private boolean followingCheck(User foundUser) {
        ArrayList followers = user.getFollowers();
        if(followers.contains(foundUser)){
            message.alert("Already following this user!");
            return false;
        }
        if(foundUser.getID().equals(user.getID())){
            message.alert("You cannot follow yourself!");
            return false;
        }
        return true;
    }
    
    public void lastUpdateLabel(String updateTimeStamp){
        this.lastUpdatedTimeStamp = updateTimeStamp;
        lastUpdated.setText("Last Updated: "+ lastUpdatedTimeStamp);
    }

    private void updateList(SocialUser user) {
       following.addElement("- "+user.getID());
       //followingList.setModel(following);
    }

    private void showFollowing() {
        following.addElement("Users you are following: ");
        ArrayList<SocialUser> followingUserList = user.getFollowers();
        for(SocialUser users : followingUserList){
            following.addElement("- "+users.getID());
        }
        followingList.setModel(following);
    }
    
   
}
   