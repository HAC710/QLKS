
package View;

import java.awt.BorderLayout;




/**
 *
 * @author PHONG VU
 */
public class HomeJPanel extends javax.swing.JPanel {

   
    public HomeJPanel() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jpnRoot = new javax.swing.JPanel();
        jbtMarket = new javax.swing.JButton();
        jlbCashier = new javax.swing.JLabel();
        jbtkho = new javax.swing.JButton();
        jbtCashier = new javax.swing.JButton();
        jbtBook = new javax.swing.JButton();
        jbtOtherSevices = new javax.swing.JButton();
        jbtSupplies = new javax.swing.JButton();
        jlbLogo = new javax.swing.JLabel();
        jlbCustomerRecord = new javax.swing.JLabel();
        jlbRequestList = new javax.swing.JLabel();
        jlbSetting = new javax.swing.JLabel();
        jlbOtherSevices = new javax.swing.JLabel();
        jlbSupplies = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(169, 224, 49));
        jLabel14.setText("HVH Soft");

        jpnRoot.setBackground(new java.awt.Color(31, 36, 42));
        jpnRoot.setPreferredSize(new java.awt.Dimension(735, 676));

        jbtMarket.setBackground(new java.awt.Color(31, 36, 42));
        jbtMarket.setForeground(new java.awt.Color(31, 36, 42));
        jbtMarket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_List.png"))); // NOI18N
        jbtMarket.setToolTipText("");
        jbtMarket.setBorder(null);

        jlbCashier.setFont(new java.awt.Font("Andong", 0, 14)); // NOI18N
        jlbCashier.setForeground(new java.awt.Color(51, 255, 102));
        jlbCashier.setText("Cashier");

        jbtkho.setBackground(new java.awt.Color(31, 36, 42));
        jbtkho.setForeground(new java.awt.Color(31, 36, 42));
        jbtkho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_Customer.png"))); // NOI18N
        jbtkho.setBorder(null);
        jbtkho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtkhoActionPerformed(evt);
            }
        });

        jbtCashier.setBackground(new java.awt.Color(31, 36, 42));
        jbtCashier.setForeground(new java.awt.Color(31, 36, 42));
        jbtCashier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_Cashier.png"))); // NOI18N
        jbtCashier.setBorder(null);
        jbtCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCashierActionPerformed(evt);
            }
        });

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

        jlbRequestList.setFont(new java.awt.Font("Andong", 0, 14)); // NOI18N
        jlbRequestList.setForeground(new java.awt.Color(51, 255, 102));
        jlbRequestList.setText(" Request List");

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

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jlbCashier)
                                .addGap(255, 255, 255)
                                .addComponent(jlbCustomerRecord))
                            .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtOtherSevices, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtCashier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jlbOtherSevices)
                                .addGap(253, 253, 253))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbRequestList, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(261, 261, 261)))
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtBook, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtkho, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtSupplies, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbSetting)
                                    .addComponent(jlbSupplies))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(303, 303, 303)
                .addComponent(jlbLogo)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnRootLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)
                            .addGap(1, 1, 1))))
                .addGap(14, 14, 14)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtkho, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCustomerRecord)
                    .addComponent(jlbCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtSupplies, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbRequestList, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbSupplies, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jbtOtherSevices, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtBook, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbOtherSevices, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jLabel7.getAccessibleContext().setAccessibleName("jlbHotelmanagemnet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtOtherSevicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOtherSevicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtOtherSevicesActionPerformed

    private void jbtCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCashierActionPerformed

        
    }//GEN-LAST:event_jbtCashierActionPerformed

    private void jbtBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBookActionPerformed
        
    }//GEN-LAST:event_jbtBookActionPerformed

    private void jbtkhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtkhoActionPerformed
        jpnRoot.removeAll();;
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new CustomerJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();
    }//GEN-LAST:event_jbtkhoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbtBook;
    private javax.swing.JButton jbtCashier;
    private javax.swing.JButton jbtMarket;
    private javax.swing.JButton jbtOtherSevices;
    private javax.swing.JButton jbtSupplies;
    private javax.swing.JButton jbtkho;
    private javax.swing.JLabel jlbCashier;
    private javax.swing.JLabel jlbCustomerRecord;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbOtherSevices;
    private javax.swing.JLabel jlbRequestList;
    private javax.swing.JLabel jlbSetting;
    private javax.swing.JLabel jlbSupplies;
    private javax.swing.JPanel jpnRoot;
    // End of variables declaration//GEN-END:variables
}
