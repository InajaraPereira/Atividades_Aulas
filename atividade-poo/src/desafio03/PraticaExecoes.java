package desafio03;

public class PraticaExecoes {

    private int a = 0;
    private int b = 300;

    public void calculaRazao(){
        try{
            int razao = this.b / this.a;
        }catch (IllegalArgumentException e){
            System.out.println("Não pode ser dividido por zero");
        }finally {
            System.out.println("Programa finalizado");
        }
    }
}
