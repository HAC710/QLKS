package View;


import Bean.DanhMucBean;
import Controller.ChuyenManHinhController;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author PHONG VU
 */
public class MainJFrame extends javax.swing.JFrame {


    public MainJFrame(String username) {
        initComponents();
        setTitle("Hotel Manager");
  
        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
        controller.setView(jpnHome, jlbHome);
  
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("Home",jpnHome,jlbHome));
        listItem.add(new DanhMucBean("Room",jpnRoomManager,jlbRoomManager));
        listItem.add(new DanhMucBean("Employee",jpnEmployeeManager,jlbEmployeeManager));
        listItem.add(new DanhMucBean("Statistical",jpnStatistical,jlbStatistical));
        listItem.add(new DanhMucBean("Account",jpnAccount,jlbAccount,username));
        
        controller.setEvent(listItem);
        this.setLocationRelativeTo(null);
        jpnMenu.setVisible(true);
    }
     public void setLocationRelativeTo(Component c)
    {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        Dimension windowSize = getSize();
        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;
        setLocation(dx, dy);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jpnQLKS = new javax.swing.JPanel();
        jlbQLKS = new javax.swing.JLabel();
        jpnHome = new javax.swing.JPanel();
        jlbHome = new javax.swing.JLabel();
        jpnRoomManager = new javax.swing.JPanel();
        jlbRoomManager = new javax.swing.JLabel();
        jpnEmployeeManager = new javax.swing.JPanel();
        jlbEmployeeManager = new javax.swing.JLabel();
        jpnStatistical = new javax.swing.JPanel();
        jlbStatistical = new javax.swing.JLabel();
        jpnAccount = new javax.swing.JPanel();
        jlbAccount = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();
        jbtHide = new javax.swing.JButton();
        jbtClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jpnRoot.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpnRoot.setName(""); // NOI18N

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpnMenu.setBackground(new java.awt.Color(21, 25, 28));

        jpnQLKS.setBackground(new java.awt.Color(153, 0, 51));

        jlbQLKS.setFont(new java.awt.Font("Andong", 1, 24)); // NOI18N
        jlbQLKS.setForeground(new java.awt.Color(255, 255, 255));
        jlbQLKS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQLKS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_Hotel.png"))); // NOI18N
        jlbQLKS.setText(" Hotel Manager");

        javax.swing.GroupLayout jpnQLKSLayout = new javax.swing.GroupLayout(jpnQLKS);
        jpnQLKS.setLayout(jpnQLKSLayout);
        jpnQLKSLayout.setHorizontalGroup(
            jpnQLKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLKSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQLKS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnQLKSLayout.setVerticalGroup(
            jpnQLKSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQLKSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQLKS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnHome.setBackground(new java.awt.Color(153, 153, 0));

        jlbHome.setFont(new java.awt.Font("Andong", 1, 24)); // NOI18N
        jlbHome.setForeground(new java.awt.Color(255, 255, 255));
        jlbHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_Home.png"))); // NOI18N
        jlbHome.setText(" Home Page");

        javax.swing.GroupLayout jpnHomeLayout = new javax.swing.GroupLayout(jpnHome);
        jpnHome.setLayout(jpnHomeLayout);
        jpnHomeLayout.setHorizontalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnHomeLayout.setVerticalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHomeLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jlbHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jpnRoomManager.setBackground(new java.awt.Color(153, 153, 0));

        jlbRoomManager.setFont(new java.awt.Font("Andong", 1, 24)); // NOI18N
        jlbRoomManager.setForeground(new java.awt.Color(255, 255, 255));
        jlbRoomManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbRoomManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_Room.png"))); // NOI18N
        jlbRoomManager.setText("Room Manager");

        javax.swing.GroupLayout jpnRoomManagerLayout = new javax.swing.GroupLayout(jpnRoomManager);
        jpnRoomManager.setLayout(jpnRoomManagerLayout);
        jpnRoomManagerLayout.setHorizontalGroup(
            jpnRoomManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRoomManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbRoomManager, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRoomManagerLayout.setVerticalGroup(
            jpnRoomManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRoomManagerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlbRoomManager, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jpnEmployeeManager.setBackground(new java.awt.Color(153, 153, 0));

        jlbEmployeeManager.setBackground(new java.awt.Color(153, 153, 0));
        jlbEmployeeManager.setFont(new java.awt.Font("Andong", 1, 24)); // NOI18N
        jlbEmployeeManager.setForeground(new java.awt.Color(255, 255, 255));
        jlbEmployeeManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbEmployeeManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_Employee.png"))); // NOI18N
        jlbEmployeeManager.setText(" Employee Manager");
        jlbEmployeeManager.setToolTipText("");

        javax.swing.GroupLayout jpnEmployeeManagerLayout = new javax.swing.GroupLayout(jpnEmployeeManager);
        jpnEmployeeManager.setLayout(jpnEmployeeManagerLayout);
        jpnEmployeeManagerLayout.setHorizontalGroup(
            jpnEmployeeManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnEmployeeManagerLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jlbEmployeeManager)
                .addGap(21, 21, 21))
        );
        jpnEmployeeManagerLayout.setVerticalGroup(
            jpnEmployeeManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnEmployeeManagerLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jlbEmployeeManager, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jpnStatistical.setBackground(new java.awt.Color(153, 153, 0));

        jlbStatistical.setFont(new java.awt.Font("Andong", 1, 24)); // NOI18N
        jlbStatistical.setForeground(new java.awt.Color(255, 255, 255));
        jlbStatistical.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbStatistical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_Statistical.png"))); // NOI18N
        jlbStatistical.setText("   Statistical");

        javax.swing.GroupLayout jpnStatisticalLayout = new javax.swing.GroupLayout(jpnStatistical);
        jpnStatistical.setLayout(jpnStatisticalLayout);
        jpnStatisticalLayout.setHorizontalGroup(
            jpnStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStatisticalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbStatistical)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnStatisticalLayout.setVerticalGroup(
            jpnStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStatisticalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbStatistical, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpnAccount.setBackground(new java.awt.Color(153, 153, 0));

        jlbAccount.setFont(new java.awt.Font("Andong", 1, 24)); // NOI18N
        jlbAccount.setForeground(new java.awt.Color(255, 255, 255));
        jlbAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_Account.png"))); // NOI18N
        jlbAccount.setText(" Account Setting");
        jlbAccount.setToolTipText("");

        javax.swing.GroupLayout jpnAccountLayout = new javax.swing.GroupLayout(jpnAccount);
        jpnAccount.setLayout(jpnAccountLayout);
        jpnAccountLayout.setHorizontalGroup(
            jpnAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnAccountLayout.setVerticalGroup(
            jpnAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAccountLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlbAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jpnView.setBackground(new java.awt.Color(31, 36, 42));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jbtHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_32px_1.png"))); // NOI18N
        jbtHide.setToolTipText("Minimize");
        jbtHide.setBorder(null);
        jbtHide.setBorderPainted(false);
        jbtHide.setContentAreaFilled(false);
        jbtHide.setFocusPainted(false);
        jbtHide.setRequestFocusEnabled(false);
        jbtHide.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_30px_3.png"))); // NOI18N
        jbtHide.setVerifyInputWhenFocusTarget(false);
        jbtHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtHideMouseClicked(evt);
            }
        });

        jbtClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Cancel_32px.png"))); // NOI18N
        jbtClose.setToolTipText("Close");
        jbtClose.setBorder(null);
        jbtClose.setBorderPainted(false);
        jbtClose.setContentAreaFilled(false);
        jbtClose.setRequestFocusEnabled(false);
        jbtClose.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Cancel_30px_3.png"))); // NOI18N
        jbtClose.setVerifyInputWhenFocusTarget(false);
        jbtClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jpnStatistical, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnEmployeeManager, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnRoomManager, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnQLKS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtHide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMenuLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtClose)
                    .addComponent(jbtHide))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addComponent(jpnQLKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpnRoomManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpnEmployeeManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpnStatistical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpnRoot.getAccessibleContext().setAccessibleName("");
        jpnRoot.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        int confirmed = JOptionPane.showConfirmDialog(null, "Are you want to exit?","Exit?",JOptionPane.YES_NO_OPTION);
        if(confirmed == JOptionPane.YES_OPTION)
        {
            dispose();
        }else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jbtHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtHideMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jbtHideMouseClicked

    private void jbtCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCloseActionPerformed
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        int confirmed = JOptionPane.showConfirmDialog(null, "Are you want to exit?","Exit?",JOptionPane.YES_NO_OPTION);
        if(confirmed == JOptionPane.YES_OPTION)
        {
            dispose();
        }else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_jbtCloseActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtClose;
    private javax.swing.JButton jbtHide;
    private javax.swing.JLabel jlbAccount;
    private javax.swing.JLabel jlbEmployeeManager;
    private javax.swing.JLabel jlbHome;
    private javax.swing.JLabel jlbQLKS;
    private javax.swing.JLabel jlbRoomManager;
    private javax.swing.JLabel jlbStatistical;
    private javax.swing.JPanel jpnAccount;
    private javax.swing.JPanel jpnEmployeeManager;
    private javax.swing.JPanel jpnHome;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnQLKS;
    private javax.swing.JPanel jpnRoomManager;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnStatistical;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
