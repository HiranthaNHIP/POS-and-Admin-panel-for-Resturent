
package View;

import java.awt.Image;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import Controller.*;
import javax.swing.JOptionPane;
import View.Vcashier;

public class VLogin extends javax.swing.JFrame {

   
    public VLogin() {
        initComponents();
        // this code is used set icon for the application
        Image icon = new ImageIcon(this.getClass().getResource("/logo.jpg")).getImage();
        this.setIconImage(icon);
 
        
        
    
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightpanel = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        btn_login_ = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_register_ = new javax.swing.JButton();
        com_emptype = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        rightpanel.setBackground(new java.awt.Color(0, 0, 0));
        rightpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        image.setForeground(new java.awt.Color(204, 204, 204));
        image.setText("copyright ©arthursPizza | All rights reserved");
        rightpanel.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        Left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("LOGIN");
        Left.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 38, -1, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("EMP Type");
        Left.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 132, -1, -1));

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_username.setForeground(new java.awt.Color(102, 102, 102));
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_usernameKeyReleased(evt);
            }
        });
        Left.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 248, 343, 40));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        Left.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 306, -1, -1));

        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Left.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 338, 343, 40));

        btn_login_.setBackground(new java.awt.Color(255, 0, 0));
        btn_login_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login_.setForeground(new java.awt.Color(255, 255, 255));
        btn_login_.setText("Login");
        btn_login_.setActionCommand("btn_login");
        btn_login_.setAlignmentY(1.0F);
        btn_login_.setBorder(null);
        btn_login_.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_login_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login_ActionPerformed(evt);
            }
        });
        Left.add(btn_login_, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 404, 123, 42));

        jLabel4.setText("I don't have an account");
        Left.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, 30));

        btn_register_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_register_.setForeground(new java.awt.Color(255, 51, 51));
        btn_register_.setText("Register");
        btn_register_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_register_ActionPerformed(evt);
            }
        });
        Left.add(btn_register_, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 112, 43));

        com_emptype.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        com_emptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Cashier", " " }));
        Left.add(com_emptype, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 158, 343, 40));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Username");
        Left.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 222, -1, -1));

        rightpanel.add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 0, 420, 630));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cropped-arthurs-logo-01 (1).png"))); // NOI18N
        jLabel5.setText("jLabel5");
        rightpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 320, 182));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rightpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_register_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_register_ActionPerformed
         VRegister registerIN = new VRegister();
         registerIN .setVisible(true);
         registerIN .pack();
         registerIN .setLocationRelativeTo(null); 
         this.dispose();
       
        
    }//GEN-LAST:event_btn_register_ActionPerformed

    private void btn_login_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login_ActionPerformed
        
    char []passchar=txt_password.getPassword();
    String password=new String(passchar);
    Object selectedvalue=com_emptype.getSelectedItem();
        
     if(selectedvalue==null)
     {
         JOptionPane.showMessageDialog(null, "Please Select Employee Type ","Error",JOptionPane.ERROR_MESSAGE);
 
         
     }
    
     else if(txt_username.getText().isEmpty())
     {
         JOptionPane.showMessageDialog(null, "Please Enter Your Username ","Error",JOptionPane.ERROR_MESSAGE);
         
     }
     else if (password.isEmpty())
     {
         JOptionPane.showMessageDialog(null, "Please Enter Your Password ","Error",JOptionPane.ERROR_MESSAGE);

         
     }
        
     else
     {
         String type,username;
         username=txt_username.getText();
         //char[] passwordchars=txt_password.getPassword();
         //passwords=new String(passwordchars);
         
         type=(String)com_emptype.getSelectedItem();
         Clogin obj=new Clogin();
         obj.login(type, username, password);
         
         
        
        
         
     
         txt_username.setText("");
         txt_password.setText("");
         com_emptype.setSelectedIndex(-1);
        
     }
        
        
        
   
        
        
    }//GEN-LAST:event_btn_login_ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        com_emptype.setSelectedIndex(-1);
    }//GEN-LAST:event_formWindowOpened

    private void txt_usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_usernameKeyReleased

   
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VLogin().setVisible(true);
            }
        });
    }
  
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JButton btn_login_;
    private javax.swing.JButton btn_register_;
    private javax.swing.JComboBox<String> com_emptype;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}


