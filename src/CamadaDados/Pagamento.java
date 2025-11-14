package CamadaDados;

import CamadaApresentacao.CadastroVeiculo;

public class Pagamento {
    private double desconto;
    private double encargo;
    private float valorBruto = new CadastroVeiculo.getvalorveiculo();

    public Pagamento(float valorBruto, double desconto, double encargo) {
        this.valorBruto = valorBruto;
        this.desconto = desconto;
        this.encargo = encargo;
    }



}