package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

    public static void main(String[] args) {

        Assento assento = new Assento("4B");
        Cliente cliente = new Cliente("Marcela", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirT().incluir(assento).incluir(cliente).fecharT().fechar();
    }
}
