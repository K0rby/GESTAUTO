package CamadaNegocios.Controller;

import CamadaDados.Cliente;
import CamadaDados.Funcionario;
import com.sun.source.tree.WhileLoopTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class    ControllerCliente {

    private Cliente cliente;
    private CamadaNegocios.DAO.ClienteDAO dao;
    LinkedList<Cliente> listaClientes = new LinkedList<>();

    public ControllerCliente (Cliente cliente) {
        this.cliente = cliente;
        this.dao = new CamadaNegocios.DAO.ClienteDAO();
    }

    public void cadastraCliente() {
        Scanner dado = new Scanner(System.in);
        int c = 1;

        while(c == 1){

            cliente = new Cliente().preencher();

            System.out.println(cliente);
            dao.insert(cliente);

            listaClientes.add(cliente);

            System.out.println("Deseja cadastrar outro cliente? (1 - Sim / 0 - Não)");
            c = dado.nextInt();
        }


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
