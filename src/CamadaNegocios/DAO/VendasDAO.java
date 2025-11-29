package CamadaNegocios.DAO;

import CamadaDados.Vendas;

import java.util.ArrayList;

public class VendasDAO {

    private static final ArrayList<Vendas> listaVendas = new ArrayList<>();
    private static VendasDAO instance;
    private VendasDAO(){}
    public static VendasDAO getInstance(){
         if (instance == null) {
            instance = new VendasDAO();
        }
        return instance;
    }

    public void insert (CamadaDados.Vendas ven) {
        if (ven != null) {
            listaVendas.add(ven);
            System.out.println("Cadastrou a venda.");
        }

    }

    public ArrayList<Vendas> getListaVendas() {
        return listaVendas;
    }

}
