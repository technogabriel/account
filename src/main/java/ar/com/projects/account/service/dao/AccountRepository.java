package ar.com.projects.account.service.dao;

import ar.com.projects.account.model.User;

import java.util.List;

public interface AccountRepository {

    //crear cuenta
    String saveAccount(User user);

    //listado de cuentas
    List<User>getUsers();

    //Obtener usuario por ID
    User getById(int id);

    //eliminar Usuario
    String deleteAccount(int id);
}
