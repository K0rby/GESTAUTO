package CamadaNegocios.Controller;

import CamadaDados.Veiculo;
import CamadaNegocios.DAO.PagamentoVeiculoDAO;
import CamadaNegocios.DAO.VeiculoDAO;

import java.util.Optional;
import java.util.Scanner;

public class ControllerPagamentoVeiculo {

    private Veiculo veiculo;
    private PagamentoVeiculoDAO daoPagamentoVeiculo;
    private VeiculoDAO daoVeiculo = new VeiculoDAO();

    public ControllerPagamentoVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
        this.daoPagamentoVeiculo = new PagamentoVeiculoDAO();
        this.daoVeiculo = new VeiculoDAO();
    }

    public void cadastrarPagamentoVeiculo() {
        Scanner dado = new Scanner(System.in);
        int c = 1;

        while (c == 1) {
            System.out.println("Iniciando cadastro de pagamento de veículo.");
            System.out.println("Informe a placa do veículo:");
            String placaVeiculo = dado.nextLine();

            System.out.println("Informe a porcentagem de desconto no valor do veículo: ");
            double porcentagemDesconto = dado.nextDouble();
            dado.nextLine();

            System.out.println("Informe a porcentagem de imposto sobre o valor do veículo: ");
            double porcentagemImposto = dado.nextDouble();
            dado.nextLine();

            Optional<Veiculo> optVeiculo = daoVeiculo.findByPlaca(placaVeiculo);

            if (optVeiculo.isEmpty()) {
                System.out.println("Veículo não encontrado.");
            } else {
                veiculo = optVeiculo.get();

                double valor = veiculo.getValor();
                double desconto = valor * (porcentagemDesconto / 100);
                double imposto = valor * (porcentagemImposto / 100);
                double pagamentoLiquido = (valor + imposto) - desconto;

                CamadaDados.PagamentoVeiculo pagamento = new CamadaDados.PagamentoVeiculo(pagamentoLiquido, desconto, imposto);
                daoPagamentoVeiculo.insert(pagamento);

                System.out.printf("Pagamento cadastrado: R$ %.2f para o veículo %s%n", pagamentoLiquido, veiculo.getPlaca());
            }

        }

    }
    public void imprimirTodos () {
        if (CamadaNegocios.DAO.PagamentoVeiculoDAO.getListaPagamentos().isEmpty()) {
            System.out.println("Nenhum pagamento de veículo cadastrado.");
            return;
        }
        System.out.println("Lista de pagamentos de veículos cadastrados:");
        for (CamadaDados.PagamentoVeiculo p : CamadaNegocios.DAO.PagamentoVeiculoDAO.getListaPagamentos()) {
            System.out.println(p);
        }
    }
}