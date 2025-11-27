package CamadaNegocios.DAO.InterfaceDao;

import CamadaDados.PagamentoFuncionario;
import CamadaDados.PagamentoVeiculo;

import java.util.ArrayList;

public interface InterfacePagamentoFuncionario {

   void insert(PagamentoFuncionario pagamentoFuncionario);
   ArrayList<PagamentoFuncionario> getListaPagamentos();

}
