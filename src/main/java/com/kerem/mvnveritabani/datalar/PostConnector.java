/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kerem.mvnveritabani.datalar;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MKA
 */
public class PostConnector {

    static Connection c = null;
     
    public static Connection getConnection() {        
        if(c==null){
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SirketVeritabanı","postgres", "postgres");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Opened database successfully");
        }
        return c;
    }
}


    
    
    
