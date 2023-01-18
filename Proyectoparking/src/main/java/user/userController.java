package user;

import org.springframework.web.bind.annotation.GetMapping;

public class userController {
    


    private userRepository repository = new userRepository();

    @GetMapping
    public String displayUsers(){
        
    }

}
