package CamadaNegocios.Controller;

import CamadaDados.Cliente;

public class ControllerCliente {

    private Cliente cliente;
    private CamadaNegocios.DAO.ClienteDAO dao;

    public ControllerCliente (Cliente cliente) {
        this.cliente = cliente;
        this.dao = new CamadaNegocios.DAO.ClienteDAO();
    }

    public void cadastraCliente() {
        dao.insert(cliente);
    }

}
