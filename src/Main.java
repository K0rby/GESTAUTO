import CamadaApresentacao.CadastroCliente;
import CamadaApresentacao.CadastroFuncionarios;
import CamadaApresentacao.CadastroVeiculo;
import CamadaNegocios.Controller.ControllerFuncionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CadastroCliente cadastroCliente = new CadastroCliente("Ronnioson", "12345678900", "11999999999");
        cadastroCliente.cadCli();

        CadastroVeiculo cadastroVeiculo = new CadastroVeiculo("Toyota Corolla", "Prata", 95000.00f, "Disponível");
        cadastroVeiculo.cadVeic();

        CadastroFuncionarios cadastroFuncionarios = new CadastroFuncionarios("Raimundo", "98765432100", "11888888888", 3500.00f, "Vendedor");

        cadastroFuncionarios.cadFunc();



//        int c = 0;
//
//        while (c != 1) {
//
//            Scanner dado = new Scanner(System.in);

//            System.out.println("Digite o nome do funcionário:");
//            String nomeFuncionario = dado.nextLine();
//
//            System.out.println("Digite o CPF do funcionário:");
//            String cpfFuncionario = dado.nextLine();
//
//            System.out.println("Digite o telefone do funcionário:");
//            String telefoneFuncionario = dado.nextLine();
//
//            System.out.println("Digite o salário do funcionário:");
//            float salarioFuncionario = dado.nextFloat();
//
//            System.out.println("Digite o cargo do funcionário:");
//            String cargoFuncionario = dado.nextLine();


////            CadastroFuncionarios cadastroFuncionarios1 = new CadastroFuncionarios(nomeFuncionario, cpfFuncionario, telefoneFuncionario, salarioFuncionario, cargoFuncionario);
//
//            cadastroFuncionarios1.cadFunc();
//
//            System.out.println("Caso deseje cadastrar outro funcionário, digite 1. Para sair, digite 0:");
//            c = dado.nextInt();
    }
}

