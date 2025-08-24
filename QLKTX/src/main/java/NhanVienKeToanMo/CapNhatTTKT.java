/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NhanVienKeToanMo;
import com.mycompany.qlktx.DangNhap;
import static com.mycompany.qlktx.QLKTX.*;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.mycompany.qlktx.TrangChuNV;
import com.mycompany.qlktx.TrangChuQL;


public class CapNhatTTKT extends javax.swing.JFrame {
    String maKT = DangNhap.GlobalVariables.username;
    //String maKT = "NV11";
    JFrame preFrame;

    public CapNhatTTKT() {
        initComponents();
        thietlapManHinh();
    }
    
    public CapNhatTTKT(JFrame preFrame) {
        this.preFrame=preFrame;
        initComponents();
        thietlapManHinh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        javax.swing.JLabel lbChucNang = new javax.swing.JLabel();
        btThongBao = new javax.swing.JButton();
        btTraCuuPhong = new javax.swing.JButton();
        btHoaDon = new javax.swing.JButton();
        btDangXuat = new javax.swing.JButton();
        btThongKe = new javax.swing.JButton();
        btThongTinCN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbWebDev = new javax.swing.JLabel();
        btBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbSDT = new javax.swing.JLabel();
        lbMANV = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        lbNgaySinh = new javax.swing.JLabel();
        txtMANV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btCapNhat = new javax.swing.JButton();
        lbTTSV = new javax.swing.JLabel();
        lbCCCD = new javax.swing.JLabel();
        lbGioiTinh = new javax.swing.JLabel();
        txtCCCD = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        lbMK = new javax.swing.JLabel();
        txtMKcu = new javax.swing.JTextField();
        txtMKmoi = new javax.swing.JTextField();
        lbMKMoi = new javax.swing.JLabel();
        btCNMK = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setPreferredSize(new java.awt.Dimension(1512, 1020));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.setPreferredSize(new java.awt.Dimension(350, 309));

        lbChucNang.setBackground(new java.awt.Color(255, 255, 255));
        lbChucNang.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbChucNang.setForeground(new java.awt.Color(83, 160, 219));
        lbChucNang.setText("Menu");

        btThongBao.setBackground(new java.awt.Color(254, 254, 254));
        btThongBao.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btThongBao.setForeground(new java.awt.Color(153, 153, 153));
        btThongBao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ThongBao.png"))); // NOI18N
        btThongBao.setText("Thông báo");
        btThongBao.setBorder(null);
        btThongBao.setBorderPainted(false);
        btThongBao.setHideActionText(true);
        btThongBao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btThongBao.setIconTextGap(10);
        btThongBao.setOpaque(true);
        btThongBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongBaoActionPerformed(evt);
            }
        });

        btTraCuuPhong.setBackground(new java.awt.Color(254, 254, 254));
        btTraCuuPhong.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btTraCuuPhong.setForeground(new java.awt.Color(153, 153, 153));
        btTraCuuPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/TraCuu 50x50.png"))); // NOI18N
        btTraCuuPhong.setText("Tra cứu phòng");
        btTraCuuPhong.setBorder(null);
        btTraCuuPhong.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btTraCuuPhong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btTraCuuPhong.setIconTextGap(10);
        btTraCuuPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTraCuuPhongActionPerformed(evt);
            }
        });

        btHoaDon.setBackground(new java.awt.Color(254, 254, 254));
        btHoaDon.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btHoaDon.setForeground(new java.awt.Color(153, 153, 153));
        btHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/HoaDon.png"))); // NOI18N
        btHoaDon.setText("Hóa đơn");
        btHoaDon.setBorder(null);
        btHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btHoaDon.setIconTextGap(10);
        btHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoaDonActionPerformed(evt);
            }
        });

        btDangXuat.setBackground(new java.awt.Color(254, 254, 254));
        btDangXuat.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btDangXuat.setForeground(new java.awt.Color(153, 153, 153));
        btDangXuat.setText("Đăng xuất");
        btDangXuat.setBorder(null);
        btDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangXuatActionPerformed(evt);
            }
        });

        btThongKe.setBackground(new java.awt.Color(254, 254, 254));
        btThongKe.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btThongKe.setForeground(new java.awt.Color(153, 153, 153));
        btThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CongDong.png"))); // NOI18N
        btThongKe.setText("Thống kê");
        btThongKe.setBorder(null);
        btThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btThongKe.setIconTextGap(10);
        btThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongKeActionPerformed(evt);
            }
        });

        btThongTinCN.setBackground(new java.awt.Color(254, 254, 254));
        btThongTinCN.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btThongTinCN.setText("Thông tin cá nhân");
        btThongTinCN.setBorder(null);
        btThongTinCN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btThongTinCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongTinCNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(lbChucNang)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btThongTinCN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btTraCuuPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbChucNang)
                .addGap(18, 18, 18)
                .addComponent(btThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btTraCuuPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btThongTinCN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 80, 390, 940));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 80));

        lbWebDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        btBack.setBackground(new java.awt.Color(254, 254, 254));
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        btBack.setBorder(null);
        btBack.setBorderPainted(false);
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btBack)
                .addGap(32, 32, 32)
                .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbWebDev, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1520, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1126, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 350));

        lbSDT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbSDT.setForeground(new java.awt.Color(51, 51, 51));
        lbSDT.setText("SDT:");

        lbMANV.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMANV.setForeground(new java.awt.Color(51, 51, 51));
        lbMANV.setText("MANV:");

        lbHoTen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbHoTen.setForeground(new java.awt.Color(51, 51, 51));
        lbHoTen.setText("Họ Tên:");

        lbNgaySinh.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbNgaySinh.setForeground(new java.awt.Color(51, 51, 51));
        lbNgaySinh.setText("Ngày Sinh:");

        txtMANV.setEditable(false);
        txtMANV.setBackground(new java.awt.Color(254, 254, 254));
        txtMANV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMANV.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMANV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtHoTen.setEditable(false);
        txtHoTen.setBackground(new java.awt.Color(254, 254, 254));
        txtHoTen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHoTen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtHoTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNgaySinh.setBackground(new java.awt.Color(254, 254, 254));
        txtNgaySinh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNgaySinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtSDT.setBackground(new java.awt.Color(254, 254, 254));
        txtSDT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSDT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btCapNhat.setBackground(new java.awt.Color(93, 163, 217));
        btCapNhat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btCapNhat.setText("Cập nhật");
        btCapNhat.setBorder(null);
        btCapNhat.setBorderPainted(false);
        btCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatActionPerformed(evt);
            }
        });

        lbTTSV.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbTTSV.setForeground(new java.awt.Color(83, 160, 219));
        lbTTSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTTSV.setText("Cập nhật thông tin");

        lbCCCD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbCCCD.setForeground(new java.awt.Color(51, 51, 51));
        lbCCCD.setText("CCCD:");

        lbGioiTinh.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbGioiTinh.setForeground(new java.awt.Color(51, 51, 51));
        lbGioiTinh.setText("Giới Tính:");

        txtCCCD.setBackground(new java.awt.Color(254, 254, 254));
        txtCCCD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCCCD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtGioiTinh.setEditable(false);
        txtGioiTinh.setBackground(new java.awt.Color(254, 254, 254));
        txtGioiTinh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtGioiTinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbMK.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMK.setForeground(new java.awt.Color(51, 51, 51));
        lbMK.setText("Mật khẩu cũ:");

        txtMKcu.setBackground(new java.awt.Color(254, 254, 254));
        txtMKcu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMKcu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtMKmoi.setBackground(new java.awt.Color(254, 254, 254));
        txtMKmoi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMKmoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbMKMoi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMKMoi.setForeground(new java.awt.Color(51, 51, 51));
        lbMKMoi.setText("Mật khẩu mới:");

        btCNMK.setBackground(new java.awt.Color(93, 163, 217));
        btCNMK.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btCNMK.setForeground(new java.awt.Color(255, 255, 255));
        btCNMK.setText("Đổi mật khẩu");
        btCNMK.setBorder(null);
        btCNMK.setBorderPainted(false);
        btCNMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCNMKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTTSV, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btCNMK, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lbMK)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMKcu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(btCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addComponent(lbMKMoi)))
                        .addContainerGap(151, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMANV, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCCCD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMANV, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtCCCD))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHoTen)))
                        .addGap(280, 280, 280)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtMKmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(txtGioiTinh)
                                    .addComponent(txtSDT))))
                        .addGap(253, 253, 253))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTTSV, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMANV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMANV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMKcu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMKmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(306, 306, 306))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(btCNMK, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(80, 350));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(80, 350));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(800, 100));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1126, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 80, 1130, 940));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btBackActionPerformed

    private void btCNMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCNMKActionPerformed
        // TODO add your handling code here:
        String matkhaucu = txtMKcu.getText();
        String matkhaumoi = txtMKmoi.getText();

        if(matkhaucu.isEmpty() || matkhaumoi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không để trống mật khẩu", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Connection con = getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }

        try {
            String sql = "SELECT MATKHAU FROM NHANVIEN WHERE MANV = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, maKT);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String matKhau = rs.getString("MATKHAU");
                if(!matkhaucu.equals(matKhau)) {
                    JOptionPane.showMessageDialog(this, "Mật khẩu cũ không đúng", "Error", JOptionPane.ERROR_MESSAGE);
                    rs.close();
                    pstmt.close();
                    con.close();
                    return;
                }
            }

            int ret = JOptionPane.showConfirmDialog(null, "Xác nhận cập nhật", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (ret == JOptionPane.YES_OPTION) {
                String sql1 = "UPDATE NHANVIEN SET MATKHAU = ? WHERE MANV = ?";
                PreparedStatement pstmt1 = con.prepareStatement(sql1);
                pstmt1.setString(1, matkhaumoi);
                pstmt1.setString(2, maKT);
                pstmt1.executeUpdate();

                JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Success", JOptionPane.INFORMATION_MESSAGE);
                if (preFrame instanceof TrangChuQL) {
                    ((TrangChuQL) preFrame).loadData();
                } else if (preFrame instanceof TrangChuNV) {
                    ((TrangChuNV) preFrame).loadData();
                }else if(preFrame instanceof TrangChuKT){
                    ((TrangChuKT)preFrame).loadData();
                }
                rs.close();
                pstmt.close();
                pstmt1.close();
                con.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCNMKActionPerformed

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(null, "Xác nhận cập nhật", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            String sdt = txtSDT.getText();

            Connection con = getConnection();
            if (con == null) {
                JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
            }

            try {
                String sql = "UPDATE NHANVIEN SET SDT = ? WHERE MANV = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, sdt);
                pstmt.setString(2, maKT);

                ResultSet rs = pstmt.executeQuery();
                layTTKT();
                JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Success", JOptionPane.INFORMATION_MESSAGE);
                if (preFrame instanceof TrangChuQL) {
                    ((TrangChuQL) preFrame).loadData();
                } else if (preFrame instanceof TrangChuNV) {
                    ((TrangChuNV) preFrame).loadData();
                }else if(preFrame instanceof TrangChuKT){
                    ((TrangChuKT)preFrame).loadData();
                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btCapNhatActionPerformed

    private void btThongBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongBaoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TrangChuKT tcKT = new TrangChuKT();
        tcKT.setVisible(true);
    }//GEN-LAST:event_btThongBaoActionPerformed

    private void btTraCuuPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTraCuuPhongActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TraCuuPhongKT tcpKT = new TraCuuPhongKT();
        tcpKT.setVisible(true);
    }//GEN-LAST:event_btTraCuuPhongActionPerformed

    private void btHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoaDonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HoaDonKT hoadonKT = new HoaDonKT();
        hoadonKT.setVisible(true);
    }//GEN-LAST:event_btHoaDonActionPerformed

    private void btDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangXuatActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất", "Đăng xuất", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            this.dispose();
            DangNhap dangnhap = new DangNhap();
            dangnhap.setVisible(true);
        }
    }//GEN-LAST:event_btDangXuatActionPerformed

    private void btThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongKeActionPerformed
        this.setVisible(false);
        ThongKeKT thongkeKT = new ThongKeKT();
        thongkeKT.setVisible(true);
    }//GEN-LAST:event_btThongKeActionPerformed

    private void btThongTinCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongTinCNActionPerformed
        this.setVisible(false);
        TrangChuKT thongtinKT = new TrangChuKT();
        thongtinKT.setVisible(true);
    }//GEN-LAST:event_btThongTinCNActionPerformed

    public void thietlapManHinh() {
        txtMANV.setEditable(false); 
        txtHoTen.setEditable(false); 
        txtGioiTinh.setEditable(false); 
        txtNgaySinh.setEditable(false);
        txtCCCD.setEditable(false); 
   
        layTTKT();
    }
    
    private void layTTKT() {
        Connection con = getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            //String sql = "SELECT TENSV, EXTRACT(DAY FROM NGSINH) AS DAY, EXTRACT(MONTH FROM NGSINH) AS MONTH, EXTRACT(YEAR FROM NGSINH) AS YEAR, GIOITINH, EMAIL, SDT FROM SINHVIEN WHERE MSSV = ?";
            String sql = "SELECT TENNV, NGSINH, GIOITINH, CCCD, SDT FROM NHANVIEN WHERE MANV = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, maKT);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String tenSv = rs.getString("TENNV");
                String ngSinh = convertDateFormat(rs.getString("NGSINH"));
                String gioiTinh = rs.getString("GIOITINH");
                String canCuoc = rs.getString("CCCD");
                String sdt = rs.getString("SDT");
                     
                
                txtMANV.setText(maKT);
                txtHoTen.setText(tenSv);
                txtNgaySinh.setText(ngSinh);
                txtGioiTinh.setText(gioiTinh);
                txtCCCD.setText(canCuoc);
                txtSDT.setText(sdt);
                        
                rs.close();
                pstmt.close();
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi trong quá trình truy vấn cơ sở dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
        }
     }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btCNMK;
    private javax.swing.JButton btCapNhat;
    private javax.swing.JButton btDangXuat;
    private javax.swing.JButton btHoaDon;
    private javax.swing.JButton btThongBao;
    private javax.swing.JButton btThongKe;
    private javax.swing.JButton btThongTinCN;
    private javax.swing.JButton btTraCuuPhong;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lbCCCD;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMANV;
    private javax.swing.JLabel lbMK;
    private javax.swing.JLabel lbMKMoi;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbTTSV;
    private javax.swing.JLabel lbWebDev;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMANV;
    private javax.swing.JTextField txtMKcu;
    private javax.swing.JTextField txtMKmoi;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
