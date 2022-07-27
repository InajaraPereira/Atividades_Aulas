package br.com.meli.desafionumerosromanos.repository;

import br.com.meli.desafionumerosromanos.model.Numero;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Repository
public class NumerosRepository {

    private final String linkFile = "src/main/resources/numeros.json";

    public String getNumero(int numero) {
        ObjectMapper mapper = new ObjectMapper();
        List<Numero> lista = null;

        try {
            lista = Arrays.asList(mapper.readValue(new File(linkFile), Numero[].class));
            for (Numero nr : lista) {
                if (nr.getNumeroOrdinal() == (numero)) {
                    return nr.getNumeroRomano();
                }}
        } catch (Exception ex) {

        }
        return null;
    }
}
