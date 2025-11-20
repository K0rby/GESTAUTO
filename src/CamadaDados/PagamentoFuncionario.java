package CamadaDados;



import CamadaApresentacao.CadastroVeiculo;

public class PagamentoFuncionario {
    private double desconto;
    private double encargo;
    private double bonus;
    private float valorBruto;

    public PagamentoFuncionario(float valorBruto, double desconto, double encargo, double bonus) {
        this.desconto = desconto;
        this.encargo = encargo;
        this.bonus = bonus;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setEncargo(double encargo) {
        this.encargo = encargo;
    }

    public void setValorBruto(float valorBruto) {
        this.valorBruto = valorBruto;
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