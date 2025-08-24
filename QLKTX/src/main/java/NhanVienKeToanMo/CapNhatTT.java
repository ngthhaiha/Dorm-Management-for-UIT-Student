/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NhanVienKeToanMo;

import com.mycompany.qlktx.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class CapNhatTT extends javax.swing.JFrame {
   
    private JFrame preFrame;
    public CapNhatTT(JFrame preFrame) {
        this.preFrame=preFrame;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel lbSDTMoi = new javax.swing.JLabel();
        txtMatKhauCu = new javax.swing.JTextField();
        txtXNMatKhau = new javax.swing.JTextField();
        javax.swing.JLabel lbCapNhatTT = new javax.swing.JLabel();
        javax.swing.JLabel lbMatKhauCu = new javax.swing.JLabel();
        javax.swing.JLabel lbMatKhauMoi = new javax.swing.JLabel();
        javax.swing.JLabel lbXNMatKhau = new javax.swing.JLabel();
        txtMatKhauMoi = new javax.swing.JTextField();
        txtSDTMoi = new javax.swing.JTextField();
        javax.swing.JButton btXacNhan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cập nhật thông tin");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbSDTMoi.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbSDTMoi.setText("SĐT mới");

        lbCapNhatTT.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lbCapNhatTT.setForeground(new java.awt.Color(83, 160, 219));
        lbCapNhatTT.setText("Cập nhật thông tin");

        lbMatKhauCu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbMatKhauCu.setText("Mật khẩu cũ");

        lbMatKhauMoi.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbMatKhauMoi.setText("Mật khẩu mới");

        lbXNMatKhau.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbXNMatKhau.setText("Xác nhận mật khẩu mới");

        btXacNhan.setBackground(new java.awt.Color(93, 163, 217));
        btXacNhan.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btXacNhan.setText("Xác nhận");
        btXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXacNhanActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(254, 254, 254));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMatKhauCu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMatKhauMoi)
                            .addComponent(lbSDTMoi))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatKhauCu, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDTMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(123, 123, 123)
                        .addComponent(lbCapNhatTT))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btXacNhan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lbXNMatKhau)
                        .addGap(18, 18, 18)
                        .addComponent(txtXNMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCapNhatTT)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSDTMoi)
                    .addComponent(txtSDTMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatKhauCu)
                    .addComponent(txtMatKhauCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatKhauMoi)
                    .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbXNMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtXNMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btXacNhan)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXacNhanActionPerformed
        String sdtmoi = txtSDTMoi.getText();
        String matkhaucu = txtMatKhauCu.getText();
        String matkhaumoi = txtMatKhauMoi.getText();
        String xnmatkhau = txtXNMatKhau.getText();
        if (sdtmoi.isEmpty() && matkhaucu.isEmpty() && matkhaumoi.isEmpty() && xnmatkhau.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin cập nhật", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
           }
        String manv = (String) DangNhap.GlobalVariables.username;
        Connection con = QLKTX.getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
          }
        try {
        StringBuilder sqlBuilder = new StringBuilder("UPDATE NHANVIEN SET ");
        boolean hasPrevious = false;

        if (!sdtmoi.isEmpty()) {
            sqlBuilder.append("SDT = ?");
            hasPrevious = true;
        }

        if (!matkhaucu.isEmpty() || !matkhaumoi.isEmpty() || !xnmatkhau.isEmpty()) {
            if (matkhaucu.isEmpty() || matkhaumoi.isEmpty() || xnmatkhau.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sqlCheckMK = "SELECT MATKHAU FROM NHANVIEN WHERE MANV = ?";
            PreparedStatement pstCheckMK = con.prepareStatement(sqlCheckMK);
            pstCheckMK.setString(1, manv);
            ResultSet rs = pstCheckMK.executeQuery();

            if (rs.next()) {
                String matkhauHienTai = rs.getString("MATKHAU");

                if (!matkhaucu.equals(matkhauHienTai)) {
                    JOptionPane.showMessageDialog(this, "Mật khẩu hiện tại không đúng", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!matkhaumoi.equals(xnmatkhau)) {
                    JOptionPane.showMessageDialog(this, "Mật khẩu mới không khớp với xác nhận mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (hasPrevious) {
                    sqlBuilder.append(", ");
                }
                sqlBuilder.append("MATKHAU = ?");
                hasPrevious = true;
            }

            rs.close();
            pstCheckMK.close();
        }

        sqlBuilder.append(" WHERE MANV = ?");
        PreparedStatement pstUpdate = con.prepareStatement(sqlBuilder.toString());
        int paramIndex = 1;

        if (!sdtmoi.isEmpty()) {
            pstUpdate.setString(paramIndex++, sdtmoi);
        }

        if (!matkhaucu.isEmpty() && !matkhaumoi.isEmpty() && matkhaumoi.equals(xnmatkhau)) {
            pstUpdate.setString(paramIndex++, matkhaumoi);
        }

        pstUpdate.setString(paramIndex, manv);
        pstUpdate.executeUpdate();
        pstUpdate.close();
        con.close();

        JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//        if (preFrame instanceof TrangChuQL) {
//            ((TrangChuQL) preFrame).loadData();
//        } else if (preFrame instanceof TrangChuNV) {
//            ((TrangChuNV) preFrame).loadData();
//        }
        
        
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi cập nhật thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }       
         
    }//GEN-LAST:event_btXacNhanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMatKhauCu;
    private javax.swing.JTextField txtMatKhauMoi;
    private javax.swing.JTextField txtSDTMoi;
    private javax.swing.JTextField txtXNMatKhau;
    // End of variables declaration//GEN-END:variables
}
