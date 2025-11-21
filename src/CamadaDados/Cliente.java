package CamadaDados;


import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;

    private static final int ID_MIN = 1;
    private static final int ID_MAX = 100;

    private int gerarId() {
        return ThreadLocalRandom.current().nextInt(ID_MIN, ID_MAX + 1);
    }


    public Cliente(String nome, String cpf, String telefone){
        this.id = gerarId();
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Cliente() {
    }

    public Cliente preencher(){
        Scanner dado = new java.util.Scanner(System.in);

        System.out.println("Informe o nome do cliente:");
        this.nome = dado.nextLine();


        System.out.println("Informe o CPF do cliente:");
        this.cpf = dado.nextLine();


        System.out.println("Informe o telefone do cliente:");
        this.telefone = dado.nextLine();


        return new Cliente(nome, cpf, telefone);
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}