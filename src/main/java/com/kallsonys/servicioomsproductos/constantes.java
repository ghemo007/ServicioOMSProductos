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
public class constantes 
{
    public static String PRODUCTOS_LISTA =
            utilidadesSQL.buildProcedureCall("dbo", "PRODUCTOS_LISTA",2);
    public static String PRODUCTOS_ID =
            utilidadesSQL.buildProcedureCall("dbo", "PRODUCTOS_ID",1);
    public static String PRODUCTOS_NOMBRE =
            utilidadesSQL.buildProcedureCall("dbo", "PRODUCTOS_NOMBRE",3);
    public static String PRODUCTOS_DESCRIPCION =
            utilidadesSQL.buildProcedureCall("dbo", "PRODUCTOS_DESCRIPCION",3);
}
