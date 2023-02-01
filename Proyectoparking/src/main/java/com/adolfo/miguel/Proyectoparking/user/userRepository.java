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
        this.usuarios.add(new user( "mblafer963@g.educaand.es",  "miguel"));
        this.usuarios.add(new user( "aburbel032@g.educaand.es",  "adolfo"));
        return this.usuarios;

    }


}
