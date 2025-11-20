package CamadaNegocios.Controller;

import CamadaDados.Veiculo;

import java.util.LinkedList;
import java.util.Scanner;

public class ControllerVeiculo {

    private Veiculo veiculo;
    private CamadaNegocios.DAO.VeiculoDAO dao;
    LinkedList<Veiculo> listaVeiculos = new LinkedList<>();

    public ControllerVeiculo (Veiculo veiculo) {
        this.veiculo = veiculo;
        this.dao = new CamadaNegocios.DAO.VeiculoDAO();
    }

    public void cadastraVeiculo() {
        Scanner dado = new Scanner(System.in);
        int c = 1;

        while (c == 1) {

            veiculo = new Veiculo().preencher();

            System.out.println(veiculo);
            dao.insert(veiculo);

            listaVeiculos.add(veiculo);

            System.out.println("Deseja cadastrar outro veículo? (1 - Sim / 0 - Não)");
            c = dado.nextInt();
        }

        imprimirTodos();
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
