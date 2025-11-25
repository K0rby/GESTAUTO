package CamadaApresentacao;

import CamadaDados.Cliente;
import CamadaNegocios.Controller.ControllerCliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroCliente {

    private ControllerCliente clienteController;
    private  Cliente cliente;

//

    public CadastroCliente() {
        this.clienteController = new ControllerCliente();
    }

    public void cadCli(){
        this.cliente = cadastraCliente();
        clienteController.cadastraCliente(this.cliente);
    }

    public void imprimirClientes(){
        clienteController.imprimirTodos();
    }

    public Cliente cadastraCliente() {
        Cliente c1 = new Cliente();
        Scanner dado = new Scanner(System.in);
        int c = 1;

        while(c == 1){

            c1 = preencher();

            System.out.println("Deseja cadastrar outro cliente? (1 - Sim / 0 - Não)");
            c = dado.nextInt();

            return c1;
        }

        return c1;
    }

    public Cliente preencher(){
        Scanner dado = new Scanner(System.in);

        System.out.println("Informe o nome do cliente:");
        String nome = dado.nextLine();


        System.out.println("Informe o CPF do cliente:");
        String cpf = dado.nextLine();


        System.out.println("Informe o telefone do cliente:");
        String telefone = dado.nextLine();

        return new Cliente(nome, cpf, telefone);
    }

}