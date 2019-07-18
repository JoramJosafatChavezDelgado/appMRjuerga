package com.chavez.mrjuerga.models;

import java.util.ArrayList;

public class ProductoAbstracto {
    public int id;
    String classname;

    public ProductoAbstracto(int _id,String _classname)
    {
        //contructor
        this.id = _id;
        this.classname =_classname;
    }
     public String tostring(){
        return "kkkk";
     };


    public static ArrayList getData() {
        // 20 registros
        ArrayList<ProductoAbstracto> list = new ArrayList<ProductoAbstracto>();
        list.add(new ProductoAbstracto(1, "ProductoReal"));
        list.add(new ProductoAbstracto(2, "ProductoReal"));
        list.add(new ProductoAbstracto(3, "ProductoReal"));
        list.add(new ProductoAbstracto(4, "ProductoReal"));
        list.add(new ProductoAbstracto(5, "ProductoReal"));
        list.add(new ProductoAbstracto(6, "ProductoReal"));
        list.add(new ProductoAbstracto(7, "ProductoReal"));
        list.add(new ProductoAbstracto(8, "ProductoReal"));
        list.add(new ProductoAbstracto(9, "ProductoReal"));
        list.add(new ProductoAbstracto(10, "ProductoReal"));
        list.add(new ProductoAbstracto(11, "Reserva"));
        list.add(new ProductoAbstracto(12, "Reserva"));
        list.add(new ProductoAbstracto(13, "Reserva"));
        list.add(new ProductoAbstracto(14, "Reserva"));
        list.add(new ProductoAbstracto(15, "Reserva"));
        list.add(new ProductoAbstracto(16, "Reserva"));
        list.add(new ProductoAbstracto(17, "Reserva"));
        list.add(new ProductoAbstracto(18, "Reserva"));
        list.add(new ProductoAbstracto(19, "Reserva"));
        list.add(new ProductoAbstracto(20, "Reserva"));

        return list;
    }
}
