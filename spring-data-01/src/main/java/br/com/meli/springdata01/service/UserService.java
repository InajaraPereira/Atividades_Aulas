package br.com.meli.springdata01.service;

import br.com.meli.springdata01.exception.BadRequestException;
import br.com.meli.springdata01.exception.UserNotFoundException;
import br.com.meli.springdata01.model.UserBD;
import br.com.meli.springdata01.repository.IUserBdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserBdRepo repo;

    @Override
    public UserBD getUserById(long id) {
        return repo.findById(id).orElseThrow(() -> new UserNotFoundException("Usuário não encotrado!"));
    }

    @Override
    public UserBD insertiUser(UserBD userBD) {
        if (userBD.getId() > 0) {
            throw new BadRequestException("O usuário não pode ter id para inserir.");
        }
        return repo.save(userBD);
    }

    @Override
    public void deleteUser(long id) {
        repo.delete(getUserById(id));
    }

    @Override
    public List<UserBD> findAll() {
        return repo.findAll();
    }

    @Override
    public UserBD update(UserBD userBD) {
        return repo.save(userBD);
    }

    @Override
    public UserBD updateParcial(long id, Map<String, String> changes) {
        UserBD userFound = getUserById(id);
        changes.forEach((atributo, valor) -> {
            switch (atributo) {
                case "name": userFound.setName(valor); break;
                case "email": userFound.setEmail(valor); break;
            }
        });
        return repo.save(userFound);
    }

    @Override
    public UserBD findByEmail(String email) {
        return repo.findByEmail(email);
    }
}
