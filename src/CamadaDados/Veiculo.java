package CamadaDados;


import java.util.Scanner;

public class Veiculo {
    private String modelo;
    private String cor;
    private float valor;
    private String status;

    public Veiculo(String modelo, String cor, float valor, String status){
        this.modelo = modelo;
        this.cor = cor;
        this.valor = valor;
        this.status = status;
    }

    public Veiculo() {
    }

    public Veiculo preencher(){
        Scanner dado = new Scanner(System.in);

        System.out.println("Informe o modelo do veículo:");
        this.modelo = dado.nextLine();

        System.out.println("Informe a cor do veículo:");
        this.cor = dado.nextLine();

        System.out.println("Informe o valor do veículo:");
        this.valor = dado.nextFloat();

        System.out.println("Informe o status do veículo:");
        this.status = dado.next();

        return new Veiculo(modelo, cor, valor, status);
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

    public float getValor() {
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

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", valor=" + valor +
                ", status='" + status + '\'' +
                '}';
    }
}