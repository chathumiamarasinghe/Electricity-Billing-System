/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.bs.GUI;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

/**
 *
 * @author LENOVO
 */
public class EnergyTips extends javax.swing.JFrame {

    /**
     * Creates new form EnergyTips
     */
    public EnergyTips() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        energyTipLabel = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Unit Of Usage");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("kWh");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 40, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 0));
        jButton1.setText("TIPS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        energyTipLabel.setBorder(null);
        jScrollPane1.setViewportView(energyTipLabel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 64, 541, 332));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 153, 0));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Pictures\\BulbShaded.PNG")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 10, 400, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
energyTipLabel.setEditable(false);
        try {
            // Assuming jTextField1 is for entering the number of unit usage
            int unitUsage = Integer.parseInt(jTextField1.getText());

            // Check which category the entered unit usage falls into
            String energyTip;
            energyTipLabel.setEditable(false);

            if (unitUsage < 500) {
    energyTip = "Energy Tip for Low Usage: Turn off lights and appliances when not in use.\n"
            + "Solar Panels: Consider installing solar panels to harness renewable energy and offset a portion of your electricity consumption, reducing monthly bills.\n"
            + "Insulation Upgrade: Enhance insulation in the attic, walls, and basement to maintain comfortable indoor temperatures and reduce heating and cooling costs.\n"
            + "Energy-Efficient Windows: Upgrade to double-pane or energy-efficient windows to minimize heat transfer and improve overall energy efficiency.\n"
            + "Smart Power Management: Invest in smart power strips or outlets that automatically power off electronics when not in use or on a schedule.\n"
            + "Water Heater Timer: Install a timer on your water heater to schedule heating cycles during off-peak hours, saving energy and reducing utility costs.\n"
            + "Landscaping: Plant shade trees around your home to reduce solar heat gain during the summer, lowering the demand for air conditioning.\n"
            + "Energy Monitoring: Use energy monitoring devices to track electricity usage in real-time and identify opportunities for conservation.";
} else if (unitUsage >= 500 && unitUsage < 1000) {
    energyTip = "Energy Tip for Medium Usage: Optimize energy usage during peak hours.\n" +
        "Adjust thermostat settings to conserve energy.\n" +
        "Upgrade to high-efficiency appliances.\n" +
        "Utilize natural lighting whenever possible.\n" +
        "Incorporate energy-saving features into landscaping.\n" +
        "Seal air leaks in windows, doors, and ductwork.\n" +
        "Use ceiling fans to improve airflow and reduce the need for air conditioning.\n" +
        "Install programmable thermostats to regulate temperature settings efficiently.";
} else {
    energyTip = "Energy Tip for High Usage: Conduct a comprehensive energy audit to identify areas of high consumption.\n" +
        "Consider advanced energy-saving technologies such as home automation systems.\n" +
        "Explore alternative energy sources like wind or geothermal power.\n" +
        "Engage in community energy-saving initiatives.\n" +
        "Educate family members or residents on energy-saving practices.\n" +
        "Seek professional advice for tailored energy-saving solutions.\n" +
        "Monitor and reduce standby power consumption by unplugging devices when not in use.\n" +
        "Opt for energy-efficient appliances with the ENERGY STAR label.";
}

            // Set the text of the energyTipLabel to display the energy tip
            energyTipLabel.setText(energyTip);

            energyTipLabel.setText("");

        // Get the styled document
        StyledDocument doc = energyTipLabel.getStyledDocument();

        // Create a simple attribute set for the default text style
        AttributeSet defaultStyle = doc.getStyle(StyleContext.DEFAULT_STYLE);

        // Create a simple attribute set for bold text
        SimpleAttributeSet boldStyle = new SimpleAttributeSet();
        StyleConstants.setBold(boldStyle, true);

        // Create a simple attribute set for regular text
        SimpleAttributeSet regularStyle = new SimpleAttributeSet();
        StyleConstants.setBold(regularStyle, false);

        // Append each line of the energy tip with appropriate style
        for (String line : energyTip.split("\n")) {
            // Check if the line starts with "Energy Tip"
            if (line.startsWith("Energy Tip")) {
                doc.insertString(doc.getLength(), line + "\n", boldStyle);
            } else {
                doc.insertString(doc.getLength(), line + "\n", regularStyle);
            }
        }
            
        } catch (NumberFormatException e) {
            // Handle the case where the user enters a non-numeric value
            energyTipLabel.setText("Please enter a valid number for unit usage.");
        } catch (Exception e) {
            // Handle other exceptions
            energyTipLabel.setText("An error occurred: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Dashboard AfterLoginFrame=new Dashboard();
        AfterLoginFrame.setVisible(true);
        AfterLoginFrame.pack();
        AfterLoginFrame.setLocationRelativeTo(null);
        this.dispose();
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
            java.util.logging.Logger.getLogger(EnergyTips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnergyTips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnergyTips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnergyTips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnergyTips().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane energyTipLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}