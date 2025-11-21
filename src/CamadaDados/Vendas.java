package CamadaDados;


public class Vendas {
//    private String id;
    private String cliente;
    private String veiculo;
    private String funcionario;
    private double valor;
//    private LocalDate data;

    public Vendas(String cliente, String veiculo, String funcionario, double valor) {

        this.cliente = cliente;
        this.veiculo = veiculo;
        this.funcionario = funcionario;
        this.valor = valor;
//        this.data = data;
    }

//    public String getId() { return id; }
    public String getCliente() { return cliente; }
    public String getVeiculo() { return veiculo; }
    public double getValor() { return valor; }
//    public LocalDate getData() { return data; }

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
