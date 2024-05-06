/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import com.raven.main.ConnectMySQL;
import com.raven.main.Session;
import com.raven.model.StatusType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAVEN
 */
public class ShiftEmployeeJP extends javax.swing.JPanel {

    /**
     * Creates new form Form_1
     */
    public ShiftEmployeeJP() {
        initComponents();
        updateDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextFieldWorkDay = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        panelBorder2 = new com.raven.swing.PanelBorder();
        jLabel7 = new javax.swing.JLabel();
        spTable1 = new javax.swing.JScrollPane();
        tableShift = new com.raven.swing.Table();
        jButtonDelete = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jButtonReset = new javax.swing.JButton();
        jComboBoxShift = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("Thời gian làm việc (YYYY-MM-DD):");

        jTextFieldWorkDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldWorkDayActionPerformed(evt);
            }
        });

        jButtonAdd.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAdd.setText("Thêm ca làm");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(127, 127, 127));
        jLabel7.setText(" Danh sách các ca làm");

        spTable1.setBorder(null);

        tableShift.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ca làm", "Ngày làm việc", "Ca làm việc", "Thời gian bắt đầu", "Thời gian kết thúc", "Lương (VND/giờ)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableShift.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableShiftMouseClicked(evt);
            }
        });
        spTable1.setViewportView(tableShift);
        if (tableShift.getColumnModel().getColumnCount() > 0) {
            tableShift.getColumnModel().getColumn(0).setResizable(false);
            tableShift.getColumnModel().getColumn(1).setResizable(false);
            tableShift.getColumnModel().getColumn(3).setResizable(false);
            tableShift.getColumnModel().getColumn(4).setResizable(false);
            tableShift.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(spTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonDelete.setBackground(new java.awt.Color(255, 102, 102));
        jButtonDelete.setText("Xóa ca làm");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonEdit.setBackground(new java.awt.Color(255, 255, 153));
        jButtonEdit.setText("Chỉnh sửa ca làm");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã ca làm:");

        jLabelId.setBackground(new java.awt.Color(255, 255, 255));
        jLabelId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jButtonReset.setBackground(new java.awt.Color(242, 242, 242));
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jComboBoxShift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Chọn ca làm việc");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldWorkDay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxShift, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelId)
                                .addGap(216, 216, 216))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonDelete))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonAdd)
                                        .addGap(23, 23, 23)))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonReset)
                                .addGap(18, 18, 18)))))
                .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelId)
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldWorkDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(46, 46, 46)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        insertShift();
        updateDB();
    }//GEN-LAST:event_jButtonAddActionPerformed
    public void insertShift() {
        try {
            Connection sqlConn = ConnectMySQL.ConnectMySQL();
            PreparedStatement pst = sqlConn.prepareStatement("insert into shift_employee(workday,employee,shift)value(?,?,?)");
            pst.setString(1, jTextFieldWorkDay.getText());
            pst.setInt(2, Session.getId());
            pst.setString(3, (String) jComboBoxShift.getSelectedItem());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Đã thêm một ca làm mới!");
            ConnectMySQL.closeConnection();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void updateDB() {
        try {
            Connection sqlConn = ConnectMySQL.ConnectMySQL();
            PreparedStatement pst = sqlConn.prepareStatement("select e.id, e.workday, s.shift_name, s.start_at, s.end_at, s.salary from shift_employee e join shift s where e.shift = s.id");

            ResultSet rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            int q = stData.getColumnCount();
            DefaultTableModel recordTable = (DefaultTableModel) tableShift.getModel();
            recordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (int i = 1; i <= q; i++) {
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("workday"));
                    columnData.add(rs.getString("shift_name"));
                    columnData.add(rs.getString("start_at"));
                    columnData.add(rs.getString("end_at"));
                    columnData.add(rs.getString("salary"));
                }
                recordTable.addRow(columnData);
            }
            List<String> shiftList = new ArrayList<>();

            PreparedStatement pst1 = sqlConn.prepareStatement("select * from shift");
            ResultSet rs1 = pst1.executeQuery();
            while (rs1.next()) {
                String shiftName = rs1.getString("shift_name");
                shiftList.add(shiftName);
            }
            // Tạo một ComboBoxModel từ danh sách giá trị
            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(shiftList.toArray(new String[0]));

            // Đặt ComboBoxModel vào JComboBox
            jComboBoxShift.setModel(comboBoxModel);
            ConnectMySQL.closeConnection();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void jTextFieldWorkDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldWorkDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldWorkDayActionPerformed

    private void tableShiftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableShiftMouseClicked
        // TODO add your handling code here:
        DefaultTableModel recordTable = (DefaultTableModel) tableShift.getModel();
        int selectionRow = tableShift.getSelectedRow();
        jLabelId.setText(recordTable.getValueAt(selectionRow, 0).toString());
        jTextFieldWorkDay.setText(recordTable.getValueAt(selectionRow, 1).toString());
    }//GEN-LAST:event_tableShiftMouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        deleteShift();
        updateDB();
    }//GEN-LAST:event_jButtonDeleteActionPerformed
    public void deleteShift() {
        try {
            Connection sqlConn = ConnectMySQL.ConnectMySQL();
            PreparedStatement pst = sqlConn.prepareStatement("delete from shift_employee where id = ?");
            pst.setInt(1, Integer.parseInt(jLabelId.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(this, "Đã xóa một ca làm ");
            ConnectMySQL.closeConnection();
            jLabelId.setText("");
            jTextFieldWorkDay.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        editShift();
        updateDB();
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        jLabelId.setText("");
        jTextFieldWorkDay.setText("");
        jComboBoxShift.removeAllItems();
    }//GEN-LAST:event_jButtonResetActionPerformed
    public void editShift() {
        try {
            Connection sqlConn = ConnectMySQL.ConnectMySQL();
            PreparedStatement pst = sqlConn.prepareStatement("update shift_employee set shift_name = ? where id = ?");
            pst.setString(1, jTextFieldWorkDay.getText());
            pst.setString(2, (String) jComboBoxShift.getSelectedItem());
            pst.setInt(3, Integer.parseInt(jLabelId.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Đã chỉnh sửa ca làm " + jTextFieldWorkDay.getText());
            ConnectMySQL.closeConnection();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JComboBox<String> jComboBoxShift;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JTextField jTextFieldWorkDay;
    private com.raven.swing.PanelBorder panelBorder2;
    private javax.swing.JScrollPane spTable1;
    private com.raven.swing.Table tableShift;
    // End of variables declaration//GEN-END:variables
}
