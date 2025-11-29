package CamadaNegocios.DAO;

import CamadaDados.PagamentoVeiculo;
import CamadaNegocios.DAO.InterfaceDao.InterfacePagamentoVeiculo;

import java.util.ArrayList;

public class PagamentoVeiculoDAO implements InterfacePagamentoVeiculo {

    private static final ArrayList<PagamentoVeiculo> listaPagamentos = new ArrayList<>();
    private static PagamentoVeiculoDAO instance;
    private PagamentoVeiculoDAO(){}
    public static PagamentoVeiculoDAO getInstance(){
         if (instance == null) {
            instance = new PagamentoVeiculoDAO();
        }
        return instance;
    }

    @Override
    public void insert (PagamentoVeiculo pag) {

        if (pag != null) {
            listaPagamentos.add(pag);
            System.out.println("Cadastrou o pagamento do veiculo.");
        }

    }

    @Override
    public ArrayList<PagamentoVeiculo> getListaPagamentos() {
        return listaPagamentos;
    }

}
