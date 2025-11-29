package CamadaApresentacao;

import CamadaDados.Funcionario;
import CamadaNegocios.Controller.ControllerFuncionario;
import java.util.Scanner;

public class CadastroFuncionarios {

    private ControllerFuncionario funcinarioController;
    private Funcionario funcionario;




    public CadastroFuncionarios() {
        this.funcinarioController = new ControllerFuncionario();

    }


    public void cadFunc(){
        this.funcionario = cadastrarFuncionario();
        funcinarioController.cadastraFuncionario(this.funcionario);
    }

    public void imprimirFuncionarios(){
        funcinarioController.imprimirTodos();
    }

    public Funcionario cadastrarFuncionario() {
        Funcionario f1 = new Funcionario();
        Scanner dado = new Scanner(System.in);
        int c = 1;

        while(c == 1){

            f1 = preencher();

            System.out.println("Deseja cadastrar outro funcionario? (1 - Sim / 0 - Não)");
            c = dado.nextInt();

            return f1;
        }

        return f1;
    }

    public Funcionario preencher(){
        Scanner dado = new Scanner(System.in);

        System.out.println("Informe o nome do funcionario:");
        String nome = dado.nextLine();

        System.out.println("Informe o CPF do funcionario:");
        String cpf = dado.nextLine();

        System.out.println("Informe o telefone do funcionario:");
        String telefone = dado.nextLine();

        System.out.println("Informe o cargo do funcionario:");
        String cargo = dado.nextLine();

        System.out.println("Informe o salario do funcionario:");
        Double salario = dado.nextDouble();

        return new Funcionario(nome, cpf, telefone, cargo, salario);

    }



}