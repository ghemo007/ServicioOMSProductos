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
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author GermanO
 */
@WebService(serviceName = "ws_productos")
public class ws_productos 
{
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarPRODUCTOS")
    public List<producto> consultarPRODUCTOS(@WebParam(name = "NUMERO_PAGINA") int NUMERO_PAGINA,@WebParam(name = "TAMANO_PAGINA") int TAMANO_PAGINA) 
    {
        
        conectarBDD cn = new conectarBDD();
        
        List<producto> listado = new ArrayList<producto>();
        
        Connection dbConnection = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String resultado = null;
        
        try
        {
           
            //cn = conectarBDD();
            dbConnection = cn.conectarSQLServer();
            CallableStatement cstmt;
            cstmt = dbConnection.prepareCall(constantes.PRODUCTOS_Select);
            
            cstmt.setInt(1,NUMERO_PAGINA);
            cstmt.setInt(2,TAMANO_PAGINA);
            
            //cstmt.registerOutParameter(resultado, TAMANO_PAGINA);
            rs = cstmt.executeQuery();            
          
            while (rs.next()) 
            {
                producto PRD = new producto();
                PRD.setID(rs.getInt("ID"));
                //PRD.setNOMBRE("NOMBRE");
                PRD.setPRODUCTO_ID(rs.getInt("PRODUCTO_ID"));
                PRD.setNOMBRE(rs.getString("NOMBRE"));
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
