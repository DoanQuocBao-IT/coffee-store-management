package com.raven.component;

import com.raven.event.EventMenuSelected;
import com.raven.main.Session;
import com.raven.model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

public class Menu extends javax.swing.JPanel {

    private EventMenuSelected event;

    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        listMenu1.addEventMenuSelected(event);
    }

    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }

    private void init() {
        jLabel2.setText(Session.getName() + "!");
        jLabel4.setText(Session.getRole().equals("Admin") ? "Quản Trị Viên" : "Nhân Viên");
        if (Session.isLoggedIn() && Session.getRole().equals("Employee")) {
            listMenu1.addItem(new Model_Menu("1", "Đặt hàng", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("2", "Thống kê", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));

            listMenu1.addItem(new Model_Menu("", "Thông tin của tôi", Model_Menu.MenuType.TITLE));
            listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
            listMenu1.addItem(new Model_Menu("3", "Lịch làm việc", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("4", "Thay đổi mật khẩu", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("5", "Đăng xuất", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));

        } else if (Session.isLoggedIn() && Session.getRole().equals("Admin")) {

            listMenu1.addItem(new Model_Menu("1", "Thống kê", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("2", "Hóa đơn", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("3", "Đồ ăn, thức uống", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("4", "Ca làm việc", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("5", "Mã khuyến mãi", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));

            listMenu1.addItem(new Model_Menu("", "Thông tin cá nhân", Model_Menu.MenuType.TITLE));
            listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
            listMenu1.addItem(new Model_Menu("6", "Quản lý nhân viên", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("7", "Quản lý lương", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("8", "Extra", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("9", "Thay đổi mật khẩu", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("10", "Đăng xuất", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        listMenu1 = new com.raven.swing.ListMenu<>();

        panelMoving.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/logo.png"))); // NOI18N
        jLabel1.setText("Coffee Management");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nguyen Van Anh");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Chào mừng");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addGroup(panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMovingLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMovingLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#1CB5E0"), 0, getHeight(), Color.decode("#000046"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }

    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.raven.swing.ListMenu<String> listMenu1;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
