package com.chavez.mrjuerga.models;

import java.util.ArrayList;

public class ProductoReal {
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;

    public ProductoReal(int _id,String _nombre,double _precio)
    {
        //contructor
        this.id = _id;
        this.nombre =_nombre;
        this.precio=_precio;
    }
    public String getName() {
        return this.nombre;
    }
    public static ArrayList getData() {
        // 20 registros
        ArrayList<ProductoReal> list = new ArrayList<ProductoReal>();
        list.add(new ProductoReal(1, "Box Maltini", 10));
        list.add(new ProductoReal(2, "Box Jarra", 20));
        list.add(new ProductoReal(3, "Box 2", 30));
        list.add(new ProductoReal(4, "Box Corona", 40));
        list.add(new ProductoReal(5, "Box 4", 50));
        list.add(new ProductoReal(6, "Box x Monton", 60));
        list.add(new ProductoReal(7, "Box 5", 70));
        list.add(new ProductoReal(8, "botcad", 80));
        list.add(new ProductoReal(9, "Box 6", 90));
        list.add(new ProductoReal(10, "Box Destornillador", 100));
        return list;
    }
}
