package CamadaDados;


public class Vendas {

    private final String cliente;
    private final String veiculo;
    private String funcionario;
    private final double valor;


    public Vendas(String cliente, String veiculo, String funcionario, double valor) {

        this.cliente = cliente;
        this.veiculo = veiculo;
        this.funcionario = funcionario;
        this.valor = valor;

    }


    public String getCliente() { return cliente; }
    public String getVeiculo() { return veiculo; }
    public double getValor() { return valor; }


    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Vendas{" +
                "cliente='" + cliente + '\'' +
                ", veiculo='" + veiculo + '\'' +
                ", funcionario='" + funcionario + '\'' +
                ", valor=" + valor +
                '}';
    }
}
