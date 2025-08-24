/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qlktx;

import static com.mycompany.qlktx.QLKTX.getConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author ASUS
 */
public class QLThongKe extends javax.swing.JFrame {
    private DefaultTableModel table;
    ArrayList<Integer> dsDK = new ArrayList<>();
    ArrayList<Integer> dsTG = new ArrayList<>();
    ArrayList<String> dsHoatDong = new ArrayList<>();
    public QLThongKe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lbWebDev = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        javax.swing.JButton btXem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbXemHD = new javax.swing.JTable();
        txtNam = new javax.swing.JTextField();
        txtThang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnChart = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(254, 254, 254));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbWebDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(326, 326, 326)
                    .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(326, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btXem.setBackground(new java.awt.Color(93, 163, 217));
        btXem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btXem.setForeground(new java.awt.Color(255, 255, 255));
        btXem.setText("Xem");
        btXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Thống kê theo");

        tbXemHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên hoạt động", "Ngày diễn ra", "Số lượng đăng ký"
            }
        ));
        jScrollPane1.setViewportView(tbXemHD);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Tháng");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Năm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btXem, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btXem)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pnChart.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnChartLayout = new javax.swing.GroupLayout(pnChart);
        pnChart.setLayout(pnChartLayout);
        pnChartLayout.setHorizontalGroup(
            pnChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );
        pnChartLayout.setVerticalGroup(
            pnChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TrangChuQL tcql = new TrangChuQL();
        tcql.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
   public void laydsChart() {
    String nam = txtNam.getText();
    String thang = txtThang.getText();      
    Connection con = getConnection();
    if (con == null) {
        JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
    try {           
        StringBuilder sql = new StringBuilder("SELECT TENHOATDONG, SOLUONGDK, COUNT(MSSV) AS TONGSOTG FROM HOATDONG JOIN DANGKYTG ON HOATDONG.MAHOATDONG = DANGKYTG.MAHOATDONG WHERE HESOTG = 1");
        
        if (!thang.isEmpty()) {
            sql.append(" AND EXTRACT(MONTH FROM NGAYDIENRA) = ? AND EXTRACT(YEAR FROM NGAYDIENRA) = ?");
        } else if (!nam.isEmpty()) {
            sql.append(" AND EXTRACT(YEAR FROM NGAYDIENRA) = ?");
        }
        
        sql.append(" GROUP BY TENHOATDONG, SOLUONGDK");

        PreparedStatement pstmt = con.prepareStatement(sql.toString());
        int parameterIndex = 1;
        if (!thang.isEmpty()) {
            pstmt.setString(parameterIndex++, thang);
            pstmt.setString(parameterIndex++, nam);
        } else if (!nam.isEmpty()) {
            pstmt.setString(parameterIndex++, nam);
        }
        
        ResultSet rs = pstmt.executeQuery();
        
        dsDK.clear();
        dsTG.clear();
        dsHoatDong.clear();
        while (rs.next()) {
            String tenHD = rs.getString("TENHOATDONG");
            int slDK = rs.getInt("SOLUONGDK");
            int slTG = rs.getInt("TONGSOTG");
            dsDK.add(slDK);
            dsTG.add(slTG);
            dsHoatDong.add(tenHD);
        }
        rs.close();
        pstmt.close();
        con.close();
        removeBarChartFromPanel();
        addBarChartToPanel();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    private void addBarChartToPanel() {
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(520, 560));

        pnChart.setLayout(new java.awt.BorderLayout());
        pnChart.add(chartPanel, java.awt.BorderLayout.CENTER);
        pnChart.validate();
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
  
        for(int i = 0; i<dsHoatDong.size(); i++) {
            dataset.addValue(dsTG.get(i), "Số lượng tham gia", dsHoatDong.get(i));
            dataset.addValue(dsDK.get(i), "Số lượng đăng kí", dsHoatDong.get(i));
        }
        
        return dataset;
    }
    
    private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(  
        "Tỉ lệ tham gia các hoạt động", //Chart Title  
        "Hoạt động", // Category axis Oy 
        "Số lượng(người)", // Value axis  Ox
        dataset,  
        PlotOrientation.VERTICAL,  
        true,true,false  
        );
                
                
        // Set the background color for the chart
        chart.setBackgroundPaint(Color.WHITE);
        

        return chart;
    }
    
    private void removeBarChartFromPanel() {
        // Xóa tất cả các thành phần con của pnHDToa
        pnChart.removeAll();
    }
    
    
    
    private void btXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemActionPerformed
    String nam = txtNam.getText();
    String thang = txtThang.getText();
    Connection con = QLKTX.getConnection();
    if(nam.isEmpty()){
        JOptionPane.showMessageDialog(this,"Nhập năm tìm kiếm","Lỗi",JOptionPane.ERROR_MESSAGE);
        return;
    }
    if(con==null){
        JOptionPane.showMessageDialog(this,"Lỗi kết nối tới csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Tạo 1 table mới
    table = new DefaultTableModel();
    String title[] = {"Tên hoạt động","Ngày diễn ra","Số lượng đăng ký"};
    table.setColumnIdentifiers(title);
    StringBuilder sql = new StringBuilder("SELECT * FROM HOATDONG WHERE ");
    
    if(thang.isEmpty()){
        sql.append("EXTRACT(YEAR FROM NGAYDIENRA) = ?");
    } else {
        sql.append("EXTRACT(MONTH FROM NGAYDIENRA) = ? AND EXTRACT(YEAR FROM NGAYDIENRA) = ?");
    }

    try{
        PreparedStatement pst = con.prepareStatement(sql.toString());
        if(thang.isEmpty()){
            pst.setString(1, nam);
        } else {
            pst.setString(1, thang);
            pst.setString(2, nam);
        }
        
        ResultSet rs = pst.executeQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        while(rs.next()){
            String tenhd = rs.getString("TENHOATDONG");
            Date ngaydienra = rs.getDate("NGAYDIENRA");
            int soluongdk = rs.getInt("SOLUONGDK");
            
            String df = sdf.format(ngaydienra);
            table.addRow(new Object[]{tenhd, df, soluongdk});
        }
        tbXemHD.setModel(table);
        pst.close();
        rs.close();
        con.close();
        laydsChart();
    } catch(SQLException e){
        e.printStackTrace();
    }
    txtNam.setText("");
    txtThang.setText("");
    }//GEN-LAST:event_btXemActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbWebDev;
    private javax.swing.JPanel pnChart;
    private javax.swing.JTable tbXemHD;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtThang;
    // End of variables declaration//GEN-END:variables
}
