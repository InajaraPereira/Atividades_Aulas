package br.com.meli.springdata01.repository;

import br.com.meli.springdata01.model.UserBD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserBdRepo extends JpaRepository<UserBD, Long> {

    UserBD findByEmail(String email);


}
