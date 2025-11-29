package CamadaNegocios.DAO;

import CamadaDados.Veiculo;
import CamadaNegocios.DAO.InterfaceDao.InterfaceVeiculoDAO;

import java.util.ArrayList;
import java.util.Optional;

public class VeiculoDAO implements InterfaceVeiculoDAO {

    private static final ArrayList<Veiculo> listaVeiculos = new java.util.ArrayList<>();

    private static VeiculoDAO instance;
    private VeiculoDAO(){}
    public static VeiculoDAO getInstance(){
         if (instance == null) {
            instance = new VeiculoDAO();
        }
        return instance;
    }

    @Override
    public void insert (Veiculo vei) {
        if (vei != null) {
            listaVeiculos.add(vei);
            System.out.println("Cadastrou o veiculo.");
        }
    }

    @Override
    public ArrayList<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    @Override
    public Optional<Veiculo> findByPlaca(String placa) {
        return listaVeiculos.stream()
                .filter(v -> v.getPlaca() != null && v.getPlaca().equals(placa))
                .findFirst();
    }

}
