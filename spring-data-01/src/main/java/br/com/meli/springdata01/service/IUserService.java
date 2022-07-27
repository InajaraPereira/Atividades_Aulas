package br.com.meli.springdata01.service;

import br.com.meli.springdata01.model.UserBD;

import java.util.List;
import java.util.Map;

public interface IUserService {

    UserBD getUserById(long id);

    UserBD insertiUser(UserBD userBD);

    void deleteUser(long id);

    List<UserBD> findAll();

    UserBD update(UserBD userBD);

    UserBD updateParcial(long id, Map<String, String> changes);

    UserBD findByEmail(String email);

}
