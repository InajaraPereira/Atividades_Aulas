package exemplo02;

public class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        if (hora > 0 && hora < 24) {
            this.hora = hora;
        }
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void alterarHora(int novaHora) {
        if (novaHora > 0 && novaHora < 24) {
            this.hora = novaHora;
        }
    }

    void mostrarHora() {
        System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo);
    }
}
