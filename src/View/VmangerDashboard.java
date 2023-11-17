/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.CemployeeManage;
import Controller.Chomedash;
import Controller.CitemManage;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import java.sql.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;


public class VmangerDashboard extends javax.swing.JFrame implements Runnable{

   int hour,second,minute,year,month,day;
   String path2;//this used to get image path
   String empPath;
   
   
    public VmangerDashboard() {
        initComponents();
         // this code is used set icon for the application
        Image icon = new ImageIcon(this.getClass().getResource("/logo.jpg")).getImage();
        this.setIconImage(icon);
        // this codes for the digital clock
        Thread t=new Thread(this);
        t.start();
        
        AutoCompleteDecorator.decorate(com_search);//autocomple jcombobox code
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        headingpanel = new java.awt.Panel();
        jLabel8 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        lbl_timeshow = new java.awt.Label();
        lbl_dateshow = new java.awt.Label();
        jLabel50 = new javax.swing.JLabel();
        lbl_login = new javax.swing.JLabel();
        lbl_dayname = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_bestSellings = new rojeru_san.complementos.RSButtonHover();
        btn_homes = new rojeru_san.complementos.RSButtonHover();
        btn_menuItem = new rojeru_san.complementos.RSButtonHover();
        btn_orders = new rojeru_san.complementos.RSButtonHover();
        btn_salesReport = new rojeru_san.complementos.RSButtonHover();
        btn_otherReports = new rojeru_san.complementos.RSButtonHover();
        btn_employess1 = new rojeru_san.complementos.RSButtonHover();
        jPanel3 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_canselord = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_revenue = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lbl_ordcount = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_count = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        employeepanel = new javax.swing.JPanel();
        txt_fname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_lname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_email = new javax.swing.JTextField();
        com_gender = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        com_emptype = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_empDelete = new rojeru_san.complementos.RSButtonHover();
        jLabel20 = new javax.swing.JLabel();
        btn_picUpload = new rojeru_san.complementos.RSButtonHover();
        btn_empsave = new rojeru_san.complementos.RSButtonHover();
        btn_empUpdate = new rojeru_san.complementos.RSButtonHover();
        jLabel21 = new javax.swing.JLabel();
        txt_empid = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        lbl_empPIC = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btn_search1 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        datepiker = new com.toedter.calendar.JDateChooser();
        btn_empDelete1 = new rojeru_san.complementos.RSButtonHover();
        menupanel = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        item_mangement = new javax.swing.JPanel();
        btn_uplaod = new rojeru_san.complementos.RSButtonHover();
        jLabel23 = new javax.swing.JLabel();
        txt_itemcode = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        com_availbility = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn_save = new rojeru_san.complementos.RSButtonHover();
        btn_update = new rojeru_san.complementos.RSButtonHover();
        btn_itemdelete = new rojeru_san.complementos.RSButtonHover();
        txt_itemname = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        lbl_itemimage = new javax.swing.JLabel();
        com_catogary = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        com_search = new javax.swing.JComboBox<>();
        btn_search = new javax.swing.JButton();
        btn_clearall = new rojeru_san.complementos.RSButtonHover();
        all_itempanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        rSButtonHover9 = new rojeru_san.complementos.RSButtonHover();
        jTextField8 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        allOrders = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rSTableMetro2 = new rojeru_san.complementos.RSTableMetro();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        rSButtonHover10 = new rojeru_san.complementos.RSButtonHover();
        jLabel28 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        panel_saleReport_show = new javax.swing.JPanel();
        date_start = new com.toedter.calendar.JDateChooser();
        date_end = new com.toedter.calendar.JDateChooser();
        btn_daliysale = new rojeru_san.complementos.RSButtonHover();
        btn_monthlysale = new rojeru_san.complementos.RSButtonHover();
        jLabel4 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        panel_saleReport_show1 = new javax.swing.JPanel();
        date_start_sale = new com.toedter.calendar.JDateChooser();
        date_end_sale = new com.toedter.calendar.JDateChooser();
        btn_bestsel = new rojeru_san.complementos.RSButtonHover();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DashBoard");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headingpanel.setBackground(new java.awt.Color(0, 0, 0));
        headingpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cropped-arthurs-logo-01 (2).png"))); // NOI18N
        jLabel8.setText("jLabel5");
        headingpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 121, 60));

        btn_logout.setBackground(new java.awt.Color(0, 0, 0));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout (2).png"))); // NOI18N
        btn_logout.setBorder(null);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        headingpanel.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, -1, -1));

        btn_exit.setBackground(new java.awt.Color(0, 0, 0));
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/switch (1) (1).png"))); // NOI18N
        btn_exit.setBorder(null);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        headingpanel.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, -1, -1));

        lbl_timeshow.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        lbl_timeshow.setForeground(new java.awt.Color(255, 255, 255));
        lbl_timeshow.setText("11.07.00AM");
        headingpanel.add(lbl_timeshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 6, -1, 40));

        lbl_dateshow.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        lbl_dateshow.setForeground(new java.awt.Color(255, 255, 255));
        lbl_dateshow.setText("2023-11-12");
        headingpanel.add(lbl_dateshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 90, 30));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("User : ");
        headingpanel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, 30));

        lbl_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(255, 0, 0));
        headingpanel.add(lbl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 80, 30));

        lbl_dayname.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_dayname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_dayname.setText("Sunday");
        headingpanel.add(lbl_dayname, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 70, 30));

        getContentPane().add(headingpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1297, 57));

        sidebar.setBackground(new java.awt.Color(204, 0, 51));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sidebar.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 6, -1, 651));

        btn_bestSellings.setBackground(new java.awt.Color(204, 0, 51));
        btn_bestSellings.setBorder(null);
        btn_bestSellings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/best-seller.png"))); // NOI18N
        btn_bestSellings.setText("Best Selling");
        btn_bestSellings.setColorHover(new java.awt.Color(0, 0, 0));
        btn_bestSellings.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btn_bestSellings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_bestSellings.setIconTextGap(13);
        btn_bestSellings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bestSellingsActionPerformed(evt);
            }
        });
        sidebar.add(btn_bestSellings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 230, 50));

        btn_homes.setBackground(new java.awt.Color(204, 0, 51));
        btn_homes.setBorder(null);
        btn_homes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/house-black-silhouette-without-door.png"))); // NOI18N
        btn_homes.setText("Home");
        btn_homes.setColorHover(new java.awt.Color(0, 0, 0));
        btn_homes.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btn_homes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_homes.setIconTextGap(13);
        btn_homes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homesActionPerformed(evt);
            }
        });
        sidebar.add(btn_homes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 50));

        btn_menuItem.setBackground(new java.awt.Color(204, 0, 51));
        btn_menuItem.setBorder(null);
        btn_menuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-to-cart.png"))); // NOI18N
        btn_menuItem.setText("Menu Items");
        btn_menuItem.setColorHover(new java.awt.Color(0, 0, 0));
        btn_menuItem.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btn_menuItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_menuItem.setIconTextGap(13);
        btn_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuItemActionPerformed(evt);
            }
        });
        sidebar.add(btn_menuItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 230, 50));

        btn_orders.setBackground(new java.awt.Color(204, 0, 51));
        btn_orders.setBorder(null);
        btn_orders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shopping-bag.png"))); // NOI18N
        btn_orders.setText("Orders");
        btn_orders.setColorHover(new java.awt.Color(0, 0, 0));
        btn_orders.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btn_orders.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_orders.setIconTextGap(13);
        btn_orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordersActionPerformed(evt);
            }
        });
        sidebar.add(btn_orders, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 230, 50));

        btn_salesReport.setBackground(new java.awt.Color(204, 0, 51));
        btn_salesReport.setBorder(null);
        btn_salesReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/increase.png"))); // NOI18N
        btn_salesReport.setText("Sales Reports");
        btn_salesReport.setColorHover(new java.awt.Color(0, 0, 0));
        btn_salesReport.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btn_salesReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_salesReport.setIconTextGap(13);
        btn_salesReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salesReportActionPerformed(evt);
            }
        });
        sidebar.add(btn_salesReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, 50));

        btn_otherReports.setBackground(new java.awt.Color(204, 0, 51));
        btn_otherReports.setBorder(null);
        btn_otherReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file.png"))); // NOI18N
        btn_otherReports.setText("Other Reports");
        btn_otherReports.setColorHover(new java.awt.Color(0, 0, 0));
        btn_otherReports.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btn_otherReports.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_otherReports.setIconTextGap(13);
        btn_otherReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_otherReportsActionPerformed(evt);
            }
        });
        sidebar.add(btn_otherReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 230, 50));

        btn_employess1.setBackground(new java.awt.Color(204, 0, 51));
        btn_employess1.setBorder(null);
        btn_employess1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/teamwork (1).png"))); // NOI18N
        btn_employess1.setText("Employees");
        btn_employess1.setColorHover(new java.awt.Color(0, 0, 0));
        btn_employess1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btn_employess1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_employess1.setIconTextGap(13);
        btn_employess1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_employess1ActionPerformed(evt);
            }
        });
        sidebar.add(btn_employess1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 230, 50));

        getContentPane().add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 222, 650));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel51.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(204, 204, 204));
        jLabel51.setText("copyright ©arthursPizza | Develop By Hirantha Perera");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(481, 481, 481)
                .addComponent(jLabel51)
                .addContainerGap(484, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel51)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 1280, 20));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 51, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancelled (1).png"))); // NOI18N
        jLabel7.setIconTextGap(50);
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 156));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Today Canseled Orders");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 220, -1));

        lbl_canselord.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_canselord.setText("4");
        jPanel10.add(lbl_canselord, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 70, 60));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 270, 180));

        jPanel11.setBackground(new java.awt.Color(102, 204, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/increase (2).png"))); // NOI18N
        jLabel6.setIconTextGap(50);
        jPanel11.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 300, 150));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Today Sale");
        jPanel11.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        lbl_revenue.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbl_revenue.setText("56789");
        jPanel11.add(lbl_revenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 130, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setText("Rs.");
        jPanel11.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 40, 50));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 290, 180));

        jPanel12.setBackground(new java.awt.Color(0, 204, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.setLayout(null);

        lbl_ordcount.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_ordcount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shopping-bag (1).png"))); // NOI18N
        lbl_ordcount.setIconTextGap(50);
        jPanel12.add(lbl_ordcount);
        lbl_ordcount.setBounds(30, 10, 128, 128);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Today Orders");
        jPanel12.add(jLabel12);
        jLabel12.setBounds(100, 150, 120, 25);

        lbl_count.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_count.setText("4");
        jPanel12.add(lbl_count);
        lbl_count.setBounds(190, 40, 70, 60);

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 290, 180));

        jLabel45.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("copyright ©arthursPizza | Develop By Hirantha Perera");
        jPanel5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 700, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel27.setText("Today Avg per Order");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel58.setText("2500.00");
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/budget (1).png"))); // NOI18N
        jPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 140));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 290, 170));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 270, -1));

        jPanel8.setBackground(new java.awt.Color(255, 102, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Today  Card payments");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 220, -1));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel60.setText("5770.00");
        jPanel8.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/credit-cards.png"))); // NOI18N
        jPanel8.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 140));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 290, 170));

        jPanel13.setBackground(new java.awt.Color(153, 0, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Today Cash paymets");
        jPanel13.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("3400.00");
        jPanel13.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/banknotes (1).png"))); // NOI18N
        jPanel13.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 140));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 270, 170));

        jPanel4.setBackground(new java.awt.Color(51, 153, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Today Take Away Orders");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("10");
        jPanel4.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/take-away (1).png"))); // NOI18N
        jPanel4.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 210, 140));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 290, 170));

        jPanel15.setBackground(new java.awt.Color(0, 204, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel53.setText("Today Dine in orders");
        jPanel15.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel61.setText("8");
        jPanel15.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dinner-table.png"))); // NOI18N
        jPanel15.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 140));

        jPanel5.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 290, -1));

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Today Total Orders");
        jPanel16.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("2500.00");
        jPanel16.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jPanel5.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 270, -1));

        jTabbedPane1.addTab("tab1", jPanel5);

        employeepanel.setBackground(new java.awt.Color(255, 255, 255));
        employeepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_fname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_fname.setForeground(new java.awt.Color(102, 102, 102));
        employeepanel.add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 343, 40));

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("First Name");
        employeepanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel13.setBackground(new java.awt.Color(102, 102, 102));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Last Name");
        employeepanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txt_lname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_lname.setForeground(new java.awt.Color(102, 102, 102));
        employeepanel.add(txt_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 343, 40));

        jLabel14.setBackground(new java.awt.Color(102, 102, 102));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Phone No");
        employeepanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        txt_phone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(102, 102, 102));
        employeepanel.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 343, 40));

        jLabel15.setBackground(new java.awt.Color(102, 102, 102));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Address");
        employeepanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Password");
        employeepanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_username.setForeground(new java.awt.Color(102, 102, 102));
        employeepanel.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 343, 40));

        jLabel17.setBackground(new java.awt.Color(102, 102, 102));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Username");
        employeepanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        employeepanel.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 343, 40));

        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_email.setForeground(new java.awt.Color(102, 102, 102));
        employeepanel.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 343, 40));

        com_gender.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        com_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        employeepanel.add(com_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 343, 40));

        jLabel18.setBackground(new java.awt.Color(102, 102, 102));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Gender");
        employeepanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        com_emptype.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        com_emptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manger", "Cashier", "Kichen Staff" }));
        employeepanel.add(com_emptype, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 340, 40));

        jLabel19.setBackground(new java.awt.Color(102, 102, 102));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Date of Birth");
        employeepanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText(" Employee Registration");
        employeepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        btn_empDelete.setBackground(new java.awt.Color(255, 0, 51));
        btn_empDelete.setBorder(null);
        btn_empDelete.setText("Delete");
        btn_empDelete.setColorHover(new java.awt.Color(0, 0, 0));
        employeepanel.add(btn_empDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 150, -1));

        jLabel20.setBackground(new java.awt.Color(102, 102, 102));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Emp Type");
        employeepanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 90, -1));

        btn_picUpload.setBackground(new java.awt.Color(0, 0, 0));
        btn_picUpload.setBorder(null);
        btn_picUpload.setText("Upload");
        btn_picUpload.setColorHover(new java.awt.Color(204, 0, 51));
        btn_picUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_picUploadActionPerformed(evt);
            }
        });
        employeepanel.add(btn_picUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 150, -1));

        btn_empsave.setBackground(new java.awt.Color(0, 204, 0));
        btn_empsave.setBorder(null);
        btn_empsave.setText("Save");
        btn_empsave.setColorHover(new java.awt.Color(0, 0, 0));
        btn_empsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empsaveActionPerformed(evt);
            }
        });
        employeepanel.add(btn_empsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 150, -1));

        btn_empUpdate.setBackground(new java.awt.Color(204, 102, 0));
        btn_empUpdate.setBorder(null);
        btn_empUpdate.setText("Update");
        btn_empUpdate.setColorHover(new java.awt.Color(0, 0, 0));
        employeepanel.add(btn_empUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 150, -1));

        jLabel21.setBackground(new java.awt.Color(102, 102, 102));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Email");
        employeepanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        txt_empid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_empid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_empid.setHighlighter(null);
        txt_empid.setName("search"); // NOI18N
        txt_empid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_empidActionPerformed(evt);
            }
        });
        employeepanel.add(txt_empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 340, 30));

        txt_address.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_address.setForeground(new java.awt.Color(102, 102, 102));
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });
        employeepanel.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 343, 40));

        jLabel35.setBackground(new java.awt.Color(102, 102, 102));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 0, 51));
        jLabel35.setText("*");
        employeepanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 20, -1));

        jLabel36.setBackground(new java.awt.Color(102, 102, 102));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 0, 51));
        jLabel36.setText("*");
        employeepanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 20, -1));

        jLabel37.setBackground(new java.awt.Color(102, 102, 102));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 0, 51));
        jLabel37.setText("*");
        employeepanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 20, -1));

        jLabel38.setBackground(new java.awt.Color(102, 102, 102));
        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 0, 51));
        jLabel38.setText("*");
        employeepanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 20, -1));

        jLabel39.setBackground(new java.awt.Color(102, 102, 102));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 0, 51));
        jLabel39.setText("*");
        employeepanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 20, -1));

        jLabel40.setBackground(new java.awt.Color(102, 102, 102));
        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 0, 51));
        jLabel40.setText("*");
        employeepanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 20, -1));

        jLabel41.setBackground(new java.awt.Color(102, 102, 102));
        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 0, 51));
        jLabel41.setText("*");
        employeepanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 20, -1));

        jLabel42.setBackground(new java.awt.Color(102, 102, 102));
        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 0, 51));
        jLabel42.setText("*");
        employeepanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 20, -1));

        jLabel43.setBackground(new java.awt.Color(102, 102, 102));
        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 0, 51));
        jLabel43.setText("*");
        employeepanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 20, -1));

        jLabel44.setBackground(new java.awt.Color(102, 102, 102));
        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 0, 51));
        jLabel44.setText("*");
        employeepanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 20, -1));

        lbl_empPIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        employeepanel.add(lbl_empPIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 230, 270));

        jLabel46.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("copyright ©arthursPizza | Develop By Hirantha Perera");
        employeepanel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 670, -1, -1));

        btn_search1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (4).png"))); // NOI18N
        btn_search1.setBorder(null);
        btn_search1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (3).png"))); // NOI18N
        btn_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search1ActionPerformed(evt);
            }
        });
        employeepanel.add(btn_search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 70, 40, 40));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField9.setHighlighter(null);
        jTextField9.setName("search"); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        employeepanel.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 280, 30));
        employeepanel.add(datepiker, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 140, 340, 40));

        btn_empDelete1.setBackground(new java.awt.Color(153, 0, 51));
        btn_empDelete1.setBorder(null);
        btn_empDelete1.setText("Clear All");
        btn_empDelete1.setColorHover(new java.awt.Color(0, 0, 0));
        employeepanel.add(btn_empDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 150, -1));

        jTabbedPane1.addTab("tab6", employeepanel);

        menupanel.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane5.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTabbedPane5.setMinimumSize(new java.awt.Dimension(1045, 710));
        jTabbedPane5.setPreferredSize(new java.awt.Dimension(1045, 710));

        item_mangement.setBackground(new java.awt.Color(255, 255, 255));
        item_mangement.setPreferredSize(new java.awt.Dimension(1000, 710));
        item_mangement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_uplaod.setBackground(new java.awt.Color(0, 0, 0));
        btn_uplaod.setBorder(null);
        btn_uplaod.setText("Upload");
        btn_uplaod.setColorHover(new java.awt.Color(204, 0, 51));
        btn_uplaod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uplaodActionPerformed(evt);
            }
        });
        item_mangement.add(btn_uplaod, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 150, -1));

        jLabel23.setBackground(new java.awt.Color(102, 102, 102));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 51));
        jLabel23.setText("*");
        item_mangement.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 420, 20, -1));

        txt_itemcode.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_itemcode.setForeground(new java.awt.Color(102, 102, 102));
        item_mangement.add(txt_itemcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 343, 40));

        jLabel24.setBackground(new java.awt.Color(102, 102, 102));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Item Availabilty");
        item_mangement.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        com_availbility.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        com_availbility.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available ", "Unavailable" }));
        item_mangement.add(com_availbility, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 343, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Menu Management");
        item_mangement.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        btn_save.setBackground(new java.awt.Color(0, 204, 0));
        btn_save.setBorder(null);
        btn_save.setText("Save");
        btn_save.setColorHover(new java.awt.Color(0, 0, 0));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        item_mangement.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 150, -1));

        btn_update.setBackground(new java.awt.Color(204, 102, 0));
        btn_update.setBorder(null);
        btn_update.setText("Update");
        btn_update.setColorHover(new java.awt.Color(0, 0, 0));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        item_mangement.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 150, -1));

        btn_itemdelete.setBackground(new java.awt.Color(204, 0, 51));
        btn_itemdelete.setBorder(null);
        btn_itemdelete.setText("Delete");
        btn_itemdelete.setColorHover(new java.awt.Color(0, 0, 0));
        btn_itemdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_itemdeleteActionPerformed(evt);
            }
        });
        item_mangement.add(btn_itemdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 150, -1));

        txt_itemname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_itemname.setForeground(new java.awt.Color(102, 102, 102));
        item_mangement.add(txt_itemname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 343, 40));

        jLabel25.setBackground(new java.awt.Color(102, 102, 102));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Item Name");
        item_mangement.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jLabel26.setBackground(new java.awt.Color(102, 102, 102));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Item Price");
        item_mangement.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        txt_price.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_price.setForeground(new java.awt.Color(102, 102, 102));
        txt_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_priceKeyTyped(evt);
            }
        });
        item_mangement.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 343, 40));

        lbl_itemimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        item_mangement.add(lbl_itemimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 230, 240));

        com_catogary.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        com_catogary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pizza", "Appertizers ", "Desserts", "Beverages" }));
        item_mangement.add(com_catogary, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 343, 40));

        jLabel29.setBackground(new java.awt.Color(102, 102, 102));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("Item Catagory");
        item_mangement.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jLabel30.setBackground(new java.awt.Color(102, 102, 102));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("Item Code");
        item_mangement.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        jLabel31.setBackground(new java.awt.Color(102, 102, 102));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 51));
        jLabel31.setText("*");
        item_mangement.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 20, -1));

        jLabel32.setBackground(new java.awt.Color(102, 102, 102));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 51));
        jLabel32.setText("*");
        item_mangement.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 20, -1));

        jLabel33.setBackground(new java.awt.Color(102, 102, 102));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 51));
        jLabel33.setText("*");
        item_mangement.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 20, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("copyright ©arthursPizza | Develop By Hirantha Perera");
        item_mangement.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 700, -1, -1));

        com_search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        com_search.setBorder(null);
        com_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_searchActionPerformed(evt);
            }
        });
        item_mangement.add(com_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 370, -1));

        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (4).png"))); // NOI18N
        btn_search.setBorder(null);
        btn_search.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (3).png"))); // NOI18N
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        item_mangement.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 62, 40, 40));

        btn_clearall.setBackground(new java.awt.Color(255, 0, 51));
        btn_clearall.setText("Clear All");
        btn_clearall.setColorHover(new java.awt.Color(0, 0, 0));
        btn_clearall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearallActionPerformed(evt);
            }
        });
        item_mangement.add(btn_clearall, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 130, -1));

        jTabbedPane5.addTab("Item Management", item_mangement);

        all_itempanel.setBackground(new java.awt.Color(255, 255, 255));
        all_itempanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        rSTableMetro1.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorBordeHead(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorSelBackgound(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorSelForeground(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setGridColor(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(rSTableMetro1);

        all_itempanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1035, 630));

        rSButtonHover9.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (2).png"))); // NOI18N
        rSButtonHover9.setText("Search");
        rSButtonHover9.setColorHover(new java.awt.Color(204, 0, 0));
        rSButtonHover9.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonHover9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        all_itempanel.add(rSButtonHover9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 100, 30));

        jTextField8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        all_itempanel.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 320, 30));

        jLabel48.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("copyright ©arthursPizza | Develop By Hirantha Perera");
        all_itempanel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 700, -1, -1));

        jTabbedPane5.addTab("ALL Orders", all_itempanel);

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menupanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab5", menupanel);

        allOrders.setBackground(new java.awt.Color(255, 255, 255));
        allOrders.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSTableMetro2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        rSTableMetro2.setColorBackgoundHead(new java.awt.Color(204, 0, 51));
        rSTableMetro2.setColorBordeFilas(new java.awt.Color(204, 204, 204));
        rSTableMetro2.setColorBordeHead(new java.awt.Color(255, 255, 255));
        rSTableMetro2.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro2.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        rSTableMetro2.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        rSTableMetro2.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        rSTableMetro2.setColorSelForeground(new java.awt.Color(0, 0, 0));
        rSTableMetro2.setGridColor(new java.awt.Color(255, 255, 255));
        rSTableMetro2.setRowHeight(50);
        rSTableMetro2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(rSTableMetro2);

        allOrders.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1035, 630));

        jDateChooser3.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        allOrders.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 280, 30));

        rSButtonHover10.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (2).png"))); // NOI18N
        rSButtonHover10.setText("Search");
        rSButtonHover10.setColorHover(new java.awt.Color(204, 0, 0));
        rSButtonHover10.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonHover10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        allOrders.add(rSButtonHover10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 100, 30));

        jLabel28.setBackground(new java.awt.Color(102, 102, 102));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setText("Date");
        allOrders.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 40, 30));

        jLabel49.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("copyright ©arthursPizza | Develop By Hirantha Perera");
        allOrders.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 700, -1, -1));

        jTabbedPane1.addTab("tab3", allOrders);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_saleReport_show.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_saleReport_showLayout = new javax.swing.GroupLayout(panel_saleReport_show);
        panel_saleReport_show.setLayout(panel_saleReport_showLayout);
        panel_saleReport_showLayout.setHorizontalGroup(
            panel_saleReport_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        panel_saleReport_showLayout.setVerticalGroup(
            panel_saleReport_showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jPanel6.add(panel_saleReport_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 770, 670));
        jPanel6.add(date_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 260, 50));
        jPanel6.add(date_end, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 260, 50));

        btn_daliysale.setBackground(new java.awt.Color(0, 0, 255));
        btn_daliysale.setText("Generate Daily Sale Report");
        btn_daliysale.setColorHover(new java.awt.Color(255, 0, 51));
        btn_daliysale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_daliysaleActionPerformed(evt);
            }
        });
        jPanel6.add(btn_daliysale, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 260, 60));

        btn_monthlysale.setBackground(new java.awt.Color(255, 153, 0));
        btn_monthlysale.setText("Generate Monthly Sale Report");
        btn_monthlysale.setColorHover(new java.awt.Color(255, 0, 0));
        btn_monthlysale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_monthlysaleActionPerformed(evt);
            }
        });
        jPanel6.add(btn_monthlysale, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 260, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("End Date");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Start Date");
        jPanel6.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTabbedPane1.addTab("tab2", jPanel6);

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(502, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab7", jPanel9);

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_saleReport_show1.setBackground(new java.awt.Color(255, 255, 255));
        panel_saleReport_show1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel17.add(panel_saleReport_show1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 770, 670));
        jPanel17.add(date_start_sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 260, 50));
        jPanel17.add(date_end_sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 260, 50));

        btn_bestsel.setBackground(new java.awt.Color(255, 153, 0));
        btn_bestsel.setText("Generate Best Sellings Report");
        btn_bestsel.setColorHover(new java.awt.Color(255, 0, 0));
        btn_bestsel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bestselActionPerformed(evt);
            }
        });
        jPanel17.add(btn_bestsel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 260, 60));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("End Date");
        jPanel17.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Start Date");
        jPanel17.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab7", jPanel14);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 16, 1080, 690));

        setSize(new java.awt.Dimension(1299, 722));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed

        Login2 login =new Login2();
        login.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        Vcashier page=new Vcashier();
        int option = JOptionPane.showConfirmDialog(page, "Do you want to exit the application?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            // Exit the application
            System.exit(0);
        }

    }//GEN-LAST:event_btn_exitActionPerformed
/*
    private void btn_bestSellingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        
         jTabbedPane1.setSelectedIndex(0);
       
    }//GEN-LAST:event_btn_homeActionPerformed
*/
    private void btn_homesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homesActionPerformed
        
         jTabbedPane1.setSelectedIndex(0);
       
    }//GEN-LAST:event_btn_homesActionPerformed
/*
    private void btn_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuItemActionPerformed
       
         jTabbedPane1.setSelectedIndex(2);
       
    }//GEN-LAST:event_btn_menuItemActionPerformed

    private void btn_ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordersActionPerformed
       
         jTabbedPane1.setSelectedIndex(3);
       
    }//GEN-LAST:event_btn_ordersActionPerformed

    private void btn_salesReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salesReportActionPerformed
       
         jTabbedPane1.setSelectedIndex(4);
       
    }//GEN-LAST:event_btn_salesReportActionPerformed

    private void btn_otherReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_otherReportsActionPerformed
        
         jTabbedPane1.setSelectedIndex(5);
       
    }//GEN-LAST:event_btn_otherReportsActionPerformed
*/
    private void btn_bestSellingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bestSellingsActionPerformed
        
         jTabbedPane1.setSelectedIndex(6);
       
    }//GEN-LAST:event_btn_bestSellingsActionPerformed

    private void btn_employessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btn_home2ActionPerformed

    private void btn_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home3ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btn_home3ActionPerformed

    private void btn_ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home4ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btn_home4ActionPerformed

    private void btn_salesReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home5ActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btn_home5ActionPerformed

    private void btn_otherReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home6ActionPerformed
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_btn_home6ActionPerformed

    private void btn_employess1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_employess1ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btn_employess1ActionPerformed

    private void btn_uplaodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uplaodActionPerformed
        // TODO add your handling code here:
        
        //this codes is to used image upload
        ImageIcon imageIcon;         
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION)
        {
          File selectedFile = fileChooser.getSelectedFile();
          String imagePath = selectedFile.getAbsolutePath();
          imageIcon = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(230, 240, Image.SCALE_DEFAULT));
          lbl_itemimage.setIcon(imageIcon);
          path2=imagePath;// this is the image path
        }
       
    }//GEN-LAST:event_btn_uplaodActionPerformed

    private void txt_empidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_empidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_empidActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        

        try
        {
            
            
        String id=txt_itemcode.getText();
        String name=txt_itemname.getText();
        double price=Double.parseDouble(txt_price.getText());
        String cat= com_catogary.getSelectedItem().toString();//covert it to string type
        String avai=com_availbility.getSelectedItem().toString();
       
        InputStream image=new FileInputStream(path2);
        

        CitemManage item=new CitemManage();
        item.additem(id, name, cat, price, avai,image);
        
        
        
        com_search.removeAllItems();
        searchitems();
        com_search.setSelectedIndex(-1);
        txt_itemcode.setText(item.autoID());
        
        txt_itemname.setText("");
        txt_price.setText("0");
        com_catogary.setSelectedIndex(-1);
        com_availbility.setSelectedIndex(-1);
        lbl_itemimage.setIcon(null);

        
        
           
           
       } 
        catch (FileNotFoundException ex) 
       {
           JOptionPane.showMessageDialog(null, "Found Exception "+ex.getMessage());
       }
        catch (Exception ex) 
       {
           JOptionPane.showMessageDialog(null, "Found Exception "+ex.getMessage());
       }

       
        
        
    }//GEN-LAST:event_btn_saveActionPerformed

    public void searchitems()
    {
       
         
              CitemManage item = new CitemManage();
             List <String> search=item.searchitems();
            for (String searchitem : search)
            {
              com_search.addItem(searchitem);
            
             }
         
        
    }
  
    
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        // auto increment method calling
        CitemManage item=new CitemManage();
        txt_itemcode.setText(item.autoID());
        txt_empid.setEditable(false);
        
        CemployeeManage emp1=new CemployeeManage();
        txt_empid.setText(emp1.autoID());
        
        
        txt_itemcode.setEditable(false);
        com_search.setSelectedIndex(-1);
        
        Chomedash home =new Chomedash();
        lbl_revenue.setText(String.format("%.2f", home.getRevenue()));
        lbl_count.setText(String.valueOf(home.getordCount()));
        lbl_canselord.setText(String.valueOf(home.canselOrd()));
        
        
    }//GEN-LAST:event_formWindowOpened

    
    public void getimage()
    {
        CitemManage item=new CitemManage();
        
        
        
        Image original=item.getimage(com_search.getSelectedItem().toString());
         Image resizedImage = original.getScaledInstance(lbl_itemimage.getWidth(), lbl_itemimage.getHeight(), Image.SCALE_SMOOTH);

                 // Create a new ImageIcon with the resized image
                 ImageIcon resizedIcon = new ImageIcon(resizedImage);

                lbl_itemimage.setIcon(resizedIcon);
        
    }
    
    
    
    
    
    
    private void com_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_searchActionPerformed
        // add item infomation :
        // combo box null welawata meka wada karanne na
        // mokada combo box eka null welawe meke wada kaloth null value exception eka paninawa
        
        try 
        {
            if (com_search.getSelectedItem() != null)
         {
                CitemManage item=new CitemManage();
        
         ArrayList<String[]>items=item.getInformation(com_search.getSelectedItem().toString());
         if (!items.isEmpty()) {
            String[] itemData = items.get(0); // Assuming only one item is retrieved
            txt_itemcode.setText(itemData[0]);
            txt_itemname.setText(itemData[1]);
            txt_price.setText(itemData[2]);
            com_catogary.setSelectedItem(itemData[3]);
            com_availbility.setSelectedItem(itemData[4]);
        }
         
         getimage();
         }
        
            
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "exception "+e.getMessage());
            
        }
     
        
        
    }//GEN-LAST:event_com_searchActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        searchitems();
        com_search.setSelectedIndex(-1);
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_clearallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearallActionPerformed
        // TODO add your handling code here:
        
        
        CitemManage item=new CitemManage();
        txt_itemcode.setText(item.autoID());
        
        txt_itemname.setText("");
        txt_price.setText("0");
        com_catogary.setSelectedIndex(-1);
        com_availbility.setSelectedIndex(-1);
        lbl_itemimage.setIcon(null);
    }//GEN-LAST:event_btn_clearallActionPerformed

    private void btn_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_search1ActionPerformed

    private void txt_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_priceKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '.') {
         evt.consume();
        }
        
    }//GEN-LAST:event_txt_priceKeyTyped

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void btn_empsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empsaveActionPerformed
        InputStream image = null;
       try {
          String eid =txt_empid.getText();
           String fname=txt_fname.getText();
           String Lname=txt_lname.getText();
           char[] password =txt_password.getPassword();
           String username =txt_username.getText();
           String email=txt_email.getText();
            int no= Integer.parseInt(txt_phone.getText());
           String gender=com_gender.getSelectedItem().toString();
           String emptype =com_emptype.getSelectedItem().toString();
           String pattern = "yyyy-MM-dd";
           SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
           String DOB = dateformat.format(datepiker.getDate());
           InputStream empimage = new FileInputStream(empPath);
           
           
           
       } 
       catch (FileNotFoundException ex) 
       {
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e.getMessage());
           
       }
        
        
    }//GEN-LAST:event_btn_empsaveActionPerformed

    private void btn_picUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_picUploadActionPerformed
        
         //this codes is to used image upload
        ImageIcon imageIcon;         
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION)
        {
          File selectedFile = fileChooser.getSelectedFile();
          String imagePath = selectedFile.getAbsolutePath();
          imageIcon = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(230, 270, Image.SCALE_DEFAULT));
          lbl_empPIC.setIcon(imageIcon);
          empPath=imagePath;// this is the image path
        }
        
        
        
        
    }//GEN-LAST:event_btn_picUploadActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        
        try
        {
        String id=txt_itemcode.getText();
        String name=txt_itemname.getText();
        double price=Double.parseDouble(txt_price.getText());
        String cat= com_catogary.getSelectedItem().toString();//covert it to string type
        String avai=com_availbility.getSelectedItem().toString();
       
        
        
        CitemManage item=new CitemManage();
        item.Updateitem(id, name, cat, price, avai);
        
        
        
        com_search.removeAllItems();
        searchitems();
        com_search.setSelectedIndex(-1);
        
        
        txt_itemname.setText("");
        txt_price.setText("0");
        com_catogary.setSelectedIndex(-1);
        com_availbility.setSelectedIndex(-1);
        lbl_itemimage.setIcon(null);

        
        
           
           
       } 
        
        catch (Exception ex) 
       {
           JOptionPane.showMessageDialog(null, "Found Exception "+ex.getMessage());
       }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_itemdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_itemdeleteActionPerformed
       
        try
        {
        String id=txt_itemcode.getText();
  
        CitemManage item=new CitemManage();
        item.deleteItem(id);
    
        com_search.removeAllItems();
        searchitems();
        com_search.setSelectedIndex(-1);
      
        txt_itemname.setText("");
        txt_price.setText("0");
        com_catogary.setSelectedIndex(-1);
        com_availbility.setSelectedIndex(-1);
        lbl_itemimage.setIcon(null);

        
        
           
           
       } 
       
        catch (Exception ex) 
       {
           JOptionPane.showMessageDialog(null, "Found Exception "+ex.getMessage());
       }

    }//GEN-LAST:event_btn_itemdeleteActionPerformed

    private void btn_daliysaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_daliysaleActionPerformed
        // TODO add your handling code here:
        
         Connection con;
        String date=lbl_dateshow.getText();
       
        try {
            

            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resdb","root","");
            JasperDesign desin=JRXmlLoader.load("C:\\Users\\User\\OneDrive\\Documents\\EAD\\CWEAD55v1.2\\CWEAD55\\src\\View\\saleReport.jrxml");
            String sql="SELECT SUM(CASE WHEN mi.Item_Category= 'Pizza' THEN oi.Total ELSE 0 END) AS PizzaSales, SUM(CASE WHEN mi.Item_Category = 'Beverages' THEN oi.Total ELSE 0 END) AS BeveragesSales, SUM(CASE WHEN mi.Item_Category = 'Appertizers ' THEN oi.Total ELSE 0 END) AS appetizersale, SUM(CASE WHEN mi.Item_Category = 'Desserts' THEN oi.Total ELSE 0 END) AS Dessertsale , SUM(Service_charges) AS TotalServiceCharges, SUM(Tax) AS TotalTax, SUM(OrderTotal) AS TotalSale, SUM(CASE WHEN OrderType = 'Take Away' THEN OrderTotal ELSE 0 END) AS TakeAwaySale, SUM(CASE WHEN OrderType = 'Dine In' THEN OrderTotal ELSE 0 END) AS DineInSale, MIN(OrderDate) AS StartDate, MAX(OrderDate) AS EndDate FROM orders o INNER JOIN orderitems oi ON o.OrderBILL = oi.OrderBILL INNER JOIN menuitem mi ON oi.ItemID = mi.ItemID WHERE o.OrderStatus = 'completed' AND o.OrderDate='"+date+"';";
            JRDesignQuery updateQuery=new JRDesignQuery();
            updateQuery.setText(sql);
            
            desin.setQuery(updateQuery);
            

            JasperReport jreport=JasperCompileManager.compileReport(desin);
            JasperPrint jprint=JasperFillManager.fillReport(jreport, null,con);
            
            //JasperViewer.viewReport(jprint);
            JRViewer view1 = new JRViewer(jprint);
        
            panel_saleReport_show.removeAll();
            panel_saleReport_show.repaint();
            panel_saleReport_show.revalidate();
        
            panel_saleReport_show.setLayout(new BorderLayout());
            panel_saleReport_show.add(view1);

            
            
            
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
        catch (JRException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
 
  
    }//GEN-LAST:event_btn_daliysaleActionPerformed

    private void btn_bestselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bestselActionPerformed
        // TODO add your handling code here:
        Connection con;
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
        String startdate = dateformat.format(date_start_sale.getDate());
        String Enddate = dateformat.format(date_end_sale.getDate());
       
        try {
            

            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resdb","root","");
            JasperDesign desin=JRXmlLoader.load("C:\\Users\\User\\OneDrive\\Documents\\EAD\\CWEAD55v1.2\\CWEAD55\\src\\View\\bestsales.jrxml");
            String sql="SELECT ROW_NUMBER() OVER (ORDER BY SUM(oi.Quantity) + SUM(oi.Total) DESC) AS 'Rank', ci.Item_name AS 'Product Name', SUM(oi.Quantity) AS 'Sold Quantity', SUM(oi.Total) AS 'Total Income', SUM(oi.Quantity) + SUM(oi.Total) AS 'Total Quantity & Income', MIN(CASE WHEN o.OrderDate BETWEEN '"+startdate+"' AND '"+Enddate+"' THEN o.OrderDate END) AS 'Start Date', MAX(CASE WHEN o.OrderDate BETWEEN '"+startdate+"' AND '"+Enddate+"' THEN o.OrderDate END) AS 'End Date' FROM orderitems oi JOIN menuitem ci ON oi.ItemID = ci.ItemID JOIN orders o ON oi.OrderBILL = o.OrderBILL WHERE o.OrderDate BETWEEN '"+startdate+"' AND '"+Enddate+"' GROUP BY ci.Item_name ORDER BY SUM(oi.Quantity) + SUM(oi.Total) DESC LIMIT 5";
            JRDesignQuery updateQuery=new JRDesignQuery();
            updateQuery.setText(sql);
            
            desin.setQuery(updateQuery);
            

            JasperReport jreport=JasperCompileManager.compileReport(desin);
            JasperPrint jprint=JasperFillManager.fillReport(jreport, null,con);
            
            //JasperViewer.viewReport(jprint);
            JRViewer view1 = new JRViewer(jprint);
        
            panel_saleReport_show1.removeAll();
            panel_saleReport_show1.repaint();
            panel_saleReport_show1.revalidate();
        
            panel_saleReport_show1.setLayout(new BorderLayout());
            panel_saleReport_show1.add(view1);

            
            
            
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
        catch (JRException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        
        
        

        
        
        
    }//GEN-LAST:event_btn_bestselActionPerformed

    private void btn_monthlysaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_monthlysaleActionPerformed
        // TODO add your handling code here:
        Connection con;
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
        String startdate = dateformat.format(date_start.getDate());
        String Enddate = dateformat.format(date_end.getDate());
       
        try {
            

            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resdb","root","");
            JasperDesign desin=JRXmlLoader.load("C:\\Users\\User\\OneDrive\\Documents\\EAD\\CWEAD55v1.2\\CWEAD55\\src\\View\\saleReport.jrxml");
            String sql="SELECT SUM(CASE WHEN mi.Item_Category= 'Pizza' THEN oi.Total ELSE 0 END) AS PizzaSales, SUM(CASE WHEN mi.Item_Category = 'Beverages' THEN oi.Total ELSE 0 END) AS BeveragesSales, SUM(CASE WHEN mi.Item_Category = 'Appertizers ' THEN oi.Total ELSE 0 END) AS appetizersale, SUM(CASE WHEN mi.Item_Category = 'Desserts' THEN oi.Total ELSE 0 END) AS Dessertsale , SUM(Service_charges) AS TotalServiceCharges, SUM(Tax) AS TotalTax, SUM(OrderTotal) AS TotalSale, SUM(CASE WHEN OrderType = 'Take Away' THEN OrderTotal ELSE 0 END) AS TakeAwaySale, SUM(CASE WHEN OrderType = 'Dine In' THEN OrderTotal ELSE 0 END) AS DineInSale, MIN(OrderDate) AS StartDate, MAX(OrderDate) AS EndDate FROM orders o INNER JOIN orderitems oi ON o.OrderBILL = oi.OrderBILL INNER JOIN menuitem mi ON oi.ItemID = mi.ItemID WHERE o.OrderStatus = 'completed' AND o.OrderDate BETWEEN '"+startdate+"' AND '"+Enddate+"';";
            JRDesignQuery updateQuery=new JRDesignQuery();
            updateQuery.setText(sql);
            
            desin.setQuery(updateQuery);
            

            JasperReport jreport=JasperCompileManager.compileReport(desin);
            JasperPrint jprint=JasperFillManager.fillReport(jreport, null,con);
            
            //JasperViewer.viewReport(jprint);
            JRViewer view1 = new JRViewer(jprint);
        
            panel_saleReport_show.removeAll();
            panel_saleReport_show.repaint();
            panel_saleReport_show.revalidate();
        
            panel_saleReport_show.setLayout(new BorderLayout());
            panel_saleReport_show.add(view1);

            
            
            
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
        catch (JRException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btn_monthlysaleActionPerformed

    
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
            java.util.logging.Logger.getLogger(VmangerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VmangerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VmangerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VmangerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VmangerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allOrders;
    private javax.swing.JPanel all_itempanel;
    private rojeru_san.complementos.RSButtonHover btn_bestSellings;
    private rojeru_san.complementos.RSButtonHover btn_bestsel;
    private rojeru_san.complementos.RSButtonHover btn_clearall;
    private rojeru_san.complementos.RSButtonHover btn_daliysale;
    private rojeru_san.complementos.RSButtonHover btn_empDelete;
    private rojeru_san.complementos.RSButtonHover btn_empDelete1;
    private rojeru_san.complementos.RSButtonHover btn_empUpdate;
    private rojeru_san.complementos.RSButtonHover btn_employess1;
    private rojeru_san.complementos.RSButtonHover btn_empsave;
    private javax.swing.JButton btn_exit;
    private rojeru_san.complementos.RSButtonHover btn_homes;
    private rojeru_san.complementos.RSButtonHover btn_itemdelete;
    private javax.swing.JButton btn_logout;
    private rojeru_san.complementos.RSButtonHover btn_menuItem;
    private rojeru_san.complementos.RSButtonHover btn_monthlysale;
    private rojeru_san.complementos.RSButtonHover btn_orders;
    private rojeru_san.complementos.RSButtonHover btn_otherReports;
    private rojeru_san.complementos.RSButtonHover btn_picUpload;
    private rojeru_san.complementos.RSButtonHover btn_salesReport;
    private rojeru_san.complementos.RSButtonHover btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_search1;
    private rojeru_san.complementos.RSButtonHover btn_update;
    private rojeru_san.complementos.RSButtonHover btn_uplaod;
    private javax.swing.JComboBox<String> com_availbility;
    private javax.swing.JComboBox<String> com_catogary;
    private javax.swing.JComboBox<String> com_emptype;
    private javax.swing.JComboBox<String> com_gender;
    private javax.swing.JComboBox<String> com_search;
    private com.toedter.calendar.JDateChooser date_end;
    private com.toedter.calendar.JDateChooser date_end_sale;
    private com.toedter.calendar.JDateChooser date_start;
    private com.toedter.calendar.JDateChooser date_start_sale;
    private com.toedter.calendar.JDateChooser datepiker;
    private javax.swing.JPanel employeepanel;
    private java.awt.Panel headingpanel;
    private javax.swing.JPanel item_mangement;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbl_canselord;
    private javax.swing.JLabel lbl_count;
    private java.awt.Label lbl_dateshow;
    private javax.swing.JLabel lbl_dayname;
    private javax.swing.JLabel lbl_empPIC;
    private javax.swing.JLabel lbl_itemimage;
    public javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_ordcount;
    private javax.swing.JLabel lbl_revenue;
    private java.awt.Label lbl_timeshow;
    private javax.swing.JPanel menupanel;
    private javax.swing.JPanel panel_saleReport_show;
    private javax.swing.JPanel panel_saleReport_show1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover10;
    private rojeru_san.complementos.RSButtonHover rSButtonHover9;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    private rojeru_san.complementos.RSTableMetro rSTableMetro2;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_empid;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_itemcode;
    private javax.swing.JTextField txt_itemname;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    
    
    //this codes for the Datetime
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
