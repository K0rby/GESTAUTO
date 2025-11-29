package CamadaNegocios.Controller;

import CamadaDados.Funcionario;
import CamadaNegocios.DAO.FuncionarioDAO;

import java.util.LinkedList;

public class ControllerFuncionario {

    private final FuncionarioDAO dao;
    LinkedList<Funcionario> listaFuncionarios = new LinkedList<>();

    public ControllerFuncionario () {
        this.dao = FuncionarioDAO.getInstance();
    }

    public void cadastraFuncionario(Funcionario funcionario) {
        System.out.println(funcionario);
        dao.insert(funcionario);
        listaFuncionarios.add(funcionario);

        }


    public void imprimirTodos() {
        if (listaFuncionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        System.out.println("Lista de funcionários cadastrados:");
        for (Funcionario f : listaFuncionarios) {
            System.out.println(f);
        }
    }


    }











