package CamadaNegocios.DAO;

import CamadaDados.Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ClienteDAO {

    private static final List<Cliente> listaClientes = new ArrayList<>();

    public void insert (CamadaDados.Cliente cli) {
        if (cli != null) {
            listaClientes.add(cli);
        }

        System.out.println("Cadastrou o cliente.");
    }

    public List<Cliente> getListaClientes() {
        return Collections.unmodifiableList(listaClientes);
    }

    public Optional<Cliente> findByCpf(String cpf) {
        return listaClientes.stream()
                .filter(c -> c.getCpf() != null && c.getCpf().equals(cpf))
                .findFirst();
    }

}
