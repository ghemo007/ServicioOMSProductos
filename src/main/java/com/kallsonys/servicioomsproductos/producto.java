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
public class producto 
{
    private int ID;
    private int PRODUCTO_ID;
    private String NOMBRE;
    
    //ID
    public int getID() 
    {
        return ID;
    }   
    
    public void setID(int ID) 
    {
        this.ID = ID;
    }
    
    //PRODUCTO_ID
    public int getPRODUCTO_ID() 
    {
        return PRODUCTO_ID;
    }   
    
    public void setPRODUCTO_ID(int PRODUCTO_ID) 
    {
        this.PRODUCTO_ID = PRODUCTO_ID;
    }
    
    //NOMBRE
    public String getNOMBRE() 
    {
        return NOMBRE;
    }   
    
    public void setNOMBRE(String NOMBRE) 
    {
        this.NOMBRE = NOMBRE;
    }
    
    
    
}
