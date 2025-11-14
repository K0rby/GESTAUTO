package CamadaApresentacao;

import CamadaDados.Cliente;

import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {

    private List<Cliente> clientes = new ArrayList<Cliente>();


    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }


    public List<Cliente> getClientes() {
        return clientes;
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }



}