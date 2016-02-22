/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kallsonys.servicioomsproductos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author GermanO
 */
public class utilidadesSQL 
{
    public static String buildProcedureCall(String packageName, String procedureName, int paramCount) 
    {
        StringBuilder sb = new StringBuilder("{call "+packageName+"."+procedureName+"(");
        for (int n = 1; n <= paramCount; n++) {
            sb.append("?");
            if (n < paramCount) sb.append(",");
        }
        return sb.append(")}").toString();
    }

    public static void close(ResultSet rs, Statement s, Connection c) 
    {
        try { if (rs != null) rs.close(); } catch (SQLException e) {}
        try { if (s != null) s.close(); } catch (SQLException e) {}
        try { if (c != null) c.close(); } catch (SQLException e) {}
    }   
}
