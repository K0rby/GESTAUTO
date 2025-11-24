import CamadaApresentacao.CadastroCliente;
import CamadaApresentacao.CadastroFuncionarios;
import CamadaApresentacao.CadastroVeiculo;
import CamadaDados.Cliente;
import CamadaDados.Funcionario;
import CamadaDados.Veiculo;
import CamadaNegocios.Controller.ContollerPagamentoFuncionario;
import CamadaNegocios.Controller.ContollerVenda;
import CamadaNegocios.Controller.ControllerFuncionario;
import CamadaNegocios.Controller.ControllerPagamentoVeiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        CadastroCliente cadastroCliente = new CadastroCliente();
        CadastroVeiculo cadastroVeiculo = new CadastroVeiculo();
        CadastroFuncionarios cadastroFuncionarios = new CadastroFuncionarios();
        ContollerVenda vendaController = new ContollerVenda(new Veiculo(), new Cliente(), new Funcionario());
        ContollerPagamentoFuncionario pagamentoFuncionarioController = new ContollerPagamentoFuncionario(new Funcionario());
        ControllerPagamentoVeiculo pagamentoVeiculoController = new ControllerPagamentoVeiculo(new Veiculo());

        int b = 1;
        int d = 1;

        while (b == 1) {

            while (d == 1){
                System.out.println("\n<=================== Gest Auto ===================>\n");
                System.out.println("Bem vindo ao sistema da concesionária, escolha uma das opções abaixo para continuar a operação:");
                System.out.println("Digite: \n1 - para cadastro; \n2 - para gerar relatórios; \n0 - para sair:");
                d = dado.nextInt();
                if (d == 1){

                    System.out.println("<=================== Terminal de Cadastros ===================>");

                    System.out.println("Digite: " +
                            "\n1 - para cadastrar cliente; " +
                            "\n2 - para cadastrar veículo; " +
                            "\n3 - para cadastrar funcionário; " +
                            "\n4 - para cadastrar venda; " +
                            "\n5 - para cadastrar pagamento de funcionario; " +
                            "\n6 - para cadastrar o pagamento de um veiculo; " +
                            "\n7 - Voltar ao menu anterior." +
                            "\n0 - para sair:");

                    b = dado.nextInt();

                    if (b == 1) {
                        cadastroCliente.cadCli();
                        b = 1;
                    } else if (b == 2) {
                        cadastroVeiculo.cadVeic();
                        b = 1;
                    } else if (b == 3) {
                        cadastroFuncionarios.cadFunc();
                        b = 1;
                    } else if (b == 4) {
                        vendaController.cadastraVenda();
                        b = 1;
                    } else if (b == 5) {
                        pagamentoFuncionarioController.cadastrarPagamentoFuncionario();
                        b = 1;
                    } else if (b == 6) {
                        pagamentoVeiculoController.cadastrarPagamentoVeiculo();
                        b = 1;
                    } else if (b == 0) {
                        System.out.println("Saindo do sistema.");
                    } else if (b == 7) {
                        System.out.println("Voltar ao menu anterior.");
                        d = 1;
                    } else {
                        System.out.println("Opção inválida. Tente novamente.");
                        b = 1;
                    }
                } else if (d == 2) {

                    System.out.println("<=================== Terminal de Relatórios ===================>");

                    System.out.println("Digite: " +
                            "\n1 - para gerar relatório de clientes, " +
                            "\n2 - para gerar relatório de veículos, " +
                            "\n3 - para gerar relatório de funcionários, " +
                            "\n4 - para gerar relatório de vendas" +
                            "\n5 - para gerar relatório de pagamentos de funcionários, " +
                            "\n6 - para gerar relatório de pagamentos de veículos, " +
                            "\n7 - Voltar ao menu anterior." +
                            "\n0 - para sair:");

                    d = dado.nextInt();

                    if (d == 1) {
                        cadastroCliente.imprimirClientes();
                        d = 1;
                    } else if (d == 2) {
                        cadastroVeiculo.imprimirVeiculos();
                        d = 1;
                    } else if (d == 3) {
                        cadastroFuncionarios.imprimirFuncionarios();
                        d = 1;
                    } else if (d == 4) {
                        vendaController.imprimirVendas();
                        d = 1;
                    } else if (d == 5) {
                        pagamentoFuncionarioController.imprimirPagamentosTodos();
                        d = 1;
                    } else if (d == 6) {
                        pagamentoVeiculoController.imprimirTodos();
                        d = 1;
                    } else if (d == 0) {
                        System.out.println("Saindo do sistema.");
                    } else if (d == 7) {
                        System.out.println("Voltando ao menu anterior.");
                        d = 1;
                    } else {
                        System.out.println("Opção inválida. Tente novamente.");
                        d = 2;
                    }
                }
            }

            }





    }
}


