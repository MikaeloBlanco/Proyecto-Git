package com.adolfo.miguel.Proyectoparking.pool;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class poolController {
    
    @Autowired
    private poolRepository repository;


    @GetMapping("/pool")
    public String displayUsers(Model model){
        model.addAttribute("sorteo", repository.getAll());
        return "listasorteos";
    }

}
