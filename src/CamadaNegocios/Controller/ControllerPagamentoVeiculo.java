package CamadaNegocios.Controller;

import CamadaDados.PagamentoVeiculo;
import CamadaDados.Veiculo;
import CamadaNegocios.DAO.PagamentoVeiculoDAO;
import CamadaNegocios.DAO.VeiculoDAO;

import java.util.Optional;
import java.util.Scanner;

public class ControllerPagamentoVeiculo {

    private Veiculo veiculo;
    private final PagamentoVeiculoDAO daoPagamentoVeiculo;
    private VeiculoDAO daoVeiculo = VeiculoDAO.getInstance();

    public ControllerPagamentoVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
        this.daoPagamentoVeiculo = PagamentoVeiculoDAO.getInstance();
        this.daoVeiculo = VeiculoDAO.getInstance();
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
        if (daoPagamentoVeiculo.getListaPagamentos().isEmpty()) {
            System.out.println("Nenhum pagamento de veículo cadastrado.");
            return;
        }
        System.out.println("Lista de pagamentos de veículos cadastrados:");
        for (PagamentoVeiculo p : daoPagamentoVeiculo.getListaPagamentos()) {
            System.out.println(p);
        }
    }
}