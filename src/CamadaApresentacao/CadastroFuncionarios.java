package CamadaApresentacao;

import CamadaDados.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class CadastroFuncionarios {

    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

}