
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.swing.JFrame;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Users extends javax.swing.JFrame {

    /**
     * Creates new form Users
     */
    public Users() {
        initComponents();
        jLabelp1.setVisible(false);
        jLabel2.setVisible(false);
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2 - getHeight()/2);
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
        jLabelpassword = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabelp1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabelpassword.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelpassword.setText("Password");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jButtonLogin.setBackground(new java.awt.Color(102, 153, 255));
        jButtonLogin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jButtonLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonLoginKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButtonLoginKeyTyped(evt);
            }
        });

        jLabelp1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelp1.setForeground(new java.awt.Color(255, 51, 51));
        jLabelp1.setText("*");

        jLabel2.setForeground(new java.awt.Color(240, 0, 0));
        jLabel2.setText("Password incorrect");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Эмнэлгийн мэдээллийн систем 2019");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Эмч", "Сувилагч" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelpassword)
                                .addComponent(jPasswordField1)
                                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelp1)))
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabelpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelp1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLoginKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLoginKeyTyped

    private void jButtonLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLoginKeyPressed

    }//GEN-LAST:event_jButtonLoginKeyPressed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        jLabelp1.setVisible(false);
        jLabel2.setVisible(false);

        if(String.valueOf(jPasswordField1.getPassword()).equals(""))
        {
            jLabelp1.setVisible(true);
        }else if(jComboBox1.getSelectedItem().toString() == "Эмч"){

            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/hospital");
                String sql = "SELECT * from user where username='emch' AND password = ?";

                PreparedStatement ps = con.prepareStatement(sql);
                
                
                ps.setString(1, String.valueOf(jPasswordField1.getPassword()));

                ResultSet rs = ps.executeQuery();

                if(rs.next()){

                    this.dispose();
                    MainForm Mf = new MainForm();
                    Mf.setVisible(true);
                    Mf.pack();
                    Mf.setLocationRelativeTo(null);
                    Mf.setExtendedState(JFrame.MAXIMIZED_BOTH);

                }else{

                    jLabel2.setVisible(true);

                    jPasswordField1.setText("");

                }
                con.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

        }
        else if(jComboBox1.getSelectedItem().toString() == "Сувилагч"){
             try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/hospital");
                String sql = "SELECT * from user where username='nurse' AND password = ?";

                PreparedStatement ps = con.prepareStatement(sql);
                
                
                ps.setString(1, String.valueOf(jPasswordField1.getPassword()));

                ResultSet rs = ps.executeQuery();

                if(rs.next()){

                    this.dispose();
                    MainForm Mf = new MainForm();
                    Mf.setVisible(true);
                    Mf.pack();
                    Mf.setLocationRelativeTo(null);
                    Mf.setExtendedState(JFrame.MAXIMIZED_BOTH);

                }else{

                    jLabel2.setVisible(true);

                    jPasswordField1.setText("");

                }
                con.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            jLabelp1.setVisible(false);
            jLabel2.setVisible(false);

            if(String.valueOf(jPasswordField1.getPassword()).equals(""))
            {
                jLabelp1.setVisible(true);
            }
            else if(jComboBox1.getSelectedItem().toString() == "Эмч"){

                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/hospital");
                    String sql = "SELECT * from user where username= 'emch' AND password = ?";

                    PreparedStatement ps = con.prepareStatement(sql);

                    ps.setString(1, String.valueOf(jPasswordField1.getPassword()));

                    ResultSet rs = ps.executeQuery();

                    if(rs.next()){

                        this.dispose();
                        MainForm Mf = new MainForm();
                        Mf.setVisible(true);
                        Mf.pack();
                        Mf.setLocationRelativeTo(null);
                        Mf.setExtendedState(JFrame.MAXIMIZED_BOTH);

                    }else{

                        jLabel2.setVisible(true);
                    }
                    con.close();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            else if(jComboBox1.getSelectedItem().toString() == "Сувилагч")
             try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con =  DriverManager.getConnection("jdbc:mysql://localhost/hospital");
                String sql = "SELECT * from user where username='nurse' AND password = ?";

                PreparedStatement ps = con.prepareStatement(sql);
                
                
                ps.setString(1, String.valueOf(jPasswordField1.getPassword()));

                ResultSet rs = ps.executeQuery();

                if(rs.next()){

                    this.dispose();
                    MainForm Mf = new MainForm();
                    Mf.setVisible(true);
                    Mf.pack();
                    Mf.setLocationRelativeTo(null);
                    Mf.setExtendedState(JFrame.MAXIMIZED_BOTH);

                }else{

                    jLabel2.setVisible(true);

                    jPasswordField1.setText("");

                }
                con.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelp1;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
