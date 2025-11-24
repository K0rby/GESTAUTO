package CamadaNegocios.DAO;

import CamadaDados.PagamentoFuncionario;

import java.util.ArrayList;

public class PagamentoFuncionarioDAO {

    private static final ArrayList<PagamentoFuncionario> listaPagamentos = new ArrayList<>();

    public void insert (CamadaDados.PagamentoFuncionario pag) {
        if (pag != null) {
            listaPagamentos.add(pag);
            System.out.println("Cadastrou o pagamento do funcionario.");
        }
    }

    public static ArrayList<PagamentoFuncionario> getListaPagamentos() {
        return listaPagamentos;
    }

}
