package org.example;

import java.util.ArrayList;

public class CatalogoProducto{
    private static CatalogoProducto instance;
    private ArrayList<Producto> productos;

    private CatalogoProducto(){
        productos = new ArrayList<>();
    }
    public static CatalogoProducto getInstance(){
        if(instance == null){
            instance = new CatalogoProducto();
        }
        return instance;
    }
}