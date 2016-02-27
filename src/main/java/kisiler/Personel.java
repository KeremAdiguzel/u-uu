/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kisiler;

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
    private String dogumTarihi;

    public Personel( Long id, String ad, String soyad, long sicilNo, String adres, long telefonCep, String eposta, String isyeri, String not, String dogumTarihi) {
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
    }

    public Personel() {
    }

    
    
    
    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
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
}
