package ar.com.projects.account.service;

import ar.com.projects.account.model.User;
import ar.com.projects.account.service.dao.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService implements AccountRepository {


    List<User> users = new ArrayList<>();

    @Override
    public String saveAccount(User user) {

        this.users.add(user);

        return "Usuario creado con exito!";

    }

    @Override
    public List<User>getUsers(){
        return this.users;
    }

    @Override
    public User getById(int id){

        return this.users.get(id);
    }

    @Override
    public String deleteAccount(int id) {
        this.users.remove(id);

        return "Usuario eliminado correctamente";
    }
}
