package CamadaNegocios;

import CamadaDados.Vendas;

public class ControledeVendas {

    public void processarVenda(Vendas venda) {
        System.out.println("Processando venda do veículo: " + venda.getVeiculo());
        System.out.println("Cliente: " + venda.getCliente());
        System.out.println("Valor: R$" + venda.getValor());
        System.out.println("Venda registrada com sucesso!");
    }


}