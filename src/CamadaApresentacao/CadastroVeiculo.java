package CamadaApresentacao;

import CamadaDados.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class CadastroVeiculo {

    private List<Veiculo> veiculos = new ArrayList<Veiculo>();


    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    public float getvalorveiculo(){
        return veiculos.get(0).getValor();
    }




}
