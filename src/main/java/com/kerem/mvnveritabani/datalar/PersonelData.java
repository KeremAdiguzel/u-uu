package com.kerem.mvnveritabani.datalar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.print.DocFlavor;
import kisiler.Kullanici;
import kisiler.Personel;

/**
 *
 * @author MKA
 */
public class PersonelData implements IDataIsleri<Personel> {

    public Personel kaydet(Personel nesne) {
        try {
            Connection connect = PostConnector.getConnection();
            Statement stmt = connect.createStatement();
            int affectedRows;
            affectedRows = stmt.executeUpdate("insert into tblpersonel (id, ad,soyad,sicilno,adres,isyeri,dogumtarihi,telefonCep,eposta,nott) "
                + " values ('5','" + nesne.getAd() + "'"
                + ",'" + nesne.getSoyad() + "','" + nesne.getSicilNo() + "','" + nesne.getAdres() + "','" + nesne.getIsyeri() + "','" + nesne.getDogumTarihi() + "','" + nesne.getTelefonCep() + "','" + nesne.getEposta() + "','" + nesne.getNot() + "')");
        } catch (Exception e) {
        }
        return null;


    }

    public Boolean sil(Personel nesne) {

        try {
            Connection conn = PostConnector.getConnection();
            Statement stmt = conn.createStatement();
            int affectedRows = stmt.executeUpdate(" delete from kisi where id= " + nesne.getId());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return false;
    }

    public Personel guncelle(Personel nesne) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Personel> getAll() {
        List<Personel> peliste = new ArrayList<Personel>();
        try {
            Connection conn = PostConnector.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id,ad,soyad,sicilno,adres,isyeri,dogumtarihi,telefoncep,eposta,nott from tblpersonel");
            while (rs.next()) {
                Long id = rs.getLong("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String adres = rs.getString("adres");
                String isyeri = rs.getString("isyeri");
                Long sicil = rs.getLong("sicilno");
                Long telefonCep = rs.getLong("telefoncep");
                String dogum = rs.getString("dogumtarihi");
                String eposta = rs.getString("eposta");
                String not = rs.getString("nott");
                peliste.add(new Personel( id, ad, soyad, sicil, adres, telefonCep, eposta, isyeri, not, dogum));
            }
        } catch (Exception e) {
        }
        return peliste;
    }

    public Personel getById(Long id) {
        try {
            Connection conn = PostConnector.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select ad,soyad,sicilno,adres,isyeri,dogumtarihi,telefonCep,eposta,nott from kisi where id=" + id);
            while (rs.next()) {
                Long idd = rs.getLong("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String adres = rs.getString("adres");
                String isyeri = rs.getString("isyeri");
                Long sicil = rs.getLong("sicilno");
                Long telefonCep = rs.getLong("telefonCep");
                String dogum = rs.getString("dogumtarihi");
                String eposta = rs.getString("eposta");
                String not = rs.getString("nott");
                return new Personel( idd,ad, soyad, sicil, adres, telefonCep, eposta, isyeri, not, dogum);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
