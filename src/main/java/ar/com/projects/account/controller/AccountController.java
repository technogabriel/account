package ar.com.projects.account.controller;

import ar.com.projects.account.model.User;
import ar.com.projects.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class AccountController {

    @Autowired
    AccountService service;

    @PostMapping(value="/saveAccount")
    public String saveAccount(@RequestBody User user){

       return service.saveAccount(user);

    }

    @GetMapping(value="/getAllAccount")
    public List<User>getallUsers(){
        return service.getUsers();
    }

    @GetMapping(value="/AccountGetById")
    public User getById(@RequestParam int id){
        return service.getById(id);
    }

    @PostMapping(value="/deleteAccount")
    public String deleteAccount(@RequestParam int id){
        return service.deleteAccount(id);
    }
}
