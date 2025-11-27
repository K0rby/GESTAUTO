package CamadaNegocios.DAO.InterfaceDao;

import CamadaDados.Funcionario;

import java.util.ArrayList;

public interface InterfaceFuncionarioDAO {

    void insert(Funcionario funcionario);
    ArrayList<Funcionario> getListaFuncionarios();
    java.util.Optional<Funcionario> findByCpf(String cpf);
}
