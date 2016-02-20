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
public class ws_productos {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarPRODUCTOS")
    public List<producto> consultarPRODUCTOS() 
    {
        //TODO write your implementation code here:ç
        List<producto> listado = new ArrayList<producto>();
        Connection dbConnection = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        
        try
        {
            conectarBDD cn = conectarBDD();
            dbConnection = cn.conectarSQLServer();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        return null;
    }

    /*
    
        try {
            ConnectDB cn = new ConnectDB();
            dbConnection = cn.connectOracle();
            cs = dbConnection.prepareCall(Constants.SP_CONSULTAR_USUARIOS);
            int pos = 0;
            cs.registerOutParameter(++pos, OracleTypes.CURSOR);
            cs.execute();
            
              //  los parametros de salida OUT
            rs = (ResultSet) cs.getObject(1);
            
            while (rs.next()) 
            {

                  Usuario u = new Usuario();
                  u.setUsuarioid(rs.getInt("usuario_id"));
                  u.setUsuario(rs.getString("usuario"));
                  u.setClave(rs.getString("clave"));
                  u.setEstado(rs.getString("estado"));
                  
                  lista.add(u);

            }
            
            return lista;
    */
}
