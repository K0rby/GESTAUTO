package CamadaNegocios.Controller;

import CamadaDados.Funcionario;
import CamadaNegocios.DAO.FuncionarioDAO;

import java.util.LinkedList;
import java.util.Scanner;

public class ControllerFuncionario {

    private Funcionario funcionario;
    private FuncionarioDAO dao;
    LinkedList<Funcionario> listaFuncionarios = new LinkedList<>();

    public ControllerFuncionario () {
        this.dao = new FuncionarioDAO();
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
        for (CamadaDados.Funcionario f : listaFuncionarios) {
            System.out.println(f);
        }
    }


    }











