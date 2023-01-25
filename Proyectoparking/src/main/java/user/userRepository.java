package user;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository

public class userRepository {
    
    private ArrayList<User> usuarios;

    public UserRepository(){
        usuarios = new ArrayList<>();
    }

    public List<user> getAll(){
        this.usuarios.clear();
        this.usuarios.add(new User(email: "mblafer963@g.educaand.es", name: "miguel"));
        this.usuarios.add(new User(email: "mblafer963@g.educaand.es", name: "adolfo"));
        return this.usuarios;

    }


}
