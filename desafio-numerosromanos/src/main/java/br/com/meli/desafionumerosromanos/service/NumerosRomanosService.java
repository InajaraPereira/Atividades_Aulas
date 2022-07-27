package br.com.meli.desafionumerosromanos.service;

import br.com.meli.desafionumerosromanos.repository.NumerosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumerosRomanosService implements INumerosRomanosService{

    @Autowired
    private NumerosRepository repo;

    @Override
    public String getByNumero(int numero) {
        return repo.getNumero(numero);
    }
}
