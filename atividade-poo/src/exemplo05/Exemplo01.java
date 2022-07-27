package exemplo05;

public class Exemplo01 {
    public static void main(String[] args) {

        //Integer integer = new Integer(10);
        Integer integer = 10;
        int valor = integer.intValue();
        int numero = Integer.parseInt("10");

        System.out.println(valor == numero);
        System.out.println(integer.equals(valor));

    }
}
