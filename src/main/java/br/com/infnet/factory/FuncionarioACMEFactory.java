package br.com.infnet.factory;

import br.com.infnet.domain.Cargo;
import br.com.infnet.domain.Funcionario;
import br.com.infnet.domain.Setor;

import java.util.List;

public class FuncionarioACMEFactory extends FuncionarioFactory {
    @Override
    public Funcionario criarFuncionario(String nome, List<String> telefones, String endereco, double salario, Setor setor, Cargo cargo) {
        return new Funcionario(nome, telefones, endereco, salario, setor, cargo);
    }
}
