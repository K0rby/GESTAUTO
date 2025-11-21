package CamadaNegocios.Controller;

import CamadaDados.Cliente;
import CamadaDados.Funcionario;
import CamadaDados.Veiculo;
import CamadaDados.Vendas;
import CamadaNegocios.DAO.ClienteDAO;
import CamadaNegocios.DAO.FuncionarioDAO;
import CamadaNegocios.DAO.VeiculoDAO;
import CamadaNegocios.DAO.VendasDAO;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ContollerVenda {

    private Veiculo veiculo;
    private Cliente cliente;
    private Funcionario funcionario;
    private VendasDAO dao;
    private Vendas vendas;

    private VeiculoDAO daoVeiculo;
    private ClienteDAO daoCliente;
    private FuncionarioDAO daoFuncionario;
    private VendasDAO daoVendas;

    public ContollerVenda(Veiculo veiculo, Cliente cliente, Funcionario funcionario) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.dao = new VendasDAO();

        this.daoVeiculo = new VeiculoDAO();
        this.daoCliente = new ClienteDAO();
        this.daoFuncionario = new FuncionarioDAO();
        this.daoVendas = new VendasDAO();
    }

    public void cadastraVenda(){
        Scanner dado = new Scanner(System.in);
        int c = 1;

        while(c == 1){

            System.out.println("Iniciando cadastro de venda...");

            System.out.println("Infome o cpf do cliente: ");
            String cpfCliente = dado.next();

            System.out.println("Informe o cpf do funcionario: ");
            String cpfFuncionario = dado.next();

            System.out.println("Informe a placa do veiculo: ");
            String placaVeiculo = dado.next();


            Optional<Funcionario> optFunc = daoFuncionario.findByCpf(cpfFuncionario);
            Optional<Cliente> optCli = daoCliente.findByCpf(cpfCliente);
            Optional<Veiculo> optVeic = daoVeiculo.findByPlaca(placaVeiculo);

            if (optCli.isEmpty()) {
                System.out.println("Cliente não encontrado. Venda não cadastrada.");
            } else if (optFunc.isEmpty()) {
                System.out.println("Funcionário não encontrado. Venda não cadastrada.");
            } else if (optVeic.isEmpty()) {
                System.out.println("Veículo não encontrado. Venda não cadastrada.");
            } else {
                this.cliente = optCli.get();
                this.funcionario = optFunc.get();
                this.veiculo = optVeic.get();

                Vendas venda = new Vendas(cliente.getCpf(), veiculo.getPlaca(), funcionario.getNome(), veiculo.getValor());
                dao.insert(venda);
                System.out.println("Venda cadastrada com sucesso.");
            }

            System.out.println("Deseja cadastrar outra venda? (1 - Sim / 0 - Não)");
            c = dado.nextInt();
        }

        imprimirVendas();
    }

    public void imprimirVendas() {
        List<Vendas> lista = daoVendas.getListaVendas();
        if (lista == null || lista.isEmpty()) {
            System.out.println("Nenhuma venda cadastrada.");
            return;
        }

        System.out.println("=== Vendas cadastradas ===");
        int i = 1;
        for (Vendas v : lista) {
            if (v == null) continue;

            String cpfCliente = v.getCliente();
            String placa = v.getVeiculo();
            String vendedor = v.getFuncionario();
            double valor = v.getValor();

            System.out.printf("%d) Cliente CPF: %s | Veículo (placa): %s | Vendedor: %s | Valor: %.2f%n",
                    i++, cpfCliente, placa, vendedor, valor);
        }
    }


}
