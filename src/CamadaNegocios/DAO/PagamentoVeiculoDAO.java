package CamadaNegocios.DAO;

import CamadaDados.PagamentoVeiculo;

import java.util.ArrayList;

public class PagamentoVeiculoDAO {

    private static final ArrayList<PagamentoVeiculo> listaPagamentos = new ArrayList<>();

    public void insert (CamadaDados.PagamentoVeiculo pag) {

        if (pag != null) {
            listaPagamentos.add(pag);
            System.out.println("Cadastrou o pagamento do veiculo.");
        }

    }

    public static ArrayList<PagamentoVeiculo> getListaPagamentos() {
        return listaPagamentos;
    }

}
