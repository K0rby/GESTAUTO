package CamadaNegocios.DAO;


import CamadaDados.Funcionario;
import CamadaNegocios.DAO.InterfaceDao.InterfaceFuncionarioDAO;

import java.util.ArrayList;
import java.util.Optional;

public class FuncionarioDAO implements InterfaceFuncionarioDAO {
    private static FuncionarioDAO instance;
    private FuncionarioDAO() {}
     public static FuncionarioDAO getInstance() {
        if (instance == null) {
            instance = new FuncionarioDAO();
        }
        return instance;
    }

    private static final ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();


    @Override
    public void insert (Funcionario func) {
        if (func != null) {
            listaFuncionarios.add(func);
            System.out.println("Cadastrou o funcionário.");
        }
    }

    @Override
    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    @Override
    public Optional<Funcionario> findByCpf(String cpf) {
        return listaFuncionarios.stream()
                .filter(f -> f.getCpf() != null && f.getCpf().equals(cpf))
                .findFirst();
    }

}
