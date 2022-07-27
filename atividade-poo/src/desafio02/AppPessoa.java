package desafio02;

public class AppPessoa {
    public static void main(String[] args) {

        Pessoa pessoa01 = new Pessoa();
        Pessoa pessoa02 = new Pessoa("1P", "Maria", 35);
        Pessoa pessoa03 = new Pessoa("1P", "Maria", 35, 75.3, 1.68);

        System.out.println(pessoa03);
    }
}
