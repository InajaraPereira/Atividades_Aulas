package exemplo05;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exemplo03 {

    public static void main(String[] args) {

        List<Integer> listaInteiros = Arrays.asList(1, 2, 3, 4, 5);
        listaInteiros.forEach(n -> System.out.print(n + " "));
        System.out.println();

        List<Integer> listaAlterada1 = listaInteiros.stream().map(n -> n * 2).toList();
        listaAlterada1.forEach(n -> System.out.print(n + " "));
        System.out.println();

        List<Integer> listaAlterada2 = listaInteiros.stream().filter(n -> n % 2 == 0).toList();
        listaAlterada2.forEach(n -> System.out.print(n + " "));
        System.out.println();

        Optional<Integer> resultado = listaInteiros.stream().filter(n -> n == 4).findFirst();
        System.out.println(resultado);

        listaInteiros.forEach(System.out::print);

    }
}
