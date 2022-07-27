package desafioBanco.Cotroller;

import desafioBanco.Entity.Cliente;

public class AppBanco {

    public static void main(String[] args) {
        
        Cliente cliente01 = new Cliente(1L, "João Silva", 987654, 1);

        BancoController bancoController = new BancoController();
        bancoController.fazerDeposito(cliente01);
        
    }
}
