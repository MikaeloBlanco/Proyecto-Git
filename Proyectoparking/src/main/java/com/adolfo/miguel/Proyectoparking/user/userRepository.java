package com.adolfo.miguel.Proyectoparking.user;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository

public class userRepository {
    
    private ArrayList<user> usuarios;

    public userRepository(){
        usuarios = new ArrayList<>();
    }

    public List<user> getAll(){
        this.usuarios.clear();
        this.usuarios.add(new user( "Blanco","Fernandez","miguel","Administrador"));
        this.usuarios.add(new user( "Burgos","Belgrano", "adolfo","Usuario"));
        return this.usuarios;

    }


}
