package CamadaApresentacao;

import CamadaDados.Cliente;
import CamadaNegocios.Controller.ControllerCliente;

import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {

    private ControllerCliente clienteController;

//

    public CadastroCliente() {
        this.clienteController = new ControllerCliente(new Cliente());
    }

    public void cadCli(){
        clienteController.cadastraCliente();
    }

}