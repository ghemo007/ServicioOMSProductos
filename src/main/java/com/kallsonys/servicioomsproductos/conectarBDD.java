/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kallsonys.servicioomsproductos;

import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Properties;
import org.apache.log4j.Logger;

/**
 *
 * @author GermanO
 */
public class conectarBDD 
{  
    private java.sql.Connection cn=null;

    static Logger log = Logger.getLogger(conectarBDD.class.getName());
   
    public java.sql.Connection conectarSQLServer ()
    {
        try
        {
            
            Properties prop=new Properties();            
            prop.load(conectarBDD.class.getClassLoader().getResourceAsStream("datos_conexion.properties"));
             
            String drivers = prop.getProperty("jdbc.drivers");
            String url = prop.getProperty("jdbc.url");
            String usuario = prop.getProperty("jdbc.usuario");
            String clave = prop.getProperty("jdbc.clave");    
            
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            //Class.forName(drivers);
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");   
            //cn=java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "bd", "123");
            //cn=java.sql.DriverManager.getConnection("jdbc:jtds:sqlserver://127.0.0.1:1433/AES_PICA_PRODUCTOS;instance=SQL2008;","productos;","productos;");
            cn=DriverManager.getConnection(url,usuario,clave);
            return cn;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            log.error("Error "+ex);
        }
        return null;
    }    
}
