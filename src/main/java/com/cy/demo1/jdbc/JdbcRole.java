package com.cy.demo1.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by wander on 2019/3/11.
 */
public class JdbcRole {

    public void getRoleCount() throws SQLException {
        String sql = "select count(*) from sys_role";
        Connection conn = JdbcUtils.getConn();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            conn.close();
        }
    }
}
