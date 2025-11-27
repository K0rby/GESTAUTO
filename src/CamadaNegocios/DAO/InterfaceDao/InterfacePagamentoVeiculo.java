package CamadaNegocios.DAO.InterfaceDao;

import CamadaDados.PagamentoVeiculo;

import java.util.ArrayList;

public interface InterfacePagamentoVeiculo {
    void insert(PagamentoVeiculo pagamentoVeiculo);
    ArrayList<PagamentoVeiculo> getListaPagamentos();
}
