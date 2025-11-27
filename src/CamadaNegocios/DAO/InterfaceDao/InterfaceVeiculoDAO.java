package CamadaNegocios.DAO.InterfaceDao;

import CamadaDados.Veiculo;

import java.util.ArrayList;
import java.util.Optional;

public interface InterfaceVeiculoDAO {
    void insert(Veiculo veiculo);
    ArrayList<Veiculo> getListaVeiculos();
    Optional<Veiculo> findByPlaca(String placa);

}
