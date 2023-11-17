/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Hirantha perera
 */
public class VloadingPage extends javax.swing.JFrame {

    /**
     * Creates new form loadingPage
     */
    public VloadingPage() {
        initComponents();
         // this code is used set icon for the application
        Image icon = new ImageIcon(this.getClass().getResource("/logo.jpg")).getImage();
        this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Pro_Bar = new javax.swing.JProgressBar();
        lbl_progres = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cropped-arthurs-logo-01 (1).png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 60, 320, 182));

        Pro_Bar.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(Pro_Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 384, 676, 12));

        lbl_progres.setBackground(new java.awt.Color(0, 0, 0));
        lbl_progres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_progres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_progres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_progres.setText("0%");
        jPanel1.add(lbl_progres, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 341, 52, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Loading....");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(718, 421));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    public void loadload()
    {
        VloadingPage loadpage =new VloadingPage();
       loadpage.setVisible(true); // create loading page object and visible it
       
       // this code is for progress bar loading
        try 
        {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(40);
                loadpage.Pro_Bar.setValue(i);
                loadpage.lbl_progres.setText(Integer.toString(i)+"%");
                
                
                
            }
            
        } catch (Exception e) 
        {
            
        }
        // after progress bar laoding hide the loading page visible login page by creating login page Object
        
        loadpage.dispose();
    }
    public static void main(String args[]) 
    {
        
       VloadingPage loadpage =new VloadingPage();
       loadpage.setVisible(true); // create loading page object and visible it
       
       // this code is for progress bar loading
        try 
        {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(40);
                loadpage.Pro_Bar.setValue(i);
                loadpage.lbl_progres.setText(Integer.toString(i)+"%");
                
                
                
            }
            
        } catch (Exception e) 
        {
            
        }
        // after progress bar laoding hide the loading page visible login page by creating login page Object
        
        loadpage.dispose();
        
        
       
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Pro_Bar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_progres;
    // End of variables declaration//GEN-END:variables
}