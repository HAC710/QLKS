
package View;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import View.StaffMainJFrame;
import java.awt.event.KeyEvent;
public class StaffHomeJPanel extends javax.swing.JPanel {

    public StaffHomeJPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbtkho = new javax.swing.JButton();
        jbtBook = new javax.swing.JButton();
        jbtOtherSevices = new javax.swing.JButton();
        jbtSupplies = new javax.swing.JButton();
        jlbLogo = new javax.swing.JLabel();
        jlbCustomerRecord = new javax.swing.JLabel();
        jlbSetting = new javax.swing.JLabel();
        jlbOtherSevices = new javax.swing.JLabel();
        jlbSupplies = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(31, 36, 42));
        jPanel1.setMinimumSize(new java.awt.Dimension(735, 676));
        jPanel1.setPreferredSize(new java.awt.Dimension(735, 676));

        jPanel2.setBackground(new java.awt.Color(31, 36, 42));
        jPanel2.setPreferredSize(new java.awt.Dimension(735, 676));

        jbtkho.setBackground(new java.awt.Color(31, 36, 42));
        jbtkho.setForeground(new java.awt.Color(31, 36, 42));
        jbtkho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_Cashier.png"))); // NOI18N
        jbtkho.setBorder(null);

        jbtBook.setBackground(new java.awt.Color(31, 36, 42));
        jbtBook.setForeground(new java.awt.Color(31, 36, 42));
        jbtBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_Setting.png"))); // NOI18N
        jbtBook.setBorder(null);
        jbtBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBookActionPerformed(evt);
            }
        });

        jbtOtherSevices.setBackground(new java.awt.Color(31, 36, 42));
        jbtOtherSevices.setForeground(new java.awt.Color(31, 36, 42));
        jbtOtherSevices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_OtherSevices.png"))); // NOI18N
        jbtOtherSevices.setBorder(null);
        jbtOtherSevices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtOtherSevicesActionPerformed(evt);
            }
        });

        jbtSupplies.setBackground(new java.awt.Color(31, 36, 42));
        jbtSupplies.setForeground(new java.awt.Color(31, 36, 42));
        jbtSupplies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_Supplies.png"))); // NOI18N
        jbtSupplies.setBorder(null);

        jlbCustomerRecord.setFont(new java.awt.Font("Andong", 0, 14)); // NOI18N
        jlbCustomerRecord.setForeground(new java.awt.Color(51, 255, 102));
        jlbCustomerRecord.setText("Customer Record");

        jlbSetting.setFont(new java.awt.Font("Andong", 0, 14)); // NOI18N
        jlbSetting.setForeground(new java.awt.Color(51, 255, 102));
        jlbSetting.setText("Setting");

        jlbOtherSevices.setFont(new java.awt.Font("Andong", 0, 14)); // NOI18N
        jlbOtherSevices.setForeground(new java.awt.Color(51, 255, 102));
        jlbOtherSevices.setText("Other Sevices");

        jlbSupplies.setFont(new java.awt.Font("Andong", 0, 14)); // NOI18N
        jlbSupplies.setForeground(new java.awt.Color(51, 255, 102));
        jlbSupplies.setText("Supplies");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Andong", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(169, 224, 49));
        jLabel7.setText("Hotel Management");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(169, 224, 49));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_DOT_100px.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(169, 224, 49));
        jLabel15.setText("HVH Soft");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jlbOtherSevices)
                .addGap(253, 253, 253)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtBook, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlbSetting)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(302, 302, 302)
                        .addComponent(jlbLogo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(190, 190, 190)
                                    .addComponent(jbtOtherSevices, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jbtkho, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jlbCustomerRecord)))
                        .addGap(241, 241, 241)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jlbSupplies))
                            .addComponent(jbtSupplies, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addGap(1, 1, 1))))
                        .addGap(17, 17, 17)
                        .addComponent(jbtkho, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtSupplies, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCustomerRecord)
                    .addComponent(jlbSupplies, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtOtherSevices, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBook, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbOtherSevices, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 848, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtBookActionPerformed

    private void jbtOtherSevicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOtherSevicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtOtherSevicesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtBook;
    private javax.swing.JButton jbtOtherSevices;
    private javax.swing.JButton jbtSupplies;
    private javax.swing.JButton jbtkho;
    private javax.swing.JLabel jlbCustomerRecord;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbOtherSevices;
    private javax.swing.JLabel jlbSetting;
    private javax.swing.JLabel jlbSupplies;
    // End of variables declaration//GEN-END:variables
}
