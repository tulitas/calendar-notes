//package com.config;
//
//
//import com.controllers.OptionsController;
//
//import java.sql.*;
//
//
//public class DataBaseConnectionForSms {
//    public String rememberSms;
//    private Connection con = null;
//    private Statement st = null;
//    private ResultSet rs = null;
//    private OptionsController optionsController = new OptionsController();
//    public void Connect() throws ClassNotFoundException, SQLException {
//
//        String url = "jdbc:mysql://127.0.0.1:3307/calendar";
//        String username = "root";
//        String password = "root";
//
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        con = DriverManager.getConnection(url, username, password);
//        st = con.createStatement();
//        rememberSms = "select * from jobform";
//        rs = st.executeQuery(rememberSms);
//        while (rs.next()) {
//            String name = rs.getString("phone");
//            System.out.println(name);
//        }
//
//    }
//
//    private void createSms() {
//
//
//    }
//
//
//}
