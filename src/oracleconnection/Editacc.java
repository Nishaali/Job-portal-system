/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class Editacc extends javax.swing.JFrame {
Connection conn=null;
Statement st=null;
ResultSet rs=null;
String u;
    /**
     * Creates new form Editacc
     */
    public Editacc(String u1) {
        initComponents();
        u=u1;
        try{
    
  String driverName = "oracle.jdbc.driver.OracleDriver";
  Class.forName(driverName);
  String serverName = "LAPTOP-9GA03MGL";
  String serverPort = "1521";
  String sid = "XE";
  String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort + ":"+sid;
  String username = "sys"; 
  String password = "*****"; 
  conn = DriverManager.getConnection(url,username,password);
  st=conn.createStatement();
  System.out.println("Success");
 } catch (ClassNotFoundException e){
  System.out.println("Cant find db server" + e.getMessage());
 } catch (SQLException e) {
  System.out.println("Cant connect" + e.getMessage());
 }

    }

    private Editacc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c6 = new javax.swing.JCheckBox();
        c7 = new javax.swing.JCheckBox();
        c8 = new javax.swing.JCheckBox();
        c9 = new javax.swing.JCheckBox();
        c1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        skiold = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 153));
        setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1380, 800));
        setSize(new java.awt.Dimension(1380, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("EDIT DETAILS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 180, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        c2.setBackground(new java.awt.Color(255, 255, 153));
        c2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        c2.setText("Last name");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        c3.setBackground(new java.awt.Color(255, 255, 153));
        c3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        c3.setText("DOB");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        c4.setBackground(new java.awt.Color(255, 255, 153));
        c4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        c4.setText("Address");
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        c6.setBackground(new java.awt.Color(255, 255, 153));
        c6.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        c6.setText("Education");
        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });
        getContentPane().add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        c7.setBackground(new java.awt.Color(255, 255, 153));
        c7.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        c7.setText("Skills");
        c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c7ActionPerformed(evt);
            }
        });
        getContentPane().add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        c8.setBackground(new java.awt.Color(255, 255, 153));
        c8.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        c8.setText("Interest");
        c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c8ActionPerformed(evt);
            }
        });
        getContentPane().add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        c9.setBackground(new java.awt.Color(255, 255, 153));
        c9.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        c9.setText("Experience");
        c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c9ActionPerformed(evt);
            }
        });
        getContentPane().add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, -1));

        c1.setBackground(new java.awt.Color(255, 255, 153));
        c1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        c1.setText("First name");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel2.setText("AFTER YOU TYPE IN THE NEW DETAIL CHECK THE BOX:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 180, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 180, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 180, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 180, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 180, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 180, -1));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 180, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, -1, -1));

        skiold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skioldActionPerformed(evt);
            }
        });
        getContentPane().add(skiold, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel3.setText("Older value");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 100, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
String s3=jTextField2.getText();
try{
PreparedStatement stp3=conn.prepareStatement("update applicant set dob=? where username=?");
stp3.setString(1,s3);
stp3.setString(2,u);
stp3.executeUpdate();
}
catch(Exception e)
{
}
 
        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
String s1=jTextField12.getText();
try{
PreparedStatement stp=conn.prepareStatement("update resume set fname=? where username=?");
stp.setString(1,s1);
stp.setString(2,u);
stp.executeUpdate();
}
catch(Exception e)
{
}
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Details d2=new Details(u);
        d2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
String s2=jTextField1.getText();
try{
PreparedStatement stp1=conn.prepareStatement("update resume set lname=? where username=?");
stp1.setString(1,s2);
stp1.setString(2,u);
stp1.executeUpdate();
}
catch(Exception e)
{
}


        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
String s4=jTextField3.getText();
try{
PreparedStatement stp4=conn.prepareStatement("update resume set address=? where username=?");
stp4.setString(1,s4);
stp4.setString(2,u);
stp4.executeUpdate();
}
catch(Exception e)
{
}

        // TODO add your handling code here:
    }//GEN-LAST:event_c4ActionPerformed


    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
String s6=jTextField5.getText();
try{
PreparedStatement stpe=conn.prepareStatement("update resume set qualification=? where username=?");
stpe.setString(1,s6);
stpe.setString(2,u);
stpe.executeUpdate();
}
catch(Exception e)
{
}
        // TODO add your handling code here:
    }//GEN-LAST:event_c6ActionPerformed

    private void c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c7ActionPerformed
String s56=jTextField6.getText();
String o=skiold.getText();
try{
PreparedStatement stpa=conn.prepareStatement("update skills set skill=? where username=? and skill=?");
stpa.setString(1,s56);
stpa.setString(2,u);
stpa.setString(3,o);
stpa.executeUpdate();
}
catch(Exception e)
{
}
        // TODO add your handling code here:
    }//GEN-LAST:event_c7ActionPerformed

    private void c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c8ActionPerformed
String s7=jTextField7.getText();
try{
PreparedStatement stpp=conn.prepareStatement("update interests set interest=? where username=?");
stpp.setString(1,s7);
stpp.setString(2,u);
stpp.executeUpdate();
}
catch(Exception e)
{
}
        // TODO add your handling code here:
    }//GEN-LAST:event_c8ActionPerformed

    private void c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c9ActionPerformed
String s5=jTextField8.getText();
try{
PreparedStatement stpp=conn.prepareStatement("update experiences set experience=? where username=?");
stpp.setString(1,s5);
stpp.setString(2,u);
stpp.executeUpdate();
}
catch(Exception e)
{
}
        // TODO add your handling code here:
    }//GEN-LAST:event_c9ActionPerformed

    private void skioldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skioldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skioldActionPerformed

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
            java.util.logging.Logger.getLogger(Editacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editacc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editacc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c6;
    private javax.swing.JCheckBox c7;
    private javax.swing.JCheckBox c8;
    private javax.swing.JCheckBox c9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField skiold;
    // End of variables declaration//GEN-END:variables
}