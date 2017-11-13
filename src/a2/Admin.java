/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import javax.swing.*;
import javax.swing.tree.TreePath;

/**
 *
 * @author josue
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        
        //Code generated by netbeans
        datatree = new TreeHandler(new HashMap<String, User>() {});
        addGroup = new javax.swing.JButton();
        userID = new javax.swing.JTextField();
        groupID = new javax.swing.JTextField();
        userView = new javax.swing.JButton();
        userTotal = new javax.swing.JButton();
        groupTotal = new javax.swing.JButton();
        messagesTotal = new javax.swing.JButton();
        positivePercentage = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tree = new JTree(datatree.getModel());
        addUser = new javax.swing.JButton();
        
       
      

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AdminWindow");
        setResizable(false);

        addGroup.setText("Add Group");
        addGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupActionPerformed(evt);
            }
        });

        userID.setText("UserID");
        userID.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                userID.setText("");
            }
        });

        groupID.setText("GroupID");
        groupID.addMouseListener(new MouseAdapter(){
           
            @Override
            public void mouseClicked(MouseEvent e){
                
                groupID.setText("");
                
            }   
        });

        userView.setText("Open User View");
        userView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userViewActionPerformed(evt);
            }
        });

        userTotal.setText("Show User \nTotal");
        userTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTotalActionPerformed(evt);
            }
        });

        groupTotal.setText("Show Group Total");
        groupTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupTotalActionPerformed(evt);
            }
        });

        messagesTotal.setText("Show Messages Total");
        messagesTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagesTotalActionPerformed(evt);
            }
        });

        positivePercentage.setText("Show Positive Percentage");
        positivePercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positivePercentageActionPerformed(evt);
            }
        });
        jScrollPane2.setViewportView(tree);
        

        addUser.setText("Add User");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(groupID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(messagesTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(userTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(groupTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(positivePercentage, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addUser))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(groupID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addGroup))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(messagesTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(positivePercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>                        


    private void groupTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupTotalActionPerformed

    private void userTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTotalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_userTotalActionPerformed

    private void messagesTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagesTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messagesTotalActionPerformed

    private void positivePercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positivePercentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positivePercentageActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        // TODO add your handling code here: 
       String newID = userID.getText().trim();
       User newUser = new tweeter(newID);
       User selected = getSelectedUser(tree);
       if(newID.equals("UserID") || newID.equals("")){
           return;
       }
       if(datatree.addNode(selected, newUser)){
           tree.scrollPathToVisible(new TreePath(newUser.getPath()));
       }
    }//GEN-LAST:event_addUserActionPerformed
    
    private void addGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupActionPerformed
       String newID = groupID.getText().trim();
       User newGroup = new Group(newID);
       User selected = getSelectedUser(tree);
       if(newID.equals("GroupID") || newID.equals("")){
           return;
       }
       if(datatree.addNode(selected, newGroup)){
           tree.scrollPathToVisible(new TreePath(newGroup.getPath()));
       }
    }//GEN-LAST:event_addGroupActionPerformed

    private void userViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userViewActionPerformed
        // TODO add your handling code here:
          User node = getSelectedUser(this.tree);
        if(!(node instanceof tweeter)){
            alertMsg.alert("Cannot User View a Group! Select User!");
        }else{
            openUserView(this.tree, getSelectedUser(this.tree));
            
        }
        
    }//GEN-LAST:event_userViewActionPerformed
    
    public User getSelectedUser(JTree tree){
		TreePath parentPath = tree.getSelectionPath(); 
		User selectedNode=null;
		if (parentPath == null) {
			selectedNode = (User) datatree.getModel().getRoot();
		} else {
			selectedNode = (User)(parentPath.getLastPathComponent());
		}
		return selectedNode;	
	}
      private void openUserView(JTree tree, User selectedNode) {
        
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JTree tree;
    private JButton addGroup;
    private JButton addUser;
    private JTextField groupID;
    private JButton groupTotal;
    private JScrollPane jScrollPane2;
    private JButton messagesTotal;
    private JButton positivePercentage;
    private JTextField userID;
    private JButton userTotal;
    private JButton userView;
    private TreeHandler datatree;
    private messageBox alertMsg = new messageBox();
    // End of variables declaration                   

  
}
