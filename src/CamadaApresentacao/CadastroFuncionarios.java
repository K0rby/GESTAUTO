package CamadaApresentacao;

import CamadaDados.Funcionario;
import CamadaNegocios.Controller.ControllerFuncionario;
import CamadaNegocios.DAO.FuncionarioDAO;

import java.util.ArrayList;
import java.util.List;

public class CadastroFuncionarios {

    private ControllerFuncionario funcinarioController;


//    public CadastroFuncionarios(String nomeFuncionario, String cpfFuncionario, String telefoneFuncionario, float salarioFuncionario, String cargoFuncionario) {
//        this.funcinarioController = new ControllerFuncionario(new Funcionario().preencher());
//    }

    public CadastroFuncionarios() {
        this.funcinarioController = new ControllerFuncionario(new Funcionario());
    }


    public void cadFunc(){
        funcinarioController.cadastraFuncionario();
    }
}