package desafioDoumento.controller;

import desafioDoumento.model.Curriculo;
import desafioDoumento.model.Livro;
import desafioDoumento.model.Relatorio;
import desafioDoumento.util.ImpressoraHp;
import desafioDoumento.util.ImpressoraMultilaser;

import java.util.*;

public class DocumentoController {

    public static void main(String[] args) {

        List<String> habilidades = Arrays.asList("Java", "Spring Boot", "SQL");
        Curriculo curriculo = new Curriculo("Maria da Silva", habilidades);
        Relatorio relatorio = new Relatorio(584, "Pedro Nascimento", "Saudações", "Joana Caldas");

        ImpressoraHp impressoraHp = new ImpressoraHp();
        ImpressoraMultilaser impressoraMultilaser = new ImpressoraMultilaser();
        impressoraHp.imprimir(curriculo);
        impressoraMultilaser.imprimir(relatorio);

        //////////////////////////////////////////

        List<Livro> listaLivros = new LinkedList<Livro>();
        listaLivros.add(0, new Livro(265, "Mateus Alves", "As Duas", "Poesia" ));
        listaLivros.add(1, new Livro(265, "Marieta", "BLAH", "Ficação" ));

        for (Livro livro: listaLivros) {
            impressoraHp.imprimir(livro);
        }

        ////////////////////////////////////////

        HashMap<Integer, Curriculo> listaCurriculos = new HashMap<>();
        listaCurriculos.put(12, curriculo);

        System.out.println(listaCurriculos.get(12));

        for (Map.Entry<Integer, Curriculo> curriculoMap: listaCurriculos.entrySet()) {
            System.out.println(curriculoMap.getKey());
            System.out.println(curriculoMap.getValue());
        }
    }
}
