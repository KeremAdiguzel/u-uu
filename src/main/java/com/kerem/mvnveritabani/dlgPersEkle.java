/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kerem.mvnveritabani;

import com.kerem.mvnveritabani.datalar.PersonelData;
import com.kerem.mvnveritabani.datalar.YerlerData;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.AbstractList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import kisiler.Il;
import kisiler.Ilce;
import kisiler.Personel;

/**
 *
 * @author MKA
 */
public class dlgPersEkle extends javax.swing.JDialog {

    /**
     * Creates new form dlgPersEkle
     */
    public dlgPersEkle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        actionOlustur();
        comboDoldur();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSoyad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSicil = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAdres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIsyeri = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefonCep = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEpost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNot = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnKaydet = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        dteDogum = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbIlce = new javax.swing.JComboBox();
        cmbIl = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("İsim");

        jLabel2.setText("Soyisim");

        jLabel3.setText("Sicil NO");

        jLabel4.setText("Adres");

        jLabel5.setText("İş yeri");

        jLabel6.setText("Telefon (CEP)");

        jLabel7.setText("ePosta");

        jLabel8.setText("Not");

        jLabel9.setText("Doğum tarihi");

        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        jButton2.setText("İptal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setText("İl");

        jLabel11.setText("İlçe");

        cmbIlce.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbIl.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbIl.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbIlPropertyChange(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(194, 194, 194)
                        .add(txtAd))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jLabel4)
                            .add(jLabel5)
                            .add(jLabel6)
                            .add(jLabel7)
                            .add(jLabel8)
                            .add(jLabel3)
                            .add(jLabel9)
                            .add(layout.createSequentialGroup()
                                .add(81, 81, 81)
                                .add(jButton2))
                            .add(jLabel10)
                            .add(jLabel11))
                        .add(77, 77, 77)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtTelefonCep)
                            .add(txtEpost)
                            .add(txtNot)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(0, 197, Short.MAX_VALUE)
                                .add(btnKaydet, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(52, 52, 52))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtIsyeri)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtAdres)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtSicil)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txtSoyad)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(dteDogum, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                    .add(cmbIlce, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(cmbIl, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .add(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtAd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(txtSoyad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(txtSicil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(txtAdres, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(txtIsyeri, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(txtTelefonCep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(txtEpost, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(txtNot, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel9)
                    .add(dteDogum, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jLabel10))
                    .add(layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(cmbIl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel11)
                    .add(cmbIlce, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 22, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnKaydet)
                    .add(jButton2))
                .add(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed

        Personel pers = new Personel();
        pers.setAd(txtAd.getText());
        pers.setAdres(txtAdres.getText());
        pers.setEposta(txtEpost.getText());
        pers.setIsyeri(txtIsyeri.getText());
        pers.setNot(txtNot.getText());
        pers.setSicilNo(Long.parseLong(txtSicil.getText()));
        pers.setSoyad(txtSoyad.getText());
        pers.setTelefonCep(Long.parseLong(txtTelefonCep.getText()));
        pers.setDogumTarihi(dteDogum.getDate());
        pers.setIlId(getIlId(cmbIl.getSelectedItem().toString()));
        pers.setIlceId(getIlceId(cmbIlce.getSelectedItem().toString()));
        PersonelData pd = new PersonelData();
        pd.kaydet(pers);
        this.dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbIlPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbIlPropertyChange
        ilceComboDoldur(cmbIl.getSelectedItem().toString());       // TODO add your handling code here:
    }//GEN-LAST:event_cmbIlPropertyChange
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKaydet;
    private javax.swing.JComboBox cmbIl;
    private javax.swing.JComboBox cmbIlce;
    private com.toedter.calendar.JDateChooser dteDogum;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtAdres;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtIsyeri;
    private javax.swing.JTextField txtNot;
    private javax.swing.JTextField txtSicil;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTelefonCep;
    // End of variables declaration//GEN-END:variables
    List<Il> ilListesi;
    List<Ilce> ilceListesi;

    private void comboDoldur() {
        ilListesi = new YerlerData().getAllCity();
        String[] ilDizisi = new String[ilListesi.size()];
        for (int i = 0; i < ilListesi.size(); i++) {
            ilDizisi[i] = ilListesi.get(i).getName();
        }
        cmbIl.setModel(new DefaultComboBoxModel(ilDizisi));


    }

    private void ilceComboDoldur(String ilAdi) {
        ilceListesi = new YerlerData().getDistrictsByCityName(ilAdi);
        String[] ilceDizisi = new String[ilceListesi.size()];

        for (int i = 0; i < ilceListesi.size(); i++) {
            ilceDizisi[i] = ilceListesi.get(i).getAd();
        }
        cmbIlce.setModel(new DefaultComboBoxModel(ilceDizisi));
    }

    private void actionOlustur() {
        cmbIl.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                cmbIlPropertyChange(e);
            }

            private void cmbIlPropertyChange(ItemEvent e) {
                ilceComboDoldur(cmbIl.getSelectedItem().toString());
            }
        });

    }

    private Long getIlId(String tanim) {
        for (Il il : ilListesi) {
            if (il.getName().equals(tanim)) {
                return il.getId();
            }
        }
        return -1L;
    }

    private Long getIlceId(String tanim) {
        for (Ilce ilce : ilceListesi) {
            if (ilce.getAd().equals(tanim)) {
                return ilce.getId();
            }
        }
        return -1L;
    }
}
