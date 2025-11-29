package CamadaNegocios.DAO.InterfaceDao;

import CamadaDados.PagamentoFuncionario;

import java.util.ArrayList;

public interface InterfacePagamentoFuncionario {

   void insert(PagamentoFuncionario pagamentoFuncionario);
   ArrayList<PagamentoFuncionario> getListaPagamentos();

}
