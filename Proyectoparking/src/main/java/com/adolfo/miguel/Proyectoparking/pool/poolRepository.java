package com.adolfo.miguel.Proyectoparking.pool;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository


public class poolRepository {
    
    private ArrayList<pool> sorteos;

    public poolRepository(){
        sorteos = new ArrayList<>();
    }

    public List<pool> getAll(){
        this.sorteos.clear();
        this.sorteos.add(new pool(1));
        return this.sorteos;

    }

}
