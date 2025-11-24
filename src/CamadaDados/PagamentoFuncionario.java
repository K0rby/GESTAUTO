package CamadaDados;



import CamadaApresentacao.CadastroVeiculo;

public class PagamentoFuncionario {
    private double desconto;
    private double bonus;
    private double valorLiquido;

    public PagamentoFuncionario(double valorLiquido, double desconto, double bonus) {
        this.valorLiquido = valorLiquido;
        this.desconto = desconto;
        this.bonus = bonus;

    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }


    public void setValorBruto(float valorBruto) {
        this.valorLiquido = valorBruto;
    }

    public double getValorLiquido() {
        return valorLiquido;
    }

    public double getDesconto() {
        return desconto;
    }


    @Override
    public String toString() {
        return "PagamentoFuncionario{" +
                "desconto=" + desconto +
                ", bonus=" + bonus +
                ", valorLiquido=" + valorLiquido +
                '}';
    }
}