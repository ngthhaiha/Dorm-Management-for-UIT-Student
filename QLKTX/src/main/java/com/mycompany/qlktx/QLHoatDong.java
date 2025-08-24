/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qlktx;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class QLHoatDong extends javax.swing.JFrame {

    private DefaultTableModel table;
    private String manv = DangNhap.GlobalVariables.username;
    public QLHoatDong() {
        initComponents();
        loadData();
    }
    private void loadData(){
        Connection con = QLKTX.getConnection();
    if(con == null) {
        JOptionPane.showMessageDialog(this,"Lỗi kết nối csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
        return;
    }
        //tạo 1 table mới
        table = new DefaultTableModel();
        //gán cho table cột
        String title[] = {"Mã hoạt động","Tên hoạt động","Số lượng yêu cầu","Số lượng đăng ký"};
        table.setColumnIdentifiers(title);
        try{                        
                String sql = "SELECT MAHOATDONG,TENHOATDONG,SOLUONGTOIDA,SOLUONGDK FROM HOATDONG ORDER BY MAHOATDONG";
                PreparedStatement pst = con.prepareStatement(sql);   
                ResultSet rs = pst.executeQuery();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                while(rs.next()){
                    String mahd = rs.getString("MAHOATDONG");
                    String tenhd = rs.getString("TENHOATDONG");                     
                    String soluongmax = rs.getString("SOLUONGTOIDA");
                    String soluongdk = rs.getString("SOLUONGDK");
                    table.addRow(new Object[]{mahd,tenhd,soluongmax,soluongdk});
                }
                
                //gán cho table chính
                tbDSHoatDong.setModel(table);
                //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSHoatDong.getColumnCount(); i++) {
                    tbDSHoatDong.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
                pst.close();
                rs.close();
                con.close();                     
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JButton btBack = new javax.swing.JButton();
        lbWebDev = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSHoatDong = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCTHoatDong = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenHD = new javax.swing.JTextField();
        txtTTCT = new javax.swing.JTextField();
        txtNgayDienRa = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        javax.swing.JButton btTao = new javax.swing.JButton();
        ckbTinhTrang = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtTimHD = new javax.swing.JTextField();
        javax.swing.JButton btXoa = new javax.swing.JButton();
        javax.swing.JButton btTim = new javax.swing.JButton();
        javax.swing.JButton btDSDK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btBack.setBackground(new java.awt.Color(254, 254, 254));
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        btBack.setBorder(null);
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        lbWebDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btBack)
                .addGap(244, 244, 244)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 160, 219));
        jLabel1.setText("Danh sách hoạt động");

        tbDSHoatDong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hoạt động", "Tên hoạt động", "Số lượng tối đa", "Số lượng đăng ký"
            }
        ));
        tbDSHoatDong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbDSHoatDongMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbDSHoatDong);

        tbCTHoatDong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mục", "Thông tin"
            }
        ));
        jScrollPane2.setViewportView(tbCTHoatDong);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Tạo hoạt động: ");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Tên hoạt động");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Ngày diễn ra");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Thông tin chi tiết");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Số lượng");

        btTao.setBackground(new java.awt.Color(93, 163, 217));
        btTao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btTao.setForeground(new java.awt.Color(255, 255, 255));
        btTao.setText("Tạo");
        btTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTaoActionPerformed(evt);
            }
        });

        ckbTinhTrang.setBackground(new java.awt.Color(255, 255, 255));
        ckbTinhTrang.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ckbTinhTrang.setText("Còn trống");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Tìm hoạt động");

        btXoa.setBackground(new java.awt.Color(93, 163, 217));
        btXoa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btXoa.setForeground(new java.awt.Color(255, 255, 255));
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btTim.setBackground(new java.awt.Color(93, 163, 217));
        btTim.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btTim.setForeground(new java.awt.Color(255, 255, 255));
        btTim.setText("Tìm");
        btTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimActionPerformed(evt);
            }
        });

        btDSDK.setBackground(new java.awt.Color(93, 163, 217));
        btDSDK.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btDSDK.setForeground(new java.awt.Color(255, 255, 255));
        btDSDK.setText("Danh sách đăng ký");
        btDSDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDSDKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(btTao)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTimHD, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ckbTinhTrang)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btTim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btXoa))
                                    .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btDSDK)
                                        .addGap(68, 68, 68))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(txtTenHD, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(234, 234, 234)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgayDienRa, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtTTCT, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(184, 184, 184)
                                .addComponent(txtSoLuong)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btTao)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtNgayDienRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTTCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btDSDK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ckbTinhTrang)
                                .addComponent(jLabel7)
                                .addComponent(txtTimHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btXoa)
                                .addComponent(btTim)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTaoActionPerformed
        String tenhd = txtTenHD.getText();
        String nd = txtTTCT.getText();
        String ngaydienra = txtNgayDienRa.getText();
        String soluongmax = txtSoLuong.getText();
        
        if(tenhd.isEmpty() || tenhd.isEmpty() || tenhd.isEmpty() || tenhd.isEmpty()){
            JOptionPane.showMessageDialog(this,"Điền đủ thông tin","Lỗi",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Connection con = QLKTX.getConnection();
        table = (DefaultTableModel)tbDSHoatDong.getModel();
        String sql = "{CALL THEM_HOATDONG(?,?,?,?,?,?)}";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try{
            CallableStatement cst = con.prepareCall(sql);
            cst.registerOutParameter(1,java.sql.Types.VARCHAR);
            cst.setString(2,tenhd);
            cst.setString(3,manv);
            cst.setString(4,ngaydienra);
            cst.setString(5,nd);
            cst.setString(6,soluongmax);
            cst.execute();
            
            String mahd = cst.getString(1);
            table.addRow(new Object[]{mahd,tenhd,soluongmax,0});
            cst.close();
            con.close();                   
        }catch(SQLException e){
            e.printStackTrace();
        }
        txtTenHD.setText("");
        txtTTCT.setText("");
        txtNgayDienRa.setText("");
        txtSoLuong.setText("");
    }//GEN-LAST:event_btTaoActionPerformed

    private void loadCTHoatDong(String mahoatdong){
        Connection con = QLKTX.getConnection();
    if (con == null) {
        JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String sql = "SELECT * FROM HOATDONG WHERE MAHOATDONG = ?";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, mahoatdong);
        ResultSet rs = pst.executeQuery();
        table = new DefaultTableModel();
        table.setColumnIdentifiers(new Object[]{"Mục", "Thông tin"});
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        if (rs.next()) {
            String maHD = rs.getString("MAHOATDONG");
            String maNV = rs.getString("MANV");
            String tenHD = rs.getString("TENHOATDONG");
            Date ngayDienRa = rs.getDate("NGAYDIENRA");
            String thongTinCT = rs.getString("THONGTINCT");
            int soLuongToiDa = rs.getInt("SOLUONGTOIDA");
            int soLuongDK = rs.getInt("SOLUONGDK");
            
            String df1 = sdf.format(ngayDienRa);
            table.addRow(new Object[]{"Mã hoạt động", maHD});
            table.addRow(new Object[]{"Người tạo", manv});
            table.addRow(new Object[]{"Tên hoạt động", tenHD});
            table.addRow(new Object[]{"Ngày diễn ra", df1}); 
            table.addRow(new Object[]{"Thông tin chi tiết", thongTinCT}); 
            table.addRow(new Object[]{"Số lượng tối đa", soLuongToiDa});
            table.addRow(new Object[]{"Số lượng đã đăng ký", soLuongDK});
            
        }
        tbCTHoatDong.setModel(table);

        rs.close();
        pst.close();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    private void tbDSHoatDongMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSHoatDongMouseReleased
    int row = tbDSHoatDong.getSelectedRow();
    String mahoatdong;
    if (row >= 0) {
        mahoatdong = (String) tbDSHoatDong.getValueAt(row, 0);
        loadCTHoatDong(mahoatdong);
    }
    }//GEN-LAST:event_tbDSHoatDongMouseReleased

    private void xoaHoatDong(String mahoatdong,String manv){
        Connection con = QLKTX.getConnection();
    if (con == null) {
        JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String sql = "SELECT MANV FROM HOATDONG WHERE MAHOATDONG = ?";
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, mahoatdong);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            String manvDB = rs.getString("MANV");
            if (!manvDB.equals(manv)) {
                tbDSHoatDong.clearSelection();
                JOptionPane.showMessageDialog(this, "Bạn không có quyền xóa hoạt động này", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                int ret = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa hoạt động này", "Thông báo", JOptionPane.YES_NO_OPTION);
                if (ret == JOptionPane.YES_OPTION) {
                    String sql2 = "DELETE FROM HOATDONG WHERE MAHOATDONG = ?";
                    try {
                        PreparedStatement pst2 = con.prepareStatement(sql2);
                        pst2.setString(1, mahoatdong);
                        pst2.executeUpdate();
                         table = (DefaultTableModel) tbDSHoatDong.getModel();
                        int row = tbDSHoatDong.getSelectedRow();
                        if (row >= 0) {
                            table.removeRow(row);
                            DefaultTableModel detailModel = (DefaultTableModel) tbCTHoatDong.getModel();
                            detailModel.setRowCount(0);
                        }
                        pst2.close();
                        pst.close();
                        rs.close();
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(this, "Lỗi trong quá trình xóa hoạt động", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    tbDSHoatDong.clearSelection();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Hoạt động không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        pst.close();
        rs.close();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int row = tbDSHoatDong.getSelectedRow();
        String manv = (String)DangNhap.GlobalVariables.username;
    String mahoatdong;
    if (row < 0) {
        JOptionPane.showMessageDialog(this,"Chọn 1 hoạt động để xóa","Lỗi",JOptionPane.ERROR_MESSAGE);
        tbDSHoatDong.clearSelection();
        return;
    }
    mahoatdong = (String) tbDSHoatDong.getValueAt(row, 0);
    xoaHoatDong(mahoatdong,manv);
    }//GEN-LAST:event_btXoaActionPerformed

    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimActionPerformed
     String maHoatDong = txtTimHD.getText().trim();
    boolean isTinhTrangChecked = ckbTinhTrang.isSelected();
    if(maHoatDong.isEmpty()){
        loadData();
    }
    Connection con = QLKTX.getConnection();
    if (con == null) {
        JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    StringBuilder sql = new StringBuilder("SELECT * FROM HOATDONG WHERE 1=1");
    if (!maHoatDong.isEmpty()) {
        sql.append(" AND MAHOATDONG = ?");
    }
    if (isTinhTrangChecked) {
        sql.append(" AND SOLUONGDK < SOLUONGTOIDA");
    }

    try {
        PreparedStatement pst = con.prepareStatement(sql.toString());
        int parameterIndex = 1;
        if (!maHoatDong.isEmpty()) {
            pst.setString(parameterIndex++, maHoatDong);
        }
        ResultSet rs = pst.executeQuery();

        table = new DefaultTableModel();
        String[] columnNames = {"Mã hoạt động", "Tên hoạt động", "Số lượng tối đa", "Số lượng đã đăng ký"};
        table.setColumnIdentifiers(columnNames);

        while (rs.next()) {
            table.addRow(new Object[]{
                rs.getString("MAHOATDONG"),                
                rs.getString("TENHOATDONG"),
                rs.getInt("SOLUONGTOIDA"),
                rs.getInt("SOLUONGDK")
            });
        }

        tbDSHoatDong.setModel(table);
        //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSHoatDong.getColumnCount(); i++) {
                    tbDSHoatDong.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
        pst.close();
        rs.close();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
    }
    txtTimHD.setText("");
    }//GEN-LAST:event_btTimActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        TrangChuQL tcql = new TrangChuQL();
        tcql.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btBackActionPerformed

    private void btDSDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDSDKActionPerformed
        int row = tbDSHoatDong.getSelectedRow();
        if (row < 0){
            JOptionPane.showMessageDialog(this,"Chọn 1 hoạt động");
            return;
        }
        String mahd = (String)tbDSHoatDong.getValueAt(row,0);
        DSDangKyTG dk = new DSDangKyTG(mahd);
        dk.setVisible(true);
        tbDSHoatDong.clearSelection();
    }//GEN-LAST:event_btDSDKActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ckbTinhTrang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbWebDev;
    private javax.swing.JTable tbCTHoatDong;
    private javax.swing.JTable tbDSHoatDong;
    private javax.swing.JTextField txtNgayDienRa;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTTCT;
    private javax.swing.JTextField txtTenHD;
    private javax.swing.JTextField txtTimHD;
    // End of variables declaration//GEN-END:variables
}
