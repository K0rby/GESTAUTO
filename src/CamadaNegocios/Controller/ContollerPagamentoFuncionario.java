package CamadaNegocios.Controller;

import CamadaApresentacao.CadastroFuncionarios;

public class ContollerPagamentoFuncionario {

    private CamadaDados.Funcionario funcionario;
    private CamadaNegocios.DAO.PagamentoFuncionarioDAO dao;

    public ContollerPagamentoFuncionario (CamadaDados.Funcionario funcionario) {
        this.funcionario = funcionario;
        this.dao = new CamadaNegocios.DAO.PagamentoFuncionarioDAO();
    }


    public double pagamentoFuncionario() {



        double salario = funcionario.getSalario();
        double desconto = salario * 0.1;
        double bonus = salario * 0.05;
        double pagamentoLiquido = (salario + bonus) - desconto;

        return pagamentoLiquido;


    }

}
