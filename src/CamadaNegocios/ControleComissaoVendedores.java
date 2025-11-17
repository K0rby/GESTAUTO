package CamadaNegocios;

import CamadaDados.Vendas;
import CamadaDados.Pagamento;

public class ControleComissaoVendedores {


    public double calcularComissao(Vendas venda, Pagamento pagamento) {
        double valorVenda = venda.getValor();
        double desconto = pagamento.getDesconto();
        double encargo = pagamento.getEncargo();

        double valorLiquido = valorVenda - desconto + encargo;
        double comissao = valorLiquido * 0.05;

        return comissao;
    }

}