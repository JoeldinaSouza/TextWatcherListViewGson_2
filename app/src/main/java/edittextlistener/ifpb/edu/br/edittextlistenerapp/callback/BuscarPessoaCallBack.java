package edittextlistener.ifpb.edu.br.edittextlistenerapp.callback;

import java.util.List;

import edittextlistener.ifpb.edu.br.edittextlistenerapp.entidade.Pessoa;

/**
 * Created by Joeldina on 13/03/2016.
 */
public interface BuscarPessoaCallBack {

    void backBuscarNome(List<Pessoa> names);

    void errorBuscarNome(String error);
}