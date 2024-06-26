/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.main;

import com.raven.event.EventMenuSelected;
import com.raven.form.BeverageJP;
import com.raven.form.DashboardEmpoyeeJP;
import com.raven.form.OrderJP;
import com.raven.form.ShiftJP;
import com.raven.form.OrderManageJP;
import com.raven.form.DashboardJP;
import com.raven.form.EditPasswordAdminJP;
import com.raven.form.EditPasswordEmployeeJP;
import com.raven.form.EmployeeJP;
import com.raven.form.LoginJF;
import com.raven.form.SalaryManageJP;
import com.raven.form.ShiftEmployeeJP;
import com.raven.form.VoucherJP;
import com.raven.form.WelcomeJP;
import java.awt.Color;
import javax.swing.JComponent;

/**
 *
 * @author RAVEN
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private WelcomeJP formWelcome;
    private DashboardJP formDashboard;
    private DashboardEmpoyeeJP formDashboardEmployee;

    private OrderJP formOrder;
    private ShiftJP formShift;
    private ShiftEmployeeJP formShiftEmployee;
    private BeverageJP formBeverage;
    private VoucherJP formVoucher;
    private OrderManageJP formOrderManageJP;
    private EditPasswordEmployeeJP formEditPasswordEmployee;
    private EditPasswordAdminJP formEditPasswordAdmin;
    private SalaryManageJP formSalaryManage;
    private EmployeeJP formEmployee;

    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        formWelcome = new WelcomeJP();
        formDashboard = new DashboardJP();
        formDashboardEmployee = new DashboardEmpoyeeJP();
        formOrder = new OrderJP();
        formShift = new ShiftJP();
        formShiftEmployee = new ShiftEmployeeJP();
        formBeverage = new BeverageJP();
        formVoucher = new VoucherJP();
        formOrderManageJP = new OrderManageJP();
        formEditPasswordEmployee = new EditPasswordEmployeeJP();
        formEditPasswordAdmin = new EditPasswordAdminJP();
        formSalaryManage = new SalaryManageJP();
        formEmployee = new EmployeeJP();
        menu.initMoving(Main.this);
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (Session.isLoggedIn()) {
                    switch (Session.getRole()) {
                        case "Employee" -> {
                            switch (index) {
                                case 0 ->
                                    setForm(formOrder);
                                case 1 ->
                                    setForm(formDashboardEmployee);
                                case 5 ->
                                    setForm(formShiftEmployee);
                                case 6 ->
                                    setForm(formEditPasswordEmployee);
                                case 7 -> {
                                    Session.setLoggedIn(false);
                                    Session.setId(0);
                                    Session.setName("");
                                    Session.setRole("");
                                    LoginJF LoginForm = new LoginJF();
                                    LoginForm.setVisible(true);
                                    Main.this.setVisible(false);
                                }
                                default -> {
                                    // Xử lý trường hợp không khớp
                                }
                            }
                        }
                        case "Admin" -> {
                            // Xử lý trường hợp là Admin
                            switch (index) {
                                case 0 ->
                                    setForm(formDashboard);
                                case 1 ->
                                    setForm(formOrderManageJP);
                                case 2 ->
                                    setForm(formBeverage);
                                case 3 ->
                                    setForm(formShift);
                                case 4 ->
                                    setForm(formVoucher);
                                case 8 ->
                                    setForm(formEmployee);
                                case 9 ->
                                    setForm(formSalaryManage);
                                case 10 ->
                                    setForm(formShift);
                                case 11 ->
                                    setForm(formEditPasswordAdmin);
                                case 12 -> {
                                    Session.setLoggedIn(false);
                                    Session.setId(0);
                                    Session.setName("");
                                    Session.setRole("");
                                    LoginJF LoginForm = new LoginJF();
                                    LoginForm.setVisible(true);
                                    Main.this.setVisible(false);
                                }
                                default -> {
                                    // Xử lý trường hợp không khớp
                                }
                            }
                        }
                        default -> {
                            // Xử lý trường hợp không khớp với Employee hoặc Admin
                        }
                    }
                }

            }
        });
        // Kiểm tra trạng thái đăng nhập khi ứng dụng khởi chạy
        if (Session.isLoggedIn()) {
            // Nếu đã đăng nhập, hiển thị Dashboard
            setForm(formWelcome);
        } else {
            // Nếu chưa đăng nhập, hiển thị Form đăng nhập
            dispose(); // Đóng form hiện tại
            new LoginJF().setVisible(true); // Mở form đăng nhập
        }
    }

    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.raven.swing.PanelBorder();
        menu = new com.raven.component.Menu();
        header2 = new com.raven.component.Header();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coffee Store Management");
        setUndecorated(true);

        panelBorder1.setAutoscrolls(true);

        header2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Header header2;
    private javax.swing.JPanel mainPanel;
    private com.raven.component.Menu menu;
    private com.raven.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
