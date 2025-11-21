import CamadaApresentacao.CadastroCliente;
import CamadaApresentacao.CadastroFuncionarios;
import CamadaApresentacao.CadastroVeiculo;
import CamadaDados.Cliente;
import CamadaDados.Funcionario;
import CamadaDados.Veiculo;
import CamadaNegocios.Controller.ContollerVenda;
import CamadaNegocios.Controller.ControllerFuncionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int b = 1;

        while (b == 1) {
            Scanner dado = new Scanner(System.in);
            System.out.println("Digite: \n1 para cadastrar cliente, \n2 para cadastrar veículo, \n3 para cadastrar funcionário, \n4 para cadastrar venda, \n0 para sair:");

            b = dado.nextInt();

            if (b == 1) {
                CadastroCliente cadastroCliente = new CadastroCliente();
                cadastroCliente.cadCli();
                b = 1;
            } else if (b == 2) {
                CadastroVeiculo cadastroVeiculo = new CadastroVeiculo();
                cadastroVeiculo.cadVeic();
                b = 1;
            } else if (b == 3) {
                CadastroFuncionarios cadastroFuncionarios = new CadastroFuncionarios();
                cadastroFuncionarios.cadFunc();
                b = 1;
            } else if (b == 4) {

                ContollerVenda vendaController = new ContollerVenda(new Veiculo(), new Cliente(), new Funcionario());
                vendaController.cadastraVenda();
                b = 1;
            }

            else if (b == 0) {
                System.out.println("Saindo do sistema.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                b = 1;
            }
        }


    }
}

