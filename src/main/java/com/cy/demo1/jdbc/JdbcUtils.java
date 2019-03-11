package com.cy.demo1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by wander on 2019/3/11.
 */
public class JdbcUtils {


    private static String url = "jdbc:mysql://localhost:3307/ruoyi";
    private static String user = "root";
    private static String password = "123456";
    private static String forname = "com.mysql.jdbc.Driver";

    public static Connection getConn(){
        try {
            Class.forName(forname);
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("找不到数据库驱动");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("获取connection异常");
        }
        return null;
    }
}
