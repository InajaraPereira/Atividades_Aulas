package exemplo02;

public class AppRelogio {
    public static void main(String[] args) {

        Relogio relogio = new Relogio(12, 64, 11);
        relogio.mostrarHora();

        relogio.alterarHora(77);
        relogio.mostrarHora();

    }
}
