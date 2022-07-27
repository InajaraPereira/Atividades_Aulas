package br.com.meli.desafionumerosromanos.controller;

import br.com.meli.desafionumerosromanos.service.NumerosRomanosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numeros")
public class NumerosRomanosController {

    @Autowired
    private NumerosRomanosService service;

    @GetMapping("/{numeros}")
    public ResponseEntity<String> getByNumeros(@PathVariable int numeros){
        return ResponseEntity.ok(service.getByNumero(numeros));
    }
}
