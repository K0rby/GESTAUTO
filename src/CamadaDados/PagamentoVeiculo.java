package CamadaDados;


public class PagamentoVeiculo {

    private double desconto;
    private double valorFinal;
    private double impostos;

    public PagamentoVeiculo(double valorFinal, double desconto, double impostos) {
        this.valorFinal = valorFinal;
        this.desconto = desconto;
        this.impostos = impostos;

    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    @Override
    public String toString() {
        return "PagamentoVeiculo{" +
                "desconto=" + desconto +
                ", valorFinal=" + valorFinal +
                ", impostos=" + impostos +
                '}';
    }
}
