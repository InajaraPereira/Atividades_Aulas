package exemplo04;

public class ExibirTela implements Exibir, ExibirMais{

    @Override
    public String show() {
        return "Exibindo na tela";
    }

    @Override
    public void exibirColorido() {

    }
}
