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
    
    private String DESCRIPCION;
    private String CATEGORIA;
    private int PRECIO_LISTA;
    private String FABRICANTE;
    private String IMAGEN_URL;
                
    
    
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

    //DESCRIPCION
    public String getDESCRIPCION() 
    {
        return DESCRIPCION;
    }   
    
    public void setDESCRIPCION(String DESCRIPCION) 
    {
        this.DESCRIPCION = DESCRIPCION;
    }  
    
    //CATEGORIA
    public String getCATEGORIA() 
    {
        return CATEGORIA;
    }   
    
    public void setCATEGORIA(String CATEGORIA) 
    {
        this.CATEGORIA = CATEGORIA;
    }    
    
    //PRECIO_LISTA
    public int getPRECIO_LISTA() 
    {
        return PRECIO_LISTA;
    }   
    
    public void setPRECIO_LISTA(int PRECIO_LISTA) 
    {
        this.PRECIO_LISTA = PRECIO_LISTA;
    }    
    
    //FABRICANTE
    public String getFABRICANTE() 
    {
        return FABRICANTE;
    }   
    
    public void setFABRICANTE(String FABRICANTE) 
    {
        this.FABRICANTE = FABRICANTE;
    } 
    
    //IMAGEN_URL
    public String getIMAGEN_URL() 
    {
        return IMAGEN_URL;
    }   
    
    public void setIMAGEN_URL(String IMAGEN_URL) 
    {
        this.IMAGEN_URL = IMAGEN_URL;
    }     
    
}
