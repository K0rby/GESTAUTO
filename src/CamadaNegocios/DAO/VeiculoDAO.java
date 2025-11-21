package CamadaNegocios.DAO;

import CamadaDados.Veiculo;

import java.util.ArrayList;
import java.util.Optional;

public class VeiculoDAO {

    private static final ArrayList<Veiculo> listaVeiculos = new java.util.ArrayList<>();

    public void insert (CamadaDados.Veiculo vei) {
        if (vei != null) {
            listaVeiculos.add(vei);
            System.out.println("Cadastrou o veiculo.");
        }
    }


    public ArrayList<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public Optional<Veiculo> findByPlaca(String placa) {
        return listaVeiculos.stream()
                .filter(v -> v.getPlaca() != null && v.getPlaca().equals(placa))
                .findFirst();
    }

}
