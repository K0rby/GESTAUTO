package CamadaDados;

import CamadaApresentacao.CadastroVeiculo;

public class Pagamento {
    private double desconto;
    private double encargo;
    CadastroVeiculo cadVeiculo = new CadastroVeiculo();
    private float valorBruto;

    public Pagamento(float valorBruto, double desconto, double encargo) {
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