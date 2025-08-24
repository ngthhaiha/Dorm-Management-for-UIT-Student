/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.qlktx;

import SinhVien.YeuCauSV;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PC
 */
public class QLKTX {

    public static void main(String[] args) {
//        TrangChuNV d = new TrangChuNV();
//        d.setVisible(true);
//            YeuCauSV yc = new YeuCauSV();
//            yc.setVisible(true);
          DangNhap dn = new DangNhap();
          dn.setVisible(true);
            
//            DSSinhVien ds = new DSSinhVien();
//            ds.setVisible(true);

//           QLThongBao qltb = new QLThongBao();
//           qltb.setVisible(true);

//          QLYeuCau qlyc = new QLYeuCau();
//          qlyc.setVisible(true);

//            TrangChuQL tcql = new TrangChuQL();
//            tcql.setVisible(true);
//            QLHoatDong qlhd = new QLHoatDong();
//            qlhd.setVisible(true);
//               QLThongKe qltk = new QLThongKe();
//               qltk.setVisible(true);
    }
    
    public static Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName("oracle.jdbc.OracleDriver"); //driver class of oracle connection
            String url = "jdbc:oracle:thin:@localhost:1521:orcldb";
            String ORACLE_username = "C##USER1";
            String ORACLE_password = "USER1";
            conn = DriverManager.getConnection(url,ORACLE_username,ORACLE_password);
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
    }
        return conn;
    }
    
    public static String convertDateFormat(String inputDate) {
        // Định dạng đầu vào
        if(inputDate== null) return "";
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        // Định dạng đầu ra
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
        String outputDate = "";
        
        try {
            
            // Chuyển đổi chuỗi đầu vào thành đối tượng Date
            Date date = inputFormat.parse(inputDate);
            // Định dạng đối tượng Date thành chuỗi đầu ra
            outputDate = outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return outputDate;
    }
}
