package desafio02;

public class Pessoa {

    private String id;
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa() {
    }

    public Pessoa(String id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String id, String nome, int idade, double peso, double altura) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int calculaIMC(double peso, double altura) {
        double imc = peso / (Math.pow(altura, 2));
        if (imc < 20) {
            return -1;
        } else if (imc > 25) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean ehMaiorIdade(int idade) {
        if (idade > 18) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                ", imc= " + calculaIMC(peso, altura) +
                ", ehmaiordeidade=" + ehMaiorIdade(idade) +
                '}';
    }

}
