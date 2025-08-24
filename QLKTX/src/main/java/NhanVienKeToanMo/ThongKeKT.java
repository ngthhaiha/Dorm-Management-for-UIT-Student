/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NhanVienKeToanMo;

import static com.mycompany.qlktx.QLKTX.getConnection;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.mycompany.qlktx.DangNhap;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.*;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;  
import org.jfree.data.general.PieDataset;  

public class ThongKeKT extends javax.swing.JFrame {
    String maKT = DangNhap.GlobalVariables.username;
    ArrayList<String> dsLoaiHD = new ArrayList<>();
    ArrayList<Integer> dstongtien = new ArrayList<>();
    ArrayList<String> dsToa = new ArrayList<>();
    ArrayList<Integer> dstongtienToa = new ArrayList<>();
    
    int[] rValue = {135, 0, 30, 100, 65, 0};
    int[] gValue = {206, 191, 144, 149, 105, 0};
    int[] bValue = {250, 255, 255, 237, 225, 205};
        
    private DefaultTableModel tb;
    private DefaultTableModel tb1;
    /**
     * Creates new form PieCh
     */
    public ThongKeKT() {
        initComponents();
        thietlapManHinh();
        layTongSoLoaiHoaDon();
        layHoaDonToa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSumHD = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cbTrangThai = new javax.swing.JComboBox<>();
        txtTuNgay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDenNgay = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btLoc = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSumHD1 = new javax.swing.JTable();
        btPrint = new javax.swing.JButton();
        pnChartTongTienHD = new javax.swing.JPanel();
        pnHeader = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btBack = new javax.swing.JButton();
        pnHDToa = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        javax.swing.JLabel lbChucNang = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbtttcn = new javax.swing.JButton();
        btthongbao = new javax.swing.JButton();
        btHoaDon = new javax.swing.JButton();
        btThongKe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1512, 1020));

        pnInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 160, 219));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THỐNG KÊ:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(83, 160, 219));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Trị giá các loại hóa đơn");

        tbSumHD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbSumHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại hóa đơn", "Tổng số"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSumHD.setRowHeight(30);
        jScrollPane1.setViewportView(tbSumHD);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Từ ngày:");

        cbTrangThai.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTrangThaiActionPerformed(evt);
            }
        });

        txtTuNgay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Đến ngày");

        txtDenNgay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Trạng thái");

        btLoc.setBackground(new java.awt.Color(93, 163, 217));
        btLoc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btLoc.setForeground(new java.awt.Color(255, 255, 255));
        btLoc.setText("Lọc");
        btLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(83, 160, 219));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("THỐNG KÊ:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(83, 160, 219));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Trị giá hóa đơn trên tòa");

        tbSumHD1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbSumHD1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tòa", "Tổng số"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSumHD1.setRowHeight(22);
        jScrollPane2.setViewportView(tbSumHD1);

        btPrint.setBackground(new java.awt.Color(93, 163, 217));
        btPrint.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btPrint.setForeground(new java.awt.Color(255, 255, 255));
        btPrint.setText("In Báo cáo");
        btPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnInfoLayout = new javax.swing.GroupLayout(pnInfo);
        pnInfo.setLayout(pnInfoLayout);
        pnInfoLayout.setHorizontalGroup(
            pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInfoLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(pnInfoLayout.createSequentialGroup()
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInfoLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnInfoLayout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnInfoLayout.createSequentialGroup()
                                    .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTuNgay)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDenNgay)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(26, 26, 26)
                                    .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnInfoLayout.createSequentialGroup()
                                            .addComponent(cbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnInfoLayout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(btPrint)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnInfoLayout.setVerticalGroup(
            pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInfoLayout.createSequentialGroup()
                        .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTuNgay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDenNgay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnInfoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLoc))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pnChartTongTienHD.setBackground(new java.awt.Color(255, 255, 255));
        pnChartTongTienHD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnChartTongTienHDLayout = new javax.swing.GroupLayout(pnChartTongTienHD);
        pnChartTongTienHD.setLayout(pnChartTongTienHDLayout);
        pnChartTongTienHDLayout.setHorizontalGroup(
            pnChartTongTienHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );
        pnChartTongTienHDLayout.setVerticalGroup(
            pnChartTongTienHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnHeader.setBackground(new java.awt.Color(255, 255, 255));
        pnHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        pnHeader.setPreferredSize(new java.awt.Dimension(860, 80));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        btBack.setBackground(new java.awt.Color(254, 254, 254));
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        btBack.setBorder(null);
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnHeaderLayout = new javax.swing.GroupLayout(pnHeader);
        pnHeader.setLayout(pnHeaderLayout);
        pnHeaderLayout.setHorizontalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnHeaderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btBack)
                .addGap(32, 32, 32)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1687, Short.MAX_VALUE))
        );
        pnHeaderLayout.setVerticalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addGroup(pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnHeaderLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnHDToa.setBackground(new java.awt.Color(255, 255, 255));
        pnHDToa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnHDToaLayout = new javax.swing.GroupLayout(pnHDToa);
        pnHDToa.setLayout(pnHDToaLayout);
        pnHDToaLayout.setHorizontalGroup(
            pnHDToaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );
        pnHDToaLayout.setVerticalGroup(
            pnHDToaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(350, 309));

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

        btHoaDon.setBackground(new java.awt.Color(254, 254, 254));
        btHoaDon.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/HoaDon.png"))); // NOI18N
        btHoaDon.setText("  Quản lý hoá đơn");
        btHoaDon.setBorder(null);
        btHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoaDonActionPerformed(evt);
            }
        });

        btThongKe.setBackground(new java.awt.Color(254, 254, 254));
        btThongKe.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CongDong.png"))); // NOI18N
        btThongKe.setText("  Thống kê");
        btThongKe.setBorder(null);
        btThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongKeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btThongKe)
                            .addComponent(btHoaDon)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtttcn, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbChucNang)
                            .addComponent(btthongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbChucNang)
                .addGap(36, 36, 36)
                .addComponent(btthongbao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btHoaDon)
                .addGap(30, 30, 30)
                .addComponent(btThongKe)
                .addGap(30, 30, 30)
                .addComponent(jbtttcn)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1990, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(pnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnHDToa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnChartTongTienHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnChartTongTienHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnHDToa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                    .addComponent(pnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1518, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void thietlapManHinh() {
        tb = new DefaultTableModel();
        String tieuDe[] = {"Loại hóa đơn", "Tổng tiền"};
        tb.setColumnIdentifiers(tieuDe);
        tbSumHD.setModel(tb);
        setVisible(true);
        
        String[] itemsTrangThai = {"Default", "Đã thanh toán", "Chưa thanh toán"};
        
        DefaultComboBoxModel<String> insertTrangThai = new DefaultComboBoxModel<>(itemsTrangThai);
        cbTrangThai.setModel(insertTrangThai);
        
        tb1 = new DefaultTableModel();
        tb1.setColumnIdentifiers(tieuDe);
        tbSumHD1.setModel(tb1);
        setVisible(true);
    }
    
    public void layTongSoLoaiHoaDon() {
        String tungay = txtTuNgay.getText();
        String denngay = txtDenNgay.getText();
        String trangthai = (String) cbTrangThai.getSelectedItem();
                
        Connection con = getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        try {           
            StringBuilder sql = new StringBuilder("SELECT LOAIHOADON, SUM(SOTIEN) AS TONGSOTIEN FROM HOADON");
            int index = 1;
            
            if (!tungay.isEmpty()) {
                if(index++ == 1) 
                    sql.append(" WHERE");
                else 
                    sql.append(" AND");
                sql.append(" NGAYLAPHOADON >= TO_DATE(?, 'DD-MM-YYYY')");
            }
            if (!denngay.isEmpty()) {
                if(index++ == 1) 
                    sql.append(" WHERE");
                else 
                    sql.append(" AND");
                sql.append(" NGAYLAPHOADON <= TO_DATE(?, 'DD-MM-YYYY')");
            }
            if (!"Default".equals(trangthai)) {
                if(index++ == 1) 
                    sql.append(" WHERE");
                else 
                    sql.append(" AND");
                
                if(trangthai.equals("Chưa thanh toán"))
                    sql.append(" NGAYTHANHTOAN IS NULL");
                else sql.append(" NGAYTHANHTOAN IS NOT NULL");
            }
            sql.append(" GROUP BY LOAIHOADON");

            PreparedStatement pstmt = con.prepareStatement(sql.toString());
            int parameterIndex = 1;
            if (!tungay.isEmpty()) {
                pstmt.setString(parameterIndex++, tungay);
            }
            if (!denngay.isEmpty()) {
                pstmt.setString(parameterIndex++, denngay);
            }
            ResultSet rs = pstmt.executeQuery();
            
            tb.setRowCount(0); // Clear table
            dsLoaiHD.clear();
            dstongtien.clear();
            while (rs.next()) {
                int loaiHD = rs.getInt("LOAIHOADON");
                String loaiHDS = "";
                if(loaiHD == 1)
                    loaiHDS = "Tiền điện";
                else if(loaiHD == 2)
                    loaiHDS = "Tiền nước";
                else if(loaiHD == 3)
                    loaiHDS = "Tiền phòng";
                else if(loaiHD == 4)
                    loaiHDS = "Sua chua";
                else if(loaiHD == 5)
                    loaiHDS = "Ve sinh";
                int tongtienHD = rs.getInt("TONGSOTIEN");
                dsLoaiHD.add(loaiHDS);
                dstongtien.add(tongtienHD);
                tb.addRow(new Object[]{loaiHDS, tongtienHD});
            }
            rs.close();
            pstmt.close();
            con.close();
            removePieChartFromPanel();
            addPieChartToPanel();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocActionPerformed
        // TODO add your handling code here:
        layTongSoLoaiHoaDon();
        layHoaDonToa();
    }//GEN-LAST:event_btLocActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        TrangChuKT trangchuKT = new TrangChuKT();
        trangchuKT.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    private void btPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrintActionPerformed
        try {
            // TODO add your handling code here:
            exportPdfThongKeLoaiHoaDon();
        } catch (IOException ex) {
            Logger.getLogger(ThongKeKT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPrintActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ret = JOptionPane.showConfirmDialog(this,"Bạn có muốn đăng xuất?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION){
            DangNhap dn = new DangNhap();
            dn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtttcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtttcnActionPerformed
        ThongTinCaNhanNV ttcn = new ThongTinCaNhanNV();
        ttcn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtttcnActionPerformed

    private void btthongbaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthongbaoActionPerformed
        TrangChuKT tcnv = new TrangChuKT();
        tcnv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btthongbaoActionPerformed

    private void btHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoaDonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoaDonKT hoadonKT = new HoaDonKT();
        hoadonKT.setVisible(true);
    }//GEN-LAST:event_btHoaDonActionPerformed

    private void btThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongKeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ThongKeKT thongkeKT = new ThongKeKT();
        thongkeKT.setVisible(true);
    }//GEN-LAST:event_btThongKeActionPerformed

    private void cbTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTrangThaiActionPerformed
    
    private void addPieChartToPanel() {
        PieDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);

        saveChartAsPNG(chart, "TriGiaTheoLoaiHoaDon");
        
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(460, 280));

        pnChartTongTienHD.setLayout(new java.awt.BorderLayout());
        pnChartTongTienHD.add(chartPanel, java.awt.BorderLayout.CENTER);
        pnChartTongTienHD.validate();
    }

    private PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for(int i= 0; i<dsLoaiHD.size(); i++) {
            dataset.setValue(dsLoaiHD.get(i), dstongtien.get(i));
        }
        
        return dataset;
    }

    private JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Trị giá các loại hóa đơn",
                dataset,
                true,
                true,
                false);

        // Set the background color for the chart
        chart.setBackgroundPaint(Color.WHITE);
        
        PiePlot plot = (PiePlot) chart.getPlot();
        // Set the background color for the plot
        plot.setBackgroundPaint(Color.WHITE);
        plot.setOutlineVisible(false);
        
        // Set label background color and properties
        plot.setLabelBackgroundPaint(Color.WHITE);
        plot.setLabelOutlinePaint(null); // Set to null to remove the border
        plot.setLabelShadowPaint(null); // Set to null to remove the shadow
        
        for(int i =0; i<dsLoaiHD.size(); i++) {
            plot.setSectionPaint(dsLoaiHD.get(i), new Color(rValue[i], gValue[i], bValue[i]));
        }

        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(
                "{0}: {1} vnd ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(labelGenerator);
        plot.setLabelFont(new Font("Arial", Font.PLAIN, 11));
        plot.setLabelPaint(Color.BLACK);

        chart.getTitle().setFont(new Font("Arial", Font.BOLD, 12));
        chart.getTitle().setPaint(Color.BLACK);

        chart.getLegend().setItemFont(new Font("Arial", Font.PLAIN, 11));
        chart.getLegend().setItemPaint(Color.BLACK);

        return chart;
    }

    
    public void layHoaDonToa() {
        String tungay = txtTuNgay.getText();
        String denngay = txtDenNgay.getText();
        String trangthai = (String) cbTrangThai.getSelectedItem();
                
        Connection con = getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        try {           
            StringBuilder sql = new StringBuilder("SELECT MATOA, LOAIHOADON, SUM(SOTIEN) AS TONGSOTIEN FROM HOADON JOIN PHONG ON HOADON.MAPHONG = PHONG.MAPHONG");
            int index = 1;
            
            if (!tungay.isEmpty()) {
                if(index++ == 1) 
                    sql.append(" WHERE");
                else 
                    sql.append(" AND");
                sql.append(" NGAYLAPHOADON >= TO_DATE(?, 'DD-MM-YYYY')");
            }
            if (!denngay.isEmpty()) {
                if(index++ == 1) 
                    sql.append(" WHERE");
                else 
                    sql.append(" AND");
                sql.append(" NGAYLAPHOADON <= TO_DATE(?, 'DD-MM-YYYY')");
            }
            if (!"Default".equals(trangthai)) {
                if(index++ == 1) 
                    sql.append(" WHERE");
                else 
                    sql.append(" AND");
                
                if(trangthai.equals("Chưa thanh toán"))
                    sql.append(" NGAYTHANHTOAN IS NULL");
                else sql.append(" NGAYTHANHTOAN IS NOT NULL");
            }
            sql.append(" GROUP BY MATOA, LOAIHOADON ORDER BY MATOA, LOAIHOADON");

            PreparedStatement pstmt = con.prepareStatement(sql.toString());
            int parameterIndex = 1;
            if (!tungay.isEmpty()) {
                pstmt.setString(parameterIndex++, tungay);
            }
            if (!denngay.isEmpty()) {
                pstmt.setString(parameterIndex++, denngay);
            }
            ResultSet rs = pstmt.executeQuery();
            
            tb1.setRowCount(0); // Clear table
            String loaiToa = " ";
            while (rs.next()) {
                String toaHD = rs.getString("MATOA");
                int loaiHD = rs.getInt("LOAIHOADON");
                String loaiHDS = "";
                if(loaiHD == 1)
                    loaiHDS = "Tiền điện";
                else if(loaiHD == 2)
                    loaiHDS = "Tiền nước";
                else if(loaiHD == 3)
                    loaiHDS = "Tiền phòng";
                else if(loaiHD == 4)
                    loaiHDS = "Sua chua";
                else if(loaiHD == 5)
                    loaiHDS = "Ve sinh";
                int tongtienHD = rs.getInt("TONGSOTIEN");
                if(!toaHD.equals(loaiToa)) {
                    loaiToa = toaHD;
                    tb1.addRow(new Object[]{"Tòa:", toaHD});
                    tb1.addRow(new Object[]{loaiHDS, tongtienHD});
                } else {
                    tb1.addRow(new Object[]{loaiHDS, tongtienHD});
                }
            }
            rs.close();
            pstmt.close();
                 
            StringBuilder sql1 = new StringBuilder("SELECT MATOA, SUM(SOTIEN) AS TONGSOTIEN FROM HOADON JOIN PHONG ON HOADON.MAPHONG = PHONG.MAPHONG");
            int index1 = 1;
            
            if (!tungay.isEmpty()) {
                if(index1++ == 1) 
                    sql1.append(" WHERE");
                else 
                    sql1.append(" AND");
                sql1.append(" NGAYLAPHOADON >= TO_DATE(?, 'DD-MM-YYYY')");
            }
            if (!denngay.isEmpty()) {
                if(index1++ == 1) 
                    sql1.append(" WHERE");
                else 
                    sql1.append(" AND");
                sql1.append(" NGAYLAPHOADON <= TO_DATE(?, 'DD-MM-YYYY')");
            }
            if (!"Default".equals(trangthai)) {
                if(index1++ == 1) 
                    sql1.append(" WHERE");
                else 
                    sql1.append(" AND");
                
                if(trangthai.equals("Chưa thanh toán"))
                    sql1.append(" NGAYTHANHTOAN IS NULL");
                else sql1.append(" NGAYTHANHTOAN IS NOT NULL");
            }
            sql1.append(" GROUP BY MATOA");

            PreparedStatement pstmt1 = con.prepareStatement(sql1.toString());
            int parameterIndex1 = 1;
            if (!tungay.isEmpty()) {
                pstmt1.setString(parameterIndex1++, tungay);
            }
            if (!denngay.isEmpty()) {
                pstmt1.setString(parameterIndex1++, denngay);
            }
            ResultSet rs1 = pstmt1.executeQuery();
            
            dsToa.clear();
            dstongtienToa.clear();
            while (rs1.next()) {
                String toa = rs1.getString("MATOA");
                int tongtienHD = rs1.getInt("TONGSOTIEN");
                                
                dsToa.add(toa);
                dstongtienToa.add(tongtienHD);
            }
            rs1.close();
            pstmt1.close();
            con.close();
            removePieChartFromPanel1();
            addPieChartToPanel1();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void addPieChartToPanel1() {
        PieDataset dataset1 = createDataset1();
        JFreeChart chart1 = createChart1(dataset1);

        saveChartAsPNG(chart1, "HoaDonTheoToa");
        
        ChartPanel chartPanel1 = new ChartPanel(chart1);
        chartPanel1.setPreferredSize(new java.awt.Dimension(460, 280));

        pnHDToa.setLayout(new java.awt.BorderLayout());
        pnHDToa.add(chartPanel1, java.awt.BorderLayout.CENTER);
        pnHDToa.validate();
    }

    private PieDataset createDataset1() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for(int i= 0; i<dsToa.size(); i++) {
            dataset.setValue(dsToa.get(i), dstongtienToa.get(i));
        }
        
        return dataset;
    }

    private JFreeChart createChart1(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Trị giá hóa đơn theo tòa",
                dataset,
                true,
                true,
                false);

        // Set the background color for the chart
        chart.setBackgroundPaint(Color.WHITE);
        
        PiePlot plot = (PiePlot) chart.getPlot();
        // Set the background color for the plot
        plot.setBackgroundPaint(Color.WHITE);
        plot.setOutlineVisible(false);
        
        // Set label background color and properties
        plot.setLabelBackgroundPaint(Color.WHITE);
        plot.setLabelOutlinePaint(null); // Set to null to remove the border
        plot.setLabelShadowPaint(null); // Set to null to remove the shadow
        
        for(int i =0; i<dsToa.size(); i++) {
            plot.setSectionPaint(dsToa.get(i), new Color(rValue[i], gValue[i], bValue[i]));
        }


        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(
                "{0}: {1} vnd ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(labelGenerator);
        plot.setLabelFont(new Font("Arial", Font.PLAIN, 11));
        plot.setLabelPaint(Color.BLACK);

        chart.getTitle().setFont(new Font("Arial", Font.BOLD, 12));
        chart.getTitle().setPaint(Color.BLACK);

        chart.getLegend().setItemFont(new Font("Arial", Font.PLAIN, 11));
        chart.getLegend().setItemPaint(Color.BLACK);

        return chart;
    }
    
    private void removePieChartFromPanel() {
        // Xóa tất cả các thành phần con của pnHDToa
        pnChartTongTienHD.removeAll();
        // Cập nhật giao diện
        //pnChartTongTienHD.validate();
    }
    
    private void removePieChartFromPanel1() {
        // Xóa tất cả các thành phần con của pnHDToa
        pnHDToa.removeAll();
        // Cập nhật giao diện
        //pnHDToa.validate();
    }

    
    public void exportPdfThongKeLoaiHoaDon() throws IOException {
        String filePath = "ThongKeHoaDon.pdf";
        Document document = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            File filefontTieuDe = new File ("src/main/resources/font/vuArialBold.ttf");
            BaseFont bfTieuDe = BaseFont.createFont(filefontTieuDe.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

            File filefontNoiDung = new File ("src/main/resources/Font/vuArial.ttf");
            BaseFont bfNoiDung = BaseFont.createFont(filefontNoiDung.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

            com.itextpdf.text.Font fontTitle = new com.itextpdf.text.Font(bfTieuDe, 12);
            com.itextpdf.text.Font fontHeader = new com.itextpdf.text.Font(bfTieuDe, 18);
            com.itextpdf.text.Font fontContent = new com.itextpdf.text.Font(bfNoiDung, 12);

            Paragraph header = new Paragraph("ĐẠI HỌC QUỐC GIA TP.HCM\nKÝ TÚC XÁ TRƯỜNG ĐẠI HỌC CÔNG NGHỆ THÔNG TIN", fontHeader);
            header.setAlignment(Element.ALIGN_CENTER);
            document.add(header);
            document.add(new Paragraph(" \n\n")); // Add an empty line

            Paragraph title = new Paragraph("THÔNG KÊ TRỊ GIÁ PHÂN THEO LOẠI HÓA ĐƠN", fontTitle);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            document.add(new Paragraph(" ")); // Add an empty line
            
            String tungay = txtTuNgay.getText();
            String denngay = txtDenNgay.getText();
            String trangthai = (String) cbTrangThai.getSelectedItem();
            
            
            Paragraph Noidung = new Paragraph("Tổng trị giá theo loại hóa đơn: ", fontContent);
            document.add(Noidung);
            
            List thongtin = new List(List.UNORDERED);
            if(!tungay.isEmpty())
                thongtin.add(new ListItem("Các hóa đơn được lập từ ngày: " + tungay, fontContent));
            if(!denngay.isEmpty())
                thongtin.add(new ListItem("Các hóa đơn được lập  cho đến ngày: " + denngay, fontContent));
            if(!"Default".equals(trangthai))
                thongtin.add(new ListItem("Tình trạng: " + trangthai, fontContent));
            
            document.add(thongtin);
            
            document.add(new Paragraph(" ")); // Add an empty line
            
            PdfPTable table = new PdfPTable(2); // 2 columns
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            PdfPCell cell1 = new PdfPCell(new Phrase("Loại Hóa Đơn", fontTitle));
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cell1);

            PdfPCell cell2 = new PdfPCell(new Phrase("Tổng Tiền", fontTitle));
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.addCell(cell2);

            layTongSoLoaiHoaDon();

            for (int i = 0; i < dsLoaiHD.size(); i++) {
                PdfPCell Cell_1 = new PdfPCell(new Phrase(dsLoaiHD.get(i), fontContent));
                Cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
                Cell_1.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(Cell_1);
                
                PdfPCell Cell_2 = new PdfPCell(new Phrase(String.valueOf(dstongtien.get(i)) + " VND", fontContent));
                Cell_2.setHorizontalAlignment(Element.ALIGN_CENTER);
                Cell_2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(Cell_2);
            }

            document.add(table);
            document.add(new Paragraph(" ")); // Add an empty line
            
            String pieChartPath = "src/main/resources/image/TriGiaTheoLoaiHoaDon.png";
            Image pieChart = Image.getInstance(pieChartPath);
            pieChart.scaleToFit(450, 350); // Adjust the size as needed
            pieChart.setAlignment(Element.ALIGN_CENTER);
            document.add(pieChart);
            
            document.add(new Paragraph(" ")); // Add an empty line
            
            Paragraph Noidung1 = new Paragraph("Tổng trị giá các loại hóa đơn theo từng tòa: ", fontContent);
            document.add(Noidung1);
            document.add(new Paragraph(" ")); // Add an empty line
            
            PdfPTable table1 = new PdfPTable(2); // 2 columns
            table1.setWidthPercentage(100);
            table1.setSpacingBefore(10f);
            table1.setSpacingAfter(10f);
            
            PdfPCell cell1_tb1 = new PdfPCell(new Phrase("Loại Hóa Đơn", fontTitle));
            cell1_tb1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell1_tb1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table1.addCell(cell1_tb1);

            PdfPCell cell2_tb1 = new PdfPCell(new Phrase("Tổng Tiền (VND)", fontTitle));
            cell2_tb1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2_tb1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table1.addCell(cell2_tb1);
            
            layHoaDonToa();

            for (int i = 0; i < tb1.getRowCount(); i++) {
                PdfPCell Cell_1 = new PdfPCell(new Phrase(tb1.getValueAt(i, 0).toString(), fontContent));
                Cell_1.setHorizontalAlignment(Element.ALIGN_CENTER);
                Cell_1.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table1.addCell(Cell_1);
                
                PdfPCell Cell_2 = new PdfPCell(new Phrase(tb1.getValueAt(i, 1).toString(), fontContent));
                Cell_2.setHorizontalAlignment(Element.ALIGN_CENTER);
                Cell_2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table1.addCell(Cell_2);
            }
            document.add(table1);
            
            document.add(new Paragraph(" ")); // Add an empty line
            
            String pieChartPath1 = "src/main/resources/image/HoaDonTheoToa.png";
            Image pieChart1 = Image.getInstance(pieChartPath1);
            pieChart1.scaleToFit(450, 350); // Adjust the size as needed
            pieChart1.setAlignment(Element.ALIGN_CENTER);
            document.add(pieChart1);
            
            document.add(new Paragraph(" ")); // Add an empty line
            
            PdfPTable tableKyTen = new PdfPTable(2); // 2 columns
            tableKyTen.setWidthPercentage(90);
            tableKyTen.setSpacingBefore(10f);
            tableKyTen.setSpacingAfter(10f);
            
            PdfPCell cellGhiChu = new PdfPCell(new Paragraph("Ghi chú", fontTitle));
            cellGhiChu.setBorder(0);
            cellGhiChu.setRowspan(3);
            cellGhiChu.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellGhiChu.setVerticalAlignment(Element.ALIGN_TOP);
            tableKyTen.addCell(cellGhiChu);

            PdfPCell cellNgThucHien = new PdfPCell(new Paragraph("Người thực hiện báo cáo:\n\n", fontTitle));
            cellNgThucHien.setBorder(0);
            cellNgThucHien.setRowspan(3);
            cellNgThucHien.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellNgThucHien.setVerticalAlignment(Element.ALIGN_MIDDLE);
            tableKyTen.addCell(cellNgThucHien);
                        
            document.add(tableKyTen);
            
            document.close();
            writer.close();
            JOptionPane.showMessageDialog(null, "Xuất file PDF thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi trong quá trình xuất file PDF", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
        try {
            File file = new File (filePath);

            if (!Desktop.isDesktopSupported()) {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) {
                desktop.open(file);
            }
        } catch (Exception e) {
                e.printStackTrace();
        }
    }

    private void saveChartAsPNG(JFreeChart chart, String name) {
        String filePath = "src/main/resources/image/" + name + ".png";
        File imageFile = new File(filePath);
        try {
            ChartUtilities.saveChartAsPNG(imageFile, chart, 460, 280);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btHoaDon;
    private javax.swing.JButton btLoc;
    private javax.swing.JButton btPrint;
    private javax.swing.JButton btThongKe;
    private javax.swing.JButton btthongbao;
    private javax.swing.JComboBox<String> cbTrangThai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtttcn;
    private javax.swing.JPanel pnChartTongTienHD;
    private javax.swing.JPanel pnHDToa;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JPanel pnInfo;
    private javax.swing.JTable tbSumHD;
    private javax.swing.JTable tbSumHD1;
    private javax.swing.JTextField txtDenNgay;
    private javax.swing.JTextField txtTuNgay;
    // End of variables declaration//GEN-END:variables
}
