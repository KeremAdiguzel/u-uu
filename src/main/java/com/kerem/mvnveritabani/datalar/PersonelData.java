package com.kerem.mvnveritabani.datalar;

import com.kerem.mvnveritabani.frmTablo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kisiler.Personel;

/**
 *
 * @author MKA
 */
public class PersonelData implements IDataIsleri<Personel> {

    int selectedrow = -1;

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

    public Boolean sil(Personel nesne, int selectedRow) {
        this.selectedrow = selectedRow;
        frmTablo ft = new frmTablo(nesne, selectedRow);

        try {
            Connection conn = PostConnector.getConnection();
            Statement stmt = conn.createStatement();
            int affectedRows = stmt.executeUpdate(" delete from personel where id= " + ft.pliste.get(selectedRow).getId());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return false;
    }

    public Personel guncelle(Personel nesne, int selectedRow) {

        try {


            this.selectedrow = selectedRow;
            frmTablo ft = new frmTablo(nesne, selectedRow);



            Connection connect = PostConnector.getConnection();
            PreparedStatement stmt;

            stmt = connect.prepareStatement("UPDATE  personel SET (ad='" + nesne.getAd() + "',soyad='" + nesne.getSoyad() + "',sicilno='" + nesne.getSicilNo() + "',adres='" + nesne.getAdres() + "',isyeri='" + nesne.getIsyeri() + "',dogumtarihi='" + nesne.getDogumTarihi() + "' ,telefonCep='" + nesne.getTelefonCep() + "',eposta='" + nesne.getEposta() + "',nott='" + nesne.getNot() + "',il_id='" + nesne.getIlId() + "',ilce_id='" + nesne.getIlceId() + "') WHERE  id=" + ft.pliste.get(selectedRow).getId());
            stmt.setDate(1, new java.sql.Date(nesne.getDogumTarihi().getTime()));
            int affectedRows;
            affectedRows = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;



    }

    public List<Personel> getAll() {
        List<Personel> peliste = new ArrayList<Personel>();
        try {
            Connection conn = PostConnector.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select personel.id,personel.ad,soyad,sicilno,adres,isyeri,dogumtarihi,telefoncep,eposta,nott,c.name as city ,i.ad as ilce from personel left join il c on (c.id=personel.il_id) left join ilce i on (i.id=personel.ilce_id)");

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
            ResultSet rs = stmt.executeQuery("select personel.id,personel.ad,soyad,sicilno,adres,isyeri,dogumtarihi,telefoncep,eposta,nott,c.name as city ,i.ad as ilce from personel left join il c on (c.id=personel.il_id) left join ilce i on (i.id=personel.ilce_id) from personel where id=" + id);
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
