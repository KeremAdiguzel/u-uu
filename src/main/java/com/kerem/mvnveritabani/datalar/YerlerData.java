/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kerem.mvnveritabani.datalar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kisiler.Il;
import kisiler.Ilce;

/**
 *
 * @author vektorel
 */
public class YerlerData {

    public List<Il> getAllCity() {
        List<Il> ilist = new ArrayList<Il>();

        try {
            Connection conn = PostConnector.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id,name from city");
            while (rs.next()) {
                Long id = rs.getLong("id");
                String ad = rs.getString("name");
                ilist.add(new Il(id, ad));
            }
        } catch (SQLException ex) {
            Logger.getLogger(YerlerData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ilist;
    }

    public List<Ilce> getAllDistrict() {
        List<Ilce> list = new ArrayList<Ilce>();
        try {
            Connection conn = PostConnector.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id,il_id,ad from ilce");
            while (rs.next()) {
                Long id = rs.getLong("id");
                String tanim = rs.getString("ad");
                Long ilid = rs.getLong("il_id");
                list.add(new Ilce(id, tanim, ilid));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Ilce> getDistrictsByCityId(Long ilId) {
        List<Ilce> list = new ArrayList<Ilce>();
        try {
            Connection conn = PostConnector.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id,il_id,ad from ilce where il_id=" + ilId);
            while (rs.next()) {
                Long id = rs.getLong("id");
                String ad = rs.getString("ad");
                Long ilid = rs.getLong("il_id");
                list.add(new Ilce(id, ad, ilid));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * SELECT ilce.id, ilce.il_id, ilce.tanim FROM ilce join il ON ( il.id =
     * ilce.il_id ) WHERE il.tanim = 'Ankara'
     *
     * @param ilId
     * @return
     */
    public List<Ilce> getDistrictsByCityName(String ilTanim) {
        List<Ilce> list = new ArrayList<Ilce>();
        try {
            Connection conn = PostConnector.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ilce.id,  ilce.il_id,  ilce.ad FROM   ilce  join city  ON ( city.id = ilce.il_id ) wHERE  city.name = '" + ilTanim + "'");
            while (rs.next()) {
                Long id = rs.getLong("id");
                String ad = rs.getString("ad");
                Long ilIdDb = rs.getLong("il_id");
                list.add(new Ilce(id, ad, ilIdDb));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
