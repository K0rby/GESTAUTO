package CamadaApresentacao;

import CamadaDados.Veiculo;
import CamadaNegocios.Controller.ControllerVeiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroVeiculo {

  private ControllerVeiculo veiculoController;
  private  Veiculo veiculo;


    public CadastroVeiculo() {
        this.veiculoController = new ControllerVeiculo();
    }

    public void cadVeic(){
        this.veiculo = cadastroVeiculo();
        veiculoController.cadastraVeiculo(this.veiculo);
    }

    public Veiculo cadastroVeiculo(){
        Veiculo v1 = new Veiculo();
        Scanner dado = new Scanner(System.in);
        int c = 1;

        while (c == 1) {
            v1 = preencher();

            System.out.println("Deseja cadastrar outro veículo? (1 - Sim / 0 - Não)");
            c = dado.nextInt();

            return v1;
        }
        return v1;
    }

    public Veiculo preencher(){
        Scanner dado = new Scanner(System.in);

        System.out.println("Informe o modelo do veículo:");
        String modelo = dado.nextLine();

        System.out.println("Informe a cor do veículo:");
        String cor = dado.nextLine();

        System.out.println("Informe o valor do veículo:");
        double valor = dado.nextDouble();

        System.out.println("Informe a placa do veículo");
        String placa = dado.next();

        System.out.println("Informe o status do veículo:");
        String status = dado.next();

        return new Veiculo(modelo, cor, valor, placa, status);
    }





    public void imprimirVeiculos(){

        veiculoController.imprimirTodos();
  }


}
