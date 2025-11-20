package CamadaDados;


import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String cpf;
    private String telefone;
    private String cargo;
    private float salario;

    public Funcionario(String nome, String cpf, String telefone, String cargo, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public Funcionario preencher(){
        Scanner dado = new Scanner(System.in);

        System.out.println("Informe o nome do funcionario:");
        this.nome = dado.nextLine();

        System.out.println("Informe o CPF do funcionario:");
        this.cpf = dado.nextLine();

        System.out.println("Informe o telefone do funcionario:");
        this.telefone = dado.nextLine();

        System.out.println("Informe o cargo do funcionario:");
        this.cargo = dado.nextLine();

        System.out.println("Informe o salario do funcionario:");
        this.salario = dado.nextFloat();
        return new Funcionario(nome, cpf, telefone, cargo, salario);

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}