package com.kerem.mvnveritabani.datalar;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
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
            PreparedStatement stmt = connect.prepareStatement("insert into personel (id, ad,soyad,sicilno,adres,isyeri,dogumtarihi,telefonCep,eposta,nott,il_id,ilce_id) "
                    + " values (nextval('seq_kisi'),'" + nesne.getAd() + "'"
                    + ",'" + nesne.getSoyad() + "','" + nesne.getSicilNo() + "','" + nesne.getAdres() + "','" + nesne.getIsyeri() + "',?,'" + nesne.getTelefonCep() + "','" + nesne.getEposta() + "','" + nesne.getNot() + "','" + nesne.getIlId() + "','" + nesne.getIlceId() + "')");
            stmt.setDate(1, new java.sql.Date(nesne.getDogumTarihi().getTime()));
            int affectedRows;
            affectedRows = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;


    }

    public Boolean sil(Personel nesne) {

        try {
            Connection conn = PostConnector.getConnection();
            Statement stmt = conn.createStatement();
            int affectedRows = stmt.executeUpdate(" delete from personel where id= " + nesne.getId());
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
            ResultSet rs = stmt.executeQuery("select personel.id,personel.ad,soyad,sicilno,adres,isyeri,dogumtarihi,telefoncep,eposta,nott,c.name as city ,i.ad as ilce from personel left join city c on (c.id=personel.il_id) left join ilce i on (i.id=personel.ilce_id)");

            while (rs.next()) {
                Long id = rs.getLong("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String adres = rs.getString("adres");
                String isyeri = rs.getString("isyeri");
                Long sicil = rs.getLong("sicilno");
                Long telefonCep = rs.getLong("telefoncep");
                Date dogum = rs.getDate("dogumtarihi");
                String eposta = rs.getString("eposta");
                String not = rs.getString("nott");
                String il = rs.getString("city");
                String ilce = rs.getString("ilce");
                peliste.add(new Personel(id, ad, soyad, sicil, adres, telefonCep, eposta, isyeri, not, dogum, il, ilce));
            }
        } catch (Exception e) {
        }
        return peliste;
    }

    public Personel getById(Long id) {
        try {
            Connection conn = PostConnector.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select personel.id,personel.ad,soyad,sicilno,adres,isyeri,dogumtarihi,telefoncep,eposta,nott,c.name as city ,i.ad as ilce from personel left join city c on (c.id=personel.il_id) left join ilce i on (i.id=personel.ilce_id) from personel where id=" + id);
            while (rs.next()) {
                Long idd = rs.getLong("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String adres = rs.getString("adres");
                String isyeri = rs.getString("isyeri");
                Long sicil = rs.getLong("sicilno");
                Long telefonCep = rs.getLong("telefonCep");
                Date dogum = rs.getDate("dogumtarihi");
                String eposta = rs.getString("eposta");
                String not = rs.getString("nott");
                String il = rs.getString("city");
                String ilce = rs.getString("ilce");
                return new Personel(idd, ad, soyad, sicil, adres, telefonCep, eposta, isyeri, not, dogum, il, ilce);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
