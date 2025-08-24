/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qlktx;

import static com.mycompany.qlktx.QLKTX.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class CTPhong extends javax.swing.JFrame {

    /**
     * Creates new form CTPhong
     */
    private String maphong;
    private String loaiphong;
    private String giatien;
    private String tinhtrang;
    public CTPhong(String maphong, String loaiphong, String giatien, String tinhtrang) {
        initComponents();
        this.maphong=maphong;
        this.loaiphong=loaiphong;
        this.giatien=giatien;
        this.tinhtrang=tinhtrang;
        loadDataPhong();
        loadDataSV();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaPhong = new javax.swing.JTextField();
        txtLoaiPhong = new javax.swing.JTextField();
        txtSiSo = new javax.swing.JTextField();
        txtGiaTien = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSSV = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 160, 219));
        jLabel1.setText("Thông tin phòng");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Mã phòng:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Loại phòng:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Sỉ số:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Giá tiền:");

        txtMaPhong.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtLoaiPhong.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtSiSo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        txtGiaTien.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        tbDSSV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbDSSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MSSV", "Họ tên"
            }
        ));
        jScrollPane1.setViewportView(tbDSSV);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Danh sách sinh viên");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addGap(59, 59, 59)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(txtLoaiPhong)
                                    .addComponent(txtSiSo)
                                    .addComponent(txtGiaTien)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1)))
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtSiSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadDataPhong(){
        txtMaPhong.setText(maphong);
        txtLoaiPhong.setText(loaiphong);
        txtGiaTien.setText(giatien);
        txtSiSo.setText(tinhtrang);
    }
    
    private void loadDataSV(){
        Connection con = QLKTX.getConnection();
        if(con==null){
            JOptionPane.showMessageDialog(this,"Lỗi kết nối CSDL");
            return;
        }
        DefaultTableModel table = new DefaultTableModel();
        String title[] = {"MSSV", "Họ tên"};
        table.setColumnIdentifiers(title);
        try {
            String sql = "SELECT S.MSSV, S.TENSV FROM CUTRU C JOIN SINHVIEN S ON C.MSSV=S.MSSV WHERE MAPHONG = ? AND TINHTRANGO = 1";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, maphong);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
            String mssv = rs.getString("MSSV");
            String ten = rs.getString("TENSV");
            table.addRow(new Object[]{mssv,ten});
            }   
            tbDSSV.setModel(table);
                //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSSV.getColumnCount(); i++) {
                    tbDSSV.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
        }catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tbDSSV;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtLoaiPhong;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtSiSo;
    // End of variables declaration//GEN-END:variables
}
