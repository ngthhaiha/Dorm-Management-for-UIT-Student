/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qlktx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class CapNhatGiaPhong extends javax.swing.JFrame {

    /**
     * Creates new form CapNhatGiaPhong
     */
    public CapNhatGiaPhong() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbLoai = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtGiaCu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGiaMoi = new javax.swing.JTextField();
        btXN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 160, 219));
        jLabel1.setText("Cập nhật giá phòng");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Loại phòng");

        cbLoai.setBackground(new java.awt.Color(254, 254, 254));
        cbLoai.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "6", "8" }));
        cbLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Giá phòng hiện tại");

        txtGiaCu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Giá phòng mới");

        txtGiaMoi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btXN.setBackground(new java.awt.Color(93, 163, 217));
        btXN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btXN.setForeground(new java.awt.Color(255, 255, 255));
        btXN.setText("Xác nhận");
        btXN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGiaCu, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(txtGiaMoi))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btXN)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGiaMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(btXN)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btXNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXNActionPerformed
       String loai = (String)cbLoai.getSelectedItem();
        String giacu = txtGiaCu.getText();
        String giamoi = txtGiaMoi.getText();
        if(giamoi.isEmpty()){
            JOptionPane.showMessageDialog(this,"Nhập giá phòng mới");
            return;
        }
        Connection con = QLKTX.getConnection();       
        try{
            //con.setAutoCommit(false);
            //con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);            
           String sql = "{CALL CAPNHAT_GIAPHONG(?,?)}";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1,loai);
           pst.setString(2,giamoi);
           pst.executeUpdate();
           //con.commit();
           JOptionPane.showMessageDialog(this,"Cập nhật thành công");
       }catch(SQLException e){
           e.printStackTrace();
       }
        
    }//GEN-LAST:event_btXNActionPerformed

    private void cbLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiActionPerformed
       String loai = (String)cbLoai.getSelectedItem();
       Connection con = QLKTX.getConnection();
       String sql = "SELECT DISTINCT GIATIEN FROM PHONG WHERE LOAIPHONG = ?";
       try{
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1,loai);
           ResultSet rs = pst.executeQuery();
           if(rs.next()){
               String giatien = rs.getString("GIATIEN");
               txtGiaCu.setText(giatien);
           }
       }catch(SQLException e){
           e.printStackTrace();
       }

    }//GEN-LAST:event_cbLoaiActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btXN;
    private javax.swing.JComboBox<String> cbLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtGiaCu;
    private javax.swing.JTextField txtGiaMoi;
    // End of variables declaration//GEN-END:variables
}
