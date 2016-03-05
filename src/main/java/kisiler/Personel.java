/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kisiler;

import java.util.Date;

/**
 *
 * @author MKA
 */
public class Personel {

    private Long id;
    private String ad;
    private String soyad;
    private long sicilNo;
    private String adres;
    private long telefonCep;
    private String eposta;
    private String isyeri;
    private String not;
    private Date dogumTarihi;
    private String il;
    private String ilce;
    private Long ilId;
    private Long ilceId;
    private int sele;

    public int getSele() {
        return sele;
    }

    public void setSele(int sele) {
        this.sele = sele;
    }

    public Personel(Long id, String ad, String soyad, long sicilNo, String adres, long telefonCep, String eposta, String isyeri, String not, Date dogumTarihi, String il, String ilce) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.sicilNo = sicilNo;
        this.adres = adres;
        this.telefonCep = telefonCep;
        this.eposta = eposta;
        this.isyeri = isyeri;
        this.not = not;
        this.dogumTarihi = dogumTarihi;
        this.il = il;
        this.ilce = ilce;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public Personel() {
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public long getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(long sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public long getTelefonCep() {
        return telefonCep;
    }

    public void setTelefonCep(long telefonCep) {
        this.telefonCep = telefonCep;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getIsyeri() {
        return isyeri;
    }

    public void setIsyeri(String isyeri) {
        this.isyeri = isyeri;
    }

    public Long getIlId() {
        return ilId;
    }

    public void setIlId(Long ilId) {
        this.ilId = ilId;
    }

    public Long getIlceId() {
        return ilceId;
    }

    public void setIlceId(Long ilceId) {
        this.ilceId = ilceId;
    }
}
