/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author PHONG VU
 */
public class AddOrEditJPanel extends javax.swing.JPanel {

    public AddOrEditJPanel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpnRoot = new javax.swing.JPanel();
        jlbLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jbtCancle = new javax.swing.JButton();
        jbtOK = new javax.swing.JButton();
        jlbUsername = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jlbUsername1 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jtfAge = new javax.swing.JTextField();
        jlbUsername2 = new javax.swing.JLabel();
        jtfAdress = new javax.swing.JTextField();
        jlbUsername3 = new javax.swing.JLabel();
        jtfPhone = new javax.swing.JTextField();
        jlbUsername4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jlbUsername5 = new javax.swing.JLabel();
        jlbUsername6 = new javax.swing.JLabel();
        jrbmale = new javax.swing.JRadioButton();
        jrbFemale = new javax.swing.JRadioButton();

        jpnRoot.setBackground(new java.awt.Color(31, 36, 42));
        jpnRoot.setPreferredSize(new java.awt.Dimension(735, 676));

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

        jbtCancle.setBackground(new java.awt.Color(152, 201, 45));
        jbtCancle.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jbtCancle.setForeground(new java.awt.Color(21, 25, 28));
        jbtCancle.setText("Cancle");
        jbtCancle.setBorder(null);
        jbtCancle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtCancle.setFocusPainted(false);
        jbtCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancleActionPerformed(evt);
            }
        });

        jbtOK.setBackground(new java.awt.Color(152, 201, 45));
        jbtOK.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jbtOK.setForeground(new java.awt.Color(21, 25, 28));
        jbtOK.setText("OK");
        jbtOK.setBorder(null);
        jbtOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtOK.setFocusPainted(false);
        jbtOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtOKActionPerformed(evt);
            }
        });

        jlbUsername.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername.setText("ID:");

        jtfName.setBackground(new java.awt.Color(31, 36, 42));
        jtfName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfName.setForeground(new java.awt.Color(255, 255, 255));
        jtfName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfName.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfName.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jtfNameMouseMoved(evt);
            }
        });
        jtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNameActionPerformed(evt);
            }
        });

        jlbUsername1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername1.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername1.setText("Name:");

        jtfID.setBackground(new java.awt.Color(31, 36, 42));
        jtfID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfID.setForeground(new java.awt.Color(255, 255, 255));
        jtfID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfID.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfID.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jtfIDMouseMoved(evt);
            }
        });

        jtfAge.setBackground(new java.awt.Color(31, 36, 42));
        jtfAge.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfAge.setForeground(new java.awt.Color(255, 255, 255));
        jtfAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfAge.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfAge.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jtfAgeMouseMoved(evt);
            }
        });
        jtfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAgeActionPerformed(evt);
            }
        });

        jlbUsername2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername2.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername2.setText("Age:");

        jtfAdress.setBackground(new java.awt.Color(31, 36, 42));
        jtfAdress.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfAdress.setForeground(new java.awt.Color(255, 255, 255));
        jtfAdress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfAdress.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfAdress.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jtfAdressMouseMoved(evt);
            }
        });
        jtfAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAdressActionPerformed(evt);
            }
        });

        jlbUsername3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername3.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername3.setText("Adress:");

        jtfPhone.setBackground(new java.awt.Color(31, 36, 42));
        jtfPhone.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jtfPhone.setForeground(new java.awt.Color(255, 255, 255));
        jtfPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        jtfPhone.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfPhone.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jtfPhoneMouseMoved(evt);
            }
        });
        jtfPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPhoneActionPerformed(evt);
            }
        });

        jlbUsername4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername4.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername4.setText("Phone:");

        jComboBox1.setBackground(new java.awt.Color(31, 36, 42));
        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(169, 224, 49));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jlbUsername5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername5.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername5.setText("Type:");

        jlbUsername6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbUsername6.setForeground(new java.awt.Color(169, 224, 49));
        jlbUsername6.setText("Gender:");

        jrbmale.setBackground(new java.awt.Color(31, 36, 42));
        buttonGroup1.add(jrbmale);
        jrbmale.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jrbmale.setForeground(new java.awt.Color(169, 224, 49));
        jrbmale.setText("Male");

        jrbFemale.setBackground(new java.awt.Color(31, 36, 42));
        buttonGroup1.add(jrbFemale);
        jrbFemale.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jrbFemale.setForeground(new java.awt.Color(169, 224, 49));
        jrbFemale.setText("Female");

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(305, 305, 305)
                .addComponent(jlbLogo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbUsername6)
                    .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jpnRootLayout.createSequentialGroup()
                            .addComponent(jlbUsername3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnRootLayout.createSequentialGroup()
                            .addComponent(jlbUsername2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnRootLayout.createSequentialGroup()
                            .addComponent(jlbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnRootLayout.createSequentialGroup()
                            .addComponent(jlbUsername1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnRootLayout.createSequentialGroup()
                            .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlbUsername4)
                                .addComponent(jlbUsername5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnRootLayout.createSequentialGroup()
                                        .addComponent(jrbmale)
                                        .addGap(16, 16, 16)
                                        .addComponent(jrbFemale)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtOK, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jbtCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbUsername))
                        .addGap(18, 18, 18)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbUsername1))
                        .addGap(18, 18, 18)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbUsername2)))
                    .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsername3))
                .addGap(18, 18, 18)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsername4))
                .addGap(18, 18, 18)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsername5))
                .addGap(28, 28, 28)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbUsername6)
                    .addComponent(jrbmale)
                    .addComponent(jrbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtOK, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void jbtCancleActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jpnRoot.removeAll();;
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new CustomerJPanel());
        jpnRoot.validate();
        jpnRoot.repaint();      
    }                                         

    private void jbtOKActionPerformed(java.awt.event.ActionEvent evt) {                                      
        try {
            
            jpnRoot.removeAll();;
            jpnRoot.setLayout(new BorderLayout());
            jpnRoot.add(new CustomerJPanel());
            jpnRoot.validate();
            jpnRoot.repaint();   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }                                     

    private void jtfNameMouseMoved(java.awt.event.MouseEvent evt) {                                   

    }                                  

    private void jtfIDMouseMoved(java.awt.event.MouseEvent evt) {                                 
        // TODO add your handling code here:
    }                                

    private void jtfNameActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jtfAgeMouseMoved(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
    }                                 

    private void jtfAgeActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void jtfAdressMouseMoved(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void jtfAdressActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jtfPhoneMouseMoved(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void jtfPhoneActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          


    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbtCancle;
    private javax.swing.JButton jbtOK;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbUsername;
    private javax.swing.JLabel jlbUsername1;
    private javax.swing.JLabel jlbUsername2;
    private javax.swing.JLabel jlbUsername3;
    private javax.swing.JLabel jlbUsername4;
    private javax.swing.JLabel jlbUsername5;
    private javax.swing.JLabel jlbUsername6;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JRadioButton jrbFemale;
    private javax.swing.JRadioButton jrbmale;
    private javax.swing.JTextField jtfAdress;
    private javax.swing.JTextField jtfAge;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfPhone;
    // End of variables declaration                   
}
