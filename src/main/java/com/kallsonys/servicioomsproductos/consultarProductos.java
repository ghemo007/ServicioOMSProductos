/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kallsonys.servicioomsproductos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import javax.xml.ws.Holder;

/**
 *
 * @author GermanO
 */
@WebService(serviceName = "consultarProductos")
public class consultarProductos 
{
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarPRODUCTOS_LISTA")    
    public List<producto> consultarPRODUCTOS_LISTA(@WebParam(name = "NUMERO_PAGINA") int NUMERO_PAGINA,
                                                   @WebParam(name = "TAMANO_PAGINA") int TAMANO_PAGINA)
    {        
        conectarBDD cn = new conectarBDD();        
        List<producto> listado = new ArrayList<producto>();  
        Connection dbConnection = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String resultado = null;
        
        try
        {
            dbConnection = cn.conectarSQLServer();
            CallableStatement cstmt;
            cstmt = dbConnection.prepareCall(constantes.PRODUCTOS_LISTA);            
            cstmt.setInt(1,NUMERO_PAGINA);
            cstmt.setInt(2,TAMANO_PAGINA);
            rs = cstmt.executeQuery();            
            while (rs.next()) 
            {
                producto PRD = new producto();
                PRD.setID(rs.getInt("ID"));
                PRD.setPRODUCTO_ID(rs.getInt("PRODUCTO_ID"));
                PRD.setNOMBRE(rs.getString("NOMBRE"));                
                PRD.setDESCRIPCION(rs.getString("DESCRIPCION"));
                PRD.setCATEGORIA(rs.getString("CATEGORIA"));
                PRD.setPRECIO_LISTA(rs.getInt("PRECIO_LISTA"));                
                PRD.setFABRICANTE(rs.getString("FABRICANTE"));
                //PRD.setNOMBRE(rs.getString("IMAGEN"));
                PRD.setIMAGEN_URL(rs.getString("IMAGEN_URL"));
                PRD.setCANTIDAD_REGISTROS(rs.getInt("CANTIDAD_REGISTROS"));
                listado.add(PRD);
            }            
            return listado;
            
        }
        catch (Exception e) 
        {
            e.printStackTrace();
            resultado = e.getMessage();
        }      
        return null;
    }    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarPRODUCTOS_ID")
    public List<producto> consultarPRODUCTOS_ID(@WebParam(name = "ID") int ID) 
    {
        conectarBDD cn = new conectarBDD();        
        List<producto> listado = new ArrayList<producto>();        
        Connection dbConnection = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String resultado = null;
        
        try
        {
            dbConnection = cn.conectarSQLServer();
            CallableStatement cstmt;
            cstmt = dbConnection.prepareCall(constantes.PRODUCTOS_ID);            
            cstmt.setInt(1,ID);
            rs = cstmt.executeQuery();            
          
            while (rs.next()) 
            {
                producto PRD = new producto();
                PRD.setID(rs.getInt("ID"));
                PRD.setPRODUCTO_ID(rs.getInt("PRODUCTO_ID"));
                PRD.setNOMBRE(rs.getString("NOMBRE"));                
                PRD.setDESCRIPCION(rs.getString("DESCRIPCION"));
                PRD.setCATEGORIA(rs.getString("CATEGORIA"));
                PRD.setPRECIO_LISTA(rs.getInt("PRECIO_LISTA"));                
                PRD.setFABRICANTE(rs.getString("FABRICANTE"));
                //PRD.setNOMBRE(rs.getString("IMAGEN"));
                PRD.setIMAGEN_URL(rs.getString("IMAGEN_URL"));               
                listado.add(PRD);
            }            
            return listado;
        }
        catch (Exception e) 
        {
            e.printStackTrace();
            resultado = e.getMessage();
        }      
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarPRODUCTOS_NOMBRE")
    public List<producto> consultarPRODUCTOS_NOMBRE(@WebParam(name = "NOMBRE") String NOMBRE, @WebParam(name = "NUMERO_PAGINA") int NUMERO_PAGINA, @WebParam(name = "TAMANO_PAGINA") int TAMANO_PAGINA) 
    {
        conectarBDD cn = new conectarBDD();        
        List<producto> listado = new ArrayList<producto>();        
        Connection dbConnection = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String resultado = null;
        
        try
        {
            dbConnection = cn.conectarSQLServer();
            CallableStatement cstmt;
            cstmt = dbConnection.prepareCall(constantes.PRODUCTOS_NOMBRE);            
            cstmt.setString(1,NOMBRE);
            cstmt.setInt(2,NUMERO_PAGINA);
            cstmt.setInt(3,TAMANO_PAGINA);
            rs = cstmt.executeQuery();            
          
            while (rs.next()) 
            {
                producto PRD = new producto();
                PRD.setID(rs.getInt("ID"));
                PRD.setPRODUCTO_ID(rs.getInt("PRODUCTO_ID"));
                PRD.setNOMBRE(rs.getString("NOMBRE"));                
                PRD.setDESCRIPCION(rs.getString("DESCRIPCION"));
                PRD.setCATEGORIA(rs.getString("CATEGORIA"));
                PRD.setPRECIO_LISTA(rs.getInt("PRECIO_LISTA"));                
                PRD.setFABRICANTE(rs.getString("FABRICANTE"));
                //PRD.setNOMBRE(rs.getString("IMAGEN"));
                PRD.setIMAGEN_URL(rs.getString("IMAGEN_URL"));    
                PRD.setCANTIDAD_REGISTROS(rs.getInt("CANTIDAD_REGISTROS"));
                listado.add(PRD);
            }            
            return listado;
        }
        catch (Exception e) 
        {
            e.printStackTrace();
            resultado = e.getMessage();
        }      
        return null;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarPRODUCTOS_DESCRIPCION")
    public List<producto> consultarPRODUCTOS_DESCRIPCION(@WebParam(name = "DESCRIPCION") String DESCRIPCION, @WebParam(name = "NUMERO_PAGINA") int NUMERO_PAGINA, @WebParam(name = "TAMANO_PAGINA") int TAMANO_PAGINA) 
    {
        conectarBDD cn = new conectarBDD();        
        List<producto> listado = new ArrayList<producto>();        
        Connection dbConnection = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String resultado = null;
        
        try
        {
            dbConnection = cn.conectarSQLServer();
            CallableStatement cstmt;
            cstmt = dbConnection.prepareCall(constantes.PRODUCTOS_DESCRIPCION);            
            cstmt.setString(1, DESCRIPCION);
            cstmt.setInt(2,NUMERO_PAGINA);
            cstmt.setInt(3,TAMANO_PAGINA);
            rs = cstmt.executeQuery();            
          
            while (rs.next()) 
            {
                producto PRD = new producto();
                PRD.setID(rs.getInt("ID"));
                PRD.setPRODUCTO_ID(rs.getInt("PRODUCTO_ID"));
                PRD.setNOMBRE(rs.getString("NOMBRE"));                
                PRD.setDESCRIPCION(rs.getString("DESCRIPCION"));
                PRD.setCATEGORIA(rs.getString("CATEGORIA"));
                PRD.setPRECIO_LISTA(rs.getInt("PRECIO_LISTA"));                
                PRD.setFABRICANTE(rs.getString("FABRICANTE"));
                //PRD.setNOMBRE(rs.getString("IMAGEN"));
                PRD.setIMAGEN_URL(rs.getString("IMAGEN_URL"));   
                PRD.setCANTIDAD_REGISTROS(rs.getInt("CANTIDAD_REGISTROS"));
                
                listado.add(PRD);
            }            
            return listado;
        }
        catch (Exception e) 
        {
            e.printStackTrace();
            resultado = e.getMessage();
        }      
        return null;
    }

}
