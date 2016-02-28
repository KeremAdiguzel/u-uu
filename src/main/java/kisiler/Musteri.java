/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kisiler;

import java.sql.Date;

/**
 *
 * @author MKA
 */
public class Musteri {

    private Long id;
    private String ad;
    private String soyad;
    private String adres;
    private long telefonCep;
    private String eposta;
    private String isyeri;
    private String not;
    private Date dogum;
    private String il;
    private String ilce;

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

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

    public Date getDogum() {
        return dogum;
    }

    public void setDogum(Date dogum) {
        this.dogum = dogum;
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
}
