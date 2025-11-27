package CamadaNegocios.DAO;


import CamadaApresentacao.CadastroFuncionarios;
import CamadaDados.Funcionario;
import CamadaNegocios.DAO.InterfaceDao.InterfaceFuncionarioDAO;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class FuncionarioDAO implements InterfaceFuncionarioDAO {

    private static final ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();


    @Override
    public void insert (Funcionario func) {
        if (func != null) {
            listaFuncionarios.add(func);
            System.out.println("Cadastrou o funcionário.");
        }
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public Optional<Funcionario> findByCpf(String cpf) {
        return listaFuncionarios.stream()
                .filter(f -> f.getCpf() != null && f.getCpf().equals(cpf))
                .findFirst();
    }

}
