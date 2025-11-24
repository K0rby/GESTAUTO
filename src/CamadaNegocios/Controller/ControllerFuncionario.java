package CamadaNegocios.Controller;

import CamadaDados.Funcionario;

import java.util.LinkedList;
import java.util.Scanner;

public class ControllerFuncionario {

    private CamadaDados.Funcionario funcionario;
    private CamadaNegocios.DAO.FuncionarioDAO dao;
    LinkedList<Funcionario> listaFuncionarios = new LinkedList<>();

    public ControllerFuncionario (CamadaDados.Funcionario funcionario) {
        this.funcionario = funcionario;
        this.dao = new CamadaNegocios.DAO.FuncionarioDAO();
    }




    public void cadastraFuncionario() {
        Scanner dado = new Scanner(System.in);
        int c = 1;

        while(c == 1){

            funcionario = new Funcionario().preencher();

            System.out.println(funcionario);
            dao.insert(funcionario);

            listaFuncionarios.add(funcionario);

            System.out.println("Deseja cadastrar outro funcionário? (1 - Sim / 0 - Não)");
            c = dado.nextInt();
        }




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






