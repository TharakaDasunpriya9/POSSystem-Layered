/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcode.pos.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.fcode.pos.db.DBConnection;

public class CrudUtil {

    private static PreparedStatement getPreparedStatement(String sql, Object... params) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);

        for (int i = 0; i < params.length; i++) {
            pstm.setObject((i + 1), params[i]);
        }

        return pstm;
        
    }

    public static boolean executeUpdate(String sql, Object... params) throws ClassNotFoundException, SQLException {
        return getPreparedStatement(sql, params).executeUpdate() > 0;
    }

    public static ResultSet executeQuery(String sql, Object... params) throws ClassNotFoundException, SQLException {
        return getPreparedStatement(sql, params).executeQuery();
    }

}
