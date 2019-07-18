package com.chavez.mrjuerga.models;

import java.util.ArrayList;

public class Reserva {
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;

    public Reserva(int _id,String _nombre){
        //contructor
        this.id = _id;
        this.nombre =_nombre;
    }
    public ArrayList getData(){
        // 20 registros
        ArrayList<Reserva> list = new ArrayList<Reserva>();
        list.add(new Reserva(11,"Politos Mojados"));
        list.add(new Reserva(12,"Evento 1"));
        list.add(new Reserva(13,"Evento 2"));
        list.add(new Reserva(14,"Evento 3"));
        list.add(new Reserva(15,"Evento 4"));
        list.add(new Reserva(16,"Chela x Monton"));
        list.add(new Reserva(17,"Evento 5"));
        list.add(new Reserva(18,"Espuma"));
        list.add(new Reserva(19,"Evento 6"));
        list.add(new Reserva(20,"Evento 7"));
        return list;
    }
}
