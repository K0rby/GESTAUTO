package CamadaApresentacao;

import CamadaDados.Veiculo;
import CamadaNegocios.Controller.ControllerVeiculo;

import java.util.ArrayList;
import java.util.List;

public class CadastroVeiculo {

  private ControllerVeiculo veiculoController;

//  public CadastroVeiculo(String modeloVeiculo, String corVeiculo, float valorVeiculo, String statusVeiculo) {
//      this.veiculoController = new ControllerVeiculo(new Veiculo(modeloVeiculo, corVeiculo, valorVeiculo, statusVeiculo));
//  }

    public CadastroVeiculo() {
        this.veiculoController = new ControllerVeiculo(new Veiculo());
    }


    public void cadVeic(){
        veiculoController.cadastraVeiculo();
  }

  public void imprimirVeiculos(){
      veiculoController.imprimirTodos();
  }




}
