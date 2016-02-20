/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kallsonys.servicioomsproductos;

/**
 *
 * @author GermanO
 */
public class conectarBDD 
{
     private java.sql.Connection cn=null;
   
    public java.sql.Connection conectarSQLServer ()
    {
        try
        {
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //cn=java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "bd", "123");
            cn=java.sql.DriverManager.getConnection("jdbc:sqlserver://192.68.0.5;databaseName=AES_PICA_PRODUCTOS;user=productos;password=productos;");
            return cn;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }    
}
