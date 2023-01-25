package user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.engine.AttributeName;

@Controller

public class userController {
    

    @Autowired
    private userRepository repository;

    @GetMapping("/usuarios")
    public String displayUsers(Model model){
        model.addAttribute(AttributeName:"usuarios", repository.getAll());
        return "listausuarios";
    }

    @GetMapping("/sorteos")
    public String displayPools(Model model){
        model.addAttribute(AttributeName:"sorteos", repository.getAll());
    }
}
