package CamadaApresentacao;

import CamadaDados.Cliente;
import CamadaNegocios.Controller.ControllerCliente;

import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {

    private ControllerCliente clienteController;

    public CadastroCliente(String nomeCliente, String cpfCliente, String telefoneCliente) {
        this.clienteController = new ControllerCliente(new Cliente(nomeCliente, cpfCliente, telefoneCliente));
    }

    public void cadCli(){
        clienteController.cadastraCliente();
    }

}