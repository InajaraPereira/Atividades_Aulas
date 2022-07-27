package br.com.meli.springdata01.controller;


import br.com.meli.springdata01.model.UserBD;
import br.com.meli.springdata01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserBdController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<UserBD> buscaPorId(@PathVariable long id) {
        return ResponseEntity.ok(service.getUserById(id));
    }

    @PostMapping()
    public ResponseEntity<UserBD> salvar(@Valid @RequestBody UserBD userbd) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.insertiUser(userbd));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable long id) {
        service.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<UserBD>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @PutMapping
    public ResponseEntity<UserBD> update(@Valid @RequestBody UserBD userbd) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.update(userbd));
    }

    @PatchMapping("/{id}")
    public  ResponseEntity<UserBD> updateParcial(@PathVariable long id, @RequestBody Map<String, String> changes){
        return  ResponseEntity.ok(service.updateParcial(id, changes));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<UserBD> findByEmail(@PathVariable String email){
        return ResponseEntity.ok(service.findByEmail(email));
    }

}
