package CamadaNegocios.DAO;

import CamadaDados.Cliente;
import CamadaNegocios.DAO.InterfaceDao.InterfaceClienteDAO;

import java.util.ArrayList;
import java.util.Optional;

public class ClienteDAO implements InterfaceClienteDAO {

    
    private static ClienteDAO instance;

    
    private static final ArrayList<Cliente> listaClientes = new ArrayList<>();

    
    private ClienteDAO() {}

    
    public static ClienteDAO getInstance() {
        if (instance == null) {
            instance = new ClienteDAO();
        }
        return instance;
    }

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

    @Override
    public Optional<Cliente> findByCpf(String cpf) {
        return listaClientes.stream()
                .filter(c -> c.getCpf() != null && c.getCpf().equals(cpf))
                .findFirst();
    }
}
