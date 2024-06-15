package br.com.infnet.factory;

import br.com.infnet.domain.Cargo;
import br.com.infnet.domain.Funcionario;
import br.com.infnet.domain.Setor;

import java.util.List;

public abstract class FuncionarioFactory {
    public abstract Funcionario criarFuncionario(String nome, List<String> telefones, String endereco, double salario, Setor setor, Cargo cargo);
}
