package CamadaNegocios.DAO;

import CamadaDados.Vendas;

import java.util.ArrayList;

public class VendasDAO {

    private static final ArrayList<Vendas> listaVendas = new ArrayList<Vendas>();

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
