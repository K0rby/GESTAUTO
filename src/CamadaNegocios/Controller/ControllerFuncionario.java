package CamadaNegocios.Controller;

import java.util.LinkedList;
import java.util.Scanner;

public class ControllerFuncionario {

    private CamadaDados.Funcionario funcionario;
    private CamadaNegocios.DAO.FuncionarioDAO dao;
    LinkedList<CamadaDados.Funcionario> listaFuncionarios = new LinkedList<>();

    public ControllerFuncionario (CamadaDados.Funcionario funcionario) {
        this.funcionario = funcionario;
        this.dao = new CamadaNegocios.DAO.FuncionarioDAO();
    }




    public void cadastraFuncionario() {

        int c = 1;

//        while(c == 1){
//
//            Scanner dado = new Scanner(System.in);
//            System.out.println("Cadastrou o funcionario.");
//
//            System.out.println("Digite o nome do funcionário:");
//            funcionario.setNome(dado.nextLine());
//
//            System.out.println("Digite o CPF do funcionário:");
//            funcionario.setCpf(dado.nextLine());
//
//            System.out.println("Digite o telefone do funcionário:");
//            funcionario.setTelefone(dado.nextLine());
//
//            System.out.println("Digite o salário do funcionário:");
//            funcionario.setSalario(dado.nextFloat());
//
//            System.out.println("Digite o cargo do funcionário:");
//            funcionario.setCargo(dado.nextLine());
//


            dao.insert(funcionario);
            System.out.println(funcionario);
            listaFuncionarios.add(funcionario);

//            System.out.println("Deseja cadastrar outro funcionário? (1 - Sim / 0 - Não)");
//            c = dado.nextInt();
//        }

//        imprimirTodos();

    }

//    public void imprimirTodos() {
//        if (listaFuncionarios.isEmpty()) {
//            System.out.println("Nenhum funcionário cadastrado.");
//            return;
//        }
//        System.out.println("Lista de funcionários cadastrados:");
//        for (CamadaDados.Funcionario f : listaFuncionarios) {
//            System.out.println(f);
//        }
//    }



}
