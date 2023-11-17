
package View;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import Model.MDBconnection;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.rtf.RTFEditorKit;
import Controller.*;
import Model.MgetItemInfo;
import java.awt.Color;
import java.awt.TextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class VcashierPOS extends javax.swing.JFrame implements Runnable{

    int hour,second,minute,year,month,day;
    
    public VcashierPOS() {
        initComponents();
        // THIS CODE TO USE SET COULUM SIZE OF THE JTABLE
        itemshow.getColumnModel().getColumn(0).setPreferredWidth(5);
        itemshow.getColumnModel().getColumn(1).setPreferredWidth(200);
        itemshow.getColumnModel().getColumn(2).setPreferredWidth(20);
        itemshow.getColumnModel().getColumn(3).setPreferredWidth(50);
        
        
        // this code is used set icon for the application
        Image icon = new ImageIcon(this.getClass().getResource("/logo.jpg")).getImage();
        this.setIconImage(icon);
        // this codes for the digital clock
        Thread t=new Thread(this);
        t.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPOS = new javax.swing.JPanel();
        comboxshow = new javax.swing.JPanel();
        com_selectItem = new javax.swing.JComboBox<>();
        btn_close1 = new rojeru_san.complementos.RSButtonHover();
        Payament = new javax.swing.JPanel();
        lbl_balance = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_paidAmount = new javax.swing.JTextField();
        lbl_totalAmount = new javax.swing.JLabel();
        com_paymentmethod = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btn_pay = new rojeru_san.complementos.RSButtonHover();
        btn_print = new rojeru_san.complementos.RSButtonHover();
        btn_back = new rojeru_san.complementos.RSButtonHover();
        lbl_erroramount = new javax.swing.JLabel();
        headingpanel = new java.awt.Panel();
        jLabel8 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        lbl_timeshow = new java.awt.Label();
        lbl_dateshow = new java.awt.Label();
        lbl_login = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_dayname = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_cusaddress = new app.bolivia.swing.JCTextField();
        txt_cusTel = new app.bolivia.swing.JCTextField();
        txt_cusName = new app.bolivia.swing.JCTextField();
        jLabel10 = new javax.swing.JLabel();
        lbl_itemprice = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        com_ordType = new javax.swing.JComboBox<>();
        com_tableID = new javax.swing.JComboBox<>();
        btn_dessert = new rojeru_san.complementos.RSButtonHover();
        btn_pizza = new rojeru_san.complementos.RSButtonHover();
        btn_appertize = new rojeru_san.complementos.RSButtonHover();
        btn_beverage = new rojeru_san.complementos.RSButtonHover();
        billitem_view = new javax.swing.JScrollPane();
        itemshow = new javax.swing.JTable();
        billvalue = new javax.swing.JPanel();
        lbl_subtotal = new javax.swing.JLabel();
        lbl_tax = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_sevice = new javax.swing.JLabel();
        lbl_netTotal = new javax.swing.JLabel();
        btn_paynow = new rojeru_san.complementos.RSButtonHover();
        btn_save = new rojeru_san.complementos.RSButtonHover();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txt_billNo = new javax.swing.JTextField();
        btn_addCart = new rojeru_san.complementos.RSButtonHover();
        btn_removeItem = new rojeru_san.complementos.RSButtonHover();
        lbl_ItemID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPOS.setBackground(new java.awt.Color(255, 255, 255));
        mainPOS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboxshow.setBackground(new java.awt.Color(255, 255, 255));
        comboxshow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 3));

        com_selectItem.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        com_selectItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item" }));
        com_selectItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, new java.awt.Color(255, 0, 51), java.awt.Color.black, java.awt.Color.black));
        com_selectItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        com_selectItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                com_selectItemItemStateChanged(evt);
            }
        });
        com_selectItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                com_selectItemMouseClicked(evt);
            }
        });
        com_selectItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_selectItemActionPerformed(evt);
            }
        });

        btn_close1.setBackground(new java.awt.Color(255, 255, 255));
        btn_close1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btn_close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-button.png"))); // NOI18N
        btn_close1.setText("Back");
        btn_close1.setColorHover(new java.awt.Color(0, 0, 0));
        btn_close1.setColorText(new java.awt.Color(0, 0, 0));
        btn_close1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_close1.setIconTextGap(15);
        btn_close1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-button (1).png"))); // NOI18N
        btn_close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_close1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout comboxshowLayout = new javax.swing.GroupLayout(comboxshow);
        comboxshow.setLayout(comboxshowLayout);
        comboxshowLayout.setHorizontalGroup(
            comboxshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comboxshowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comboxshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(com_selectItem, 0, 592, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comboxshowLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_close1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        comboxshowLayout.setVerticalGroup(
            comboxshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comboxshowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(com_selectItem, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btn_close1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPOS.add(comboxshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 610, 150));

        Payament.setBackground(new java.awt.Color(255, 255, 255));
        Payament.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Payament.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_balance.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_balance.setText("0.00");
        lbl_balance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Payament.add(lbl_balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 250, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("Balance");
        Payament.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 100, 30));

        txt_paidAmount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_paidAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_paidAmountFocusLost(evt);
            }
        });
        txt_paidAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paidAmountActionPerformed(evt);
            }
        });
        txt_paidAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_paidAmountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_paidAmountKeyTyped(evt);
            }
        });
        Payament.add(txt_paidAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 250, 50));

        lbl_totalAmount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_totalAmount.setText("0.00");
        lbl_totalAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Payament.add(lbl_totalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 250, 50));

        com_paymentmethod.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        com_paymentmethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card" }));
        com_paymentmethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_paymentmethodActionPerformed(evt);
            }
        });
        Payament.add(com_paymentmethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 250, 50));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setText("Total");
        Payament.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 80, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setText("Method");
        Payament.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setText("Amount");
        Payament.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 110, 30));

        btn_pay.setBackground(new java.awt.Color(0, 153, 51));
        btn_pay.setText("Pay");
        btn_pay.setColorHover(new java.awt.Color(0, 255, 0));
        btn_pay.setColorTextHover(new java.awt.Color(0, 0, 0));
        btn_pay.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });
        Payament.add(btn_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 230, 100));

        btn_print.setBackground(new java.awt.Color(204, 0, 51));
        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/printer (2).png"))); // NOI18N
        btn_print.setText("Print");
        btn_print.setColorHover(new java.awt.Color(0, 0, 0));
        btn_print.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_print.setIconTextGap(15);
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        Payament.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 130, 60));

        btn_back.setBackground(new java.awt.Color(255, 255, 255));
        btn_back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-button.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.setColorHover(new java.awt.Color(0, 0, 0));
        btn_back.setColorText(new java.awt.Color(0, 0, 0));
        btn_back.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_back.setIconTextGap(15);
        btn_back.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-button (1).png"))); // NOI18N
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        Payament.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 130, 60));

        lbl_erroramount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_erroramount.setForeground(new java.awt.Color(255, 0, 0));
        Payament.add(lbl_erroramount, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 300, -1));

        mainPOS.add(Payament, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 470, 620));

        headingpanel.setBackground(new java.awt.Color(0, 0, 0));
        headingpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cropped-arthurs-logo-01 (2).png"))); // NOI18N
        jLabel8.setText("jLabel5");
        headingpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 121, 60));

        btn_logout.setBackground(new java.awt.Color(0, 0, 0));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout (2).png"))); // NOI18N
        btn_logout.setToolTipText("Logout");
        btn_logout.setBorder(null);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        headingpanel.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, -1, -1));

        btn_exit.setBackground(new java.awt.Color(0, 0, 0));
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/switch (1) (1).png"))); // NOI18N
        btn_exit.setToolTipText("Exit");
        btn_exit.setBorder(null);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        headingpanel.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, -1, -1));

        lbl_timeshow.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_timeshow.setForeground(new java.awt.Color(255, 255, 255));
        lbl_timeshow.setText("11.07.00AM");
        headingpanel.add(lbl_timeshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 5, -1, 40));

        lbl_dateshow.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_dateshow.setForeground(new java.awt.Color(255, 255, 255));
        lbl_dateshow.setText("2023-11-20");
        headingpanel.add(lbl_dateshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 100, 30));

        lbl_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(255, 0, 0));
        lbl_login.setText("EID000001");
        headingpanel.add(lbl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 80, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User : ");
        headingpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, 30));

        lbl_dayname.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_dayname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_dayname.setText("Sunday");
        headingpanel.add(lbl_dayname, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 100, 30));

        btn_home.setBackground(new java.awt.Color(0, 0, 0));
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home (1).png"))); // NOI18N
        btn_home.setToolTipText("Home");
        btn_home.setBorder(null);
        btn_home.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_home.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_home.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_home.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home (4).png"))); // NOI18N
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        headingpanel.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, -1, -1));

        mainPOS.add(headingpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1297, 57));
        mainPOS.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 610, -1, -1));

        txt_cusaddress.setToolTipText("");
        txt_cusaddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_cusaddress.setPlaceholder("Customer Address");
        txt_cusaddress.setSelectionColor(new java.awt.Color(204, 0, 51));
        mainPOS.add(txt_cusaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 420, 50));

        txt_cusTel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 51), new java.awt.Color(0, 0, 0)));
        txt_cusTel.setText("+94");
        txt_cusTel.setToolTipText("");
        txt_cusTel.setFocusTraversalPolicyProvider(true);
        txt_cusTel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_cusTel.setPlaceholder("Mobile No");
        txt_cusTel.setSelectionColor(new java.awt.Color(0, 0, 0));
        txt_cusTel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_cusTelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cusTelFocusLost(evt);
            }
        });
        txt_cusTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cusTelActionPerformed(evt);
            }
        });
        txt_cusTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cusTelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cusTelKeyTyped(evt);
            }
        });
        mainPOS.add(txt_cusTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 420, 50));

        txt_cusName.setToolTipText("");
        txt_cusName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_cusName.setPlaceholder("Customer Name");
        txt_cusName.setSelectionColor(new java.awt.Color(204, 0, 51));
        txt_cusName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cusNameKeyTyped(evt);
            }
        });
        mainPOS.add(txt_cusName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 420, 50));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setText("Price");
        mainPOS.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        lbl_itemprice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_itemprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_itemprice.setText("0.00");
        lbl_itemprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbl_itemprice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mainPOS.add(lbl_itemprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 150, 40));

        jSpinner1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 17, 1));
        jSpinner1.setBorder(null);
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSpinner1.setValue(1);
        mainPOS.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 170, 60));

        com_ordType.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        com_ordType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dine In", "Take Away", " " }));
        com_ordType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_ordTypeActionPerformed(evt);
            }
        });
        mainPOS.add(com_ordType, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 420, 60));

        com_tableID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        com_tableID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Table", "A01", "A02", "A03" }));
        mainPOS.add(com_tableID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 160, 40));

        btn_dessert.setBackground(new java.awt.Color(0, 0, 0));
        btn_dessert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        btn_dessert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cupcake.png"))); // NOI18N
        btn_dessert.setText("Dessert");
        btn_dessert.setColorHover(new java.awt.Color(255, 255, 255));
        btn_dessert.setColorTextHover(new java.awt.Color(255, 0, 51));
        btn_dessert.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_dessert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dessert.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_dessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dessertActionPerformed(evt);
            }
        });
        mainPOS.add(btn_dessert, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 140, 140));

        btn_pizza.setBackground(new java.awt.Color(0, 0, 0));
        btn_pizza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        btn_pizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pizza (5).png"))); // NOI18N
        btn_pizza.setText("Pizza");
        btn_pizza.setColorHover(new java.awt.Color(255, 255, 255));
        btn_pizza.setColorTextHover(new java.awt.Color(204, 0, 51));
        btn_pizza.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_pizza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pizza.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pizzaActionPerformed(evt);
            }
        });
        mainPOS.add(btn_pizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 150, 140));

        btn_appertize.setBackground(new java.awt.Color(0, 0, 0));
        btn_appertize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        btn_appertize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nachos (1).png"))); // NOI18N
        btn_appertize.setText("Appertize");
        btn_appertize.setColorHover(new java.awt.Color(255, 255, 255));
        btn_appertize.setColorTextHover(new java.awt.Color(255, 0, 51));
        btn_appertize.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_appertize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_appertize.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_appertize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_appertizeMouseEntered(evt);
            }
        });
        btn_appertize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_appertizeActionPerformed(evt);
            }
        });
        mainPOS.add(btn_appertize, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 150, 140));

        btn_beverage.setBackground(new java.awt.Color(0, 0, 0));
        btn_beverage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        btn_beverage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soft-drink.png"))); // NOI18N
        btn_beverage.setText("Beverage");
        btn_beverage.setColorHover(new java.awt.Color(255, 255, 255));
        btn_beverage.setColorTextHover(new java.awt.Color(255, 0, 51));
        btn_beverage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_beverage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_beverage.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_beverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_beverageActionPerformed(evt);
            }
        });
        mainPOS.add(btn_beverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 140, 140));

        itemshow.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Qty", "Price"
            }
        ));
        itemshow.setRowHeight(40);
        itemshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemshowMouseClicked(evt);
            }
        });
        billitem_view.setViewportView(itemshow);

        mainPOS.add(billitem_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, -1, 370));

        billvalue.setBackground(new java.awt.Color(255, 255, 255));
        billvalue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        billvalue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_subtotal.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lbl_subtotal.setText("0.00");
        billvalue.add(lbl_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 90, 40));

        lbl_tax.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_tax.setText("0.00");
        billvalue.add(lbl_tax, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 60, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Service Charge");
        billvalue.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lbl_sevice.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_sevice.setText("0.00");
        billvalue.add(lbl_sevice, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 70, -1));

        lbl_netTotal.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lbl_netTotal.setText("0.00");
        billvalue.add(lbl_netTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 120, -1));

        btn_paynow.setBackground(new java.awt.Color(0, 153, 0));
        btn_paynow.setText("Pay Now");
        btn_paynow.setColorHover(new java.awt.Color(0, 255, 0));
        btn_paynow.setColorTextHover(new java.awt.Color(0, 0, 0));
        btn_paynow.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/disabled.png"))); // NOI18N
        btn_paynow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_paynow.setIconTextGap(18);
        btn_paynow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paynowActionPerformed(evt);
            }
        });
        billvalue.add(btn_paynow, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 240, 74));

        btn_save.setBackground(new java.awt.Color(255, 255, 255));
        btn_save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 3));
        btn_save.setForeground(new java.awt.Color(204, 0, 51));
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/floppy-disk (4).png"))); // NOI18N
        btn_save.setText("Save");
        btn_save.setColorHover(new java.awt.Color(204, 0, 51));
        btn_save.setColorText(new java.awt.Color(204, 0, 51));
        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_save.setIconTextGap(15);
        btn_save.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/floppy-disk (5).png"))); // NOI18N
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        billvalue.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, 74));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel12.setText("Total");
        billvalue.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel13.setText("Sub Total");
        billvalue.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("Tax fee");
        billvalue.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        mainPOS.add(billvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 450, 230));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPOS.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 1280, 20));

        txt_billNo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_billNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_billNoActionPerformed(evt);
            }
        });
        mainPOS.add(txt_billNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 160, 40));

        btn_addCart.setBackground(new java.awt.Color(204, 0, 51));
        btn_addCart.setText("ADD");
        btn_addCart.setColorHover(new java.awt.Color(0, 153, 0));
        btn_addCart.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/disabled.png"))); // NOI18N
        btn_addCart.setDisabledSelectedIcon(null);
        btn_addCart.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_addCart.setIconTextGap(17);
        btn_addCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCartActionPerformed(evt);
            }
        });
        mainPOS.add(btn_addCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 620, -1, 60));

        btn_removeItem.setBackground(new java.awt.Color(0, 0, 0));
        btn_removeItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bin (2).png"))); // NOI18N
        btn_removeItem.setColorHover(new java.awt.Color(255, 0, 51));
        btn_removeItem.setIconTextGap(0);
        btn_removeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeItemActionPerformed(evt);
            }
        });
        mainPOS.add(btn_removeItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 140, 50, -1));

        lbl_ItemID.setBackground(new java.awt.Color(255, 255, 255));
        lbl_ItemID.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ItemID.setText("o.");
        mainPOS.add(lbl_ItemID, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 70, -1));

        getContentPane().add(mainPOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        setSize(new java.awt.Dimension(1282, 721));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed

        Login2 login =new Login2();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    
    public void automiaticID()//this method to used autoincrement bill no
    {
        try {
            Statement st=MDBconnection.connectDB().createStatement();
            ResultSet rs=st.executeQuery("select MAX(OrderBILL)from orders");
            if(rs.next())
            {
                String maxid=rs.getString(1);
                if(maxid==null)
                {
                    txt_billNo.setText("Bill000001");
                    
                }
                else
                {
                    int num=Integer.parseInt(maxid.substring(4,10));
                    num++;
                    txt_billNo.setText(String.format("Bill%06d", num));
 
                }
                
            }
            else
            {
                txt_billNo.setText("Bill000001");
            }
            
          st.close();
          rs.close();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e.getMessage());
 
        }
   
    }

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        Vcashier page=new Vcashier();
        int option = JOptionPane.showConfirmDialog(page, "Do you want to exit the application?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            // Exit the application
            System.exit(0);
        }
        
    }//GEN-LAST:event_btn_exitActionPerformed

    private void txt_paidAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paidAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_paidAmountActionPerformed

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
            String billno=txt_billNo.getText();
            
            
            try 
            {
             //String paidAmountText = txt_paidAmount.getText().trim();
                
            if(txt_paidAmount.getText().isEmpty())
            {
                lbl_erroramount.setText("please enter a Amount");
            }
            else if(Double.parseDouble(txt_paidAmount.getText())<Double.parseDouble(lbl_totalAmount.getText()))
            {
                lbl_erroramount.setText("Amount Should be Greater than or Equal Total");


                
            }
            else
            {
                 if(!txt_paidAmount.getText().isEmpty())
               {
                String paymentmethod =com_paymentmethod.getSelectedItem().toString();
                double paidamount=Double.parseDouble(txt_paidAmount.getText());
                double balance=Double.parseDouble(lbl_balance.getText());

                String orderstatus="Completed";
     
                CaddOrder order=new CaddOrder();
                order.paidorder(billno, paymentmethod, paidamount, balance, orderstatus);
                 
                 btn_print.setEnabled(true);
                 btn_back.setEnabled(true);
                
                
                }
                
                
            }

            } 
            catch (Exception e) 
            {
              JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
        
    }//GEN-LAST:event_btn_payActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        automiaticID();
        lbl_itemprice.setText(String.format("%.2f", 0.00));
        comboxshow.setVisible(false);
        btn_addCart.setEnabled(false);
        txt_billNo.setEditable(false);
        btn_paynow.setEnabled(false);
        txt_cusTel.setEditable(false);
        
            btn_dessert.setEnabled(false);
            btn_appertize.setEnabled(false);
            btn_beverage.setEnabled(false);
            btn_pizza.setEnabled(false);
            btn_save.setEnabled(false);
            btn_print.setEnabled(false);
            btn_back.setEnabled(false);

   
    }//GEN-LAST:event_formWindowOpened

    private void btn_paynowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paynowActionPerformed
        // TODO add your handling code here:
        billitem_view.setVisible(false);
        billvalue.setVisible(false);
        Payament.setVisible(true);
        btn_exit.setEnabled(false);
        btn_logout.setEnabled(false);
        btn_print.setEnabled(false);
        btn_back.setEnabled(false);
        btn_home.setEnabled(false);
        
        
        
    }//GEN-LAST:event_btn_paynowActionPerformed

    private void itemshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemshowMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_itemshowMouseClicked

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        try 
        {
               double value=0.00;
            txt_cusTel.setText("+94");
            txt_cusName.setText("");
            txt_cusaddress.setText("");
            automiaticID();
             DefaultTableModel model=(DefaultTableModel)itemshow.getModel();//clear table
             model.setRowCount(0);

            btn_paynow.setEnabled(false);
            txt_cusTel.setEditable(false);
        
            btn_dessert.setEnabled(false);
            btn_appertize.setEnabled(false);
            btn_beverage.setEnabled(false);
            btn_pizza.setEnabled(false);
            btn_save.setEnabled(false);
            btn_home.setEnabled(true);
            
          
        
        
        
        
        txt_paidAmount.setText("");
        lbl_balance.setText("0.00");
        
        
        
        lbl_subtotal.setText("0.00");
        lbl_tax.setText("0.00");
        lbl_sevice.setText("0.00");
        lbl_netTotal.setText("0.00");
        btn_exit.setEnabled(true);
        btn_logout.setEnabled(true);
        
        Payament.setVisible(false);
        billitem_view.setVisible(true);
        billvalue.setVisible(true);
        

        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
  
    }//GEN-LAST:event_btn_backActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Payament.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

     
    public void getItems(String type)
    {
        try 
        {
            Statement st=MDBconnection.connectDB().createStatement();
            ResultSet rs=st.executeQuery("SELECT Item_name FROM menuitem WHERE Item_Category='"+type+"' and Item_availability='Available '");
            while(rs.next())
            {
                String itemlist=rs.getString("Item_name");
                com_selectItem.addItem(itemlist);
   
            }
             st.close();
             rs.close();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex.getMessage());
 
        }
    }
    
    

    private void btn_pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pizzaActionPerformed
        // TODO add your handling code here:
        comboxshow.setVisible(true);
        getItems("Pizza");
        btn_addCart.setEnabled(true);
        
      
        
    }//GEN-LAST:event_btn_pizzaActionPerformed

    private void btn_appertizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_appertizeActionPerformed
        // TODO add your handling code here:
        comboxshow.setVisible(true);
        getItems("Appertizers ");
        btn_addCart.setEnabled(true);
        
        
    }//GEN-LAST:event_btn_appertizeActionPerformed

    private void btn_beverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_beverageActionPerformed
        // TODO add your handling code here:
        comboxshow.setVisible(true);
        getItems("Beverages");
        btn_addCart.setEnabled(true);
    }//GEN-LAST:event_btn_beverageActionPerformed

    private void btn_dessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dessertActionPerformed
        // TODO add your handling code here:
        comboxshow.setVisible(true);
        getItems("Desserts");
        btn_addCart.setEnabled(true);
    }//GEN-LAST:event_btn_dessertActionPerformed

    private void btn_appertizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_appertizeMouseEntered
        
    }//GEN-LAST:event_btn_appertizeMouseEntered

    private void com_selectItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_selectItemActionPerformed
        // this method to use load price to the jlbale
        //meka if ekn wenne nullpointerexception ain karanawa
        //eka wenne combo box eka empty time ekata meka mey method eka run wenne na 
        // combo box eke item ekak thiyena welawata withari meka run wela price eka ganne item eke
         if (com_selectItem.getSelectedItem() != null)
         {
             String selectvalue=com_selectItem.getSelectedItem().toString();
         
             CgetItemInfo item=new CgetItemInfo();
             lbl_itemprice.setText(String.format("%.2f", item.getprice(selectvalue)));
             lbl_ItemID.setText(item.getItemID(selectvalue));
 
         }
  
    }//GEN-LAST:event_com_selectItemActionPerformed

    private void com_selectItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_com_selectItemMouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_com_selectItemMouseClicked

    private void com_selectItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_com_selectItemItemStateChanged
        // TODO add your handling code here:
            
    }//GEN-LAST:event_com_selectItemItemStateChanged

    private void btn_close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_close1ActionPerformed
         comboxshow.setVisible(false);
         btn_addCart.setEnabled(false);
         jSpinner1.setValue(1);
         lbl_itemprice.setText(String.format("%.2f", 0.00));
         lbl_ItemID.setText("0000");
         com_selectItem.removeAllItems();
    }//GEN-LAST:event_btn_close1ActionPerformed

    private void com_ordTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_ordTypeActionPerformed
         String selectvalue=com_ordType.getSelectedItem().toString();
        if("Take Away".equals(selectvalue)|| "Dine In".equals(selectvalue))
        {
            txt_cusTel.setEditable(true);
            btn_dessert.setEnabled(true);
            btn_appertize.setEnabled(true);
            btn_beverage.setEnabled(true);
            btn_pizza.setEnabled(true);
            
            
            if("Take Away".equals(selectvalue))
            {
              com_tableID.setEnabled(false);  
            }
            else if("Dine In".equals(selectvalue))
            {
                com_tableID.setEnabled(true);
                
            }
            
        }
        else{
            com_tableID.setEnabled(true);
        }
        
    }//GEN-LAST:event_com_ordTypeActionPerformed

    private void txt_cusTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cusTelActionPerformed
        
        
                
    }//GEN-LAST:event_txt_cusTelActionPerformed

    private void txt_cusTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cusTelKeyTyped
        char c=evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_txt_cusTelKeyTyped

    private void txt_billNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_billNoActionPerformed
        // TODO add your handling code here:
        txt_billNo.setEditable(false);
    }//GEN-LAST:event_txt_billNoActionPerformed

    private void txt_cusTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cusTelKeyReleased
        //THIS CODE USED GET CUSTOMER DEATILS WHEN PHONE NUMBER TYPED
         String telno=txt_cusTel.getText();
         checktext();
        
        CgetCUSinfo cus=new CgetCUSinfo();
        txt_cusName.setText(cus.getCusname(telno));
        txt_cusaddress.setText(cus.getCusaddress(telno));
    }//GEN-LAST:event_txt_cusTelKeyReleased

    
    /*public void billToDB()
    {    
        String billno=txt_billNo.getText();
        try
        {
            
            Statement st =MDBconnection.connectDB().createStatement();
            st.executeUpdate("insert into orders (OrderBILL) values ('"+billno+"')");
            
            st.close();
            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }*/
    
    public void addItemCart()
    { 
        
        String billno=txt_billNo.getText();
        String itemid=lbl_ItemID.getText();
        double itemprice=Double.parseDouble(lbl_itemprice.getText());//convert that value to double 
        int quantity=(Integer)jSpinner1.getValue();
        double itemtotal=(itemprice*quantity);
        
        try
        {
            
            Statement st =MDBconnection.connectDB().createStatement();
            ResultSet rs = null;
            int value = st.executeUpdate("insert into orderitems (OrderBILL,ItemID,Quantity,UnitPrice,Total) values ('"+billno+"','"+itemid+"','"+quantity+"','"+itemprice+"','"+itemtotal+"')");
            
            if (value==1)
            {
                 rs=st.executeQuery("select DISTINCT OrderItemID ,Item_name,Quantity,Total from orderitems INNER JOIN menuitem ON orderitems.ItemID=menuitem.ItemID where OrderBILL='"+billno+"' ");
                 while (rs.next())
                 {
                     String id=String.valueOf(rs.getInt("OrderItemID"));
                     String itemname=rs.getString("Item_name");
                     String qty=String.valueOf(rs.getInt("Quantity"));;
                     String price=String.valueOf(rs.getInt("Total"));;
 
                     // Check if the item is already in the table
                     //meken wenne mama ekaparak add karapu item aai jtable eke penane nathi widiyata eaa item eka table
                     //eke thiyenawada nadda kiyalablanawa tibboth penne naha
                     boolean itemExists = false;
                     for (int i = 0; i < itemshow.getRowCount(); i++)
                     {
                         if (id.equals(itemshow.getValueAt(i, 0)) &&
                             itemname.equals(itemshow.getValueAt(i, 1)) &&
                             qty.equals(itemshow.getValueAt(i, 2)) &&
                             price.equals(itemshow.getValueAt(i, 3)))
                         {
                             itemExists = true;
                             break;
                         }
                     }
                     // If the item is not in the table, add it
                     if(!itemExists)
                     {
                        //string array for store data into database
                     
                        String tbdata[]={id,itemname,qty,price};
                        DefaultTableModel tblModel=(DefaultTableModel)itemshow.getModel();
                        tblModel.addRow(tbdata);  
                     }
    
                 }
  
            }

            st.close();
            rs.close();
            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null,ex.getMessage());
 
        }
        
    }
    

    private void btn_addCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCartActionPerformed
      
        String billno=txt_billNo.getText();
        
        CaddItemCart cart=new CaddItemCart();
        
        int count=0;
        try
        {
            Statement st=MDBconnection.connectDB().createStatement();
            ResultSet rs=st.executeQuery("SELECT COUNT(*) FROM orders WHERE OrderBILL = '"+billno+"'");
            
            if (rs.next()) 
            {
                count=rs.getInt(1);
                
            }
           if(count>0)
           {
               addItemCart();
            
           }
            else
            {
                cart.billtoDB(billno);
                addItemCart();
            
            }
            
            
        st.close();
        rs.close();
        }
        
       
        catch (SQLException ex) 
        {
           JOptionPane.showMessageDialog(null,ex.getMessage());  
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null,ex.getMessage());
 
        }
        
        CbillCalculate bill=new CbillCalculate();
        lbl_subtotal.setText(String.format("%.2f", bill.calSubtotal(billno)));
        lbl_tax.setText(String.format("%.2f", bill.caltax(billno)));
        lbl_sevice.setText(String.format("%.2f", bill.calservice(billno)));
        
        lbl_netTotal.setText(String.format("%.2f", bill.caltotal(billno)));
        lbl_totalAmount.setText(String.format("%.2f", bill.caltotal(billno)));
        
        
        
        comboxshow.setVisible(false);
        btn_addCart.setEnabled(false);
        jSpinner1.setValue(1);
        lbl_itemprice.setText(String.format("%.2f", 0.00));
        lbl_ItemID.setText("0000");
        com_selectItem.removeAllItems();
        btn_exit.setEnabled(false);
        btn_logout.setEnabled(false);
        btn_save.setEnabled(true);
        btn_home.setEnabled(false);

    }//GEN-LAST:event_btn_addCartActionPerformed

    private void txt_paidAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paidAmountKeyReleased
        // TODO add your handling code here:
        if(txt_paidAmount.getText().isEmpty())
        {
            double value=0.00;
            
            lbl_balance.setText(String.format("%.2f", value));
        
        }
        else
        {
            double value=Double.parseDouble(lbl_totalAmount.getText());
            double paidamount=Double.parseDouble(txt_paidAmount.getText());
 
            double balance=(paidamount-value);
            lbl_balance.setText(String.format("%.2f", balance));
            
        }
        
        
           
        
        
        
    }//GEN-LAST:event_txt_paidAmountKeyReleased

    private void txt_paidAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paidAmountKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '.') {
         evt.consume();
        }
        
        lbl_erroramount.setText("");

        
    }//GEN-LAST:event_txt_paidAmountKeyTyped

    private void txt_cusTelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cusTelFocusGained
        
    }//GEN-LAST:event_txt_cusTelFocusGained

    public void checktext()
    {
         if(txt_cusTel.getText().isEmpty())
        {
            txt_cusTel.setText("+94");
        }
    }
    private void txt_cusTelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cusTelFocusLost
        if(txt_cusTel.getText().isEmpty())
        {
            txt_cusTel.setText("+94");
        }
    }//GEN-LAST:event_txt_cusTelFocusLost

    private void txt_cusNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cusNameKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isLetter(c) && !Character.isWhitespace(c))
        {
            evt.consume();
        }
       
    }//GEN-LAST:event_txt_cusNameKeyTyped

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        
        
            String tel=txt_cusTel.getText();
            if(tel.length()!=12)
            {
                JOptionPane.showMessageDialog(null, "Please Enter Mobile Number","Error",JOptionPane.ERROR_MESSAGE,null);
                
            }
            else if(txt_cusName.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Customer Name","Error",JOptionPane.ERROR_MESSAGE,null);

                
            }
            else if (txt_cusaddress.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Customer Address","Error",JOptionPane.ERROR_MESSAGE,null);
 
            }
            else
            {
            String custel=txt_cusTel.getText();
            String name=txt_cusName.getText();
            String adress=txt_cusaddress.getText();
        
            String user=lbl_login.getText();
            String billno=txt_billNo.getText();
            String date=lbl_dateshow.getText();
            String time=lbl_timeshow.getText();
            String ordertype =com_ordType.getSelectedItem().toString();
            double total=Double.parseDouble(lbl_netTotal.getText());
            String orderstatus="Order Confirm";
            double service=Double.parseDouble(lbl_sevice.getText());
            double tax=Double.parseDouble(lbl_tax.getText());
            String table=com_tableID.getSelectedItem().toString();
            
            // trhis code used to place order save order deatils to the database
            CaddOrder order =new CaddOrder();
            order.placeorder(custel, name, adress, billno, date, time, ordertype, total, orderstatus, service, tax, table,user);

            btn_paynow.setEnabled(true);
            btn_exit.setEnabled(true);
            btn_logout.setEnabled(true);
            btn_dessert.setEnabled(false);
            btn_appertize.setEnabled(false);
            btn_beverage.setEnabled(false);
            btn_pizza.setEnabled(false);
            btn_save.setEnabled(false);
             btn_home.setEnabled(true);
                
            }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_paidAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_paidAmountFocusLost
        // TODO add your handling code here:
        if(txt_paidAmount.getText().isEmpty())
        {
            double value=0.00;
            //txt_paidAmount.setText(String.format("%.2", value));
            lbl_balance.setText(String.format("%.2f", value));

        }
    }//GEN-LAST:event_txt_paidAmountFocusLost

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        // TODO add your handling code here:
        Connection con;
        try 
        {
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resdb","root","");
            
            JasperDesign desin=JRXmlLoader.load("C:\\Users\\User\\OneDrive\\Documents\\EAD\\CWEAD55v1.2\\CWEAD55\\src\\View\\Bill.jrxml");
            String sql="SELECT orders.OrderBILL, orders.EmpID, orders.PaidAmount, orders.Service_charges, orders.OrderTotal, orders.Tax, orders.Balance, orders.OrderType, orderitems.Total, orderitems.Quantity, menuitem.Item_name FROM orders JOIN orderitems ON orders.OrderBILL = orderitems.OrderBILL JOIN menuitem ON orderitems.ItemID = menuitem.ItemID WHERE orders.OrderBILL='"+txt_billNo.getText()+"';";
            JRDesignQuery updateQuery=new JRDesignQuery();
            updateQuery.setText(sql);
            
            desin.setQuery(updateQuery);
            

            JasperReport jreport=JasperCompileManager.compileReport(desin);
            JasperPrint jprint=JasperFillManager.fillReport(jreport, null,con);
            
            JasperViewer.viewReport(jprint);
            
            
               double value=0.00;
            txt_cusTel.setText("+94");
            txt_cusName.setText("");
            txt_cusaddress.setText("");
            automiaticID();
             DefaultTableModel model=(DefaultTableModel)itemshow.getModel();//clear table
             model.setRowCount(0);

            btn_paynow.setEnabled(false);
            txt_cusTel.setEditable(false);
        
            btn_dessert.setEnabled(false);
            btn_appertize.setEnabled(false);
            btn_beverage.setEnabled(false);
            btn_pizza.setEnabled(false);
            btn_save.setEnabled(false);
            btn_home.setEnabled(true);
        
        
        
        
        txt_paidAmount.setText("");
        lbl_balance.setText("0.00");
        
        
        
        lbl_subtotal.setText("0.00");
        lbl_tax.setText("0.00");
        lbl_sevice.setText("0.00");
        lbl_netTotal.setText("0.00");
        btn_exit.setEnabled(true);
        btn_logout.setEnabled(true);
        
        Payament.setVisible(false);
        billitem_view.setVisible(true);
        billvalue.setVisible(true);
            
            
            
            
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_removeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeItemActionPerformed
        // TODO add your handling code here:
        try 
        {
            int seletedrowIndex=itemshow.getSelectedRow();
            String billno=txt_billNo.getText();
            if(seletedrowIndex !=-1)
            {
                //this code is used to identify the first coulum value
                Object recodeID=itemshow.getValueAt(seletedrowIndex, 0);
                
                String value=recodeID.toString();
                int itemcode=Integer.valueOf(value);
                
                Cremovecart remove =new Cremovecart();
                remove.deleteSelectedRow(itemcode);
                // remove the select row
                DefaultTableModel model=(DefaultTableModel)itemshow.getModel();
                model.removeRow(seletedrowIndex);
                
                CbillCalculate bill=new CbillCalculate();
                 lbl_subtotal.setText(String.format("%.2f", bill.calSubtotal(billno)));
                 lbl_tax.setText(String.format("%.2f", bill.caltax(billno)));
                 lbl_sevice.setText(String.format("%.2f", bill.calservice(billno)));
        
                 lbl_netTotal.setText(String.format("%.2f", bill.caltotal(billno)));
                 lbl_totalAmount.setText(String.format("%.2f", bill.caltotal(billno)));
        
                
                
                
                
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
        
    }//GEN-LAST:event_btn_removeItemActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        Vcashier ui=new Vcashier();
        ui.lbl_login.setText(lbl_login.getText());
        ui.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void com_paymentmethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_paymentmethodActionPerformed
        // TODO add your handling code here:
        
        int index=com_paymentmethod.getSelectedIndex();
        
        if(index==1)
        {
            txt_paidAmount.setText(lbl_totalAmount.getText());
            txt_paidAmount.setEditable(false);
            
        }
        else{
            txt_paidAmount.setText("0");
            txt_paidAmount.setEditable(true);
        }
    }//GEN-LAST:event_com_paymentmethodActionPerformed

    /*public void addcusinfo()
    {
        try {
            String custel=txt_cusTel.getText();
            String name=txt_cusName.getText();
            String adress=txt_cusaddress.getText();
            
            
            
            
            Statement st=MDBconnection.connectDB().createStatement();
            st.executeUpdate("insert into customer (CustomerTel,CusName,CUSaddress) values ('"+custel+"','"+name+"','"+adress+"')");
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }*/
    
    /*public void addorder()
    {
       try {
            String custel=txt_cusTel.getText();
            String billno=txt_billNo.getText();
            String date=lbl_dateshow.getText();
            String time=lbl_timeshow.getText();
            String ordertype =com_ordType.getSelectedItem().toString();
            double total=Double.parseDouble(lbl_netTotal.getText());
            String orderstatus="Order Confirm";
            double service=Double.parseDouble(lbl_sevice.getText());
            double tax=Double.parseDouble(lbl_tax.getText());
            String table=com_tableID.getSelectedItem().toString();
            
            
            
            
            Statement st=MDBconnection.connectDB().createStatement();
            int value =st.executeUpdate("update orders set customerTel='"+custel+"', TableID='"+table+"', OrderDate='"+date+"', OrderTime='"+time+"', OrderType='"+ordertype+"', OrderTotal='"+total+"', OrderStatus='"+orderstatus+"', Service_charges= '"+service+"',Tax='"+tax+"' where OrderBILL='"+billno+"'");
            if(value>0)
            {
               JOptionPane.showMessageDialog(null, "Order placed succsessfully" ,"Info", JOptionPane.INFORMATION_MESSAGE, null);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Unable to place Order" ,"Info", JOptionPane.ERROR_MESSAGE, null);
  
            }
            st.close();
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }*/
    
    
    
    
   
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
            java.util.logging.Logger.getLogger(VcashierPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VcashierPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VcashierPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VcashierPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VcashierPOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Payament;
    private javax.swing.JScrollPane billitem_view;
    private javax.swing.JPanel billvalue;
    private rojeru_san.complementos.RSButtonHover btn_addCart;
    private rojeru_san.complementos.RSButtonHover btn_appertize;
    private rojeru_san.complementos.RSButtonHover btn_back;
    private rojeru_san.complementos.RSButtonHover btn_beverage;
    private rojeru_san.complementos.RSButtonHover btn_close1;
    private rojeru_san.complementos.RSButtonHover btn_dessert;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_logout;
    private rojeru_san.complementos.RSButtonHover btn_pay;
    private rojeru_san.complementos.RSButtonHover btn_paynow;
    private rojeru_san.complementos.RSButtonHover btn_pizza;
    private rojeru_san.complementos.RSButtonHover btn_print;
    private rojeru_san.complementos.RSButtonHover btn_removeItem;
    private rojeru_san.complementos.RSButtonHover btn_save;
    private javax.swing.JComboBox<String> com_ordType;
    private javax.swing.JComboBox<String> com_paymentmethod;
    private javax.swing.JComboBox<String> com_selectItem;
    private javax.swing.JComboBox<String> com_tableID;
    private javax.swing.JPanel comboxshow;
    private java.awt.Panel headingpanel;
    private javax.swing.JTable itemshow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lbl_ItemID;
    private javax.swing.JLabel lbl_balance;
    private java.awt.Label lbl_dateshow;
    private javax.swing.JLabel lbl_dayname;
    private javax.swing.JLabel lbl_erroramount;
    private javax.swing.JLabel lbl_itemprice;
    public javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_netTotal;
    private javax.swing.JLabel lbl_sevice;
    private javax.swing.JLabel lbl_subtotal;
    private javax.swing.JLabel lbl_tax;
    private java.awt.Label lbl_timeshow;
    private javax.swing.JLabel lbl_totalAmount;
    private javax.swing.JPanel mainPOS;
    private javax.swing.JTextField txt_billNo;
    private app.bolivia.swing.JCTextField txt_cusName;
    private app.bolivia.swing.JCTextField txt_cusTel;
    private app.bolivia.swing.JCTextField txt_cusaddress;
    private javax.swing.JTextField txt_paidAmount;
    // End of variables declaration//GEN-END:variables

    @Override//this is set clock and date code
    public void run() {
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
