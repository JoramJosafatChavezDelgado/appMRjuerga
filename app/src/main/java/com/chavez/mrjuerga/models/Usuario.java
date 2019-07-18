package com.chavez.mrjuerga.models;

import java.util.ArrayList;

public class Usuario
{
    int id;
    String password;

    public Usuario(int _id,String _password )
    {
        //contructor
        this.id = _id;
        this.password =_password;
    }
    public ArrayList getData() {
        // 20 registros
        ArrayList<Usuario> list = new ArrayList<Usuario>();
        list.add(new Usuario(1, "123"));
        list.add(new Usuario(1, "1234"));
        list.add(new Usuario(1, "12345"));
        list.add(new Usuario(1, "123456"));

        return list;
    }
}
