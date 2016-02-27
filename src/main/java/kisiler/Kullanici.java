/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kisiler;

/**
 *
 * @author MKA
 */
public class Kullanici {

    private Long id;
    private String uname;
    private String pwd;
     

   

   

    public Kullanici(Long id, String uname, String pwd) {
        this.id = id;
        this.uname = uname;
        this.pwd = pwd;
    }

    public Kullanici() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
