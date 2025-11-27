package CamadaNegocios.Controller;

import CamadaApresentacao.CadastroFuncionarios;
import CamadaDados.Funcionario;
import CamadaDados.PagamentoFuncionario;
import CamadaNegocios.DAO.FuncionarioDAO;
import CamadaNegocios.DAO.PagamentoFuncionarioDAO;

import java.util.Optional;
import java.util.Scanner;

public class ContollerPagamentoFuncionario {

    private Funcionario funcionario;
    private PagamentoFuncionarioDAO daoPagamentoFuncionario;
    private FuncionarioDAO daoFuncionario = new FuncionarioDAO();

    public ContollerPagamentoFuncionario (Funcionario funcionario) {
        this.funcionario = funcionario;
        this.daoPagamentoFuncionario = new PagamentoFuncionarioDAO();
        this.daoFuncionario = new FuncionarioDAO();
    }


    public void cadastrarPagamentoFuncionario() {
        Scanner dado = new Scanner(System.in);
        int c = 1;

        while (c == 1) {
            System.out.println("Iniciando cadastro de pagamento do funcionario:");
            System.out.println("Informe o CPF do funcionario:");
            String cpfFuncionario = dado.nextLine();

            System.out.println("Informe a porcentagem de desconto no salário: ");
            double porcentagemDesconto = dado.nextDouble();
            dado.nextLine();

            System.out.println("Informe o percentagem de bonus no salário: ");
            double porcentagemBonus = dado.nextDouble();
            dado.nextLine();

            Optional<Funcionario> optFunc = daoFuncionario.findByCpf(cpfFuncionario);

            if (optFunc.isEmpty()) {
                System.out.println("Funcionario nao encontrado.");
            } else {
                funcionario = optFunc.get();

                double salario = funcionario.getSalario();
                double desconto = salario * (porcentagemDesconto/100);
                double bonus = salario * (porcentagemBonus/100);
                double pagamentoLiquido = (salario + bonus) - desconto;

                PagamentoFuncionario pagamento = new PagamentoFuncionario(pagamentoLiquido ,desconto, bonus);
                daoPagamentoFuncionario.insert(pagamento);

                System.out.printf("Pagamento cadastrado: R$ %.2f para %s%n", pagamentoLiquido, funcionario.getNome());
            }

            System.out.println("Deseja cadastrar outro pagamento? (1 - Sim / 0 - Não)");
            if (dado.hasNextInt()) {
                c = dado.nextInt();
                dado.nextLine();
            } else {
                c = 0;
                dado.nextLine();
            }
        }

    }

    public void imprimirPagamentosTodos() {
        var lista = daoPagamentoFuncionario.getListaPagamentos();
        if (lista == null || lista.isEmpty()) {
            System.out.println("Nenhum pagamento cadastrado.");
            return;
        }
        System.out.println("Pagamentos cadastrados:");
        for (var pagamento : lista) {
            System.out.println(pagamento);
        }
    }

}
