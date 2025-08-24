/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NhanVienKeToanMo;

import static com.mycompany.qlktx.QLKTX.*;
import com.mycompany.qlktx.DangNhap;
import com.mycompany.qlktx.QLKTX;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author MSI VN
 */
public class TrangChuKT extends javax.swing.JFrame {
    String maKT = DangNhap.GlobalVariables.username;
    //String maKT = "NV11";
    
    public TrangChuKT() {
        initComponents();
        loadData();
        btgrchoose.add(btchoosepublic);
        btgrchoose.add(btchooseprivate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgrchoose = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbAnhWebDev1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        javax.swing.JLabel lbChucNang = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbtttcn = new javax.swing.JButton();
        btthongbao = new javax.swing.JButton();
        btHoaDon = new javax.swing.JButton();
        btThongKe = new javax.swing.JButton();
        javax.swing.JPanel pnBody = new javax.swing.JPanel();
        javax.swing.JLabel lbDSThongBao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSThongBao = new javax.swing.JTable();
        cbLoaiTB = new javax.swing.JComboBox<>();
        javax.swing.JLabel lbTimKiem = new javax.swing.JLabel();
        cbNgayTB = new javax.swing.JComboBox<>();
        javax.swing.JButton btLoc = new javax.swing.JButton();
        javax.swing.JButton btXoaTB = new javax.swing.JButton();
        javax.swing.JLabel lbTaoTB = new javax.swing.JLabel();
        javax.swing.JLabel lbNoiDung = new javax.swing.JLabel();
        javax.swing.JLabel lbNguoiNhan = new javax.swing.JLabel();
        txtNguoiNhan = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btchoosepublic = new javax.swing.JRadioButton();
        btchooseprivate = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        TuNgay = new com.toedter.calendar.JDateChooser();
        jTextField2 = new javax.swing.JTextField();
        javax.swing.JButton btThemTB1 = new javax.swing.JButton();
        DenNgay = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(1512, 950));
        setResizable(false);
        setSize(new java.awt.Dimension(1512, 950));

        jPanel5.setPreferredSize(new java.awt.Dimension(1512, 1020));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 80));

        lbAnhWebDev1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAnhWebDev1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N
        lbAnhWebDev1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lbAnhWebDev1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1237, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbAnhWebDev1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
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
                        .addContainerGap(133, Short.MAX_VALUE))))
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

        pnBody.setBackground(new java.awt.Color(255, 255, 255));

        lbDSThongBao.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        lbDSThongBao.setForeground(new java.awt.Color(83, 160, 219));
        lbDSThongBao.setText("Danh sách thông báo");

        tbDSThongBao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbDSThongBao.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tbDSThongBao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thông báo", "Nội dung", "Ngày đăng", "Người đăng"
            }
        ));
        tbDSThongBao.setToolTipText("");
        tbDSThongBao.setDragEnabled(true);
        tbDSThongBao.setIntercellSpacing(new java.awt.Dimension(20, 0));
        tbDSThongBao.setMinimumSize(new java.awt.Dimension(20, 0));
        tbDSThongBao.setName(""); // NOI18N
        tbDSThongBao.setRowHeight(40);
        tbDSThongBao.setShowGrid(true);
        jScrollPane1.setViewportView(tbDSThongBao);

        cbLoaiTB.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbLoaiTB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sở hữu", "Tất cả" }));
        cbLoaiTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiTBActionPerformed(evt);
            }
        });

        lbTimKiem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbTimKiem.setText("Tìm kiếm:");

        cbNgayTB.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cbNgayTB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mới nhất", "Cũ nhất" }));
        cbNgayTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNgayTBActionPerformed(evt);
            }
        });

        btLoc.setBackground(new java.awt.Color(93, 163, 217));
        btLoc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btLoc.setForeground(new java.awt.Color(255, 255, 255));
        btLoc.setText("Lọc");
        btLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocActionPerformed(evt);
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

        lbTaoTB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbTaoTB.setText("Tạo thông báo");

        lbNoiDung.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbNoiDung.setText("Nội dung: ");

        lbNguoiNhan.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbNguoiNhan.setText("Người nhận:");

        txtNguoiNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNguoiNhanActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        btchoosepublic.setBackground(new java.awt.Color(254, 254, 254));
        btchoosepublic.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btchoosepublic.setText("Chung");
        btchoosepublic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchoosepublicActionPerformed(evt);
            }
        });

        btchooseprivate.setBackground(new java.awt.Color(254, 254, 254));
        btchooseprivate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btchooseprivate.setText("Cá nhân");
        btchooseprivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchooseprivateActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField1.setText("Từ ngày");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        TuNgay.setDateFormatString("dd-MM-yyyy ");
        TuNgay.setFocusable(false);
        TuNgay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TuNgay.setMinimumSize(new java.awt.Dimension(82, 29));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField2.setText("Đến ngày");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        btThemTB1.setBackground(new java.awt.Color(93, 163, 217));
        btThemTB1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btThemTB1.setForeground(new java.awt.Color(255, 255, 255));
        btThemTB1.setText("Tạo");
        btThemTB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemTB1ActionPerformed(evt);
            }
        });

        DenNgay.setDateFormatString("dd-MM-yyyy ");
        DenNgay.setFocusable(false);
        DenNgay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DenNgay.setMinimumSize(new java.awt.Dimension(82, 29));

        javax.swing.GroupLayout pnBodyLayout = new javax.swing.GroupLayout(pnBody);
        pnBody.setLayout(pnBodyLayout);
        pnBodyLayout.setHorizontalGroup(
            pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBodyLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btXoaTB)
                    .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnBodyLayout.createSequentialGroup()
                            .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbNguoiNhan)
                                .addComponent(lbTaoTB, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnBodyLayout.createSequentialGroup()
                                    .addComponent(btchoosepublic)
                                    .addGap(28, 28, 28)
                                    .addComponent(btchooseprivate))
                                .addComponent(txtNguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnBodyLayout.createSequentialGroup()
                                    .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(pnBodyLayout.createSequentialGroup()
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(DenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(43, 43, 43)
                                            .addComponent(cbNgayTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(45, 45, 45)
                                            .addComponent(cbLoaiTB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(40, 40, 40)
                                    .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btThemTB1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(lbNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbDSThongBao)
                .addGap(413, 413, 413))
        );
        pnBodyLayout.setVerticalGroup(
            pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBodyLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbDSThongBao)
                .addGap(52, 52, 52)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTaoTB)
                    .addComponent(btchoosepublic)
                    .addComponent(btchooseprivate))
                .addGap(18, 18, 18)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNguoiNhan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNoiDung)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btThemTB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(DenNgay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TuNgay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                    .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbTimKiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(pnBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btLoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(cbLoaiTB, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbNgayTB, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btXoaTB)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                    .addComponent(pnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1513, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    public void loadData(){
    Connection con = QLKTX.getConnection();
    if(con == null) {
        JOptionPane.showMessageDialog(this,"Lỗi kết nối csdl","Lỗi",JOptionPane.ERROR_MESSAGE);
        return;
    }
        //tạo 1 table mới
        DefaultTableModel table = new DefaultTableModel();
        //gán cho table cột
        String title[] = {"Mã thông báo", "Nội dung", "Ngày đăng", "Người đăng"};
        table.setColumnIdentifiers(title);
        try{                        
                String sql = "SELECT * FROM THONGBAO WHERE MANV = ? OR MANGUOINHAN = ? ORDER BY MATHONGBAO";
                PreparedStatement pst = con.prepareStatement(sql); 
                pst.setString(1, maKT);
                pst.setString(2, maKT);
                ResultSet rs = pst.executeQuery();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                while(rs.next()){
                    String matb = rs.getString("MATHONGBAO");
                    String nd = rs.getString("NOIDUNG");                     
                    Date ngaydang = rs.getDate("NGAYDANG");
                    String manguoidang = rs.getString("MANV");
                    String dateformat = sdf.format(ngaydang);
                    table.addRow(new Object[]{matb,nd,dateformat,manguoidang});
                }
                
                //gán cho table chính
                tbDSThongBao.setModel(table);
                //cho giá trị xuất hiện giữa bảng
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                for (int i = 0; i < tbDSThongBao.getColumnCount(); i++) {
                    tbDSThongBao.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                }
                DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
                leftRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);
                tbDSThongBao.getColumnModel().getColumn(1).setCellRenderer(leftRenderer);
                
                pst.close();
                rs.close();
                con.close();                     
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void btThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongKeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ThongKeKT thongkeKT = new ThongKeKT();
        thongkeKT.setVisible(true);
    }//GEN-LAST:event_btThongKeActionPerformed

    private void btHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoaDonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoaDonKT hoadonKT = new HoaDonKT();
        hoadonKT.setVisible(true);
    }//GEN-LAST:event_btHoaDonActionPerformed

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

    private void btLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocActionPerformed
        //        Date tungay = (Date)TuNgay.getDate();
        //        Date denngay = (Date)DenNgay.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //        String tungay = TuNgay.getDateFormatString();
        //        String denngay = DenNgay.getDateFormatString();
        System.out.println(TuNgay.getDate());
        if(DenNgay.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn cả ngày bắt đầu và ngày kết thúc.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String tungay = sdf.format(TuNgay.getDate());
        String denngay = sdf.format(DenNgay.getDate());
        System.out.println(tungay);
        System.out.println(denngay);
        //        if(tungay == null || denngay == null) return;
        //        java.sql.Date sqlTuNgay = new java.sql.Date(tungay.getTime());
        //        java.sql.Date sqlDenNgay = new java.sql.Date(denngay.getTime());
        Connection con = QLKTX.getConnection();
        if(con == null){
            JOptionPane.showMessageDialog(this,"lỗi kết nối csdl","lỗi",JOptionPane.ERROR_MESSAGE);
        }
        String sql = "SELECT * FROM THONGBAO WHERE NGAYDANG BETWEEN TO_DATE(?, 'DD-MM-YYYY') AND TO_DATE(?, 'DD-MM-YYYY')";
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,(tungay));
            pst.setString(2, (denngay));
            ResultSet rs = pst.executeQuery();
            DefaultTableModel table = new DefaultTableModel();
            String title[] = {"Mã thông báo", "Nội dung", "Ngày đăng", "Người đăng"};
            table.setColumnIdentifiers(title);
            while(rs.next()){
                String matb = rs.getString("MATHONGBAO");
                String noidung = rs.getString("NOIDUNG");
                Date ngaydang = rs.getDate("NGAYDANG");
                String manguoidang = rs.getString("MANV");
                String dateformat = sdf.format(ngaydang);
                table.addRow(new Object[]{matb, noidung, dateformat, manguoidang});
            }
            tbDSThongBao.setModel(table);
            //cho giá trị xuất hiện giữa bảng
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            for (int i = 0; i < tbDSThongBao.getColumnCount(); i++) {
                tbDSThongBao.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
            DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
            leftRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);
            tbDSThongBao.getColumnModel().getColumn(1).setCellRenderer(leftRenderer);
            pst.close();
            rs.close();
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        TuNgay.setDate(null);
        DenNgay.setDate(null);
    }//GEN-LAST:event_btLocActionPerformed

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

    private void txtNguoiNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNguoiNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNguoiNhanActionPerformed

    private void btchoosepublicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchoosepublicActionPerformed

    }//GEN-LAST:event_btchoosepublicActionPerformed

    private void btchooseprivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchooseprivateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btchooseprivateActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btThemTB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemTB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btThemTB1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DenNgay;
    private com.toedter.calendar.JDateChooser TuNgay;
    private javax.swing.JButton btHoaDon;
    private javax.swing.JButton btThongKe;
    private javax.swing.JRadioButton btchooseprivate;
    private javax.swing.JRadioButton btchoosepublic;
    private javax.swing.ButtonGroup btgrchoose;
    private javax.swing.JButton btthongbao;
    private javax.swing.JComboBox<String> cbLoaiTB;
    private javax.swing.JComboBox<String> cbNgayTB;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtttcn;
    private javax.swing.JLabel lbAnhWebDev1;
    public javax.swing.JTable tbDSThongBao;
    private javax.swing.JTextField txtNguoiNhan;
    // End of variables declaration//GEN-END:variables
}
