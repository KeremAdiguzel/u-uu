/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kisiler;

/**
 *
 * @author vektorel
 */
public class Ilce {
    private Long id;
    private String ad;
    private Long ilid;

    public Ilce() {
    }

    public Ilce(Long id, String ad, Long ilid) {
        this.id = id;
        this.ad = ad;
        this.ilid = ilid;
    }

  

    public Long getId() {
        return id;
    }

    public Long getIlid() {
        return ilid;
    }

    public void setIlid(Long ilid) {
        this.ilid = ilid;
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
    
    
}
