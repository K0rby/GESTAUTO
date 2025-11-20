package CamadaNegocios.Controller;

import CamadaDados.Veiculo;

public class ControllerVeiculo {

    private Veiculo veiculo;
    private CamadaNegocios.DAO.VeiculoDAO dao;

    public ControllerVeiculo (Veiculo veiculo) {
        this.veiculo = veiculo;
        this.dao = new CamadaNegocios.DAO.VeiculoDAO();
    }

    public void cadastraVeiculo() {
        dao.insert(veiculo);
    }

}
