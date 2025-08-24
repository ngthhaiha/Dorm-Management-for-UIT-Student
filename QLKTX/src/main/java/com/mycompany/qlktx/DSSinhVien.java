package com.mycompany.qlktx;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class DSSinhVien extends javax.swing.JFrame {

    private DefaultTableModel table;
    private JFrame preFrame;
    public DSSinhVien() {
        initComponents();
        loadData();
    }
    public DSSinhVien(JFrame preFrame) {
        this.preFrame=preFrame;
        initComponents();
        loadData();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JButton btBack = new javax.swing.JButton();
        lbWebDev = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtTimSV = new javax.swing.JTextField();
        javax.swing.JButton btLoc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSSinhVien = new javax.swing.JTable();
        javax.swing.JLabel lbDSSV = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        javax.swing.JButton btViPham2 = new javax.swing.JButton();
        javax.swing.JButton btYeuCau = new javax.swing.JButton();
        javax.swing.JButton btDSSinhVien = new javax.swing.JButton();
        javax.swing.JLabel lbChucNang = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbtttcn = new javax.swing.JButton();
        btthongbao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
                .addGap(270, 270, 270)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(951, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btBack, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addComponent(lbWebDev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1512, 1024));

        txtTimSV.setToolTipText("");
        txtTimSV.setPreferredSize(new java.awt.Dimension(64, 25));

        btLoc.setBackground(new java.awt.Color(93, 163, 217));
        btLoc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btLoc.setForeground(new java.awt.Color(255, 255, 255));
        btLoc.setText("Lọc");
        btLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocActionPerformed(evt);
            }
        });

        tbDSSinhVien.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tbDSSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSSV", "Họ tên", "Mã phòng", "Ngày bắt đầu ở", "Ngày kết thúc ở", "Tình trạng ở"
            }
        ));
        tbDSSinhVien.setAutoscrolls(false);
        tbDSSinhVien.setFocusable(false);
        tbDSSinhVien.setRowHeight(40);
        tbDSSinhVien.setSurrendersFocusOnKeystroke(true);
        tbDSSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tbDSSinhVienMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbDSSinhVienMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbDSSinhVien);
        if (tbDSSinhVien.getColumnModel().getColumnCount() > 0) {
            tbDSSinhVien.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        lbDSSV.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbDSSV.setForeground(new java.awt.Color(83, 160, 219));
        lbDSSV.setText("Danh sách sinh viên");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField1.setText("Mã số sinh viên:");
        jTextField1.setBorder(null);
        jTextField1.setPreferredSize(new java.awt.Dimension(131, 25));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbDSSV)
                        .addGap(395, 395, 395))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimSV, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btLoc)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbDSSV)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimSV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(350, 309));

        btViPham2.setBackground(new java.awt.Color(254, 254, 254));
        btViPham2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btViPham2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bx--message-error.png"))); // NOI18N
        btViPham2.setText("  Vi phạm");
        btViPham2.setBorder(null);
        btViPham2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btViPham2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btViPham2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViPham2ActionPerformed(evt);
            }
        });

        btYeuCau.setBackground(new java.awt.Color(254, 254, 254));
        btYeuCau.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btYeuCau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pajamas--issue-type-requirements.png"))); // NOI18N
        btYeuCau.setText("  Yêu cầu sinh viên");
        btYeuCau.setBorder(null);
        btYeuCau.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btYeuCau.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btYeuCau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btYeuCauActionPerformed(evt);
            }
        });

        btDSSinhVien.setBackground(new java.awt.Color(254, 254, 254));
        btDSSinhVien.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btDSSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fluent--people-list-16-filled.png"))); // NOI18N
        btDSSinhVien.setText("  Quản lý sinh viên");
        btDSSinhVien.setBorder(null);
        btDSSinhVien.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btDSSinhVien.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btDSSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDSSinhVienActionPerformed(evt);
            }
        });

        lbChucNang.setBackground(new java.awt.Color(255, 255, 255));
        lbChucNang.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbChucNang.setForeground(new java.awt.Color(83, 160, 219));
        lbChucNang.setText("Menu");

        jButton1.setBackground(new java.awt.Color(254, 254, 254));
        jButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/solar--logout-2-outline (1).png"))); // NOI18N
        jButton1.setText("  Đăng xuất");
        jButton1.setBorder(null);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setMaximumSize(new java.awt.Dimension(167, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(167, 50));
        jButton1.setName("Dangxuat"); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(167, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(254, 254, 254));
        jButton2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/material-symbols--room-preferences-outline (1).png"))); // NOI18N
        jButton2.setText("  Quản lý phòng");
        jButton2.setBorder(null);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbtttcn.setBackground(new java.awt.Color(254, 254, 254));
        jbtttcn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbtttcn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fluent--person-20-filled.png"))); // NOI18N
        jbtttcn.setText("Thông tin cá nhân");
        jbtttcn.setBorder(null);
        jbtttcn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbtttcn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtttcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtttcnActionPerformed(evt);
            }
        });

        btthongbao.setBackground(new java.awt.Color(254, 254, 254));
        btthongbao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btthongbao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/carbon--notification-filled (3).png"))); // NOI18N
        btthongbao.setText("  Thông báo");
        btthongbao.setBorder(null);
        btthongbao.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btthongbao.setMaximumSize(new java.awt.Dimension(255, 50));
        btthongbao.setMinimumSize(new java.awt.Dimension(255, 50));
        btthongbao.setPreferredSize(new java.awt.Dimension(255, 50));
        btthongbao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthongbaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btYeuCau, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(btViPham2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtttcn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btDSSinhVien))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btthongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbChucNang)
                .addGap(149, 149, 149))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbChucNang)
                .addGap(35, 35, 35)
                .addComponent(btthongbao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btDSSinhVien)
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGap(30, 30, 30)
                .addComponent(btYeuCau)
                .addGap(30, 30, 30)
                .addComponent(btViPham2)
                .addGap(30, 30, 30)
                .addComponent(jbtttcn)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void loadData(){
            String manv = DangNhap.GlobalVariables.username;
    Connection con = QLKTX.getConnection();
    if(con == null) {
        JOptionPane.showMessageDialog(this,"Lỗi kết nối csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
        return;
    }
        //tạo 1 table mới
        table = new DefaultTableModel();
        //gán cho table cột
        String title[] = {"MSSV","Họ tên","Mã phòng","Ngày bắt đầu ở", "Ngày kết thúc ở", "Tình trạng ở"};
        table.setColumnIdentifiers(title);
        try{                        
                String sql = "SELECT S.MSSV,S.TENSV,C.MAPHONG, C.TUNGAY, C.DENNGAY, C.TINHTRANGO "
                        + "FROM (((SINHVIEN S JOIN CUTRU C ON S.MSSV=C.MSSV) "
                        + "JOIN PHONG P ON C.MAPHONG = P.MAPHONG) "
                        + "JOIN TOA T ON P.MATOA = T.MATOA)"
                        + "WHERE C.NGAYTRAPHONG IS NULL AND T.MATRUONGTOA = ?"
                        + " ORDER BY S.MSSV";
                PreparedStatement pst = con.prepareStatement(sql); 
                pst.setString(1, manv);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    String mssv = rs.getString("MSSV");
                    String hoten = rs.getString("TENSV");                     
                    String maphong = rs.getString("MAPHONG");
                    Date tungay = rs.getDate("TUNGAY");
                    Date denngay = rs.getDate("DENNGAY");
                    int tinhtrango = rs.getInt("TINHTRANGO");
                    String tinhtrangoS;
                    if(tinhtrango == 0)
                        tinhtrangoS = "Đã đăng ký";
                    else if(tinhtrango == 1)
                        tinhtrangoS = "Đang ở";
                    else if(tinhtrango == 2)
                        tinhtrangoS = "Đã trả phòng";
                    else
                        tinhtrangoS = "Không xác định";
                    table.addRow(new Object[]{mssv,hoten,maphong, tungay, denngay, tinhtrangoS});
                }
                
                //gán cho table chính
                tbDSSinhVien.setModel(table);
                //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSSinhVien.getColumnCount(); i++) {
                    tbDSSinhVien.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
                pst.close();
                rs.close();
                con.close();                     
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        if(preFrame !=null){
            preFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btBackActionPerformed

    private void tbDSSinhVienMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSSinhVienMouseReleased
        int row = tbDSSinhVien.getSelectedRow();
        String mssv;
        if(row >= 0 ){
            mssv = (String)tbDSSinhVien.getValueAt(row,0);
            popup_thongtinsv p = new popup_thongtinsv(mssv, this);
            p.setVisible(true);
            p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Chỉ đóng frame này

        }
    }//GEN-LAST:event_tbDSSinhVienMouseReleased

    private void btLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocActionPerformed
    String mssv = txtTimSV.getText();
    String manv = DangNhap.GlobalVariables.username;
    Connection con = QLKTX.getConnection();
    if(mssv.isEmpty()){
        loadData();
        return;
    }
    if(con == null) {
        JOptionPane.showMessageDialog(this,"Lỗi kết nối csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
        return;
    }
        //tạo 1 table mới
        table = new DefaultTableModel();
        //gán cho table cột
        String title[] = {"MSSV","Họ tên","Mã phòng","Ngày bắt đầu ở", "Ngày kết thúc ở", "Tình trạng ở"};
        table.setColumnIdentifiers(title);
        try{                        
                String sql = "SELECT S.MSSV,S.TENSV,C.MAPHONG, C.TUNGAY, C.DENNGAY, C.TINHTRANGO "
                        + "FROM (((SINHVIEN S JOIN CUTRU C ON S.MSSV=C.MSSV) "
                        + "JOIN PHONG P ON C.MAPHONG = P.MAPHONG) "
                        + "JOIN TOA T ON P.MATOA = T.MATOA) "
                        + "WHERE S.MSSV = ? AND C.NGAYTRAPHONG IS NULL AND T.MATRUONGTOA = ?"
                        + " ORDER BY S.MSSV";
                PreparedStatement pst = con.prepareStatement(sql); 
                pst.setString(1, mssv);
                pst.setString(2, manv);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    //String mssv = rs.getString("MSSV");
                    String hoten = rs.getString("TENSV");                     
                    String maphong = rs.getString("MAPHONG");
                    Date tungay = rs.getDate("TUNGAY");
                    Date denngay = rs.getDate("DENNGAY");
                    int tinhtrango = rs.getInt("TINHTRANGO");
                    String tinhtrangoS;
                    if(tinhtrango == 0)
                        tinhtrangoS = "Đã đăng ký";
                    else if(tinhtrango == 1)
                        tinhtrangoS = "Đang ở";
                    else if(tinhtrango == 2)
                        tinhtrangoS = "Đã trả phòng";
                    else
                        tinhtrangoS = "Không xác định";
                    table.addRow(new Object[]{mssv,hoten,maphong, tungay, denngay, tinhtrangoS});
                }
                
                //gán cho table chính
                tbDSSinhVien.setModel(table);
                //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSSinhVien.getColumnCount(); i++) {
                    tbDSSinhVien.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
                pst.close();
                rs.close();
                con.close();                     
        }catch(SQLException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btLocActionPerformed

    private void tbDSSinhVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSSinhVienMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDSSinhVienMouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btViPham2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViPham2ActionPerformed
        QLViPham qlvp = new QLViPham();
        qlvp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btViPham2ActionPerformed

    private void btYeuCauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btYeuCauActionPerformed
        QLYeuCau qlyc = new QLYeuCau();
        qlyc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btYeuCauActionPerformed

    private void btDSSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDSSinhVienActionPerformed
        DSSinhVien dssv = new DSSinhVien(this);
        dssv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btDSSinhVienActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ret = JOptionPane.showConfirmDialog(this,"Bạn có muốn đăng xuất?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION){
            DangNhap dn = new DangNhap();
            dn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        QLPhong qlphong = new QLPhong(this);
        qlphong.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtttcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtttcnActionPerformed
        ThongTinCaNhanNV ttcn = new ThongTinCaNhanNV();
        ttcn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtttcnActionPerformed

    private void btthongbaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthongbaoActionPerformed
        TrangChuNV tcnv = new TrangChuNV(this);
        tcnv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btthongbaoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btthongbao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtttcn;
    private javax.swing.JLabel lbWebDev;
    private javax.swing.JTable tbDSSinhVien;
    private javax.swing.JTextField txtTimSV;
    // End of variables declaration//GEN-END:variables
}
