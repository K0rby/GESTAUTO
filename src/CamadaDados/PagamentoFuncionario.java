package CamadaDados;

import CamadaNegocios.ControleComissaoVendedores;
import CamadaNegocios.GeracaoFolhaPagamento;

// Tirar isso?
import CamadaApresentacao.CadastroVeiculo;

public class PagamentoFuncionario {
    private double desconto;
    private double encargo;
    CadastroVeiculo cadVeiculo = new CadastroVeiculo();
    private float valorBruto;

    public PagamentoFuncionario(float valorBruto, double desconto, double encargo) {
        this.valorBruto = cadVeiculo.getvalorveiculo();
        this.desconto = desconto;
        this.encargo = encargo;
    }


    public float getValorBruto() {
        return valorBruto;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getEncargo() {
        return encargo;
    }


}