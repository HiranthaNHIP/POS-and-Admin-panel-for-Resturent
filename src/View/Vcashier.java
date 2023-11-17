
package View;
import Controller.CbillCalculate;
import Controller.CcanselOrder;
import Controller.Cremovecart;
import Controller.Cshoworders;
import Model.MDBconnection;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Vcashier extends javax.swing.JFrame implements Runnable{
     
       int hour,second,minute,year,month,day;

  
    public Vcashier() {
        initComponents();
         // this code is used set icon for the application
        Image icon = new ImageIcon(this.getClass().getResource("/logo.jpg")).getImage();
        this.setIconImage(icon);
        
        // this codes for the digital clock
        Thread t=new Thread(this);
        t.start();
    }

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Vcashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vcashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vcashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vcashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

     
       Vcashier page=new Vcashier(); 
        page.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_showOrders = new javax.swing.JTable();
        panel1 = new java.awt.Panel();
        jLabel8 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        lbl_dateshow = new java.awt.Label();
        lbl_timeshow = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        lbl_login = new javax.swing.JLabel();
        lbl_dayname = new javax.swing.JLabel();
        btn_placeorder = new rojeru_san.complementos.RSButtonHover();
        btn_canselOrder = new rojeru_san.complementos.RSButtonHover();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cashier Screen");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_showOrders.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_showOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Biill No", "Customer Tel", "Order Date", "Order Time", "Order Type", "Order Status", "Order Total", "Paid Amount", "Balance"
            }
        ));
        tbl_showOrders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_showOrders.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_showOrders.setRowHeight(40);
        tbl_showOrders.setSelectionBackground(new java.awt.Color(204, 0, 51));
        tbl_showOrders.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbl_showOrders.setShowGrid(true);
        tbl_showOrders.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tbl_showOrders);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 1050, 470));

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cropped-arthurs-logo-01 (2).png"))); // NOI18N
        jLabel8.setText("jLabel5");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 0, 121, -1));

        btn_logout.setBackground(new java.awt.Color(0, 0, 0));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout (2).png"))); // NOI18N
        btn_logout.setBorder(null);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        panel1.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, -1));

        btn_exit.setBackground(new java.awt.Color(0, 0, 0));
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/switch (1) (1).png"))); // NOI18N
        btn_exit.setBorder(null);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        panel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, -1, -1));

        lbl_dateshow.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        lbl_dateshow.setForeground(new java.awt.Color(255, 255, 255));
        lbl_dateshow.setText("thu 13 Mon");
        panel1.add(lbl_dateshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, 30));

        lbl_timeshow.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        lbl_timeshow.setForeground(new java.awt.Color(255, 255, 255));
        lbl_timeshow.setText("11.07.00AM");
        panel1.add(lbl_timeshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User : ");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, 30));

        lbl_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(255, 0, 51));
        panel1.add(lbl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, -1, 30));

        lbl_dayname.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_dayname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_dayname.setText("Sunday");
        panel1.add(lbl_dayname, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 100, 30));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        btn_placeorder.setBackground(new java.awt.Color(204, 0, 51));
        btn_placeorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrowhead (2).png"))); // NOI18N
        btn_placeorder.setText("Place Order");
        btn_placeorder.setToolTipText("");
        btn_placeorder.setColorHover(new java.awt.Color(51, 153, 0));
        btn_placeorder.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_placeorder.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_placeorder.setIconTextGap(80);
        btn_placeorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_placeorderActionPerformed(evt);
            }
        });
        getContentPane().add(btn_placeorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 455, 90));

        btn_canselOrder.setBackground(new java.awt.Color(0, 0, 0));
        btn_canselOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bin (2).png"))); // NOI18N
        btn_canselOrder.setText("Cansel");
        btn_canselOrder.setColorHover(new java.awt.Color(255, 0, 51));
        btn_canselOrder.setIconTextGap(16);
        btn_canselOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_canselOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btn_canselOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 90, 120, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("copyright ©arthursPizza | Develop By Hirantha Perera");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(481, 481, 481)
                .addComponent(jLabel21)
                .addContainerGap(484, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 1280, 20));

        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
      
      
         Login2 login =new Login2();
         login.setVisible(true);
         this.dispose();
         
    }//GEN-LAST:event_btn_logoutActionPerformed

    public void loginuser(String name)
    {
        lbl_login.setText(name);
        
    }
    
    
    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        Vcashier page=new Vcashier(); 
        int option = JOptionPane.showConfirmDialog(page, "Do you want to exit the application?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                
                if (option == JOptionPane.YES_OPTION) {
                    // Exit the application
                    System.exit(0);
                }
        
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteActionPerformed

    public void showorders()
    {
        // THIS CODE IS USED TO RETIVE DATABASE DEATILS TO THE JTABLE
        String todaydate=lbl_dateshow.getText();
          
          Cshoworders order=new Cshoworders();
          String[] result = order.showOrdersTbl(todaydate); 
          
            DefaultTableModel tblModel=(DefaultTableModel)tbl_showOrders.getModel();
             // Add data to the table model
            for (int i = 0; i < result.length; i += 9) {
                tblModel.addRow(new Object[]{
                        result[i],
                        result[i + 1],
                        result[i + 2],
                        result[i + 3],
                        result[i + 4],
                        result[i + 5],
                        result[i + 6],
                        result[i + 7],
                        result[i + 8]
                });
            }

            // Set the model to the table
            tbl_showOrders.setModel(tblModel);
        
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
     showorders();
    }//GEN-LAST:event_formWindowOpened

    private void btn_placeorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_placeorderActionPerformed
       VcashierPOS ui=new VcashierPOS();
       ui.lbl_login.setText(lbl_login.getText());
       ui.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_placeorderActionPerformed

    private void btn_canselOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_canselOrderActionPerformed
        
        try 
        {
            int seletedrowIndex=tbl_showOrders.getSelectedRow();
            
            if(seletedrowIndex !=-1)
            {
                //this code is used to identify the first coulum value
                Object recodeID=tbl_showOrders.getValueAt(seletedrowIndex, 0);
                
                String value=recodeID.toString();
                
                CcanselOrder ord=new CcanselOrder();
                ord.caselselectRowOrder(value);
                 DefaultTableModel model = (DefaultTableModel) tbl_showOrders.getModel();
                model.setRowCount(0);
                showorders();
                
                
                // remove the select row
                //DefaultTableModel model=(DefaultTableModel)tbl_showOrders.getModel();
                //model.removeRow(seletedrowIndex);
   
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No row selected.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_canselOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btn_canselOrder;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_logout;
    private rojeru_san.complementos.RSButtonHover btn_placeorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label lbl_dateshow;
    private javax.swing.JLabel lbl_dayname;
    public javax.swing.JLabel lbl_login;
    private java.awt.Label lbl_timeshow;
    private java.awt.Panel panel1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable tbl_showOrders;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() 
    {
         while (true)
        {
            Calendar cal=Calendar.getInstance();
            hour=cal.get(Calendar.HOUR_OF_DAY);
            minute=cal.get(Calendar.MINUTE);
            second=cal.get(Calendar.SECOND);
            year=cal.get(Calendar.YEAR);
             month=cal.get(Calendar.MONTH);
              day=cal.get(Calendar.DAY_OF_MONTH);
            
           SimpleDateFormat sdf12 =new SimpleDateFormat("hh:mm:ss aa");
            SimpleDateFormat df =new SimpleDateFormat("  yyyy-MM-dd");
            SimpleDateFormat day1 =new SimpleDateFormat("EEEE");

            Date dat =cal.getTime();
            
            
            
            String time12=sdf12.format(dat);
            String yearstr=df.format(dat);
            String day=day1.format(dat);

            
            
            lbl_timeshow.setText(time12);
            lbl_dateshow.setText(yearstr);
            lbl_dayname.setText(day);
            
            
        }
    }
}
