package com.adolfo.miguel.Proyectoparking.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {
    

    @Autowired
    private userRepository repository;

    @GetMapping("/user")
    public String displayUser(Model model){
        model.addAttribute("usuarios", repository.getAll());
        return "listausuarios";
    }
}
