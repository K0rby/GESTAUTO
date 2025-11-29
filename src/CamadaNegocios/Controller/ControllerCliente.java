package CamadaNegocios.Controller;

import CamadaDados.Cliente;

import java.util.LinkedList;
import CamadaNegocios.DAO.*;

public class    ControllerCliente {

    private final ClienteDAO dao;
    LinkedList<Cliente> listaClientes = new LinkedList<>();

    public ControllerCliente () {
        this.dao = ClienteDAO.getInstance();
    }

    public void cadastraCliente(Cliente cliente) {
            System.out.println(cliente);
            dao.insert(cliente);

            listaClientes.add(cliente);
    }

    public void imprimirTodos() {
        if (listaClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        System.out.println("Lista de clientes cadastrados:");
        for (Cliente cl : listaClientes) {
            System.out.println(cl);
        }
    }

}
