package CamadaDados;



import java.time.LocalDate;

public class Vendas {
    private String id;
    private String cliente;
    private String veiculo;
    private double valor;
    private LocalDate data;

    public Vendas(String id, String cliente, String veiculo, double valor, LocalDate data) {
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valor = valor;
        this.data = data;
    }

    public String getId() { return id; }
    public String getCliente() { return cliente; }
    public String getVeiculo() { return veiculo; }
    public double getValor() { return valor; }
    public LocalDate getData() { return data; }
}
