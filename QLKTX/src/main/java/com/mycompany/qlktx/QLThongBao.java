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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class QLThongBao extends javax.swing.JFrame {
    private JFrame preFrame;
    public QLThongBao() {
        initComponents();
        cbNgayTB.setEnabled(false);
        txtTimTheoMa.setVisible(false);
        txtTimTheoNgay.setVisible(false);
        loadData();
    }
     public QLThongBao(JFrame preFrame) {
        this.preFrame = preFrame;
        initComponents();
        cbNgayTB.setEnabled(false);
        txtTimTheoMa.setVisible(false);
        txtTimTheoNgay.setVisible(false);
        loadData();
    }
    
    private void loadData(){
    Connection con = QLKTX.getConnection();
    if(con == null) {
        JOptionPane.showMessageDialog(this,"Lỗi kết nối csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
        return;
    }
        //tạo 1 table mới
        DefaultTableModel table = new DefaultTableModel();
        //gán cho table cột
        String title[] = {"Mã thông báo", "Nội dung", "Ngày đăng"};
        table.setColumnIdentifiers(title);
        try{                        
                String sql = "SELECT * FROM THONGBAO ORDER BY MATHONGBAO";
                PreparedStatement pst = con.prepareStatement(sql);   
                ResultSet rs = pst.executeQuery();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                while(rs.next()){
                    String matb = rs.getString("MATHONGBAO");
                    String nd = rs.getString("NOIDUNG");                     
                    Date ngaydang = rs.getDate("NGAYDANG");
                    String dateformat = sdf.format(ngaydang);
                    table.addRow(new Object[]{matb,nd,dateformat});
                }
                
                //gán cho table chính
                tbDSThongBao.setModel(table);
                //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSThongBao.getColumnCount(); i++) {
                    tbDSThongBao.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);
                tbDSThongBao.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JPanel pnHeader = new javax.swing.JPanel();
        javax.swing.JButton btBack = new javax.swing.JButton();
        lbWebDev = new javax.swing.JLabel();
        javax.swing.JPanel pnBody = new javax.swing.JPanel();
        javax.swing.JLabel lbDSThongBao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSThongBao = new javax.swing.JTable();
        cbLoaiTB = new javax.swing.JComboBox<>();
        javax.swing.JLabel lbTimKiem = new javax.swing.JLabel();
        cbNgayTB = new javax.swing.JComboBox<>();
        javax.swing.JLabel lbLocTheo = new javax.swing.JLabel();
        cbTimTB = new javax.swing.JComboBox<>();
        javax.swing.JButton btThemTB = new javax.swing.JButton();
        javax.swing.JButton btXoaTB = new javax.swing.JButton();
        btTimTheoMa = new javax.swing.JRadioButton();
        btTimTheoNgay = new javax.swing.JRadioButton();
        txtTimTheoMa = new javax.swing.JTextField();
        txtTimTheoNgay = new javax.swing.JTextField();
        javax.swing.JLabel lbTaoTB = new javax.swing.JLabel();
        javax.swing.JLabel lbNoiDung = new javax.swing.JLabel();
        javax.swing.JLabel lbNguoiNhan = new javax.swing.JLabel();
        txtNoiDung = new javax.swing.JTextField();
        txtNguoiNhan = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addGap(254, 254, 254)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnHeaderLayout.setVerticalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnBody.setBackground(new java.awt.Color(255, 255, 255));

        lbDSThongBao.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        lbDSThongBao.setForeground(new java.awt.Color(83, 160, 219));
        lbDSThongBao.setText("Danh sách thông báo");

        tbDSThongBao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbDSThongBao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thông báo", "Nội dung", "Ngày đăng"
            }
        ));
        jScrollPane1.setViewportView(tbDSThongBao);

        cbLoaiTB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbLoaiTB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã đăng", "Tất cả" }));
        cbLoaiTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiTBActionPerformed(evt);
            }
        });

        lbTimKiem.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbTimKiem.setText("Tìm kiếm:");

        cbNgayTB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbNgayTB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mới nhất", "Cũ nhất" }));
        cbNgayTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNgayTBActionPerformed(evt);
            }
        });

        lbLocTheo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbLocTheo.setText("Lọc theo");

        cbTimTB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbTimTB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã thông báo", "Ngày đăng" }));
        cbTimTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbTimTBMouseReleased(evt);
            }
        });
        cbTimTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTimTBActionPerformed(evt);
            }
        });

        btThemTB.setBackground(new java.awt.Color(93, 163, 217));
        btThemTB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btThemTB.setForeground(new java.awt.Color(255, 255, 255));
        btThemTB.setText("Tạo thông báo mới");
        btThemTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemTBActionPerformed(evt);
            }
        });

        btXoaTB.setBackground(new java.awt.Color(93, 163, 217));
        btXoaTB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btXoaTB.setForeground(new java.awt.Color(255, 255, 255));
        btXoaTB.setText("Xóa thông báo");
        btXoaTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaTBActionPerformed(evt);
            }
        });

        btTimTheoMa.setBackground(new java.awt.Color(255, 255, 255));
        btTimTheoMa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btTimTheoMa.setText("Mã thông báo");
        btTimTheoMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimTheoMaActionPerformed(evt);
            }
        });

        btTimTheoNgay.setBackground(new java.awt.Color(255, 255, 255));
        btTimTheoNgay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btTimTheoNgay.setText("Ngày đăng");
        btTimTheoNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimTheoNgayActionPerformed(evt);
            }
        });

        txtTimTheoMa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtTimTheoMaMouseReleased(evt);
            }
        });
        txtTimTheoMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimTheoMaActionPerformed(evt);
            }
        });

        txtTimTheoNgay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtTimTheoNgayMouseReleased(evt);
            }
        });
        txtTimTheoNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimTheoNgayActionPerformed(evt);
            }
        });

        lbTaoTB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbTaoTB.setText("Tạo thông báo");

        lbNoiDung.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbNoiDung.setText("Nội dung: ");

        lbNguoiNhan.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbNguoiNhan.setText("Người nhận");

        javax.swing.GroupLayout pnBodyLayout = new javax.swing.GroupLayout(pnBody);
        pnBody.setLayout(pnBodyLayout);
        pnBodyLayout.setHorizontalGroup(
            pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBodyLayout.createSequentialGroup()
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBodyLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnBodyLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtTimTheoMa))
                            .addComponent(btTimTheoMa))
                        .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnBodyLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btTimTheoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(lbLocTheo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbTimTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbNgayTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(cbLoaiTB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnBodyLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(txtTimTheoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnBodyLayout.createSequentialGroup()
                        .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnBodyLayout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(lbDSThongBao))
                            .addGroup(pnBodyLayout.createSequentialGroup()
                                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnBodyLayout.createSequentialGroup()
                                        .addGap(206, 206, 206)
                                        .addComponent(btThemTB))
                                    .addGroup(pnBodyLayout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbNguoiNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                            .addComponent(txtNguoiNhan)))
                                    .addGroup(pnBodyLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lbTaoTB, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)
                                .addComponent(btXoaTB)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnBodyLayout.setVerticalGroup(
            pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBodyLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbDSThongBao)
                .addGap(12, 12, 12)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimTheoMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimTheoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTimKiem)
                    .addComponent(cbLoaiTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNgayTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLocTheo)
                    .addComponent(cbTimTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTimTheoMa)
                    .addComponent(btTimTheoNgay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lbTaoTB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNguoiNhan)
                    .addComponent(txtNguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThemTB)
                    .addComponent(btXoaTB))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        if(preFrame !=null){
            preFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btBackActionPerformed

    private void btThemTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemTBActionPerformed
        String noidung = txtNoiDung.getText();
        String nguoinhan = txtNguoiNhan.getText();
        String manv = DangNhap.GlobalVariables.username;
        
        if(noidung.equals("")){
            JOptionPane.showMessageDialog(this,"Điền nội dung","Lỗi",JOptionPane.ERROR_MESSAGE);    
            return;
        }
        
        Connection con = QLKTX.getConnection();
        if(con == null){
            JOptionPane.showMessageDialog(this,"lỗi kết nối csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String sql = "{CALL THEM_THONGBAO(?,?,?,?,?)}";
        try{
        CallableStatement cst = con.prepareCall(sql);
        cst.registerOutParameter(1,java.sql.Types.VARCHAR);
        cst.setString(2,manv);
        cst.setString(3,nguoinhan);
        cst.registerOutParameter(4,java.sql.Types.VARCHAR);
        cst.setString(5,noidung);
        cst.execute();
        
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
//        String df = sdf.format(cst.getDate(5)); //định dạng lại ngày đăng
        String matb = cst.getString(1);
        String ngaydang = cst.getString(4);
        DefaultTableModel table = (DefaultTableModel)tbDSThongBao.getModel();
        table.addRow(new Object[]{matb,noidung,ngaydang});
        cst.close();
        con.close();   
        }catch(SQLException e){
            e.printStackTrace();
        }
        txtNoiDung.setText("");
        txtNguoiNhan.setText("");
    }//GEN-LAST:event_btThemTBActionPerformed

    private void btXoaTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaTBActionPerformed
        int row = tbDSThongBao.getSelectedRow();
        String nv = DangNhap.GlobalVariables.username;
        if(row < 0){           
            JOptionPane.showMessageDialog(this,"Chọn 1 dòng để xóa","Lỗi",JOptionPane.ERROR_MESSAGE);           
            return;
        }        
        Connection con = QLKTX.getConnection();
        DefaultTableModel model = (DefaultTableModel)tbDSThongBao.getModel();
        String sql = "SELECT MANV FROM THONGBAO WHERE MATHONGBAO = ?";
        String matb = (String)model.getValueAt(row, 0);
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,matb);            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
            String manv = rs.getString("MANV");
            if(!manv.equals(nv)) {
                tbDSThongBao.clearSelection();
                JOptionPane.showMessageDialog(this,"Bạn không có quyền xóa thông báo này","Lỗi",JOptionPane.ERROR_MESSAGE);
            }
            else{
                int ret = JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa thông báo này","Thông báo",JOptionPane.YES_NO_OPTION);
                if(ret==JOptionPane.YES_OPTION){
                    model.removeRow(row);
                 String sql2 = "DELETE FROM THONGBAO WHERE MATHONGBAO = ?";
                 try{
                    PreparedStatement pst2 = con.prepareStatement(sql2);
                    pst2.setString(1,matb);
                    pst2.executeUpdate();            
                    pst2.close();   
                    pst.close();
                    rs.close();
                    con.close();
                 }catch(SQLException e){
                    e.printStackTrace();
                    }
                }else{
                    tbDSThongBao.clearSelection();
                }
            }
           }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btXoaTBActionPerformed

    private void cbTimTBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTimTBMouseReleased
       
    }//GEN-LAST:event_cbTimTBMouseReleased

    private void cbTimTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTimTBActionPerformed
         String timtb = (String)cbTimTB.getSelectedItem();
        if("Ngày đăng".equals(timtb)){
            cbNgayTB.setEnabled(true);
        } else {
            cbNgayTB.setEnabled(false);
            loadData();
        }
        
        
    }//GEN-LAST:event_cbTimTBActionPerformed

    private void cbLoaiTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiTBActionPerformed
        String loaitb = (String)cbLoaiTB.getSelectedItem();
        String manv = DangNhap.GlobalVariables.username;
        if(loaitb.equals("Tất cả")){
            loadData();
        }
        else{
            Connection con = QLKTX.getConnection();
            if(con==null){
                JOptionPane.showMessageDialog(this,"lỗi kết nối csdl","lỗi",JOptionPane.ERROR_MESSAGE);
            }
            // Gán cho table cột
            DefaultTableModel table = new DefaultTableModel();
            String title[] = {"Mã thông báo","Nội dung","Ngày đăng"};
            table.setColumnIdentifiers(title);
            String sql = "SELECT * FROM THONGBAO WHERE MANV = ?";
    try {                        
        PreparedStatement pst = con.prepareStatement(sql);   
        pst.setString(1,manv);
        ResultSet rs = pst.executeQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        while(rs.next()) {
            String matb = rs.getString("MATHONGBAO");
            String noidung = rs.getString("NOIDUNG");           
            Date ngaydang = rs.getDate("NGAYDANG");
            String dateformat = sdf.format(ngaydang);
            table.addRow(new Object[]{matb,noidung,dateformat});
        }           
        // Gán cho table chính
        tbDSThongBao.setModel(table);
                //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSThongBao.getColumnCount(); i++) {
                    tbDSThongBao.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }        
        pst.close();
        rs.close();
        con.close(); 
        }catch(SQLException e){
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_cbLoaiTBActionPerformed

    private void btTimTheoMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimTheoMaActionPerformed
        if (txtTimTheoMa.isVisible()) {
        txtTimTheoMa.setVisible(false);
    } else {
        txtTimTheoMa.setVisible(true);       
    }
        // Cập nhật lại giao diện
    txtTimTheoMa.getParent().revalidate();
    txtTimTheoMa.getParent().repaint();
    }//GEN-LAST:event_btTimTheoMaActionPerformed

    private void btTimTheoNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimTheoNgayActionPerformed
        if (txtTimTheoNgay.isVisible()) {
        txtTimTheoNgay.setVisible(false);
    } else {
        txtTimTheoNgay.setVisible(true);        
    }
       // Cập nhật lại giao diện
    txtTimTheoNgay.getParent().revalidate();
    txtTimTheoNgay.getParent().repaint();
    }//GEN-LAST:event_btTimTheoNgayActionPerformed

    private void cbNgayTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNgayTBActionPerformed
            String ngaytb = (String)cbNgayTB.getSelectedItem();
        if(ngaytb.equals("Mới nhất")){
            Connection con = QLKTX.getConnection();
            DefaultTableModel table = new DefaultTableModel();
            String title[] = {"Mã thông báo","Nội dung","Ngày đăng"};
            table.setColumnIdentifiers(title);
            String sql = "SELECT * FROM THONGBAO ORDER BY NGAYDANG DESC";
    try {                        
        PreparedStatement pst = con.prepareStatement(sql);          
        ResultSet rs = pst.executeQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        while(rs.next()) {
            String matb = rs.getString("MATHONGBAO");
            String noidung = rs.getString("NOIDUNG");           
            Date ngaydang = rs.getDate("NGAYDANG");
            String dateformat = sdf.format(ngaydang);
            table.addRow(new Object[]{matb,noidung,dateformat});
        }                      
            // Gán cho table chính
        tbDSThongBao.setModel(table); 
        //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSThongBao.getColumnCount(); i++) {
                    tbDSThongBao.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
        pst.close();
        rs.close();
        con.close(); 
        }catch(SQLException e){
            e.printStackTrace();
        }
       }
        else {
            loadData();
        }
    }//GEN-LAST:event_cbNgayTBActionPerformed

    private void txtTimTheoMaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimTheoMaMouseReleased
        String matb = (String)txtTimTheoMa.getText();
        if(matb.equals("")) return;
        Connection con = QLKTX.getConnection();
        if(con == null){
            JOptionPane.showMessageDialog(this,"lỗi kết nố csdl","lỗi",JOptionPane.ERROR_MESSAGE);
        }
        String sql = "SELECT * FROM THONGBAO WHERE MATHONGBAO = ?";
        try{
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,matb);
        ResultSet rs = pst.executeQuery();
        DefaultTableModel table = new DefaultTableModel();
        String title[] = {"Mã thông báo", "Nội dung", "Ngày đăng"};
        table.setColumnIdentifiers(title);        
        while(rs.next()){
            String noidung = rs.getString("NOIDUNG");
            Date ngaydang = rs.getDate("NGAYDANG");
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String dateformat = sdf.format(ngaydang);
            table.addRow(new Object[]{matb, noidung, dateformat });
        }
        tbDSThongBao.setModel(table);
                //cho giá trị xuất hiện giữa bảng
             DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
             centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
             for (int i = 0; i < tbDSThongBao.getColumnCount(); i++) {
                 tbDSThongBao.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
             }
             pst.close();
             rs.close();
             con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        txtTimTheoMa.setText("");
    }//GEN-LAST:event_txtTimTheoMaMouseReleased

    private void txtTimTheoNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimTheoNgayActionPerformed
     
    }//GEN-LAST:event_txtTimTheoNgayActionPerformed

    private void txtTimTheoMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimTheoMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimTheoMaActionPerformed

    private void txtTimTheoNgayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimTheoNgayMouseReleased
        String ngaytb = (String)txtTimTheoNgay.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");       
        if(ngaytb.equals("")) return;
        Connection con = QLKTX.getConnection();
        if(con == null){
            JOptionPane.showMessageDialog(this,"lỗi kết nối csdl","lỗi",JOptionPane.ERROR_MESSAGE);
        }
        String sql = "SELECT * FROM THONGBAO WHERE TO_CHAR(NGAYDANG,'DD-MM-YYYY') = ?";
        try{
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,ngaytb);
        ResultSet rs = pst.executeQuery();
        DefaultTableModel table = new DefaultTableModel();
        String title[] = {"Mã thông báo", "Nội dung", "Ngày đăng"};
        table.setColumnIdentifiers(title);        
        while(rs.next()){
            String matb = rs.getString("MATHONGBAO");
            String noidung = rs.getString("NOIDUNG");
            Date ngaydang = rs.getDate("NGAYDANG");
            String dateformat = sdf.format(ngaydang);
            table.addRow(new Object[]{matb, noidung, dateformat});
        }
        tbDSThongBao.setModel(table);
                //cho giá trị xuất hiện giữa bảng
             DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
             centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
             for (int i = 0; i < tbDSThongBao.getColumnCount(); i++) {
                 tbDSThongBao.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
             }
             pst.close();
             rs.close();
             con.close();
        }catch(SQLException e){
            e.printStackTrace();           
        }
        txtTimTheoNgay.setText("");
    }//GEN-LAST:event_txtTimTheoNgayMouseReleased

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btTimTheoMa;
    private javax.swing.JRadioButton btTimTheoNgay;
    private javax.swing.JComboBox<String> cbLoaiTB;
    private javax.swing.JComboBox<String> cbNgayTB;
    private javax.swing.JComboBox<String> cbTimTB;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbWebDev;
    public javax.swing.JTable tbDSThongBao;
    private javax.swing.JTextField txtNguoiNhan;
    private javax.swing.JTextField txtNoiDung;
    private javax.swing.JTextField txtTimTheoMa;
    private javax.swing.JTextField txtTimTheoNgay;
    // End of variables declaration//GEN-END:variables
}
