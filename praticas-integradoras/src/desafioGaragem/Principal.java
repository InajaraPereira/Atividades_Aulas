package desafioGaragem;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(new Veiculo("Ford", "Fiesta", 1.000));
        listaVeiculos.add(new Veiculo("Ford", "Focus", 1.200));
        listaVeiculos.add(new Veiculo("Ford", "Explorer", 2.500));
        listaVeiculos.add(new Veiculo("Fiat", "Uno", 0.500));
        listaVeiculos.add(new Veiculo("Fiat", "Cronos", 1.000));
        listaVeiculos.add(new Veiculo("Fiat", "Torino", 1.250));
        listaVeiculos.add(new Veiculo("Chevrolet", "Aveo", 1.250));
        listaVeiculos.add(new Veiculo("Chevrolet", "Spin", 2.500));
        listaVeiculos.add(new Veiculo("Toyota", "Corola", 1.200));
        listaVeiculos.add(new Veiculo("Toyota", "Fortuner", 3.000));
        listaVeiculos.add(new Veiculo("Renault", "Logan", 9.50));

        Garagem garagem = new Garagem(1L, listaVeiculos);

        //Lista Ordenada Por Preço
        listaVeiculos.stream().mapToDouble(Veiculo::getPreco).sorted().forEach(System.out::println);

        //Lista Ordenada Por Marca
        listaVeiculos.stream().sorted((veiculo1, veiculo2) -> veiculo1.getMarca().compareTo(veiculo2.getMarca()))
                .forEach(v -> System.out.println(v.getMarca()));

        //Menores que 1000
        List<Veiculo> listaPrecosMenores = listaVeiculos.stream().filter(veiculo -> veiculo.getPreco() < 1.000).toList();
        listaPrecosMenores.forEach((v) -> System.out.println(v.getPreco()));

        //Maiores ou igual a 1000
        List<Veiculo> listaPrecosMaiores = listaVeiculos.stream().filter(veiculo -> veiculo.getPreco() >= 1.000).toList();
        listaPrecosMaiores.forEach((v) -> System.out.println(v.getPreco()));

        //Falta calcular a media!
        System.out.format("%.2f", listaVeiculos.stream().mapToDouble(Veiculo::getPreco).average().orElse(0.0));

    }
}
