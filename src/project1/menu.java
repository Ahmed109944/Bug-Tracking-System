/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import com.sun.glass.ui.Application;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import static project1.Project1.URL;

import static project1.Project1.PASSWORD;
import static project1.Project1.USER;



/**
 *
 * @author flash 20-9-2018
 */

public class menu extends javax.swing.JFrame {
     ADMIN admin = new ADMIN();
       
    public menu() {
        initComponents();
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UserName_label = new javax.swing.JLabel();
        Password_label = new javax.swing.JLabel();
        usernameTEXT = new javax.swing.JTextField();
        passwordTEXT = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        DeveloperButton = new javax.swing.JButton();
        AdminButton = new javax.swing.JButton();
        TesterButton = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(0, 0, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 0, 102));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Registration");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 64, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Bugs Tracking Systems ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Login Form -_-");

        UserName_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserName_label.setText("UserName : ");

        Password_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Password_label.setText("Password :");

        DeveloperButton.setBackground(new java.awt.Color(255, 255, 255));
        DeveloperButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeveloperButton.setForeground(new java.awt.Color(0, 0, 102));
        DeveloperButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/Developer_50px.png"))); // NOI18N
        DeveloperButton.setText("Developer");
        DeveloperButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeveloperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeveloperButtonActionPerformed(evt);
            }
        });

        AdminButton.setBackground(new java.awt.Color(255, 255, 255));
        AdminButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AdminButton.setForeground(new java.awt.Color(0, 0, 102));
        AdminButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/Administrator Male_48px.png"))); // NOI18N
        AdminButton.setText("Admin");
        AdminButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });

        TesterButton.setBackground(new java.awt.Color(255, 255, 255));
        TesterButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TesterButton.setForeground(new java.awt.Color(0, 0, 102));
        TesterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/tester_48px.png"))); // NOI18N
        TesterButton.setText("Tester");
        TesterButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TesterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TesterButtonActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setForeground(new java.awt.Color(51, 0, 51));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/Button-Delete-icon.png"))); // NOI18N
        Exit.setBorder(null);
        Exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(127, 127, 127))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabel11)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(116, 116, 116)
                                                        .addComponent(UserName_label)
                                                        .addGap(97, 97, 97)
                                                        .addComponent(usernameTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(116, 116, 116)
                                                                .addComponent(Password_label))
                                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(44, 44, 44)
                                                                .addComponent(DeveloperButton)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(passwordTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(AdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)))
                                        .addComponent(TesterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(140, 140, 140))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UserName_label)
                            .addComponent(usernameTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Password_label)
                            .addComponent(passwordTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TesterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AdminButton))
                    .addComponent(DeveloperButton))
                .addGap(0, 70, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void DeveloperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeveloperButtonActionPerformed
           Developer developer = new Developer();
           boolean open = false ;
           if(developer.Check(developer, usernameTEXT.getText(), passwordTEXT.getText()))
           {
                JOptionPane.showMessageDialog(this, "Log in Successfully", "Done", JOptionPane.PLAIN_MESSAGE);
                DeveloperForm devform = new DeveloperForm(developer);
                devform.setVisible(true);
                this.hide();
           }
           else 
           {
                 JOptionPane.showMessageDialog(this, "Wrong UserName or Password , Try Again", "ERROR", JOptionPane.ERROR_MESSAGE);
           }
        /*try {
          Connection  Conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement ST = Conn.createStatement();
            String SQL = "SELect username , password , email from user where job = 'developer';";
            ResultSet RS = ST.executeQuery(SQL);
           while( RS.next()){
            if(RS.getString(1).equals(usernameTEXT.getText()) && RS.getString(2).equals(passwordTEXT.getText()))
            {
               open = true ;
               developer.setUsername(RS.getString(1));
               developer.setPassword(RS.getString(2));
               developer.setEmail(RS.getString(3));
            }
           }   
           if(!open)
                JOptionPane.showMessageDialog(this, "Wrong UserName or Password , Try Again", "ERROR", JOptionPane.ERROR_MESSAGE);
           
        } catch (SQLException e) {
               JOptionPane.showMessageDialog(this, "Wrong While Connecting The DataBase ... ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        if(open){
            JOptionPane.showMessageDialog(this, "Log in Successfully", "Done", JOptionPane.PLAIN_MESSAGE);
        DeveloperForm dev= new DeveloperForm(developer);
        dev.setVisible(true);
        this.hide();}*/
    }//GEN-LAST:event_DeveloperButtonActionPerformed

    private void TesterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TesterButtonActionPerformed
      Tester tester = new Tester();
           boolean open = false ;
           if(tester.Check(tester, usernameTEXT.getText(), passwordTEXT.getText()))
           {
                JOptionPane.showMessageDialog(this, "Log in Successfully", "Done", JOptionPane.PLAIN_MESSAGE);
                TesterForm devform = new TesterForm(tester);
                devform.setVisible(true);
                this.hide();
           }
           else 
           {
                 JOptionPane.showMessageDialog(this, "Wrong UserName or Password , Try Again", "ERROR", JOptionPane.ERROR_MESSAGE);
           }
        /* boolean open = false ;
        try {
            //String Query = "SELECT username , password , Email  FROM user WHRER job = tester";
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement St = conn.createStatement();
            ResultSet Rs = St.executeQuery("SELECT username , password from user\n" +
              "where job = 'tester'");
            while(Rs.next())
            {System.out.println(Rs.getString(1) +" "+ Rs.getString(2));
                if(Rs.getString(1).equals(usernameTEXT.getText()) && Rs.getString(2).equals(passwordTEXT.getText()))
                {
                    open = true ;
                    break ;
                }
            }
        } catch (SQLException e) {
            System.out.println("not done");
        }
        if(open){
            JOptionPane.showMessageDialog(this, "log in Successfully ", "log in ", JOptionPane.PLAIN_MESSAGE);
        TesterForm tester=new TesterForm();
        tester.setVisible(true);
        this.hide();}
        else 
        {
            JOptionPane.showMessageDialog(this, "Wrong username or password , try again ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_TesterButtonActionPerformed
// Done here ; 
    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
       String UserName = usernameTEXT.getText() , Password = passwordTEXT.getText();
       boolean open = true ;
       if(admin.check(UserName, Password))
       {
            JOptionPane.showMessageDialog(this, "Log in Successfully", "Done" , JOptionPane.PLAIN_MESSAGE);                        
       }
       else 
       {
            JOptionPane.showMessageDialog(this, "Wrong UserName OR Password , Try Again ", "ERROR" , JOptionPane.ERROR_MESSAGE);
            open = false ;
       }
       if(open)
       {
        AdminForm admin=new AdminForm();
        admin.setVisible(true);
        this.hide();
       }
    }//GEN-LAST:event_AdminButtonActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton;
    private javax.swing.JButton DeveloperButton;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Password_label;
    private javax.swing.JButton TesterButton;
    private javax.swing.JLabel UserName_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField passwordTEXT;
    private javax.swing.JTextField usernameTEXT;
    // End of variables declaration//GEN-END:variables
}
