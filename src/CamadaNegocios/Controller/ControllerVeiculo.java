package CamadaNegocios.Controller;

import CamadaDados.Veiculo;
import CamadaNegocios.DAO.VeiculoDAO;

import java.util.LinkedList;
import java.util.Scanner;

public class ControllerVeiculo {

    private Veiculo veiculo;
    private CamadaNegocios.DAO.VeiculoDAO dao;
    LinkedList<Veiculo> listaVeiculos = new LinkedList<>();

    public ControllerVeiculo () {
        this.dao = new VeiculoDAO();
    }

    public void cadastraVeiculo(Veiculo veiculo) {

        System.out.println(veiculo);
        dao.insert(veiculo);

        listaVeiculos.add(veiculo);

    }

    public void imprimirTodos() {
        if (listaVeiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }
        System.out.println("Lista de veículos cadastrados:");
        for (CamadaDados.Veiculo v : listaVeiculos) {
            System.out.println(v);
        }
    }

}
