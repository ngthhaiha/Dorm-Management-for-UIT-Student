/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qlktx;
import java.sql.*;
import javax.swing.JOptionPane;
import SinhVien.TrangChuSV;
import NhanVienKeToanMo.TrangChuKT;

/**
 *
 * @author vyvom
 */
public class DangNhap extends javax.swing.JFrame {

    public DangNhap() {
        initComponents();
    }

    public class GlobalVariables {
        // Public static variable to hold the username
        public static String username;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        North = new javax.swing.JPanel();
        East = new javax.swing.JPanel();
        West = new javax.swing.JPanel();
        South = new javax.swing.JPanel();
        Center = new javax.swing.JPanel();
        pnUser = new javax.swing.JPanel();
        iconUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        pnPass = new javax.swing.JPanel();
        iconUser1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btDN = new javax.swing.JButton();
        lbDN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel1)
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        North.setBackground(new java.awt.Color(255, 255, 255));
        North.setPreferredSize(new java.awt.Dimension(800, 60));

        javax.swing.GroupLayout NorthLayout = new javax.swing.GroupLayout(North);
        North.setLayout(NorthLayout);
        NorthLayout.setHorizontalGroup(
            NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        NorthLayout.setVerticalGroup(
            NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(North, java.awt.BorderLayout.PAGE_START);

        East.setBackground(new java.awt.Color(255, 255, 255));
        East.setPreferredSize(new java.awt.Dimension(250, 340));

        javax.swing.GroupLayout EastLayout = new javax.swing.GroupLayout(East);
        East.setLayout(EastLayout);
        EastLayout.setHorizontalGroup(
            EastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        EastLayout.setVerticalGroup(
            EastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(East, java.awt.BorderLayout.LINE_END);

        West.setBackground(new java.awt.Color(255, 255, 255));
        West.setPreferredSize(new java.awt.Dimension(250, 340));

        javax.swing.GroupLayout WestLayout = new javax.swing.GroupLayout(West);
        West.setLayout(WestLayout);
        WestLayout.setHorizontalGroup(
            WestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        WestLayout.setVerticalGroup(
            WestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(West, java.awt.BorderLayout.LINE_START);

        South.setBackground(new java.awt.Color(255, 255, 255));
        South.setPreferredSize(new java.awt.Dimension(800, 60));

        javax.swing.GroupLayout SouthLayout = new javax.swing.GroupLayout(South);
        South.setLayout(SouthLayout);
        SouthLayout.setHorizontalGroup(
            SouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        SouthLayout.setVerticalGroup(
            SouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(South, java.awt.BorderLayout.PAGE_END);

        Center.setBackground(new java.awt.Color(255, 255, 255));
        Center.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        Center.setPreferredSize(new java.awt.Dimension(300, 340));

        pnUser.setBackground(new java.awt.Color(255, 255, 255));
        pnUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnUser.setPreferredSize(new java.awt.Dimension(210, 35));

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/User.png"))); // NOI18N

        txtUser.setForeground(new java.awt.Color(102, 102, 102));
        txtUser.setBorder(null);

        javax.swing.GroupLayout pnUserLayout = new javax.swing.GroupLayout(pnUser);
        pnUser.setLayout(pnUserLayout);
        pnUserLayout.setHorizontalGroup(
            pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
        pnUserLayout.setVerticalGroup(
            pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserLayout.createSequentialGroup()
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(iconUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnPass.setBackground(new java.awt.Color(255, 255, 255));
        pnPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnPass.setPreferredSize(new java.awt.Dimension(210, 35));

        iconUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Lock.png"))); // NOI18N

        txtPassword.setBorder(null);

        javax.swing.GroupLayout pnPassLayout = new javax.swing.GroupLayout(pnPass);
        pnPass.setLayout(pnPassLayout);
        pnPassLayout.setHorizontalGroup(
            pnPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnPassLayout.setVerticalGroup(
            pnPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconUser1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addComponent(txtPassword)
        );

        btDN.setBackground(new java.awt.Color(93, 163, 217));
        btDN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btDN.setForeground(new java.awt.Color(255, 255, 255));
        btDN.setText("Đăng Nhập");
        btDN.setBorder(null);
        btDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDNActionPerformed(evt);
            }
        });

        lbDN.setBackground(new java.awt.Color(255, 255, 255));
        lbDN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbDN.setForeground(new java.awt.Color(83, 160, 219));
        lbDN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDN.setText("Đăng Nhập");
        lbDN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout CenterLayout = new javax.swing.GroupLayout(Center);
        Center.setLayout(CenterLayout);
        CenterLayout.setHorizontalGroup(
            CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenterLayout.createSequentialGroup()
                .addGroup(CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CenterLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CenterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btDN, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDN, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
        );
        CenterLayout.setVerticalGroup(
            CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenterLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbDN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(pnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(pnPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btDN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jPanel1.add(Center, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 

    private int ckSinhVien(String username, String password) {
        Connection con = QLKTX.getConnection();
        if (con == null) {
            return 0;
        }

        try {
            String sql = "SELECT MATKHAU FROM SINHVIEN WHERE MSSV = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String dbPassword = rs.getString("MATKHAU");
                rs.close();
                pstmt.close();
                con.close();
                if (password.equals(dbPassword)) {
                    JOptionPane.showMessageDialog(this, "Đăng nhập sinh viên thành công", "Success", JOptionPane.INFORMATION_MESSAGE);
                    return 1;
                } else {
                    JOptionPane.showMessageDialog(this, "Mật khẩu sinh viên không đúng", "Error", JOptionPane.ERROR_MESSAGE);
                    return 2;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return 3;
    }

    private int ckNhanVien(String username, String password) {
        Connection con = QLKTX.getConnection();
    if (con == null) {
        return 0;
    }

    try {
        String sql = "SELECT MATKHAU, LOAINV FROM NHANVIEN WHERE MANV = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, username);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            String dbPassword = rs.getString("MATKHAU");
            int loaiNV = rs.getInt("LOAINV");
            rs.close();
            pstmt.close();
            con.close();
            if (password.equals(dbPassword)) {
                if (loaiNV == 1) {
                    return 11; // Mã cho trưởng tòa
                } else if (loaiNV == 3) {
                    return 12; // Mã cho nhân viên quản lý
                } else {
                    return 13; // Mã cho kế toán
                }
            } else {
                return 2; // Mật khẩu không đúng
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
    }
    return 3; // Tài khoản không tồn tại
    }

   
    
    private void btDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDNActionPerformed
        String username = txtUser.getText().trim();
    String password = new String(txtPassword.getPassword()).trim();

    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Không được để trống", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    boolean success = false;
    int ckSV = ckSinhVien(username, password);
    int ckNV = ckNhanVien(username, password);
    
    switch (ckSV) {
        case 3:
            switch (ckNV) {
                case 3:
                    JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(this, "Mật khẩu nhân viên không đúng", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                case 11:
                    GlobalVariables.username = username;
                    this.setVisible(false);
                    // Hiển thị giao diện của trưởng tòa
                    TrangChuNV trangChuTruongToa = new TrangChuNV();
                    trangChuTruongToa.setVisible(true);
                    break;
                case 12:
                    GlobalVariables.username = username;
                    this.setVisible(false);
                    // Hiển thị giao diện của nhân viên quản lý
                    TrangChuQL trangChuNVQuanLy = new TrangChuQL();
                    trangChuNVQuanLy.setVisible(true);
                    break;
                case 13:
                    GlobalVariables.username = username;
                    this.setVisible(false);
                    // Hiển thị giao diện của các loại nhân viên khác (nếu cần)
                    TrangChuKT trangchukt = new TrangChuKT();
                    trangchukt.setVisible(true);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu nv", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
            break;
            case 2: 
                JOptionPane.showMessageDialog(this, "Mật khẩu sinh viên không đúng", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            case 1: 
                GlobalVariables.username = username;
                this.setVisible(false);
                TrangChuSV trangchuSV = new TrangChuSV();
                trangchuSV.setVisible(true);
                break;
            case 0:
                JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu sv", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }//GEN-LAST:event_btDNActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Center;
    private javax.swing.JPanel East;
    private javax.swing.JPanel North;
    private javax.swing.JPanel South;
    private javax.swing.JPanel West;
    private javax.swing.JButton btDN;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel iconUser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbDN;
    private javax.swing.JPanel pnPass;
    private javax.swing.JPanel pnUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
