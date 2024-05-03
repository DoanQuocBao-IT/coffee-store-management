package com.raven.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Header extends javax.swing.JPanel {

    private JPopupMenu menu;

    public Header() {
        initComponents();
        setOpaque(false);
        createPopupMenu(); // Tạo menu khi khởi tạo Header

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        searchText1 = new com.raven.swing.SearchText();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchText1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(searchText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        menu.show(jLabel2, 0, jLabel2.getHeight());
    }//GEN-LAST:event_jLabel2MouseClicked

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, 0, 25, getHeight());
        g2.fillRect(getWidth() - 25, getHeight() - 25, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    private void createPopupMenu() {
        menu = new JPopupMenu();

        // Thêm các JMenuItem vào menu
        JMenuItem closeItem = new JMenuItem("Close");
        JMenuItem fullScreenItem = new JMenuItem("Full Screen");
        JMenuItem logoutItem = new JMenuItem("Logout");

        // Thiết lập sự kiện cho các JMenuItem
        closeItem.addActionListener(e -> {
            // Xử lý sự kiện khi click vào Close
            // Ví dụ: đóng ứng dụng
            System.exit(0);
        });

        fullScreenItem.addActionListener(e -> {
            // Xử lý sự kiện khi click vào Full Screen
            // Ví dụ: chuyển sang chế độ toàn màn hình
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        });

        logoutItem.addActionListener(e -> {
            // Xử lý sự kiện khi click vào Logout
            // Ví dụ: thực hiện đăng xuất khỏi hệ thống
            // Thực hiện các hành động cần thiết khi đăng xuất
        });

        // Thêm các JMenuItem vào menu
        menu.add(closeItem);
        menu.add(fullScreenItem);
        menu.add(logoutItem);
        // Tùy chỉnh giao diện của JMenuItem
        // Tùy chỉnh giao diện của JMenuItem
        UIManager.put("MenuItem.background", new Color(255, 255, 255));
        UIManager.put("MenuItem.foreground", new Color(51, 51, 51));
        UIManager.put("MenuItem.border", BorderFactory.createEmptyBorder(5, 20, 5, 20));
        UIManager.put("MenuItem.font", new Font("Arial", Font.PLAIN, 14));
        UIManager.put("MenuItem[Enabled].textForeground", new Color(51, 51, 51));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.raven.swing.SearchText searchText1;
    // End of variables declaration//GEN-END:variables
}
