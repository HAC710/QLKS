
package View;

import javax.swing.UIManager;
import View.StaffMainJFrame;
import java.awt.event.KeyEvent;
import Bean.DanhMucBean;
import Controller.StaffChuyenManHinhController;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StaffMainJFrame extends javax.swing.JFrame {

    public StaffMainJFrame() {
        initComponents();
        setTitle("Hotel Staff Manager");
        
        StaffChuyenManHinhController controller = new StaffChuyenManHinhController(jpnView);
        controller.setView(jpnHome, jlbHome);
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("StaffHome",jpnHome,jlbHome));
        listItem.add(new DanhMucBean("Room",jpnRoomManager,jlbRoomManager));
        
        controller.setEvent(listItem);
        this.setLocationRelativeTo(null);
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

        jpnMenu = new javax.swing.JPanel();
        jpnQLKS = new javax.swing.JPanel();
        jlbQLKS = new javax.swing.JLabel();
        jpnHome = new javax.swing.JPanel();
        jlbHome = new javax.swing.JLabel();
        jpnRoomManager = new javax.swing.JPanel();
        jlbRoomManager = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();
        jbtClose1 = new javax.swing.JButton();
        jbtHide1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jpnMenu.setBackground(new java.awt.Color(21, 25, 28));
        jpnMenu.setMinimumSize(new java.awt.Dimension(1086, 734));
        jpnMenu.setPreferredSize(new java.awt.Dimension(1086, 734));

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

        jpnView.setBackground(new java.awt.Color(31, 36, 42));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );

        jbtClose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Cancel_32px.png"))); // NOI18N
        jbtClose1.setToolTipText("Close");
        jbtClose1.setBorder(null);
        jbtClose1.setBorderPainted(false);
        jbtClose1.setContentAreaFilled(false);
        jbtClose1.setRequestFocusEnabled(false);
        jbtClose1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Cancel_30px_3.png"))); // NOI18N
        jbtClose1.setVerifyInputWhenFocusTarget(false);
        jbtClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtClose1ActionPerformed(evt);
            }
        });

        jbtHide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_32px_1.png"))); // NOI18N
        jbtHide1.setToolTipText("Minimize");
        jbtHide1.setBorder(null);
        jbtHide1.setBorderPainted(false);
        jbtHide1.setContentAreaFilled(false);
        jbtHide1.setFocusPainted(false);
        jbtHide1.setRequestFocusEnabled(false);
        jbtHide1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Minus_30px_3.png"))); // NOI18N
        jbtHide1.setVerifyInputWhenFocusTarget(false);
        jbtHide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtHide1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtHide1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnQLKS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnRoomManager, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtClose1)
                    .addComponent(jbtHide1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addComponent(jpnQLKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jpnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jpnRoomManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void jbtClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtClose1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtClose1ActionPerformed

    private void jbtHide1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtHide1MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jbtHide1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtClose1;
    private javax.swing.JButton jbtHide1;
    private javax.swing.JLabel jlbHome;
    private javax.swing.JLabel jlbQLKS;
    private javax.swing.JLabel jlbRoomManager;
    private javax.swing.JPanel jpnHome;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnQLKS;
    private javax.swing.JPanel jpnRoomManager;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
