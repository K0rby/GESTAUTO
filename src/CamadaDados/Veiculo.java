package CamadaDados;
public class Veiculo {
    String modelo;
    String cor;
    int valor;
    String status; 

    public Veiculo(String modelo, String cor, int valor, String status){
        this.modelo = modelo;
        this.cor = cor;
        this.valor = valor;
        this.status = status;
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

    public int getValor() {
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
}