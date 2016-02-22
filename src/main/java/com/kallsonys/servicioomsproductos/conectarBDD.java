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
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            //cn=java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "bd", "123");
            cn=java.sql.DriverManager.getConnection("jdbc:jtds:sqlserver://192.68.0.5;databaseName=AES_PICA_PRODUCTOS;instance=SQL2008;user=productos;password=productos;");
            return cn;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }    
}
