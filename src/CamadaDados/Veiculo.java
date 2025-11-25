package CamadaDados;


import java.util.Scanner;

public class Veiculo {
    private String modelo;
    private String cor;
    private double valor;
    private String placa;
    private String status;

    public Veiculo(String modelo, String cor, double valor, String placa, String status){
        this.modelo = modelo;
        this.cor = cor;
        this.valor = valor;
        this.placa = placa;
        this.status = status;
    }

    public Veiculo() {
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", valor=" + valor +
                ", placa='" + placa + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}