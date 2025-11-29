package CamadaNegocios.DAO.InterfaceDao;

import CamadaDados.Cliente;

import java.util.ArrayList;
import java.util.Optional;

public interface InterfaceClienteDAO {

    void insert(Cliente cliente);
    ArrayList<Cliente> getListaClientes();
    Optional<Cliente> findByCpf(String cpf);
}

