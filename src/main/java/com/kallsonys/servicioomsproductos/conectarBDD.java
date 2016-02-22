/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kallsonys.servicioomsproductos;

import java.sql.DriverManager;

/**
 *
 * @author GermanO
 */
public class conectarBDD 
{
    private java.sql.Connection cn=null;
    //String url="jdbc:sqlserver://localhost\\sql2008:1433;databaseName=AES_PICA_PRODUCTOS";
    String url="jdbc:jtds:sqlserver://localhost:1433/AES_PICA_PRODUCTOS;instance=sql2008";
    String usuario="productos";
    String clave="productos";   
    
   
    public java.sql.Connection conectarSQLServer ()
    {
        try
        {
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");   
            //cn=java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "bd", "123");
            //cn=java.sql.DriverManager.getConnection("jdbc:jtds:sqlserver://127.0.0.1:1433/AES_PICA_PRODUCTOS;instance=SQL2008;","productos;","productos;");
            cn=DriverManager.getConnection(url,usuario,clave);
            return cn;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }    
}
