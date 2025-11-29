import CamadaApresentacao.CadastroCliente;
import CamadaApresentacao.CadastroFuncionarios;
import CamadaApresentacao.CadastroVeiculo;
import CamadaDados.Cliente;
import CamadaDados.Funcionario;
import CamadaDados.Veiculo;
import CamadaNegocios.Controller.ContollerPagamentoFuncionario;
import CamadaNegocios.Controller.ContollerVenda;
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
                System.out.println("""
                                   Digite: 
                                   1 - para cadastro; 
                                   2 - para gerar relat\u00f3rios; 
                                   0 - para sair:""");

                d = dado.nextInt();
                if (d == 1){

                    System.out.println("<=================== Terminal de Cadastros ===================>");

                    System.out.println("""
                                       Digite: 
                                       1 - para cadastrar cliente; 
                                       2 - para cadastrar ve\u00edculo; 
                                       3 - para cadastrar funcion\u00e1rio; 
                                       4 - para cadastrar venda; 
                                       5 - para cadastrar pagamento de funcionario; 
                                       6 - para cadastrar o pagamento de um veiculo; 
                                       7 - Voltar ao menu anterior.
                                       0 - para sair:""");

                    b = dado.nextInt();

                    switch (b) {
                        case 1 -> {
                            cadastroCliente.cadCli();
                            b = 1;
                        }
                        case 2 -> {
                            cadastroVeiculo.cadVeic();
                            b = 1;
                        }
                        case 3 -> {
                            cadastroFuncionarios.cadFunc();
                            b = 1;
                        }
                        case 4 -> {
                            vendaController.cadastraVenda();
                            b = 1;
                        }
                        case 5 -> {
                            pagamentoFuncionarioController.cadastrarPagamentoFuncionario();
                            b = 1;
                        }
                        case 6 -> {
                            pagamentoVeiculoController.cadastrarPagamentoVeiculo();
                            b = 1;
                        }
                        case 0 -> System.out.println("Saindo do sistema.");
                        case 7 -> {
                            System.out.println("Voltar ao menu anterior.");
                            d = 1;
                        }
                        default -> {
                            System.out.println("Opção inválida. Tente novamente.");
                            b = 1;
                        }
                    }
                } else if (d == 2) {

                    System.out.println("<=================== Terminal de Relatórios ===================>");

                    System.out.println("""
                                       Digite: 
                                       1 - para gerar relat\u00f3rio de clientes, 
                                       2 - para gerar relat\u00f3rio de ve\u00edculos, 
                                       3 - para gerar relat\u00f3rio de funcion\u00e1rios, 
                                       4 - para gerar relat\u00f3rio de vendas
                                       5 - para gerar relat\u00f3rio de pagamentos de funcion\u00e1rios, 
                                       6 - para gerar relat\u00f3rio de pagamentos de ve\u00edculos, 
                                       7 - Voltar ao menu anterior.
                                       0 - para sair:""");

                    d = dado.nextInt();

                    switch (d) {
                        case 1 -> {
                            cadastroCliente.imprimirClientes();
                            d = 1;
                        }
                        case 2 -> {
                            cadastroVeiculo.imprimirVeiculos();
                            d = 1;
                        }
                        case 3 -> {
                            cadastroFuncionarios.imprimirFuncionarios();
                            d = 1;
                        }
                        case 4 -> {
                            vendaController.imprimirVendas();
                            d = 1;
                        }
                        case 5 -> {
                            pagamentoFuncionarioController.imprimirPagamentosTodos();
                            d = 1;
                        }
                        case 6 -> {
                            pagamentoVeiculoController.imprimirTodos();
                            d = 1;
                        }
                        case 0 -> System.out.println("Saindo do sistema.");
                        case 7 -> {
                            System.out.println("Voltando ao menu anterior.");
                            d = 1;
                        }
                        default -> {
                            System.out.println("Opção inválida. Tente novamente.");
                            d = 2;
                        }
                    }
                }
            }

            }

    }
}


