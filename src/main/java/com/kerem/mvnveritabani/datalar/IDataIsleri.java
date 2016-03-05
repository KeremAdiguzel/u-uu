/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kerem.mvnveritabani.datalar;

import java.util.List;

/**
 *
 * @author MKA
 */
public interface IDataIsleri<K> {

    public K kaydet(K nesne);

    public Boolean sil(K nesne, int selectedRow);

    public K guncelle(K nesne, int selectedRow);

    public List<K> getAll();

    public K getById(Long id);
    
}
