/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kerem.mvnveritabani.datalar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import kisiler.Kullanici;

/**
 *
 * @author MKA
 */
public class KullaniciData {

    public Kullanici getKullaniciByUname(String uname) {
        try {
            StringBuffer buffer = new StringBuffer();
            buffer.append("select id,uname,pwd from kullanici where uname ='"+uname+"' ");
            Connection conn;
            conn = PostConnector.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(buffer.toString());
            while (rs.next()) {
                Long id = rs.getLong("id");
                String username = rs.getString("uname");
                String pwd = rs.getString("pwd");

                return new Kullanici(id, username, pwd);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
