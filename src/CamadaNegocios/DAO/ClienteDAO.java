package CamadaNegocios.DAO;

import CamadaDados.Cliente;
import CamadaNegocios.DAO.InterfaceDao.InterfaceClienteDAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ClienteDAO implements InterfaceClienteDAO {

    private static final ArrayList<Cliente> listaClientes = new ArrayList<>();

    @Override
    public void insert(Cliente cli) {
        if (cli != null) {
            listaClientes.add(cli);
            System.out.println("Cadastrou o cliente.");
        }
    }

    @Override
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public Optional<Cliente> findByCpf(String cpf) {
        return listaClientes.stream()
                .filter(c -> c.getCpf() != null && c.getCpf().equals(cpf))
                .findFirst();
    }

}
