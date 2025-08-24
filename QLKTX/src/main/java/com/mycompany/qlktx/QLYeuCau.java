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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class QLYeuCau extends javax.swing.JFrame {

    private DefaultTableModel table;
    public QLYeuCau() {
        initComponents();
        loadData();
        btChapNhan.setVisible(false);
        btTuChoi.setVisible(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        javax.swing.JPanel pnHeader = new javax.swing.JPanel();
        javax.swing.JButton btBack = new javax.swing.JButton();
        lbWebDev = new javax.swing.JLabel();
        javax.swing.JPanel pnBody = new javax.swing.JPanel();
        javax.swing.JLabel lbDSYeuCau = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSYeuCau = new javax.swing.JTable();
        cbTimYC = new javax.swing.JComboBox<>();
        txtTimYC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        javax.swing.JButton btTimYC = new javax.swing.JButton();
        btChapNhan = new javax.swing.JButton();
        btTuChoi = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        javax.swing.JButton btViPham3 = new javax.swing.JButton();
        javax.swing.JButton btYeuCau3 = new javax.swing.JButton();
        javax.swing.JButton btDSSinhVien3 = new javax.swing.JButton();
        javax.swing.JLabel lbChucNang3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jbtttcn3 = new javax.swing.JButton();
        btthongbao3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1512, 950));

        pnHeader.setBackground(new java.awt.Color(255, 255, 255));

        btBack.setBackground(new java.awt.Color(254, 254, 254));
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        btBack.setBorder(null);
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        lbWebDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout pnHeaderLayout = new javax.swing.GroupLayout(pnHeader);
        pnHeader.setLayout(pnHeaderLayout);
        pnHeaderLayout.setHorizontalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btBack)
                .addGap(251, 251, 251)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(970, Short.MAX_VALUE))
        );
        pnHeaderLayout.setVerticalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnHeaderLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(btBack)
                .addGap(21, 21, 21))
            .addComponent(lbWebDev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnBody.setBackground(new java.awt.Color(255, 255, 255));
        pnBody.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnBodyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnBodyMouseReleased(evt);
            }
        });

        lbDSYeuCau.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        lbDSYeuCau.setForeground(new java.awt.Color(83, 160, 219));
        lbDSYeuCau.setText("Danh sách yêu cầu");

        tbDSYeuCau.setBackground(new java.awt.Color(254, 254, 254));
        tbDSYeuCau.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbDSYeuCau.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tbDSYeuCau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã yêu cầu", "MSSV", "Loại yêu cầu", "Nội dung", "Ngày yêu cầu", "Ngày hoàn thành", "Trạng thái xử lý"
            }
        ));
        tbDSYeuCau.setRowHeight(40);
        tbDSYeuCau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbDSYeuCauMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbDSYeuCauMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbDSYeuCau);

        cbTimYC.setBackground(new java.awt.Color(254, 254, 254));
        cbTimYC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbTimYC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MSSV", "Loại yêu cầu", "Trạng thái" }));

        txtTimYC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimYCActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Bộ lọc:");

        btTimYC.setBackground(new java.awt.Color(93, 163, 217));
        btTimYC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btTimYC.setForeground(new java.awt.Color(255, 255, 255));
        btTimYC.setText("Lọc");
        btTimYC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimYCActionPerformed(evt);
            }
        });

        btChapNhan.setBackground(new java.awt.Color(93, 163, 217));
        btChapNhan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btChapNhan.setForeground(new java.awt.Color(255, 255, 255));
        btChapNhan.setText("Chấp nhận");
        btChapNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChapNhanActionPerformed(evt);
            }
        });

        btTuChoi.setBackground(new java.awt.Color(93, 163, 217));
        btTuChoi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btTuChoi.setForeground(new java.awt.Color(255, 255, 255));
        btTuChoi.setText("Từ chối");
        btTuChoi.setPreferredSize(new java.awt.Dimension(123, 29));
        btTuChoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTuChoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBodyLayout = new javax.swing.GroupLayout(pnBody);
        pnBody.setLayout(pnBodyLayout);
        pnBodyLayout.setHorizontalGroup(
            pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbDSYeuCau)
                .addGap(398, 398, 398))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBodyLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnBodyLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cbTimYC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtTimYC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btTimYC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                        .addComponent(btChapNhan)
                        .addGap(18, 18, 18)
                        .addComponent(btTuChoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        pnBodyLayout.setVerticalGroup(
            pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBodyLayout.createSequentialGroup()
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnBodyLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimYC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTimYC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(pnBodyLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbDSYeuCau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btTimYC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btChapNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btTuChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(350, 309));

        btViPham3.setBackground(new java.awt.Color(254, 254, 254));
        btViPham3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btViPham3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bx--message-error.png"))); // NOI18N
        btViPham3.setText("  Vi phạm");
        btViPham3.setBorder(null);
        btViPham3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btViPham3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btViPham3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViPham3ActionPerformed(evt);
            }
        });

        btYeuCau3.setBackground(new java.awt.Color(254, 254, 254));
        btYeuCau3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btYeuCau3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pajamas--issue-type-requirements.png"))); // NOI18N
        btYeuCau3.setText("  Yêu cầu sinh viên");
        btYeuCau3.setBorder(null);
        btYeuCau3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btYeuCau3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btYeuCau3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btYeuCau3ActionPerformed(evt);
            }
        });

        btDSSinhVien3.setBackground(new java.awt.Color(254, 254, 254));
        btDSSinhVien3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btDSSinhVien3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fluent--people-list-16-filled.png"))); // NOI18N
        btDSSinhVien3.setText("  Quản lý sinh viên");
        btDSSinhVien3.setBorder(null);
        btDSSinhVien3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btDSSinhVien3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btDSSinhVien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDSSinhVien3ActionPerformed(evt);
            }
        });

        lbChucNang3.setBackground(new java.awt.Color(255, 255, 255));
        lbChucNang3.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbChucNang3.setForeground(new java.awt.Color(83, 160, 219));
        lbChucNang3.setText("Menu");

        jButton7.setBackground(new java.awt.Color(254, 254, 254));
        jButton7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/solar--logout-2-outline (1).png"))); // NOI18N
        jButton7.setText("  Đăng xuất");
        jButton7.setBorder(null);
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton7.setMaximumSize(new java.awt.Dimension(167, 50));
        jButton7.setMinimumSize(new java.awt.Dimension(167, 50));
        jButton7.setName("Dangxuat"); // NOI18N
        jButton7.setPreferredSize(new java.awt.Dimension(167, 50));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(254, 254, 254));
        jButton8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/material-symbols--room-preferences-outline (1).png"))); // NOI18N
        jButton8.setText("  Quản lý phòng");
        jButton8.setBorder(null);
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jbtttcn3.setBackground(new java.awt.Color(254, 254, 254));
        jbtttcn3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbtttcn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fluent--person-20-filled.png"))); // NOI18N
        jbtttcn3.setText("Thông tin cá nhân");
        jbtttcn3.setBorder(null);
        jbtttcn3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbtttcn3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtttcn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtttcn3ActionPerformed(evt);
            }
        });

        btthongbao3.setBackground(new java.awt.Color(254, 254, 254));
        btthongbao3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btthongbao3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/carbon--notification-filled (3).png"))); // NOI18N
        btthongbao3.setText("  Thông báo");
        btthongbao3.setBorder(null);
        btthongbao3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btthongbao3.setMaximumSize(new java.awt.Dimension(255, 50));
        btthongbao3.setMinimumSize(new java.awt.Dimension(255, 50));
        btthongbao3.setPreferredSize(new java.awt.Dimension(255, 50));
        btthongbao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthongbao3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btYeuCau3, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(btViPham3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtttcn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btDSSinhVien3))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btthongbao3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbChucNang3)
                .addGap(149, 149, 149))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbChucNang3)
                .addGap(35, 35, 35)
                .addComponent(btthongbao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btDSSinhVien3)
                .addGap(30, 30, 30)
                .addComponent(jButton8)
                .addGap(30, 30, 30)
                .addComponent(btYeuCau3)
                .addGap(30, 30, 30)
                .addComponent(btViPham3)
                .addGap(30, 30, 30)
                .addComponent(jbtttcn3)
                .addGap(30, 30, 30)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                    .addComponent(pnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadData(){
    String manv = DangNhap.GlobalVariables.username;

    Connection con = QLKTX.getConnection();
    if(con == null) {
        JOptionPane.showMessageDialog(this,"Lỗi kết nối csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
        return;
    }
        //tạo 1 table mới
        table = new DefaultTableModel();
        //gán cho table cột
        String title[] = {"Mã yêu cầu","MSSV","Loại yêu cầu","Nội dung","Ngày yêu cầu", "Ngày hoàn thành", "Trạng thái xử lý"};
        table.setColumnIdentifiers(title);
        try{                  
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
//                String sql = "SELECT * FROM PHIEUYEUCAU P WHERE P.MANV = ? AND TRANGTHAIXULY = 0 ORDER BY MAYEUCAU DESC";
                String sql = "SELECT * FROM PHIEUYEUCAU P WHERE P.MANV = ?  ORDER BY MAYEUCAU DESC";
                PreparedStatement pst = con.prepareStatement(sql);   
                pst.setString(1, manv);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    String mayc = rs.getString("MAYEUCAU");
                    String mssv = rs.getString("MSSV");                     
                    int loaiyc = rs.getInt("LOAIYEUCAU");
                    String loaiycS ="";
                    if(loaiyc == 1)
                        loaiycS = "Đổi phòng";
                    else if(loaiyc == 2)
                        loaiycS = "Trả phòng";
                    else if(loaiyc == 3)
                        loaiycS = "Gia hạn phòng";
                    else if(loaiyc == 4)
                        loaiycS = "Sửa chữa";
                    else if(loaiyc == 5)
                        loaiycS = "Khiếu nại vi phạm";
                    String noidung = rs.getString("NOIDUNG");
                    String ngayyeucau = sdf.format(rs.getDate("NGAYYEUCAU"));
                    Date ngayhoanthanh = rs.getDate("NGAYHOANTHANH");
                    String ngayhoanthanhS ="";
                    if(ngayhoanthanh != null)
                        ngayhoanthanhS = sdf.format(ngayhoanthanh);
                    int trangthai = rs.getInt("TRANGTHAIXULY");
                    String trangthaiS = "";
                    if(trangthai == 0)
                        trangthaiS = "Chưa xử lý";
                    else if(trangthai == 1)
                        trangthaiS = "Đã xử lý";
                    table.addRow(new Object[]{mayc,mssv,loaiycS,noidung, ngayyeucau, ngayhoanthanhS, trangthaiS});

                }
                
                //gán cho table chính
                tbDSYeuCau.setModel(table);
                //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSYeuCau.getColumnCount(); i++) {
                    tbDSYeuCau.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
                pst.close();
                rs.close();
                con.close();                     
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
    this.dispose();
    TrangChuNV t = new TrangChuNV();
    t.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    private void tbDSYeuCauMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSYeuCauMouseReleased
         int row = tbDSYeuCau.getSelectedRow();
         if (row < 0) {
        JOptionPane.showMessageDialog(this, "release", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
        String mayc;
        String trangthai;
        String loaiyc;
        if(row >= 0 ){
            mayc = (String)tbDSYeuCau.getValueAt(row,0);
            trangthai = (String)tbDSYeuCau.getValueAt(row,6);
            loaiyc = (String)tbDSYeuCau.getValueAt(row,2);
            if(trangthai.equals("Chưa xử lý")){
                btChapNhan.setVisible(true);
                btTuChoi.setVisible(true);
                
            }
            else{
                btChapNhan.setVisible(false);
                btTuChoi.setVisible(false);
            }
//            loadData();
        btChapNhan.getParent().revalidate();
        btChapNhan.getParent().repaint();
        btTuChoi.getParent().revalidate();
        btTuChoi.getParent().repaint();
        }
    }//GEN-LAST:event_tbDSYeuCauMouseReleased

    private void btTimYCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimYCActionPerformed

//        String timyc = (String)cbTimYC.getSelectedItem();
//    String yc = txtTimYC.getText();
//    if (yc.equals("")) {
//        loadData();
//        table = (DefaultTableModel)tbCTYeuCau.getModel();
//        table.setRowCount(0);
//        return;
//    }
//    Connection con = QLKTX.getConnection();
//    String sql = "";
//    switch (timyc) {
//        case "Mã yêu cầu":
//            sql = "SELECT * FROM PHIEUYEUCAU WHERE MAYEUCAU = ?";
//            break;
//        case "MSSV":
//            sql = "SELECT * FROM PHIEUYEUCAU WHERE MSSV = ?";
//            break;
//        case "Loại yêu cầu":
//            sql = "SELECT * FROM PHIEUYEUCAU WHERE LOAIYEUCAU = ?";
//            break;
//        case "Trạng thái":
//            sql = "SELECT * FROM PHIEUYEUCAU WHERE TRANGTHAIXULY = ?";
//            break;
//        default:
//            return;
//    }
//
//    table = new DefaultTableModel();
//    String title[] = {"Mã yêu cầu", "MSSV", "Loại yêu cầu", "Trạng thái"};
//    table.setColumnIdentifiers(title);
//    
//    try {
//        PreparedStatement pst = con.prepareStatement(sql);
//        pst.setString(1, yc);
//        ResultSet rs = pst.executeQuery();
//        
//        while (rs.next()) {
//            String mayc = rs.getString("MAYEUCAU");
//            String mssv = rs.getString("MSSV");
//            String loaiyc = rs.getString("LOAIYEUCAU");
//            String trangthai = rs.getString("TRANGTHAIXULY");
//            table.addRow(new Object[]{mayc, mssv, loaiyc, trangthai});
//        }
//        
//        tbDSYeuCau.setModel(table);
//        
//        rs.close();
//        pst.close();
//        con.close();
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//    //cho giá trị xuất hiện giữa bảng
//                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
//                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
//                for (int i = 0; i < tbDSYeuCau.getColumnCount(); i++) {
//                    tbDSYeuCau.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
//                }
//    txtTimYC.setText("");
    }//GEN-LAST:event_btTimYCActionPerformed

    private void btChapNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChapNhanActionPerformed
    int selectedRow = tbDSYeuCau.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Chưa chọn yêu cầu nào", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String maYeuCau = (String)tbDSYeuCau.getValueAt(selectedRow,0); // Lấy loại yêu cầu từ bảng chi tiết yêu cầu
    String nguoinhan = (String)tbDSYeuCau.getValueAt(selectedRow,1); //lấy mssv gửi yêu cầu
    String sql;
    
    if (table.getRowCount() > 0) {               
        Connection con = QLKTX.getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        sql = "UPDATE PHIEUYEUCAU SET TRANGTHAIXULY = 1 WHERE MAYEUCAU = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maYeuCau);
            int check = pst.executeUpdate();
            
            if (check > 0) {
                JOptionPane.showMessageDialog(this, "Yêu cầu đã được chấp nhận");
//                table.setValueAt("1",6,1);
                loadData(); // Tải lại dữ liệu để cập nhật bảng
            }            
            pst.close();
            //con.close(); // Không đóng kết nối ở đây, để tiếp tục sử dụng
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        // Thông báo tới sinh viên về kết quả yêu cầu + lưu vào ds thông báo
        sql = "{CALL THEM_THONGBAO(?,?,?,?,?)}";
        try {
            CallableStatement cst = con.prepareCall(sql);
            cst.registerOutParameter(1,java.sql.Types.VARCHAR);
            cst.setString(2,DangNhap.GlobalVariables.username);
            cst.setString(3,nguoinhan);
            cst.registerOutParameter(4,java.sql.Types.VARCHAR);
            cst.setString(5,"Mã yêu cầu " + maYeuCau +" đã được duyệt");
            cst.execute();
            cst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        String loaiyc = (String)tbDSYeuCau.getValueAt(selectedRow,2); // Lấy loại yêu cầu từ bảng chi tiết yêu cầu
        System.out.println(loaiyc);
        if (!loaiyc.equals("Sửa chữa")) { // Nếu không phải yêu cầu sửa chữa thì cập nhật ngày hoàn thành = sysdate
            try {
                if(loaiyc.equals("Gia hạn phòng")){
                    String mssv = (String)tbDSYeuCau.getValueAt(selectedRow,1); // Lấy loại yêu cầu từ bảng chi tiết yêu cầu
                    String NgayMoi = (String) tbDSYeuCau.getValueAt(selectedRow, 3);
                    String sql1 = "UPDATE CUTRU SET DENNGAY = TO_DATE(?,'DD-MM-YYYY') WHERE MSSV = ? AND TINHTRANGO = 1";
                    PreparedStatement pst1 = con.prepareStatement(sql1);
                    pst1.setString(1, NgayMoi);
                    pst1.setString(2, mssv);
                    pst1.executeUpdate();
                    pst1.close();
                }
                else if(loaiyc.equals("Đổi phòng")){
                    String mssv = (String)tbDSYeuCau.getValueAt(selectedRow,1); // Lấy loại yêu cầu từ bảng chi tiết yêu cầu
                    String PhongMoi = (String) tbDSYeuCau.getValueAt(selectedRow, 3);
                    String sql2 = "{CALL DOI_PHONG(?,?,?,?)}";
                    CallableStatement cst = con.prepareCall(sql2);
                    cst.setString(1,mssv);
                    cst.setString(2, PhongMoi);
                    cst.registerOutParameter(3, java.sql.Types.VARCHAR);
                    cst.registerOutParameter(4, java.sql.Types.VARCHAR);
                    cst.execute();
                }
                else if (loaiyc.equals("Trả phòng")){
                    String mssv = (String)tbDSYeuCau.getValueAt(selectedRow,1); // Lấy loại yêu cầu từ bảng chi tiết yêu cầu
                    String ngayyeucau = (String) tbDSYeuCau.getValueAt(selectedRow, 4);
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
                    String sql3 = "UPDATE CUTRU SET NGAYTRAPHONG = TO_DATE(SYSDATE,'DD-MM-YYYY'), TINHTRANGO = 2 WHERE MSSV = ? AND TINHTRANGO = 1";
                    PreparedStatement pst3 = con.prepareStatement(sql3);
//                    pst3.setString(1, ngayyeucau);
                    pst3.setString(1, mssv);
                    pst3.executeUpdate();
                    pst3.close();
                }
                JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                String sql4 = "UPDATE PHIEUYEUCAU SET NGAYHOANTHANH = TO_DATE(SYSDATE,'DD-MM-YYYY') WHERE MAYEUCAU = ?";
                PreparedStatement pst4 = con.prepareStatement(sql4);
                pst4.setString(1, maYeuCau);
                pst4.executeUpdate();
                
                loadData(); // Tải lại dữ liệu để cập nhật bảng
                pst4.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    con.close(); // Đóng kết nối khi hoàn thành
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } else {
            // Đóng kết nối nếu không cập nhật ngày hoàn thành
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    }//GEN-LAST:event_btChapNhanActionPerformed

    private void btTuChoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTuChoiActionPerformed
//    table = (DefaultTableModel) tbCTYeuCau.getModel();
//        String maYeuCau = (String)table.getValueAt(0, 1); // Giả sử mã yêu cầu ở dòng đầu tiên, cột thứ hai
//        String sql;
//    if (table.getRowCount() > 0) {               
//        Connection con = QLKTX.getConnection();
//        if (con == null) {
//            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        
//        sql = "UPDATE PHIEUYEUCAU SET TRANGTHAIXULY = 0 WHERE MAYEUCAU = ?";
//        try {
//            PreparedStatement pst = con.prepareStatement(sql);
//            pst.setString(1, maYeuCau);
//            int check = pst.executeUpdate();
//            
//            if (check > 0) {
//                JOptionPane.showMessageDialog(this, "Yêu cầu đã được chấp nhận");
//                loadData(); // Tải lại dữ liệu để cập nhật bảng
//            }            
//            pst.close();
//            //con.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        //Thông báo tới sinh viên về kết quả yêu cầu + lưu vào ds thông báo
//        sql = "{CALL THEM_THONGBAO(?,?,?,?,?)}";
//        String nguoinhan = (String)table.getValueAt(1,1);
//        try{
//        CallableStatement cst = con.prepareCall(sql);
//        cst.registerOutParameter(1,java.sql.Types.VARCHAR);
//        cst.setString(2,DangNhap.GlobalVariables.username);
//        cst.setString(3,nguoinhan);
//        cst.registerOutParameter(4,java.sql.Types.VARCHAR);
//        cst.setString(5,"Mã yêu cầu " + maYeuCau +" đã bị từ chối");
//        cst.execute();
//        cst.close();
//        con.close();
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//        String loaiyc = (String)tbCTYeuCau.getValueAt(2,1);
//           Connection conn = QLKTX.getConnection();
//           sql = "UPDATE PHIEUYEUCAU SET NGAYHOANTHANH = TO_DATE(SYSDATE,'DD-MM-YYYY') WHERE MAYEUCAU = ?";
//           try{
//           PreparedStatement pst = conn.prepareStatement(sql);
//           pst.setString(1,maYeuCau);
//           pst.executeUpdate();
//           loadData();
//           conn.close();
//           }catch(SQLException e){
//               e.printStackTrace();
//           }
//      }
    }//GEN-LAST:event_btTuChoiActionPerformed

    private void pnBodyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBodyMouseReleased
        
    }//GEN-LAST:event_pnBodyMouseReleased

    private void tbDSYeuCauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSYeuCauMousePressed
        int row = tbDSYeuCau.rowAtPoint(evt.getPoint());
        int column = tbDSYeuCau.columnAtPoint(evt.getPoint());

        // Assuming the MSSV is in the second column (index 1)
        if (row >= 0 && column == 1) {
            String mssv = (String) tbDSYeuCau.getValueAt(row, column);

            // Assuming popup_thongtinsv is your popup class
            popup_thongtinsv p = new popup_thongtinsv(mssv, this);
            p.setVisible(true);
            p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Chỉ đóng frame này
        }
    }//GEN-LAST:event_tbDSYeuCauMousePressed

    private void pnBodyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBodyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnBodyMousePressed

    private void txtTimYCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimYCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimYCActionPerformed

    private void btViPham3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViPham3ActionPerformed
        QLViPham qlvp = new QLViPham();
        qlvp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btViPham3ActionPerformed

    private void btYeuCau3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btYeuCau3ActionPerformed
        QLYeuCau qlyc = new QLYeuCau();
        qlyc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btYeuCau3ActionPerformed

    private void btDSSinhVien3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDSSinhVien3ActionPerformed
        DSSinhVien dssv = new DSSinhVien(this);
        dssv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btDSSinhVien3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int ret = JOptionPane.showConfirmDialog(this,"Bạn có muốn đăng xuất?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION){
            DangNhap dn = new DangNhap();
            dn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        QLPhong qlphong = new QLPhong(this);
        qlphong.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jbtttcn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtttcn3ActionPerformed
        ThongTinCaNhanNV ttcn = new ThongTinCaNhanNV();
        ttcn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtttcn3ActionPerformed

    private void btthongbao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthongbao3ActionPerformed
        TrangChuNV tcnv = new TrangChuNV(this);
        tcnv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btthongbao3ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChapNhan;
    private javax.swing.JButton btTuChoi;
    private javax.swing.JButton btthongbao3;
    private javax.swing.JComboBox<String> cbTimYC;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtttcn3;
    private javax.swing.JLabel lbWebDev;
    private javax.swing.JTable tbDSYeuCau;
    private javax.swing.JTextField txtTimYC;
    // End of variables declaration//GEN-END:variables
}
