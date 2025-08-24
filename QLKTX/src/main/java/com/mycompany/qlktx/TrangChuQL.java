/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qlktx;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import NhanVienKeToanMo.CapNhatTTKT;

/**
 *
 * @author ASUS
 */
public class TrangChuQL extends javax.swing.JFrame {

    /**
     * Creates new form TrangChuQL
     */
    public TrangChuQL() {
        initComponents();
        loadData();
    }

    public void loadData(){
       Connection con = QLKTX.getConnection();
       String manv = (String)DangNhap.GlobalVariables.username;
       if(con==null){
           JOptionPane.showMessageDialog(this,"Lỗi kết nối csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
       }
       String sql = "SELECT * FROM NHANVIEN WHERE MANV = ?";
       try{
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1,manv);
           ResultSet rs = pst.executeQuery();
           SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
           if(rs.next()){
               String nguoiql = rs.getString("MANGUOIQUANLY");
               String CCCD = rs.getString("CCCD");
               String tennv = rs.getString("TENNV");
               Date dob = rs.getDate("NGSINH");
               String df = sdf.format(dob);
               String gioitinh = rs.getString("GIOITINH");
               String loainv = rs.getString("LOAINV");
               String sdt = rs.getString("SDT");
               String matkhau = rs.getString("MATKHAU");
               
               txtMaNV.setText(manv);
               txtHoTen.setText(tennv);
               txtCCCD.setText(CCCD);
               txtNgaySinh.setText(df);
               txtGioiTinh.setText(gioitinh);
               txtSDT.setText(sdt);
               txtLoaiNV.setText(loainv);
               
               pst.close();
               rs.close();
               con.close();
           }
       }catch(SQLException e){
           e.printStackTrace();
       }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JButton btDangXuat = new javax.swing.JButton();
        lbWebDev = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        javax.swing.JButton btHoatDong = new javax.swing.JButton();
        javax.swing.JButton btTraCuuPhong = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        javax.swing.JButton btThongKe = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        javax.swing.JButton btThongBao = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        javax.swing.JButton btDSSinhVien = new javax.swing.JButton();
        javax.swing.JLabel lbChucNang = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        javax.swing.JButton btCapNhat = new javax.swing.JButton();
        txtMaNV = new javax.swing.JTextField();
        txtCCCD = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtLoaiNV = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btDangXuat.setBackground(new java.awt.Color(93, 163, 217));
        btDangXuat.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btDangXuat.setText("Đăng xuất");
        btDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangXuatActionPerformed(evt);
            }
        });

        lbWebDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btDangXuat)
                .addGap(187, 187, 187)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbWebDev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btHoatDong.setBackground(new java.awt.Color(254, 254, 254));
        btHoatDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tabler--home-edit.png"))); // NOI18N
        btHoatDong.setBorder(null);
        btHoatDong.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btHoatDong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btHoatDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoatDongActionPerformed(evt);
            }
        });

        btTraCuuPhong.setBackground(new java.awt.Color(254, 254, 254));
        btTraCuuPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-park-outline--search.png"))); // NOI18N
        btTraCuuPhong.setBorder(null);
        btTraCuuPhong.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btTraCuuPhong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btTraCuuPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTraCuuPhongActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Tra cứu phòng");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("DS sinh viên");

        btThongKe.setBackground(new java.awt.Color(254, 254, 254));
        btThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pajamas--issue-type-requirements.png"))); // NOI18N
        btThongKe.setBorder(null);
        btThongKe.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btThongKe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongKeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("  Thống kê");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Hoạt động");

        btThongBao.setBackground(new java.awt.Color(254, 254, 254));
        btThongBao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/carbon--notification-filled (3).png"))); // NOI18N
        btThongBao.setBorder(null);
        btThongBao.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btThongBao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btThongBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongBaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Thông báo");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        btDSSinhVien.setBackground(new java.awt.Color(254, 254, 254));
        btDSSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fluent--people-list-16-filled.png"))); // NOI18N
        btDSSinhVien.setBorder(null);
        btDSSinhVien.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btDSSinhVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btDSSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDSSinhVienActionPerformed(evt);
            }
        });

        lbChucNang.setBackground(new java.awt.Color(255, 255, 255));
        lbChucNang.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbChucNang.setForeground(new java.awt.Color(83, 160, 219));
        lbChucNang.setText("Chức năng");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btThongBao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btHoatDong, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(btDSSinhVien)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(btTraCuuPhong)
                                .addGap(109, 109, 109)
                                .addComponent(btThongKe)
                                .addGap(110, 110, 110))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel7)
                                .addGap(159, 159, 159))))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel8)
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbChucNang)
                .addGap(135, 135, 135))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbChucNang)
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btHoatDong)
                    .addComponent(btThongBao)
                    .addComponent(btDSSinhVien))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btThongKe)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btTraCuuPhong)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 160, 219));
        jLabel1.setText("Thông tin cá nhân");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Mã nhân viên");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("CCCD");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Họ tên");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Ngày sinh");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Giới tính");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("SĐT");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Loại nhân viên");

        btCapNhat.setBackground(new java.awt.Color(93, 163, 217));
        btCapNhat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btCapNhat.setText("Cập nhật");
        btCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatActionPerformed(evt);
            }
        });

        txtMaNV.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtMaNV.setBorder(null);

        txtCCCD.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtCCCD.setBorder(null);

        txtHoTen.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtHoTen.setBorder(null);

        txtNgaySinh.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtNgaySinh.setBorder(null);

        txtGioiTinh.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtGioiTinh.setBorder(null);

        txtSDT.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtSDT.setBorder(null);

        txtLoaiNV.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtLoaiNV.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(49, 49, 49)
                                .addComponent(txtMaNV))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSDT)
                                    .addComponent(txtGioiTinh)
                                    .addComponent(txtLoaiNV)
                                    .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoTen)
                                    .addComponent(txtNgaySinh)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtLoaiNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangXuatActionPerformed
        int ret = JOptionPane.showConfirmDialog(this,"Bạn có muốn đăng xuất?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION){
        DangNhap dn = new DangNhap();
        dn.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btDangXuatActionPerformed

    private void btHoatDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoatDongActionPerformed
        QLHoatDong qlhd = new QLHoatDong();
        qlhd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btHoatDongActionPerformed

    private void btTraCuuPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTraCuuPhongActionPerformed
//        TraCuuPhong tcp = new TraCuuPhong(this);
//        tcp.setVisible(true);
//        this.setVisible(false);
        QLPhongQL qlphong = new QLPhongQL(this);
        qlphong.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btTraCuuPhongActionPerformed

    private void btThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongKeActionPerformed
    QLThongKe qltk = new QLThongKe();
    qltk.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btThongKeActionPerformed

    private void btThongBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongBaoActionPerformed
        // TODO add your handling code here:
        QLThongBao qltb = new QLThongBao(this);
        qltb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btThongBaoActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btDSSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDSSinhVienActionPerformed
        DSSinhVien dssv = new DSSinhVien(this);
        dssv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btDSSinhVienActionPerformed

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        CapNhatTTKT cntt = new CapNhatTTKT(this);
        cntt.setVisible(true);
        
    }//GEN-LAST:event_btCapNhatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbWebDev;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLoaiNV;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
