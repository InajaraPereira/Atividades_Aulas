package exemplo05;

import java.util.Arrays;
import java.util.List;

public class Exemplo02 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }

        numeros.forEach(numero -> System.out.println(numero));

    }

}
