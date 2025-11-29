package CamadaNegocios.DAO;

import CamadaDados.PagamentoFuncionario;
import CamadaNegocios.DAO.InterfaceDao.InterfacePagamentoFuncionario;

import java.util.ArrayList;

public class PagamentoFuncionarioDAO implements InterfacePagamentoFuncionario {

    private static PagamentoFuncionarioDAO instance;
    private PagamentoFuncionarioDAO(){}
    public static PagamentoFuncionarioDAO getInstance(){
         if (instance == null) {
            instance = new PagamentoFuncionarioDAO();
        }
        return instance;
    }
    private static final ArrayList<PagamentoFuncionario> listaPagamentos = new ArrayList<>();

    @Override
    public void insert (PagamentoFuncionario pag) {
        if (pag != null) {
            listaPagamentos.add(pag);
            System.out.println("Cadastrou o pagamento do funcionario.");
        }
    }

    @Override
    public ArrayList<PagamentoFuncionario> getListaPagamentos() {
        return listaPagamentos;
    }

}
