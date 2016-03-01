/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.kallsonys.servicioomsproductos.conectarBDD;
import com.kallsonys.servicioomsproductos.constantes;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import org.apache.log4j.Logger;
/**
 *
 * @author GermanO
 */
public class log4j 
{
    //initializing the logger
    static Logger log = Logger.getLogger(log4j.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
            
    {

        Properties prop=new Properties();

        prop.load(log4j.class.getClassLoader().getResourceAsStream("datos_conexion.properties"));
             
        String drivers = prop.getProperty("jdbc.drivers");
        String url = prop.getProperty("jdbc.url");
        String usuario = prop.getProperty("jdbc.usuario");
        String clave = prop.getProperty("jdbc.clave");  
        
        /*
        Connection dbConnection = null;
        conectarBDD cn = new conectarBDD();
        dbConnection = cn.conectarSQLServer();
        System.out.println(dbConnection);
            
        CallableStatement cstmt;
        try 
        {
            cstmt = dbConnection.prepareCall(constantes.PRODUCTOS_Select);
            log.error("cstmt "+cstmt);
        } 
        catch (SQLException ex) 
        {
            java.util.logging.Logger.getLogger(log4j.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
       
        System.out.println(drivers);
        System.out.println(url);
        System.out.println(usuario);
        System.out.println(clave);
        
        //logging in different levels
        log.trace("This is a Trace");
        log.debug("This is a Debug");
        log.info("This is an Info");
        log.warn("This is a Warn");
        log.error("This is an Error");
        log.fatal("This is a Fatal");
    }    
}