/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presets;

import data.Settings.App_Settings;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Manuel Mora Monge
 */
public class Pnl_StatusBar extends javax.swing.JPanel {

    private JPanel selfPanel;
    private App_Settings appSettings; 
    
    public Pnl_StatusBar() {
    }
    
    public void showPanel(App_Settings appSettings){
        this.appSettings = appSettings;
        selfPanel = this;        
        
        initComponents();
        if (appSettings.getCurrentUser() != null) {
            lb_User.setText(appSettings.getCurrentUser().getUsername());
            lb_UserType.setText(appSettings.getCurrentUser().getUser_type());
        }else{
            lb_User.setText("          ");
            lb_UserType.setText("          ");
        }
        appSettings.setDollarExchangeRate();
        lb_DollarExchangeRate.setText("T. Cambio \t \t Venta: " + appSettings.getDollarExchangeRate()[0] + " /  Compra: " + appSettings.getDollarExchangeRate()[1]);
        
        Thread dateTimeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    lb_Datetime.setText(appSettings.Now());
                    selfPanel.revalidate();
                    //selfPanel.repaint();
                    
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Pnl_StatusBar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        });
        
        dateTimeThread.start();
        
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lb_UserType = new javax.swing.JLabel();
        sep_1 = new javax.swing.JSeparator();
        lb_User = new javax.swing.JLabel();
        sep_2 = new javax.swing.JSeparator();
        lb_DollarExchangeRate = new javax.swing.JLabel();
        sep_3 = new javax.swing.JSeparator();
        lb_Datetime = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(null);
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(975, 30));
        setLayout(new java.awt.GridBagLayout());

        lb_UserType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_UserType.setText("Tipo de acceso: ");
        lb_UserType.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lb_UserType.setMaximumSize(null);
        lb_UserType.setMinimumSize(null);
        lb_UserType.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        add(lb_UserType, gridBagConstraints);

        sep_1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        add(sep_1, gridBagConstraints);

        lb_User.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_User.setText("Usuario:  ");
        lb_User.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_User.setMaximumSize(null);
        lb_User.setMinimumSize(null);
        lb_User.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        add(lb_User, gridBagConstraints);

        sep_2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        add(sep_2, gridBagConstraints);

        lb_DollarExchangeRate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_DollarExchangeRate.setText("Tipo de cambio");
        lb_DollarExchangeRate.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        add(lb_DollarExchangeRate, gridBagConstraints);

        sep_3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        add(sep_3, gridBagConstraints);

        lb_Datetime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_Datetime.setText("01/01/2024 00:00:00 AM");
        lb_Datetime.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lb_Datetime.setMaximumSize(null);
        lb_Datetime.setMinimumSize(null);
        lb_Datetime.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        add(lb_Datetime, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_Datetime;
    private javax.swing.JLabel lb_DollarExchangeRate;
    private javax.swing.JLabel lb_User;
    private javax.swing.JLabel lb_UserType;
    private javax.swing.JSeparator sep_1;
    private javax.swing.JSeparator sep_2;
    private javax.swing.JSeparator sep_3;
    // End of variables declaration//GEN-END:variables
}
