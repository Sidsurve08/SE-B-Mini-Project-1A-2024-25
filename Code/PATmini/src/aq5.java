
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException; 
import javax.swing.*; // For JFrame, JButton, JTextField, JOptionPane, etc.
import java.awt.*; // For layout managers and AWT components
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 import patmini.asname;
// For SQL database interaction
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Varunkumar lysetti
 */
public class aq5 extends javax.swing.JFrame {
Connection conn= user_db_connection.connect();
    PreparedStatement pst=null;
    
    /**
     * Creates new form aq5
     */
    public aq5() {
        initComponents();
        try {
        conn = user_db_connection.connect();
        if (conn == null) {
            JOptionPane.showMessageDialog(this, "Failed to connect to the database.");
            System.exit(1); // Exit if the connection is not established
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error connecting to the database: " + e.getMessage());
        e.printStackTrace();
        System.exit(1); // Exit if there was an error
    }
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
        q1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        q3 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        q5 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Q.1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        q1.setBackground(new java.awt.Color(204, 255, 204));
        q1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q1.setForeground(new java.awt.Color(153, 153, 255));
        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 302, 41));

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("ASSIGNMENT QUESTIONS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 306, 20));

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Q.3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 50, 20));

        jLabel8.setBackground(new java.awt.Color(204, 255, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 255));
        jLabel8.setText("Q.2");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        q3.setBackground(new java.awt.Color(204, 255, 204));
        q3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q3.setForeground(new java.awt.Color(153, 153, 255));
        getContentPane().add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 302, 41));

        q2.setBackground(new java.awt.Color(204, 255, 204));
        q2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q2.setForeground(new java.awt.Color(153, 153, 255));
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 302, 41));

        q5.setBackground(new java.awt.Color(204, 255, 204));
        q5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q5.setForeground(new java.awt.Color(153, 153, 255));
        getContentPane().add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 302, 41));

        q4.setBackground(new java.awt.Color(204, 255, 204));
        q4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        q4.setForeground(new java.awt.Color(153, 153, 255));
        getContentPane().add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 302, 41));

        jLabel9.setBackground(new java.awt.Color(204, 255, 204));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 255));
        jLabel9.setText("Q.4");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 326, 40, 20));

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("Q.5");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 406, 40, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picsart_24-09-01_22-01-15-634.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String Q1 = q1.getText();
String Q2 = q2.getText();
String Q3 = q3.getText();
String Q4 = q4.getText();
String Q5 = q5.getText();
String asnameValue = readAsnameValue(); // Get value from assname field

// Database connection details
String url = "jdbc:mysql://localhost:3306/pat"; // Database URL
String user = "root"; // Database username
String password = "pat@admin#0987"; // Database password

try {
    // SQL query to insert values into the table, including assignmentName
    String q = "INSERT INTO assignques(q1, q2, q3, q4, q5,name) VALUES(?, ?, ?, ?, ?, ?)";

    // Prepare the statement
    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement pst = conn.prepareStatement(q)) {

        // Set parameters
        pst.setString(1, Q1);
        pst.setString(2, Q2);
        pst.setString(3, Q3);
        pst.setString(4, Q4);
        pst.setString(5, Q5);
        pst.setString(6, asnameValue); // Set the assignment name

        // Execute the update
        pst.executeUpdate();

        JOptionPane.showMessageDialog(this, "Question added successfully");
        
        this.dispose();
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
}
    }//GEN-LAST:event_jButton1ActionPerformed
private String readAsnameValue() {
    StringBuilder content = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new FileReader("asname.assname"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
    } catch (IOException e) {
        System.out.println("Error reading asname.assname: " + e.getMessage());
        return ""; // Return an empty string if there's an error
    }
    return content.toString().trim(); // Return the content without trailing newline

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(aq5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aq5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aq5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aq5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aq5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    // End of variables declaration//GEN-END:variables

   
}
