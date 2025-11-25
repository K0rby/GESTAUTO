package CamadaNegocios.Controller;

import CamadaDados.Cliente;
import CamadaDados.Funcionario;
import com.sun.source.tree.WhileLoopTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import CamadaNegocios.DAO.*;

public class    ControllerCliente {

    private Cliente cliente;
    private ClienteDAO dao;
    LinkedList<Cliente> listaClientes = new LinkedList<>();

    public ControllerCliente () {
        this.dao = new ClienteDAO();
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
